
public class Joueur {

	private String Nom;
	private int Score;
	
	public Joueur(){
		Score = 0;
		Nom = "Joueur";
	}
	
	public Joueur(String n){
		Score = 0;
		Nom = n;
	}
	
	public String getNom(){
		return Nom;
	}
	
	//Ajout de points au score
	public void adScore(int sc){
		Score += sc;
	}
	
	//Retire des points au score
	public void removeScore(int sc){
		Score -= sc;
	}
	
	public int getScore(){
		return Score;
	}
}
