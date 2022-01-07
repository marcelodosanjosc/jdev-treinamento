package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArquivoMeu {

	public static void main(String[] args) throws IOException {
		
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
	
		
		File arquivo = new File("/home/marcelo/ws-jdev/jdev-treinamento/primeiro/src/cursojava/arquivos/arquivo.csv");
		
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		FileWriter escreve = new FileWriter(arquivo);
		
		for (PessoaMeu p : pessoas) {
			escreve.write(p.getNome() +"," +p.getEmail() +","+p.getIdade() +"\n");
		}
		
		escreve.flush();
		escreve.close();
		
	}
}
