package com.bitcamp.web.services;

import java.util.List;

import com.bitcamp.web.common.utils.PageProxy;
import com.bitcamp.web.domains.CustomerDTO;

/**
 * CustomerServiceI
 */
public interface CustomerService {

    public void addCustomer(CustomerDTO customer);
    public List<CustomerDTO> findCustomers(PageProxy pxy);
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option);
    public CustomerDTO findCustomerByCustomerId(String customerId);
    public int updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    public int countAll();
    public CustomerDTO login(CustomerDTO customer);
}