package cetin;

public class Main {
    public static void main(String[] args) {
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner designer = new BusinessCardDesigner();
        String card = designer.designCard(adapter);

        System.out.println(card);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Ugurcan Cetin");
        employee.setJobTitle("Software Engineer");
        employee.setOfficeLocation("Mersin, Turkey");
    }
}
