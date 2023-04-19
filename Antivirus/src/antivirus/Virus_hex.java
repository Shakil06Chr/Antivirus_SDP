// This class use for finding virus hexvalu

package antivirus;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Virus_hex {

    String v = "";

    String Method1() {
     
        try {

            
            String filePath = "C:\\Users\\user\\Desktop\\virus\\lotta.jpg";
           
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
            v = str1;

        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return v;

    }

}

