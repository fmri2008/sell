package net.roundspring.sell.service;

import net.roundspring.sell.dataobject.ProductInfo;
import net.roundspring.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo fndOne(String productId);
    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);

    // increase stock
    void increaseStock(List<CartDTO> cartDTOList);

    // decrease stock
    void decreaseStock(List<CartDTO> cartDTOList);
}
