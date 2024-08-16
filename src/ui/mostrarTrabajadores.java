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
	private DefaultTableModel defaultTableModel ;
	private  Tienda tienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// El método main se puede usar para pruebas
	}

	public mostrarTrabajadores(Tienda tienda) {//BORRE TINEDA QUE PASABA PPR PAARAMETRO
		this.tienda=tienda;
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
				defaultTableModel=new DefaultTableModel();
				defaultTableModel.addColumn("Nombre");
				defaultTableModel.addColumn("Apellido");
				defaultTableModel.addColumn("CI");
				defaultTableModel.addColumn("Numero Trabajador");
				defaultTableModel.addColumn("Salario Basico");
				defaultTableModel.addColumn("Nivel Escolar");
				defaultTableModel.addColumn("Cargo");
		ArrayList<Trabajador> trabajadores= tienda.getTrabajadores();
		for (int i = 0; i < trabajadores.size(); i++) {
			defaultTableModel.addRow( new Object[]  {
					trabajadores.get(i).getNombre(),
					trabajadores.get(i).getApellidos(),
					trabajadores.get(i).getNumeroId(),
					trabajadores.get(i).getNumeroTrabajador(),
					trabajadores.get(i).getSalarioBasico(),
					trabajadores.get(i).getCargo(),
					trabajadores.get(i).getNivelEscolar()

			});
			
		}
		
		table.setModel(defaultTableModel);
	}
}
