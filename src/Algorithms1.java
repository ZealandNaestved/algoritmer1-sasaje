import java.util.Random;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 27/10/2020
 */

public class Algorithms1 {

    Random rand = new Random();

    // TODO 1 - Gennemse Data klassen, og skriv gode kommentarer til det

    // TODO 2 - Skriv en randomBoyName() metode i Algorithms1, som returnerer et tilfældigt drengenavn fra Data klassens randomDrengeNavne property OBS: randomDrengeNavne skal forblive private!

    public String randomBoyName() {
        String[] names;
        Data data = new Data();
        names = data.getRandomDrengeNavne();
        int arrayLength = names.length;
        int randomInt = rand.nextInt(arrayLength);
        String randomName = names[randomInt];
        return randomName;
    }

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et tilfældigt nummer som er altid det samme (til test)

        // See solution in Algorithms1Test.java

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et tilfældigt pigenavn fra Data klassen

    public String randomGirlsName(){
        String[] names;
        Data data = new Data();
        names = data.getRandomPigeNavne();
        int arrayLength = names.length;
        int randomInt = rand.nextInt(arrayLength);
        String randomName= names[randomInt];
        return randomName;
    }

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt array som indeholder både piger og drenge, og returnerer det
    public String randomName(){
        String[] names;
        Data data = new Data();
        names = data.mergeArrays();
        int arrayLength = names.length;
        int randomInt = rand.nextInt(arrayLength);
        String randomName = names[randomInt];
        return randomName;
    }

    // TODO 6 - Skriv en test til randomName() metoden
        //See DataTest.java

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt i randomNumbers() i Data)
        //See main and in Data.java

    // TODO 8 - Skriv en plat eller krone generator metode (plat er boolean true og krone er boolean false)
        //See method in Data.java

    // TODO 9 - Lav en ny array i Data klassen, som skal indeholde navne på medlemmer af din gruppe. Lav metoden whoShall() i Algorithms1, som skal returnere et navn fra gruppen

    private String whoShall(){
        String[] names;
        Data data = new Data();
        names = data.getStudieGruppe();
        int arrayLength = names.length;
        int randomInt = rand.nextInt(arrayLength);
        String whoShall= names[randomInt];
        return whoShall;
    }

    // TODO 10 - Lav en method override til whoShall() således, at den kan tage imod "int n". Nu skal metoden returnere et array med n elementer, som skal være et tilfældigt navn hver

    private static String[] whoShall(int n){
        Random rand = new Random();
        String[] arrayOfName;
        Data data = new Data();
        arrayOfName = data.getStudieGruppe();

        String[] newArrayOfName =  new String[n];

        System.out.println("New array with random elements from array studieGruppe");
        for(int  i = 0; i < n; i++) {
            // Generates a random value between 0 (inclusive) and the size of array (n inclusive).
            int randomPosition = rand.nextInt(arrayOfName.length);
            newArrayOfName[i] = arrayOfName[randomPosition];
            System.out.println(" - index[" + i + "]" + ": " + newArrayOfName[i]);
        }
        return newArrayOfName;
    }


    public static void main(String[] args) {
        exampleOfPredictableRandomNumber();
        Algorithms1 a1 = new Algorithms1();
        System.out.println("Et random navn er " + a1.randomBoyName());

        //Assignment 5
        Algorithms1 a5 = new Algorithms1();
        System.out.println("Random name from the merged array is: " + a5.randomName());

        //Assignment 7
        Data data7 = new Data();
        System.out.println("Random letter: " + data7.getRandomLetter());

        //Assignment 8
        Random random8 = new Random();
        Data data8 = new Data();
        System.out.println("Head/tail generator result: " + Data.getHeadTails());

        //Assignment 9
        Algorithms1 a9 = new Algorithms1();
        System.out.println("A random member of the study group: " + a9.whoShall());

        System.out.println("");

        //Assignment 10
        whoShall(10);
    }

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(7); // Hvis vi angiver et seed som et long number, vil random klassen altid generere det samme tal, i det her tilfælde 21
        System.out.print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }
}
