import java.io.*;

public class Fatt {

	public Fatt() throws IOException{		
		int n,i;
		int fat=1;
		
		System.out.print("Calcola il FATTORIALE di: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = input.readLine();
		n = Integer.parseInt(line);
		i = n;
		
		System.out.print(i + "! = " + i);		
		while(i>0){
			fat = fat*i;
			i--;
			if(i!=0)
				System.out.print(" * " + i);
		}
		System.out.println();		
		System.out.print("Il FATTORIALE di " + n + " è: " + fat);		
	}

	public static void main(String[] args) throws IOException{
		new Fatt();
	}

}
