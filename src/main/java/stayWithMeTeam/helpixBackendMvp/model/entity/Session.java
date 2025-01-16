package stayWithMeTeam.helpixBackendMvp.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "refresh_token", nullable = false)
    private String refreshToken;

    @Column(name = "user_agent", nullable = false)
    private String userAgent;

    @Column(name = "expired_at", nullable = false)
    private LocalDateTime expiredAt;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "client_id", nullable = false)
    private String clientId;


    // Constructor. Getters & setters. Equals & hashCode. To String.

    public Session() {
    }

    public Session(Long userId, String refreshToken, String userAgent, LocalDateTime expiredAt, LocalDateTime createdAt, String clientId) {
        this.userId = userId;
        this.refreshToken = refreshToken;
        this.userAgent = userAgent;
        this.expiredAt = expiredAt;
        this.createdAt = createdAt;
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", userId=" + userId +
                ", refreshToken='" + refreshToken + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", expiredAt=" + expiredAt +
                ", createdAt=" + createdAt +
                ", clientId='" + clientId + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public LocalDateTime getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Objects.equals(id, session.id) && Objects.equals(userId, session.userId) && Objects.equals(refreshToken, session.refreshToken) && Objects.equals(userAgent, session.userAgent) && Objects.equals(expiredAt, session.expiredAt) && Objects.equals(createdAt, session.createdAt) && Objects.equals(clientId, session.clientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, refreshToken, userAgent, expiredAt, createdAt, clientId);
    }
}
