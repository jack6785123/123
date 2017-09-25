import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int liter = scn.nextInt();
        float gallon= (float)0.26418;
        System.out.println(Math.round(liter*gallon*10)/10f);


    }
}
