package net.roundspring.sell.repository;

import net.roundspring.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12345671110");
        orderDetail.setOrderId("1111111");
        orderDetail.setProductId("123456");
        orderDetail.setProductIcon("http://xxxx.jpg");
        orderDetail.setProductName("burger");
        orderDetail.setProductPrice(new BigDecimal(1.2));
        orderDetail.setProductQuantity(3);

        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrderId("1111111");
        Assert.assertNotEquals(0, orderDetailList.size());
    }
}