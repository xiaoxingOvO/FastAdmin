package com.xx.fastadmin.domain.query;


import org.apache.commons.lang3.StringUtils;

/**
 * @author xx
 * @date 2023/3/24
 */
public class PageQuery {

    /** 当前记录起始索引 */
    private Integer pageNum = 1;

    /** 每页显示记录数 */
    private Integer pageSize = 10;

    /** 排序列 */
    private String orderByColumn;

    /** 排序的方向desc或者asc */
    private String isAsc = "asc";

    public PageQuery(Integer pageNum, Integer pageSize, String orderByColumn, String isAsc) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderByColumn = orderByColumn;
        this.isAsc = isAsc;
    }


    public String getOrderBy()
    {
        if (StringUtils.isEmpty(orderByColumn))
        {
            return "";
        }
        return orderByColumn + " " + isAsc;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public String getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(String isAsc) {
        this.isAsc = isAsc;
    }
}
