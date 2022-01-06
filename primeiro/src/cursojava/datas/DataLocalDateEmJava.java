package cursojava.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataLocalDateEmJava {
	 public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data atual :" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek());
		
		System.out.println("Dia o mes: " + localDate.getDayOfMonth());
		
		System.out.println("Dia Ano :" + localDate.getDayOfYear());
		
		System.out.println("Mes :" +localDate.getMonth());
		
		System.out.println("Ano: "+ localDate.getYear());
	}
}
