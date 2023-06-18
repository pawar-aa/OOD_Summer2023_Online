package edu.northeastern.csye6200;

public class LAB5P2 {
	public static void main(String[] args){
		// TODO: write your code here
		RoomPeople a = new RoomPeople();
		RoomPeople b = new RoomPeople(); 
		System.out.println("Add two to room a and three to room b"); 
		//add two to room A
		a.addOneToRoom();
		a.addOneToRoom();
		//add three to room B
		b.addOneToRoom();  
		b.addOneToRoom();
		b.addOneToRoom();
		System.out.println("Room a holds " + a.getNumber()); 
		System.out.println("Room b holds " + b.getNumber()); 
		System.out.println("Total in all rooms is " + RoomPeople.getTotal()); 
		System.out.println("Remove two from both rooms"); 
		a.removeOneFromRoom();
		a.removeOneFromRoom();
		b.removeOneFromRoom();
		b.removeOneFromRoom();
		System.out.println("Room a holds " + a.getNumber()); 
		System.out.println("Room b holds " + b.getNumber()); 
		System.out.println("Total in all rooms is " + RoomPeople.getTotal());
		System.out.println("Remove two from room a (should not change the values)");
		a.removeOneFromRoom();
		a.removeOneFromRoom();
		System.out.println("Room a holds " + a.getNumber()); 
		System.out.println("Room b holds " + b.getNumber()); 
		System.out.println("Total in all rooms is " + RoomPeople.getTotal());
	}
}

class RoomPeople {
    
	// TODO: write your code here
	int n;
	static int total= 0;
	
    public static int getTotal(){
    	// TODO: write your code here
    	return total;
    }
    
    public RoomPeople() {
    	// TODO: write your code here
    	this.n = 0;
    }
    
    public void addOneToRoom(){
    	// TODO: write your code here
    	n = n + 1; 
    	total= total + 1;
    }
    
    public void removeOneFromRoom(){
    	// TODO: write your code here
    	if(this.n > 0) { 
    		this.n = this.n - 1; 
    		total = total - 1;
    	}
    }
    
    public int getNumber(){
    	// TODO: write your code here
    	return n;
    }
}   
