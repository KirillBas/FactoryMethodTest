package ru.basharin;

class Main {
    public static void main(String[] args) {
        CarFactory carFactory = createCarByBrand("what");
        Car car = carFactory.createCar();
        car.startEngine();
    }

    private static CarFactory createCarByBrand(String brand) {
        if (brand.equalsIgnoreCase("BMW")) {
            return new BmvFactory();
        } else if (brand.equalsIgnoreCase("Subaru")) {
            return new SubaruFactory();
        } else if (brand.equalsIgnoreCase("shit")) {
            return new Lada07Factory();
        } else {
            throw new RuntimeException(brand + " this brand not supported");
        }
    }
}
