package cn.js.controller.service;

import cn.js.vo.Product;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @InterfaceName IProductService
 * @Description TODO
 * @createTime 2019年08月19日 13:45:00
 */
public interface IProductService {
    Product get(int id);
    boolean add(Product product);
    List<Product> list();
}
