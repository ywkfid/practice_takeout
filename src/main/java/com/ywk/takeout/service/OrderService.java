package com.ywk.takeout.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ywk.takeout.entity.Orders;

public interface OrderService extends IService<Orders> {

    void submit(Orders orders);
}
