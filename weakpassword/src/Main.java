import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> obj=new LinkedList<>();
		int num;
        do{
		System.out.println("Choice 1 : Insert\nChoice 2 : Delete\nChoice 3 : Search\nChoice 4 : Display\nAny other choice : Exit");
        num=sc.nextInt();
        switch(num){
        case 1:
        	System.out.println("Enter the element to be inserted");
        	int value=sc.nextInt();
        	obj.add(value);
        	break;
        case 2:
        	if(!obj.isEmpty()){
        	System.out.println("The element "+	obj.remove()+ " is deleted from queue ");
        	}
        	else{
        		System.out.println("Queue is empty");
        	}
        	break;
        case 3:
        	System.out.println("Enter the value to be searched");
        	int search=sc.nextInt();
        	int flag=0;
        	for(int i=0;i<obj.size();i++){
        	if(obj.contains(search)){
        		System.out.println("The element "+search+" is present in the stack");
        	    flag=1;
        	    break;
        	}
        	}
        	if(flag==0){
        		System.out.println("The element "+search+" is not present in the stack");
        	}
        	break;
        case 4:
        	if(!obj.isEmpty()){
        	System.out.println("The elements in the queue are");
        	System.out.println(obj);
        	}
        	else{
        		System.out.println("Queue is empty");
        	}
        	break;
        default:
        	break;
        }
        }while(num<=4); 
        sc.close();
	}
	
}

