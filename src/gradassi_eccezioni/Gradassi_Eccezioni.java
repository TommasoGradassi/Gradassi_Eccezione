/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradassi_eccezioni;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStreamReader;
        /**
 *
 * @author Gradassi
 */
public class Gradassi_Eccezioni {

    /**
     * @param args the command line arguments
     */
    
    public static void usingScanner(){
        Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		String line = in.next();
		int intValue = Integer.parseInt(line);
	    
		System.out.println("Valore: " + intValue);
		in.close();
    }
    public static void usingBufferedReader(){
        BufferedReader inR= new BufferedReader(new InputStreamReader(System.in));
        try{
            int  lineR=inR.read();
            System.out.println("Valore inserito con il buffered"+lineR);
        }catch (IOException ex){
            Logger.getLogger(Gradassi_Eccezioni.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore nella scrittura");
        }
        try{
            inR.close();
	}catch (IOException ex){
            Logger.getLogger(UsingInputStream.class.getName()).log(Level.SEVERE,null,ex);
            System.err.println("Errore in scrittura");
            }
        }
    public static void TestEccezione(){
        Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		String line = in.next();
		
		try {
			int intValue = Integer.parseInt(line);
	    	System.out.println("Valore: " + intValue);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("DOPO CATCH");
		in.close();
		
	}

    }
 
   }
    

