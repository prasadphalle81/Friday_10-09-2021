package Prasad_Java;

import java.util.*;

public class CollectionAll1 {

	public static void main(String[] args) {
		// 1. ArryList
		System.out.println("ArryList imlementation: ");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("Hello");
		al.add("How are you?");
		al.add("Where are you?");
		try{
		System.out.println("Before removing: " + al);
		al.remove(3);
		System.out.println("After removing: ");
		Iterator itr = al.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next() + " ");
			}
		}
		catch(Exception e) {
		System.out.println(e);
		}
		
		// 2. Linked list
		System.out.println();
		System.out.println();
		System.out.println("LinkList imlementation: ");
		LinkedList<String> lnklst = new LinkedList<String>();
		lnklst.add("Hi");
		lnklst.add("Hello");
		lnklst.add("How are you?");
		lnklst.add("Where are you?");
		try{
			System.out.println("Before removing: " + lnklst);
			lnklst.remove(3);
			System.out.println("After removing: ");
			Iterator itr = lnklst.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next() + " ");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// 3. Vector
		System.out.println();
		System.out.println();
		System.out.println("Vector imlementation: ");
		Vector<String> vect = new Vector<String>();
		vect.add("I'm in");
		vect.add("Sangli");
		vect.add("Are you in pune?");
		try {
			System.out.println("Before removing: " + vect);
			vect.remove(2);			
			System.out.println("After removing: ");
			Iterator itr = vect.iterator();
			while(itr.hasNext()) 
			{
				System.out.print(itr.next() + " ");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		// 4. Stack
		System.out.println();
		System.out.println();
		System.out.println("Stack implementation: ");
		Stack<String> stk = new Stack<String>();
		stk.push("Are");
		stk.push("You");
		stk.push("Going");
		stk.push("To");
		stk.push("USA?");
		try {
			System.out.println("Before POP: " + stk);
			System.out.println("After POP: ");
			stk.pop();
			//stk.peek();
			Iterator<String> itr = stk.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next() + " ");
			}			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		// 5. Priority Queue
		System.out.println();
		System.out.println();
		System.out.println("PriorityQueue implementation: ");
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("What");
		pq.add("is");
		pq.add("Priority");
		pq.add("Queue");
		pq.add("in Java Collection?");
		try {
			System.out.println("Before removing: " + pq);
			pq.remove();
			System.out.println("After removing: ");
			Iterator<String> itr = pq.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next() + " ");		
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		// 6.  Dequeue
				System.out.println();
				System.out.println();
				System.out.println("Deque implementation: ");
				Deque<String> dq = new ArrayDeque<String>();
				dq.add("What");
				dq.add("is");
				dq.add("Deque");
				dq.add("in Java Collection?");
				try {
					System.out.println("Before removing: " + dq);
					dq.remove();
					System.out.println("After removing: ");
					Iterator<String> itr = dq.iterator();
					while(itr.hasNext())
					{
						System.out.print(itr.next() + " ");		
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				
		// 7.  HashSet
				System.out.println();
				System.out.println();
				System.out.println("HashSet implementation: ");
				HashSet<String> hs = new HashSet<String>();
				hs.add("What");
				hs.add("is");
				hs.add("HashSet");
				hs.add("in Java Collection?");
				hs.add("HashSet");
				hs.add("in Java Collection?");
				try {
					System.out.println("Before removing: " + hs);
					hs.remove("in Java Collection?");
					System.out.println("After removing: ");
					Iterator<String> itr = hs.iterator();
					while(itr.hasNext())
					{
						System.out.print(itr.next() + " ");		
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				
				// 8.  LinkedHashSet
				System.out.println();
				System.out.println();
				System.out.println("LinkedHashSet implementation: ");
				LinkedHashSet<String> lhs = new LinkedHashSet<String>();
				lhs.add("What");
				lhs.add("is");
				lhs.add("LinkedHashSet");
				lhs.add("in Java Collection?");
				lhs.add("LinkedHashSet");
				lhs.add("in Java Collection?");
				try {
					System.out.println("Before removing: " + lhs);
					lhs.remove("LinkedHashSet");
					System.out.println("After removing: ");
					Iterator<String> itr = lhs.iterator();
					while(itr.hasNext())
					{
						System.out.print(itr.next() + " ");		
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				
				// 9.  TreeSet
				System.out.println();
				System.out.println();
				System.out.println("TreeSet implementation: ");
				TreeSet<String> ts = new TreeSet<String>();
				ts.add("What");
				ts.add("is");
				ts.add("TreeSet");
				ts.add("in Java Collection?");
				ts.add("TreeSet");
				ts.add("in Java Collection?");
				try {
					System.out.println("Before removing: " + ts);
					ts.remove("TreeSet");
					System.out.println("After removing: ");
					Iterator<String> itr = ts.iterator();
					while(itr.hasNext())
					{
						System.out.print(itr.next() + " ");		
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				
				// 10. HashMap
				System.out.println();
				System.out.println();
				System.out.println("HashMap implementation: ");
				HashMap<Integer, String> hmp = new HashMap<Integer, String>();
				hmp.put(1, "Mango");
				hmp.put(2, "Apple");
				hmp.put(3, "Banana");
				hmp.put(4, "Mango");
				hmp.put(2, "Apple");
				System.out.println("Iterating HashMap: ");
				for(Map.Entry m : hmp.entrySet()){    
				    System.out.println(m.getKey()+" "+m.getValue());
				}
				
				
				// 11. TreeMap
				System.out.println();
				System.out.println();
				System.out.println("TreeMap implementation: ");
				TreeMap<Integer, String> tmp = new TreeMap<Integer, String>();
				tmp.put(1, "Mango");
				tmp.put(5, "Apple");
				tmp.put(3, "Banana");
				tmp.put(4, "Mango");
				tmp.put(2, "Apple");
				System.out.println("Iterating TreeMap: ");
				System.out.println("Before removing: ");
				for(Map.Entry m : tmp.entrySet()){    
				    System.out.println(m.getKey()+" "+m.getValue());
				}
				
				tmp.remove(3);
				System.out.println("After removing: ");
				for(Map.Entry m : tmp.entrySet()){    
				    System.out.println(m.getKey()+" "+m.getValue());
				}
				
		
	}

}
