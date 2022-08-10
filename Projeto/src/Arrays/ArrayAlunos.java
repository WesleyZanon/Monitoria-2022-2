package Arrays;
import Class.Aluno;

import java.util.*;

public class ArrayAlunos {
	
	//lista para alunos cadastrados
	private ArrayList <Aluno> ListaAluno = new ArrayList();
	
	//lista para alunos de cada curso para pesquisa
	private ArrayList <Aluno> ListaCurso = new ArrayList();
	
	
	public void cadastrarAluno (Aluno a)
	{
		ListaAluno.add(a);
	}
	
	public void listar()
	{
		if(ListaAluno.isEmpty())
		{
			System.out.println(" --Nada a Imprimir - Lista vazia");
		}
		else
		{
			for(int i=0; i<ListaAluno.size();i++)
			{
				ListaAluno.get(i).imprimir();
			}
		}
	}
	
	
	public int gerarRa() {
		return ListaAluno.size() +1 ;
	}
	
	
	public Aluno buscarAlunoRa(int ra)
	{
		if(ListaAluno.isEmpty()) {
			System.out.println(" --Nada a Imprimir - Lista vazia");
			return null;
		}	
		
		else
		{
			for(Aluno a: ListaAluno)
			{
				if(a.getRa() == ra)
					return(a);
			}
			
		}
		System.out.println(" --Nada a Imprimir - Lista vazia");
		return null;
}
	
	public ArrayList<Aluno> buscarAlunos(String curso) {
		
		ListaCurso.clear();
		
		
			if(ListaAluno.isEmpty()) {
				System.out.println(" --Nada a Imprimir - Lista vazia");
				return null;
			}	
			
			else
			{
				for(Aluno a: ListaAluno)
				{
					if(a.getCurso().equals(curso))
						ListaCurso.add(a);
				}
				
			}
			if(ListaCurso.isEmpty())
				System.out.println(" --Nada a Imprimir - nao tem alunos nesse curso");
			return ListaCurso;
	}


}
