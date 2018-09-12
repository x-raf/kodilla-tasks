package com.crud.tasks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TrelloTrelloDtoTest {

    @Test
    public void testGetBoard() {
        //Given
        TrelloTrelloDto trelloTrelloDto = new TrelloTrelloDto(1,1);
        //When

        //Then
        assertEquals(1,trelloTrelloDto.getBoard());
    }

    @Test
    public void testGetCard() {
        //Given
        TrelloTrelloDto trelloTrelloDto = new TrelloTrelloDto(1,1);
        //When

        //Then
        assertEquals(1,trelloTrelloDto.getBoard());
    }
}