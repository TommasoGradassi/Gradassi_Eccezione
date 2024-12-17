/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradassi_eccezioni;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStreamReader;
        /**
 *
 * @author B045_03
 */
public class Gradassi_Eccezioni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("Digita un intero:");
		
		String line = in.next();
		int intValue = Integer.parseInt(line);
	    
		System.out.println("Valore: " + intValue);
		in.close();

        try {
           BufferedReader inR= new BufferedReader(new InputStreamReader(System.in));

            String lineR=inR.readLine();
        } catch (IOException ex) {
            Logger.getLogger(Gradassi_Eccezioni.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
    }
    
}
