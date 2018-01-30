package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

	//根据商品id查询商品
	public TbItem findItemById(Long itemId);
	
}
