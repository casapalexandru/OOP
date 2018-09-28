package com.company;

public class Main_Task2
{
    public static void main(String[] args)
    {
        Lista queue = new Lista(1000);

        queue.addVar(7);
        queue.addVar(9);
        queue.addVar(3);
        queue.addVar(5);

        System.out.println("\n"+queue.removeVar() +
                " remove from queue\n");

        System.out.println("Front item is " +
                queue.front());

        System.out.println("Rear item is " +
                queue.rear());
        queue.printArray();
    }
}