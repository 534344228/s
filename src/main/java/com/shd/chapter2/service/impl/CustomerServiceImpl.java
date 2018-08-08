package com.shd.chapter2.service.impl;

import com.shd.chapter2.model.Customer;
import com.shd.chapter2.service.CustomerService;
import com.shd.utils.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by shanhaodong on 2018/8/8
 */
public class CustomerServiceImpl implements CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);


    private static String DRIVE;
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;

    static {
        Properties props = PropsUtil.loadProps("db.properties");
        DRIVE = PropsUtil.getString(props, "jdbc.driver");
        URL = PropsUtil.getString(props, "jdbc.url");
        USERNAME = PropsUtil.getString(props, "jdbc.username");
        PASSWORD = PropsUtil.getString(props, "jdbc.password");
        try {
            Class.forName(DRIVE);
        } catch (ClassNotFoundException e) {
            LOGGER.error("can not load jdbc drive", e);
        }


    }

    @Override
    public List<Customer> getList(String keyword) {
        String sql = "SELECT * FROM customer";
        List<Customer> list = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setId(resultSet.getLong(Customer.ID));
                customer.setName(resultSet.getString(Customer.NAME));
                list.add(customer);
            }
        } catch (SQLException e) {
            LOGGER.error("execute sql failure", e);
        }
        return list;
    }

    @Override
    public Customer getById(Long id) {
        return null;
    }

    @Override
    public Boolean createCustomer(Customer customer) {
        return null;
    }

    @Override
    public Boolean updateCustomer(Customer customer) {
        return null;
    }

    @Override
    public Boolean deleteCustomer(Long id) {
        return null;
    }

    public static void main(String[] args) {
        CustomerService service = new CustomerServiceImpl();
        List<Customer> list = service.getList("1");
        LOGGER.info(list.get(0).toString());
    }
}
