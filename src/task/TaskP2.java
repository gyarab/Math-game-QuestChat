package task;

import java.util.Random;

/**
 *
 * @author katja
 * 
 * Class implementation with quadratic equation solution
 */
class SolutionP2 extends Solution{
    private int[] solution = {0,0};
    @Override
    public int[] getSolution() {
        return solution;
    }

    public SolutionP2(int p, int q) {
        solution[0] = p;
        solution[1] = q;
    }
}

/*

quadratic equation generation

*/
public class TaskP2 extends Task {


    // quadratic equation generation
    @Override
    public Solution generate() {
        int n, p, q;
        n = nextInt(5)*sign();
        p = nextInt(100)*sign();
        q = nextInt(100)*sign();
        
        int b = -(n*(q+p));
        
        if(b==0) return generate();
        
        String s = String.format("%dx^2%+dx%+d=0", n, b, (n*p*q));
        Solution sol = new SolutionP2(p, q);
        sol.setEquation(s);
        
        //int x = p;
        //System.out.println(s+", "+(n*x*x-n*(q+p)*x+n*p*q));
        
        return sol;
    }
    
    public static void main(String[] args) {
        TaskP2 t = new TaskP2();
        
        Solution so = t.generate();
        System.out.println(so);
    }

}
