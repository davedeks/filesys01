package com.fileSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class AppRun {
    //private static final Logger log = LoggerFactory.getLogger(OdpRoute.class);  

    @Autowired FileReadExample fileReadExample;

 
        @Scheduled(fixedRate = 86400000) 
        public void runJob() {

        String message = "";

        message = fileReadExample.readFile("data.txt");
        System.out.println("Received Message: " + message);
    } 
}
