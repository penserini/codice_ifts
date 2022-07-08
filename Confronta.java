import java.io.*;

public class Confronta {

	public static void main(String[] args) throws IOException{
		int a,b;
		String str;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		System.out.println("Inserisci il primo numero 'a': ");
		str = tastiera.readLine();
		a = Integer.parseInt(str);
		
		System.out.println("Inserisci il secondo numero 'b': ");
		str = tastiera.readLine();
		b = Integer.parseInt(str);
		
		if(a > b) {
			System.out.println("Il numero maggiore è 'a' e vale: "+a);
		}else if(a < b || a == b){
			System.out.println("Il numero maggiore è 'b' e vale: "+b);
		}
	}
}
