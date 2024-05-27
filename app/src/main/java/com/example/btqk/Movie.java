package com.example.btqk;

public class Movie {
    private String title;
    private String genre;
    private int detail;

    public Movie(String title, String genre, int detail) {
        this.title = title;
        this.genre = genre;
        this.detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return detail;
    }

    public void add(Movie movie) {
    }

    public byte[] getImageUrl() {
        return null;
    }
}
