package br.com.mateusdornellascf.projeto_api_rest.file.exporter.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import br.com.mateusdornellascf.projeto_api_rest.exceptions.BadRequestException;
import br.com.mateusdornellascf.projeto_api_rest.file.exporter.MediaTypes;
import br.com.mateusdornellascf.projeto_api_rest.file.exporter.contract.FileExporter;
import br.com.mateusdornellascf.projeto_api_rest.file.exporter.implementation.CsvExporter;
import br.com.mateusdornellascf.projeto_api_rest.file.exporter.implementation.XlsxExporter;

@Component
public class FileExporterFactory {

    private Logger logger = LoggerFactory.getLogger(FileExporterFactory.class);

    @Autowired
    private ApplicationContext context;

    public FileExporter getExporter(String acceptHeader) throws Exception {
        if (acceptHeader.equalsIgnoreCase(MediaTypes.APPLICATION_XLSX_VALUE)) {
            return context.getBean(XlsxExporter.class);
        } else if (acceptHeader.equalsIgnoreCase(MediaTypes.APPLICATION_CSV_VALUE)) {
            return context.getBean(CsvExporter.class);
        } else {
            throw new BadRequestException("Invalid File Format!");
        }
    }

}