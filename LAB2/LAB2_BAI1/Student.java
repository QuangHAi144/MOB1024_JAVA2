/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_BAI1;


/**
 *
 * @author QUANGHAI
 */
public class Student {
    private String id;
    private String name;
    private LAB2_BAI1.Enum_StudentType.StudentType type;

    public Student(String id, String name, Enum_StudentType.StudentType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Enum_StudentType.StudentType getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Enum_StudentType.StudentType type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
    return "Student{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", type=" + type +
            '}';
    }
}


