package com.example.s_shop.ultil;

public interface CartInterface {
    void setTotalPrice();
    void onclickMinus(Object object, int position);
    void onclickPlus(Object object, int position);
}
