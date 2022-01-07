package cursojava.arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJson {
	public static void main(String[] args) throws IOException {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.setNome("Marcelo");
		usuario1.setCpf("0000004444");
		usuario1.setLogin("marcelo");
		usuario1.setSenha("123456");
		
		Usuario usuario2 = new Usuario();
		
		usuario2.setNome("Denise");
		usuario2.setCpf("0000004444");
		usuario2.setLogin("denise");
		usuario2.setSenha("123456");
		
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = 
				new FileWriter("/home/marcelo/ws-jdev/jdev-treinamento/primeiro/src/cursojava/arquivos/filejson.json");
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		/************************************************************************/
		FileReader fileReader = 
				new FileReader("/home/marcelo/ws-jdev/jdev-treinamento/primeiro/src/cursojava/arquivos/filejson.json");
		JsonArray array = (JsonArray) JsonParser.parseReader(fileReader);
		
		List<Usuario> listUsuarios = new ArrayList<>();
		
		for (JsonElement element : array) {
			Usuario usuario = new Gson().fromJson(element, Usuario.class);
			listUsuarios.add(usuario);
					
		}
		for (Usuario usuario : listUsuarios) {
			System.out.println(usuario);
		}
		
		System.out.println("Leitura do arquivo JSON: " +listUsuarios);
	}
	
}
