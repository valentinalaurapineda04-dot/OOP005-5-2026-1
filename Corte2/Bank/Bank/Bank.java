package Bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;
  private CheckingAccount accountThree;
  private CheckingAccount accountFour;
  private CheckingAccount accountFive;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
    accountThree = new CheckingAccount("Poseidon", 300, "3");
    accountFour = new CheckingAccount("Ares", 400, "4");
    accountFive = new CheckingAccount("Atenea", 500, "5");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.setBalance(5000);
    System.out.println(bankOfGods.accountOne.getBalance());
    System.out.println(bankOfGods.accountOne.getMonthlyInterenst());
  }
}
