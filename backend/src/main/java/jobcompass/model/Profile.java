package jobcompass.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="profile", schema = "public")
public class Profile implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String skills;
    private String certifications;
    private String experience;
    private String education;
    private String contact;
    private String socials;
    private String portfolioLinks;
    private String profilePicture;

    public Profile() {}

    public Profile(String skills, String certifications, String experience, String education, String contact, String socials, String portfolioLinks, String profilePicture) {
        this.skills = skills;
        this.certifications = certifications;
        this.experience = experience;
        this.education = education;
        this.contact = contact;
        this.socials = socials;
        this.portfolioLinks = portfolioLinks;
        this.profilePicture = profilePicture;
    }

    public Long getId() {
        return id;
    }

    public void id(Long id) {
        this.id = id;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getSocials() {
        return socials;
    }

    public void setSocials(String socials) {
        this.socials = socials;
    }

    public String getPortfolioLinks() {
        return portfolioLinks;
    }

    public void setPortfolioLinks(String portfolioLinks) {
        this.portfolioLinks = portfolioLinks;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", skills='" + skills + '\'' +
                ", certifications='" + certifications + '\'' +
                ", experience='" + experience + '\'' +
                ", education='" + education + '\'' +
                ", contact='" + contact + '\'' +
                ", socials='" + socials + '\'' +
                ", portfolioLinks='" + portfolioLinks + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                '}';
    }
}
