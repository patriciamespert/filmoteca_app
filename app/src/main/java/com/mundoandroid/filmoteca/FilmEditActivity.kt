package es.ua.eps.filmoteca

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ua.eps.filmoteca.databinding.ActivityAboutBinding
import es.ua.eps.filmoteca.databinding.ActivityFilmDataBinding
import es.ua.eps.filmoteca.databinding.ActivityFilmEditBinding

class FilmEditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFilmEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilmEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaveMovie.setOnClickListener{setResult(Activity.RESULT_OK); finish()}
        binding.btnCancel.setOnClickListener{setResult(Activity.RESULT_CANCELED); finish()}
    }
}