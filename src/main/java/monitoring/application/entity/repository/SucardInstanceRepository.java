package monitoring.application.entity.repository;

import monitoring.application.entity.data.SqlScript;
import monitoring.application.entity.data.SucardInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SucardInstanceRepository extends JpaRepository<SucardInstance,Long> {
    SucardInstance findByName(String name);



}
