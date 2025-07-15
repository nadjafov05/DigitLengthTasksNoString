package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,22,333,4444,55555,2,1234589};

        for (int i=0;i<numbers.length;i++){
            int reqem = numbers[i];
            int count = 0;
            int bolunenReqem = reqem;
            while (bolunenReqem!=0){
                bolunenReqem = bolunenReqem / 10;
                count++;
            }
            System.out.println("reqem : "+ reqem + "icindeki reqem sayi : "+ count);
        }
    }

    //10. Bütün ədədləri və onların rəqəm sayını çap et.
    //➡ Dövrdə həm ədədi, həm length-i çap et.
}