

public class MainProgram {

    public static void main(String[] args) {
        // you can create test code here. Call the methods that you'll implement
        // during the course of this exercise
        
        Checker checker = new Checker();
        
        String day = "tue";
        System.out.println("Day of week: " + day);
        System.out.println(checker.isDayOfWeek(day));
        
        String vowel = "oi";
        System.out.println("Vowel: " + vowel);
        System.out.println(checker.allVowels(vowel));
        
        String string1 = "17:23:05";
        System.out.println("Time of day: " + string1);
        System.out.println( checker.timeOfDay(string1) );
        
        
    }
}
