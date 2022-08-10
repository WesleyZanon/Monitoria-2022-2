package Class;

import Arrays.ArrayAlunos;
import Styles.Menus;
import References.Alunos;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declarando as classes
		Scanner output = new Scanner(System.in);
		ArrayAlunos list = new ArrayAlunos();
		Menus menu = new Menus();
		Alunos Aleatorios = new Alunos();
		
		
		
		//variavel para opções de menu
		int op=0;
		
		
		do {
			
			menu.Menus();
			op = output.nextInt();
			System.out.println("\n\n");
			
			
			switch(op) {
			
				case 1:
					cadastrar(list);
				break;
				
				
				case 2:
					listarTodos(list);
				break;
				
				case 3:
					pesquisarAlunoRa(list);
				break;
				
				case 4:
					pesquisarAlunoCurso(list);
					break;
				
				
				case 6:
					Aleatorios.cadastrosAleatorios(list);;
				break;
				
				default:
					System.out.println("\n\nDigite uma opção valida\n\n");
					break;
			
			
			}
		}while(op!=5);
		
		
		
		
	}
	
	public static void cadastrar(ArrayAlunos l) {
		
		Scanner output = new Scanner(System.in);
		
		//declarando variaveis vazias
		String nome = " ";
		String telefone = " ";
		String email = " ";
		String curso = " ";
		double pontos = 0.0;
		int ra = l.gerarRa();
		int op = 0;
		
		
		System.out.println("\n\nDigite o Nome do Aluno :\n");
		nome = output.nextLine();
		
		
		do {
			
			System.out.println("Digite o curso do Aluno :");
			System.out.println("1.civil");
			System.out.println("2.jogos");
			System.out.println("3.mecatronica");
			
			op = output.nextInt();
			
			//loop para que possa digitar o curso correto
			switch(op) {
				case 1:
					curso = "civil";
					break;
				
				case 2:
					curso = "jogos";
					break;
				
				case 3:
					curso = "mecatronica";
					break;
				
				default:
					System.out.println("\nEscolha um curso existente!\n");
					break;
			}
			
			
				
				
		}while(op!=1 && op!=2 && op!=3);
		
		
		System.out.println("Digite o email Aluno :");
		email =output.nextLine();

		System.out.println("Digite a pontuação do Aluno :");
		pontos = output.nextDouble();
		
		System.out.println("\nAluno cadastrado com o RA :"+ra);
		
		System.out.println("Digite o telefone para contato :");
		telefone = output.nextLine();

		
		Aluno a = new Aluno(nome, telefone, email, curso, ra, pontos);
		
		l.cadastrarAluno(a);
		
		System.out.println("\nAluno cadastrado com sucesso\n");
		System.out.println("\n\n\n");
		
		
		
	}
	
	
	
	public static void listarTodos(ArrayAlunos l) {
		l.listar();
		System.out.println("\n\n\n");
	}
	
	
	public static void pesquisarAlunoRa(ArrayAlunos l) {
		
		Scanner output = new Scanner(System.in);
		int ra;
		
		System.out.println("Digite o RA: ");
		ra = output.nextInt();
		
		Aluno a = l.buscarAlunoRa(ra);
		a.imprimir();
		
		System.out.println("\n\n");
	}
	
	
	public static void pesquisarAlunoCurso(ArrayAlunos l) {
		
		ArrayList <Aluno> lista = new ArrayList(); 
		Scanner output = new Scanner(System.in);
		
		System.out.println("Curso: ");
		String curso = output.nextLine();
		
		
		lista = l.buscarAlunos(curso);
		
		for(int i=0; i<lista.size();i++)
		{
			lista.get(i).imprimir();
		}
		System.out.println("\n\n");
	}
	

	

}
