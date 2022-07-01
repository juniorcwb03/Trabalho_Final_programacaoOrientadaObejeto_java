package trabalhoFinal;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Arquivo {
	
	public void gravaNoArq(String mensagem) throws IOException {
	FileWriter arq = new FileWriter("dados.txt",true);
	
    PrintWriter gravarArq = new PrintWriter(arq);
    gravarArq.printf(" ***********INICIO REGISTRO DE AÇÃO************* "  + LocalDateTime.now() );
    gravarArq.printf( mensagem );
    gravarArq.printf(" *************FIM REGISTRO DE AÇÃO****** ");
    arq.close();
	}
	
	
	public void buscarNoArq() throws IOException {
		Scanner in = new Scanner(new FileReader("dados.txt"));
		while (in.hasNextLine()) {
		    String line = in.nextLine();
		    System.out.println(line);
		}
	}
	

}
