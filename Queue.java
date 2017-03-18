package com.PhysicalWeb.Beacons;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class Queue 
{

	private final ArrayList<Integer> queue;

	public Queue(){
		queue=new ArrayList();
	}
	
	public static void main(String[] args) throws IOException 
	{

		BufferedReader commandReader=new BufferedReader(new InputStreamReader(System.in));
		int commands=Integer.parseInt(commandReader.readLine());
		StringTokenizer input;
		Queue myQueue=new Queue();
		while(commands>0)
		{
			input=new StringTokenizer(commandReader.readLine());
			int operation=Integer.parseInt(input.nextToken());
			switch(operation)
			{
				case 1:
					
					int data=Integer.parseInt(input.nextToken());
					myQueue.enqueue(data);
					break;

				case 2:

					myQueue.dequeue();
					break;

				case 3:myQueue.printFrontElement();
			}
			commands--;
		}

	}

	public void enqueue(int data){
		
		queue.add(data);
	
	}

	public void dequeue()
	{
		if(queue.size()>0){
			queue.remove(0);
		}
		else{
			return;
		}
	}
	
	public void printFrontElement(){
		if(queue.size()>0)
		{
			System.out.println(queue.get(0));
		}
		else{
			return;
		}
	}
}
