package Matriz;

public class ValoresMatriz {
	
	public static double matrizPrincipal[][] = {{1, 2, 1},
												{2, 1, -4},
												{1, 1 ,1}
		};
	
	public static double matrizResults[] = {6,3,5};
	
	
	public void printMatriz() {
		for (int i = 0; i < matrizPrincipal.length; i++) {
			for (int j = 0; j < matrizPrincipal[i].length; j++) {
				System.out.print(matrizPrincipal[i][j] + " ");
			}
			System.out.println();
		}
	}

			
}


