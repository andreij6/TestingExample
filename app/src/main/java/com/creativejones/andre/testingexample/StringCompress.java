package com.creativejones.andre.testingexample;

public class StringCompress {

    public static String compress(String input){

        char[] array = input.toCharArray();


        char[] previous = null;

        StringBuilder sb = new StringBuilder();
        StringBuilder resultSB = new StringBuilder();
        int count = 1;
        int counter =0;

        for (char letter : array) {
            counter++;

            if(previous == null){ //first
                sb.append(String.format("%s%d", letter, count));
                previous = new char[]{ letter };

            } else if(previous[0] == letter){ //previous same
                count++;
                sb = new StringBuilder();
                sb.append(String.format("%s%d", letter, count));

                if(counter == array.length){
                    resultSB.append(sb.toString());
                }

            } else { //different
                resultSB.append(sb.toString());
                sb = new StringBuilder();
                count = 1;
                sb.append(String.format("%s%d", letter, count));
            }

            previous[0] = letter;


        }

        String result = resultSB.toString();

        if(result.length() > input.length()){
            result = input;
        }

        return result;

    }
}
