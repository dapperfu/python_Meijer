package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum CommentIncludeType implements IncludeType {
    PRODUCTS("products"),
    REVIEWS("reviews"),
    AUTHORS("authors");

    private String value;

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    CommentIncludeType(String str) {
        this.value = str;
    }
}
