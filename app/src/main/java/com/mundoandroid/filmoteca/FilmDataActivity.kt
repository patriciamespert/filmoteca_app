package es.ua.eps.filmoteca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ua.eps.filmoteca.databinding.ActivityAboutBinding
import es.ua.eps.filmoteca.databinding.ActivityFilmDataBinding

class FilmDataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFilmDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnWatchMovie.setOnClickListener{startActivity(Intent(this@FilmDataActivity,this::class.java))}
        binding.btnEditMovie.setOnClickListener{startActivity(Intent(this@FilmDataActivity,FilmEditActivity::class.java))}
        binding.goBackMain.setOnClickListener{startActivity(Intent(this@FilmDataActivity,FilmListActivity::class.java))}
    }
}