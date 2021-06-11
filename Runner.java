package lab14;


import java.io.*;


public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Account a=new Account("Ahmad",20000,710788);
        a.deposite(a,200);
        Account a2=new Account("Ali",200000,101559);
        a2.balance_inquiry(a2);
        Account a3=new Account("A",10000,1212);
        a3.withdraw(a3,200);
        Account a4=new Account("b",30000,123413);
        a4.deposite(a,200);
        Account a5=new Account("c",50000,141234);
        a.transfer(a5,200);
        Account a6=new Account("d",9000,1157534);
        a6.deposite(a6,200);
        Account a7=new Account("v",80000,1254231);
        a7.withdraw(a7,200);
        Account a8=new Account("bd",25511,1543123);
        a8.deposite(a8,200);
        Account a9=new Account("dsss",98000,109091);
        a9.withdraw(a9,200);
        Account a10=new Account("Ahmad",2000,710788);
        a10.transfer(a10,200);
        FileOutputStream outfile=new FileOutputStream("AHMAD.txt");
        ObjectOutputStream out=new ObjectOutputStream(outfile);
        out.writeObject(a);
        out.writeObject(a2);
        out.writeObject(a3);
        out.writeObject(a4);
        out.writeObject(a5);
        out.writeObject(a6);
        out.writeObject(a7);
        out.writeObject(a8);
        out.writeObject(a9);
        out.writeObject(a10);
        outfile.close();
        out.close();


        ObjectInputStream in = new ObjectInputStream(new FileInputStream("AHMAD.txt"));

        Account a11=(Account)in.readObject();
        Account a12=(Account)in.readObject();
        Account a13=(Account)in.readObject();
        Account a14=(Account)in.readObject();
        Account a15=(Account)in.readObject();
        Account a16=(Account)in.readObject();
        Account a17=(Account)in.readObject();
        Account a18=(Account)in.readObject();
        Account a19=(Account)in.readObject();
        Account a20=(Account)in.readObject();
        in.close();






    }
}
