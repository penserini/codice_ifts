import java.io.*;

public class MinMax {

	public static void main(String[] args) throws IOException{
		double min,max;
		double temp;	
		int ntemp = 0;
		String str;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		System.out.print("Digita il numero di temperature: ");
		str = tastiera.readLine();
		ntemp = Integer.parseInt(str);
		
		System.out.print("");
		System.out.print("Inserisci una temperatura: ");
		str = tastiera.readLine();
		min = Double.parseDouble(str);
		max = min;
		
		while(ntemp > 1) {
			System.out.print("Inserisci una temperatura: ");
			str = tastiera.readLine();
			temp = Double.parseDouble(str);
			if(min > temp) {
				min = temp;
			} else if(max < temp) {
				max = temp;
			}
			ntemp = ntemp -1;
		}				
		System.out.println("La temperatura minima risulta temp = " + min);
		System.out.println("La temperatura massima risulta temp = " + max);
	}
}
