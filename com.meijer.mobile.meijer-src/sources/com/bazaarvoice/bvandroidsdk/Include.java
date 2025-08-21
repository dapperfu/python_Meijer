package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
class Include {
    private final int limit;
    private final IncludeType type;

    int getLimit() {
        return this.limit;
    }

    String getLimitParamKey() {
        return String.format("Limit_%s", this.type.toString());
    }

    public String toString() {
        return this.type.toString();
    }

    Include(IncludeType includeType, int i10) {
        this.type = includeType;
        this.limit = i10;
    }
}
