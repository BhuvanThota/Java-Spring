package Basics;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        
        List<Integer> nums = new ArrayList<>();
                
        nums.add(70);
        nums.add(96);
        nums.add(33);
        nums.add(18);
        nums.add(16);

        System.out.println(nums);

        // To get sum of even numbers after doubling there values 
        List<Integer> resNums = nums.stream()
        .filter( n -> n%2==0)
        .map(n -> n*2)
        .toList();

        System.out.println(resNums);
        // reduce(initial value, (accumulator, current element) -> (operation));
        int total = resNums.stream().reduce(0,(acc,ele) -> acc+ele);

        System.out.println(total);
    }
}
