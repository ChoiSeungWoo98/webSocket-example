package com.websocket.websocket_stomp.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.websocket.websocket_stomp.dto.Message;

public class Utils {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    private Utils() {
    }

    public static Message getObject(final String message) throws Exception {
        return objectMapper.readValue(message, Message.class);
    }

    public static String getString(final Message message) throws Exception {
        return objectMapper.writeValueAsString(message);
    }
}