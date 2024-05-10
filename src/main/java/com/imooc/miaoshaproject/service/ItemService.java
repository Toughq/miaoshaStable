package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * Created by hzllb on 2018/11/18.
 */
public interface ItemService {

    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);

    //验证item以及promo model缓存模型是否有效
    ItemModel getItemByIdCache(Integer id);
    //库存扣减
    boolean decreaseStock(Integer itemId,Integer amount)throws BusinessException;
    //库存回补
    //异步更新库存
    boolean asyncDecreaseStock(Integer itemId,Integer amount);
    //商品销量增加
    void increaseSales(Integer itemId,Integer amount)throws BusinessException;

    public boolean increaseStock(Integer itemId, Integer amount) throws BusinessException;

    public String initStockLog(Integer itemId,Integer amount);
}
