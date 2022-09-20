public class EmployeeDataBase {
    DataBaseManager dataBaseManager = new DataBaseManager();
    public void addEmployee(Employee employee){
        dataBaseManager.connectToDB();
        System.out.println("Employ "+ employee + " added.");
        dataBaseManager.disconectToDB();
    }

    public void removeEmployee(Employee employee){
        dataBaseManager.connectToDB();
        System.out.println("Employee " + employee + " removed!");
        dataBaseManager.disconectToDB();
    }
}
