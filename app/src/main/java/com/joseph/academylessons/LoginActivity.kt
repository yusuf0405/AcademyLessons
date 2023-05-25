package com.joseph.academylessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.joseph.academylessons.databinding.ActivityLognBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLognBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.enterButton.setOnClickListener {
            val loginText = binding.loginEditText.text.toString()
            val passwordText = binding.passwordEditText.text.toString()

            when {
                loginText.isEmpty() -> {
                    showToast("Заполните поле ввода для логина")
                }

                !loginText.contains("@gmail.com") -> {
                    showToast("Неправельный ввод логина")
                }

                passwordText.isEmpty() -> {
                    showToast("Заполните поле ввода для пароля")
                }

                passwordText.length <= 8 -> {
                    showToast("Пароль должен содержать не менее 8 символов")
                }

                else -> {
                    navigateToMusicListActivity()
                }

            }
        }
    }

    private fun navigateToMusicListActivity() {
        val intent = Intent(this, MusicListActivity::class.java)
        intent.addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        )
        startActivity(intent)
    }

    private fun showToast(message: String) {
        Toast.makeText(
            this,
            message,
            Toast.LENGTH_SHORT
        ).show()
    }
}