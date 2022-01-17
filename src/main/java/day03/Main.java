package day03;

public class Main {
    public static void main(String[] args) {
        Encryption encryption = new Caesar(13);

        System.out.println(encryption.encrypt("APPLE"));;
    }
}