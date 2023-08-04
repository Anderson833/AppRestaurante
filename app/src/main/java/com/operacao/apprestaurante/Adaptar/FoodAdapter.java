package com.operacao.apprestaurante.Adaptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.operacao.apprestaurante.Modelo.Food;
import com.operacao.apprestaurante.databinding.FooditemBinding;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private final ArrayList<Food> listaFond;
    private final Context context;

    public FoodAdapter(ArrayList<Food> listaFond, Context context) {
        this.listaFond = listaFond;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        FooditemBinding listaItem;
        listaItem=FooditemBinding.inflate(LayoutInflater.from(context),parent,false);
        return new FoodViewHolder(listaItem);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.binding.ImgFood.setBackgroundResource(listaFond.get(position).getImgFood());
        holder.binding.txtFoodNome.setText(listaFond.get(position).getFoodName());
        holder.binding.txtFoodDescricao.setText(listaFond.get(position).getDescripiton());
        holder.binding.txtFoodPreco.setText(listaFond.get(position).getPreco());
    }

    @Override
    public int getItemCount() {
        return listaFond.size();
    }

    public  static  class FoodViewHolder extends RecyclerView.ViewHolder{

        FooditemBinding binding;

        public FoodViewHolder(FooditemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
