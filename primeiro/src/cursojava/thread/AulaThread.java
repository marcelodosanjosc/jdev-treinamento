package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		Thread threadEmail  = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
		
		System.out.println("chegou o fim do processor");
		JOptionPane.showMessageDialog(null, "SISTEMA CONTINUA EXECUTANDO PARA O USUARIO");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando algo rotina, por exemplo envio de e-mail");
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for(int pos = 0; pos < 10; pos++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando algo rotina, por exemplo envio de nota fiscal");
			}
			
		}
	};
}
