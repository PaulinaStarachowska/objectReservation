package repository;

import model.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TenantRepository extends JpaRepository<Tenant,Integer> {
    Optional<Tenant> findById(Integer id);
}
