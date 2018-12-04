package com.ak.user.treeview_recyclerview.data;

public final class Data
{

    private String valueText = ""; //название значения
    private int valueId = 0; //идентификатор значения

    private boolean itemParent = false; //родительский или нет элемент
    private int parentId = -1; //id элемента, который является родительским
    private boolean childVisibility = false; //видимость дочерних элементов


    //проверить родительский элемент или нет
    public boolean isItemParent() {
        return itemParent;
    }

    //установить значение родительского элемента
    public void setItemParent(boolean newItemParent) {
        itemParent = newItemParent;
    }

    //проверить видимость дочерних элементов
    public boolean isChildVisibility() {
        return childVisibility;
    }

    //установить видимость для дочерних элементов
    public void setChildVisibility(boolean newChildVisibility) {
        childVisibility = newChildVisibility;
    }

    //получить номер родительского элемента
    public int getParentId() {
        return parentId;
    }

    //установить номер родительского элемента
    public void setParentId(int newParentId) {
        parentId = newParentId;
    }

    //получить название значения
    public String getValueText() {
        return valueText;
    }

    //установить название значения
    public void setValueText(String newValueText) {
        valueText = newValueText;
    }

    //получить идентификатор значения
    public int getValueId() {
        return valueId;
    }

    //установить идентификатор значения
    public void setValueId(int newValueId) {
        valueId = newValueId;
    }

}
