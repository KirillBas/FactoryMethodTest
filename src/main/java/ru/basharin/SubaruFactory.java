package ru.basharin;

public class SubaruFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Subaru();
    }
}
