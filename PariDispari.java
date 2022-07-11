import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PariDispari {

	public static void main(String[] args) throws IOException{
		int num = 0;
		String str;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		System.out.print("Digita un numero intero positivo: ");
		System.out.print("");		
		str = tastiera.readLine();
		num = Integer.parseInt(str);
		
		while(num > 1) {
			num = num - 2;
		}	
		if(num == 0) {
			System.out.println("Il numero inserito è PARI");
		} else {
			System.out.println("Il numero inserito è DISPARI");
		}
	}
}

