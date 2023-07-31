public class Account {
    private String id;
    private String name;
    private int balance=0;

    Account(String id,String name){
        this.id = id;
        this.name = name;
    }
    Account(String id,String name,int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        if(balance - amount <0 ){
            System.out.println("you have not much money to use credit");
            return balance;
        }
        balance-=amount;
        return balance;
    }
    public int debit(int amount){
        balance+=amount;
        return balance;
    }
    public int transferTo(Account a1, int amount){
        int balance = amount;
        if(this.balance - balance<0){
            System.out.println("You cant transfer because you dont have much money");
            return a1.balance;
        }else{
        this.balance -= amount;
        a1.balance+=balance;
        return  a1.balance;}
    }
    public String toString(){
        return "name : "+name +", id "+id+", balance : "+balance;
    }
}
