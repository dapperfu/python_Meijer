package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
class RelevancySort {
    private final UGCOption option;
    private final RelevancySortOrder sortOrder;

    public String toString() {
        return String.format("%s:%s", this.option.getKey(), this.sortOrder.getKey());
    }

    RelevancySort(UGCOption uGCOption, RelevancySortOrder relevancySortOrder) {
        this.option = uGCOption;
        this.sortOrder = relevancySortOrder;
    }
}
