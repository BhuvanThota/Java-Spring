

# Collections

## Array List

- Ordered by index

```java

List<Integer> nums = new ArrayList<>(); 

nums.add(1);
nums.add(2);
nums.add(3);
nums.add(4);
nums.add(5);

System.out.println(nums[0]);

```

____________________________

## Sets

- HashSets are normally
    - Unordered 
    - Unsorted

### HashSet
```java
Set<Integer> nums = new HashSet<>(); 

nums.add(70);
nums.add(96);
nums.add(30);
nums.add(18);
nums.add(10);
nums.add(10);
nums.add(10);

System.out.println(nums);

// Output - [96, 18, 70, 10, 30]
```

### TreeSet

-To get a sorted set list

```java
Set<Integer> nums = new TreeSet<>(); 

nums.add(70);
nums.add(96);
nums.add(30);
nums.add(18);
nums.add(10);
nums.add(10);
nums.add(10);

System.out.println(nums);

// Output - [10, 18, 30, 70, 96]
```

