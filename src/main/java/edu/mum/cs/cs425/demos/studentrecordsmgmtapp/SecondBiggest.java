package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

public class SecondBiggest {
    public static int findSecondBiggest(int [] arr){
        int biggest=arr[0];
        int secondBiggest = arr[0];
        for(int i: arr){
            if(i>biggest){
                secondBiggest=biggest;
                biggest=i;
            } else if (i>secondBiggest) {
                secondBiggest=i;
            }
        }
        return secondBiggest;
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int secondBiggest = findSecondBiggest(arr);
        System.out.println(secondBiggest);
    }
}
