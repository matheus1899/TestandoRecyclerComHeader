package com.tenorinho.testandorecyclercomheader.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tenorinho.testandorecyclercomheader.R
import com.tenorinho.testandorecyclercomheader.model.Time
import com.tenorinho.testandorecyclercomheader.model.Titulo

class TimeAdapter(private var time: Time) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TIPO_HEADER = 0
    private val TIPO_ITEM = 1

    private var listaTitulos: List<Titulo> = time.UltimosTitulos

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == TIPO_ITEM){
            val item: View = LayoutInflater.from(parent.context).inflate(R.layout.time_item, parent, false)
            return ItemHolder(
                item
            )
        }
        else{
            val header: View = LayoutInflater.from(parent.context).inflate(R.layout.time_header, parent, false)
            return HeaderHolder(
                header
            )
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if(position == 0){
            TIPO_HEADER
        }
        else{
            TIPO_ITEM
        }
    }
    override fun getItemCount(): Int {
        return listaTitulos.size.plus(1)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is ItemHolder){
            val h: ItemHolder = holder as ItemHolder
            // ATENÇÃO (position - numero de Headers)
            h.txtCompeticao.text = listaTitulos[position-1].Competicao
            h.txtAno.text = listaTitulos[position-1].Ano
        }
        else if(holder is HeaderHolder){
            val h: HeaderHolder = holder as HeaderHolder
            with(time){
                h.imgTime.setImageResource(IdImg)
                h.imgMundial.setImageResource(MundiaisIcon)
                h.imgNacional.setImageResource(NacionalIcon)
                h.imgContinental.setImageResource(ContinenteIcon)

                h.txtNomeTime.text = Nome
                h.txtAnoFundacao.text = AnoFundacao
                h.txtMundialCount.text = Mundiais.toString()
                h.txtNacionalCount.text = Nacionais.toString()
                h.txtContinentalCount.text = Continentais.toString()
            }
        }
    }

    class ItemHolder : RecyclerView.ViewHolder{
        val txtAno:TextView
        val txtCompeticao:TextView
        constructor(view:View):super(view){
            txtAno = view.findViewById(R.id.item_txt_ano)
            txtCompeticao = view.findViewById(R.id.item_txt_competicao)
        }
    }
    class HeaderHolder : RecyclerView.ViewHolder{
        val imgTime:ImageView
        val imgMundial:ImageView
        val imgContinental:ImageView
        val imgNacional:ImageView

        val txtNomeTime:TextView
        val txtAnoFundacao:TextView
        val txtMundialCount:TextView
        val txtContinentalCount:TextView
        val txtNacionalCount:TextView
        constructor(view:View):super(view){
            imgTime = view.findViewById(R.id.header_img_time)
            imgMundial = view.findViewById(R.id.header_img_mundial)
            imgContinental = view.findViewById(R.id.header_img_continental)
            imgNacional = view.findViewById(R.id.header_img_nacional)

            txtNomeTime = view.findViewById(R.id.header_txt_nome)
            txtAnoFundacao = view.findViewById(R.id.header_txt_ano_fundacao)
            txtMundialCount = view.findViewById(R.id.header_txt_count_mundial)
            txtContinentalCount = view.findViewById(R.id.header_txt_count_continental)
            txtNacionalCount = view.findViewById(R.id.header_txt_count_nacional)
        }
    }
}