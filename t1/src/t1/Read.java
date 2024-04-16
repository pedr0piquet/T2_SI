package t1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {
    public static String read(String filePath) {
        // Specify the file path
    	
    	//String currentDirectory = System.getProperty("user.dir") + File.separator + "files";
        
        // Specify the file path relative to the current directory
        String content = "";
        try {
			content = fileInputStreamToString(filePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println(content);
        return content;
    }
    
    public static String fileInputStreamToString(String filePath) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileInputStream fis = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fis);
             BufferedReader reader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
