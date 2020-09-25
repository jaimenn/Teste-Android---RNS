package com.salcisne.androidteste.model;

public class FilialProduto {

    private Long id;

    private Long qtdTotal;

    private Produto produto;

    private Filial filial;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getQtdTotal() {
        return qtdTotal;
    }
    public void setQtdTotal(Long qtdTotal) {
        this.qtdTotal = qtdTotal;
    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Filial getFilial() {
        return filial;
    }
    public void setFilial(Filial filial) {
        this.filial = filial;
    }

}
