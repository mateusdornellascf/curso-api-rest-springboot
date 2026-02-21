package br.com.mateusdornellascf.projeto_api_rest.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "file")
public class FileStorageConfig {

    private String uploadDir;

    public FileStorageConfig() {
    }

    public void setUploadDir(String uploadDir){
        this.uploadDir = uploadDir;
    }

    public String getUploadDir(){
        return uploadDir;
    }
}
