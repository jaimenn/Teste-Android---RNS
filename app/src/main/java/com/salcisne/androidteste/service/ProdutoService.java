package com.salcisne.androidteste.service;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.salcisne.androidteste.model.FilialProduto;
import com.salcisne.androidteste.service.api.ApiModule;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProdutoService implements IProdutoService {
    @Override
    public MutableLiveData<List<FilialProduto>> getListaProdutos() {
        final MutableLiveData<List<FilialProduto>> listaProdutosLiveData = new MutableLiveData<>();
        ApiModule.getApi().getProdutos().enqueue(new Callback<List<FilialProduto>>() {
            @Override
            public void onResponse(Call<List<FilialProduto>> call, Response<List<FilialProduto>> response) {
                listaProdutosLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<FilialProduto>> call, Throwable t) {
                Log.i("TAG","message");
            }
        });
        return listaProdutosLiveData;
    }
}
