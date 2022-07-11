import java.io.*;

public class Esponenziale {

	public static void main(String[] args) throws IOException{
		double base = 0;
		double potenza = 1;
		int esp, i;
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
			for(i = esp; i > 0; i--) {
				potenza = potenza * base;
			}
			System.out.print("L'elevamento a potenza risulta: " + potenza);	
		}
	}
}
