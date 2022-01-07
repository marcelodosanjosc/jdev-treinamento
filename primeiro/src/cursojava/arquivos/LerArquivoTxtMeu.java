package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import groovy.json.JsonGenerator.Options;

public class LerArquivoTxtMeu {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaArquivo = 
				new FileInputStream(
						new File("/home/marcelo/ws-jdev/jdev-treinamento/primeiro/src/cursojava/arquivos/arquivo.csv"));
		
		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");
		
		List<PessoaMeu> pessoas = new ArrayList<>();
		while(lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\,");
				
				PessoaMeu pessoa = new PessoaMeu();
				
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
				System.out.println(linha);
				
			}
			
		}
		for (PessoaMeu pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
		
		Options options = new  Options();
		
	
	}
}
