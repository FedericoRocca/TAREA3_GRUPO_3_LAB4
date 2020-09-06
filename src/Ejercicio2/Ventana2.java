package Ejercicio2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Ventana2 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextField textFieldN3;
	private JTextField textFieldN2;
	private JTextField textFieldN1;
	private JTextField textFieldPro;
	private JTextField textFieldCond;
	private JComboBox<String> CB;
	
	public Ventana2() {
		setBounds(200, 200, 537, 417);
		setTitle("Promedio");
		getContentPane().setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(63, 218, 282, 139);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		textFieldPro = new JTextField();
		textFieldPro.setBounds(88, 40, 116, 22);
		panel_2.add(textFieldPro);
		textFieldPro.setColumns(10);
		
		textFieldCond = new JTextField();
		textFieldCond.setBounds(88, 75, 116, 22);
		panel_2.add(textFieldCond);
		textFieldCond.setColumns(10);
		
		JLabel lblPro = new JLabel("Promedio:");
		lblPro.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPro.setBounds(20, 43, 66, 16);
		panel_2.add(lblPro);
		
		JLabel lblCond = new JLabel("Condicion");
		lblCond.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCond.setBounds(20, 78, 66, 16);
		panel_2.add(lblCond);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
			    textFieldN1.setBackground(Color.white);
			    textFieldN2.setBackground(Color.white);
			    textFieldN3.setBackground(Color.white);
			    textFieldPro.setBackground(Color.white);
			    textFieldCond.setBackground(Color.white);
			    
			    if( textFieldN1.getText().equals("") )
			    {
			        textFieldN1.setBackground(Color.red);
			    }
			    
			    if( textFieldN2.getText().equals("") )
                {
                    textFieldN2.setBackground(Color.red);
                }
			    
			    if( textFieldN3.getText().equals("") )
                {
                    textFieldN3.setBackground(Color.red);
                }
			    
			    if( textFieldPro.getText().equals("") )
                {
			        textFieldPro.setBackground(Color.red);
                }
			    
			    if( textFieldCond.getText().equals("") )
                {
			        textFieldCond.setBackground(Color.red);
                }

				String item;
				item = CB.getSelectedItem().toString();
				try
                {
				    int N1 = Integer.parseInt(textFieldN1.getText());
	                int N2 = Integer.parseInt(textFieldN2.getText());
	                int N3 = Integer.parseInt(textFieldN3.getText());
	                
	                int promedio = (N1+N2+N3)/3;
	                
	                textFieldPro.setText(String.valueOf(promedio));        

	                //if (textFieldN1.getText().isEmpty()  && textFieldN2.getText().isEmpty()  && textFieldN3.getText().isEmpty())
	                //{
	                    //JOptionPane.showMessageDialog(null, "Debe ingresar datos");
	                //}
	                
	                if(N1>=8 && N2>=8 && N3>=8 && item.equalsIgnoreCase("Aprobado" ) ) {
	                    textFieldCond.setText("PROMOCIONADO");
	                }
	                else if(N1>5 && N2>5 && N3>5 && item.equalsIgnoreCase("Aprobado" )) {
	                    textFieldCond.setText("REGULAR");
	                }
	                else
	                {
	                    textFieldCond.setText("LIBRE");
	                }
                }
                catch (NumberFormatException e2)
                {
                    JOptionPane.showMessageDialog(null, "Uno de las notas ingresadas es erronea");
                }
 			} 
		});
		btnCalcular.setBounds(357, 80, 97, 38);
		getContentPane().add(btnCalcular);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/// Limpiar cajas de texto
				
				textFieldN1.setText(null);
				textFieldN2.setText(null);
				textFieldN3.setText(null);
				textFieldPro.setText(null);
				textFieldCond.setText(null);
				
				// Limpiar combobox
			
				CB.setSelectedIndex(-1);
				dispose();
				
			}
		});
		btnSalir.setBounds(357, 159, 97, 38);
		getContentPane().add(btnSalir);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        textFieldN1.setText("");
		        textFieldN2.setText("");
		        textFieldN3.setText("");
		        textFieldPro.setText("");
		        textFieldCond.setText("");
		    }
		});
		btnNuevo.setBounds(357, 120, 97, 38);
		getContentPane().add(btnNuevo);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas del Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panel_1.setBounds(63, 29, 282, 168);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblN1 = new JLabel("Nota 1:");
		lblN1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblN1.setBounds(30, 38, 56, 16);
		panel_1.add(lblN1);
		
		JLabel lblN2 = new JLabel("Nota 2:");
		lblN2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblN2.setBounds(30, 67, 56, 16);
		panel_1.add(lblN2);
		
		JLabel lblN3 = new JLabel("Nota 3:");
		lblN3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblN3.setBounds(30, 96, 56, 16);
		panel_1.add(lblN3);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTPS.setBounds(30, 125, 56, 16);
		panel_1.add(lblTPS);
		
		CB = new JComboBox<String>();
		CB.setBounds(98, 122, 117, 22);
		CB.addItem("Aprobado");
		CB.addItem("Desaprobado");
		panel_1.add(CB);
		
		textFieldN3 = new JTextField();
		textFieldN3.setBounds(98, 93, 117, 22);
		panel_1.add(textFieldN3);
		textFieldN3.setColumns(10);
		
		textFieldN2 = new JTextField();
		textFieldN2.setBounds(98, 64, 116, 22);
		panel_1.add(textFieldN2);
		textFieldN2.setColumns(10);
		
		textFieldN1 = new JTextField();
		textFieldN1.setBounds(99, 35, 116, 22);
		panel_1.add(textFieldN1);
		textFieldN1.setColumns(10);
	}

}


