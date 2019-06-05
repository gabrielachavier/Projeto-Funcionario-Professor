package view;
import javax.swing.JOptionPane;

import model.professor;
import model.Funcionario;

public class execucao {
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		professor professor = new professor();
		int cur = 0;
		int dis = 0; 
		
		professor.setNome(JOptionPane.showInputDialog(null , "Nome"));
		professor.setEndereco(JOptionPane.showInputDialog(null , "Endereço"));
		professor.setBairro(JOptionPane.showInputDialog(null , "Bairro"));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null , "Cep")));
		professor.setCidade(JOptionPane.showInputDialog(null , "Cidade"));
		professor.setEstado(JOptionPane.showInputDialog(null , "Estado"));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null , "Rg")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null , "Cpf")));
		
		
		System.out.println(Funcionario.getNome());
		System.out.println(Funcionario.getEndereco());
		System.out.println(Funcionario.getBairro());
		System.out.println(Funcionario.getCep());
		System.out.println(Funcionario.getCidade());
		System.out.println(Funcionario.getEstado());
		System.out.println(Funcionario.getRg());
		System.out.println(Funcionario.getCpf());
		
		
		try {
			dis= Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Disciplinas você possui?"));
			String disciplinas[] = new String [100];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null , "Digite a Disciplina" + i); 
				
			}
			professor.setDisciplinas(disciplinas);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos você possui?"));
			String cursos [] = new String [100];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o curso" + i);
			}
			
			
			professor.setCursos(cursos);
		}   catch (Exception e) {
			e.printStackTrace();
		
			
		
		
		}
		for (int i = 0; i < cur; i++) {
			System.out.println(professor.getCursos()[i]);
		}
		for (int j = 0; j < cur; j++) {
			System.out.println(professor.getDisciplinas()[j]);
		}
		
	}
}
		
				
				
				
				
				