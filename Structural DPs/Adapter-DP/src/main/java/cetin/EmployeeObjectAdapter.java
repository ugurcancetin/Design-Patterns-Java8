package cetin;

public class EmployeeObjectAdapter implements Customer{
    private Employee employeeAdaptee;

    public EmployeeObjectAdapter(Employee e){
        this.employeeAdaptee = e;
    }

    @Override
    public String getName() {
        return employeeAdaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return employeeAdaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return employeeAdaptee.getOfficeLocation();
    }
}
