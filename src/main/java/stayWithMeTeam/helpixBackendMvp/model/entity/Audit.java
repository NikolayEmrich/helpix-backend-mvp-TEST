package stayWithMeTeam.helpixBackendMvp.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "audit")
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "action", nullable = false)
    private String action;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "resource_id", nullable = false)
    private Long resourceId;


    // Constructor. Getters & setters. Equals & hashCode. To String.

    public Audit() {
    }

    public Audit(String action, LocalDateTime createdAt, Long userId, Long resourceId) {
        this.action = action;
        this.createdAt = createdAt;
        this.userId = userId;
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "id=" + id +
                ", action='" + action + '\'' +
                ", createdAt=" + createdAt +
                ", userId=" + userId +
                ", resourceId=" + resourceId +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audit audit = (Audit) o;
        return Objects.equals(id, audit.id) && Objects.equals(action, audit.action) && Objects.equals(createdAt, audit.createdAt) && Objects.equals(userId, audit.userId) && Objects.equals(resourceId, audit.resourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, action, createdAt, userId, resourceId);
    }
}
