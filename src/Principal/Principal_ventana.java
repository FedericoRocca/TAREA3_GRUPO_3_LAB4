package Principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Ejercicio1.Ventana1;
import Ejercicio2.Ventana2;
import Ejercicio3.Ventana3;

public class Principal_ventana extends JFrame{

	private static final long serialVersionUID = 1L;

	public Principal_ventana() {
		setBounds(50, 100, 498, 328);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setTitle("Menu principal");
		getContentPane().setLayout(null);
		
//		Botones		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.setBounds(182, 104, 110, 30);
		getContentPane().add(btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.setBounds(182, 159, 110, 30);
		getContentPane().add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.setBounds(182, 209, 110, 30);
		getContentPane().add(btnEjercicio3);
		
		JLabel lblNewLabel = new JLabel("  Grupo N\u00BA 3");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(182, 45, 110, 30);
		getContentPane().add(lblNewLabel);
		
		//Abrir Ventana Ejercicio 1
		Ventana1 ventana1 = new Ventana1();
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana1.setVisible(true);	
			}
		});

		//Abrir Ventana Ejercicio 2
		Ventana2 ventana2 = new Ventana2();
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana2.setVisible(true);
			}
		});

		//Abrir Ventana Ejercicio 3
		Ventana3 ventana3 = new Ventana3();
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana3.setVisible(true);
			}
		});
		
	}
	
	public void cambiarVisibilidad(boolean estado) {
		setVisible(estado);
	}
}
