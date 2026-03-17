/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4_LAB1;

/**
 *
 * @author QUANGHAI
 */
import java.util.ArrayList;

public class MainBAi4 {

    public static void main(String[] args) {

        ArrayList<Course> listCourse = new ArrayList<>();

        listCourse.add(new Course("C01","Java Basic",100));
        listCourse.add(new Course("C02","HTML CSS",80));
        listCourse.add(new OnlineCourse("C03","Java OOP",120,10,0.1));
        listCourse.add(new OnlineCourse("C04","Web Development",150,15,0.2));
        listCourse.add(new OnlineCourse("C05","Database",130,12,0.15));

        for(Course c : listCourse){
            System.out.println(c.toString());
        }

        Course max = listCourse.get(0);

        for(Course c : listCourse){
            if(c.finalPrice() > max.finalPrice()){
                max = c;
            }
        }

        System.out.println("Course co gia cao nhat: " + max.toString());
    }
}
