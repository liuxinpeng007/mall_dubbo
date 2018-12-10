package cn.mall.controller;

import cn.mall.common.pojo.EasyUITreeNode;
import cn.mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemCatController {

    @Autowired
    private ItemCatService itemCatService;

    @RequestMapping("/item/cat/list")
    public List<EasyUITreeNode> getItemCatList(
            @RequestParam(name = "id", defaultValue = "0") long parentId) {
        List<EasyUITreeNode> itemCats = itemCatService.getItemCatByParentId(parentId);
        return itemCats;

    }

}
