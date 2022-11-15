package com.sda.rares.advanced.recap.ex1.model;

public abstract class SoftwareProduct implements Sellable{

    private boolean receivedOnMail;
    private boolean sentOnDvdDisk;
    private String licenseType;
    private String releasedBy;

    public SoftwareProduct(boolean receivedOnMail, boolean sentOnDvdDisk, String licenseType, String releasedBy) {
        this.receivedOnMail = receivedOnMail;
        this.sentOnDvdDisk = sentOnDvdDisk;
        this.licenseType = licenseType;
        this.releasedBy = releasedBy;
    }


    @Override
    public String getCurrency() {
        return "EUR";
    }


    @Override
    public String getProductCategory() {
        return "Software";
    }

    public boolean isReceivedOnMail() {
        return receivedOnMail;
    }

    public void setReceivedOnMail(boolean receivedOnMail) {
        this.receivedOnMail = receivedOnMail;
    }

    public boolean isSentOnDvdDisk() {
        return sentOnDvdDisk;
    }

    public void setSentOnDvdDisk(boolean sentOnDvdDisk) {
        this.sentOnDvdDisk = sentOnDvdDisk;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getReleasedBy() {
        return releasedBy;
    }

    public void setReleasedBy(String releasedBy) {
        this.releasedBy = releasedBy;
    }

    @Override
    public String toString() {
        return "SoftwareProduct{" +
                "receivedOnMail=" + receivedOnMail +
                ", sentOnDvdDisk=" + sentOnDvdDisk +
                ", licenseType='" + licenseType + '\'' +
                ", releasedBy='" + releasedBy + '\'' +
                '}';
    }
}
