package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

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

    //3. Massivdə neçə ədəddə 3 rəqəm var?
    //➡ Eyni üsul, sadəcə length == 3 şərti.

    //4. Massivdə neçə ədəddə cüt rəqəm sayı var?
    //➡ Rəqəm sayını tap, əgər length % 2 == 0 → sayacı artır.

    //5. Massivdə neçə ədəddə tək rəqəm sayı var?
    //➡ Əvvəlki tapşırıqla eynidir, amma % 2 != 0.

    //6. Massivdə 1-dən 3-ə qədər rəqəmli ədədləri çap et.
    //➡ Əgər length >= 1 && length <= 3 → çap et.

    //7. Massivdə yalnız 5 rəqəmli ədədləri çap et.
    //➡ length == 5 olanları çap et.

    //8. 2 rəqəmli ədədlərin sayını və özlərini çap et.
    //➡ Həm length == 2 say, həm çap et.

    //9. Əgər massivdə 0 varsa, onun rəqəm sayını ayrıca yaz.
    //➡ 0 üçün ayrıca if, rəqəm sayı 1 sayılır.

    //10. Bütün ədədləri və onların rəqəm sayını çap et.
    //➡ Dövrdə həm ədədi, həm length-i çap et.
}