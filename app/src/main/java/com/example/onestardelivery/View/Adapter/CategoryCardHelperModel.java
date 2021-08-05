package com.example.onestardelivery.View.Adapter;

public class CategoryCardHelperModel {
    private int ThumbnailImage;
    private int InstructorImage;
    private String InstructorName;
    private String CategoryCardTitle;

    public CategoryCardHelperModel(int thumbnailImage, int instructorImage, String instructorName, String categoryCardTitle) {
        ThumbnailImage = thumbnailImage;
        InstructorImage = instructorImage;
        InstructorName = instructorName;
        CategoryCardTitle = categoryCardTitle;
    }

    public int getThumbnailImage() {
        return ThumbnailImage;
    }

    public void setThumbnailImage(int thumbnailImage) {
        ThumbnailImage = thumbnailImage;
    }

    public int getInstructorImage() {
        return InstructorImage;
    }

    public void setInstructorImage(int instructorImage) {
        InstructorImage = instructorImage;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String instructorName) {
        InstructorName = instructorName;
    }

    public String getCategoryCardTitle() {
        return CategoryCardTitle;
    }

    public void setCategoryCardTitle(String categoryCardTitle) {
        CategoryCardTitle = categoryCardTitle;
    }
}
