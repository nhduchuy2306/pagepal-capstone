package com.pagepal.domain.entities.postgre;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.pagepal.domain.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "READER")
@Where(clause = "status = 'ACTIVE'")
public class Reader {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "rating")
    private int rating;

    @Column(name = "genre")
    private String genre;

    @Column(name = "language")
    private String language;

    @Column(name = "country_accent")
    private String countryAccent;

    @Column(name = "audio_description_url")
    private String audioDescriptionUrl;

    @Column(name = "description")
    private String description;

    @Column(name = "total_of_reviews")
    private String totalOfReviews;

    @Column(name = "total_of_bookings")
    private String totalOfBookings;

    @Column(name = "introduction_video_url")
    private String introductionVideoUrl;

    @Column(name = "experience")
    private Double experience;

    @Column(name = "tags")
    private String tags;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt = new Date();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status = Status.ACTIVE;

    @ManyToOne
    @JoinColumn(name = "level_id")
    @JsonManagedReference
    private Level level;

    @OneToMany(mappedBy = "reader", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<WorkingTime> workingTimes;

    @OneToMany(mappedBy = "reader", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Service> services;

    @OneToMany(mappedBy = "reader", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Follow> follows;

    @OneToMany(mappedBy = "reader", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Promotion> promotions;

    @OneToMany(mappedBy = "reader", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Request> requests;

    @OneToMany(mappedBy = "reader", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Meeting> meetings;
}
