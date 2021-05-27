package com.eventos.models;

public class ApiGameImages {
    private String small;
    private String medium;
    private String large;
    private String original;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public ApiGameImages() {
    }

    public ApiGameImages(String small, String medium, String large, String original) {
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.original = original;
    }

    @Override
    public String toString() {
        return "ApiGameImages{" +
                "small='" + small + '\'' +
                ", medium='" + medium + '\'' +
                ", large='" + large + '\'' +
                ", original='" + original + '\'' +
                '}';
    }
}
