package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum PageType {
    HOME("home"),
    CATEGORY("category"),
    PRODUCT("product"),
    CART("cart"),
    THANKYOU("thankyou"),
    SEARCH("search");

    private String value;

    PageType(String str) {
        this.value = str;
    }
}
