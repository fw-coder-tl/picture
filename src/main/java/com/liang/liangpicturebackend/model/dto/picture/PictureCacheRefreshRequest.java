package com.liang.liangpicturebackend.model.dto.picture;

import lombok.Data;

@Data
public class PictureCacheRefreshRequest {

    private String cacheKey;

    public String getCacheKey() {
        return cacheKey;
    }

    public void setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
    }

}
