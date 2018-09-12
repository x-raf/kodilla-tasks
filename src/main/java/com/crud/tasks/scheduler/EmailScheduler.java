package com.crud.tasks.scheduler;

import com.crud.tasks.config.AdminConfig;
import com.crud.tasks.domain.Mail;
import com.crud.tasks.repository.TaskRepository;
import com.crud.tasks.service.SimpleEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class EmailScheduler {

    private static final String SUBJECT = "Tasks: Once a day email.";

    @Autowired
    private SimpleEmailService simpleEmailService;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private AdminConfig adminConfig;

    @Scheduled(cron = "0 0 7 * * ?")
    public void sendInformationEmail() {
        long size = taskRepository.count();
        String infoMessage = "Currently in database you have "+ size + ((size == 1) ? "task" : "tasks");
        //String infoMessage = MessageFormat.format("Currently in database there {0, choice, 0#are no tasks|1#is one task|1<are {0, number, integer} tasks}",size);
        simpleEmailService.send(new Mail(
                adminConfig.getAdminMail(),
                SUBJECT,
                infoMessage,
                "")
        );
    }

}
