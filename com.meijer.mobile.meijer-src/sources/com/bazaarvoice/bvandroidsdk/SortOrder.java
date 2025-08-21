package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum SortOrder {
    ASC("asc"),
    DESC("desc"),
    CUSTOM_SORT_ORDER("custom_sort_order");

    private final String key;

    String getKey() {
        return this.key;
    }

    SortOrder(String str) {
        this.key = str;
    }
}
