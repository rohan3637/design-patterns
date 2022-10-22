package structural.CodeForAdapter;

public class Test {
    
    public static void main(String[] args){

        EmployeeDetails employeeDetails = new EmployeeDetails();
        EmployeeToPLAdapter adapter = new EmployeeToPLAdapter(employeeDetails);
        Intranet intranet = new Intranet(adapter);
        intranet.printPhoneNumbers();
    }
}
