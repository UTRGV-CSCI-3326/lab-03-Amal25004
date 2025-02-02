public class BankAccount
{
    public static void main (String[] args)
    {
        double balance = 2175.37;
        System.out.println("Bob's balance is: " + balance);

        balance -= 302.50;
        System.out.println("Bob's new balance is: " + balance);

        balance -= 50.03;
        System.out.println("Bob's new balance is: " + balance);

        balance /= 2;
        balance += 20;
        System.out.println("Bob's new balance is: " + balance);

        balance -= 1;
        System.out.println("Bob's new balance is: " + balance);

        balance *= 2;
        System.out.println("Bob's new balance is: " + balance);

        balance += 1;
        System.out.println("Bob's new balance is: " + balance);
    }
}