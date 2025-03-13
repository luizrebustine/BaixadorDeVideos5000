package model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaixadorModel {

	public BaixadorModel() {
		super();
	}
	
	public void mostrarTitulo() {
		System.out.println("██████╗  █████╗ ██╗██╗  ██╗ █████╗ ██████╗  ██████╗ ██████╗     ██████╗ ███████╗    \r\n"
				+ "██╔══██╗██╔══██╗██║╚██╗██╔╝██╔══██╗██╔══██╗██╔═══██╗██╔══██╗    ██╔══██╗██╔════╝    \r\n"
				+ "██████╔╝███████║██║ ╚███╔╝ ███████║██║  ██║██║   ██║██████╔╝    ██║  ██║█████╗      \r\n"
				+ "██╔══██╗██╔══██║██║ ██╔██╗ ██╔══██║██║  ██║██║   ██║██╔══██╗    ██║  ██║██╔══╝      \r\n"
				+ "██████╔╝██║  ██║██║██╔╝ ██╗██║  ██║██████╔╝╚██████╔╝██║  ██║    ██████╔╝███████╗    \r\n"
				+ "╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝  ╚═════╝ ╚═╝  ╚═╝    ╚═════╝ ╚══════╝    \r\n"
				+ "                                                                                    \r\n"
				+ "██╗   ██╗██╗██████╗ ███████╗ ██████╗ ███████╗    ███████╗ ██████╗  ██████╗  ██████╗ \r\n"
				+ "██║   ██║██║██╔══██╗██╔════╝██╔═══██╗██╔════╝    ██╔════╝██╔═████╗██╔═████╗██╔═████╗\r\n"
				+ "██║   ██║██║██║  ██║█████╗  ██║   ██║███████╗    ███████╗██║██╔██║██║██╔██║██║██╔██║\r\n"
				+ "╚██╗ ██╔╝██║██║  ██║██╔══╝  ██║   ██║╚════██║    ╚════██║████╔╝██║████╔╝██║████╔╝██║\r\n"
				+ " ╚████╔╝ ██║██████╔╝███████╗╚██████╔╝███████║    ███████║╚██████╔╝╚██████╔╝╚██████╔╝\r\n"
				+ "  ╚═══╝  ╚═╝╚═════╝ ╚══════╝ ╚═════╝ ╚══════╝    ╚══════╝ ╚═════╝  ╚═════╝  ╚═════╝ \r\n"
				+ "                                                                                    \r\n"
				+ "\r"
				+ "");
	}
	
	public String[] inputRecebedor() {
		System.out.println("\n" + "Insira o link do vídeo do youtube, sua resolução e se quiser mudar o diretório de salvamento, use como terceiro parametro (por padrao os videos serao salvos na pasta Videos do seu computador");
		System.out.print(">");
		Scanner input = new Scanner(System.in);
		String texto = input.nextLine();
		texto += " null";
		String[] inputVetor = texto.split(" ");
		return inputVetor;
	}
	
	public void testeInput() {
		String[] inputVetor = inputRecebedor();
		String diretorio = System.getProperty("user.home") + "\\Videos";
		if(!inputVetor[2].equals("null")) {
			diretorio = inputVetor[2];
		}
		String[] executarPython = {"python", "C:\\Users\\dudur\\eclipse-workspace\\BaixadorDeVideos\\BaixadorCore.py",
				inputVetor[0], inputVetor[1], diretorio}; 
		try {
			Process p = Runtime.getRuntime().exec(executarPython);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine().toString();
			System.out.println("\n" + linha);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
	}
}
