package com.springcloud.userintef.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Wares_pic")
public class WaresPicEntity {

    @Id
    private int picId;
    private Integer waresId;
    private String picAddress;

    public int getPicId() {
        return picId;
    }

    public void setPicId(int picId) {
        this.picId = picId;
    }

    public Integer getWaresId() {
        return waresId;
    }

    public void setWaresId(Integer waresId) {
        this.waresId = waresId;
    }

    public String getPicAddress() {
        return picAddress;
    }

    public void setPicAddress(String picAddress) {
        this.picAddress = picAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaresPicEntity that = (WaresPicEntity) o;
        return picId == that.picId &&
                Objects.equals(waresId, that.waresId) &&
                Objects.equals(picAddress, that.picAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(picId, waresId, picAddress);
    }
}
