/*  📌 Problem Statement

You are given two linked lists that store integer values.
Your task is to write a method findCommonElements() which returns a new linked list containing the elements that are common to both lists.

If an element appears in both lists, it should be included in the result.

The order of elements in the result should follow their appearance in the first list.

Assume that the input lists may contain duplicates, but the output list should not contain duplicates. 

Input : 
List One = [10, 12, 21, 1, 53]
List Two = [11, 21, 25, 53, 47]

Output : [21, 53]

📌 Solution

We can solve this problem in multiple ways:

Approach 1 (Efficient, using HashSet)

Store elements of listTwo in a HashSet (fast lookups).

Traverse listOne.

If the current element is found in the set, add it to the result list.

Use another HashSet to avoid adding duplicates in the result.
This approach runs in O(n + m) time, where n and m are sizes of the lists.

import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;

class Tester {
    
    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo){
        // Store elements of listTwo in a set for quick lookup
        HashSet<Integer> setTwo = new HashSet<>(listTwo);
        
        // To avoid duplicates in the result
        HashSet<Integer> seen = new HashSet<>();
        
        List<Integer> result = new LinkedList<>();
        
        // Traverse listOne and collect common elements
        for (Integer num : listOne) {
            if (setTwo.contains(num) && !seen.contains(num)) {
                result.add(num);
                seen.add(num);
            }
        }
        
        return result;
    }
    
    public static void main(String args[]){
        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(12);
        listOne.add(21);
        listOne.add(1);
        listOne.add(53);
        
        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(11);
        listTwo.add(21);
        listTwo.add(25);
        listTwo.add(53);
        listTwo.add(47);

        System.out.println(findCommonElements(listOne, listTwo));
    }
}

Approach 2 (No Extra Data Structures – O(n²))

1. Create an empty result list.

2. Traverse through each element of listOne.

3. For every element in listOne, check if it exists in listTwo.

4.  Before adding to the result, make sure it is not already present in the result list (to avoid duplicates).

5. Return the result list.

This is O(n × m) in time complexity but uses only the input lists (no HashSet or HashMap).

*/

import java.util.LinkedList;
import java.util.List;

class FindComman {

    public static List<Integer> findCommonElements(List<Integer> listOne, List<Integer> listTwo) {
        //Implement your logic here and change the return statement accordingly
        List<Integer> result = new LinkedList<>();

        // Outer loop: iterate through listOne
        for (Integer num1 : listOne) {

            // Inner loop: check if num1 exists in listTwo
            for (Integer num2 : listTwo) {
                if (num1.equals(num2)) {

                    // // Check if it's already added to result
                    // if (!result.contains(num1)) {
                    //     result.add(num1);
                    // }

                    // // Break, since we found a match
                    // break; 
                    result.add(num1);
                }
            }
        }
        return result;
    }

    public static void main(String arga[]) {

        List<Integer> listOne = new LinkedList<Integer>();
        listOne.add(10);
        listOne.add(12);
        listOne.add(21);
        listOne.add(1);
        listOne.add(53);

        List<Integer> listTwo = new LinkedList<Integer>();
        listTwo.add(11);
        listTwo.add(21);
        listTwo.add(25);
        listTwo.add(53);
        listTwo.add(47);

        System.out.println(findCommonElements(listOne, listTwo));
    }
}
