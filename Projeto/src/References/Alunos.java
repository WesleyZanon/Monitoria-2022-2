package References;

import Arrays.ArrayAlunos;
import Class.Aluno;

public class Alunos {
	
	
	public static void cadastrosAleatorios(ArrayAlunos l) {
		

		Aluno a [] = new Aluno[10];
		

		a[0] = new Aluno("matheus", "1196582", "wes@eds.com", "mecatronica", 1, 68.87);
		l.cadastrarAluno(a[0]);
		

		a[1] = new Aluno("wesley", "11944482", "aka@eds.com", "jogos", 2, 55);
		l.cadastrarAluno(a[1]);
		
		a[2] = new Aluno("davi", "126145", "jobs@eds.com", "jogos", 3, 68);
		l.cadastrarAluno(a[2]);
		
		a[3] = new Aluno("gabriella", "116145", "robertoobs@eds.com", "computacao", 4, 52);
		l.cadastrarAluno(a[3]);
		
		a[4] = new Aluno("gabriel", "1341", "asdsa@eds.com", "civil", 5, 80);
		l.cadastrarAluno(a[4]);
		
		a[5] = new Aluno("luiz", "116145", "robertoobs@eds.com", "computacao", 6, 95);
		l.cadastrarAluno(a[5]);
		
		a[6] = new Aluno("cintia", "116145", "robertoobs@eds.com", "computacao", 7, 68);
		l.cadastrarAluno(a[6]);

		a[7] = new Aluno("amanda", "116145", "robertoobs@eds.com", "civil", 8, 75);
		l.cadastrarAluno(a[7]);
		
		a[8] = new Aluno("rafaella", "116145", "robertoobs@eds.com", "computacao", 9, 92);
		l.cadastrarAluno(a[8]);
		
		a[9] = new Aluno("joao", "116145", "robertoobs@eds.com", "computacao", 10, 98.5);
		l.cadastrarAluno(a[9]);



		System.out.println("\n\nCadastrados com sucesso\n\n\n");
		
	}

}
