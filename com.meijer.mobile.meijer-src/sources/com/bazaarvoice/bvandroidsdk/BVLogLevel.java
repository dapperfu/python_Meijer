package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
public enum BVLogLevel {
    ERROR(1),
    WARNING(2),
    INFO(3),
    VERBOSE(4);

    private int value;

    public boolean greaterOrEqualPriorityThan(BVLogLevel bVLogLevel) {
        return this.value >= bVLogLevel.value;
    }

    BVLogLevel(int i10) {
        this.value = i10;
    }
}
