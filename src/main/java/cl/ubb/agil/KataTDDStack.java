package cl.ubb.agil;

public class KataTDDStack {
	
	int[] Stack = new int[2];

	public KataTDDStack() {
		 
	}
	
	public boolean isEmpty(){
		
		int count = 0;
		
		for(int i=0;i<=Stack.length-1;i++){
			if(Stack[i]!=0){
				count++;
			}
		}
		
		if(count == 0){
			return true;
		}else{
			return false;
		}
	}

}
