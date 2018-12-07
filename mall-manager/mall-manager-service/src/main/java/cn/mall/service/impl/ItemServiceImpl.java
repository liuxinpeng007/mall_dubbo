package cn.mall.service.impl;

import cn.mall.common.pojo.EsayUIDataGridResult;
import cn.mall.mapper.TbItemMapper;
import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public EsayUIDataGridResult queryAllItemInfo(int page, int rows) {
        logger.info("queryAllItemInfo() - begin");
        // 1.设置分页参数
        PageHelper.startPage(page, rows);
        // 2.查询全部商品信息
        List<TbItem> list = itemMapper.queryAllItemInfo();
        // 3.获取分页信息对象
        PageInfo<TbItem> info = new PageInfo<>(list);
        // 4.创建返回对象
        EsayUIDataGridResult result = new EsayUIDataGridResult();
        // 5.设置返回对象的值
        result.setRows(list);
        // 总记录数
        result.setTotal(info.getTotal());
        logger.info("queryAllItemInfo() - end");
        return result;
    }
}
