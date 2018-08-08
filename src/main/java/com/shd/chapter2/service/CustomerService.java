package com.shd.chapter2.service;

import com.shd.chapter2.model.Customer;

import java.util.List;

/**
 * 客户数据处理服务
 * Created by shanhaodong on 2018/8/8
 */
public interface CustomerService {
    /**
     * 获取客户列表
     *
     * @param keyword
     * @return
     */
    List<Customer> getList(String keyword);

    /**
     * 获取客户
     *
     * @param id
     * @return
     */
    Customer getById(Long id);

    /**
     * 创建客户
     *
     * @return
     */
    Boolean createCustomer(Customer customer);

    /**
     * 更新客户信息
     *
     * @param customer
     * @return
     */
    Boolean updateCustomer(Customer customer);

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    Boolean deleteCustomer(Long id);
}
