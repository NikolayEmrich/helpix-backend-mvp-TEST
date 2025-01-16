package stayWithMeTeam.helpixBackendMvp.model.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "auth_provider", nullable = false)
    private String authProvider;

    @Column(name = "auth_id", nullable = false)
    private String authId;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "email_verified", nullable = false)
    private boolean emailVerified;

    // Отсутствует на диаграмме
    @Column(name = "id_token", nullable = false)
    private Long idToken;

    // Отсутствует на диаграмме
    @Column(name = "access_token_expires_in", nullable = false)
    private String accessTokenExpiresIn;



    // Constructor. Getters & setters. Equals & hashCode. To String.

    public Account() {
    }

    public Account(String name, String authProvider, String authId, LocalDateTime createdAt, LocalDateTime updatedAt, Long userId, String gender, String email, boolean emailVerified, Long idToken, String accessTokenExpiresIn) {
        this.name = name;
        this.authProvider = authProvider;
        this.authId = authId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.userId = userId;
        this.gender = gender;
        this.email = email;
        this.emailVerified = emailVerified;
        this.idToken = idToken;
        this.accessTokenExpiresIn = accessTokenExpiresIn;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", authProvider='" + authProvider + '\'' +
                ", authId='" + authId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", userId=" + userId +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", emailVerified=" + emailVerified +
                ", idToken=" + idToken +
                ", accessTokenExpiresIn='" + accessTokenExpiresIn + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthProvider() {
        return authProvider;
    }

    public void setAuthProvider(String authProvider) {
        this.authProvider = authProvider;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Long getIdToken() {
        return idToken;
    }

    public void setIdToken(Long idToken) {
        this.idToken = idToken;
    }

    public String getAccessTokenExpiresIn() {
        return accessTokenExpiresIn;
    }

    public void setAccessTokenExpiresIn(String accessTokenExpiresIn) {
        this.accessTokenExpiresIn = accessTokenExpiresIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return emailVerified == account.emailVerified && Objects.equals(id, account.id) && Objects.equals(name, account.name) && Objects.equals(authProvider, account.authProvider) && Objects.equals(authId, account.authId) && Objects.equals(createdAt, account.createdAt) && Objects.equals(updatedAt, account.updatedAt) && Objects.equals(userId, account.userId) && Objects.equals(gender, account.gender) && Objects.equals(email, account.email) && Objects.equals(idToken, account.idToken) && Objects.equals(accessTokenExpiresIn, account.accessTokenExpiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, authProvider, authId, createdAt, updatedAt, userId, gender, email, emailVerified, idToken, accessTokenExpiresIn);
    }
}
