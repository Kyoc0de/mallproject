package com.kyo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kyo.common.utils.PageUtils;
import com.kyo.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author kyo
 * @email sunlightcs@gmail.com
 * @date 2020-04-02 10:31:51
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

