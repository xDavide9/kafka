package com.xdavide9.kafka;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {
    private String message;
    private LocalDateTime createdAt;
}
