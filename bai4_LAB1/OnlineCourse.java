/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4_LAB1;

/**
 *
 * @author QUANGHAI
 */
public class OnlineCourse extends Course {

    private double platformFee;
    private double discountRate;

    public OnlineCourse(String id, String name, double price, double platformFee, double discountRate) {
        super(id, name, price);
        this.platformFee = platformFee;
        this.discountRate = discountRate;
    }

    public double getPlatformFee() {
        return platformFee;
    }
    
    
    public void setPlatformFee(double platformFee) {
        if(platformFee < 0){
            System.out.println("Phi nen tang khong hop le");
        }else{
            this.platformFee = platformFee;
        }
    }
    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        if(discountRate < 0 || discountRate > 1){
            System.out.println("Discount khong hop le");
        }else{
            this.discountRate = discountRate;
        }
    }
    @Override
    public double finalPrice(){
        return getPrice() + platformFee - getPrice()*discountRate;
    }
    @Override
    public String toString(){
        return getId() + " - " + getName() + " - Final Price: " + finalPrice();
    }
}