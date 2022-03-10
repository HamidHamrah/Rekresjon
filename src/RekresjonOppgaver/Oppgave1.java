package RekresjonOppgaver;


import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args) {
        long n=Long.parseLong(JOptionPane.showInputDialog("Write a number"));
        System.out.println(fakultet(n));
    }
    public static long fakultet(long n){
        if (n==0){
            return 1;
        }
        else {
            return n*fakultet(n-1);
        }
    }
}

