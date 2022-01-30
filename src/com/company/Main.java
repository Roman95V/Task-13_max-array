package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,1,3,5,7,9,11,13,15,17,19,19};
        int max = array[0];

        System.out.println("Max values in array:");

        for(int num : array){
            if(num>max){
                max=num;
            }
        }
        for (int j = 0; j< array.length; j++) {
            if (max == array[j])
                System.out.print(array[j] + "; ");
        }
    }
}
