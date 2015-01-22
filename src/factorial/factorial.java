package factorial;
import java.util.Scanner;

public class factorial {
 
    
    public static void main(String[] args) {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        while(sc.hasNext()){
        if(sc.hasNextInt()){
                n=sc.nextInt();
                int resultado =1;
                for(int i=1; i<= n; i++)
               {        resultado *=i;
               }
            
                System.out.println(resultado);
        
        }
        else{
        
            System.out.println("Incorrecto, Ingresaste una letra");
            break;
            
        
        }
       
    
        }
 
    }
}
 