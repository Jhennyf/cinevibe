/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author jhenn
 */
public class PessoaLogin extends Pessoa {

	private static final long serialVersionUID = 1L;

	public PessoaLogin() {
		
	}
	
	public PessoaLogin(String nome, String senha) {
		super(nome, senha);
	}
	@Override
	public String toString() {
		return "PessoaLogin "
				+ "Nome" + getNome() +
				"Idade" + getIdade();
	}
}

