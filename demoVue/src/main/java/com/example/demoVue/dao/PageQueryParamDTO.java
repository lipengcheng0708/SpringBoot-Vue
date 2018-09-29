package com.example.demoVue.dao;

/**
 * @Author: Gosin
 * @Date: 2018-09-28 8:32
 * @Action: 分页查询参数DTO
 */
public class PageQueryParamDTO {

    private int page;//页码
    private int size;//每页数量
    private Object query;//查询条件

    public PageQueryParamDTO() {
    }

    public PageQueryParamDTO(int page, int size, Object query) {
        this.page = page;
        this.size = size;
        this.query = query;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object getQuery() {
        return query;
    }

    public void setQuery(Object query) {
        this.query = query;
    }
}