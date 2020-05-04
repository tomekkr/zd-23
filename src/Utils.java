import java.util.Scanner;

class Utils {
    Scanner sc = new Scanner(System.in);

    public Car createNewCar() {
        System.out.print("Nazwa auta: ");
        String name = sc.nextLine();
        System.out.print("Moc auta: ");
        int power = sc.nextInt();
        sc.nextLine();
        return new Car(name, power);
    }

    public boolean isDuplicate(Car car, Car[] cars) {
        for (Car value : cars) {
            if (car.equals(value)) {
                System.out.println("Taki obiekt już istnieje, wprowadź dane jeszcze raz");
                return false;
            }
        }
        return true;
    }

    public void printInfo(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Auto nr " + (i + 1) + ": " + cars[i].getName() + " (" + cars[i].getPower() + " KM)");
        }
    }
}
