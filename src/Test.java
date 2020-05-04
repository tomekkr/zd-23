class Test {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Car newCar;
        Utils utils = new Utils();

        for (int i = 0; i < cars.length; i++) {
            do {
                newCar = utils.createNewCar();
            } while (!utils.isDuplicate(newCar, cars));
            cars[i] = newCar;
        }

        utils.printInfo(cars);
    }
}
