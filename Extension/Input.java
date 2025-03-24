/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extension;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Input {
    public static int intInput(String notification) {
        return Integer.parseInt(input(notification));
    }
    
    public static String input(String notification) {
        System.out.print(notification);
        return new Scanner(System.in).nextLine();
    }
    
}
