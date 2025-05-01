package com.budgetbuddy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * DashboardActivity
 *
 * This activity acts as the home screen for logged-in users. It provides access
 * to key app features: adding expenses, viewing reports, filtering expenses,
 * managing categories, and setting budget goals.
 *
 * Author: Muhammad Shaikh
 * Adapted with assistance from ChatGPT (OpenAI, 2025) for layout navigation and
 * intent handling patterns. Core concepts aligned with official Android documentation.
 * Reference: https://developer.android.com/guide/components/activities/intro-activities
 */
class DashboardActivity : AppCompatActivity() {

    // UI components for navigation
    private lateinit var welcomeText: TextView
    private lateinit var addExpenseButton: Button
    private lateinit var viewExpensesButton: Button
    private lateinit var viewReportsButton: Button
    private lateinit var settingsButton: Button
    private lateinit var budgetGoalsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Bind UI elements to variables
        welcomeText = findViewById(R.id.welcomeText)
        addExpenseButton = findViewById(R.id.addExpenseButton)
        viewExpensesButton = findViewById(R.id.viewExpensesButton)
        viewReportsButton = findViewById(R.id.viewReportsButton)
        settingsButton = findViewById(R.id.settingsButton)
        budgetGoalsButton = findViewById(R.id.budgetGoalsButton)

        // Display logged-in username passed from LoginActivity
        val username = intent.getStringExtra("username")
        welcomeText.text = "Welcome, $username!"

        // Navigate to AddExpenseActivity
        addExpenseButton.setOnClickListener {
            val intent = Intent(this@DashboardActivity, AddExpenseActivity::class.java)
            startActivity(intent)
        }

        // Navigate to ViewExpensesActivity (shows all expenses + filter)
        viewExpensesButton.setOnClickListener {
            val intent = Intent(this@DashboardActivity, ViewExpensesActivity::class.java)
            startActivity(intent)
        }

        // Navigate to ReportsActivity (category summaries)
        viewReportsButton.setOnClickListener {
            val intent = Intent(this@DashboardActivity, ReportsActivity::class.java)
            startActivity(intent)
        }

        // Open category management screen
        settingsButton.setOnClickListener {
            val intent = Intent(this@DashboardActivity, CategoryActivity::class.java)
            startActivity(intent)
        }

        // Open Budget Goals settings screen
        budgetGoalsButton.setOnClickListener {
            val intent = Intent(this@DashboardActivity, BudgetSettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
