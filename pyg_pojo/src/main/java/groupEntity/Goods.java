package groupEntity;

import cn.pyg.pojo.TbGoods;
import cn.pyg.pojo.TbGoodsDesc;
import cn.pyg.pojo.TbItem;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Goods implements Serializable {

    private TbGoods goods;//商品
    private TbGoodsDesc goodsDesc;//商品的描述信息
    private List<TbItem> itemList;

    private Map<String,String> itemCatMap;

    public Map<String, String> getItemCatMap() {
        return itemCatMap;
    }

    public void setItemCatMap(Map<String, String> itemCatMap) {
        this.itemCatMap = itemCatMap;
    }

    public TbGoods getGoods() {
        return goods;
    }

    public void setGoods(TbGoods goods) {
        this.goods = goods;
    }

    public TbGoodsDesc getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(TbGoodsDesc goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public List<TbItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<TbItem> itemList) {
        this.itemList = itemList;
    }
}
