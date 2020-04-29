package task;

import java.util.Random;

/**
 *
 * @author katja
 * 
 * basic equation class
 */
abstract public class Task {
    
    Random rnd = new Random();
    
    // equation generation method
    abstract public Solution generate();

    // method for generating random values -1, 1
    protected int sign(){
        return rnd.nextInt(2)*2-1;
    }
    
    // method for generating a natural number in interval [1..val]
    protected int nextInt(int val){
        return rnd.nextInt(val)+1;
    }
}
