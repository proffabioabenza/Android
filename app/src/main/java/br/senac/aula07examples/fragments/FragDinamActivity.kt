package br.senac.aula07examples.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula07examples.databinding.ActivityFragDinamBinding

class FragDinamActivity : AppCompatActivity() {
    lateinit var binding: ActivityFragDinamBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragDinamBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}