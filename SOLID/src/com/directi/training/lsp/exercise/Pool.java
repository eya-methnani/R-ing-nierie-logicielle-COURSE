package com.directi.training.lsp.exercise;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn();  // Ensure the electronic duck is turned on before using

        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Quackable... quackables)
    {
        for (Quackable quackable : quackables) {
            quackable.quack();
        }
    }

    private void swim(Swimmable... swimmables)
    {
        for (Swimmable swimmable : swimmables) {
            swimmable.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
