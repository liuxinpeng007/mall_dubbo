package cn.mall.service.impl;

import cn.mall.mapper.TbItemMapper;
import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品表Service
 */
@Service
public class ItemServiceImpl implements ItemService {

    /**
     * 日志
     */
    private static final Logger logger = Logger.getLogger(ItemServiceImpl.class);
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
        logger.info("queryItemByID() - begin");
        TbItem item = itemMapper.selectByPrimaryKey(itemID);
        logger.info("queryItemByID() - end");
        return item;
    }

    /**
     * 查询全部商品信息
     * @return
     */
    public List<TbItem> queryAllItemInfo() {
        logger.info("queryAllItemInfo() - begin");
        List<TbItem> list = itemMapper.queryAllItemInfo();
        logger.info("queryAllItemInfo() - end");
        return list;
    }
}
