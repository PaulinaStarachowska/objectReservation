package service.impl;

import dto.ObjectDto;
import org.springframework.stereotype.Service;
import repository.ObjectRepository;
import service.ObjectService;

import java.util.List;

@Service
public class ObjectServiceImpl implements ObjectService {
    private final ObjectRepository objectRepository;

    public ObjectServiceImpl(ObjectRepository objectRepository) {
        this.objectRepository = objectRepository;
    }

    @Override
    public void save(Object object) {
        objectRepository.save(object);
    }

    @Override
    public Object getById(Integer id) {
        return  objectRepository.getById(id);
    }

    @Override
    public List<Object> getAll() {
        return objectRepository.findAll();
    }

    @Override
    public void update(Object object) {
        objectRepository.save(object);
    }

    @Override
    public void delete(Integer id) {
    }

    @Override
    public void add(Object object) {

    }

    @Override
    public List<ObjectDto> getAllDto() {
        return null;
    }

    }
