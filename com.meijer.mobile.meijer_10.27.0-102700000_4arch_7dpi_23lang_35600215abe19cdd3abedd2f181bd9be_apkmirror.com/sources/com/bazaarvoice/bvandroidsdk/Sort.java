package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class Sort {
    private final UGCOption option;
    private final List<String> sortList;
    private final SortOrder sortOrder;

    Sort(UGCOption uGCOption, SortOrder sortOrder) {
        this.option = uGCOption;
        this.sortOrder = sortOrder;
        this.sortList = new ArrayList();
    }

    public String toString() {
        return this.sortOrder.getKey().equals(SortOrder.CUSTOM_SORT_ORDER.getKey()) ? String.format("%s:%s", this.option.getKey(), StringUtils.componentsSeparatedByWithEscapes(this.sortList, ",")) : String.format("%s:%s", this.option.getKey(), this.sortOrder.getKey());
    }

    Sort(UGCOption uGCOption, List<String> list) {
        this.option = uGCOption;
        this.sortList = list;
        this.sortOrder = SortOrder.CUSTOM_SORT_ORDER;
    }
}
