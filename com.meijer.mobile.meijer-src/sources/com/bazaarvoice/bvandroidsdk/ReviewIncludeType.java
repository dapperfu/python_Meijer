package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum ReviewIncludeType implements IncludeType {
    PRODUCTS("products"),
    COMMENTS("comments"),
    AUTHORS("authors"),
    CATEGORIES("categories");

    private String value;

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    ReviewIncludeType(String str) {
        this.value = str;
    }
}
