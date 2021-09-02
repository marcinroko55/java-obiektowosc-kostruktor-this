public class WorkshopApp {
    public static void main(String[] args) {
        Car car1 = new Car(255.555, "Porsche");
        Car car2 = new Car(100, "Zaporożec");
        Car car3 = new Car(555.555, "Pagani Zonda");

        Car[] cars = new Car[3];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
//co tutaj jest co?
        for (Car car: cars) {
            System.out.println("Marka samochodu to: " + car.carMark + "," + " Cena wynosi: " + car.price);
        }

    }
}
