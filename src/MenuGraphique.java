import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuGraphique extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	private JButton Quitter;
	private JButton Local;
	private JButton Auto;
	private JButton LAN;
	
	
	public MenuGraphique(){
		
		Quitter = new JButton("Quitter");
		Quitter.setAlignmentX(Component.CENTER_ALIGNMENT);
		Local = new JButton("Démarrer partie sur la machine");
		Local.setAlignmentX(Component.CENTER_ALIGNMENT);
		LAN = new JButton("Démarrer une LAN");
		LAN.setAlignmentX(Component.CENTER_ALIGNMENT);
		Auto = new JButton("Démarrer partie avec placement automatique");
		Auto.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		setLocationRelativeTo(null);
		setTitle("Menu");
		setSize(350, 145);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BoxLayout boxLayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(boxLayout);
		add(Auto);
		Auto.addActionListener(this);
		add(Local);
		Local.addActionListener(this);
		add(LAN);
		LAN.addActionListener(this);
		add(Quitter);
		Quitter.addActionListener(this);
		
		
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == Quitter) System.exit(0);
		
		if(e.getSource() == Local){
			setVisible(false);
			new interfaceG();
		}
		if(e.getSource() == Auto){
			setVisible(false);
			new InterfaceGAuto();
		}
		
		if(e.getSource() == LAN){
			LAN.setText("pour une version future (désolé)");
		}
	}
}
