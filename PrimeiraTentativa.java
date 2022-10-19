package calculoMedia;

public class PrimeiraTentativa {
	public static void main(String[] args) {
		Semestre geral = new Semestre();
		CalculaMedia cm = new CalculaMedia();
		while (geral.getSemestres() <= 4) {
			
			cm.setPrimeira(0);
			cm.setSegunda(0);
			cm.setMedia(0);
			
			if (cm.getMedia() <= 4) {
				System.out.println("Com a media de " + cm.getMedia() + " no " + geral.getSemestres() + "º semestre, Você está reprovado");
			} else if(cm.getMedia() <= 6) {
				System.out.println("Com a media de " + cm.getMedia() + " no " + geral.getSemestres() + "º semestre, Você está de recuperação");
			} else if (cm.getMedia() <= 10){
				System.out.println("Com a media de " + cm.getMedia() + " no " + geral.getSemestres() + "º semestre, Você passou, parabens");
			}
			cm.setMediaFinal(cm.getMedia());
			geral.setSemestres(1);
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
