package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import logic.DiscoPersonalizado;
import logic.Tienda;
import logic.VideoClip;

public class mostrarDiscosPersonalizados extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel defaultTableModel ;
	private  Tienda tienda;

	
	public mostrarDiscosPersonalizados(Tienda tienda) {
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
						"Nombre", "Interprete", "Soporte", "Precio", "Tama�o", "Cantidad de Datos"

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
		actualizarDiscosP();
	}

	/**
	 * Método para actualizar la tabla con los datos de los discos P
	 */
	public void actualizarDiscosP() {
				defaultTableModel=new DefaultTableModel();
				defaultTableModel.addColumn("Nombre");
				defaultTableModel.addColumn("Interprete");
				defaultTableModel.addColumn("Soporte");
				defaultTableModel.addColumn("Precio");
				defaultTableModel.addColumn("Tama�o");
				defaultTableModel.addColumn("Cantidad de Datos");
		ArrayList<DiscoPersonalizado> discos = tienda.ListDiscosP();
		for (int i = 0; i < discos.size(); i++) {
			defaultTableModel.addRow( new Object[]  {
					discos.get(i).getNombreDisco(),
					discos.get(i).getInterprete(),
					discos.get(i).getTipoSoporte(),
					discos.get(i).calacularPrecio(),
					discos.get(i).getTamano(),
					discos.get(i).getCantidadDatosGrabados(),

			});
			
		}
		
		table.setModel(defaultTableModel);
	}
}
