package com.ankit.hostelbooking.entity;

import jakarta.persistence.*;

@Entity
public class Hostel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String city;
    private String location;

    private Double price;
    private String rent;

    private String imageUrl;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String galleryImages;

    private String rating;
    private String reviews;
    private String distance;

    private String hostelType;
    private String sharingType;
    private String mess;

    private String ownerPhone;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String facilities;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String description;

    public Hostel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(String galleryImages) {
        this.galleryImages = galleryImages;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getHostelType() {
        return hostelType;
    }

    public void setHostelType(String hostelType) {
        this.hostelType = hostelType;
    }

    public String getSharingType() {
        return sharingType;
    }

    public void setSharingType(String sharingType) {
        this.sharingType = sharingType;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}