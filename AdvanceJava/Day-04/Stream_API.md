

# Stream API


## forEach method

- Only use for modifying the variable or printing.


```java
nums.forEach(n -> System.out.println(n));
```
________________



## Stream

-  It is used to simplify List operations in Java

- Like javascript to use filter, map, reduce or so one features n list objects we use the stream

- One major takeaway is stream objects are single time usable objects

- When we do operations on stream objects they return a stream as well.


```java
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

```

_________________

## Parallel Stream

- To use filter or map kind of methods using multi-thread instead of Single thread

- Parallel Stream is useful generally on large data (>10^4)


```java

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
// Output - Stream total: 982536 in Time(millisecs): 7


System.out.println();
// Parallel Stream
long startPTime = System.currentTimeMillis();
int sum1 = nums.parallelStream()
.mapToInt(n -> n*2)
.sum();
long endPTime = System.currentTimeMillis();

System.out.println("Parallel Stream total: "+ sum1 +" in Time(millisecs): " + (endPTime-startPTime));
// Output - Parallel Stream total: 982536 in Time(millisecs): 3

```



