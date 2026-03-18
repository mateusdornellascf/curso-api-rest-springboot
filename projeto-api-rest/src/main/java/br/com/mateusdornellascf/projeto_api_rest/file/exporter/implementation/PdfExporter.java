package br.com.mateusdornellascf.projeto_api_rest.file.exporter.implementation;

import java.util.List;

import org.springframework.core.io.Resource;

import br.com.mateusdornellascf.projeto_api_rest.data.dto.v3.PersonDTO;
import br.com.mateusdornellascf.projeto_api_rest.file.exporter.contract.FileExporter;

public class PdfExporter implements FileExporter{

    @Override
    public Resource exportFile(List<PersonDTO> people) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exportFile'");
    }

}
