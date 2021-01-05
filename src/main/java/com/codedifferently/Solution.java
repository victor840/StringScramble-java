package com.codedifferently;

import java.util.Arrays;

public class Solution {

    /**
     * String Scramble
     * Have the function StringScramble(str1,str2) take both parameters being passed and return the boolean true if
     * a portion of str1 characters can be rearranged to match str2, otherwise return the string false.
     * For example: if str1 is "rkqodlw" and str2 is "world" the output should return true.
     * Punctuation and symbols will not be entered with the parameters.
     * @param str1
     * @param str2
     * @return
     */
    public Boolean stringScramble(String str1, String str2) {
        // code goes here

        // intialize string variable scramble and set it to an empty string
        // intialize boolean variable scramState and set it to false;
        // intialize char array called arry1
        // intialize another char array called arry2
        // set str1 to char array arry1 using the .toCharArray() method
        // set str2 to char array arry2 using the .toCharArray() method
        // sort both arrays with  Arrays.sort() method
        // write a for loop to traverse arry1
        // write another for loop inside arry1 to traverse arry2
        // if value at arry1[i] is equal to value at arry[j] set scramState to true;
        // else set scramState to false;
        // convert scramState to string with the Boolean.toString(scramState) method
        // set the resulting string from the instruction above to the scramble variable
        // return scramble variable

        String scramble = "";
        boolean scramState = false;
        char[] arry1 = str1.toCharArray();
        char[] arry2 = str2.toCharArray();
        Arrays.sort(arry1);
        Arrays.sort(arry2);

        for (int i = 0; i < arry1.length; i++) {
            for (int j = 0; j < arry2.length; j++) {
                if (arry1[i] == (arry2[j])) {
                    scramState = true;
                }
                else{
                    return scramState;
                }
            }
        }
       // scramble = Boolean.toString(scramState);
        return scramState;
    }
}

