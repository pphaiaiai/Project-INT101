
package Goods;

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
