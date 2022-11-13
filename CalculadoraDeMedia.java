package calculoMedia;

public class CalculadoraDeMedia {
	public static void main(String[] args) {
		Semestre sem = new Semestre();
		CalculaMedia cm = new CalculaMedia();
		while (sem.getSemestres() <= 4) {
			
			cm.setPrimeiraNota(0);
			cm.setSegundaNota(0);
			cm.setMedia(0);
			if (cm.getMedia() <= 4) {
				System.out.println("Com a media de " + cm.getMedia() + " no " + sem.getSemestres() + "º semestre, Você está reprovado");
			} else if(cm.getMedia() <= 6) {
				System.out.println("Com a media de " + cm.getMedia() + " no " + sem.getSemestres() + "º semestre, Você está de recuperação");
			} else if (cm.getMedia() <= 10){
				System.out.println("Com a media de " + cm.getMedia() + " no " + sem.getSemestres() + "º semestre, Você passou, parabens");
			}
			cm.setMediaFinal(cm.getMedia());
			sem.setSemestres(1);
		}
		if((cm.getMediaFinal()/4) <= 4) {
			System.out.println("Com uma média final de " + (cm.getMediaFinal() / 4) + " Você está REPROVADO, até ano que vem");
		} else if(cm.getMediaFinal()/4 <= 6) {
			System.out.println("Com uma média final de " + (cm.getMediaFinal() / 4) + " Você está de recuperação final");
		} else if (cm.getMediaFinal()/4 <= 10){
			System.out.println("Com uma média final de " + (cm.getMediaFinal() / 4) + " Você está aprovado");
		}
	}
}
