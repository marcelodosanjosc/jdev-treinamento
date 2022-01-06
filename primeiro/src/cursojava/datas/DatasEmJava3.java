package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasEmJava3 {
	
	public static void main(String[] args) throws ParseException {
	
		
		Calendar calendar = Calendar.getInstance();/*Pega a data atual*/
		
		/*Simular que data vem do bano de dados*/
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));/*Definindo um data qualquer*/
		
		
		calendar.add(Calendar.DAY_OF_MONTH, -40);/*Data de hoje mais 40 dias*/
		
		System.out.println("Somando dia do mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		calendar.add(Calendar.MONTH, 1);
		
		System.out.println("SOmando o m�s : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
         calendar.add(Calendar.YEAR, 1);
		
		System.out.println("Somando 1 anos : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
	}

}
