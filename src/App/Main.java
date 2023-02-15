package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] Args) {

		// armazena o caminho do arquivo txt na variavel path.
		String path = "C:\\Users\\nitro\\Desktop\\nomes.txt";
		// trata o cogigo previnindo exceções.
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// salva na variavel line a função que realiza a leitura da linha do arquivo txt.
			String line = br.readLine();
			// laço que verifica a linha até ser vazia.
			while (line != null) {
				// quando ficar vazia o print imprime na tela o conteúdo.
				System.out.println(line);
				// reinicia a leitura.
				line = br.readLine();
			}
			
		} 
		// trata a exceção IOException se houver.
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
