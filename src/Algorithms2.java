/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms2 {

    // TODO 1 Skriv en metode her i denne klasse, som kan finde et tal i Data klassens randomNumbers1000 felt med LINEAR SEARCH

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(key==array[i]){
                return i;
            }
        } return -1;
    }

    public static void main(String[] args) {
        //Assignment 1
        Data data = new Data();
        int result = linearSearch(data.getRandomNumbers1000(), 25);

        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index["+ result + "]");

        //Assignment 2
        Data data2 = new Data();
        String search = lineSearchString(data.getRandomDrengeNavne(), "Kamel");
        System.out.println(search);
    }

    // TODO 2 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med LINEAR SEARCH
        public static String lineSearchString(String[] array, String key){
            for (int i = 0; i < array.length; i++) {
                if(key.equals(array[i])){
                    return "The number was found at index[" + i + "]";
                }
            } return "The name wasn't in the array";
        }



    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomNumbers1000

    // TODO 3 Skriv en metode her i denne klasse, som kan returnere et sorteret array fra randomDrengeNavne

    // TODO 5 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomNumbers1000 felt med BINARY SEARCH

    // TODO 6 Skriv en metode her i denne klasse, som kan finde et navn i Data klassens randomDrengeNavne felt med BINARY SEARCH


}
