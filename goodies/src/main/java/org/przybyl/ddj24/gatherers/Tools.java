

package org.przybyl.ddj24.gatherers;

import java.time.Duration;

public interface Tools {

    public static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static int slowIoDouble(int operand) {
        try {
            // DEMO ONLY PLZ!!!!111eleven
            Thread.sleep(Duration.ofSeconds(1));
//            System.out.println("Doubled: "+ operand);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return operand * 2;
    }
}
