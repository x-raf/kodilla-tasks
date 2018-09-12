package com.crud.tasks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TrelloAttachmentsDtoTest {

    @Test
    public void testGetTrello() {
        //Given
        TrelloTrelloDto trelloTrelloDto = new TrelloTrelloDto(1,1);
        TrelloAttachmentsDto attachmentsDto = new TrelloAttachmentsDto(trelloTrelloDto);
        //When
        //Then
        assertEquals(1,attachmentsDto.getTrello().getBoard());
        assertEquals(1,attachmentsDto.getTrello().getCard());
    }
}