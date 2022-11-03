import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana extends JFrame{

    private Almacen almacen;
    private Archivo archivo = new Archivo();
    private String [] culumnas = {"id","nombre","precio","cantidad"};
    private DefaultTableModel model = new DefaultTableModel();


    private JTextField LeerCantidad;
    private JPanel panel1;
    private JTextField LeerNombre;
    private JButton actualizarButton;
    private JTable table1;
    private JButton retirarButton;
    private JButton agregarButton;
    private JButton verInformeButton;
    private JScrollPane JScrollPane;
    private JTextField LeerPrecio;

    public Ventana(){

        setSize(800,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(panel1);

        if(archivo.leer() == null){
            almacen = new Almacen();
        }else {
            almacen = archivo.leer();
        }

        model.setColumnIdentifiers(culumnas);


        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = LeerNombre.getText();
                int cantidad = Integer.parseInt(LeerCantidad.getText());
                double precio = Double.parseDouble(LeerPrecio.getText());

                almacen.agregarProducto(nombre,precio,cantidad);

            }
        });

        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //table1.getSelectedRow();

            }
        });

        retirarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                String nombre = LeerNombre.getName();
                int cantidad = Integer.parseInt(LeerCantidad.getText());

                if(almacen.existeProducto(nombre)){
                    //almacen.retirarProducto();
                }

            }
        });

    }


    public void mostrarTabla(){

    }


}
