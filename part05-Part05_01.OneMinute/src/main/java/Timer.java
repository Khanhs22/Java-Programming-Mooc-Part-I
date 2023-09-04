/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkhanh
 */
public class Timer {
    
    private ClockHand second;
    private ClockHand hundredthOfASecond;
    
    public Timer() {
        
        this.second = new ClockHand(60);
        this.hundredthOfASecond = new ClockHand(100);
    }
    
    public void advance() {
        
        this.hundredthOfASecond.advance();
        
        if (this.hundredthOfASecond.value() == 0) {
            
            this.second.advance();
        }
    }
    
    public String toString() {
        return this.second + ":" + this.hundredthOfASecond;
    }
}
