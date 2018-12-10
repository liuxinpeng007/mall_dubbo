package cn.mall.service.impl;

import cn.mall.common.pojo.EasyUITreeNode;
import cn.mall.mapper.TbItemCatMapper;
import cn.mall.pojo.TbItemCat;
import cn.mall.pojo.TbItemCatExample;
import cn.mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类Service
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Autowired
    private TbItemCatMapper itemCatMapper;

    @Override
    public List<EasyUITreeNode> getItemCatByParentId(Long parentId) {
        // 1.根据父节点ID查询出商品分类信息
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        List<TbItemCat> tbItemCats = itemCatMapper.selectByExample(example);
        // 2.将分类信息封装成页面所需的结构
        List<EasyUITreeNode> list = new ArrayList<>();
        for (TbItemCat itemCat : tbItemCats) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(itemCat.getId());
            node.setText(itemCat.getName());
            node.setState(itemCat.getIsParent()?"closed":"open");
            list.add(node);
        }
        // 3.返回
        return list;
    }
}
