package mapper;

import dto.ObjectDto;
import model.Object;

public final class ObjectMapper {

    private ObjectMapper() {

    }

    public static ObjectDto map(Object object) {
        return new ObjectDto(object.getId(), object.getObjectName(), object.getPrice(), object.getDescription(), object.getArea());
    }
}
