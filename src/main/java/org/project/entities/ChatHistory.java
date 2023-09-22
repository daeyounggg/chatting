package org.project.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class ChatHistory extends BaseEntity{
    @Id @GeneratedValue
    private Long seq;
    private String string;
    private String message;

    @ToString.Exclude
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="rommNo")
    private ChatRoom room;


}
