package cursojava.thread;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TelaTimeThread extends JDialog {

	private JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Time thread 1");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time thread 2");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton buttonStart = new JButton("Start");
	private JButton buttonStop = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				mostraTempo2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").
						format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
    public TelaTimeThread(){
        setTitle("Tela da Thread");
        setSize(new Dimension(240, 240));
        setLocationRelativeTo(null);
        setResizable(false);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(5, 10, 5, 5);
        constraints.anchor = GridBagConstraints.WEST;
        
        
        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jpanel.add(descricaoHora, constraints);
        
        mostraTempo.setPreferredSize( new Dimension(200, 25));
        constraints.gridy ++;
        mostraTempo.setEditable(false);
        jpanel.add(mostraTempo, constraints);
        
        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        constraints.gridy ++;
        jpanel.add(descricaoHora2, constraints);
        
        mostraTempo2.setPreferredSize( new Dimension(200, 25));
        constraints.gridy ++;
        mostraTempo2.setEditable(false);
        jpanel.add(mostraTempo2, constraints);
        
        constraints.gridwidth = 1;
        
        buttonStart.setPreferredSize(new Dimension(100, 25));
        constraints.gridy ++;
        jpanel.add(buttonStart, constraints);
        buttonStop.setPreferredSize(new Dimension(100, 25));
        constraints.gridx ++;
        jpanel.add(buttonStop, constraints);
        
        buttonStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				buttonStart.setEnabled(false);
				buttonStop.setEnabled(true);
			}
        	
        });
        
        buttonStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop();
				
				buttonStart.setEnabled(true);
				buttonStop.setEnabled(false);
			}
        	
        });
        
        buttonStop.setEnabled(false);
        
        add(jpanel, BorderLayout.WEST);
        setVisible(true);
    }
}
