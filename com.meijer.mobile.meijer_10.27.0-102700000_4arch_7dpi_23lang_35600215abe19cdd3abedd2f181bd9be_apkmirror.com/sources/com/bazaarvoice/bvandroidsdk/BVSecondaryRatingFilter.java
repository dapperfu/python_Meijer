package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public final class BVSecondaryRatingFilter {
    private final EqualityOperator equalityOperator;
    private final String type;
    private final String value;

    public EqualityOperator getEqualityOperator() {
        return this.equalityOperator;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public BVSecondaryRatingFilter(String str, EqualityOperator equalityOperator, String str2) {
        this.type = str;
        this.equalityOperator = equalityOperator;
        this.value = str2;
    }
}
