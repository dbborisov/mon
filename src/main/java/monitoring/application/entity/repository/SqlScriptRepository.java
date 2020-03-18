package monitoring.application.entity.repository;

import monitoring.application.entity.data.SqlScript;
import monitoring.application.entity.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SqlScriptRepository extends JpaRepository<SqlScript,Long> {
}
