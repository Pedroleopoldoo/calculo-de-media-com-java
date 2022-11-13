package calculoMedia;

public class CalculaMedia{
	Semestre geral = new Semestre();
	Aleatorio al = new Aleatorio();
	
	private int mediaFinal = 0;
	private int primeiraNota; 
	private int segundaNota; 
	private int media;
	
	public void setPrimeiraNota(int primeira) {
		this.primeiraNota = al.getRandom().nextInt(1, 10);;
	}
	
	public void setSegundaNota(int segunda) {
		this.segundaNota = al.getRandom().nextInt(1, 10);;
	}
	
	public int getPrimeiraNota() {
		return primeiraNota;
	}
	
	public int getSegundaNota() {
		return segundaNota;
	}
	
	public int getMedia() {
		return media;
	}
	
	public void setMedia(int media) {
		media = (primeiraNota + segundaNota) / 2;
		this.media = media;
	}

	public int getMediaFinal(){
		return mediaFinal;
	}
	
	public void setMediaFinal(int mediaFinal) {
		this.mediaFinal += mediaFinal;
	}
}
