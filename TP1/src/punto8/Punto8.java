package punto8;

public class Punto8 {
    public static void punto8(){
        System.out.println("Manager: ");
        Manager manager = new Manager("Santiago", 18, 150000, "Marketing");
        manager.showInformation();
        manager.work();

        System.out.println("Worker: ");
        Worker worker = new Worker("Nicolas", 20, 300000, "RRHH");
        worker.showInformation();
        worker.work();
    }
}
