package org.project.controllers.chat;

import lombok.Builder;

@Builder
public record ChatRoomForm(Long roomNo, String roomNm, int max) {} // getter, 생성자, toString,equalsAndHashCode
