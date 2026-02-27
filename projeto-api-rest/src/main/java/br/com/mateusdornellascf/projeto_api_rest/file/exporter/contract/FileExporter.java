package br.com.mateusdornellascf.projeto_api_rest.file.exporter.contract;

import org.springframework.core.io.Resource;
import java.util.List;

import br.com.mateusdornellascf.projeto_api_rest.data.dto.v3.PersonDTO;

public interface FileExporter {

    Resource exportFile(List<PersonDTO> people) throws Exception;
}
