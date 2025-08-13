package com.liang.liangpicturebackend.model.dto.picture;

import lombok.Data;

import java.io.Serializable;

/**
 * 图片上传请求
 *
 * @author 田亮
 * @date 2025/8/1 03:34
 */
@Data
public class PictureUploadRequest implements Serializable {

    /**
     * 图片 id（用于修改）
     */
    private Long id;

    /**
     * 文件地址
     */
    private String fileUrl;

    /**
     * 图片名称
     */
    private String picName;

    /**
     * 空间 id
     */
    private Long spaceId;

    private static final long serialVersionUID = 1L;
}