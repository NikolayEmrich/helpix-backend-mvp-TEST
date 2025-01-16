package stayWithMeTeam.helpixBackendMvp.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "listing_translation")
public class ListingTranslation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    // На диаграмме обозначено как "serviceId: Long"
    @Column(name = "listing_id", nullable = false)
    private Long listingId;

    @Column(name = "language_code", nullable = false)
    private String languageCode;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "is_default", nullable = false)
    private boolean isDefault;



    // Constructor. Getters & setters. Equals & hashCode. To String.

    public ListingTranslation() {
    }

    public ListingTranslation(Long listingId, String languageCode, String title, String description, boolean isDefault) {
        this.listingId = listingId;
        this.languageCode = languageCode;
        this.title = title;
        this.description = description;
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "ListingTranslation{" +
                "id=" + id +
                ", listingId=" + listingId +
                ", languageCode='" + languageCode + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getListingId() {
        return listingId;
    }

    public void setListingId(Long listingId) {
        this.listingId = listingId;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListingTranslation that = (ListingTranslation) o;
        return isDefault == that.isDefault && Objects.equals(id, that.id) && Objects.equals(listingId, that.listingId) && Objects.equals(languageCode, that.languageCode) && Objects.equals(title, that.title) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, listingId, languageCode, title, description, isDefault);
    }
}
