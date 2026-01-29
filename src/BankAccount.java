public class BankAccount {
    String ownerName;
    double balance;

    public BankAccount (String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String depoSit (double amount){
        balance += amount;
        return "Пополнение счета: " + balance;
    }

    public String withDraw (double amount){
        balance -= amount;
        return "Снятие средств: " +amount;
    }

    public String printBalance (){
        return "Текущего баланс: " + balance;

    }
}
