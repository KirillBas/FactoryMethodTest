package ru.basharin;

public class Lada07Factory implements CarFactory {
    @Override
    public Car createCar() {
        return new Lada07();
    }
}
