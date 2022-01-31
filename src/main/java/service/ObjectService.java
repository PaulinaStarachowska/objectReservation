package service;

import dto.ObjectDto;

import java.util.List;

public interface ObjectService {

    void save(Object object);

    Object getById(Integer id);

    List<Object> getAll();

    void update(Object object);

    void delete(Integer id);

    void add(Object object);

    List<ObjectDto> getAllDto();

}
