/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

public class PessoaCadastro extends Pessoa{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PessoaCadastro() {
		
	}

	public PessoaCadastro(String nome, int idade, String celular, String cpf, String senha) {
		super(nome, idade, celular, cpf, senha);
	}

	@Override
	public String toString() {
		return "PessoaCadastro "
				+ "Nome" + getNome() +
				"Idade" + getIdade() + 
				"Celular"+ getCelular() +
				"Cpf" + getCpf() + 
				"Senha" + getSenha() + 
				" toString()=" + super.toString() ;
	}
	
}