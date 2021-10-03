import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

//1. Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random randMachine = new Random();
        for(int i = 1; i < 11; i++){
            array.add(randMachine.nextInt(20));
        };
        return array;
    }

//2. Write a method that will:
        //a. Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
        //b. Generate a random index between 0-25, and use it to pull a random letter out of the array.
        //c. Return the random letter.

    public String randomLetter() {
        Random randMachine = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
            return alphabet[randMachine.nextInt(26)];
        }

//3. Write a method that uses the previous method to create a random string of eight characters, and return that string.

    public String genPassword(){
        String pw = "";

        for(int i = 0; i < 8; i++) {
            pw = pw + randomLetter();
        }
        return pw;
    }

//4. Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.

    public ArrayList<String> newPassword(int length) {
        ArrayList<String> newPassword = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            newPassword.add(genPassword());
        }
        return newPassword;
    }

}