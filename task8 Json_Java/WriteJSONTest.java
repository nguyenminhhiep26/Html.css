import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJSONTest {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("FName","NGUYEN");
        employeeDetails.put("LName","MINH HIEP");
        employeeDetails.put("website","codelean.vn");

        JSONObject employeeObject = new JSONObject();
        employeeObject.put("employee",employeeDetails);

        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("FName", "Code");
        employeeDetails2.put("LName","Lean");
        employeeDetails2.put("website","codelean.com");

        JSONObject employeeObject2 = new JSONObject();
        employeeObject2.put("employee",employeeDetails2);

        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);

        try(FileWriter file = new FileWriter("employee.json")){
            file.write(employeeList.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
