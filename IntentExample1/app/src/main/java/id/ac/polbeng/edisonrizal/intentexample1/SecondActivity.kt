package id.ac.polbeng.edisonrizal.intentexample1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import id.ac.polbeng.edisonrizal.intentexample1.databinding.ActivitySecondBinding
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {

    private val Log = Logger.getLogger(SecondActivity::class.java.name)
    private lateinit var binding:ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.info("onCreate")

        binding.btnExitActivity.setOnClickListener{
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }
}