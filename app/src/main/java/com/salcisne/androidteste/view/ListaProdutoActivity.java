package com.salcisne.androidteste.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.salcisne.androidteste.R;
import com.salcisne.androidteste.databinding.ActivityListaProdutosBinding;
import com.salcisne.androidteste.model.FilialProduto;
import com.salcisne.androidteste.view.adapter.RecyclerViewAdapter;
import com.salcisne.androidteste.viewmodel.ProdutoViewModel;

import java.util.List;

public class ListaProdutoActivity extends AppCompatActivity {

    private ProdutoViewModel viewModel;
    private ActivityListaProdutosBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_lista_produtos);
        binding.setLifecycleOwner(this);

        setupViewModel();
        startList();
    }

    private void startList() {
        viewModel.getListaProdutos().observe(this, new Observer<List<FilialProduto>>() {
            @Override
            public void onChanged(List<FilialProduto> filialProdutos) {

                RecyclerViewAdapter adapter = new RecyclerViewAdapter(filialProdutos);

                binding.recyclerView.setLayoutManager(new LinearLayoutManager(ListaProdutoActivity.this));
                binding.recyclerView.setAdapter(adapter);
            }
        });
    }
    private void setupViewModel() {
        viewModel = ViewModelProviders.of(this).get(ProdutoViewModel.class);
        binding.setViewModel(viewModel);

    }
}
