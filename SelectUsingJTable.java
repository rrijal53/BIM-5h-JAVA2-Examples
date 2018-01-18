import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class SelectUsingJTable extends JFrame{

	JTable jTable;
	public SelectUsingJTable() {
		try (
		        Connection conn = DriverManager.getConnection(
		              "jdbc:mysql://localhost:3306/BIM7th", "root", "root"); 
		        Statement stmt = conn.createStatement();
		     ) {	
			String sql = "SELECT * FROM Student";
			ResultSet r = stmt.executeQuery(sql);
//			Vector rowData = new Vector();
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn("Name");
			model.addColumn("Address");
			while(r.next()){
			//	Vector vi = new Vector();
		//	vi.add(r.getString("name"));
		//	vi.add(r.getString("address"));
//				rowData.add(vi);
				String[] row = {r.getString("name"), r.getString("address")};
				model.addRow(row);
//				System.out.println(
//						"Name = " + r.getString("name") );
//						"\nAddress = " + r.getString("address"));
			}
//			String[] columns = {"Name", "Address"};
//			String[][] data = { 
//					{"ROSHAN", "ABC"}, {"ABC", "ABC"}
//			};
			//jTable = new JTable(data, columns);
//			Vector v = new Vector();
//			v.addElement("Name");
//			v.addElement("Address");
			
			
			jTable = new JTable(model);
			JScrollPane jsp = new JScrollPane(jTable);
			add(jsp);
			
		}catch(SQLException e) {
		
		    	 	e.printStackTrace();
		     }
		
		setVisible(true);
		setSize(400, 200);
	}
	
	public static void main(String[] args) {
		new SelectUsingJTable();
	}
}
