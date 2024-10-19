package com.yash.training;
// Class that imitates int functionality
class Int {
    private int sum;

    // Default constructor
    public Int() {
        this.sum = 0;
    }

    // Constructor to initialize with an int value
    public Int(int value) {
        this.sum = value;
    }

    // Getter for sum
    public int getSum() {
        return sum;
    }

    // Method to add two int values
    public void addNumber(int i, int j) {
        this.sum = i + j;
    }
}

// Class to test Int class
public class CheckInt {
    public static void main(String[] args) {
        Int uninitializedInt = new Int(); // Uninitialized Int
        Int initializedInt1 = new Int(10); // Initialized Int
        Int initializedInt2 = new Int(20); // Another Initialized Int

        // Add initializedInt1 and initializedInt2 and store in uninitializedInt
        uninitializedInt.addNumber(initializedInt1.getSum(), initializedInt2.getSum());

        // Display result
        System.out.println("The result of addition is: " + uninitializedInt.getSum());
    }
}

