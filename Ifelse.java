package BONUS;


public class Ifelse {

    public static void main(String[] args) {

        String pwString = "Rode rozen ruiken lekker";
        int phraseLength = pwString.length();
        int number;
        int number2;
        int grade;
        int aGrade;
        number = 268;
        number2 = 38;
        grade = 7;
        aGrade = 72;
        phraseLength = pwString.length();

        evenOddChecker(number);
        grader(grade);
        goBig(number, number2);
        positiveNegativeZeroChecker(number2);
        ageGrade(aGrade);
        textLength(phraseLength);

    }

    public static void evenOddChecker(int number) {
        if (number % 2 == 0) {
            System.out.println("this number is even!");
        } else {
            System.out.println("this number is odd!");
        }
    }

    public static void grader(int grade) {

        if (grade >= 1 && grade <= 2) {
            System.out.println("Here is your test result : F");
        } else if (grade >= 3 && grade <= 5) {
            System.out.println("Here is your test result : D");
        } else if (grade >= 6 && grade <= 7) {
            System.out.println("Here is your test result : C");
        } else if (grade >= 8 && grade <= 9) {
            System.out.println("Here is your test result : B");
        } else if (grade == 10) {
            System.out.println("Here is your test result : A");
        } else {
            System.out.println("Please enter a valid number..");
        }
    }

    public static void goBig(int number, int number2) {
        if (number >= number2) {
            System.out.println("number " + number + " is bigger than number " + number2);
        } else {
            System.out.println("number " + number + " is not bigger than number " + number2);
        }

    }

    public static void positiveNegativeZeroChecker(int number2) {
        if (number2 < 0) {
            System.out.println("your number is negative!");
        } else if (number2 == 0) {
            System.out.println("your number is zero!");
        } else if (number2 > 0) {
            System.out.println("your number is positive!");
        } else
            System.out.println("Please enter a valid number..");

    }

    public static void ageGrade(int aGrade) {
        if (aGrade >= 10 && aGrade <= 18) {
            System.out.println("you are a teenager!");
        } else if (aGrade >= 0 && aGrade <= 2) {
            System.out.println("you are a baby!");
        } else if (aGrade >= 18 && aGrade <= 70) {
            System.out.println("you are a adult!");
        } else if (aGrade >= 70 && aGrade <= 130) {
            System.out.println("you are a senior!");
        } else {
            System.out.println("you are a dinosaur!");
        }
    }
    /*textLength methode is stuk : Geeft geen ouput. Ik weet niet zeker of de string
    berekening in main wel goed gaat, en hoe dat hier beneden doorwerkt.*/
    public static void textLength(int phraseLength) {
        if (phraseLength >= 0 && phraseLength <= 10) {
            System.out.println("this is a short password phrase.");
        } else if (phraseLength >= 10 && phraseLength <= 20) {
            System.out.println("this is a medium-long password phrase.");
        } else if (phraseLength >= 30) {
            System.out.println("this is a long password phrase.");
        }
    }

    /*Opdracht 8: Grootste van Drie Getallen
        Schrijf een programma dat de grootste van drie ingevoerde getallen bepaalt.*/

    /*Opdracht 9: Driehoekstype
    Schrijf een methode dat de lengtes van de zijden van een driehoek accepteert en bepaalt of de driehoek gelijkzijdig, gelijkbenig of ongelijkzijdig is.*/

    /*Opdracht 10: Calculator
    Schrijf een eenvoudige rekenmachine-methode die als parameters twee getallen en een operator (+, -, *, /) accepteert en vervolgens het resultaat van de berekening weergeeft. */
}
