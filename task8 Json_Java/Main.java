package ss2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("student.json")){
            Object obj = jsonParser.parse(reader);

            JSONArray studentList = (JSONArray) obj;
            System.out.println(studentList);


            studentList.forEach(emp -> parseStudentObject( (JSONObject) emp));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseStudentObject(JSONObject student) {
        JSONObject studentObject = (JSONObject) student.get("student");

        String Name = (String) studentObject.get("Name");
        System.out.println(Name);

        String Age = (String) studentObject.get("Age");
        System.out.println(Age);

        String Phone = (String) studentObject.get("Phone");
        System.out.println(Phone);

        String Address = (String) studentObject.get("Address");
        System.out.println(Address);
    }
}
