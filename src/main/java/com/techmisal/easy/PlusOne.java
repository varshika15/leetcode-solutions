package com.techmisal.easy;

public class PlusOne {


    public int[] addOne(int[] arr) {


        int len = arr.length - 1;
        int dividend = 0;

        if(arr.length == 0){
            return arr;
        }


        do {

            int add = dividend == 0 ? 1 : dividend;
            int x = arr[len];
            arr[len] = (x + add) % 10;
            dividend = (x + add) / 10;
            len--;


        } while (dividend != 0 && len >= 0);


        if (dividend == 1) {


            int[] array = new int[arr.length + 1];
            for (int i = arr.length - 1; i >= 0; i--) {
                array[i + 1] = arr[i];
            }

            array[0] = dividend;

            return array;
        }

        return arr;

    }


}
