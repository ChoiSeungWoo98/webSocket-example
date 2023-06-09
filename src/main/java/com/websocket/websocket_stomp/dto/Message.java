package com.websocket.websocket_stomp.dto;

import lombok.*;

// {"type":"", "sender":"me", "receiver":"b6268d02-ac43-fc6d-39bb-6e09151eb735", "data":"test..."}
// {"type":"", "sender":"me", "channelId":"eddy", "data":"test message"}
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    private String type;
    private String sender;
    private String channelId;
    private Object data;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void newConnect() {
        this.type = "new";
    }

    public void closeConnect() {
        this.type = "close";
    }
}
