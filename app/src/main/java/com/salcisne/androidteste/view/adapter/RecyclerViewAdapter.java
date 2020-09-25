package com.salcisne.androidteste.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.salcisne.androidteste.R;
import com.salcisne.androidteste.databinding.RecyclerViewItemBinding;
import com.salcisne.androidteste.model.FilialProduto;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<FilialProduto> list;

    public RecyclerViewAdapter(List<FilialProduto> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerViewItemBinding binding = DataBindingUtil.inflate(inflater,
                R.layout.recycler_view_item, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.binding.productName.setText(list.get(position).getProduto().getNome());
        holder.binding.quantity.setText(String.valueOf(list.get(position).getQtdTotal()));
        holder.binding.place.setText(list.get(position).getFilial().getEndereco());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private RecyclerViewItemBinding binding;

        public ViewHolder(@NonNull RecyclerViewItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}