package cn.mall.service.impl;

import cn.mall.mapper.TbItemMapper;
import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品表Service
 */
@Service("itemService")
public class ItemServiceImpl implements ItemService {

    /**
     * 商品Mapper
     */
    @Autowired
    private TbItemMapper itemMapper;

    /**
     * 根据商品ID查询商品信息
     * @param itemID 商品ID
     * @return
     */
    public TbItem queryItemByID(long itemID) {
        TbItem item = itemMapper.selectByPrimaryKey(itemID);
        return item;
    }
}
