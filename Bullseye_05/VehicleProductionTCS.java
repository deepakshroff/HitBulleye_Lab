package Bullseye_05;

import java.util.*;

public class VehicleProductionTCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int v = sc.nextInt(); // Total vehicles
        int w = sc.nextInt(); // Total wheels
        sc.close();
       
        if (w < 2 || w % 2 != 0 || v >= w) {
            System.out.println("INVALID INPUT");
            return;
        }
        
       
        int fw = (w - (2 * v)) / 2;
        int tw = v - fw;
        
       
        if (tw >= 0 && fw >= 0) {
            System.out.println("TW = " + tw + " FW = " + fw);
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}

