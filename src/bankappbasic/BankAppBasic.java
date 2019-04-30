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
public class BankAppBasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    BankAccount ba1 = new BankAccount(100.00); // CREATES ACCOUNT
    
    System.out.println("Before Transaction, ");
    ba1.display();                             //display balance
    
    ba1.deposit(74.35);                        // MAKES DEPOSIT
    ba1.withdrawl(20.00);                      // MAKES WITHDRAWL
    
    System.out.println("After transactions, ");
    ba1.display();                              // DISPLAY BALANCE
    
    }
    
}
