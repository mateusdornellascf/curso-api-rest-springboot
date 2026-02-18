package br.com.mateusdornellascf.projeto_api_rest.integrationtests.dto.wrappers.xml;

import br.com.mateusdornellascf.projeto_api_rest.integrationtests.dto.BookDTO;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PagedModelBook {

    @XmlElement(name = "content")
    private List<BookDTO> content;

    public PagedModelBook() {
    }

    public List<BookDTO> getContent() {
        return content;
    }

    public void setContent(List<BookDTO> content) {
        this.content = content;
    }
}
