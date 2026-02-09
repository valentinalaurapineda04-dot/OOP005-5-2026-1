
package calculadora;


public class Calculadora {
    public int x1,x2;
    
    //constructor
    public Calculadora (int a, int b){
        x1=a;
        x2=b;
    }
        
    public int add(){
       return x1+x2;
    }
    public int subs(){
       return x1-x2;
    }
    public int mul(){
       return x1*x2;
    }
    public int div(){
       return x1/x2;
    }
        public static void main(String[] args) {
        // TODO code application logic here
        Calculadora m = new Calculadora(34,43);
        System.out.println("la division es: "+m.add());
        System.out.println(m.subs());
        System.out.println(m.mul());
        System.out.println(m.div());
        
    }
   }
   
   
