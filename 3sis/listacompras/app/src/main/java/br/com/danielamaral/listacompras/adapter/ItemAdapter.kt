package br.com.danielamaral.listacompras.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.danielamaral.listacompras.R
import br.com.danielamaral.listacompras.model.Produto

class ItemAdapter(val dados:List<Produto>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class  ItemViewHolder(view: View):RecyclerView.ViewHolder(view){
        val tvItemNome:TextView = view.findViewById(R.id.tvItemNome)
        val tvItemMarca:TextView = view.findViewById(R.id.tvItemMarca)
        val tvItemPreco:TextView = view.findViewById(R.id.tvItemPreco)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lista,parent,false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val produto = dados[position]
        holder.tvItemMarca.text = produto.marca
        holder.tvItemNome.text = produto.nome
        holder.tvItemPreco.text=produto.preco.toString()
    }

    override fun getItemCount(): Int {
        return dados.size
    }
}