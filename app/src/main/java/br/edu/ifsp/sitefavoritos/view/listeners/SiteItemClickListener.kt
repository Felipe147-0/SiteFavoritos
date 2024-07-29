package br.edu.ifsp.sitefavoritos.view.listeners

interface SiteItemClickListener {
    fun clickHeartSiteItem(position: Int)
    fun clickSiteItem(position: Int)
    fun clickDeleteSiteItem(position: Int)
}