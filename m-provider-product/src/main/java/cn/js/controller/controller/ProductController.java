package cn.js.controller.controller;

import cn.js.controller.service.IProductService;
import cn.js.vo.Product;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @version 1.0.0
 * @ClassName ProductController
 * @Description TODO
 * @createTime 2019年08月19日 14:52:00
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private IProductService iProductService;
    @Resource
    private DiscoveryClient client;

    @RequestMapping("/get/{id}")
    public Object get(@PathVariable("id") int id){
        return this.iProductService.get(id);
    }

    @RequestMapping("/add")
    public Object create(){
        Product product=new Product();
        product.setProductId(103L);
        product.setProductName("PRODUCTNAME");
        product.setProductDesc("PRODUCTDESC");
        return this.iProductService.add(product);
    }

    @RequestMapping("/list")
    public Object get(){
        return this.iProductService.list();
    }

    @RequestMapping("/discover")
    public Object discover(){
        return this.client;
    }
}
