package br.uol.ps.example.checkBirthDate.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import br.uol.ps.cards.R
import br.uol.ps.example.checkBirthDate.contracts.CheckBirthDateContract
import br.uol.ps.example.checkBirthDate.presenter.CheckBirthDatePresenter

class CheckBirthDateActivity : AppCompatActivity(), CheckBirthDateContract.View {
    private val tvResp: TextView = findViewById(R.id.tvResp)
    private val birthDate: EditText = findViewById(R.id.birthDate)
    private val btnVerify: Button = findViewById(R.id.btnVerify)
    private lateinit var presenter: CheckBirthDateContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_birth_date)
        presenter = CheckBirthDatePresenter(this)

        btnVerify.setOnClickListener {
            presenter.verifyBirthDate(birthDate.text.toString())
        }
    }

    override fun showResultBirthDate(result: String) {
        tvResp.text = result
    }

    override fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}