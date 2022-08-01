import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
class LessBalanceException extends Exception
{
    LessBalanceException(double amt)
    {
        System.out.print("Withdrawing"+amt+"is invalid");
    }
}
class User{
    String name;
    User(String name)
    {
        this.name=name;
    }
    class Account{
        int acc_no;
        Double Balance;
        Account(int acc_no, Double Balance)
        {
            this. acc_no=acc_no;
            this.Balance=Balance;
        }

    }
    Account [] a=new Account[2];
    void deposit(Double amount, int acc_no)
    {
        int found=0,k=-1;
        for(int i=0;i<2;i++)
        if(a[i].acc_no==acc_no)
        {
            a[i].Balance+=amount;
            found=1;
            k=i;
            break;
        }
        if(found==1)
        {
            System.out.println("Balance updated");
            display(a[k].acc_no);
        }
        else
        System.out.println("Account number does not exit");
    }
    void withdrawal(Double amount, int acc_no)throws LessBalanceException
    {
        int k=-1;int found=0;
        for(int i=0;i<2;i++)
        if(a[i].acc_no==acc_no)
        {
            k=i;
            found=1;
            break;

        }
        if(found==1)
        {
            if(a[k].Balance<500)||(a[k].Balance<amount))
            throw new LessBalanceException(amount);
            else 
            {
                a[k].Balance-=amount;
                display(a[k].acc_no);
            }
        
            
        }
        else
        System.out.println("Account number does not exist");
    }
    void create_account()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            System.out.println("Enter account number");
            int acc_no=sc.nextInt();
            System.out.println("Enter balance");
            Double bal=sc.nextDouble();
            a[i]=new Account(acc_no,bal);
        }
    }
    void display(int acc_no)
    {
        int k=-1,found=0;
        for(int i=0;i<2;i++)
        if(a[i].acc_no==acc_no)
        {
            k=i;
            found=1;
            break;
        }
        if(found==1)
        {
            System.out.println("--------------Account Details--------");
            System.out.println(name+"\t"+a[k].acc_no+"\t"+a[k].Balance);
            System.out.println("----------------------");
            
        }
    }
}


public class Bank {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Create account with minimum balance 500");
        System.out.println("Enter owner name");
        String name=sc.next();
        int acc_no;
        User u=new User(name);
        u.create_account();
        System.out.println("Account created successfully");
        Boolean opt=true;
        while(opt)
        {
            System.out.println("-----------------");
            System.out.println("1.balance enquiry 2. deposite 3.withdrawal");
            System.out.println("------------------");
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("your account detail");
                System.out.println("enter account number");
                acc_no=sc.nextInt();
                u.display(acc_no);
                break;
                case 2:System.out.println("enter account number");
                acc_no=sc.nextInt();
                System.out.println("enter amount to be deposit");
                Double amt=sc.nextDouble();
                u.deposit(amount, acc_no);
                break;
            }
        }
    }
    
}
