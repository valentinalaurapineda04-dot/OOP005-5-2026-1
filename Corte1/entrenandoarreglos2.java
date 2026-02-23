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

    public static void main(String[] args) {
        entrenandoarreglos2 ob1 = new entrenandoarreglos2(5);
        ob1.llenar();
        ob1.print("arreglo");
    }    
}
