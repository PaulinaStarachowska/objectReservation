package service.impl;

import model.Landlord;
import org.springframework.stereotype.Service;
import repository.LandlordRepository;
import service.LandlordService;

import java.util.List;

@Service
public class LandlordServiceImpl implements LandlordService {
    private final LandlordRepository landlordRepository;

    public LandlordServiceImpl(LandlordRepository landlordRepository) {
        this.landlordRepository = landlordRepository;
    }

    @Override
    public void save(Landlord landlord) {
        landlordRepository.save(landlord);
    }

    @Override
    public Landlord getById(Integer id) {
        return landlordRepository.getById(id);
    }

    @Override
    public List<Landlord> getAll() {
        return landlordRepository.findAll();
    }
}

