/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarbarang;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author fiona
 */
public class koneksi {
    
    public Properties myPanel, myLanguage;
    private String namePanel;
    
    public koneksi(){
        
    }
    
    public String SettingPanel(String nmPanel){
        try{
            myPanel = new Properties();
            myPanel.load(new FileInputStream("lib/database.ini"));
            namePanel = myPanel.getProperty(nmPanel);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return namePanel;
    }
}
