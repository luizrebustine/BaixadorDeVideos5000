package controller;

import model.BaixadorModel;
import java.util.Scanner;

public class BaixadorController {
	
	public BaixadorController() {
		super();
	}
	
	public void executarBaixador() {
		BaixadorModel baixador = new BaixadorModel();
		String pergunta = "null";
		baixador.mostrarTitulo();
		while(!pergunta.equals("n")) {
			baixador.testeInput();
			pergunta = perguntaSaida();
		}
	}
	
	public String perguntaSaida() {
		System.out.println("\n" + "Deseja continuar baixando vídeos? (S/N)");
		System.out.print(">");
		Scanner input = new Scanner(System.in);
		String texto = input.nextLine();
		return texto;
	}
}
