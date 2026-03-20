/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_BAI2;

/**
 *
 * @author QUANGHAI
 */
public class Product {
    private String id;
    private String name;
    private double price;
    private LAB2_BAI2.Enum_ProductCategory.ProductCategory category;

    public Product() {
    }

    public Product(String id, String name, double price, Enum_ProductCategory.ProductCategory category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Enum_ProductCategory.ProductCategory getCategory() {
        return category;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Enum_ProductCategory.ProductCategory category) {
        this.category = category;
    }
           
    @Override
    public String toString() {
        return "Product{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", price=" + price +
            ", category=" + category +
            '}';
}
}
