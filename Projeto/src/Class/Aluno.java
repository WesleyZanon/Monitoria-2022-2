package Class;

public class Aluno extends Pessoa{
	
	
	
	private String curso;
	private int ra;
	private double pontos;


	public Aluno(String nome, String telefone, String email, String curso, int ra, double pontos) {
		super(nome, telefone, email);
		this.curso = curso;
		this.ra = ra;
		this.pontos = pontos;
	}


	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public double getPontos() {
		return pontos;
	}
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	
	
	public void imprimir() {
		super.imprimir();
		System.out.println("RA: "+ra);
		System.out.println("Curso: "+curso);
		System.out.println("pontuação: "+pontos);
		System.out.println("\n");
	}
	
	
	
	
	
	

	
	
	
	

}
