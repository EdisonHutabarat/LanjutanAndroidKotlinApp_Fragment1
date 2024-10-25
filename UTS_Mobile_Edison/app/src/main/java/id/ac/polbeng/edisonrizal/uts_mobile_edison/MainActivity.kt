package id.ac.polbeng.edisonrizal.uts_mobile

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.edisonrizal.uts_mobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mengatur tombol untuk menghitung volume
        binding.btnVolume.setOnClickListener {
            calculateVolume()
        }

        // Mengatur tombol untuk menghitung luas permukaan
        binding.btnLuas.setOnClickListener {
            calculateSurfaceArea()
        }
    }

    // Fungsi untuk menghitung volume kubus
    private fun calculateVolume() {
        val sisi = binding.noSisi.text.toString().toDoubleOrNull()

        if (sisi != null) {
            val volume = sisi * sisi * sisi
            // Menggunakan string resource untuk hasil volume
            binding.hasilText.text = getString(R.string.hasil_volume) + volume
        } else {
            Toast.makeText(this, getString(R.string.error_input), Toast.LENGTH_SHORT).show()
        }
    }

    // Fungsi untuk menghitung luas permukaan kubus
    private fun calculateSurfaceArea() {
        val sisi = binding.noSisi.text.toString().toDoubleOrNull()

        if (sisi != null) {
            val surfaceArea = 6 * sisi * sisi
            // Menggunakan string resource untuk hasil luas
            binding.hasilText.text = getString(R.string.hasil_luas) + surfaceArea
        } else {
            Toast.makeText(this, getString(R.string.error_input), Toast.LENGTH_SHORT).show()
        }
    }
}
