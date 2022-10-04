package calculoMedia;

public class PrimeiraTentativa {
	public static void main(String[] args) {
		Organiza geral = new Organiza();
		while (geral.getSemestres() <= 4) {
			
			int primeira = geral.getRandom().nextInt(1, 10);
			int segunda = geral.getRandom().nextInt(1, 10);
			int media = (primeira + segunda) / 2;
			
			if (media <= 4) {
				System.out.println("Com a media de " + media + " no " + geral.getSemestres() + "º semestre, Você está reprovado");
			} else if(media <= 6) {
				System.out.println("Com a media de " + media + " no " + geral.getSemestres() + "º semestre, Você está de recuperação");
			} else if (media <= 10){
				System.out.println("Com a media de " + media + " no " + geral.getSemestres() + "º semestre, Você passou, parabens");
			}
			geral.setMediaFinal(media);
			geral.setSemestres(1);
		}
		if((geral.getMediaFinal()/4) <= 4) {
			System.out.println("Com uma média final de " + (geral.getMediaFinal() / 4) + " Você está REPROVADO, até ano que vem");
		} else if(geral.getMediaFinal()/4 <= 6) {
			System.out.println("Com uma média final de " + (geral.getMediaFinal() / 4) + " Você está de recuperação final");
		} else if (geral.getMediaFinal()/4 <= 10){
			System.out.println("Com uma média final de " + (geral.getMediaFinal() / 4) + " Você está aprovado");
		}
	}
}
