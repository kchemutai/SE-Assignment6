package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class HelloWorld {
    public static void printHelloWorld(int [] arr){
        for(int i: arr){
            if(i%5==0 && i%7==0) System.out.println("HelloWorld");
            else if(i%5==0) System.out.println("Hello");
            else if(i%7==0) System.out.println("World");
        }
    }
    public static void main(String[] args) {
        int [] a={10, 14, 25, 35, 40, 49, 70, 75, 77};
        printHelloWorld(a);
    }
}
