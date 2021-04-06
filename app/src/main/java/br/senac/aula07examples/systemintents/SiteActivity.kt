package br.senac.aula07examples.systemintents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula07examples.databinding.ActivitySiteBinding

class SiteActivity : AppCompatActivity() {
    lateinit var binding: ActivitySiteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySiteBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}