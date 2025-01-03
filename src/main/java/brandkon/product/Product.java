package brandkon.product;

import brandkon.brand.Brand;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private int expirationDays;

    @ManyToOne
    private Brand brand;

    @CreatedDate
    private LocalDateTime createdAt; // createdDateTime

    @LastModifiedDate
    private LocalDateTime updatedAt; // modifiedDateTime

    public Product() {
    }

    public Product(String name, int price, int expirationDays, Brand brand) {
        this.name = name;
        this.price = price;
        this.expirationDays = expirationDays;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getExpirationDays() {
        return expirationDays;
    }

    public Brand getBrand() {
        return brand;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
