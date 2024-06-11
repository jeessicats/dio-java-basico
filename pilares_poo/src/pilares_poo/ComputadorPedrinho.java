package pilares_poo;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger facebook = new FacebookMessenger();
		System.out.println("Facebook");
		facebook.enviarMensagem();
		facebook.receberMensagem();
		
		Telegram telegram = new Telegram();
		System.out.println("Telegram");
		telegram.enviarMensagem();
		telegram.receberMensagem();
	}
}
