package br.com.danielamaral.listacompras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import java.io.Serializable

open class BaseActivity: AppCompatActivity() {

    fun navegar(parametro:Serializable?=null, classe:Class<*>){
        val intent = Intent(this,classe)
        if(parametro != null){
            intent.putExtra("param",parametro)
        }
        startActivity(intent)
    }
}