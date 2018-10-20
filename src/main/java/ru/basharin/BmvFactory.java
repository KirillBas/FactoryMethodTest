package ru.basharin;

public class BmvFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
