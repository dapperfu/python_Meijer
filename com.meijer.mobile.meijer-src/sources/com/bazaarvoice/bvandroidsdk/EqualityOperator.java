package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum EqualityOperator {
    GT("gt"),
    GTE("gte"),
    LT("lt"),
    LTE("lte"),
    EQ("eq"),
    NEQ("neq");

    private String key;

    String getKey() {
        return this.key;
    }

    EqualityOperator(String str) {
        this.key = str;
    }
}
