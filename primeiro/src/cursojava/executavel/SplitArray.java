package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
	public static void main(String[] args) {
		String texto = "Marcelo, Java web, 90, 95, 80, 85";
		
		String[] arrayTexto =  texto.split(",");
		
		for (int i = 0; i < arrayTexto.length; i++) {
			System.out.println("\n " + arrayTexto[i]);
		}
		
		/*convertendo array para lista */
		List<String> lista = Arrays.asList(arrayTexto);
		System.out.println("Convertendo array para lista");
		for (String valorString : lista) {
			System.out.println(valorString);
		}
		
		/*convertendo lista para array*/
		String[] conversaoArray = lista.toArray(new String[arrayTexto.length]);
		System.out.println("Convertendo lista para array");
		for(int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
		}
	}
}
