package service.impl;

import model.Tenant;
import org.springframework.stereotype.Service;
import repository.TenantRepository;
import service.TenantService;

import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {
    private final TenantRepository tenantRepository;

    public TenantServiceImpl(TenantRepository tenantRepository) {
        this.tenantRepository = tenantRepository;
    }

    @Override
    public void save(Tenant tenant) {
        tenantRepository.save(tenant);
    }

    @Override
    public Tenant getById(Integer id) {
        return tenantRepository.getById(id);
    }

    @Override
    public List<Tenant> getAll() {
        return tenantRepository.findAll();
    }
}
