package br.com.mateusdornellascf.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import java.util.List;
import java.util.ArrayList;


public class ObjectMapper {

    //Mapear entidade para DTO e vice-versa
    private static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    //Recebe um objeto Person do tipo O e converte para PersonDTO do tipo D
    public static<O, D> D parseObject(O origin, Class<D> destination) {
        return mapper.map(origin, destination);
    }
    public static<O, D>List<D> parseListObject(List<O> origin, Class<D> destination) {
        //Cria uma lista de destino do tipo D
        List<D> destinationObject = new ArrayList<D>();

        //Intera pelos objetos originais, converte um a um para o novo tipo e adiciona na lista de destino
        for(Object o : origin) {
            destinationObject.add(mapper.map(o, destination));
        }
        //Develve a lista convertida
        return destinationObject;
    }
    
}
