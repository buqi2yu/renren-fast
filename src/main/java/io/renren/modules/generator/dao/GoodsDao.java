package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.GoodsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品管理
 * 
 * @author buqi2yu
 * @email buqi2yu@163.com
 * @date 2020-02-28 22:02:47
 */
@Mapper
public interface GoodsDao extends BaseMapper<GoodsEntity> {
	
}
