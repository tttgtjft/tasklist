package ru.odincov.tasklist.web.mappers;

import org.mapstruct.Mapper;
import ru.odincov.tasklist.domain.task.Task;
import ru.odincov.tasklist.web.dto.task.TaskDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDto(Task task);

    List<TaskDto> toDto(List<Task> tasks);

    Task toEntity(TaskDto taskDto);

}
