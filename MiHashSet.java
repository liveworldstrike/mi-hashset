import java.util.Arrays;
/**
 * Write a description of class MiHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private int[]collection;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
        collection = new int[0];
    }

    /**
     * añade el elemento al conjunto si no estaba
     * Devuelve verdadero en caso de que el elemento no estuviera presente en el conjunto
     * falso en caso contrario.
     */
    public boolean add(int valor){
        boolean noContiene = true;
        int[] newCollection = new int[collection.length+1];
        for(int i = 0; i < collection.length && noContiene; i++){
            if(collection[i] == valor){
                noContiene = false;
            }
            else{
                newCollection[i] = collection[i];
            }
        }
        if(noContiene){
            newCollection[newCollection.length-1] = valor;
            collection = newCollection;
        }
        return noContiene;
    }

    /**
     *  vacía el conjunto
     */
    public void clear(){
        collection = new int[0];
    }
    
}
