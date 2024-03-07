package com.levojuk.landmarkkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.levojuk.landmarkkotlin.databinding.ActivityDetailsBinding

class Details : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val intent = intent
        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        binding.nameText.text= selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
        /*val selectedLandmark = MySingleton.chosenLandmark
        selectedLandmark?.let {
            binding.nameText.text= it!!.name
            binding.countryText.text = it!!.country
            binding.imageView.setImageResource(it!!.image)
        }
*/
    }
}