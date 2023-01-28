package com.flangopink.flangodatasavesr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var mail: EditText
    lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mail=findViewById(R.id.tb_email)
        pass=findViewById(R.id.tb_password)
    }
    fun nextScreen(view: View) {
        if (mail.text.toString().isNotEmpty() && pass.text.toString().isNotEmpty())
        {
            val intent = Intent(this@LoginActivity, NumActivity::class.java)
            startActivity(intent)
            finish()
        }
        else Toast.makeText(this, "Заполните текстовые поля", Toast.LENGTH_SHORT).show()
    }
}