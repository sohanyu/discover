package net.ninini.code.entity;

public class THouseSlider {
    private Long pid;

    private Long housePid;

    private Integer sort;

    private String imageUri;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getHousePid() {
        return housePid;
    }

    public void setHousePid(Long housePid) {
        this.housePid = housePid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri == null ? null : imageUri.trim();
    }
}