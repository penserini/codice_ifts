import java.io.*;

public class Power {
	
	public Power() throws IOException{
		double base = 0;
		int esp;
		String str;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		System.out.print("Inserisci la 'base': ");				
		str = tastiera.readLine();
		base = Double.parseDouble(str);
		
		System.out.print("Inserisci l' 'esponente': ");				
		str = tastiera.readLine();
		esp = Integer.parseInt(str);
		System.out.print("");
		
		if(esp >= 0) {			
			System.out.print("L'elevamento a potenza risulta: " + Exp(base, esp));	
		}
	}	
	
	public double Exp(double base, int esp) {
		double potenza = 1;
		int i;
		
		for(i = esp; i > 0; i--) {
			potenza = potenza * base;
		}
		return potenza;
	}

	public static void main(String[] args) throws IOException {
		new Power();
	}
}
