package com.example.Myapplication.Repository;

import com.example.Myapplication.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
