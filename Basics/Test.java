package Basics;

import java.util.*;


public class Test {
    

    public static void main(String[] args){
        // Compare logic based on the last digit
        List<Integer> nums = new ArrayList<>();
        
        Random ran = new Random();

        for(int i = 0; i < 10000; i++){
            nums.add(ran.nextInt(100));
        }

        // Stream
        long startSTime = System.currentTimeMillis();
        int sum = nums.stream()
        .mapToInt(n -> n*2)
        .sum();
        long endSTime = System.currentTimeMillis();

        
        System.out.println("Stream total: "+ sum +" in Time(millisecs): " + (endSTime-startSTime));
        
        System.out.println();
        // Parallel Stream
        long startPTime = System.currentTimeMillis();
        int sum1 = nums.parallelStream()
        .mapToInt(n -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return n*2;
        })
        .sum();
        long endPTime = System.currentTimeMillis();

        System.out.println("Parallel Stream total: "+ sum1 +" in Time(millisecs): " + (endPTime-startPTime));

    }
}
