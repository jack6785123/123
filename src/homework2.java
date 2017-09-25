import java.util.Scanner;
public class homework2{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int gram = scn.nextInt();
        float  pound = 600;
        System.out.println(Math.round(gram/pound*10)/10f);
    }
}

