package com.example.TaskManager.repository;

import com.example.TaskManager.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // Additional query methods can be added here if needed
}
