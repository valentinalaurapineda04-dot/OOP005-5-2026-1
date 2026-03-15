import java.util.Scanner;
public class matriz3x3SumMul {
    public int[][] data;
    public int filas;
    public int columnas;

    public matriz3x3SumMul() {
        filas = 3;
        columnas = 3;
        data = new int[filas][columnas];
    }

    public void setValues() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("data[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void getValues() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // suma
    public matriz3x3SumMul sumar(matriz3x3SumMul otra) {

        matriz3x3SumMul resultado = new matriz3x3SumMul();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado.data[i][j] = this.data[i][j] + otra.data[i][j];
            }
        }

        return resultado;
    }

    // multiplicacion
    public matriz3x3SumMul multiplicar(matriz3x3SumMul otra) {

        matriz3x3SumMul resultado = new matriz3x3SumMul();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                resultado.data[i][j] =
                        this.data[i][0] * otra.data[0][j] +
                        this.data[i][1] * otra.data[1][j];

            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        matriz3x3SumMul m1 = new matriz3x3SumMul();
        matriz3x3SumMul m2 = new matriz3x3SumMul();

        System.out.println("Ingrese valores de la matriz 1:");
        m1.setValues();

        System.out.println("Ingrese valores de la matriz 2:");
        m2.setValues();

        matriz3x3SumMul suma = m1.sumar(m2);
        matriz3x3SumMul producto = m1.multiplicar(m2);

        System.out.println("\nMatriz 1:");
        m1.getValues();

        System.out.println("\nMatriz 2:");
        m2.getValues();

        System.out.println("\nResultado de la suma:");
        suma.getValues();

        System.out.println("\nResultado de la multiplicacion:");
        producto.getValues();
    }    
}


