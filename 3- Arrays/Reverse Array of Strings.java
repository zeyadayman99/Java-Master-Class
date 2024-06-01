import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create a for loop which goes through each string in our array
        // make each word uppercase
        // print our resulting array
        String[] words = new String[4];
        words[0] = "hello";
        words[1] = "world";
        words[2] = "zeyad";
        words[3] = "ayman";
        System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length; i++)
            words[i] = words[i].toUpperCase();
        System.out.println(Arrays.toString(words));

        //Write a program that reverses this array of Strings
        for(int i = 0, j = words.length - 1; i < j; i++, j--){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(words));
    }
    }