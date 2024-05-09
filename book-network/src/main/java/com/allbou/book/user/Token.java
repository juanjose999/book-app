package com.allbou.book.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {
    @Id
    @GeneratedValue
    private Integer id;
    private String token;
    private LocalDateTime createAt;
    private LocalDateTime expiredAt;
    private LocalDateTime validateAt;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

}
