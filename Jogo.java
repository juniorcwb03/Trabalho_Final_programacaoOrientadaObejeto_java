package trabalhoFinal;
import java.io.IOException;
import java.util.ArrayList;

public class Jogo {
	private  String nome;
	private String AnoLancamento;
	private String autor;
	
	ArrayList<Jogo> listJogos = new ArrayList<>();
	ArrayList<Personagem> personagemlista = new ArrayList<>();
	private Arquivo arq = new Arquivo();

	private Personagem perso;
	
	public Jogo() {
	       
	  
	    }

    public Jogo(String nome, String AnoLancamento, String autor,Personagem personagem) {
        this.nome = nome;
        this.AnoLancamento=AnoLancamento;
        this.autor= autor;
        this.perso=personagem;
  
    }
	
	public Jogo(String nome, String AnoLancamento) {
        this.nome = nome;
        this.AnoLancamento=AnoLancamento;
    }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAnoLancamento() {
		return AnoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		AnoLancamento = anoLancamento;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	 public Personagem getPerso() {
			return perso;
		}

		public void setPerso(Personagem perso) {
			this.perso = perso;
		}
	
		public ArrayList<Jogo> getListJogos() {
			return listJogos;
		}

		public void setListJogos(ArrayList<Jogo> listJogos) {
			this.listJogos = listJogos;
		}

		public ArrayList<Personagem> getPersonagemlista() {
			return personagemlista;
		}

		public void setPersonagemlista(ArrayList<Personagem> personagemlista) {
			this.personagemlista = personagemlista;
		}
		
	public void adicionarJogo(Jogo jogo, Personagem personagem) throws ExcecaoAdicionarJogo {
	
		personagemlista.add(personagem);
		personagem.setPersonagemlista(personagemlista);
		jogo.setPersonagemlista(personagemlista);
		listJogos.add(jogo);
		
	
		
	}
	
	public void buscarJogo(String nome) throws IOException {
		perso = new Personagem();
		if(!listJogos.isEmpty()) {
		for (Jogo jogol : listJogos) {
			if(jogol.nome.equals(nome)) {
			arq.gravaNoArq("Buscando jogo" + " Nome Personagem: " + jogol.getNome() + " Ano Lancamento: " + jogol.getAnoLancamento()
			    + " personagem: " + jogol.personagemlista.toString());
				System.out.println("Buscando jogo" + " Nome jogo: " + jogol.getNome() + " Ano Lancamento jogo: " + jogol.getAnoLancamento()
				    + " personagem: " + jogol.personagemlista.toString());
			}else {
				arq.gravaNoArq(" Buscando jogo ,Nenhum jogo encontrado ");
				System.out.println(" Nenhum jogo encontrado ");
			}
		}
		}else {
			arq.gravaNoArq(" Buscando jogo ,não possui jogos ");
			System.out.println("não possui jogos");
		}
		
	}
	
	public void deletarJogo(String nome) throws IOException {
		for (int i = 0; i < listJogos.size(); i++) {
			if(listJogos.get(i).getNome().equals(nome)) {
				arq.gravaNoArq("jogo excluido com sucesso" + toString());
				listJogos.remove(listJogos.get(i));
				System.out.println("Nome jogo excluido com sucesso");
				
				
			}else {
				System.out.println("Nenhum jogo encontrado");
				arq.gravaNoArq("nome a buscar " + nome + "Nenhum jogo encontrado");
			}
		}
	}
	
	public String toString() {
		   return  " Nome jogo : " + getNome() + " Ano Lancamento : " + getAnoLancamento()
		    + " Autor :" + getAutor();
		  }
		

}
