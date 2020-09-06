package Ejercicio1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana1 extends JFrame {

	private JTextField textField_LastName;
	private JTextField textField_Phone;
	private JTextField textField_Date;
	private JTextField textField_Name;
	private JButton btnMostrar;
	private JLabel lblResultado;
	
	public Ventana1() {
		setFont(new Font("Dialog", Font.BOLD, 80));
		setBounds(200, 200, 505, 419);
		setTitle("Contactos");
		getContentPane().setLayout(null);
		
		lblResultado = new JLabel("");
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(46, 31, 78, 14);
		getContentPane().add(lblNombre);
		
		textField_Name = new JTextField();
		textField_Name.setBounds(144, 28, 235, 20);
		getContentPane().add(textField_Name);
		textField_Name.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(46, 76, 66, 14);
		getContentPane().add(lblApellido);
		
		textField_LastName = new JTextField();
		textField_LastName.setBounds(144, 73, 235, 20);
		getContentPane().add(textField_LastName);
		textField_LastName.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(46, 129, 78, 14);
		getContentPane().add(lblTelefono);
				
		textField_Phone = new JTextField();
		textField_Phone.setBounds(144, 126, 235, 20);
		getContentPane().add(textField_Phone);
		textField_Phone.setColumns(10);
		
		JLabel lblFechaNac = new JLabel("Fecha Nac");
		lblFechaNac.setBounds(46, 175, 78, 14);
		getContentPane().add(lblFechaNac);
		
		textField_Date = new JTextField();
		textField_Date.setBounds(144, 172, 235, 20);
		getContentPane().add(textField_Date);
		textField_Date.setColumns(10);
		
		JLabel lblLosDatosIngresados = new JLabel("Los datos ingresados fueron: ");
		lblLosDatosIngresados.setBounds(12, 274, 170, 14);
		getContentPane().add(lblLosDatosIngresados);
		
		//lblResultado = new JLabel("");
		vaciarCampos();
		btnMostrar = new JButton("MOSTRAR");
		btnMostrar.setBounds(268, 216, 111, 33);			
		getContentPane().add(btnMostrar);		
		
		//JLabel lblResultado = new JLabel("");
		lblResultado.setText("");
		lblResultado.setBounds(22, 313, 437, 16);
		getContentPane().add(lblResultado);

		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				validarCamposVacíos(textField_Name, textField_LastName, textField_Phone, textField_Date);
				
				if(ValidarCamposIngresados(textField_Name, textField_LastName, textField_Phone, textField_Date)==true){
					lblResultado.setText(textField_Name.getText().toString() + " - "+ textField_LastName.getText() + " - "+ textField_Phone.getText() + " - " + textField_Date.getText());
					vaciarCampos();	
				}
				else {
					lblResultado.setText("");
				}
			}
		});			
	}
	
	public void validarCamposVacíos(JTextField textname, JTextField textlastname, JTextField textphone, JTextField textdate) {		
		if(textname.getText().isEmpty()) {		
			textname.setBackground(Color.red);		
		}else {			
			textname.setBackground(Color.white);	
		}
		if(textlastname.getText().isEmpty()) {		
			textlastname.setBackground(Color.red);		
		}else {			
			textlastname.setBackground(Color.white);	
		}
		if(textphone.getText().isEmpty()) {		
			textphone.setBackground(Color.red);	
		}else {			
			textphone.setBackground(Color.white);	
		}
		if(textdate.getText().isEmpty()) {		
			textdate.setBackground(Color.red);		
		}else {			
			textdate.setBackground(Color.white);	
		}
	}

	public boolean ValidarCamposIngresados(JTextField textname, JTextField textlastname, JTextField textphone, JTextField textdate) {
		if(!textname.getText().isEmpty() && !textlastname.getText().isEmpty() && !textphone.getText().isEmpty() && !textdate.getText().isEmpty()) {		
			return true;
		}
		return false;
	}
	
	public void vaciarCampos() {
		textField_Name.setText("");
		textField_LastName.setText("");
		textField_Phone.setText("");
		textField_Date.setText("");
	}
}
