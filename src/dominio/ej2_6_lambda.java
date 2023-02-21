package dominio;
import java.util.stream.Stream;

public class ej2_6_lambda  {
    public static int media(int[]lista){
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).reduce(0,(a,b)->a+b)/lista.length;
    }
    public static int cuadrados(int[]lista){
        return Stream.iterate(0,i->i+1).limit(lista.length).map(i->lista[i]).reduce(0,(a,b)->a+b*b);
    }

    public static double desviacion(int [] lista){
        double media=media(lista);
        double cuadrados=cuadrados(lista);
        return Math.sqrt((cuadrados/lista.length)-(media*media));
    }
}
