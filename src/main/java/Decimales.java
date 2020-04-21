import java.util.Scanner;
import java.text.DecimalFormat;
public class Decimales {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double numero=0;
        
        System.out.print("Introduce numero para Raiz Cuadrada: ");
        numero=sc.nextDouble();
        
        //Tenemos la Clase Math la asignamos a la variable raiz, y le pasamos por parametro la variable numero.
        //En la variable numero es donde tenemos guardado el valor que puso el usuario para obtener la raiz cuadrada
        double raiz = Math.sqrt(numero);
        //Objeto para establecer la cantidad de decimales que tendremos en el resultado, en este caso solo seran 
            //dos decimales
        DecimalFormat ob = new DecimalFormat("#.00");   
        //Presentamos el resultado de la raiz cuadrada, fijando dos decimales unicamente
        //llamamos el objeto creado para darle formato y le pasamos como parametro nuestra variable raiz, para que 
            //presente el resultado
        System.out.println("La raiz cuadrada de "+numero+ " es: "+ob.format(raiz));
    }
}
