package com.salcisne.androidteste.service;

import androidx.lifecycle.MutableLiveData;

import com.salcisne.androidteste.model.FilialProduto;

import java.util.List;

public interface IProdutoService {
    MutableLiveData<List<FilialProduto>> getListaProdutos();
}
