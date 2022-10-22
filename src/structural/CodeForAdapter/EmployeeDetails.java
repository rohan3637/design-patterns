package structural.CodeForAdapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
    
    public List<String> getEmployees(){
        List<String> emps = new ArrayList<>();
        emps.add("1-ABC-SDE1-766459364");
        emps.add("2-DEF-MLE2-766464364");
        emps.add("3-GHI-SDE2-866459364");
        emps.add("4-JKL-HR-766359364");
        emps.add("5-MNO-BA1-986459364");
        return emps;
    }
}
