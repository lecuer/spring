package com.springcloud.userintef.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "Wares_type")
public class WaresTypeEntity {

    @Id
    private int typeId;
    private String typeName;
    private Integer typeFather;
    private String typeLayer;

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTypeFather() {
        return typeFather;
    }

    public void setTypeFather(Integer typeFather) {
        this.typeFather = typeFather;
    }

    public String getTypeLayer() {
        return typeLayer;
    }

    public void setTypeLayer(String typeLayer) {
        this.typeLayer = typeLayer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaresTypeEntity that = (WaresTypeEntity) o;
        return typeId == that.typeId &&
                Objects.equals(typeName, that.typeName) &&
                Objects.equals(typeFather, that.typeFather) &&
                Objects.equals(typeLayer, that.typeLayer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, typeName, typeFather, typeLayer);
    }
}
