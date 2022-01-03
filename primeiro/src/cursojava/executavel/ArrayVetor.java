package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		/*
		 * String pos =
		 * JOptionPane.showInputDialog("Qualntas posição do Array deve ter ?");
		 * 
		 * double notas[] = new double[Integer.parseInt(pos)];
		 * 
		 * for (int i = 0; i < notas.length; i++) { String valor =
		 * JOptionPane.showInputDialog("Valor da nota " + (i + 1)+ " ?" ); notas[i]=
		 * Double.parseDouble(valor); }
		 * 
		 * for (double d : notas) { System.out.println("Nota "+ d); } for(int i = 0;i <
		 * notas.length; i++) { System.out.println("Nota "+ (i + 1) + " = " + notas[i]);
		 * }
		 */
		
		double[] notas = {7,8,9,4};
		double[] notasLogicas = {4,5,6,7};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Marcelo");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		
		System.out.println("Nome do aluno" + aluno.getNome());
		System.out.println("------Disciplina do aluno ------------");
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("Disciplina :" + d.getDisciplina());
			System.out.println("Notas da disciplina: ");
			double maxNota = 0.0;
			double mimNota = 0.0;
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("nota: "+(i+1)+" é igual "+d.getNota()[i] );
				if(i == 0) {
					maxNota = d.getNota()[i];
					mimNota = d.getNota()[i];
				}else {
					if(d.getNota()[i] > maxNota) {
						maxNota = d.getNota()[i];
					}
					if(d.getNota()[i] < mimNota) {
						mimNota =d.getNota()[i];
					}
				}
			}
			System.out.println("A maior nota da disciplina: " +d.getDisciplina()+ " com nota: " +maxNota);
			System.out.println("A menor nota da disciplina: " +d.getDisciplina()+ " com nota: " +mimNota);
		}
		
	}
}
