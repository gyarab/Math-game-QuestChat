package task;

import java.util.Random;

/**
 *
 * @author katja
 * 
 * class for selecting a random task generator
 */
public class TaskGen {
    private Task[] generators = {new TaskP2(), new TaskP3()};
    private Random rnd = new Random();
    
    // method for selecting a task generator
    public Task getGenerator(){
        int pos = rnd.nextInt(generators.length);
        return generators[pos];
    }
}
