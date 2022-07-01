package trabalhoFinal;

import java.util.ArrayList;

public class Personagem extends Jogo {
	private int forca;
	
	private ArrayList<Personagem> listPersonagem = new ArrayList<>();
	


	public Personagem(String nome, String AnoLancamento, int forca) {
        super(nome, AnoLancamento);
        this.forca = forca;
    }
	
	public Personagem() {

    }
	
	public ArrayList<Personagem> getListPersonagem() {
		return listPersonagem;
	}

	public void setListPersonagem(ArrayList<Personagem> listPersonagem) {
		this.listPersonagem = listPersonagem;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}
	
	
	public String toString() {
		   return  " Nome Personagem: " + super.getNome() + " Ano Lancamento: " + super.getAnoLancamento()
		    + " Força: " + this.getForca();
		  }
	

}
