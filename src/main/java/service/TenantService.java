package service;

import model.Tenant;

import java.util.List;

public interface TenantService {
    void save(Tenant tenant);

    Tenant getById(Integer id);

    List<Tenant> getAll();
}
