import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;


public class MancalaHistory extends JFrame {

	String[][] results;
	MancalaHistory( final String[][] results){
		this.results = results; 
        this.setTitle("Mancala game - Systems Modeling Fall 2010");
        this.setSize(800, 410);
        this.setResizable(false);
        this.setVisible(true);
        
        TableModel dataModel = new AbstractTableModel() {
        	String[] header = {"Game number", "Player name", "Score", "Player name", "Score", "Result"};
			private static final long serialVersionUID = 1L;
			public int getColumnCount() { return results[0].length; }
            public int getRowCount() { return results.length;}
            public Object getValueAt(int row, int col) { return new String(results[row][col]); }
            public String getColumnName(int column) {
                return header[column];
              }
        };

        JTable table = new JTable(dataModel);
        JScrollPane scrollpane = new JScrollPane(table);
        this.add(scrollpane);
	}
}
