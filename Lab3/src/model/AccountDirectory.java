/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Account;

/**
 *
 * @author anshikakhandelwal
 */
public class AccountDirectory {
private ArrayList<Account> accountList;

public AccountDirectory(){
    this.accountList = new ArrayList<Account>();
}

    public ArrayList<Account> getAccountlist() {
        return accountList;
    }

    public void setAccountlist(ArrayList<Account> accountlist) {
        this.accountList = accountlist;
    }
    
   public Account addAccount(){
      Account account =new Account();
      accountList.add(account);
      return account;
   }
   public void deleteAcccount(Account account){
       accountList.remove(account);
   }
   public Account serachAccount(String accountNumber){
       for(Account account:accountList){
           if(account.getAccountNumber().equals(accountNumber)){
               return account;
       }
   }
       return null;
   }
  
}
