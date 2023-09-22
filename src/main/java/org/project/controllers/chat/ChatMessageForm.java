package org.project.controllers.chat;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;

@Builder
public record ChatMessageForm(
        @NotBlank
        String nickNm,
        @NotBlank
        String message,
        @NotBlank
        Long roomNo) {}