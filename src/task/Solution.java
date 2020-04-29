package task;

import java.util.Arrays;

/**
 *
 * @author katja
 * 
 * class with equation and solutions
 * 
*/

abstract public class Solution {
    private String equation;
    abstract public int[] getSolution();

    // returns equation
    public String getEquation() {
        return equation;
    }

    // sets equation
    public void setEquation(String equation) {
        this.equation = equation;
    }
    
    // checks player's solution
    public boolean check(int[] sol){
        int[] s = getSolution();
        int[] control = Arrays.copyOf(s,s.length);
        Arrays.sort(control);
        if(sol==null || sol.length==0 || control.length!=sol.length) return false;
        Arrays.sort(sol);
        for(int i=0; i<control.length; i++){
            if(control[i]!=sol[i]) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Solution{" + "equation=" + equation + ", solution="+Arrays.toString(getSolution())+'}';
    }
    
    
}
