import java.util.Scanner;

public class matriz3x3 {
    public int[][]data;
    public int filas;
    public int columnas;

    public matriz3x3() {
        filas = 3;
        columnas = 3;
        data = new int [filas][columnas];
    }
    public void set (){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<filas; i++){
            for (int j = 0; j < columnas; j++){
                System.out.println("data ["+ i + "][" + j + "]: ");
                data [i][j] = sc.nextInt();
            }
        }
    }
    public void get(){
        System.out.println("\nMatriz 3x3:");
        for(int i = 0; i<filas; i++){
            for (int j = 0; j<columnas; j++){
                System.out.println(data[i][j] + " ");    
            }
            System.out.println();
        }
    }
        public static void main (String[] args){
            matriz3x3 m = new matriz3x3();
            m.set();
            m.get();
    
    }
}
