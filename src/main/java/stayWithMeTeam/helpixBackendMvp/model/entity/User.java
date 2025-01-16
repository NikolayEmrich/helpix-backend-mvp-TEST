package stayWithMeTeam.helpixBackendMvp.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "is_admin", nullable = false)
    private boolean isAdmin;

    @Column(name = "currency_code", nullable = false)
    private String currencyCode;

    @Column(name = "country_code", nullable = false)
    private String countryCode;

    @Column(name = "language_code", nullable = false)
    private String languageCode;

    // Service указан на диаграмме без сущности
    // private Set<Service> services;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Set<Review> reviews;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Set<Account> accounts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
    private Set<Session> sessions;


    // Constructor. Getters & setters. Equals & hashCode. To String.

    public User() {
    }

    public User(String name, LocalDateTime createdAt, LocalDateTime updatedAt, boolean isAdmin, String currencyCode, String countryCode, String languageCode, Set<Review> reviews, Set<Account> accounts, Set<Session> sessions) {
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isAdmin = isAdmin;
        this.currencyCode = currencyCode;
        this.countryCode = countryCode;
        this.languageCode = languageCode;
        this.reviews = reviews;
        this.accounts = accounts;
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", isAdmin=" + isAdmin +
                ", currencyCode='" + currencyCode + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", languageCode='" + languageCode + '\'' +
                ", reviews=" + reviews +
                ", accounts=" + accounts +
                ", sessions=" + sessions +
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

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    public Set<Session> getSessions() {
        return sessions;
    }

    public void setSessions(Set<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isAdmin == user.isAdmin && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(createdAt, user.createdAt) && Objects.equals(updatedAt, user.updatedAt) && Objects.equals(currencyCode, user.currencyCode) && Objects.equals(countryCode, user.countryCode) && Objects.equals(languageCode, user.languageCode) && Objects.equals(reviews, user.reviews) && Objects.equals(accounts, user.accounts) && Objects.equals(sessions, user.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createdAt, updatedAt, isAdmin, currencyCode, countryCode, languageCode, reviews, accounts, sessions);
    }
}
