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
		System.out.println("\n" + "Insira o link do vídeo do youtube e sua resolução");
		System.out.print(">");
		Scanner input = new Scanner(System.in);
		String texto = input.nextLine();
		String[] inputVetor = texto.split(" ");
		return inputVetor;
	}
	
	public void testeInput() {
		String[] inputVetor = inputRecebedor();
		String[] executarPython = {"python", "C:\\Users\\dudur\\eclipse-workspace\\BaixadorDeVideos\\BaixadorCore.py",
				inputVetor[0], inputVetor[1]}; 
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
