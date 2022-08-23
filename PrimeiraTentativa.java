package calculoMedia;
import java.util.Random;
public class PrimeiraTentativa {
	public static void main(String[] args) {
		int semestres = 1;
		Random random = new Random();
		int mediaFinal = 0;
		while (semestres <= 4) {
			
			int primeira = random.nextInt(1, 10);
			int segunda = random.nextInt(1, 10);
			int media = (primeira + segunda) / 2;
			
			if (media <= 4) {
				System.out.println("Com a media de " + media + " no " + semestres + "º semestre, Você está reprovado");
			} else if(media <= 6) {
				System.out.println("Com a media de " + media + " no " + semestres + "º semestre, Você está de recuperação");
			} else if (media <= 10){
				System.out.println("Com a media de " + media + " no " + semestres + "º semestre, Você passou, parabens");
			}
			mediaFinal += media;
			semestres++;
		}
		if((mediaFinal/4) <= 4) {
			System.out.println("Com uma média final de " + (mediaFinal / 4) + " Você está REPROVADO, até ano que vem");
		} else if(mediaFinal/4 <= 6) {
			System.out.println("Com uma média final de " + (mediaFinal / 4) + " Você está de recuperação final");
		} else if (mediaFinal/4 <= 10){
			System.out.println("Com uma média final de " + (mediaFinal / 4) + " Você está aprovado");
		}
	}
}
