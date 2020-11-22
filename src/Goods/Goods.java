/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goods;

import OrderSystem.FoodName;

/**
 *
 * @author 💜아이유
 */
public class Goods {
    
    private final int num;
    private final FoodName name;
    private final int price;
    private int stock;
    
    public Goods(int num, FoodName name, int price, int stock){
        this.num = num;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    public FoodName getName(){
        return name;
    }
    
    public int getPrice(){
        return price;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void decreaseStock(int amounts){
        stock -= amounts;
    }

    @Override
    public String toString() {
        return Integer.toString(num) + ". " + name + " price : " + price + " Stock : " + stock;
    }
    
}
