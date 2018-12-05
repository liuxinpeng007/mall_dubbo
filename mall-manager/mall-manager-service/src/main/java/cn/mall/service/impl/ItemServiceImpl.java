package cn.mall.service.impl;

import cn.mall.mapper.TbItemMapper;
import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    public TbItem queryItemByID(long itemID) {
        System.out.println("queryItemByID() - begin");
        TbItem item = itemMapper.selectByPrimaryKey(itemID);
        System.out.println("queryItemByID() - end");
        return item;
    }
}
