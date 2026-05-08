package com.nasim.player

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AddAccountActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_account)
        
        val btnAddAccount = findViewById<Button>(R.id.btn_add_account)
        val btnUserList = findViewById<Button>(R.id.btn_user_list)
        
        btnAddAccount.setOnClickListener {
            Toast.makeText(this, "✅ تم إضافة الحساب", Toast.LENGTH_SHORT).show()
        }
        
        btnUserList.setOnClickListener {
            Toast.makeText(this, "📋 قائمة المستخدمين", Toast.LENGTH_SHORT).show()
        }
    }
}