package com.migueljibaja;

import java.util.Map;

public class Main {

    public static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86,100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

          temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s:stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket miguelbasket = new Basket("Miguel");
        sellItem(miguelbasket,"car",1);
        System.out.println(miguelbasket);

        sellItem(miguelbasket,"car",1);
        System.out.println(miguelbasket);

        sellItem(miguelbasket,"car",1);
        sellItem(miguelbasket,"spanner",1);
//        System.out.println(miguelbasket);

        sellItem(miguelbasket,"juice",4);
        sellItem(miguelbasket,"cup",12);
        sellItem(miguelbasket,"bread",1);
//        System.out.println(miguelbasket);

//        System.out.println(stockList);

        Basket basket = new Basket("customer");
        sellItem(basket,"cup",100);
        sellItem(basket,"juice",5);
        removeItem(basket,"cup",1);
        System.out.println(basket);

        removeItem(miguelbasket,"car",1);
        removeItem(miguelbasket,"cup",9);
        removeItem(miguelbasket,"car",1);
        System.out.println("cars removed: " + removeItem(miguelbasket, "car",1));
        System.out.println(miguelbasket);

        checkout(miguelbasket);
        System.out.println(miguelbasket);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //recuperar el articulo de la lista de articulos
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.reserveStock(item,quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //recuperar el articulo de la lista de articulos
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (basket.removeFromBasket(stockItem,quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for (Map.Entry<StockItem,Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
