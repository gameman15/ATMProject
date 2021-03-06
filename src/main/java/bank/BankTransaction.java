/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
// Generated Apr 21, 2015 10:00:28 PM by Hibernate Tools 3.6.0


import java.math.BigDecimal;
import java.util.Date;

/**
 * Banktransaction generated by hbm2java
 */
public class BankTransaction implements java.io.Serializable  {


     private Integer id;
     private BankAccount bankaccount;
     private BankATM bankatm;
     private Date time;
     private String description;
     private BigDecimal amount;
     private BigDecimal checkNumber;

    public BankTransaction() {
    }

	
    public BankTransaction(Integer id, BankAccount bankaccount, Date time, String description) {
        this.id = id;
        this.bankaccount = bankaccount;
        this.time = time;
        this.description = description;
    }
    public BankTransaction(Integer id, BankAccount bankaccount, BankATM bankatm, Date time, String description, BigDecimal amount) {
       this.id = id;
       this.bankaccount = bankaccount;
       this.bankatm = bankatm;
       this.time = time;
       this.description = description;
       this.amount = amount;
    }
    public BankTransaction(Integer id, BankAccount bankaccount, BankATM bankatm, Date time, String description, BigDecimal amount,BigDecimal checkNumber) {
       this.id = id;
       this.bankaccount = bankaccount;
       this.bankatm = bankatm;
       this.time = time;
       this.description = description;
       this.amount = amount;
       this.checkNumber=checkNumber;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public BankAccount getBankaccount() {
        return this.bankaccount;
    }
    
    public void setBankaccount(BankAccount bankaccount) {
        this.bankaccount = bankaccount;
    }
    public BankATM getBankatm() {
        return this.bankatm;
    }
    
    public void setBankatm(BankATM bankatm) {
        this.bankatm = bankatm;
    }
    public Date getTime() {
        return this.time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the checkNumber
     */
    public BigDecimal getCheckNumber() {
        return checkNumber;
    }

    /**
     * @param checkNumber the checkNumber to set
     */
    public void setCheckNumber(BigDecimal checkNumber) {
        this.checkNumber = checkNumber;
    }




}

