package cn.mall.controller;

import cn.mall.common.pojo.EsayUIDataGridResult;
import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 商品Controller
 */
@Controller
public class ItemController {

    /**
     * 商品Service
     */
    @Autowired
    private ItemService itemService;

    /**
     * 根据商品ID查询商品
     * @param itemID
     * @return
     */
    @RequestMapping("/item/{itemID}")
    @ResponseBody
    public TbItem queryItemInfo(@PathVariable long itemID) {
        TbItem item = itemService.queryItemByID(itemID);
        return item;
    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EsayUIDataGridResult queryAllItemInfo(@RequestParam("page") int page, @RequestParam("rows") int rows) {
        return itemService.queryAllItemInfo(page, rows);
    }
}
