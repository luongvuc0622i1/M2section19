package bt_className;

import java.util.Scanner;

public class Main {
    private static ClassNameExample classNameExample = new ClassNameExample();

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten lop: ");
        String className = input.next();
        boolean isvalid = classNameExample.validate(className);
        System.out.println("ClassName is " + className +" is valid: "+ isvalid);
    }
}