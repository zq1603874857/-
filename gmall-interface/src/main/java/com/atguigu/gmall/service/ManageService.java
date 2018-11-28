package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {
    //查询一级分类
    public List<BaseCatalog1> getCatalog1();
    //根据一级分类id查询二级分类
    public List<BaseCatalog2> getCatalog2(String catalog1Id);
    //根据二级分类id查询三级分类
    public List<BaseCatalog3> getCatalog3(String catalog2Id);
    ///根据三级分类id查询平台属性列表
    public List<BaseAttrInfo> getAttrList(String catalog3Id);
    //大保存平台属性,平台属性值
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    //根据平台属性Id查询平台属性对象
    BaseAttrInfo getAttrInfo(String attrId);
    ///根据三级分类id查询商品列表
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    // 查询基本销售属性表
    List<BaseSaleAttr> getBaseSaleAttrList();
   //保存销售属性到数据库中
    public void saveSpuInfo(SpuInfo spuInfo);

    //根据spuId获取spuImage中的所有图片列表
    List<SpuImage> getSpuImageList(String spuId);

    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);

    void saveSkuInfo(SkuInfo skuInfo);
}
