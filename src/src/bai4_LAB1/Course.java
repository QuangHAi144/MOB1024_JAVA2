/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4_LAB1;

/**
 *
 * @author QUANGHAI
 */
public class Course {
    private String id;
    private String name;
    private double price;

    public Course(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if(id == null || id.isEmpty()){
            System.out.println("ID khong duoc rong");
        }else{
            this.id = id;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()){
            System.out.println("Ten khong duoc rong");
        }else{
            this.name = name;
        }
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price < 0){
            System.out.println("Gia khong hop le");
        }else{
            this.price = price;
        }
    }
    public double finalPrice(){
        return price;
    }
    @Override
    public String toString(){
        return id + " - " + name + " - Final Price: " + finalPrice();
    }
}
