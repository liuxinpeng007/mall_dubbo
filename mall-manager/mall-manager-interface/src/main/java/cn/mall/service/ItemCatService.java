package cn.mall.service;

import cn.mall.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 * 商品分类Service接口
 */
public interface ItemCatService {

    /**
     * 根据父节点查询商品分类
     * @param parentId 分界点
     * @return
     */
    List<EasyUITreeNode> getItemCatByParentId(Long parentId);
}
