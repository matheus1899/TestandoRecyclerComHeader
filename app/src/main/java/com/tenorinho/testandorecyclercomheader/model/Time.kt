package com.tenorinho.testandorecyclercomheader.model

import com.tenorinho.testandorecyclercomheader.R

fun getTime(): Time {
    val arrayTitulos = ArrayList<Titulo>()
    arrayTitulos.add(
        Titulo(
            "Copa Sul-Americana",
            "2012"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Campeonato Brasileiro",
            "2008"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Campeonato Brasileiro",
            "2007"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Campeonato Brasileiro",
            "2006"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Mundial de Clubes",
            "2005"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Copa Libertadores da América",
            "2005"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Campeonato Paulista",
            "2005"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Mundial de Clubes",
            "1993"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Copa Libertadores da América",
            "1993"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Mundial de Clubes",
            "1992"
        )
    )
    arrayTitulos.add(
        Titulo(
            "Copa Libertadores da América",
            "1992"
        )
    )

    return Time(
        "SÃO PAULO F.C.",
        "1930",
        R.drawable.ic_sao_paulo,
        arrayTitulos,
        3, R.drawable.ic_continental,
        6, R.drawable.ic_national,
        3, R.drawable.ic_world
    )
}
data class Time(
    var Nome:String,
    var AnoFundacao:String,
    var IdImg:Int,
    var UltimosTitulos:List<Titulo>,
    var Continentais:Int,
    var ContinenteIcon:Int,
    var Nacionais:Int,
    var NacionalIcon:Int,
    var Mundiais:Int,
    var MundiaisIcon: Int
)
data class Titulo(
    var Competicao:String,
    var Ano:String
)