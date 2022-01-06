package cursojava.datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DatasEmJava9 {

	public static void main(String[] args) throws ParseException, InterruptedException {

		LocalDate data = LocalDate.now();
		
		LocalDate dataBase = LocalDate.parse(data.toString());
			

		for (int mes = 1; mes <= 12; mes ++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println( "Data de vencimento do boleto : " +
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " do m�s :" + mes);
		}

	}

}
