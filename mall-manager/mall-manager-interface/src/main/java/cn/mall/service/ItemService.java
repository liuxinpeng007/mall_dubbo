package cn.mall.service;

import cn.mall.common.pojo.EsayUIDataGridResult;
import cn.mall.pojo.TbItem;

import java.util.List;

public interface ItemService {

    TbItem queryItemByID(long itemID);

    EsayUIDataGridResult queryAllItemInfo(int page, int rows);
}
