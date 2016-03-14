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

    /**
     *  devuelve verdadero si el conjunto contiene el elemento
     *  falso en caso contrario.
     */
    public boolean contains(int elemento)
    {
        boolean contiene = false;
        for(int i = 0; i < collection.length && !contiene; i++){
            if(collection[i] == elemento){
                contiene = true;
            }
        }
        return contiene;
    }

    /**
     * devuelve verdadero si el conjunto no contiene elementos.
     */
    public boolean isEmpty()
    {
        return collection.length == 0;
    }

    /**
     * devuelve el número de elementos del conjunto.
     */
    public int size(){
        return collection.length;
    }

    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas y entre corchetes.
     */
    public String toString(){
        String toString = "[";
        for(int i = 0; i < collection.length ; i++){
            if(i == 0){
                toString = toString  + collection[i];

            }
            else{ 
                toString = toString + "," + collection[i];	
            }
        }
        toString = toString + "]";
        return toString;
    }
}
