package br.com.mateusdornellascf.projeto_api_rest.controllers.v3.docs;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import br.com.mateusdornellascf.projeto_api_rest.data.dto.v3.UploadFileResponseDTO;

import java.util.List;

@Tag(name = "File Endpoint")
public interface FileControllerDocs {

    UploadFileResponseDTO uploadFile(MultipartFile file);

    List<UploadFileResponseDTO> uploadMultipleFiles(MultipartFile[] files);

    ResponseEntity<Resource> downloadFile(String fileName,
            HttpServletRequest request);
}