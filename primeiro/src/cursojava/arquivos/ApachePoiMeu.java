package cursojava.arquivos;

import java.io.File;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoiMeu {
	
	public static void main(String[] args) throws Exception {
		
		File arquivo = new File("/home/marcelo/ws-jdev/jdev-treinamento/primeiro/src/cursojava/arquivos/arquivo_excel.xlsx");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		PessoaMeu p1 = new PessoaMeu();
		PessoaMeu p2 = new PessoaMeu();
		PessoaMeu p3 = new PessoaMeu();
		
		p1.setNome("Marcelo");
		p1.setEmail("marcelo@marcelo.com");
		p1.setIdade(30);
		
		p2.setNome("Denise");
		p2.setEmail("marcelo@marcelo.com");
		p2.setIdade(26);
		
		p3.setNome("Murilo");
		p3.setEmail("marcelo@marcelo.com");
		p3.setIdade(4);
		
		List<PessoaMeu> pessoas = new ArrayList<PessoaMeu>();
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
			HSSFWorkbook hss = new HSSFWorkbook();
			HSSFSheet linhaPessoa = hss.createSheet("Planilha de pessoa");
			
			int numeroLinha = 0;
			for (PessoaMeu p : pessoas) {
				Row linha = linhaPessoa.createRow( numeroLinha ++);
				
				int celula = 0;
				
				Cell celNome = linha.createCell(celula ++);
				celNome.setCellValue(p.getNome());
				
				Cell celEmail = linha.createCell(celula ++);
				celEmail.setCellValue(p.getEmail());
				
				Cell celIdade = linha.createCell(celula ++);
				celIdade.setCellValue(p.getIdade());
			}
			
			FileOutputStream saida  = new FileOutputStream(arquivo);
			hss.write(saida);
			saida.flush();
			saida.close();
		
		System.out.println("Planilha criada");
		
	}

}
