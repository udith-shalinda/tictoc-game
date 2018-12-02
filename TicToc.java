import java.util.*;

class TicToc{
	static String[] element =new String[9];
	static String ele = "X";
	static int count =0;
	

	void open(){
		for(int i =0; i < 9; i++){
			element[i] = "8";
		}
	}
	void addElements(){
		TicToc tic = new TicToc();
		while(count < 10){
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a place");
			int i = scan.nextInt();
			element[i-1] = ele;
			count++;
			if(ele == "X"){
				ele = "O";
			}else{
				ele = "X";
			}
			tic.print();
			tic.check();
		}
		
		
	}

	
	void print(){
		
			System.out.println("-------------");
			System.out.println("| "+element[0] +" | " + element[1]+" | " + element[2] +" | ");
			System.out.println("-------------");
			System.out.println("| "+element[3] +" | " + element[4]+" | " + element[5] +" | ");
			System.out.println("-------------");
			System.out.println("| "+element[6] +" | "  + element[7]+" | "  + element[8] +" | ");
			System.out.println("-------------");
		
	}
	void check(){
	
			String[] line = new String[8];
			line[0] = element[0] + element[1] + element[2];
			line[1] = element[3] + element[4] + element[5];
			line[2] = element[6] + element[7] + element[8];
			line[3] = element[0] + element[3] + element[6];
			line[4] = element[1] + element[4] + element[7];
			line[5] = element[2] + element[5] + element[8];
			line[6] = element[0] + element[4] + element[8];
			line[7] = element[6] + element[4] + element[2];
			
			for(int i = 0;i < 8;i++){
				if(line[i].equals("XXX")){
					System.out.println("Man 1 has Won!!");
					System.exit(0);
				}else if(line[i].equals("OOO")){
					System.out.println("Man 2 has Won!!");
					System.exit(0);
				}
			}
	}

	
	public static void main(String[] args){
		TicToc tic = new TicToc();
		tic.open();
		tic.print();
		tic.addElements();
		
	}
	
}