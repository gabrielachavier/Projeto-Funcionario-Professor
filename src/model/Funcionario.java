package model;

public abstract class Funcionario {
	private static String nome;
	private static String endereco;
	private static String bairro;
	private static int cep;
	private static String cidade;
	private static String estado;
	private static long rg;
	private static long cpf;
	public static String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Funcionario.nome = nome;
	}
	public static String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		Funcionario.endereco = endereco;
	}
	public static String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		Funcionario.bairro = bairro;
	}
	public static int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		Funcionario.cep = cep;
	}
	public static String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		Funcionario.cidade = cidade;
	}
	public static String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		Funcionario.estado = estado;
	}
	public static long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		Funcionario.rg = rg;
	}
	public static long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		Funcionario.cpf = cpf;
	}
	public double aumentoSalarial(double horaAula, double aumento) {
		// TODO Auto-generated method stub
		return 0;
	}

}
