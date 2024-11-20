package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

public class InicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel panelnicio;
	public JTextField textFieldInicioSesion;
	public JLabel lblNewLabel;
	public JLabel lblTextError;
	public JTextField textFieldContraseña;
	public JLabel lblNewLabel_1;
	public JButton btnIniciarSesion;
	public JLabel lblName;
	public JPanel panelMesa;
	public JButton btnMesa1;
	public JLabel lblName_1;
	public JButton btnMesa6;
	public JButton btnMesa5,btnMesa3,btnMesa4,btnMesa2;
	public JButton btnAtras;
	public JLabel lblHora;
	public JLabel lblHora1;
	public JPanel panelBebida;
	public JButton btnañadircafesolo;
	public JButton btnañadircortado;
	public JButton btnañadircaramel;
	public JButton btnañadirfrapuchino;
	public JButton btnañadircolacao;
	public JButton btnaladircafeconleche;
	public JButton btnañadircafelargo;
	public JButton btnañadirzumo;
	public JList list_1;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_4;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_5;
	public JLabel lblNewLabel_6;
	public JLabel lblNewLabel_7;
	public JLabel lblNewLabel_8;
	public JLabel lblNewLabel_9;
	public JPanel panelComida;
	public JButton btnañadirtostada;
	public JButton btnañadirvolavena;
	public JButton btnañadircooki;
	public JButton btnañadirtortitas;
	public JButton btnañadirtostadadejamon;
	public JButton btnañadircroassan;
	public JButton btnañadirpalmera;
	public JButton btnañadirchurros;
	public JLabel lblNewLabel_10;
	public JLabel lblNewLabel_11;
	public JLabel lblNewLabel_12;
	public JLabel lblNewLabel_13;
	public JLabel lblNewLabel_14;
	public JLabel lblNewLabel_15;
	public JLabel lblNewLabel_16;
	public JLabel lblNewLabel_17;
	public JLabel lblName_2;
	public JLabel lblName_3;
	public JButton btnVueltasMesa;
	public JButton btnComida;
	public JButton btnBebida;
	public JButton btnVolverMesaBebida;
	public JLabel lblFondo;
	public JLabel lblFondoComida;
	public JLabel lblFondoPanelInicio;
	public JLabel lblFondoMesa;
	public JLabel lblFalloInicioSesion;
	public JLabel lblnombremesaBebida;
	public JLabel lblnombremesacomida;
	public JLabel lblnohaybebida;
	public JLabel lblnohaycomida;
	public JFrame ventana ;
	public Object btnNuevoEmpleado;
	public JButton btnCrearEmpleado;
	public  JButton btnPagarBebidas;
	public JButton btnPagarComida;
	public JLabel lblCantidadDineroComida;
	public JLabel lblPagarBebida;
	public JButton btneliminartostada;
	public JButton btneliminaravena;
	public JButton btneliminarcooki;
	public JButton btneliminartortitas;
	public JButton btneliminartostadadejamon;
	public JButton btneliminarcroassan;
	public JButton btneliminarpalmera;
	public JButton btneliminarchurros;
	public JButton btneliminarcafesolo;
	public JButton btneliminarcortado;
	public JButton btneliminarcaramel;
	public JButton btneliminarfrapuchino;
	public JButton btneliminarcolacao;
	public JButton btneliminarcafeconleche;
	public JButton btneliminarcafelargo;
	public JButton btneliminarrzumo;
	public JButton btnInventarioComida;
	public JPanel panelnvetarioComida;
	public JLabel lblNewLabel_18;
	public JComboBox comboBoxNombreProducto;
	public JLabel lblNewLabel_20;
	public JTextField textFieldCantidad;
	public JButton btnAñadirInventario;
	public JButton btnEliminarInventario;
	public JButton btnVolverMesas;
	public JLabel lblFondoInventario;
	public JList list_2;
	public JLabel lblCantidadActual;
	public JLabel lblCantidadActual_1;
	public JLabel lblFalloInventario;
	public JLabel lbTextoComandaBebida;
	public JLabel lblIamgenComandaComida;
	public JLabel lblestadomesa1;
	public JLabel lblestadomesa2;
	public JLabel lblestadomesa3;
	public JLabel lblestadomesa4;
	public JLabel lblestadomesa5;
	public JLabel lblestadomesa6;
	public JButton btnPropinapanelcomida;
	public JButton btnPropinapanelbebida;
	public JPanel panelPropinas;
	public JLabel lblFondopanelPropina;
	public JLabel lblCantidadPropina;
	public JTextField textFieldCantidadPropina;
	public JButton btnAñadirPropina;
	public JLabel lblCantidadPropina_1;
	public JLabel lblAgradecimiento;
	public JButton btnVerPropina;
	public JPanel panelPropinasEmpleados;
	public JComboBox comboBoxEmpleados;
	public JComboBox comboBoxNombreCamarero;
	public JLabel lblName_4;
	public JLabel lblName_5;
	public JLabel lblName_6;
	public JLabel lblTotalPropina;
	public JButton btnVolverMesasPropina;
	public JButton btnVolveraMesasPanelComidad;
	public JLabel lblFondopanel;
	public JLabel lblName_8;
	public JLabel lblIconoMoneda;
	public JLabel lblFotoCamarero;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
					Controlador controlador=new Controlador(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(187, 179, 117));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
																											
																											panelnvetarioComida = new JPanel();
																											panelnvetarioComida.setBounds(0, 0, 834, 553);
																											contentPane.add(panelnvetarioComida);
																											panelnvetarioComida.setLayout(null);
																											panelnvetarioComida.setVisible(false);
																											
																											lblFalloInventario = new JLabel("");
																											lblFalloInventario.setForeground(Color.RED);
																											lblFalloInventario.setFont(new Font("Rage Italic", Font.PLAIN, 40));
																											lblFalloInventario.setBounds(151, 380, 359, 76);
																											panelnvetarioComida.add(lblFalloInventario);
																											
																											lblCantidadActual_1 = new JLabel("");
																											lblCantidadActual_1.setFont(new Font("Rage Italic", Font.PLAIN, 54));
																											lblCantidadActual_1.setBounds(609, 177, 580, 76);
																											panelnvetarioComida.add(lblCantidadActual_1);
																											
																											lblCantidadActual = new JLabel("Total del Producto");
																											lblCantidadActual.setFont(new Font("Rage Italic", Font.PLAIN, 41));
																											lblCantidadActual.setBounds(554, 120, 359, 76);
																											panelnvetarioComida.add(lblCantidadActual);
																											lblNewLabel_18 = new JLabel("Nombre Producto");
																											lblNewLabel_18.setFont(new Font("Rage Italic", Font.PLAIN, 41));
																											lblNewLabel_18.setBounds(151, 120, 380, 76);
																											panelnvetarioComida.add(lblNewLabel_18);
																											
																											comboBoxNombreProducto = new JComboBox();
																											comboBoxNombreProducto.setBounds(161, 195, 326, 29);
																											panelnvetarioComida.add(comboBoxNombreProducto);
																											
																											lblNewLabel_20 = new JLabel("Introduzca cantidad");
																											lblNewLabel_20.setFont(new Font("Rage Italic", Font.PLAIN, 41));
																											lblNewLabel_20.setBounds(149, 263, 457, 76);
																											panelnvetarioComida.add(lblNewLabel_20);
																											
																											textFieldCantidad = new JTextField();
																											textFieldCantidad.setBounds(161, 341, 326, 19);
																											panelnvetarioComida.add(textFieldCantidad);
																											textFieldCantidad.setColumns(10);
																											
																											btnAñadirInventario = new JButton("Añadir");
																											btnAñadirInventario.setBackground(new Color(128, 255, 128));
																											btnAñadirInventario.setBounds(575, 401, 249, 21);
																											panelnvetarioComida.add(btnAñadirInventario);
																											
																											btnEliminarInventario = new JButton("Eliminar");
																											btnEliminarInventario.setBackground(new Color(128, 255, 128));
																											btnEliminarInventario.setBounds(575, 432, 249, 21);
																											panelnvetarioComida.add(btnEliminarInventario);
																											
																											 btnVolverMesas = new JButton("Mesas");
																											 btnVolverMesas.addActionListener(new ActionListener() {
																											 	public void actionPerformed(ActionEvent e) {
																											 	}
																											 });
																											 btnVolverMesas.setBackground(new Color(128, 255, 128));
																											 btnVolverMesas.setBounds(726, 0, 108, 44);
																											 panelnvetarioComida.add(btnVolverMesas);
																											 
																											 JLabel lblError = new JLabel("");
																											 lblError.setFont(new Font("Rage Italic", Font.PLAIN, 46));
																											 lblError.setHorizontalAlignment(SwingConstants.CENTER);
																											 lblError.setBounds(161, 469, 523, 73);
																											 panelnvetarioComida.add(lblError);
																											 
																											  lblFondoInventario = new JLabel("");
																											  lblFondoInventario.setBounds(0, 0, 834, 542);
																											  panelnvetarioComida.add(lblFondoInventario);
																											  
																											  JLabel lblName_4_1 = new JLabel("CoffeSwtich");
																											  lblName_4_1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											  lblName_4_1.setBounds(106, 15, 425, 76);
																											  panelnvetarioComida.add(lblName_4_1);
																											
																											panelPropinasEmpleados = new JPanel();
																											panelPropinasEmpleados.setBounds(0, 0, 834, 546);
																											contentPane.add(panelPropinasEmpleados);
																											panelPropinasEmpleados.setLayout(null);
																											
																											lblIconoMoneda = new JLabel("");
																											lblIconoMoneda.setBounds(141, 234, 90, 57);
																											panelPropinasEmpleados.add(lblIconoMoneda);
																											btnVolverMesasPropina = new JButton("Mesas");
																											
																											btnVolverMesasPropina.setBackground(new Color(0, 255, 128));
																											btnVolverMesasPropina.setBounds(726, 0, 108, 44);
																											panelPropinasEmpleados.add(btnVolverMesasPropina);
																											
																											comboBoxEmpleados = new JComboBox();
																											comboBoxEmpleados.setBounds(241, 168, 281, 21);
																											panelPropinasEmpleados.add(comboBoxEmpleados);
																											panelPropinasEmpleados.setVisible(false);
																											lblName_4 = new JLabel("CoffeSwtich");
																											lblName_4.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											lblName_4.setBounds(141, 11, 425, 76);
																											panelPropinasEmpleados.add(lblName_4);
																											panelPropinasEmpleados.setVisible(false);
																											lblName_5 = new JLabel("Nombre del camarero");
																											lblName_5.setFont(new Font("Rage Italic", Font.PLAIN, 40));
																											lblName_5.setBounds(241, 82, 425, 76);
																											panelPropinasEmpleados.add(lblName_5);
																											panelPropinasEmpleados.setVisible(false);
																											lblName_6 = new JLabel("Propina Total");
																											lblName_6.setFont(new Font("Rage Italic", Font.PLAIN, 40));
																											lblName_6.setBounds(241, 220, 425, 76);
																											panelPropinasEmpleados.add(lblName_6);
																											panelPropinasEmpleados.setVisible(false);
																											lblTotalPropina = new JLabel("");
																											lblTotalPropina.setFont(new Font("Rage Italic", Font.PLAIN, 50));
																											lblTotalPropina.setBounds(241, 295, 425, 76);
																											panelPropinasEmpleados.add(lblTotalPropina);
																											panelPropinasEmpleados.setVisible(false);
																											 
																											 lblFotoCamarero = new JLabel("");
																											 lblFotoCamarero.setBounds(590, 82, 244, 415);
																											 panelPropinasEmpleados.add(lblFotoCamarero);
																											
																											 lblFondopanel = new JLabel("");
																											 lblFondopanel.setBounds(0, 0, 834, 546);
																											 panelPropinasEmpleados.add(lblFondopanel);
																											 panelPropinasEmpleados.setVisible(false);
																											
																											
																											
																											panelBebida = new JPanel();
																											panelBebida.setBackground(new Color(255, 255, 128));
																											panelBebida.setBounds(0, 0, 834, 553);
																											contentPane.add(panelBebida);
																											panelBebida.setLayout(null);
																											panelBebida.setVisible(false);
																											
																											 btnPropinapanelbebida = new JButton("Propina");
																											 btnPropinapanelbebida.setFont(new Font("Tahoma", Font.BOLD, 10));
																											 btnPropinapanelbebida.setBackground(new Color(128, 255, 128));
																											 btnPropinapanelbebida.setBounds(706, 405, 75, 23);
																											 panelBebida.add(btnPropinapanelbebida);
																											 
																											 lbTextoComandaBebida = new JLabel("");
																											 lbTextoComandaBebida.setForeground(new Color(255, 128, 0));
																											 lbTextoComandaBebida.setBackground(new Color(255, 128, 0));
																											 lbTextoComandaBebida.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											 lbTextoComandaBebida.setBounds(636, 10, 145, 76);
																											 panelBebida.add(lbTextoComandaBebida);
																											 
																											 btnComida = new JButton("Comida");
																											 btnComida.setBackground(new Color(128, 255, 128));
																											 btnComida.setBounds(633, 480, 145, 23);
																											 panelBebida.add(btnComida);
																											 
																											 lblPagarBebida = new JLabel("\r\n");
																											 lblPagarBebida.setFont(new Font("Rage Italic", Font.PLAIN, 30));
																											 lblPagarBebida.setHorizontalAlignment(SwingConstants.CENTER);
																											 lblPagarBebida.setBounds(599, 439, 235, 31);
																											 panelBebida.add(lblPagarBebida);
																											 
																											 btnPagarBebidas = new JButton("Pagar");
																											 btnPagarBebidas.setBackground(new Color(128, 255, 128));
																											 btnPagarBebidas.setBounds(636, 405, 68, 23);
																											 panelBebida.add(btnPagarBebidas);
																											 
																											 lblnohaybebida = new JLabel("");
																											 lblnohaybebida.setFont(new Font("Rage Italic", Font.PLAIN, 40));
																											 lblnohaybebida.setBounds(134, 279, 425, 76);
																											 panelBebida.add(lblnohaybebida);
																											 
																											 lblnombremesaBebida = new JLabel("");
																											 lblnombremesaBebida.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											 lblnombremesaBebida.setBounds(400, 10, 324, 76);
																											 panelBebida.add(lblnombremesaBebida);
																											 btnañadircafesolo = new JButton("Añadir");
																											 btnañadircafesolo.setBackground(new Color(128, 255, 128));
																											 btnañadircafesolo.setBounds(123, 229, 85, 21);
																											 panelBebida.add(btnañadircafesolo);
																											 
																											 btnañadircortado = new JButton("Añadir");
																											 btnañadircortado.setBackground(new Color(128, 255, 128));
																											 btnañadircortado.addActionListener(new ActionListener() {
																											 	public void actionPerformed(ActionEvent e) {
																											 	}
																											 });
																											 btnañadircortado.setBounds(240, 229, 85, 21);
																											 panelBebida.add(btnañadircortado);
																											 
																											 btnañadircaramel = new JButton("Añadir");
																											 btnañadircaramel.setBackground(new Color(128, 255, 128));
																											 btnañadircaramel.setBounds(356, 229, 85, 21);
																											 panelBebida.add(btnañadircaramel);
																											 
																											 btnañadirfrapuchino = new JButton("Añadir");
																											 btnañadirfrapuchino.setBackground(new Color(128, 255, 128));
																											 btnañadirfrapuchino.setBounds(474, 229, 85, 21);
																											 panelBebida.add(btnañadirfrapuchino);
																											 
																											 btnañadircolacao = new JButton("Añadir");
																											 btnañadircolacao.setBackground(new Color(128, 255, 128));
																											 btnañadircolacao.setBounds(123, 449, 85, 21);
																											 panelBebida.add(btnañadircolacao);
																											 
																											 btnaladircafeconleche = new JButton("Añadir");
																											 btnaladircafeconleche.setBackground(new Color(128, 255, 128));
																											 btnaladircafeconleche.setBounds(240, 449, 85, 21);
																											 panelBebida.add(btnaladircafeconleche);
																											 
																											 btnañadircafelargo = new JButton("Añadir");
																											 btnañadircafelargo.setBackground(new Color(128, 255, 128));
																											 btnañadircafelargo.setBounds(356, 449, 85, 21);
																											 panelBebida.add(btnañadircafelargo);
																											 
																											 btnañadirzumo = new JButton("Añadir");
																											 btnañadirzumo.setBackground(new Color(128, 255, 128));
																											 btnañadirzumo.setBounds(474, 449, 85, 21);
																											 panelBebida.add(btnañadirzumo);
																											 
																											 list_1 = new JList();
																											 list_1.setBounds(636, 97, 145, 302);
																											 panelBebida.add(list_1);
																											 
																											 lblNewLabel_2 = new JLabel("");
																											 lblNewLabel_2.setBounds(123, 122, 85, 97);
																											 panelBebida.add(lblNewLabel_2);
																											 
																											 lblNewLabel_4 = new JLabel("");
																											 lblNewLabel_4.setBounds(123, 341, 85, 97);
																											 panelBebida.add(lblNewLabel_4);
																											 
																											 lblNewLabel_3 = new JLabel("");
																											 lblNewLabel_3.setBounds(240, 337, 85, 97);
																											 panelBebida.add(lblNewLabel_3);
																											 
																											 lblNewLabel_5 = new JLabel("");
																											 lblNewLabel_5.setBounds(356, 337, 85, 97);
																											 panelBebida.add(lblNewLabel_5);
																											 
																											 lblNewLabel_6 = new JLabel("");
																											 lblNewLabel_6.setBounds(474, 337, 85, 97);
																											 panelBebida.add(lblNewLabel_6);
																											 
																											 lblNewLabel_7 = new JLabel("");
																											 lblNewLabel_7.setBounds(474, 122, 85, 97);
																											 panelBebida.add(lblNewLabel_7);
																											 
																											 lblNewLabel_8 = new JLabel("");
																											 lblNewLabel_8.setBounds(356, 122, 85, 97);
																											 panelBebida.add(lblNewLabel_8);
																											 
																											 lblNewLabel_9 = new JLabel("");
																											 lblNewLabel_9.setBounds(240, 122, 85, 97);
																											 panelBebida.add(lblNewLabel_9);
																											 
																											 lblName_2 = new JLabel("CoffeSwtich");
																											 lblName_2.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											 lblName_2.setBounds(134, 10, 425, 76);
																											 panelBebida.add(lblName_2);
																											 
																											 btnVolverMesaBebida = new JButton("Mesas");
																											 btnVolverMesaBebida.setBackground(new Color(128, 255, 128));
																											 btnVolverMesaBebida.addActionListener(new ActionListener() {
																											 	public void actionPerformed(ActionEvent e) {
																											 	}
																											 });
																											 btnVolverMesaBebida.setBounds(0, 0, 89, 36);
																											 panelBebida.add(btnVolverMesaBebida);
																											 
																											 btneliminarcafesolo = new JButton("Eliminar");
																											 btneliminarcafesolo.setBackground(new Color(128, 255, 128));
																											 btneliminarcafesolo.setBounds(123, 260, 85, 21);
																											 panelBebida.add(btneliminarcafesolo);
																											 
																											 btneliminarcortado = new JButton("Eliminar");
																											 btneliminarcortado.setBackground(new Color(128, 255, 128));
																											 btneliminarcortado.setBounds(240, 259, 85, 21);
																											 panelBebida.add(btneliminarcortado);
																											 
																											 btneliminarcaramel = new JButton("Eliminar");
																											 btneliminarcaramel.setBackground(new Color(128, 255, 128));
																											 btneliminarcaramel.setBounds(356, 260, 85, 21);
																											 panelBebida.add(btneliminarcaramel);
																											 
																											 btneliminarfrapuchino = new JButton("Eliminar");
																											 btneliminarfrapuchino.setBackground(new Color(128, 255, 128));
																											 btneliminarfrapuchino.setBounds(474, 260, 85, 21);
																											 panelBebida.add(btneliminarfrapuchino);
																											 
																											 btneliminarcolacao = new JButton("Eliminar");
																											 btneliminarcolacao.setBackground(new Color(128, 255, 128));
																											 btneliminarcolacao.setBounds(123, 481, 85, 21);
																											 panelBebida.add(btneliminarcolacao);
																											 
																											 btneliminarcafeconleche = new JButton("Eliminar");
																											 btneliminarcafeconleche.setBackground(new Color(128, 255, 128));
																											 btneliminarcafeconleche.setBounds(240, 480, 85, 21);
																											 panelBebida.add(btneliminarcafeconleche);
																											 
																											 btneliminarcafelargo = new JButton("Eliminar");
																											 btneliminarcafelargo.setBackground(new Color(128, 255, 128));
																											 btneliminarcafelargo.setBounds(356, 481, 85, 21);
																											 panelBebida.add(btneliminarcafelargo);
																											 
																											 btneliminarrzumo = new JButton("Eliminar");
																											 btneliminarrzumo.setBackground(new Color(128, 255, 128));
																											 btneliminarrzumo.setBounds(473, 481, 85, 21);
																											 panelBebida.add(btneliminarrzumo);
																											 
																											 lblFondo = new JLabel("");
																											 lblFondo.setBounds(0, 0, 834, 568);
																											 panelBebida.add(lblFondo);
																										
																											
																											panelComida = new JPanel();
																											panelComida.setLayout(null);
																											panelComida.setBackground(new Color(255, 255, 128));
																											panelComida.setBounds(0, 0, 834, 553);
																											contentPane.add(panelComida);
																											panelComida.setVisible(false);
																											
																											btnPagarComida = new JButton("Pagar");
																											
																											
																											
																											 btnPropinapanelcomida = new JButton("Propina");
																											 btnPropinapanelcomida.setFont(new Font("Tahoma", Font.BOLD, 10));
																											 
																											 		btnPropinapanelcomida.setBackground(new Color(128, 255, 128));
																											 		btnPropinapanelcomida.setBounds(706, 405, 75, 23);
																											 		panelComida.add(btnPropinapanelcomida);
																											 		
																											 		lblCantidadDineroComida = new JLabel("");
																											 		lblCantidadDineroComida.setHorizontalAlignment(SwingConstants.CENTER);
																											 		lblCantidadDineroComida.setFont(new Font("Rage Italic", Font.PLAIN, 30));
																											 		lblCantidadDineroComida.setBounds(599, 439, 235, 31);
																											 		panelComida.add(lblCantidadDineroComida);
																											 		
																											 		lblIamgenComandaComida = new JLabel("");
																											 		lblIamgenComandaComida.setForeground(new Color(128, 0, 255));
																											 		lblIamgenComandaComida.setBackground(new Color(255, 128, 0));
																											 		lblIamgenComandaComida.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											 		lblIamgenComandaComida.setBounds(636, 10, 145, 76);
																											 		panelComida.add(lblIamgenComandaComida);
																											 		
																											 		list_2 = new JList();
																											 		list_2.setBounds(636, 97, 145, 302);
																											 		panelComida.add(list_2);
																											 		btnPagarComida.setBackground(new Color(128, 255, 128));
																											 		btnPagarComida.setBounds(636, 405, 68, 23);
																											 		panelComida.add(btnPagarComida);
																											 		
																											 		lblnohaycomida = new JLabel("");
																											 		lblnohaycomida.setHorizontalAlignment(SwingConstants.CENTER);
																											 		lblnohaycomida.setFont(new Font("Rage Italic", Font.PLAIN, 40));
																											 		lblnohaycomida.setBounds(134, 272, 425, 76);
																											 		panelComida.add(lblnohaycomida);
																											 		
																											 		lblnombremesacomida = new JLabel("");
																											 		lblnombremesacomida.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											 		lblnombremesacomida.setBounds(400, 10, 324, 76);
																											 		panelComida.add(lblnombremesacomida);
																											 		
																											 		btnañadirtostada = new JButton("Añadir");
																											 		btnañadirtostada.setBackground(new Color(128, 255, 128));
																											 		btnañadirtostada.setBounds(123, 229, 85, 21);
																											 		panelComida.add(btnañadirtostada);
																											 		
																											 		btnañadirvolavena = new JButton("Añadir");
																											 		btnañadirvolavena.setBackground(new Color(128, 255, 128));
																											 		btnañadirvolavena.setBounds(240, 229, 85, 21);
																											 		panelComida.add(btnañadirvolavena);
																											 		
																											 		btnañadircooki = new JButton("Añadir");
																											 		btnañadircooki.setBackground(new Color(128, 255, 128));
																											 		btnañadircooki.setBounds(356, 229, 85, 21);
																											 		panelComida.add(btnañadircooki);
																											 		
																											 		btnañadirtortitas = new JButton("Añadir");
																											 		btnañadirtortitas.setBackground(new Color(128, 255, 128));
																											 		btnañadirtortitas.setBounds(474, 229, 85, 21);
																											 		panelComida.add(btnañadirtortitas);
																											 		
																											 		btnañadirtostadadejamon = new JButton("Añadir");
																											 		btnañadirtostadadejamon.setBackground(new Color(128, 255, 128));
																											 		btnañadirtostadadejamon.setBounds(123, 449, 85, 21);
																											 		panelComida.add(btnañadirtostadadejamon);
																											 		
																											 		btnañadircroassan = new JButton("Añadir");
																											 		btnañadircroassan.setBackground(new Color(128, 255, 128));
																											 		btnañadircroassan.setBounds(240, 449, 85, 21);
																											 		panelComida.add(btnañadircroassan);
																											 		
																											 		btnañadirpalmera = new JButton("Añadir");
																											 		btnañadirpalmera.setBackground(new Color(128, 255, 128));
																											 		btnañadirpalmera.setBounds(356, 449, 85, 21);
																											 		panelComida.add(btnañadirpalmera);
																											 		
																											 		btnañadirchurros = new JButton("Añadir");
																											 		btnañadirchurros.setBackground(new Color(128, 255, 128));
																											 		btnañadirchurros.setBounds(474, 449, 85, 21);
																											 		panelComida.add(btnañadirchurros);
																											 		
																											 		lblNewLabel_10 = new JLabel("");
																											 		lblNewLabel_10.setBounds(123, 122, 85, 97);
																											 		panelComida.add(lblNewLabel_10);
																											 		
																											 		lblNewLabel_11 = new JLabel("");
																											 		lblNewLabel_11.setBounds(123, 341, 85, 97);
																											 		panelComida.add(lblNewLabel_11);
																											 		
																											 		lblNewLabel_12 = new JLabel("");
																											 		lblNewLabel_12.setBounds(240, 337, 85, 97);
																											 		panelComida.add(lblNewLabel_12);
																											 		
																											 		lblNewLabel_13 = new JLabel("");
																											 		lblNewLabel_13.setBounds(356, 337, 85, 97);
																											 		panelComida.add(lblNewLabel_13);
																											 		
																											 		lblNewLabel_14 = new JLabel("");
																											 		lblNewLabel_14.setBounds(474, 337, 85, 97);
																											 		panelComida.add(lblNewLabel_14);
																											 		
																											 		lblNewLabel_15 = new JLabel("");
																											 		lblNewLabel_15.setBounds(474, 122, 85, 97);
																											 		panelComida.add(lblNewLabel_15);
																											 		
																											 		lblNewLabel_16 = new JLabel("");
																											 		lblNewLabel_16.setBounds(356, 122, 85, 97);
																											 		panelComida.add(lblNewLabel_16);
																											 		
																											 		lblNewLabel_17 = new JLabel("");
																											 		lblNewLabel_17.setBounds(240, 122, 85, 97);
																											 		panelComida.add(lblNewLabel_17);
																											 		
																											 		lblName_3 = new JLabel("CoffeSwtich");
																											 		lblName_3.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																											 		lblName_3.setBounds(134, 10, 425, 76);
																											 		panelComida.add(lblName_3);
																											 		
																											 		btnVueltasMesa = new JButton("Mesas");
																											 		btnVueltasMesa.setBackground(new Color(128, 255, 128));
																											 		btnVueltasMesa.setBounds(0, 0, 89, 38);
																											 		panelComida.add(btnVueltasMesa);
																											 		
																											 		btnBebida = new JButton("Bebida");
																											 		btnBebida.setBackground(new Color(128, 255, 128));
																											 		btnBebida.setBounds(633, 480, 145, 23);
																											 		panelComida.add(btnBebida);
																											 		
																											 		btneliminartostada = new JButton("Eliminar");
																											 		btneliminartostada.setBackground(new Color(128, 255, 128));
																											 		btneliminartostada.setBounds(123, 261, 85, 21);
																											 		panelComida.add(btneliminartostada);
																											 		
																											 		btneliminaravena = new JButton("Eliminar");
																											 		btneliminaravena.setBackground(new Color(128, 255, 128));
																											 		btneliminaravena.setBounds(240, 260, 85, 21);
																											 		panelComida.add(btneliminaravena);
																											 		
																											 		btneliminarcooki = new JButton("Eliminar");
																											 		btneliminarcooki.setBackground(new Color(128, 255, 128));
																											 		btneliminarcooki.setBounds(356, 260, 85, 21);
																											 		panelComida.add(btneliminarcooki);
																											 		
																											 		btneliminartortitas = new JButton("Eliminar");
																											 		btneliminartortitas.setBackground(new Color(128, 255, 128));
																											 		btneliminartortitas.setBounds(473, 260, 85, 21);
																											 		panelComida.add(btneliminartortitas);
																											 		
																											 		btneliminartostadadejamon = new JButton("Eliminar");
																											 		btneliminartostadadejamon.setBackground(new Color(128, 255, 128));
																											 		btneliminartostadadejamon.setBounds(123, 481, 85, 21);
																											 		panelComida.add(btneliminartostadadejamon);
																											 		
																											 		btneliminarcroassan = new JButton("Eliminar");
																											 		btneliminarcroassan.setBackground(new Color(128, 255, 128));
																											 		btneliminarcroassan.setBounds(240, 481, 85, 21);
																											 		panelComida.add(btneliminarcroassan);
																											 		
																											 		btneliminarpalmera = new JButton("Eliminar");
																											 		btneliminarpalmera.setBackground(new Color(128, 255, 128));
																											 		btneliminarpalmera.setBounds(356, 481, 85, 21);
																											 		panelComida.add(btneliminarpalmera);
																											 		
																											 		btneliminarchurros = new JButton("Eliminar");
																											 		btneliminarchurros.setBackground(new Color(128, 255, 128));
																											 		btneliminarchurros.setBounds(474, 481, 85, 21);
																											 		panelComida.add(btneliminarchurros);
																											 		
																											 		lblFondoComida = new JLabel("");
																											 		lblFondoComida.setBounds(0, 0, 834, 587);
																											 		panelComida.add(lblFondoComida);
																										panelPropinas = new JPanel();
																										panelPropinas.setBounds(0, 0, 834, 553);
																										contentPane.add(panelPropinas);
																										panelPropinas.setLayout(null);
																										panelPropinas.setVisible(false);
																										btnVolveraMesasPanelComidad = new JButton("Mesas");
																										panelPropinas.setVisible(false);
																										
																										lblName_8 = new JLabel("CoffeSwtich");
																										lblName_8.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																										lblName_8.setBounds(139, 32, 425, 76);
																										panelPropinas.add(lblName_8);
																										panelPropinas.setVisible(false);
																										comboBoxNombreCamarero = new JComboBox();
																										comboBoxNombreCamarero.setBounds(230, 161, 348, 22);
																										panelPropinas.add(comboBoxNombreCamarero);
																										panelPropinas.setVisible(false);
																										
																										btnVolveraMesasPanelComidad.setBackground(new Color(0, 255, 128));
																										btnVolveraMesasPanelComidad.setBounds(726, 0, 108, 44);
																										panelPropinas.add(btnVolveraMesasPanelComidad);
																										panelPropinas.setVisible(false);
																										lblAgradecimiento = new JLabel("Gracias por confiar en nuestro servicio y en nustro personal");
																										lblAgradecimiento.setHorizontalAlignment(SwingConstants.CENTER);
																										lblAgradecimiento.setFont(new Font("Rage Italic", Font.PLAIN, 30));
																										lblAgradecimiento.setBounds(79, 340, 676, 141);
																										panelPropinas.add(lblAgradecimiento);
																										panelPropinas.setVisible(false);
																										panelPropinas.setVisible(false);
																										lblCantidadPropina_1 = new JLabel("Nombre Camarero");
																										lblCantidadPropina_1.setHorizontalAlignment(SwingConstants.CENTER);
																										lblCantidadPropina_1.setFont(new Font("Rage Italic", Font.PLAIN, 30));
																										lblCantidadPropina_1.setBounds(230, 119, 392, 31);
																										panelPropinas.add(lblCantidadPropina_1);
																										panelPropinas.setVisible(false);
																										btnAñadirPropina = new JButton("Añadir Propina");
																										btnAñadirPropina.setBackground(new Color(0, 255, 128));
																										btnAñadirPropina.setBounds(228, 295, 348, 21);
																										panelPropinas.add(btnAñadirPropina);
																										panelPropinas.setVisible(false);
																										textFieldCantidadPropina = new JTextField();
																										textFieldCantidadPropina.setBounds(230, 250, 348, 19);
																										panelPropinas.add(textFieldCantidadPropina);
																										textFieldCantidadPropina.setColumns(10);
																										panelPropinas.setVisible(false);
																										lblCantidadPropina = new JLabel("Introduzca cantidad de propina");
																										lblCantidadPropina.setHorizontalAlignment(SwingConstants.CENTER);
																										lblCantidadPropina.setFont(new Font("Rage Italic", Font.PLAIN, 30));
																										lblCantidadPropina.setBounds(220, 208, 392, 31);
																										panelPropinas.add(lblCantidadPropina);
																										panelPropinas.setVisible(false);
																										lblFondopanelPropina = new JLabel("");
																										lblFondopanelPropina.setBounds(0, 0, 834, 543);
																										panelPropinas.add(lblFondopanelPropina);
																										panelPropinas.setVisible(false);
																									panelnicio = new JPanel();
																									panelnicio.setBackground(new Color(255, 255, 128));
																									panelnicio.setBounds(0, -11, 834, 564);
																									contentPane.add(panelnicio);
																									panelnicio.setLayout(null);
																									
																									btnCrearEmpleado = new JButton("Crear Empleado");
																									btnCrearEmpleado.setBackground(new Color(128, 255, 128));
																									btnCrearEmpleado.setBounds(431, 332, 145, 21);
																									panelnicio.add(btnCrearEmpleado);
																									
																									textFieldInicioSesion = new JTextField();
																									textFieldInicioSesion.setBounds(268, 190, 308, 19);
																									panelnicio.add(textFieldInicioSesion);
																									textFieldInicioSesion.setColumns(10);
																									
																									lblNewLabel = new JLabel("Inicio Sesion");
																									lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 15));
																									lblNewLabel.setBounds(268, 167, 308, 13);
																									panelnicio.add(lblNewLabel);
																									
																									textFieldContraseña = new JTextField();
																									textFieldContraseña.setBounds(268, 275, 308, 19);
																									panelnicio.add(textFieldContraseña);
																									textFieldContraseña.setColumns(10);
																									
																									lblNewLabel_1 = new JLabel("Contraseña");
																									lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
																									lblNewLabel_1.setBounds(268, 252, 308, 13);
																									panelnicio.add(lblNewLabel_1);
																									
																									btnIniciarSesion = new JButton("Inciar Sesion");
																									btnIniciarSesion.setBackground(new Color(128, 255, 128));
																									btnIniciarSesion.setBounds(268, 333, 153, 21);
																									panelnicio.add(btnIniciarSesion);
																									
																									lblName = new JLabel("CoffeSwtich");
																									lblName.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																									lblName.setBounds(139, 32, 425, 76);
																									panelnicio.add(lblName);
																									
																									lblHora = new JLabel("");
																									lblHora.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																									lblHora.setBounds(431, 32, 290, 76);
																									panelnicio.add(lblHora);
																									
																									lblFalloInicioSesion = new JLabel("");
																									lblFalloInicioSesion.setHorizontalAlignment(SwingConstants.CENTER);
																									lblFalloInicioSesion.setFont(new Font("Rage Italic", Font.PLAIN, 25));
																									lblFalloInicioSesion.setBounds(0, 425, 824, 76);
																									panelnicio.add(lblFalloInicioSesion);
																									
																									lblFondoPanelInicio = new JLabel("");
																									lblFondoPanelInicio.setBounds(0, 0, 834, 609);
																									panelnicio.add(lblFondoPanelInicio);
																								
																								panelMesa = new JPanel();
																								panelMesa.setBackground(new Color(255, 255, 128));
																								panelMesa.setBounds(0, 0, 834, 553);
																								contentPane.add(panelMesa);
																								panelMesa.setLayout(null);
																								
																								btnMesa1 = new JButton("");
																								btnMesa1.setForeground(Color.BLACK);
																								
																								btnVerPropina = new JButton("Ver Propina");
																								btnVerPropina.setBackground(new Color(128, 255, 128));
																								btnVerPropina.setBounds(577, 359, 234, 90);
																								panelMesa.add(btnVerPropina);
																								
																								JLabel lblestadomesa5_1 = new JLabel("Libre");
																								lblestadomesa5_1.setForeground(new Color(0, 64, 0));
																								lblestadomesa5_1.setHorizontalAlignment(SwingConstants.CENTER);
																								lblestadomesa5_1.setFont(new Font("Rage Italic", Font.PLAIN, 25));
																								lblestadomesa5_1.setBounds(246, 310, 89, 76);
																								panelMesa.add(lblestadomesa5_1);
																								
																										
																										btnInventarioComida = new JButton("Inventario Comida");
																										btnInventarioComida.setBackground(new Color(128, 255, 128));
																										btnInventarioComida.setBounds(577, 261, 234, 90);
																										panelMesa.add(btnInventarioComida);
																										btnMesa1.setBounds(246, 124, 89, 79);
																										panelMesa.add(btnMesa1);
																										panelMesa.setVisible(false);
																										
																										
					        
																										 btnMesa2 = new JButton("");
																										 btnMesa2.addActionListener(new ActionListener() {
																										 	public void actionPerformed(ActionEvent e) {
																										 	}
																										 });
																										 btnMesa2.setBounds(404, 124, 89, 79);
																										 panelMesa.add(btnMesa2);
																										 
																										  btnMesa3 = new JButton("");
																										  btnMesa3.setBounds(246, 248, 89, 79);
																										  panelMesa.add(btnMesa3);
																										  panelMesa.setVisible(false);
																										  
																										   btnMesa4 = new JButton("");
																										   btnMesa4.setBounds(404, 248, 89, 79);
																										   panelMesa.add(btnMesa4);
																										   panelMesa.setVisible(false);
																										   
																										    btnMesa5 = new JButton("");
																										    btnMesa5.addActionListener(new ActionListener() {
																										    	public void actionPerformed(ActionEvent e) {
																										    	}
																										    });
																										    btnMesa5.setBounds(246, 370, 89, 79);
																										    panelMesa.add(btnMesa5);
																										    panelMesa.setVisible(false);
																										    
																										     btnMesa6 = new JButton("");
																										     btnMesa6.setBounds(404, 370, 89, 79);
																										     panelMesa.add(btnMesa6);
																										     panelMesa.setVisible(false);
																										     
																										     lblName_1 = new JLabel("CoffeSwtich");
																										     lblName_1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																										     lblName_1.setBounds(117, 11, 425, 76);
																										     panelMesa.add(lblName_1);
																										     panelMesa.setVisible(false);
																										     
																										     btnAtras = new JButton("");
																										     btnAtras.setBackground(new Color(255, 0, 0));
																										     btnAtras.addActionListener(new ActionListener() {
																										     	public void actionPerformed(ActionEvent e) {
																										     	}
																										     });
																										     btnAtras.setBounds(757, 0, 77, 77);
																										     panelMesa.add(btnAtras);
																										     
																										     lblHora1 = new JLabel("");
																										     lblHora1.setFont(new Font("Rage Italic", Font.PLAIN, 60));
																										     lblHora1.setBounds(577, 153, 234, 50);
																										     panelMesa.add(lblHora1);
																										     
																										      lblestadomesa1 = new JLabel("Libre");
																										      lblestadomesa1.setForeground(new Color(0, 64, 0));
																										      lblestadomesa1.setHorizontalAlignment(SwingConstants.CENTER);
																										      lblestadomesa1.setFont(new Font("Rage Italic", Font.PLAIN, 25));
																										      lblestadomesa1.setBounds(246, 71, 89, 76);
																										      panelMesa.add(lblestadomesa1);
																										      
																										       lblestadomesa2 = new JLabel("Libre");
																										       lblestadomesa2.setForeground(new Color(0, 64, 0));
																										       lblestadomesa2.setHorizontalAlignment(SwingConstants.CENTER);
																										       lblestadomesa2.setFont(new Font("Rage Italic", Font.PLAIN, 25));
																										       lblestadomesa2.setBounds(404, 73, 89, 76);
																										       panelMesa.add(lblestadomesa2);
																										       
																										        lblestadomesa3 = new JLabel("Libre");
																										        lblestadomesa3.setForeground(new Color(0, 64, 0));
																										        lblestadomesa3.setHorizontalAlignment(SwingConstants.CENTER);
																										        lblestadomesa3.setFont(new Font("Rage Italic", Font.PLAIN, 25));
																										        lblestadomesa3.setBounds(246, 190, 89, 76);
																										        panelMesa.add(lblestadomesa3);
																										        
																										         lblestadomesa4 = new JLabel("Libre");
																										         lblestadomesa4.setForeground(new Color(0, 64, 0));
																										         lblestadomesa4.setHorizontalAlignment(SwingConstants.CENTER);
																										         lblestadomesa4.setFont(new Font("Rage Italic", Font.PLAIN, 25));
																										         lblestadomesa4.setBounds(404, 189, 89, 76);
																										         panelMesa.add(lblestadomesa4);
																										         
																										          lblestadomesa6 = new JLabel("Libre");
																										          lblestadomesa6.setForeground(new Color(0, 64, 0));
																										          lblestadomesa6.setHorizontalAlignment(SwingConstants.CENTER);
																										          lblestadomesa6.setFont(new Font("Rage Italic", Font.PLAIN, 25));
																										          lblestadomesa6.setBounds(404, 311, 94, 76);
																										          panelMesa.add(lblestadomesa6);
																										          
																										          lblFondoMesa = new JLabel("");
																										          lblFondoMesa.setBounds(0, 0, 855, 581);
																										          panelMesa.add(lblFondoMesa);
																										          panelMesa.setVisible(false);
	}

	public void lblTextError() {
		// TODO Auto-generated method stub
		
	}

	public void lblnohaycomida(String string) {
		// TODO Auto-generated method stub
		
	}

	public void lblnohaybebida(String string) {
		// TODO Auto-generated method stub
		
	}
}
