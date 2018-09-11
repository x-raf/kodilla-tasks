package com.crud.tasks.mapper;

import com.crud.tasks.domain.Task;
import com.crud.tasks.domain.TaskDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TaskMapperTest {

    @Autowired
    private TaskMapper taskMapper;

    @Test
    public void testMapToTask() {
        //Given
        TaskDto taskDto = new TaskDto(1L,"Test task 1","Test task 1 content");
        //When
        Task theTask = taskMapper.mapToTask(taskDto);
        //Then
        assertEquals("Test task 1",theTask.getTitle());
        assertEquals("Test task 1 content", theTask.getContent());
    }

    @Test
    public void testMapToTaskDto() {
        //Given
        Task task = new Task(1L,"Test task 1","Test task 1 content");
        //When
        TaskDto theTaskDto = taskMapper.mapToTaskDto(task);
        //Then
        assertEquals("Test task 1", theTaskDto.getTitle());
        assertEquals("Test task 1 content", theTaskDto.getContent());
    }

    @Test
    public void testMapToTaskDtoList() {
        //Given
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1L,"Test task 1","Test task 1 content"));
        taskList.add(new Task(2L,"Test task 2","Test task 2 content"));
        //When
        List<TaskDto> theList = taskMapper.mapToTaskDtoList(taskList);
        //Then
        assertEquals("Test task 1", theList.get(0).getTitle());
        assertEquals("Test task 2 content", theList.get(1).getContent());
    }
}
