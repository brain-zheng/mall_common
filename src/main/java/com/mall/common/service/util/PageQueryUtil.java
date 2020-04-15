package com.mall.common.service.util;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 分页查询参数
 */
public class PageQueryUtil implements Serializable {

    private static final long serialVersionUID = -159433378395238529L;
    //当前页码
    private int page;
    //每页条数
    private int limit;
    //开始记录数
    private int start;

    public PageQueryUtil(int page, int limit) {
        this.page = page;
        this.limit = limit;
        this.start = (page - 1) * limit;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "PageQueryUtil{" +
                "page=" + page +
                ", limit=" + limit +
                ", start=" + start +
                '}';
    }
}
