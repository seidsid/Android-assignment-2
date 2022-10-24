package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    var foods = arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese");
    var button: Button? = null;
    var textView: TextView? = null;
    var addFoodButton: Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button);
        textView = findViewById<TextView>(R.id.textView);
        addFoodButton = findViewById<Button>(R.id.button2);

        button?.setOnClickListener {
            textView?.text = getFoodRandom();
        }

        addFoodButton?.setOnClickListener {
            foods.add(textView?.text.toString());
        }
    }
    fun getFoodRandom(): String {
        var random = Random(System.currentTimeMillis());
        return foods[random.nextInt()%foods.size];
    }
}