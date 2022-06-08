package com.bridgelabz.object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Stockaccountmanagement {
    static ArrayList<Stock> listStock = new ArrayList<Stock>();
    Scanner sc = new Scanner(System.in);

    public void portfolioOfStock() {
        System.out.println("First enter number of stocks: ");
        int numberOfStocks = sc.nextInt();
        for (int i = 0; i < numberOfStocks; i++) {
            System.out.println("Enter the name of share: ");
            String shareName = sc.next();
            System.out.println("Enter number of shares: ");
            int numberOfShares = sc.nextInt();
            System.out.println("Enter share price: ");
            int sharePrice = sc.nextInt();
            listStock.add(new Stock(shareName, numberOfShares, sharePrice));
            // totalStockValue(numberOfShares * sharePrice);
            totalValueOfEachStock(numberOfShares, sharePrice);

        }
    }

    public int totalValueOfEachStock(int numberOfShares, int sharePrice) {
        int stockvalue = 0;
        Iterator<Stock> itr = listStock.iterator();
        while (itr.hasNext()) {
            Stock s = (Stock) itr.next();
            int stock = s.getNumberOfShares() * s.getSharePrice();
            System.out.println("Name of the stock: " + s.getStockName());
            System.out.println("total stock price: " + stock);
            stockvalue = stockvalue + stock;
        }
        System.out.println("\n");
        System.out.println("total Value of each stock: " + stockvalue);
        return numberOfShares * sharePrice;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to object oriented programs");
        Stockaccountmanagement stock = new Stockaccountmanagement();
        stock.portfolioOfStock();
        stock.totalValueOfEachStock(2, 20);

    }

}