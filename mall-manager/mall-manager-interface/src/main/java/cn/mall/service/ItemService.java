package cn.mall.service;

import cn.mall.common.pojo.EsayUIDataGridResult;
import cn.mall.pojo.TbItem;

import java.util.List;

/**
 * 商品Service接口
 */
public interface ItemService {
    /**
     * 根据商品ID查询商品
     * @param itemID
     * @return
     */
    TbItem queryItemByID(long itemID);

    /**
     * 查询所有商品信息
     * @param page 分页展示的页数
     * @param rows 每页显示的条目数
     * @return
     */
    EsayUIDataGridResult queryAllItemInfo(int page, int rows);

}
