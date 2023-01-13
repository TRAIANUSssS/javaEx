import java.util.Arrays;
import java.util.List;

public class Exam {
    public static void main(String[] args) {
        //System.out.println(minLen("keky", "lol", "yyyyy"));
        //System.out.println(diagonalMultiply(new  int[][] {{1,2,3},{4,5,6},{7,8,9}}));
//        System.out.println(minArray(new int[] {1,2,3,-100}));
//        simpleDigits(15);
//        System.out.println(changeWords("aboba eat amogus"));
//        System.out.println(sayHelloBye("Kolay", 0));
//        System.out.println(sayHelloBye("Kolay", 1));
//        System.out.println(dublicates("Hello World!"));
//        System.out.println(histogram(new int[] {1,3,4}, "#"));
//        System.out.println(primor(1));
//        System.out.println(primor(2));
//        System.out.println(primor(8));
//        System.out.println(separater("helloWorld"));
//        System.out.println(separater("wouldUWantSomeCoffe?"));
//        System.out.println(pifagor(3,4,5));
//        System.out.println(pifagor(13,12,5));
//        System.out.println(pifagor(1,2,3));
        System.out.println(littleBig(4));
        System.out.println(littleBig(5));
        System.out.println(littleBig(28));
        System.out.println();
    }

    public static String minLen(String s1, String s2, String s3){
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        if (len1 <= len2 && len1 <= len3) return s1;
        if (len2 <= len1 && len2 <= len3) return s2;
        return  s3;
    }

    public static int diagonalMultiply(int[][] matrix) {
        int sum = 1;

        for(int i = 0; i < matrix[0].length; i++){
            sum *= matrix[i][i];
        }
        return sum;
    }

    public static int minArray(int[] arr){
        int minimum = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if (minimum > arr[i]){
                    minimum = arr[i];
            }
        }
        return minimum;
    }

    public static void simpleDigits(int num){
        for(int i = 2; i < num; i++){
            boolean flag = true;
            for(int j = 2; j< i; j++){
                if (i%j==0){
                    flag = false;
                    break;
                }
            if(flag) System.out.println(i);
            }
        }
    }

    public static String changeWords(String line){
        String[] splittedLine = line.split(" ");
        String tmp = splittedLine[0];
        splittedLine[0] = splittedLine[splittedLine.length-1];
        splittedLine[splittedLine.length-1] = tmp;
        return String.join(" ", splittedLine);
    }

    public static String sayHelloBye(String name, int num){
        if(num == 0) return "Hello " + name;
        return "Bye " + name;
    }

    public static int dublicates(String line){
        String tmpLine;
        char sumb;
        int count = 0;

        String newLine = line;
        for(int i = 0; i < line.length()-1; i++){
            sumb = line.charAt(i);
            if(newLine.length()>1){
                newLine = newLine.substring(1);
                System.out.println(newLine);
                tmpLine = newLine;
                for(int j = 0; j<newLine.length();j++){
                    if(sumb == newLine.charAt(j)){
                        count++;

                        tmpLine = tmpLine.substring(0,j) + tmpLine.substring(j+1);

                    }
                }
                newLine = tmpLine;
            }
            else break;
        }
        return count;
    }

    public static String histogram(int[] array, String symb){
        String output = "";
        for(int i = 0; i<array.length;i++){
            for(int j = 0; j<array[i];j++){
                output += symb;
                if(j == array[i]-1){
                    output+="\n";
                }
            }

        }
        return output;
    }

    public static int primor(int num){
        int sum = 1;
        int count = 0;

        int i = 2;
        while(count!=num){
            boolean flag = true;
            for(int j = 2; j<i;j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
                sum*=i;
            }
            i++;
        }
        return sum;
    }

    public static String separater(String line){
        String output = "";

        for(int i = 0; i<line.length(); i++){
            if(Character.isUpperCase(line.charAt(i))){
                output+=' ';
            }
            output+=Character.toLowerCase(line.charAt(i));
        }
        return output;
    }

    public static boolean pifagor(int a, int b, int c){
        int min = Math.min(a,Math.min(c,b));
        int max = Math.max(a,Math.max(c,b));
        int avg = a+b+c-max-min;

        return (min*min+avg*avg)==(max*max);
    }

    public static int littleBig(int num){
        int nechet = 5;
        int chet = 100;

        if(num == 1)return nechet;
        if(num == 2)return chet;

        for(int i = 3; i<=num; i++){
            if(i%2==0){
                chet *= 2;
                if(i == num) return chet;
            }
            else {
                nechet++;
                if(i == num) return nechet;
            }

        }
        return 0;
    }

}


