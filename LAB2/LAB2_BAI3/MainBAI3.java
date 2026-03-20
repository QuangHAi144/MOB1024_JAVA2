/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_BAI3;

import java.util.Scanner;

/**
 *
 * @author QUANGHAI
 */
public class MainBAI3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm theo mã");
            System.out.println("4. Cập nhật lương");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập lương: ");
                    double salary = Double.parseDouble(sc.nextLine());

                    service.addEmployee(new Employee(id, name, salary));
                    System.out.println("Đã thêm!");
                    break;

                case 2:
                    System.out.println("=== Danh sách ===");
                    service.displayAll();
                    break;

                case 3:
                    System.out.print("Nhập ID cần tìm: ");
                    String findId = sc.nextLine();

                    Employee e = service.findById(findId);

                    if (e != null) {
                        System.out.println("Tìm thấy: " + e);
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập ID cần cập nhật: ");
                    String updateId = sc.nextLine();

                    System.out.print("Nhập lương mới: ");
                    double newSalary = Double.parseDouble(sc.nextLine());

                    boolean result = service.updateSalary(updateId, newSalary);

                    if (result) {
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Không tìm thấy nhân viên!");
                    }
                    break;

                case 0:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Chọn sai!");
            }

        } while (choice != 0);
    }

}
