package cn.mall.common.pojo;

import java.io.Serializable;

public class EasyUITreeNode implements Serializable {
    /**
     * ID
     */
    private long id;
    /**
     * 树节点内容
     */
    private String text;
    /**
     * 树节点状态
     */
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
