package cursojava.executavel;

public class MatrizArray {
	public static void main(String[] args) {
		int notas [][] = new int[2][3];
		
		notas[0][0] = 30;
		notas[0][1] = 40;
		notas[0][2] = 50;
		
		notas[1][0] = 60;
		notas[1][1] = 70;
		notas[1][2] = 80;
		
		for (int x = 0; x < notas.length; x++) {
			System.out.println("Linha - " +x);
			for (int y = 0; y < notas[x].length; y++) {
				System.out.println("Nota - "+y+" :"+notas[x][y] );
			}
		}
		
		
	}
}
