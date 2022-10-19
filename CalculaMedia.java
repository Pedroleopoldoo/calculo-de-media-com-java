package calculoMedia;

public class CalculaMedia{
	Semestre geral = new Semestre();
	Aleatorio al = new Aleatorio();
	
	
	private int mediaFinal = 0;
	private int primeira; 
	private int segunda; 
	private int media;
	
	public void setPrimeira(int primeira) {
		this.primeira = al.getRandom().nextInt(1, 10);;
	}
	
	public void setSegunda(int segunda) {
		this.segunda = al.getRandom().nextInt(1, 10);;
	}
	
	public int getPrimeira() {
		return primeira;
	}
	
	public int getSegunda() {
		return segunda;
	}
	
	public int getMedia() {
		return media;
	}
	
	public void setMedia(int media) {
		media = (primeira + segunda) / 2;
		this.media = media;
	}

	public int getMediaFinal(){
		return mediaFinal;
	}
	
	public void setMediaFinal(int mediaFinal) {
		this.mediaFinal += mediaFinal;
	}
}
