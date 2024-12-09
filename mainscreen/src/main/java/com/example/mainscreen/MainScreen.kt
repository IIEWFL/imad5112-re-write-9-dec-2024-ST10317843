package com.example.mainscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailedViewActivity {

}

class MainScreen : AppCompatActivity() {


    // Arrays to hold spending data
    private val days =
        arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private val morningExpenses = arrayOf(50, 80, 40, 100, 60, 70, 90)
    private val afternoonExpenses = arrayOf(19, 45, 20, 22, 19, 25, 17)
    private val eveningExpenses = arrayOf(10, 12, 8, 15, 14, 16, 13)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        // Display total daily expenses for each day
        val totalExpenses = ArrayList<String>()
        for (i in days.indices) {
            val total = morningExpenses[i] + afternoonExpenses[i] + eveningExpenses[i]
            totalExpenses.add("${days[i]}: $total")
        }

        // Example: Display total expenses for each day
        val expensesTextView = findViewById<TextView>(R.id.totalExpensesTextView)
        expensesTextView.text = totalExpenses.joinToString("\n")

        val viewDetailsButton = findViewById<Button>(R.id.viewDetailsButton)
        viewDetailsButton.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            startActivity(intent)

        }

    }
}