package org.example.pmanchu_be.domain.refreshtoken.domain;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;
import org.springframework.data.redis.core.index.Indexed;

@RedisHash
@Getter
@Builder
public class RefreshToken {
    @Id
    private final String id;

    @Indexed
    private String token;

    @TimeToLive
    private long ttl;

    public void update(String token, long ttl) {
        this.token = token;
        this.ttl = ttl;
    }
}
