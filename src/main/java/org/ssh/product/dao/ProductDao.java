package org.ssh.product.dao;

import org.ssh.product.entity.Product;

/**
 * 商品操作-持久层接口
 *
 */
public interface ProductDao {

	void saveProduct(Product product);

}