package Punto2;

public class Employee {
    protected String name;
    protected Employee supervisor;

    public Employee(String name) {
        this.name = name;
    }

    public void assignSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisorName() {
        if (supervisor != null) {
            return supervisor.name;
        } else {
            return "No supervisor";
        }
    }
}
