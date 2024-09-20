package org.example.pmanchu_be.domain.projectmember.domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.pmanchu_be.domain.project.domain.Project;
import org.example.pmanchu_be.domain.user.domain.User;
import org.example.pmanchu_be.global.entity.BaseIdEntity;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@SuperBuilder
@Table(name = "tbl_projectmember")
public class ProjectMember extends BaseIdEntity {
    private String role;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Project project;

    @Builder
    public ProjectMember(String role, User user, Project project) {
        this.role = role;
        this.user = user;
        this.project = project;
    }
}
