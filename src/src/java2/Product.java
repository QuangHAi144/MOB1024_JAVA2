/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java2;

/**
 *
 * @author QUANGHAI
 */


    public class Product {
        private String id;
        private String name;
        private double basePrice;

        public Product(String id, String name, double basePrice) {
            setId(id);
            this.name = name;
            setBasePrice(basePrice);
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
            this.name = name;
        }

        
        public double getBasePrice() {
            return basePrice;
        }
        public void setBasePrice(double basePrice) {
        if(basePrice >= 0){
            this.basePrice = basePrice;
        }else{
            System.out.println("Gia khong hop le");
        }
    }
    // method
    public double finalPrice(){
        return basePrice;
    }
    @Override
    public String toString(){
        return id + " - " + name + " - Final Price: " + finalPrice();
    }
    }
    

