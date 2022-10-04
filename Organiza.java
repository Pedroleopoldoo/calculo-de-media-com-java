package calculoMedia;
import java.util.Random;
public class Organiza {
	private int semestres = 1;
	private Random random = new Random();
	private int mediaFinal = 0;
	
	public int getSemestres() {
		return semestres;
	}
	
	public void setSemestres(int semestres) {
		this.semestres += semestres;
	}
	
	public Random getRandom() {
		return random;
	}
	
	public void setRandom(Random random) {
		this.random = random;
	}
	
	public int getMediaFinal(){
		return mediaFinal;
	}
	
	public void setMediaFinal(int mediaFinal) {
		this.mediaFinal += mediaFinal;
	}
	
}



//Arrumar a média final e semestre para que consigam somar no outro arquivo, não achei a forma correta :-(