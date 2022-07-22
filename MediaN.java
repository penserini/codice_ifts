import java.io.*;//serve per poter utilizzare il BufferedReader
public class MediaN {

	public MediaN(int a) {
		// metodo costruttore, non viene usato
		a = a+1;
	}

	public static void main(String[] args) throws IOException{
				int numeri;// il numero di numeri che l'utente dovrà digitare
				int num[];//il contenitore di tutti i numeri
				double prezzo_scontato[];
				int i;//DICHIARAZIONE
				i=0;//ASSEGNAZIONE
				double media = 0;
				double sconto = 0;
				String line="";
												
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
						
				System.out.println("Quanti numeri intendi digitare? ");
				line = input.readLine();// INPUT
				numeri = Integer.parseInt(line);//converte testo in numerico
				
				num = new int[numeri];//si dimensiona il vettore
				prezzo_scontato = new double[numeri];
								
				for(i=0;i < num.length; i=i+1){
					System.out.print("Digita il "+ (i+1) +"° numero: ");
					line = input.readLine();// INPUT
					num[i] = Integer.parseInt(line);//converte testo in numerico e assegna il valore
													// in una cella del vettore indicata dalla i
					//*********
					sconto = 0;
					if(num[i]>10 & num[i]<=20) {
						//SCONTO DEL 5%
						sconto = num[i]*0.05;
						//prezzo_scontato[i] = num[i] - sconto;
						
					}else if(num[i]>20) {
						// SCONTO DEL 10%
						sconto = num[i]*0.1;
						//prezzo_scontato[i] = num[i] - sconto;
						
					}/*else(num[i]=<10){
						
						prezzo_scontato[i] = num[i] + 0;						
					}*/
					prezzo_scontato[i] = num[i] - sconto;
					
					//*********					
					media = media + num[i];
				}//Chiusura del FOR
				
				System.out.println("La media dei " + numeri + " numeri inseriti è: " + media/numeri);
				
				for(i=0;i<numeri;i++) {
					System.out.println("Scontrino n°. " + (i+1) +" vale:" + num[i] + " euro"); 
				}

	}

}
