// Detect whole file from the  select folder;

package antivirus;

import java.io.File;


public class FileDetect extends Antivirus {

    //file detect
    {
       
        String path = UI.inputField.getText();
        path = path.replace("\\", "\\\\") + "\\\\";
        
        UI.inputField.setText(path);

        File directory = new File(path);
        File[] filesList = directory.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                

                String st = file.getName();
                
                hexvalue(st);
            }
        }
    }

}
