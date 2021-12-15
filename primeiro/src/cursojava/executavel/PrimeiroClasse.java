package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliar.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.*;
import java.time.chrono.ThaiBuddhistDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeiroClasse {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Login ");
        String senha = JOptionPane.showInputDialog("Senha ");
        
        
       
        /*Innterface em ação para autenticar com classes secretario */

        if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticarCursoJava()) {
            List<Aluno> alunos = new ArrayList<>();

/*        List<Aluno> alunosAprovado = new ArrayList<>();
        List<Aluno> alunosRecuperacao = new ArrayList<>();
        List<Aluno> alunosReprovado = new ArrayList<>();*/

            HashMap<String, List<Aluno>> maps = new HashMap<>();


            for (int qtd = 1; qtd <= 2; qtd++) {
                String nome = JOptionPane.showInputDialog("Qual seu nome " + qtd + " ?");

                Aluno aluno1 = new Aluno();
                aluno1.setNome(nome);
                System.out.println("Ola mundo");

                for (int pos = 1; pos <= 1; pos++) {
                    String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
                    String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

                    Disciplina disciplina = new Disciplina();
                    disciplina.setDisciplina(nomeDisciplina);
                    disciplina.setNota(Double.valueOf(notaDisciplina));
                    aluno1.getDisciplinas().add(disciplina);
                }

        /*int escolha = JOptionPane.showConfirmDialog(null, "Deseja remove alguma disciplina?");
        if (escolha == 0) {
            int continuarRemover = 0;
            int posicao = 1;
            while (continuarRemover == 0) {
                String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 e 4");
                aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
                posicao++;
                continuarRemover = JOptionPane.showConfirmDialog(null, "Continual remover ?");
            }
        }*/
                alunos.add(aluno1);
            }
            maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
            maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
            maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

            for (Aluno aluno : alunos) {
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
                    maps.get(StatusAluno.APROVADO).add(aluno);
                }
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                    maps.get(StatusAluno.RECUPERACAO).add(aluno);
                }
                if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
                    maps.get(StatusAluno.REPROVADO).add(aluno);
                }
            }
            System.out.println("------- Lista do Aprovados ---------");
            for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
                System.out.println("aluno: " + aluno.getNome() + " Media: " + aluno.getMediaNota());
            }
            System.out.println("------- Lista do Recuperação ---------");
            for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
                System.out.println("aluno: " + aluno.getNome() + " Media: " + aluno.getMediaNota());
            }
            System.out.println("------- Lista do Reprovados ---------");
            for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
                System.out.println("aluno: " + aluno.getNome() + " Media: " + aluno.getMediaNota());
            }

            
           Secretario secretario1 = new Secretario();
            secretario1.setNome("Alex");
            System.out.println("Nome " +secretario1.getNome());		



      /*  for (int pos = 0; pos < alunos.size(); pos++) {
            Aluno aluno = alunos.get(pos);

           if (aluno.getNome().equalsIgnoreCase("alex")){
                Aluno trocar = new Aluno();
                trocar.setNome("aluno trocado");

                Disciplina dis = new Disciplina();
                dis.setDisciplina("angular");
                dis.setNota(8);

                trocar.getDisciplinas().add(dis);

                alunos.set(pos, trocar);
                aluno = alunos.get(pos);
            }

            System.out.println("Aluno = " + aluno.getNome());
            System.out.println("media = " +aluno.getMediaNota());
            System.out.println("Resultado = " +aluno.getAlunoAprovado2());
            for (Disciplina disc : aluno.getDisciplinas()){
                System.out.println("MAteria = " + disc.getDisciplina() + "Nota = "+disc.getNota());
            }

            System.out.println("---------------------------------------------");

        } */

       /* for (Aluno aluno: alunos) {

            System.out.println("Nome:" + aluno.getNome());
            System.out.println("A media: " + aluno.getMediaNota());
            System.out.println("Resultado: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
            System.out.println("Resultado final: " + aluno.getAlunoAprovado2());
            System.out.println("Disciplina: " + aluno.getDisciplinas().toString());
            System.out.println(aluno.toString());
            System.out.println("------------------------------------------------------------------------");
        }*/
        }else {
        	JOptionPane.showInternalMessageDialog(null, "Acesso não permitido!");
        }
    }
}
