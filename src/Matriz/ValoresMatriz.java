package Matriz;

public class ValoresMatriz {
	
	public static double matrizPrincipal[][] = {{5, 5, 3},
												{5, 4, 7},
												{4, 5 ,4}
		};
	
	public static double matrizResults[] = {43,44,39};
	
	
	public void printMatriz() {
		for (int i = 0; i < matrizPrincipal.length; i++) {
			for (int j = 0; j < matrizPrincipal[i].length; j++) {
				System.out.print(matrizPrincipal[i][j] + " ");
			}
			System.out.println();
		}
	}

			
}


