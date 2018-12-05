package cn.mall.service;

import cn.mall.pojo.TbItem;

import java.util.List;

public interface ItemService {

    TbItem queryItemByID(long itemID);

    List<TbItem> queryAllItemInfo();
}
