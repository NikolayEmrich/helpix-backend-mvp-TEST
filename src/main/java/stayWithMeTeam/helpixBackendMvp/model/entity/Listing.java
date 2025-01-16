package stayWithMeTeam.helpixBackendMvp.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "listing")
public class Listing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "slug", nullable = false)
    private String slug;

    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "contact_phone", nullable = false)
    private String contactPhone;

    @Column(name = "contact_email", nullable = false)
    private String contactEmail;

    @Column(name = "website_url", nullable = false)
    private String websiteUrl;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "map_link", nullable = false)
    private String mapLink;

    @Column(name = "map_embed_link", nullable = false)
    private String mapEmbedLink;

    @Column(name = "map_provider", nullable = false)
    private String mapProvider;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "currency_code", nullable = false)
    private String currencyCode;

    @Column(name = "price_usd", nullable = false)
    private BigDecimal priceUsd;

    @Column(name = "payment_type", nullable = false)
    private int paymentType;

    // На диаграмме указана как "translations: ServiceTranslation[ ]"
    @OneToMany(mappedBy = "listing", cascade = CascadeType.PERSIST)
    private Set<ListingTranslation> translations;

    // На диаграмме указана как "images: ServiceImage[ ]"
    @OneToMany(mappedBy = "listing", cascade = CascadeType.PERSIST)
    private Set<ListingImage> images;

    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;



    // Constructor. Getters & setters. Equals & hashCode. To String.

    public Listing() {
    }

    public Listing(String slug, Long categoryId, Long userId, String contactPhone, String contactEmail, String websiteUrl, LocalDateTime createdAt, LocalDateTime updatedAt, boolean isActive, String location, String mapLink, String mapEmbedLink, String mapProvider, String address, BigDecimal price, String currencyCode, BigDecimal priceUsd, int paymentType, Set<ListingTranslation> translations, Set<ListingImage> images, Category category) {
        this.slug = slug;
        this.categoryId = categoryId;
        this.userId = userId;
        this.contactPhone = contactPhone;
        this.contactEmail = contactEmail;
        this.websiteUrl = websiteUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isActive = isActive;
        this.location = location;
        this.mapLink = mapLink;
        this.mapEmbedLink = mapEmbedLink;
        this.mapProvider = mapProvider;
        this.address = address;
        this.price = price;
        this.currencyCode = currencyCode;
        this.priceUsd = priceUsd;
        this.paymentType = paymentType;
        this.translations = translations;
        this.images = images;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", categoryId=" + categoryId +
                ", userId=" + userId +
                ", contactPhone='" + contactPhone + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", isActive=" + isActive +
                ", location='" + location + '\'' +
                ", mapLink='" + mapLink + '\'' +
                ", mapEmbedLink='" + mapEmbedLink + '\'' +
                ", mapProvider='" + mapProvider + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", currencyCode='" + currencyCode + '\'' +
                ", priceUsd=" + priceUsd +
                ", paymentType=" + paymentType +
                ", translations=" + translations +
                ", images=" + images +
                ", category=" + category +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMapLink() {
        return mapLink;
    }

    public void setMapLink(String mapLink) {
        this.mapLink = mapLink;
    }

    public String getMapEmbedLink() {
        return mapEmbedLink;
    }

    public void setMapEmbedLink(String mapEmbedLink) {
        this.mapEmbedLink = mapEmbedLink;
    }

    public String getMapProvider() {
        return mapProvider;
    }

    public void setMapProvider(String mapProvider) {
        this.mapProvider = mapProvider;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(BigDecimal priceUsd) {
        this.priceUsd = priceUsd;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public Set<ListingTranslation> getTranslations() {
        return translations;
    }

    public void setTranslations(Set<ListingTranslation> translations) {
        this.translations = translations;
    }

    public Set<ListingImage> getImages() {
        return images;
    }

    public void setImages(Set<ListingImage> images) {
        this.images = images;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Listing listing = (Listing) o;
        return isActive == listing.isActive && paymentType == listing.paymentType && Objects.equals(id, listing.id) && Objects.equals(slug, listing.slug) && Objects.equals(categoryId, listing.categoryId) && Objects.equals(userId, listing.userId) && Objects.equals(contactPhone, listing.contactPhone) && Objects.equals(contactEmail, listing.contactEmail) && Objects.equals(websiteUrl, listing.websiteUrl) && Objects.equals(createdAt, listing.createdAt) && Objects.equals(updatedAt, listing.updatedAt) && Objects.equals(location, listing.location) && Objects.equals(mapLink, listing.mapLink) && Objects.equals(mapEmbedLink, listing.mapEmbedLink) && Objects.equals(mapProvider, listing.mapProvider) && Objects.equals(address, listing.address) && Objects.equals(price, listing.price) && Objects.equals(currencyCode, listing.currencyCode) && Objects.equals(priceUsd, listing.priceUsd) && Objects.equals(translations, listing.translations) && Objects.equals(images, listing.images) && Objects.equals(category, listing.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, slug, categoryId, userId, contactPhone, contactEmail, websiteUrl, createdAt, updatedAt, isActive, location, mapLink, mapEmbedLink, mapProvider, address, price, currencyCode, priceUsd, paymentType, translations, images, category);
    }
}
