/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_BAI2;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author QUANGHAI
 */
public class MainBai2 {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<Product>(); 
        
        list.add(new Product("P01", "Laptop", 1500, Enum_ProductCategory.ProductCategory.ELECTRONICS));
        list.add(new Product("P02", "Phone", 800, Enum_ProductCategory.ProductCategory.ELECTRONICS));
        list.add(new Product("P03", "Shirt", 50, Enum_ProductCategory.ProductCategory.CLOTHING));
        list.add(new Product("P04", "Jeans", 70, Enum_ProductCategory.ProductCategory.CLOTHING));
        list.add(new Product("P05", "Milk", 20, Enum_ProductCategory.ProductCategory.FOOD));
        list.add(new Product("P06", "Bread", 15, Enum_ProductCategory.ProductCategory.FOOD));
        list.add(new Product("P07", "TV", 1200, Enum_ProductCategory.ProductCategory.ELECTRONICS));
        list.add(new Product("P08", "Jacket", 100, Enum_ProductCategory.ProductCategory.CLOTHING));
        
        HashMap<Enum_ProductCategory.ProductCategory, Integer> countMap = new HashMap<>();

        // khởi tạo = 0
        for (Enum_ProductCategory.ProductCategory c : Enum_ProductCategory.ProductCategory.values()) {
        countMap.put(c, 0);
        }

        // đếm
        for (Product p : list) {
            var c = p.getCategory();
            countMap.put(c, countMap.get(c) + 1);
        }
        
        HashMap<Enum_ProductCategory.ProductCategory, Double> sumMap = new HashMap<>();

        // khởi tạo = 0
        for (Enum_ProductCategory.ProductCategory c : Enum_ProductCategory.ProductCategory.values()) {
        sumMap.put(c, 0.0);
        }

        // cộng tiền
        for (Product p : list) {
            var c = p.getCategory();
            sumMap.put(c, sumMap.get(c) + p.getPrice());
        }
        
        System.out.println("=== Danh sách sản phẩm ===");

        for (Product p : list) {
        System.out.println(p);
        }
        
        System.out.println("\n=== Thống kê ===");

        for (var entry : countMap.entrySet()) {
        var category = entry.getKey();
        var count = entry.getValue();
        var total = sumMap.get(category);

        System.out.println(category + 
        " | Số lượng: " + count + 
        " | Tổng tiền: " + total);
        }
        
    }
}
