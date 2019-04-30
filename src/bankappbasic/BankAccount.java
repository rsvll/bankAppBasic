/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankappbasic;

/**
 *
 * @author svlln
 */
//==============================================================================
//                          Start Class BankAccount
//==============================================================================

public class BankAccount {
    
    private double balance;                     // acount balances
    
    public BankAccount(double openingBalance){ //constructors
        balance = openingBalance;
    }
    
    public void deposit(double amount){        // makes deposit 
        balance = balance + amount;
    }
    
    public void withdrawl(double amount){       // makes withdrawl
        balance = balance - amount;
    }
    
    public void display(){                      // displays balance
        System.out.println("Balance: " + balance);
    }
    
    
} 
//==============================================================================
//                          ends Class BankAccount
//==============================================================================
