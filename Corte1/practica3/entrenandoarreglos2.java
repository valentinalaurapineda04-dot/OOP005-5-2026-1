/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenandoarreglos;

/**
 *
 * @author Estudiantes
 */
import java.util.Scanner;
public class entrenandoarreglos2 {
    public int[] data;
    public int n;

    public entrenandoarreglos2(int n) {
        this.n = n;
        this.data = new int[n];
    }

    public void llenar() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("elemento " + i + ": ");
            data[i] = sc.nextInt();
        }
    }

    public void print(String name) {
        System.out.print(name + " = [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i]);
            if (i < n - 1)
                System.out.print(" , ");
        }
        System.out.println(" ] ");
    }
    public int sum(){
        int s=0;
        for (int i=0; i<n; i++)s += data[i];
        return s;
    }
    public double mean(){
        if (n==0)return 0.0;
        return (double)sum()/(double)n;
    }
    public int max (){
        int m = data [0];
        for (int i=1; i<n; i++){
            if (data[i] > m) m = data [i];
        }
        return m;
    }
    public int min (){
        int m = data [0];
        for (int i=1; i<n; i++){
            if (data[i] < m) m = data [i];
        }
        return m;
    }
    public static void main(String[] args) {
        entrenandoarreglos2 ob1 = new entrenandoarreglos2(5);
        ob1.llenar();
        ob1.print("arreglo");

        System.out.println("la suma de la lista es "+ob1.sum());
        System.out.println("el promedio de la lista es "+ob1.mean());
        System.out.println("el valor maximo de la lista es "+ob1.max());
        System.out.println("el valor minimo de la lista es "+ob1.min()); 
    }    
}