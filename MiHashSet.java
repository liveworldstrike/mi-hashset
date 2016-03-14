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
    private Arrays<int> collection;

    /**
     * Constructor for objects of class MiHashSet
     */
    public MiHashSet()
    {
      collection   = new int[0];
    }
    
    public boolean add(int valor){
        boolean noContiene = true;
        int[] newCollection = new int[collection.length+1];

        for(int i = 0; i < collection.length && noContiene; i++){
            if(collection[i] == valor){
                noContains = false;
            }
            else{
                newCollection[i] = collection[i];
            }
        }
        if(noContiene){
            newCollection[newCollection.length-1] = valor;
            collection = newCollection;
        }
        return noContains;
    }
 
}
