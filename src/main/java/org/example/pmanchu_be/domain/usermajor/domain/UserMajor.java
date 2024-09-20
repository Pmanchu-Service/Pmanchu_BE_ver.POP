package org.example.pmanchu_be.domain.usermajor.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import org.example.pmanchu_be.domain.user.domain.User;
import org.example.pmanchu_be.global.entity.BaseIdEntity;

public class UserMajor extends BaseIdEntity {
    private String specialization;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;
}