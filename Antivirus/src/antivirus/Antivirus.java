// Match virus signature with all file in the select folder

package antivirus;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Antivirus extends Virus_hex {

    int[] a = new int[100];
   

    Virus_hex ob = new Virus_hex();
    

    void hexvalue(String str) {
        
        {
            try {

                
                String filePath = UI.inputField.getText() + str;
                

                byte[] fileBytes = Files.readAllBytes(Paths.get(filePath));

                StringBuilder hexString = new StringBuilder();
                for (byte b : fileBytes) {
                    String hex = Integer.toHexString(b & 0xff);
                    if (hex.length() == 1) {
                        hexString.append('0');
                    }
                    hexString.append(hex);
                    
                }

                
                String str1 = hexString.toString();
                String ss = "";
                

                if (Method1().equals(str1)) {
                    
                
                    UI.outputField.append("Threat Found :" +filePath);
                    UI.outputField.append("\n");
                    
                    a[0] = 1;

                 
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
