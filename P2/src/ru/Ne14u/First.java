package ru.Ne14u;

import ru.Ne14u.Second;

public class First {
    public static void main(String[] args) {
        System.out.println(Second.Addition(2,3));

        Second sec = new Second();
        sec.Print();
    }
}