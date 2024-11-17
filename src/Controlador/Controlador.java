package Controlador;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import Modelo.Mesa;
import Modelo.Personal;
import Modelo.Producto;
import Vista.InicioSesion;

public class Controlador implements ActionListener{
	InicioSesion vista=new InicioSesion();
	Personal empleados;
	Producto inventario; 
	ArrayList<ImageIcon>imagenes=new ArrayList();
	List<Personal>totalempleados=new ArrayList<>();	
	List<Producto>productostotales=new ArrayList<>();
	DefaultListModel modelo=new DefaultListModel();
	 
		Mesa mesa1 = new Mesa("Mesa 1");
	    Mesa mesa2 = new Mesa("Mesa 2");
	    Mesa mesa3 = new Mesa("Mesa 3");
	    Mesa mesa4 = new Mesa("Mesa 4");
	   Mesa  mesa5 = new Mesa("Mesa 5");
	   Mesa  mesa6 = new Mesa("Mesa 6");
	public Controlador(InicioSesion vista) {
		this.vista=vista;
		this.vista.btnIniciarSesion.addActionListener(this);
		this.vista.btnMesa1.addActionListener(this);;
		this.vista.btnMesa2.addActionListener(this);
		this.vista.btnMesa3.addActionListener(this);
		this.vista.btnMesa4.addActionListener(this);
		this.vista.btnMesa5.addActionListener(this);
		this.vista.btnMesa6.addActionListener(this);
		this.vista.btnAtras.addActionListener(this);
		this.vista.btnVueltasMesa.addActionListener(this);
		this.vista.btnVolverMesaBebida.addActionListener(this);
		this.vista.btnComida.addActionListener(this);
		this.vista.btnBebida.addActionListener(this);
		this.vista.btnañadirtostada.addActionListener(this);
		this.vista.btnañadircafesolo.addActionListener(this);
		this.vista.btnañadircaramel.addActionListener(this);
		this.vista.btnañadircolacao.addActionListener(this);
		this.vista.btnañadircortado.addActionListener(this);
		this.vista.btnañadirfrapuchino.addActionListener(this);
		this.vista.btnaladircafeconleche.addActionListener(this);
		this.vista.btnañadircafelargo.addActionListener(this);
		this.vista.btnañadirzumo.addActionListener(this);
		this.vista.btnañadirvolavena.addActionListener(this);
		this.vista.btnañadircooki.addActionListener(this);
		this.vista.btnañadirtortitas.addActionListener(this);
		this.vista.btnañadirtostadadejamon.addActionListener(this);
		this.vista.btnañadircroassan.addActionListener(this);
		this.vista.btnañadirpalmera.addActionListener(this);
		this.vista.btnañadirchurros.addActionListener(this);
		this.vista.btnCrearEmpleado.addActionListener(this);
		this.vista.btnPagarComida.addActionListener(this);
		this.vista.btnPagarBebidas.addActionListener(this);
		this.vista.btneliminartostada.addActionListener(this);
		this.vista.btneliminarcafesolo.addActionListener(this);
		this.vista.btneliminarcaramel.addActionListener(this);
		this.vista.btneliminarcolacao.addActionListener(this);
		this.vista.btneliminarcortado.addActionListener(this);
		this.vista.btneliminarfrapuchino.addActionListener(this);
		this.vista.btneliminarcafeconleche.addActionListener(this);
		this.vista.btneliminarcafelargo.addActionListener(this);
		this.vista.btneliminarrzumo.addActionListener(this);
		this.vista.btneliminaravena.addActionListener(this);
		this.vista.btneliminarcooki.addActionListener(this);
		this.vista.btneliminartortitas.addActionListener(this);
		this.vista.btneliminartostadadejamon.addActionListener(this);
		this.vista.btneliminarcroassan.addActionListener(this);
		this.vista.btneliminarpalmera.addActionListener(this);
		this.vista.btneliminarchurros.addActionListener(this);
		this.vista.btnInventarioComida.addActionListener(this);
		this.vista.btnVolverMesaBebida.addActionListener(this);
		this.vista.btnAñadirInventario.addActionListener(this);
		this.vista.btnEliminarInventario.addActionListener(this);
		this.vista.btnVolverMesas.addActionListener(this);
		this.vista.comboBoxNombreProducto.addActionListener(this);
		ponerImagen();
		hora(vista.lblHora);
		hora(vista.lblHora1);
		totalempleados = rellenar(empleados);
		productostotales=rellenarproducto(inventario, productostotales);	
		List<Producto>productos=new ArrayList<Producto>();
		ArrayList<String>mesas=new ArrayList<String>();
		HashMap<String,Integer>contador=new HashMap<String,Integer>();
		agregarcombobox(productos);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//Botones Mesas
		if (e.getSource() == this.vista.btnMesa1) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 1");
	        this.vista.lblnombremesacomida.setText("Mesa 1");
	        this.vista.lblCantidadDineroComida.setText("");
	        actualizarModeloDeLista(mesa1);
	    } else if (e.getSource() == this.vista.btnMesa2) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 2");
	        this.vista.lblnombremesacomida.setText("Mesa 2");
	        this.vista.lblCantidadDineroComida.setText("");
	        actualizarModeloDeLista(mesa2);
	    } else if (e.getSource() == this.vista.btnMesa3) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 3");
	        this.vista.lblnombremesacomida.setText("Mesa 3");
	        this.vista.lblCantidadDineroComida.setText("");
	        actualizarModeloDeLista(mesa3);
	    } else if (e.getSource() == this.vista.btnMesa4) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 4");
	        this.vista.lblnombremesacomida.setText("Mesa 4");
	        this.vista.lblCantidadDineroComida.setText("");
	        actualizarModeloDeLista(mesa4);
	    } else if (e.getSource() == this.vista.btnMesa5) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 5");
	        this.vista.lblnombremesacomida.setText("Mesa 5");
	        this.vista.lblCantidadDineroComida.setText("");
	        actualizarModeloDeLista(mesa5);
	    } else if (e.getSource() == this.vista.btnMesa6) {
	        this.vista.panelComida.setVisible(true);
	        this.vista.panelMesa.setVisible(false);
	        this.vista.lblnombremesaBebida.setText("Mesa 6");
	        this.vista.lblnombremesacomida.setText("Mesa 6");
	        this.vista.lblCantidadDineroComida.setText("");
	        actualizarModeloDeLista(mesa6);
	    }
		//Boton inicio de sesion
		if (e.getSource() == this.vista.btnIniciarSesion) {
			  String nombreUsuario = this.vista.textFieldInicioSesion.getText();
			    String contraseña = this.vista.textFieldContraseña.getText();
			    this.vista.textFieldInicioSesion.setText("");
			    this.vista.textFieldContraseña.setText("");

			    if (nombreUsuario.isEmpty() || contraseña.isEmpty()) {
			        this.vista.lblFalloInicioSesion.setText("Los campos no pueden estar vacíos");
			        return; 
			    }
			    if (nombreUsuario.isEmpty() && contraseña.isEmpty()) {
			        this.vista.lblFalloInicioSesion.setText("Los campos estan vacíos");
			        return; 
			    }
			    boolean usuarioEncontrado = false; 
			    for (Personal empleado : totalempleados) { 
			        if (empleado.getNombre().equalsIgnoreCase(nombreUsuario)) {
			            usuarioEncontrado = true;
			            if (empleado.getContraseña().equals(contraseña)) {
			                this.vista.panelnicio.setVisible(false);
			                this.vista.panelMesa.setVisible(true);
			                this.vista.textFieldInicioSesion.setText("");
						    this.vista.textFieldContraseña.setText("");
			                return;
			            } else {
			                this.vista.lblFalloInicioSesion.setText("La contraseña es incorrecta");
			                return; 
			            }
			        }
			    }
			    if (!usuarioEncontrado) {
			        this.vista.lblFalloInicioSesion.setText("El nombre de usuario es incorrecto");
			    }
		}
		//Boton crear empleado
		if (e.getSource() == this.vista.btnCrearEmpleado) {
			 String nombreUsuario = this.vista.textFieldInicioSesion.getText();
			    String contraseña = this.vista.textFieldContraseña.getText();
			    this.vista.textFieldInicioSesion.setText("");
			    this.vista.textFieldContraseña.setText("");
			    if (nombreUsuario.isEmpty() || contraseña.isEmpty()) {
			        this.vista.lblFalloInicioSesion.setText("Los campos no pueden estar vacíos");
			        return; 
			    }
			    if(nombreUsuario.isEmpty() && contraseña.isEmpty()) {
			    	this.vista.lblFalloInicioSesion.setText("Los campos entan vacíos");
			        return; 
			    }
			    boolean usuarioExistente = false; 
			    for (Personal empleado : totalempleados) {
			        if (empleado.getNombre().equalsIgnoreCase(nombreUsuario)) {
			            usuarioExistente = true;  
			        }
			    }
			    if (usuarioExistente) {
			        this.vista.lblFalloInicioSesion.setText("Este usuario ya existe");
			    } else {
			        agregarNuevoUsuario(nombreUsuario, contraseña);
			        this.vista.lblFalloInicioSesion.setText("Nuevo usuario creado");
			    }
		}
		//Botones añadir productos
		if (e.getSource() == this.vista.btnañadirtostada) {
		    agregarProductoPorMesa("Tostadas", 1.50, vista.btnañadirtostada);
		} else if (e.getSource() == this.vista.btnañadirvolavena) {
		    agregarProductoPorMesa("Avena", 2.50, vista.btnañadirvolavena);
		} else if (e.getSource() == this.vista.btnañadircooki) {
		    agregarProductoPorMesa("Cookie", 0.50, vista.btnañadircooki);
		} else if (e.getSource() == this.vista.btnañadirtortitas) {
		    agregarProductoPorMesa("Tortitas", 2.00, vista.btnañadirtortitas);
		} else if (e.getSource() == this.vista.btnañadirtostadadejamon) {
		    agregarProductoPorMesa("Tostadas de Jamon", 2.00, vista.btnañadirtostadadejamon);
		} else if (e.getSource() == this.vista.btnañadircroassan) {
		    agregarProductoPorMesa("Croassan", 1.20, vista.btnañadircroassan);
		} else if (e.getSource() == this.vista.btnañadirpalmera) {
		    agregarProductoPorMesa("Palmera", 1.00, vista.btnañadirpalmera);
		} else if (e.getSource() == this.vista.btnañadirchurros) {
		    agregarProductoPorMesa("Churros", 0.50, vista.btnañadirchurros);
		} else if (e.getSource() == this.vista.btnañadircafesolo) {
		    agregarProductoPorMesa("Cafe", 1.20, vista.btnañadircafesolo);
		} else if (e.getSource() == this.vista.btnañadircortado) {
		    agregarProductoPorMesa("Cortado", 1.50, vista.btnañadircortado);
		} else if (e.getSource() == this.vista.btnañadircaramel) {
		    agregarProductoPorMesa("Caramel", 2.50, vista.btnañadircaramel);
		} else if (e.getSource() == this.vista.btnañadirfrapuchino) {
		    agregarProductoPorMesa("Frapuchino", 2.00, vista.btnañadirfrapuchino);
		} else if (e.getSource() == this.vista.btnañadircolacao) {
		    agregarProductoPorMesa("Cola Cao", 1.50, vista.btnañadircolacao);
		} else if (e.getSource() == this.vista.btnaladircafeconleche) {
		    agregarProductoPorMesa("Cafe con leche", 1.20, vista.btnaladircafeconleche);
		} else if (e.getSource() == this.vista.btnañadircafelargo) {
		    agregarProductoPorMesa("Cafe Largo", 1.50, vista.btnañadircafelargo);
		} else if (e.getSource() == this.vista.btnañadirzumo) {
		    agregarProductoPorMesa("Zumo", 1.00, vista.btnañadirzumo);
		}
		//Botones eliminar productos
		if (e.getSource() == this.vista.btneliminartostada) {
		    eliminarProductoPorMesa("Tostadas", 1.50,vista.btneliminartostada);
		} else if (e.getSource() == this.vista.btneliminaravena) {
		    eliminarProductoPorMesa("Avena", 2.50,vista.btneliminaravena);
		} else if (e.getSource() == this.vista.btneliminarcooki) {
		    eliminarProductoPorMesa("Cookie", 0.50,vista.btneliminarcooki);
		} else if (e.getSource() == this.vista.btneliminartortitas) {
		    eliminarProductoPorMesa("Tortitas", 2.00,vista.btneliminartortitas);
		} else if (e.getSource() == this.vista.btneliminartostadadejamon) {
		    eliminarProductoPorMesa("Tostadas de Jamon", 2.00,vista.btneliminartostadadejamon);
		} else if (e.getSource() == this.vista.btneliminarcroassan) {
		    eliminarProductoPorMesa("Croassan", 1.20,vista.btneliminarcroassan);
		} else if (e.getSource() == this.vista.btneliminarpalmera) {
		    eliminarProductoPorMesa("Palmera", 1.00,vista.btneliminarpalmera);
		} else if (e.getSource() == this.vista.btneliminarchurros) {
		    eliminarProductoPorMesa("Churros", 0.50,vista.btneliminarchurros);
		} else if (e.getSource() == this.vista.btneliminarcafesolo) {
		    eliminarProductoPorMesa("Cafe", 1.20,vista.btneliminarcafesolo);
		} else if (e.getSource() == this.vista.btneliminarcortado) {
		    eliminarProductoPorMesa("Cortado", 1.50, vista.btneliminarcortado);
		} else if (e.getSource() == this.vista.btneliminarcaramel) {
		    eliminarProductoPorMesa("Caramel", 2.50,vista.btneliminarcaramel);
		} else if (e.getSource() == this.vista.btneliminarfrapuchino) {
		    eliminarProductoPorMesa("Frapuchino", 2.00,vista.btneliminarfrapuchino);
		} else if (e.getSource() == this.vista.btneliminarcolacao) {
		    eliminarProductoPorMesa("Cola Cao", 1.50,vista.btneliminarcolacao);
		} else if (e.getSource() == this.vista.btneliminarcafeconleche) {
		    eliminarProductoPorMesa("Cafe con leche", 1.20,vista.btneliminarcafeconleche);
		} else if (e.getSource() == this.vista.btneliminarcafelargo) {
		    eliminarProductoPorMesa("Cafe Largo", 1.50,vista.btneliminarcafelargo);
		} else if (e.getSource() == this.vista.btneliminarrzumo) {
		    eliminarProductoPorMesa("Zumo", 1,vista.btneliminarrzumo);
		}
		//Botono volver atras del panel mesa
		if(e.getSource()==this.vista.btnAtras){
			this.vista.panelnicio.setVisible(true);
			this.vista.panelMesa.setVisible(false);
		}
		//Boton volver atras mesas panel comida
		if(e.getSource()==this.vista.btnVueltasMesa) {
			this.vista.panelComida.setVisible(false);
			this.vista.panelMesa.setVisible(true);
			this.vista.lblCantidadDineroComida.setText("");
	        this.vista.lblPagarBebida.setText("");
		}
		//Boton volver atras mesas panel bebida
		if(e.getSource()==this.vista.btnVolverMesaBebida) {
			this.vista.panelBebida.setVisible(false);
			this.vista.panelMesa.setVisible(true);
			this.vista.lblCantidadDineroComida.setText("");
	        this.vista.lblPagarBebida.setText("");
		}
		//Boton ir panel comida desde panel bebida
		if(e.getSource()==this.vista.btnComida) {
			this.vista.panelBebida.setVisible(false);
			this.vista.panelComida.setVisible(true);
		}
		//Boton ir panel bebida desde panel comida
		if(e.getSource()==this.vista.btnBebida) {
			this.vista.panelBebida.setVisible(true);
			this.vista.panelComida.setVisible(false);
		}
		//Boton de pagar comida
		   if (e.getSource() == this.vista.btnPagarComida) {
		        Double cantidad = pagarPorMesa(modelo, this.vista.list_1);
		        this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad) + "€");
		        this.vista.lblPagarBebida.setText(String.valueOf(cantidad) + "€");
		    }
			//Boton de pagar bebida
		    if (e.getSource() == this.vista.btnPagarBebidas) {
		        Double cantidad = pagarPorMesa(modelo, this.vista.list_2);
		        this.vista.lblCantidadDineroComida.setText(String.valueOf(cantidad) + "€");
		        this.vista.lblPagarBebida.setText(String.valueOf(cantidad) + "€");
		    }
			//Boton de ir panel inventario
		    if(e.getSource()==this.vista.btnInventarioComida) {
		    	this.vista.panelMesa.setVisible(false);
		    	this.vista.panelnvetarioComida.setVisible(true);
		    }
			//ComboBox inventario
		    if(e.getSource()==this.vista.comboBoxNombreProducto) {
		    	String productoSeleccionado = (String) this.vista.comboBoxNombreProducto.getSelectedItem();
			    	 for (Producto producto : productostotales) {
			    	            if(producto.getNombre().equalsIgnoreCase(productoSeleccionado)) {
			    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
			    	            }   
			    	 
		    }
		   }
			//Boton añadir inventario
		    if(e.getSource()==this.vista.btnAñadirInventario) {
		    	añadirinventario();

		   }
			//Boton eliminar inventario
		    if(e.getSource()==this.vista.btnEliminarInventario) {
		    	eliminarinventario();
		   }
		  //Boton volver a mesa desde panel inventario
		   if(e.getSource()==this.vista.btnVolverMesas) {
			   this.vista.panelnvetarioComida.setVisible(false);
			   this.vista.panelMesa.setVisible(true);
			   
		   }
		  
		      
		
}	
	


	
//Metodos
	public void ponerImagen() {
		vista.btnMesa1.setIcon(fotoEscalar2(this.vista.btnMesa1,"imagenes/1.jpg"));
		vista.btnMesa2.setIcon(fotoEscalar2(this.vista.btnMesa2,"imagenes/2.jpg"));
		vista.btnMesa3.setIcon(fotoEscalar2(this.vista.btnMesa3,"imagenes/3.jpg"));
		vista.btnMesa4.setIcon(fotoEscalar2(this.vista.btnMesa4,"imagenes/4.jpg"));
		vista.btnMesa5.setIcon(fotoEscalar2(this.vista.btnMesa5,"imagenes/5.jpg"));
		vista.btnMesa6.setIcon(fotoEscalar2(this.vista.btnMesa6,"imagenes/6.jpg"));
		vista.btnAtras.setIcon(fotoEscalar2(this.vista.btnAtras,"imagenes/cerrar-sesion.png"));
		vista.lblNewLabel_10.setIcon(fotoEscalar(this.vista.lblNewLabel_10,"imagenes/tostada.jpg"));
		vista.lblNewLabel_11.setIcon(fotoEscalar(this.vista.lblNewLabel_11,"imagenes/tosta-de-jamon.jpg"));
		vista.lblNewLabel_12.setIcon(fotoEscalar(this.vista.lblNewLabel_12,"imagenes/croasan.jpg"));
		vista.lblNewLabel_13.setIcon(fotoEscalar(this.vista.lblNewLabel_13,"imagenes/Palmera.jpg"));
		vista.lblNewLabel_14.setIcon(fotoEscalar(this.vista.lblNewLabel_14,"imagenes/churros.jpg"));
		vista.lblNewLabel_15.setIcon(fotoEscalar(this.vista.lblNewLabel_15,"imagenes/tortitas.jpg"));
		vista.lblNewLabel_16.setIcon(fotoEscalar(this.vista.lblNewLabel_16,"imagenes/cooki.jpg"));
		vista.lblNewLabel_17.setIcon(fotoEscalar(this.vista.lblNewLabel_17,"imagenes/avena.jpg"));
		vista.lblNewLabel_2.setIcon(fotoEscalar(this.vista.lblNewLabel_2,"imagenes/cafe.jpg"));
		vista.lblNewLabel_3.setIcon(fotoEscalar(this.vista.lblNewLabel_3,"imagenes/cafe-con-leche.jpg"));
		vista.lblNewLabel_4.setIcon(fotoEscalar(this.vista.lblNewLabel_4,"imagenes/colacao.jpg"));
		vista.lblNewLabel_5.setIcon(fotoEscalar(this.vista.lblNewLabel_5,"imagenes/esmorzaled_cafes_cortado.jpg"));
		vista.lblNewLabel_6.setIcon(fotoEscalar(this.vista.lblNewLabel_6,"imagenes/zumo.jpg"));
		vista.lblNewLabel_7.setIcon(fotoEscalar(this.vista.lblNewLabel_7,"imagenes/frappuccino-estilo-starbucks.jpg"));
		vista.lblNewLabel_8.setIcon(fotoEscalar(this.vista.lblNewLabel_8,"imagenes/caramel.jpg"));
		vista.lblNewLabel_9.setIcon(fotoEscalar(this.vista.lblNewLabel_9,"imagenes/cafe-expreso-casero.jpg"));
		vista.lblFondo.setIcon(fotoEscalar(this.vista.lblFondo,"imagenes/fondo.png"));
		vista.lblFondoComida.setIcon(fotoEscalar(this.vista.lblFondoComida,"imagenes/fondo.png"));
		vista.lblFondoInventario.setIcon(fotoEscalar(this.vista.lblFondoInventario,"imagenes/fondo.png"));
		vista.lblFondoPanelInicio.setIcon(fotoEscalar(this.vista.lblFondoPanelInicio,"imagenes/fondo.png"));
		vista.lblFondoMesa.setIcon(fotoEscalar(this.vista.lblFondoMesa,"imagenes/fondo.png"));
		vista.lbTextoComandaBebida.setIcon(fotoEscalar(this.vista.lbTextoComandaBebida,"imagenes/fotocomanda.png"));
		vista.lblIamgenComandaComida.setIcon(fotoEscalar(this.vista.lblIamgenComandaComida,"imagenes/fotocomanda.png"));
	}
	public List rellenar(Personal empleados) {
		List<Personal>empleados1=new ArrayList<>();
		empleados1.add(new Personal("Ruben","1"));
		empleados1.add(new Personal("Fran","12"));	
		empleados1.add(new Personal("Luis","hola"));
		
		return empleados1;
	}
	public void agregarNuevoUsuario(String nombre, String contraseña) {
		 Personal nuevoEmpleado = new Personal(nombre, contraseña);
		 totalempleados.add(nuevoEmpleado);
	}
	public List rellenarproducto(Producto inventario,List<Producto>productos) {
		productos.add(new Producto("Tostadas",1,1.50));
		productos.add(new Producto("Avena",50,2.50));
		productos.add(new Producto("Cookie",200,0.50));
		productos.add(new Producto("Tortitas",150,2.00));
		productos.add(new Producto("Tostadas de Jamon",150,2.00));
		productos.add(new Producto("Croassan",2000,1.20));
		productos.add(new Producto("Palmera",34,1.00));
		productos.add(new Producto("Churros",150,0.50));
		productos.add(new Producto("Cafe",50,1.20));
		productos.add(new Producto("Cortado",20,1.50));
		productos.add(new Producto("Caramel",200,2.50));
		productos.add(new Producto("Frapuchino",75,2.00));
		productos.add(new Producto("Cola Cao",123,1.50));
		productos.add(new Producto("Cafe con leche",50,1.20));
		productos.add(new Producto("Cafe Largo",84,1.50));
		productos.add(new Producto("Zumo",53,1));
		return productos;
	}
	public ImageIcon fotoEscalar(JLabel label, String url) {
		ImageIcon imagenDefecto = new ImageIcon(url);
	    ImageIcon icono = new ImageIcon(imagenDefecto.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
	    return icono;
	}
	public ImageIcon fotoEscalar2(JButton label, String url) {
		ImageIcon imagenDefecto = new ImageIcon(url);
	    ImageIcon icono = new ImageIcon(imagenDefecto.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH));
	    return icono;
	}

	public void hora(JLabel label) {
		SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        String horaActual = formatoHora.format(new Date());
        label.setText(horaActual);
	}
	public void agregarcombobox(List<Producto>productos) {
		this.vista.comboBoxNombreProducto.addItem("Tostadas");
		this.vista.comboBoxNombreProducto.addItem("Avena");
		this.vista.comboBoxNombreProducto.addItem("Cookie");
		this.vista.comboBoxNombreProducto.addItem("Tortitas");
		this.vista.comboBoxNombreProducto.addItem("Tostadas de Jamon");
		this.vista.comboBoxNombreProducto.addItem("Croassan");
		this.vista.comboBoxNombreProducto.addItem("Palmera");
		this.vista.comboBoxNombreProducto.addItem("Churros");
		this.vista.comboBoxNombreProducto.addItem("Cafe");
		this.vista.comboBoxNombreProducto.addItem("Cortado");
		this.vista.comboBoxNombreProducto.addItem("Caramel");
		this.vista.comboBoxNombreProducto.addItem("Frapuchino");
		this.vista.comboBoxNombreProducto.addItem("Cola Cao");
		this.vista.comboBoxNombreProducto.addItem("Cafe con leche");
		this.vista.comboBoxNombreProducto.addItem("Cafe Largo");
		this.vista.comboBoxNombreProducto.addItem("Zumo");
}


	private void agregarProductoPorMesa(String producto, double precio, JButton button) {
	    String mesaNombre = this.vista.lblnombremesaBebida.getText();
	    int mesaNumero = Integer.parseInt(mesaNombre.split(" ")[1]);
	    
	    switch (mesaNumero) {
	        case 1:
	            agregarProducto(mesa1, producto, precio, button);
	            this.vista.lblestadomesa1.setText("Ocupado"); 
	            this.vista.lblestadomesa1.setForeground(Color.red); 
	            break;
	        case 2:
	            agregarProducto(mesa2, producto, precio, button);
	            this.vista.lblestadomesa2.setText("Ocupado");
	            this.vista.lblestadomesa2.setForeground(Color.red); 
	            break;
	        case 3:
	            agregarProducto(mesa3, producto, precio, button);
	            this.vista.lblestadomesa3.setText("Ocupado");
	            this.vista.lblestadomesa3.setForeground(Color.red); 
	            break;
	        case 4:
	            agregarProducto(mesa4, producto, precio, button);
	            this.vista.lblestadomesa4.setText("Ocupado");
	            this.vista.lblestadomesa4.setForeground(Color.red); 
	            break;
	        case 5:
	            agregarProducto(mesa5, producto, precio, button);
	            this.vista.lblestadomesa5.setText("Ocupado");
	            this.vista.lblestadomesa5.setForeground(Color.red); 
	            break;
	        case 6:
	            agregarProducto(mesa6, producto, precio, button);
	            this.vista.lblestadomesa6.setText("Ocupado");
	            this.vista.lblestadomesa6.setForeground(Color.red); 

	            break;
	        default:
	           
	            break;
	    }
	}
	private void eliminarProductoPorMesa(String producto, double precio,JButton button) {
	    String mesaNombre = this.vista.lblnombremesaBebida.getText();
	    int mesaNumero = Integer.parseInt(mesaNombre.split(" ")[1]); 
	    
	    switch (mesaNumero) {
	        case 1:
	            eliminarProducto(mesa1, producto, precio, button);  
	            break;
	        case 2:
	            eliminarProducto(mesa2, producto, precio, button);
	            break;
	        case 3:
	            eliminarProducto(mesa3, producto, precio, button);
	            break;
	        case 4:
	            eliminarProducto(mesa4, producto, precio, button);
	            break;
	        case 5:
	            eliminarProducto(mesa5, producto, precio, button);
	            break;
	        case 6:
	            eliminarProducto(mesa6, producto, precio, button);
	            break;
	        default:
	          
	            break;
	    }
	}

	public void agregarProducto(Mesa mesa, String producto, double precio,JButton boton) {
	    for (Producto prod : productostotales) {
	        if (prod.getNombre().equals(producto) && prod.getCantidad() > 0) { 
	        	boton.setEnabled(true);
	            mesa.agregarProducto(prod.getNombre(), 1); 
	            prod.setCantidad(prod.getCantidad() - 1); 
	            this.vista.lblnohaycomida.setText("");
	        	this.vista.lblnohaybebida.setText("");
	        	this.vista.lblCantidadActual_1.setText(String.valueOf(prod.getCantidad()));
	        	if(prod.getNombre().equals(producto) && prod.getCantidad() == 0) {
		        	boton.setEnabled(false);	        	
		        }
	        }
	    }

	    actualizarModeloDeLista(mesa);
	}
	
	public void actualizarModeloDeLista(Mesa mesa) {
	    if (modelo != null) {
	        modelo.clear(); 
	        HashMap<String, Integer> comanda = mesa.getComanda(); 
	        for (Map.Entry<String, Integer> entry : comanda.entrySet()) {
	            String producto = entry.getKey();
	            Integer cantidad = entry.getValue();
	            if (cantidad > 0) {
	                modelo.addElement(cantidad + " || " + producto); 
	            }
	        }
	        vista.list_2.setModel(modelo);
	        vista.list_1.setModel(modelo);
	    } 
	}
	
	public void eliminarProducto(Mesa mesa, String producto, double precio,JButton boton) {
		 for (Producto prod : productostotales) {
		        if (prod.getNombre().equals(producto) && prod.getCantidad() > 0) { 
		        	boton.setEnabled(true);
		            mesa.eliminarProducto(prod.getNombre(), 1); 
		            prod.setCantidad(prod.getCantidad() + 1); 
		            this.vista.lblnohaycomida.setText("");
		        	this.vista.lblnohaybebida.setText("");
		        	this.vista.lblCantidadActual_1.setText(String.valueOf(prod.getCantidad()));
		        	if(prod.getNombre().equals(producto) && prod.getCantidad() == 0) {
			        	boton.setEnabled(false);	        	
			        }
		        }
		    }

		    actualizarModeloDeLista(mesa);
		}
	public  Double pagarPorMesa(DefaultListModel<String> modelo, JList<String> list) {
	    String mesaNombre = this.vista.lblnombremesaBebida.getText();
	    Mesa mesa = null;

	    switch (mesaNombre) {
	        case "Mesa 1":
	            mesa = mesa1;
	            this.vista.lblestadomesa1.setText("Libre");
	            this.vista.lblestadomesa1.setForeground(new Color(0, 64, 0));
	            break;
	        case "Mesa 2":
	            mesa = mesa2;
	            this.vista.lblestadomesa2.setText("Libre");
	            this.vista.lblestadomesa2.setForeground(new Color(0, 64, 0));
	            break;
	        case "Mesa 3":
	            mesa = mesa3;
	            this.vista.lblestadomesa3.setText("Libre");
	            this.vista.lblestadomesa3.setForeground(new Color(0, 64, 0));
	            break;
	        case "Mesa 4":
	            mesa = mesa4;
	            this.vista.lblestadomesa4.setText("Libre");
	            this.vista.lblestadomesa4.setForeground(new Color(0, 64, 0));
	            break;
	        case "Mesa 5":
	            mesa = mesa5;
	            this.vista.lblestadomesa5.setText("Libre");
	            this.vista.lblestadomesa5.setForeground(new Color(0, 64, 0));
	            break;
	        case "Mesa 6":
	            mesa = mesa6;
	            this.vista.lblestadomesa6.setText("Libre");
	            this.vista.lblestadomesa6.setForeground(new Color(0, 64, 0));
	            break;
	        default:
	        break;
	    }

	    return pagar(mesa, modelo, list);
	}
	public Double pagar(Mesa mesa, DefaultListModel<String> modelo, JList<String> list) {
	    double total = 0.0;
	    double precio=0.0;
	    
	    HashMap<String, Integer> comanda = mesa.getComanda();
	    for (Map.Entry<String, Integer> entry : comanda.entrySet()) {
	        String producto = entry.getKey();
	        Integer cantidad = entry.getValue();
	        for (Producto prod : productostotales) {
	            if (prod.getNombre().equals(producto)) {
	                double precioProducto = prod.getPrecio();
	                precio = precioProducto * cantidad;
	                total=total+precio;
	                mesa.eliminarProducto(prod.getNombre(), cantidad); 
	            }
	        }
	    }
	    modelo.clear();
	    list.setModel(modelo); 
	    actualizarModeloDeLista(mesa); 
	    return total; 
	}
	
	public void añadirinventario() {
		String productoSeleccionado = (String) this.vista.comboBoxNombreProducto.getSelectedItem();
	    int cantidadAAgregar=Integer.parseInt(this.vista.textFieldCantidad.getText());

	    if(cantidadAAgregar>=0) {
	    	 for (Producto producto : productostotales) {
	    	        if (producto.getNombre().equalsIgnoreCase(productoSeleccionado)) {
	    	            producto.setCantidad(producto.getCantidad() + cantidadAAgregar);	
	    	            if(productoSeleccionado.equalsIgnoreCase("Tostadas")) {
	    	            	this.vista.btnañadirtostada.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Avena")) {
	    	            	this.vista.btnañadirvolavena.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cookie")) {
	    	            	this.vista.btnañadircooki.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Tortitas")) {
	    	            	this.vista.btnañadirtortitas.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Tostadas de Jamon")) {
	    	            	this.vista.btnañadirtostadadejamon.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Croassan")) {
	    	            	this.vista.btnañadircroassan.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Palmera")) {
	    	            	this.vista.btnañadirpalmera.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Churros")) {
	    	            	this.vista.btnañadirchurros.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe")) {
	    	            	this.vista.btnañadircafesolo.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cortado")) {
	    	            	this.vista.btnañadircortado.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Caramel")) {
	    	            	this.vista.btnañadircaramel.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Frapuchino")) {
	    	            	this.vista.btnañadirfrapuchino.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cola Cao")) {
	    	            	this.vista.btnañadircolacao.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe con leche")) {
	    	            	this.vista.btnaladircafeconleche.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe Largo")) {
	    	            	this.vista.btnañadircafelargo.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }else if(productoSeleccionado.equalsIgnoreCase("Zumo")) {
	    	            	this.vista.lblFalloInventario.setEnabled(true);
	    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
	    	            }
	    	        }
	    	    }
	    }else {
	    	this.vista.lblFalloInventario.setText("Esa cantidad no se puede");
	    }
	    this.vista.textFieldCantidad.setText("");
	   
	}
	public void eliminarinventario() {
		 String productoSeleccionado = (String) this.vista.comboBoxNombreProducto.getSelectedItem();
 	    int cantidadAAgregar=Integer.parseInt(this.vista.textFieldCantidad.getText());
 	    
 	    if(cantidadAAgregar>=0) {
 	    	 for (Producto producto : productostotales) {
		    	        if (producto.getNombre().equalsIgnoreCase(productoSeleccionado) && producto.getCantidad()>cantidadAAgregar || producto.getCantidad()==cantidadAAgregar) {
		    	            producto.setCantidad(producto.getCantidad() - cantidadAAgregar);
		    	            if(productoSeleccionado.equalsIgnoreCase("Tostadas")) {
		    	            	this.vista.btnañadirtostada.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Avena")) {
		    	            	this.vista.btnañadirvolavena.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cookie")) {
		    	            	this.vista.btnañadircooki.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Tortitas")) {
		    	            	this.vista.btnañadirtortitas.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Tostadas de Jamon")) {
		    	            	this.vista.btnañadirtostadadejamon.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Croassan")) {
		    	            	this.vista.btnañadircroassan.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Palmera")) {
		    	            	this.vista.btnañadirpalmera.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Churros")) {
		    	            	this.vista.btnañadirchurros.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe")) {
		    	            	this.vista.btnañadircafesolo.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cortado")) {
		    	            	this.vista.btnañadircortado.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Caramel")) {
		    	            	this.vista.btnañadircaramel.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Frapuchino")) {
		    	            	this.vista.btnañadirfrapuchino.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cola Cao")) {
		    	            	this.vista.btnañadircolacao.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe con leche")) {
		    	            	this.vista.btnaladircafeconleche.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Cafe Largo")) {
		    	            	this.vista.btnañadircafelargo.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }else if(productoSeleccionado.equalsIgnoreCase("Zumo")) {
		    	            	this.vista.btnañadirzumo.setEnabled(false);
		    	            	this.vista.lblCantidadActual_1.setText(String.valueOf(producto.getCantidad()));
		    	            }
		    	        }
		    	    }
 	    }else {
 	    	this.vista.lblFalloInventario.setText("Esa cantidad no se puede");
 	    }
 	   
 	    this.vista.textFieldCantidad.setText("");
	}

}