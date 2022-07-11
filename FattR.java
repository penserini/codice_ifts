import java.io.*;

public class FattR {

	public FattR() throws IOException{
		int n;
		
		System.out.print("Calcola il FATTORIALE di: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = input.readLine();
		n = Integer.parseInt(line);
		
		if(n == 0) 
			System.out.print("Il FATTORIALE di zero: 0! = 1");
		else if(n == 1)
			System.out.print("Il FATTORIALE di uno: 1! = 1");
		else if(n > 1) {
			System.out.print(n + "! = ");
			System.out.print(" = " + Fat(n));	
		}
	}
	
	public int Fat(int n) {
		if(n == 1) {
			System.out.print(n);
			return 1;
		}else {
			System.out.print(n + " * ");
			return n * Fat(n-1);
		}
	}

	public static void main(String[] args) throws IOException{
		new FattR();
	}
}
