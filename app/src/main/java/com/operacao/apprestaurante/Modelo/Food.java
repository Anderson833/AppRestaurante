package com.operacao.apprestaurante.Modelo;

/**
 * Essa classe vai modela os dados
 */
public class Food {
   private int imgFood;
   private String FoodName;
   private String preco;
   private String descripiton;

   public Food(int imgFood, String foodName, String preco, String descripiton) {
      this.imgFood = imgFood;
      FoodName = foodName;
      this.preco = preco;
      this.descripiton = descripiton;
   }

   public int getImgFood() {
      return imgFood;
   }

   public String getFoodName() {
      return FoodName;
   }

   public String getPreco() {
      return preco;
   }

   public String getDescripiton() {
      return descripiton;
   }
}
