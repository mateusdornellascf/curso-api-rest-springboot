package br.com.mateusdornellascf.projeto_api_rest.file.importer.contract;

import java.io.InputStream;
import java.util.List;

import br.com.mateusdornellascf.projeto_api_rest.data.dto.v3.PersonDTO;

public interface FileImporter {

    List<PersonDTO> importFile(InputStream inputStream) throws Exception;
}
