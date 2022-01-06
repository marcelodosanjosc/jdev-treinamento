package cursojava.thread;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaPilhaFilaThread extends JDialog {

	private JPanel jpanel = new JPanel(new GridBagLayout());
	
	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("E-mail");
	private JTextField mostraTempo2 = new JTextField();
	
	private JButton buttonStart = new JButton("Add a Lista");
	private JButton buttonStop = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();
	

    public TelaPilhaFilaThread(){
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

        jpanel.add(mostraTempo, constraints);
        
        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        constraints.gridy ++;
        jpanel.add(descricaoHora2, constraints);
        
        mostraTempo2.setPreferredSize( new Dimension(200, 25));
        constraints.gridy ++;
 
        jpanel.add(mostraTempo2, constraints);
        
        constraints.gridwidth = 1;
        
        buttonStart.setPreferredSize(new Dimension(120, 25));
        constraints.gridy ++;
        jpanel.add(buttonStart, constraints);
        buttonStop.setPreferredSize(new Dimension(92, 25));
        constraints.gridx ++;
        jpanel.add(buttonStop, constraints);
        
        buttonStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				for (int qtd = 0; qtd < 100; qtd++) {
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
				filaThread.setNome(mostraTempo.getText());
				filaThread.setEmail(mostraTempo2.getText() + " - " +qtd);
				
				fila.add(filaThread);
				}
				

			}
        	
        });
        
        buttonStop.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		
				
	
			}
        	
        });
        
     
        fila.start();
        add(jpanel, BorderLayout.WEST);
        setVisible(true);
    }
}
