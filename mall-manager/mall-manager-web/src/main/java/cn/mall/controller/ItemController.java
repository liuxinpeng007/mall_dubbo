package cn.mall.controller;

import cn.mall.pojo.TbItem;
import cn.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/{itemID}")
    @ResponseBody
    public TbItem queryItemInfo(@PathVariable long itemID) {
        TbItem item = itemService.queryItemByID(itemID);
        return item;
    }
}
