package ru.odincov.tasklist.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import ru.odincov.tasklist.domain.task.Task;

import java.util.List;
import java.util.Optional;

@Mapper
public interface TaskRepository {

    Optional<Task> findById(Long id);

    List<Task> findAllByUserId(Long userId);

    void assignUserById(@Param("taskId") Long taskId, @Param("userId") Long userId);

    void update(Task task);

    void create(Task task);

    void delete(Long id);

}