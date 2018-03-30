package mvc2;

import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class Model extends DefaultTableModel {
    
    public Model() {
        super(Constants.DATA, Constants.TABLE_HEADER);
    }
}