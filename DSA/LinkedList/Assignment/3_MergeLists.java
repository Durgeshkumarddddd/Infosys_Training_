/*
 * 📌 Problem Statement
You are given two sorted linked lists (in ascending order).
You need to merge them into a single sorted linked list that contains all the integers from both lists, while keeping the sorted order.

Input Lists : 
List One = [10, 13, 21, 42, 56]
List Two = [15, 20, 21, 85, 92]

Outpur List :
[10, 13, 15, 20, 21, 42, 56, 85, 92]

Step-by-step merging:

Compare 10 and 15 → take 10 → [10]

Compare 13 and 15 → take 13 → [10, 13]

Compare 21 and 15 → take 15 → [10, 13, 15]

Compare 21 and 20 → take 20 → [10, 13, 15, 20]

Compare 21 and 21 → take 21 → [10, 13, 15, 20, 21]

Remaining from listOne → 42, 56

Remaining from listTwo → 85, 92



*/

import java.util.LinkedList;
import java.util.List;

class MergeLists {
    
	public static List<Integer> mergeLists(List<Integer> listOne, List<Integer> listTwo) {
		 //Implement your logic here and change the return statement accordingly
         List<Integer> mergeList = new LinkedList<>();
         int i = 0 ;
         int j = 0 ;
         int l1 = listOne.size() ;
         int l2 = listTwo.size();
         while (i < l1 && j < l2) {
             if (listOne.get(i) < listTwo.get(j)) {
                 mergeList.add(listOne.get(i));
                 i++;
             } else {
                 mergeList.add(listTwo.get(j));
                 j++;
             }
         }
         while (i < l1) {
             mergeList.add(listOne.get(i));
             i++;
         }
         while (j < l2) {
             mergeList.add(listTwo.get(j));
             j++;
         }
		 
		 
		 return mergeList;
	}

	public static void main(String args[]) {
		List<Integer> listOne = new LinkedList<Integer>();
		listOne.add(10);
		listOne.add(13);
		listOne.add(21);
		listOne.add(42);
		listOne.add(56);
		
		List<Integer> listTwo = new LinkedList<Integer>();
		listTwo.add(15);
		listTwo.add(20);
		listTwo.add(21);
		listTwo.add(85);
		listTwo.add(92);
		
		List<Integer> mergedList = mergeLists(listOne, listTwo);
		System.out.println(mergedList);
	}
}
