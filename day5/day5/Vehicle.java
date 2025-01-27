
class bankAccount {
    int balance = 0;
    int accountNumber;
    String accountHolder;

    public int deposit(int x) {
        balance = balance + x;
        return balance;
    }

    public int withdraw(int y)
    {

        balance =balance -y;
        return balance;
    }
    public int checkBalnce(){
        return balance;
    }


}
class Main{
    public static void main(String [] args){
        bankAccount Bank = new bankAccount();
        System.out.println(Bank.deposit(5000));
        System.out.println(Bank.withdraw(2000));
        System.out.println(Bank.checkBalnce());
    }
}
