
package com.fileSystem;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    
    import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

    @Service
    public class FileReadExample {

        @Value("${my.file.path}")
        private String appName;


        public String readFile(String filename) {
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(appName + filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content.toString();
        }
    }