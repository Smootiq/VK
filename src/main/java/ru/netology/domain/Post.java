package ru.netology.domain;

public class Post {
    private int id;
    private String contactInformation;
    private String imageUrl;
    private String text;
    private int data;
    private boolean like;
    private int view;
    private int repost;
    private boolean postIsPinned;
    private boolean canResponse;
    private boolean canDelete;
    private boolean canEdit;
    private String[] comment;

    public String[] getComment() {
        return comment;
    }

    public void setComment(String[] comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public boolean isPostIsPinned() {
        return postIsPinned;
    }

    public void setPostIsPinned(boolean postIsPinned) {
        this.postIsPinned = postIsPinned;
    }

    public boolean isCanResponse() {
        return canResponse;
    }

    public void setCanResponse(boolean canResponse) {
        this.canResponse = canResponse;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }
}
