package com.example.quiz
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val a = intent
        var q = a.getStringExtra(extra)

        textView2.setText(q.toString())

        button2.setOnClickListener {
            val x = Intent(this,MainActivity::class.java)
            startActivity(x)
        }
    }
}