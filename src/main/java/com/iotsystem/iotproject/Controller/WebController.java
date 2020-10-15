package com.iotsystem.iotproject.Controller;

import com.iotsystem.iotproject.Entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    @MessageMapping("/chat")
    @SendTo("topic/messages")
    public Message send(Message message) {
        return new Message(message.getAttributeName(), message.getMaxValue(), message.getActualValue());
    }
}
