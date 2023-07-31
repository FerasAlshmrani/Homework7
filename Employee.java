public class Employee {
    private String id;
    private String name;
    private int salary;

    Employee(String id , String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int AnnualSalary(){
        return salary;
    }
    public int raisedSalary(int percent){
        salary *= percent;
        return salary;
    }

    public String toString() {
        return "Employee name : "+ name+ " ,Employee id : "+ id + " ,Employee salary "+ salary;
    }
}

