package es.ua.eps.filmoteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ua.eps.filmoteca.databinding.ActivityAboutBinding
import es.ua.eps.filmoteca.databinding.ActivityFilmEditBinding
import es.ua.eps.filmoteca.databinding.ActivityFilmListBinding

class FilmListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFilmListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMovieA.setOnClickListener{startActivity(Intent(this@FilmListActivity,FilmDataActivity::class.java))}
        binding.btnMovieB.setOnClickListener{startActivity(Intent(this@FilmListActivity,FilmDataActivity::class.java))}
        binding.btnAbout.setOnClickListener{startActivity(Intent(this@FilmListActivity,AboutActivity::class.java))}
    }
}