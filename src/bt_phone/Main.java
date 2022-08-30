package bt_phone;

import java.util.Scanner;

public class Main {
    private static PhoneNumber phoneNumber = new PhoneNumber();

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so dien thoai: ");
        String phoneNumber = input.next();
        boolean isvalid = Main.phoneNumber.validate(phoneNumber);
        System.out.println("Phone is " + phoneNumber +" is valid: "+ isvalid);
    }
}
