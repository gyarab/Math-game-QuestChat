package task;

import java.util.Random;

/**
 *
 * @author katja
 * 
 * Implementation of a class with a solution of the cubic equation
 */
class SolutionP3 extends Solution{
    private int[] solution = {0,0,0};
    @Override
    public int[] getSolution() {
        return solution;
    }

    public SolutionP3(int p, int q, int r) {
        solution[0] = p;
        solution[1] = q;
        solution[2] = r;
    }
}

/*

cubic equation generation

*/
public class TaskP3 extends Task {

    
    @Override
    public Solution generate() {
        int n, p, q, r;
        n = nextInt(5)*sign();
        p = nextInt(100)*sign();
        q = nextInt(100)*sign();
        r = nextInt(100)*sign();
        
        int b = -(p+q+r)*n;
        int c = (p*q+q*r+p*r)*n;
        int d = -(p*q*r)*n;
        
        if(b==0 || c==0) return generate();
        
        String s = String.format("%dx^3%+dx^2%+dx%+d=0", n, b, c, d);
        Solution sol = new SolutionP3(p, q, r);
        sol.setEquation(s);
/*        
        int x = p;
        System.out.println(s+", "+(n*x*x*x + b*x*x + c*x + d));
        x = q;
        System.out.println(s+", "+(n*x*x*x + b*x*x + c*x + d));
        x = r;
        System.out.println(s+", "+(n*x*x*x + b*x*x + c*x + d));
*/        
        return sol;
    }
    
    public static void main(String[] args) {
        
        TaskP3 t = new TaskP3();
        
        Solution so = t.generate();
        System.out.println(so);
    }

}
