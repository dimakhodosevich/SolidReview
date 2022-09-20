public class ClientService {
    static EmployeeDataBase employeeDataBase = new EmployeeDataBase();

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Dima Khodosevich", "engineer");
        hireNewEmployee(employee);
        removeEmployee(employee);
        printEmployee(employee, FormatType.CSV);
    }


    public static void hireNewEmployee(Employee employee){
        employeeDataBase.addEmployee(employee);
    }


    public static void removeEmployee(Employee employee){
        employeeDataBase.removeEmployee(employee);
    }

    public static void printEmployee(Employee employee, FormatType formatType){
        ReportFormatterEmployee reportFormatterEmployee = new ReportFormatterEmployee(employee,formatType);
        System.out.println(reportFormatterEmployee.getFormatter());
    }
}
