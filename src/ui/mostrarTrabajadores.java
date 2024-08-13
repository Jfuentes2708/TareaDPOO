package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import logic.Tienda;
import logic.Trabajador;

public class mostrarTrabajadores extends JDialog {

    private static final long serialVersionUID = 1L;
    private final JPanel contentPanel = new JPanel();
    private JTable table;
    private DefaultTableModel defaultTableModel = new DefaultTableModel();
    private final Tienda tienda;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        // El método main se puede usar para pruebas
    }

    /**
     * Constructor del diálogo.
     */
    public mostrarTrabajadores(final Tienda t) {
        tienda = t;
        setBounds(100, 100, 585, 444); // Establece el tamaño y posición del diálogo
        getContentPane().setLayout(new BorderLayout()); // Establece el layout del contenido
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5)); // Establece un borde vacío
        getContentPane().add(contentPanel, BorderLayout.CENTER); // Añade el panel de contenido al centro
        contentPanel.setLayout(null); // Establece el layout del panel de contenido

        // Crea y configura el JScrollPane
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(20, 51, 502, 293);
        contentPanel.add(scrollPane);

        // Crea y configura la JTable
        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Nombre", "Apellido", "CI", "Numero Trabajador", "Salario Basico", "Nivel Escolar", "Cargo"
               
            }
            
        ));
        scrollPane.setViewportView(table); // Añade la tabla al JScrollPane

        // Crea y configura el panel de botones
        JPanel buttonPane = new JPanel();
        buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(buttonPane, BorderLayout.SOUTH);

        // Crea y añade el botón OK
        JButton okButton = new JButton("OK");
        okButton.setActionCommand("OK");
        buttonPane.add(okButton);
        getRootPane().setDefaultButton(okButton);

        // Crea y añade el botón Cancel
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand("Cancel");
        buttonPane.add(cancelButton);
        actualizarTablaTrabajadores();
    }

    /**
     * Método para actualizar la tabla con los datos de los trabajadores.
     */
    public void actualizarTablaTrabajadores() {
        defaultTableModel = new DefaultTableModel(); // Crea un nuevo modelo de tabla
        defaultTableModel.addColumn("Nombre");
        defaultTableModel.addColumn("Apellido");
        defaultTableModel.addColumn("CI");
        defaultTableModel.addColumn("Numero Trabajador");
        defaultTableModel.addColumn("Salario Basico");
        defaultTableModel.addColumn("Nivel Escolar");
        defaultTableModel.addColumn("Cargo");
       // ArrayList<Trabajador>trab=new ArrayList<Trabajador>();
/*for (int i = 0; i < tienda.getTrabajadores().size(); i++) {
	 
	defaultTableModel.addRow(new Object[]{
	            tienda.getTrabajadores().get(i)
	        });
}*/
        
        // Añade dos filas con datos específicos
        defaultTableModel.addRow(new Object[]{
            "Juan", "Perez", "123456", "001", 500.0, "Universitario", "Ingeniero"
        });
        defaultTableModel.addRow(new Object[]{
            "Ana", "Gomez", "654321", "002", 600.0, "Secundario", "Doctora"
        });

        table.setModel(defaultTableModel); // Establece el nuevo modelo de tabla
    }
}