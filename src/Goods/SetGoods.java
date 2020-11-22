/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Goods;

/**
 *
 * @author 💜아이유
 */
public class SetGoods {

    public static Goods goods[];
    private int count;

    public SetGoods(int goodsAmounts) {
        goods = new Goods[goodsAmounts];
    }

    public SetGoods append(Goods gd) {
        if (count < goods.length) {
            goods[count++] = gd;
            return this;
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(goods[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
