package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author salecoding
 * @email salecoding@gmail.com
 * @date 2020-06-01 20:16:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
