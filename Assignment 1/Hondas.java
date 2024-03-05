interface Bike {
    void run();

    void changegear();
}

public class Hondas implements Bike {
    public static void main(String[] args) {
        Bike b = new Hondas();

        b.changegear();
        b.run();
    }

    public void run() {
        System.out.println("Running bike of Honda");
    }
     public void changegear() {
        System.out.println("Running bike of Honda");
    }
}
