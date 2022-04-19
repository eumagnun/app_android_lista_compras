package br.com.danielamaral.listacompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import br.com.danielamaral.listacompras.databinding.ActivityVisualizarBinding
import br.com.danielamaral.listacompras.model.Produto

class VisualizarActivity : AppCompatActivity() {

    private lateinit var produtoSelecionado: Produto
    private lateinit var binding: ActivityVisualizarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
           binding = DataBindingUtil.setContentView(this,R.layout.activity_visualizar)

        produtoSelecionado = intent.getSerializableExtra("param") as Produto

        binding.tvNome.text = produtoSelecionado.nome
        binding.tvMarca.text = produtoSelecionado.marca
        binding.tvPreco.text = produtoSelecionado.preco.toString()

    }
}