package br.edu.ifsp.scl.ads.pdm.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifsp.scl.ads.pdm.dados.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBiding: ActivityMainBinding
    private lateinit var geradorRandomico: Random
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBiding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBiding.root)

        geradorRandomico = Random(System.currentTimeMillis())

        activityMainBiding.jogarDadoBt.setOnClickListener{
            val resultado: Int = geradorRandomico.nextInt()
            "A face sorteada foi $resultado".also { activityMainBiding.resultadoTv.text = it }
        }
    }
}

