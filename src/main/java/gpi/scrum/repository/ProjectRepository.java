package gpi.scrum.repository;

import gpi.scrum.domain.Project;

import java.util.List;
import java.util.Optional;

import gpi.scrum.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    Optional<Project> findByName(String name);
}
