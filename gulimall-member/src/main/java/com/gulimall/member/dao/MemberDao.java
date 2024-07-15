package com.gulimall.member.dao;

import com.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author meng
 * @email 2171290799@qq.com
 * @date 2024-07-15 12:38:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
