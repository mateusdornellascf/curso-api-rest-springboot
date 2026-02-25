package br.com.mateusdornellascf.projeto_api_rest.file.importer.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import br.com.mateusdornellascf.projeto_api_rest.exceptions.BadRequestException;
import br.com.mateusdornellascf.projeto_api_rest.file.importer.contract.FileImporter;
import br.com.mateusdornellascf.projeto_api_rest.file.importer.implementation.CsvImporter;
import br.com.mateusdornellascf.projeto_api_rest.file.importer.implementation.XlsxImporter;

@Component
public class FileImporterFactory {

    private Logger logger = LoggerFactory.getLogger(FileImporterFactory.class);

    @Autowired
    private ApplicationContext context;

    public FileImporter getImporter(String fileName) throws Exception {
        if (fileName.endsWith(".xlsx")) {
            return context.getBean(XlsxImporter.class);

        } else if (fileName.endsWith(".csv")) {
            return context.getBean(CsvImporter.class);

        } else {
            throw new BadRequestException("Invalid File Format!");
        }
    }

}