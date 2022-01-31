package service;

import model.Landlord;

import java.util.List;

public interface LandlordService {
    void save(Landlord landlord);

    Landlord getById(Integer id);

    List<Landlord> getAll();

}

