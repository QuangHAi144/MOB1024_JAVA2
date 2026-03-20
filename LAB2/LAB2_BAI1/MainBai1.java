/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_BAI1;

import LAB2_BAI1.Enum_StudentType.StudentType;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author QUANGHAI
 */
public class MainBai1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        
        list.add(new Student("SV01", "Hai", StudentType.REGULAR));
        list.add(new Student("SV02", "Nam", StudentType.PART_TIME));
        list.add(new Student("SV03", "Linh", StudentType.INTERNATIONAL));
        list.add(new Student("SV04", "An", StudentType.REGULAR));
        list.add(new Student("SV05", "Khanh", StudentType.PART_TIME));
        list.add(new Student("SV06", "John", StudentType.INTERNATIONAL));
        
        System.out.println("=== Danh sách tất cả sinh viên ===");
        for (Student s : list) {
            System.out.println(s);
        }
        
        //_____________________//
        System.out.println("\n=== Sinh viên theo từng loại ===");
        for (StudentType type : StudentType.values()) {
            System.out.println("\nLoại: " + type);
            for (Student s : list) {
                if (s.getType() == type) {
                    System.out.println(s);
                }
            }
        }
        
        HashMap<StudentType, Integer> countMap = new HashMap<>();

        for (StudentType type : StudentType.values()) {
            countMap.put(type, 0);
        }

        for (Student s : list) {
            StudentType type = s.getType();
            countMap.put(type, countMap.get(type) + 1);
        }

        System.out.println("\n=== Số lượng sinh viên theo loại ===");
        for (StudentType type : StudentType.values()) {
            System.out.println(type + ": " + countMap.get(type));
        }
    }      
}
        