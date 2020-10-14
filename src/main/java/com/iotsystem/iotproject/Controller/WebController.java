package com.iotsystem.iotproject.Controller;

import com.iotsystem.iotproject.Entity.Message;
import org.springframework.stereotype.Controller;

@Controller
public class WebController {
    public Message send(Message message) {
        return new Message(message.getAttributeName(), message.getMaxValue(), message.getActualValue());
    }
}
