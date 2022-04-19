package br.com.danielamaral.listacompras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import br.com.danielamaral.listacompras.databinding.ActivityCadastroBinding
import br.com.danielamaral.listacompras.model.Produto

class CadastroActivity : BaseActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_cadastro)

        binding.btAdicionar.setOnClickListener {
            cadastraItem(
                binding.etNomeProduto.text.toString(),
                binding.etMarcaProduto.text.toString(),
                binding.etPrecoProduto.text.toString()
            )

            binding.etNomeProduto.text.clear()
            binding.etMarcaProduto.text.clear()
            binding.etPrecoProduto.text.clear()

            navegar(classe = ListaActivity::class.java)
        }

    }


    fun cadastraItem(nome: String, marca: String, preco: String) {
        Database.listaCompras.add(Produto(nome = nome, marca = marca, preco = preco.toDouble()))
    }
}