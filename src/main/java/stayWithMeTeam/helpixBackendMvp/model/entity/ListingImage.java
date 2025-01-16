package stayWithMeTeam.helpixBackendMvp.model.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "listing_image")
public class ListingImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "is_primary", nullable = false)
    private boolean isPrimary;

    // На диаграмме под названием "seviceId"
    @Column(name = "listing_id", nullable = false)
    private Long listingId;



    // Constructor. Getters & setters. Equals & hashCode. To String.

    public ListingImage() {
    }

    public ListingImage(String imageUrl, boolean isPrimary, Long listingId) {
        this.imageUrl = imageUrl;
        this.isPrimary = isPrimary;
        this.listingId = listingId;
    }

    @Override
    public String toString() {
        return "ListingImage{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", isPrimary=" + isPrimary +
                ", listingId=" + listingId +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isPrimary() {
        return isPrimary;
    }

    public void setPrimary(boolean primary) {
        isPrimary = primary;
    }

    public Long getListingId() {
        return listingId;
    }

    public void setListingId(Long listingId) {
        this.listingId = listingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListingImage that = (ListingImage) o;
        return isPrimary == that.isPrimary && Objects.equals(id, that.id) && Objects.equals(imageUrl, that.imageUrl) && Objects.equals(listingId, that.listingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imageUrl, isPrimary, listingId);
    }
}
