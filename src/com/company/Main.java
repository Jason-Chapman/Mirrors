package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;
public class Main {

    public static ArrayList<Integer> nums = new ArrayList();

    public static int maxCalc() {
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] = (nums[i + 1] - 1)) {
                System.out.println(nums[i+1]);
            }
        }
    }
    
    public static void main(String[] args) {
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number (Type '0' to finish list)");
            int number = input.nextInt();

            if (number == 0) {
                maxCalc();
            } else {
                nums.add(number);
                System.out.println("");
                System.out.println("List:");
                for (int j = 0; j < nums.size(); ++j) {
                    System.out.println((String) nums.get(j));
                }
            }
        }
    }
}
