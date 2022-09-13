package es.ua.eps.filmoteca

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import es.ua.eps.filmoteca.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnSupport: Button = binding.btnSupport as Button
        val btnWebsite: Button = binding.btnWebsite as Button
        val btnBack: Button = binding.btnBack as Button
        
        btnSupport.setOnClickListener{toast("Funcionalidad sin implementar", Toast.LENGTH_LONG)}
        btnWebsite.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mundoandroid.io/"))) }
        btnBack.setOnClickListener { startActivity(Intent(this@AboutActivity, FilmListActivity::class.java)) }

    }
}