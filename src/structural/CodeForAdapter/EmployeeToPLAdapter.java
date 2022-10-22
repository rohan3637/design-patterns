package structural.CodeForAdapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeToPLAdapter implements IPhoneListSource {

    private EmployeeDetails employeeDetails;

    public EmployeeToPLAdapter(EmployeeDetails employeeDetails){
        this.employeeDetails = employeeDetails;
    }

    @Override
    public List<String> getPhoneNumbers() {
        List<String> emps = this.employeeDetails.getEmployees();
        List<String> phones = new ArrayList<>();
        for(String emp : emps){
            String[] temp = emp.split("-"); 
            phones.add(temp[3]);
        }
        return phones;
    }
    
}
