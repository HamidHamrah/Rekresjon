package RekresjonOppgaver;

import javax.swing.*;
import java.awt.*;

public class Oppgave2 {
    public static void main(String[] args) {
        long n=Long.parseLong(JOptionPane.showInputDialog("Write a nummer"));
        System.out.println(factorial(n));
    }
    public static long factorial(long n){
        long prod=1;
        for(int i=2; i<=n; i++){
            prod*=i;
        }
        return prod;
    }
}
