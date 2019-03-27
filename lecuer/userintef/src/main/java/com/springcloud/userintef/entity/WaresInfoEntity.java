package com.springcloud.userintef.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Wares_info")
public class WaresInfoEntity {

    @Id
    private int waresId;
    private String waresName;
    private Integer waresType;
    private Integer provider;
    private Integer setnum;
    private Integer stock;
    private Integer buyPrice;
    private Integer sellPrice;
    private Integer discount;

    public int getWaresId() {
        return waresId;
    }

    public void setWaresId(int waresId) {
        this.waresId = waresId;
    }

    public String getWaresName() {
        return waresName;
    }

    public void setWaresName(String waresName) {
        this.waresName = waresName;
    }

    public Integer getWaresType() {
        return waresType;
    }

    public void setWaresType(Integer waresType) {
        this.waresType = waresType;
    }

    public Integer getProvider() {
        return provider;
    }

    public void setProvider(Integer provider) {
        this.provider = provider;
    }

    public Integer getSetnum() {
        return setnum;
    }

    public void setSetnum(Integer setnum) {
        this.setnum = setnum;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaresInfoEntity that = (WaresInfoEntity) o;
        return waresId == that.waresId &&
                Objects.equals(waresName, that.waresName) &&
                Objects.equals(waresType, that.waresType) &&
                Objects.equals(provider, that.provider) &&
                Objects.equals(setnum, that.setnum) &&
                Objects.equals(stock, that.stock) &&
                Objects.equals(buyPrice, that.buyPrice) &&
                Objects.equals(sellPrice, that.sellPrice) &&
                Objects.equals(discount, that.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waresId, waresName, waresType, provider, setnum, stock, buyPrice, sellPrice, discount);
    }
}
