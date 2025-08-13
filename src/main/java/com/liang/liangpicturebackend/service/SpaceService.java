package com.liang.liangpicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liang.liangpicturebackend.model.dto.space.SpaceAddRequest;
import com.liang.liangpicturebackend.model.dto.space.SpaceQueryRequest;
import com.liang.liangpicturebackend.model.entity.Space;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liang.liangpicturebackend.model.entity.User;
import com.liang.liangpicturebackend.model.vo.SpaceVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 田亮
* @description 针对表【space(空间)】的数据库操作Service
* @createDate 2025-08-11 20:55:30
*/
public interface SpaceService extends IService<Space> {

    void validSpace(Space space, boolean add);

    void fillSpaceBySpaceLevel(Space space);

    long addSpace(SpaceAddRequest spaceAddRequest, User loginUser);

    SpaceVO getSpaceVO(Space space, HttpServletRequest request);

    Page<SpaceVO> getSpaceVOPage(Page<Space> spacePage, HttpServletRequest request);

    QueryWrapper<Space> getQueryWrapper(SpaceQueryRequest spaceQueryRequest);

    void checkSpaceAuth(User loginUser, Space space);
}
