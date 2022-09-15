package es.ua.eps.filmoteca

import android.content.Intent
import android.net.Uri
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

        binding.btnWatchIMDB.setOnClickListener{startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imdb.com/search/title/?title=Back+to+the+Future&release_date=,1985-12-31&genres=sci-fi")))}
        binding.btnEditMovie.setOnClickListener{startActivity(Intent(this@FilmDataActivity,FilmEditActivity::class.java))}
        binding.goBackMain.setOnClickListener{startActivity(Intent(this@FilmDataActivity,FilmListActivity::class.java))}
    }
}