package Matriz;

public class Determinantes {

	private Double detGeral;
	private Double detx;
	private Double dety;
	private Double detz;
	private Double valorDireita;
	private Double valorEsquerda;

	private Double matrizDobrada[][] = new Double[3][5];
	
	public void atomicCreate(){
	
		normalizarMatriz();
		determinantes("");
		determinantes("X");
		determinantes("Y");
		determinantes("Z");
		printDeterminantes();
		
	}
	

	public void normalizarMatriz() {

		for (int i = 0; i < matrizDobrada.length; i++) {
			for (int j = 0; j < matrizDobrada[i].length; j++) {
				if (j <= 2) {
					matrizDobrada[i][j] = ValoresMatriz.matrizPrincipal[i][j];
				} else {
					matrizDobrada[i][j] = matrizDobrada[i][j - 3];
				}
			}
		}
	}

	public void determinantes(String alterarMatrizXYZ) {

		switch (alterarMatrizXYZ) {
		case "X": {
			normalizarMatriz();
			for (int i = 0; i < 3; i++) {
				matrizDobrada[i][0] = ValoresMatriz.matrizResults[i];
				matrizDobrada[i][3] = ValoresMatriz.matrizResults[i];
			}
			break;
		}
		case "Y": {
			normalizarMatriz();
			for (int i = 0; i < 3; i++) {
				matrizDobrada[i][1] = ValoresMatriz.matrizResults[i];
				matrizDobrada[i][4] = ValoresMatriz.matrizResults[i];
			}
			break;
		}
		case "Z": {
			normalizarMatriz();
			for (int i = 0; i < 3; i++) {
				matrizDobrada[i][2] = ValoresMatriz.matrizResults[i];
			}
			break;
		}
		default:
			normalizarMatriz();
			break;
		}

		Double detDireita1 = matrizDobrada[2][4] * matrizDobrada[1][3] * matrizDobrada[0][2];
		Double detDireita2 = matrizDobrada[2][3] * matrizDobrada[1][2] * matrizDobrada[0][1];
		Double detDireita3 = matrizDobrada[2][2] * matrizDobrada[1][1] * matrizDobrada[0][0];

		Double detEsquerda1 = matrizDobrada[2][0] * matrizDobrada[1][1] * matrizDobrada[0][2];
		Double detEsquerda2 = matrizDobrada[2][1] * matrizDobrada[1][2] * matrizDobrada[0][3];
		Double detEsquerda3 = matrizDobrada[2][2] * matrizDobrada[1][3] * matrizDobrada[0][4];

		valorDireita = detDireita1 + detDireita2 + detDireita3;
		valorEsquerda = detEsquerda1 + detEsquerda2 + detEsquerda3;

		switch (alterarMatrizXYZ) {
	    case "X":
	        detx = valorDireita - valorEsquerda;
	        break;
	    case "Y":
	        dety = valorDireita - valorEsquerda;
	        break;
	    case "Z":
	        detz = valorDireita - valorEsquerda;
	        break;
	    default:
	        detGeral = valorDireita - valorEsquerda;
	        break;
	}
		

	}

	public void printMatrizDobrada() {
		for (int i = 0; i < matrizDobrada.length; i++) {
			for (int j = 0; j < matrizDobrada[i].length; j++) {
				System.out.print(matrizDobrada[i][j] + "     ");
			}
			System.out.println();
		}
	}
	
	public void printDeterminantes() {
		System.out.println("Determinante geral = " + detGeral
				+"\nDeterminante X = " + detx
				+"\nDeterminante Y = " + dety
				+"\nDeterminante Z = " + detz
				+"\nx = " + (detx / detGeral)
				+"\ny = " + (dety / detGeral)
				+"\nz = " + (detz / detGeral));
	}

}
