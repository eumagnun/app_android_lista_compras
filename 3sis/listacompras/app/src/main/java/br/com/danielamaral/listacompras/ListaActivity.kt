package br.com.danielamaral.listacompras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.danielamaral.listacompras.adapter.ItemAdapter
import br.com.danielamaral.listacompras.model.Produto
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : BaseActivity(),ItemAdapter.OnProdutoClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val rvListaCompras:RecyclerView  = findViewById(R.id.rvListaCompras)
        rvListaCompras.layoutManager = LinearLayoutManager(this)

        rvListaCompras.adapter = ItemAdapter(Database.listaCompras,this)

        val fabCadastrarProduto:FloatingActionButton = findViewById(R.id.fabCadastraProduto)
        fabCadastrarProduto.setOnClickListener {
            navegar(classe = CadastroActivity::class.java)
        }
    }

    override fun onProdutoClick(produtoPosition: Int) {
         navegar(Database.listaCompras[produtoPosition],VisualizarActivity::class.java)
    }
}