package trabalhoFinal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    // Alunos: Nilson de Araujo Souza Junior,  Anderson Mendes Munhoz, Henrique Kasprzak Bernardo .
	public static void main(String[] args) throws IOException {
		int opcao = 0;
		Scanner ler = new Scanner(System.in);
		Jogo jogo = new Jogo();
		Personagem personagem= new Personagem();
		ArrayList<Jogo> listJogos = new ArrayList<>();
		Arquivo arq = new Arquivo();


		do {
			System.out.println("Digite uma oção");
			System.out.println("1. Cadastrar jogo");
			System.out.println("2. Buscar jogo");
			System.out.println("3. Atualizar jogo");
			System.out.println("4. Deletar jogo");
			System.out.println("5. Visualizar dados");
			opcao = ler.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("1. Cadastrar jogo");
			System.out.println("Digite o nome do jogo");
			
			jogo.setNome(ler.next());
			System.out.println("Digite o nome do autor do jogo");
			jogo.setAutor(ler.next());
			System.out.println("Digite o ano de lançamento do jogo");
			jogo.setAnoLancamento(ler.next());
			System.out.println("Digite o nome do personagem");
			personagem.setNome(ler.next());
			System.out.println("Digite o nome do autor do personagem");
			personagem.setAutor(ler.next());
			System.out.println("Digite o ano de lançamento do personagem");
			personagem.setAnoLancamento(ler.next());
			System.out.println("Digite a força do personagem");
			personagem.setForca(ler.nextInt());
			try {
				jogo.adicionarJogo(jogo,personagem);
				arq.gravaNoArq("Jogo gravado com sucesso " + jogo.toString());

			} catch (ExcecaoAdicionarJogo e) {
				System.out.println("Houve um erro em adicionar o jogo,tente novamente" + e.getMessage());
			}
			
			break;

		case 2:
			System.out.println("2. Buscar jogo e personagem");
			System.out.println("Digite o nome do jogo");
			jogo.buscarJogo(ler.next());
			

			break;

		case 3:
			
			listJogos = jogo.getListJogos();
			System.out.println("3. Atualizar jogo");
			System.out.println("Digite o nome do jogo para atualizar");
			String nomeAtualizar = ler.next();
			
			for (Jogo jogol : listJogos) {
				if(jogol.getNome().equals(nomeAtualizar)) {
				System.out.println("Nome Personagem: " + jogol.getNome() + "Ano Lancamento: " + jogol.getAnoLancamento()
			    + "personagem: " + jogol.personagemlista.toString());
				System.out.println("Digite o nome do jogo r");
				jogol.setNome(ler.next());
				System.out.println("Digite o nome do autor do jogo");
				jogol.setAutor(ler.next());
				System.out.println("Digite o ano de lançamento do jogo");
				jogol.setAnoLancamento(ler.next());
				System.out.println("Digite o nome do personagem");
				personagem.setNome(ler.next());
				System.out.println("Digite o nome do autor do personagem");
				personagem.setAutor(ler.next());
				System.out.println("Digite o ano de lançamento do personagem");
				personagem.setAnoLancamento(ler.next());
				System.out.println("Digite a força do personagem");
				personagem.setForca(ler.nextInt());
				jogol.personagemlista.add(personagem);

				System.out.println("jogo atualizado com sucesso");
				arq.gravaNoArq("Jogo " + nomeAtualizar + " atualizado com sucesso para -> " + jogo.toString() + personagem.toString());
				
				}else {
					System.out.println("Nenhum jogo encontrado");
				}
			}
		
			break;

		case 4:
			System.out.println("4. Deletar jogo");
			System.out.println("Digite o nome do jogo para deletar tudo");
			jogo.deletarJogo(ler.next());

			break;

		case 5:
			System.out.println("5. Visualizar dados");
			arq.buscarNoArq();
			break;

		default:
			break;
		}
		}while(opcao!= 10);
	}

}
