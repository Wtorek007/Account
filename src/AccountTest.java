import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Marcin Wtorkiewicz",50.00);
        Account account2 = new Account("Wacek Wtorkiewicz",-7.53);

        System.out.printf("%s - stan konta: %.2f zł%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta: %.2f zł%n%n",
                account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Wpisz kwotę do wpłacenia na konto account1: ");
        double depositAmount = input.nextDouble();

        System.out.printf("%nDodawanie %.2f do stanu konta account1%n%n",
                depositAmount);
        account1.deposit(depositAmount);

        System.out.printf("%s - stan konta: %.2f zł%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta: %.2f zł%n%n",
                account2.getName(), account2.getBalance());

        System.out.print("Wpisz kwotę do wpłacenia account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nDodawanie %.2f do stanu konta account2%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        System.out.printf("%s - stan konta: %.2f zł%n",
                account1.getName(), account1.getBalance());
        System.out.printf("%s - stan konta: %.2f zł%n",
                account2.getName(), account2.getBalance());
    }
}
