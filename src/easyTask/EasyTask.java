package easyTask;

import java.util.Scanner;

public class EasyTask {
    //1. Massivdə neçə ədəddə yalnız 1 rəqəm var?
    //➡ Hər ədəd üçün while ilə rəqəm sayını tap, 1-dirsə sayacı artır.
    public static void whatsOneNumbersInArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter to massiv numbers: ");
        int arraysNumbers = sc.nextInt();

        int[] numbers = new int[arraysNumbers];

        int oneNumbers = 0;
        for (int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        for (int i=0;i<numbers.length;i++){
            if (numbers[i] > 0 && numbers[i] < 10){
                oneNumbers++;
            }
        }
        System.out.println(oneNumbers);
    }


    //2. Massivdə neçə ədəddə 2 rəqəm var?
    //➡ Rəqəm sayı 2 olan ədədləri say.
    public static void whatsTwoNUmbersInArrays(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enters to massiv numbers");
        int numbersScanner = sc.nextInt();

        //massivde olan 2 reqemlilerin saylari
        int numbersTwo = 0;

        //daxil etdiyimiz scanner qeder massiv doldur
        int[] numbers = new int[numbersScanner];

        //massivleri 1-1 doldur
        for (int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }

        //doldurulmus massivlere daxil ol ve
        for (int i=0;i<numbers.length;i++){
            //eger massivde olan reqemler 10 boyukdurse ve 100 kicikdirse
            if (numbers[i] > 10 && numbers[i] < 100){
                //numbersTwo deyisenini 1 vahid artir
                numbersTwo++;
            }
        }
        System.out.println(numbersTwo);
    }
}
