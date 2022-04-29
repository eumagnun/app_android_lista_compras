package br.com.danielamaral.listacompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import br.com.danielamaral.listacompras.model.Produto

class VisualizarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualizar)

        val tvNome:TextView = findViewById(R.id.tvNome)
        val tvMarca:TextView = findViewById(R.id.tvMarca)
        val tvPreco:TextView = findViewById(R.id.tvPreco)

        val produtoSelecionado = intent.getSerializableExtra("produtoSelecionado") as Produto

        tvNome.text = produtoSelecionado.nome
        tvMarca.text = produtoSelecionado.marca
        tvPreco.text = produtoSelecionado.preco.toString()
    }
}