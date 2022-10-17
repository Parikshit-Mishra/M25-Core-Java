package org.tnsindia.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRemove {

	public static void main(String[] args) {
		//Queue is interface we can create object 
		Queue <Character> list = new PriorityQueue<> ();
		list.add('z');
		list.add('a');
		list.add('s');
		list.add('p');
		for(Character c:list)
		{
			System.out.println(c);
		}
		System.out.println(list);
		/*list.remove();
		System.out.println(list);
		list.remove();
		list.remove();
		list.remove();
		System.out.println(list.peek());*/
		list.poll();
		list.poll();
		list.poll();
		list.poll();
		System.out.println(list);
		
	}

}
