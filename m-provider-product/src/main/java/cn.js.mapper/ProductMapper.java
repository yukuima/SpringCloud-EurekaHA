package cn.js.mapper;

import cn.js.vo.Product;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0.0
 * @InterfaceName ProductMapper
 * @Description TODO
 * @createTime 2019年08月19日 12:10:00
 */
public interface ProductMapper {
    boolean create(Product product);
    public Product findById(int id);
    public List<Product> findAll();
}
