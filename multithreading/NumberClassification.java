package com.yash.multithreading;
import java.util.*;
class RandomNumberGenerator {
    ArrayList<Integer> numbers = new ArrayList<>();

    public void generateNumbers() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(100) - 50); // -50 and 49
        }
    }
    public void display()
    {
        for(int num:numbers)
        {
            System.out.print(num+" ");
        }
    }
}

class PositiveEvenThread extends Thread {
    RandomNumberGenerator rng;

    PositiveEvenThread(RandomNumberGenerator rng) {
        this.rng = rng;
    }

    public void run() {
        for (int num : rng.numbers) {
            if (num > 0 && num % 2 == 0) {
                System.out.println("Positive Even: " + num);
            }
        }
    }
}

class PositiveOddThread extends Thread {
    RandomNumberGenerator rng;

    PositiveOddThread(RandomNumberGenerator rng) {
        this.rng = rng;
    }

    public void run() {
        for (int num : rng.numbers) {
            if (num > 0 && num % 2 != 0) {
                System.out.println("Positive Odd: " + num);
            }
        }
    }
}
class NegativeThread extends Thread {
    RandomNumberGenerator rng;

    NegativeThread(RandomNumberGenerator rng) {
        this.rng = rng;
    }

    public void run() {
        for (int num : rng.numbers) {
            if (num < 0) {
                System.out.println("Negative: " + num);
            }
        }
    }
}

public class NumberClassification {

    public static void main(String[] args) {
        RandomNumberGenerator rng=new RandomNumberGenerator();
        rng.generateNumbers();
        System.out.print("The random generated numbers are: ");
        System.out.println();
        rng.display();
        System.out.println();
        PositiveEvenThread evenThread = new PositiveEvenThread(rng);
        PositiveOddThread oddThread = new PositiveOddThread(rng);
        NegativeThread negativeThread = new NegativeThread(rng);

        evenThread.start();
        oddThread.start();
        negativeThread.start();
    }
}
