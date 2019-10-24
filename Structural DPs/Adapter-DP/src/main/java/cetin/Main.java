package cetin;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Using Class Adapter
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);

        System.out.println(card);

        //Using Object Adapter
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        String card2 = designer.designCard(objectAdapter);

        System.out.println(card2);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Ugurcan Cetin");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Mersin, Turkey");
    }
}
