package org.example.pmanchu_be.domain.user.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.pmanchu_be.global.entity.BaseIdEntity;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User extends BaseIdEntity {
    @Column(nullable = false)
    private String email;

    private Long githubId;

    private String githubUsername;

    private String ShortIntroduction;

    private String introduction;

}
