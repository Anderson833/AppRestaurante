package com.operacao.apprestaurante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.operacao.apprestaurante.Adaptar.FoodAdapter;
import com.operacao.apprestaurante.Modelo.Food;
import com.operacao.apprestaurante.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter adapterFood;
    private ArrayList<Food> listaFood = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerView =binding.Recicle01;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        adapterFood = new  FoodAdapter(listaFood,this);
        recyclerView.setAdapter(adapterFood);
        getItem();
    }

    private void getItem(){
        Food food1 = new Food(R.drawable.food1,"Almoço","$ 120","Comida do meio dia");
        listaFood.add(food1);
        Food food2 = new Food(R.drawable.food2,"Janta","$ 50","Refeição da noite");
        listaFood.add(food2);
        Food food3 = new Food(R.drawable.food3,"Sopa","$ 45","Refeição para qualque hora");
        listaFood.add(food3);
        Food food4 = new Food(R.drawable.food4,"Café","$ 30","Refeição da manhã");
        listaFood.add(food4);
        Food food5 = new Food(R.drawable.food5,"Lancher","$ 12","Opcional durante o dia");
        listaFood.add(food5);
    }
}