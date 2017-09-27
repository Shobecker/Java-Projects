import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elias
 */
public class PromissoryNote {
    private HashMap<String, Double> loanAmount;
    
    public PromissoryNote() {
        this.loanAmount = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.loanAmount.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
          if (loanAmount.containsKey(whose)) {
              double loan = loanAmount.get(whose);
              return loan;
          }
          return 0;
    }
}
