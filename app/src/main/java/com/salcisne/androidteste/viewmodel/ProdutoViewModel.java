package com.salcisne.androidteste.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.salcisne.androidteste.model.Filial;
import com.salcisne.androidteste.model.FilialProduto;
import com.salcisne.androidteste.model.Produto;
import com.salcisne.androidteste.service.IProdutoService;
import com.salcisne.androidteste.service.ProdutoService;

import java.util.List;

public class ProdutoViewModel extends ViewModel {

    private IProdutoService service = new ProdutoService();
    private MutableLiveData<List<FilialProduto>> listaProdutos = service.getListaProdutos();

    public MutableLiveData<List<FilialProduto>> getListaProdutos() {
        return listaProdutos;
    }
}
