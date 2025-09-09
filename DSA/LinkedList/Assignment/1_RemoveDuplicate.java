import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

class RemoveDuplicate {

	public static List<Integer> removeDuplicates(List<Integer> list) {
        //Implement your logic here and change the return statement accordingly
        /* METHOD 1 = 
        LinkedHashSet<Integer> removeDuplicates = new LinkedHashSet<>(list);
        LinkedList<Integer> list2 = new LinkedList<>(removeDuplicates);
        
        return list2; */
       // METHOD 2  without using other dataStructure
        
        // Outer loop: pick one element at a time
        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            
            // Inner loop: check for duplicates ahead
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).equals(current)) {
                    list.remove(j);
                    j--; // Adjust index after removal
                }
            }
        }
        return list;
	}
	
	public static void main(String args[]) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(15);
		list.add(21);
		list.add(15);
		list.add(10);
		
		List<Integer> updatedList = removeDuplicates(list);
		
		System.out.println("Linked list without duplicates");
		for (Integer value : updatedList) {
			System.out.print(value+" ");
		}
	}
	
}