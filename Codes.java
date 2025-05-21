package UniversityMS;
import university.*;
import RSMaterialComponent.RSComboBox;
import RSMaterialComponent.RSTextFieldMaterial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Codes {
  Statement std;
    Connection con;
    ResultSet rs;
    public JTable t=null;
      public void setConnection(){
        try{
             java.lang.Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/universityms","root","");
            std=con.createStatement();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No Connection!");
        }
        }
       public void setTable(JTable ta){
       t=ta;
    }
    public JTable getTable(){
        return t;
    }  
     public void report(String path,String sql){
         try{
             this.setConnection();
             JasperDesign design=JRXmlLoader.load(path);
             JRDesignQuery query=new JRDesignQuery();
             design.setQuery(query);
             query.setText(sql);             
             JasperReport  rep=JasperCompileManager.compileReport(design);
             JasperPrint pr=JasperFillManager.fillReport(rep,null,con);
             JasperViewer.viewReport(pr,false);
         }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex.getMessage());
         }
     }
    public void setSql(String sql){
    try{
            setConnection();
//            int ok=std.executeUpdate(sql);
//            JOptionPane.showMessageDialog(null, ok==1?"Operation Is Done":"Failed");
            rs=std.executeQuery(sql);
            if(rs.next())
                JOptionPane.showMessageDialog(null, rs.getString("msg"));
             else
                JOptionPane.showMessageDialog(null, "failed");
                
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            //.showMessageDialog(null, ex.getMessage());
        }
}
    
    public void viewTable(String sql,JTable table){
         try{
            setConnection();
           rs=std.executeQuery(sql);
           table.setModel(DbUtils.resultSetToTableModel(rs));
           con.close();
          
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
     public ResultSet search(String sql){
         try{
            setConnection();
            rs=std.executeQuery(sql);
          //  con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         return rs;
    }
     public void fillComboBox(JComboBox box, String sql, String field){
          try{
            setConnection();
            rs=std.executeQuery(sql);
            while(rs.next()){
                box.addItem(rs.getString(field));
            }
            con.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
     }
         
    public void ComboBox(String sql,JComboBox box,String field){
         setConnection();
        try{
            rs=std.executeQuery(sql);
            while(rs.next()){
                box.addItem(rs.getString(field));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public String getid(String sql,String col)
    {
        String id="";
       setConnection();
        try{
            rs=std.executeQuery(sql);
            if(rs.next()){
               id=rs.getString(col);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return id;
    }
    public void getValue(String sql,String field,JLabel lb){
        this.search(sql);
        try
        {
           if(rs.next())
           {
               lb.setText(rs.getString(field));
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }


    
}

             