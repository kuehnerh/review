package it.schwarz.jobs.review.coupon.provider.jpa;


import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name="APPLICATION")
public class ApplicationJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;

    @Column(name = "COUPON_CODE")
    private String code;

    @Column(name = "TIMESTAMP")
    private Instant timestamp;


    public ApplicationJpaEntity() {
    }

    public ApplicationJpaEntity(String code, Instant timestamp) {
        this.code = code;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
