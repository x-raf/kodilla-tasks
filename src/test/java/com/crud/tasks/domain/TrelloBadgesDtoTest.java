package com.crud.tasks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TrelloBadgesDtoTest {

    @Test
    public void testGetVotes() {
        //Given
        TrelloTrelloDto trelloTrelloDto = new TrelloTrelloDto(1,1);
        TrelloAttachmentsDto attachmentsDto = new TrelloAttachmentsDto(trelloTrelloDto);
        TrelloBadgesDto trelloBadgesDto = new TrelloBadgesDto(1,attachmentsDto);
        //When
        //Then
        assertEquals(1,trelloBadgesDto.getVotes());
    }

    @Test
    public void testGetAttachmentsByType() {
        //Given
        TrelloTrelloDto trelloTrelloDto = new TrelloTrelloDto(1,1);
        TrelloAttachmentsDto attachmentsDto = new TrelloAttachmentsDto(trelloTrelloDto);
        TrelloBadgesDto trelloBadgesDto = new TrelloBadgesDto(1,attachmentsDto);
        //When
        //Then
        assertEquals(1,trelloBadgesDto.getAttachmentsByType().getTrello().getBoard());
    }
}