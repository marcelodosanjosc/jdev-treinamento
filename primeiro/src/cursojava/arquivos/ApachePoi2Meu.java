package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2Meu {
	
	public static void main(String[] args) throws Exception  {
		
		FileInputStream entrada = new  FileInputStream(new 
				File("/home/marcelo/ws-jdev/jdev-treinamento/primeiro/src/cursojava/arquivos/arquivo_excel.xlsx"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterador = planilha.iterator();
		
		List<PessoaMeu> pessoas = new ArrayList<>();
		
		while (linhaIterador.hasNext()) {
			Row linha = linhaIterador.next();
			Iterator<Cell> celulas = linha.iterator();
			PessoaMeu pessoa = new PessoaMeu();
			
			while(celulas.hasNext()) {
				Cell cell = celulas.next();
				
				switch(cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
				}
			}
			pessoas.add(pessoa);
			
		}
		entrada.close();
		
		for (PessoaMeu pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
	}

}
