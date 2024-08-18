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

import logic.Cancion;
import logic.Tienda;
import logic.Trabajador;

public class mostrarCanciones extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private DefaultTableModel defaultTableModel ;
	private  Tienda tienda;

	
	public mostrarCanciones(Tienda tienda) {
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
						"Titulo", "Genero", "Interprete", "Album", "Duracion", "Precio", "Tama�o"

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
		actualizarCanciones();
	}

	/**
	 * Método para actualizar la tabla con los datos de las canciones
	 */
	public void actualizarCanciones() {
				defaultTableModel=new DefaultTableModel();
				defaultTableModel.addColumn("Titulo");
				defaultTableModel.addColumn("Genero");
				defaultTableModel.addColumn("Interprete");
				defaultTableModel.addColumn("Album");
				defaultTableModel.addColumn("Duracion");
				defaultTableModel.addColumn("Precio");
				defaultTableModel.addColumn("Tama�o");
		ArrayList<Cancion> canciones= tienda.ListaCanciones();
		for (int i = 0; i < canciones.size(); i++) {
			defaultTableModel.addRow( new Object[]  {
					canciones.get(i).getTitulo(),
					canciones.get(i).getGenero(),
					canciones.get(i).getInterprete(),
					canciones.get(i).getAlbum(),
					canciones.get(i).getDuracion(),
					canciones.get(i).getPrecio(),
					canciones.get(i).getTamaFichero()

			});
			
		}
		
		table.setModel(defaultTableModel);
	}

}
