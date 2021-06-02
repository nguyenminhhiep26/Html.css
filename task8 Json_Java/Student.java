package ss2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        JSONObject Student1 = new JSONObject();
        System.out.println("Enter Name : ");
        String name = sc.nextLine();
        Student1.put("Name",name);

        System.out.println("Enter Age : ");
        String age = sc.nextLine();
        Student1.put("Age",age);

        System.out.println("Enter Phone : ");
        String phone = sc.nextLine();
        Student1.put("phone", phone);

        System.out.println("Enter address :");
        String address = sc.nextLine();
        Student1.put("address",address);

        JSONObject studentObject = new JSONObject();
        studentObject.put("student",Student1);

        JSONObject Student2 = new JSONObject();
        System.out.println("Enter Name : ");
        String name2 = sc.nextLine();
        Student2.put("Name", name2);

        System.out.println("Enter Age :");
        String age2 = sc.nextLine();
        Student2.put("Age",age2);

        System.out.println("Enter Phone :");
        String phone2 =sc.nextLine();
        Student2.put("Phone",phone2);

        System.out.println("Enter Address :");
        String address2 = sc.nextLine();
        Student2.put("Address ",address2);

        JSONObject studentObject2 = new JSONObject();
        studentObject2.put("student",Student2);

        JSONArray studentList = new JSONArray();
        studentList.add(studentObject);
        studentList.add(studentObject2);

        try(FileWriter file = new FileWriter("student.json")){
            file.write(studentList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
