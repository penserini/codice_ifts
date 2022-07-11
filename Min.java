import java.io.*;

public class Min {

	public static void main(String[] args) throws IOException{
		double min = 100.00;
		double temp;		
		String str;
		String ris = "S";
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		do {
			System.out.print("Inserisci una temperatura: ");
			str = tastiera.readLine();
			temp = Double.parseDouble(str);
			if(min > temp) {
				min = temp;
			}			
			System.out.println("Vuoi inserire un'altra temperatura (S/N)? ");
			ris = tastiera.readLine();
			
		} while(ris.equals("S") || ris.equals("s"));
		
		System.out.println("La temperatura minima risulta temp = " + min);
	}
}
