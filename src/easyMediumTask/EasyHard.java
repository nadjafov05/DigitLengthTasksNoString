package easyMediumTask;

public class EasyHard {

    //11. Ən uzun rəqəmli ədədi tap.
    //➡ Rəqəm sayını tap, maxLength ilə müqayisə et.
    public static void findNumberWithMaxDigits(){
        int[] numbers = {5, 12, 345, 23, 1, 7896, 88};

        int maxLength = 0;
        int longestNumber = 0;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int length = 0;

            // 0 üçün ayrıca yoxlama
            if (number == 0) {
                length = 1;
            } else {
                int temp = number;
                while (temp > 0) {
                    temp = temp / 10;
                    length++;
                }
            }

            if (length > maxLength) {
                maxLength = length;
                longestNumber = number;
            }
        }

        System.out.println("Ən uzun rəqəmli ədəd: " + longestNumber);
    }


    //12. Ən qısa rəqəmli ədədi tap.
    //➡ Eyni üsulla minLength və shortestNumber saxla.
    public static void findNumberWithMinDigits(){
        int[] numbers = {3,584,96,85,7,56,9};
        int minLenght = 100;
        int shortesNumbers = 0;

        for (int i=0;i<numbers.length;i++){
            int number = numbers[i];
            int lenght = 0;

            if (number == 0){
                lenght = 1;
            }else {
                int temp = number;
                while (temp > 0){
                    temp = temp / 10;
                    lenght++;
                }
            }
            if (lenght < minLenght){
                minLenght = lenght;
                shortesNumbers = number;
            }
        }
        System.out.println("en qisa reqemli ede = " + shortesNumbers);
    }


}
