public class Main {
    public static void main(String[] args) {
        CardAccount cardAccount = new CardAccount();
        cardAccount.put(100);
        cardAccount.take(10);
        System.out.println(cardAccount.getBalance());
    }
}
