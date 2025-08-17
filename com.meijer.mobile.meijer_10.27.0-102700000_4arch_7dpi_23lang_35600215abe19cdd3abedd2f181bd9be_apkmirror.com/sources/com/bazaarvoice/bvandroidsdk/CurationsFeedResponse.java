package com.bazaarvoice.bvandroidsdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class CurationsFeedResponse {
    protected Integer code;
    protected Map<String, Object> options = new HashMap();
    protected Map<String, CurationsProduct> productData;
    private List<CurationsFeedItem> rawUpdates;
    protected List<CurationsUpdateContainer> updates;

    public List<CurationsFeedItem> getUpdates() {
        if (this.rawUpdates == null) {
            this.rawUpdates = new ArrayList();
            List<CurationsUpdateContainer> list = this.updates;
            if (list != null) {
                for (CurationsUpdateContainer curationsUpdateContainer : list) {
                    if (this.options.containsKey("externalId") && (this.options.get("externalId") instanceof String)) {
                        curationsUpdateContainer.data.externalIdInQuery = (String) this.options.get("externalId");
                    }
                    ArrayList arrayList = new ArrayList();
                    List<String> list2 = curationsUpdateContainer.data.tags;
                    if (list2 != null && this.productData != null) {
                        for (String str : list2) {
                            if (this.productData.containsKey(str)) {
                                arrayList.add(this.productData.get(str));
                            }
                        }
                    }
                    curationsUpdateContainer.data.setProducts(arrayList);
                    this.rawUpdates.add(curationsUpdateContainer.data);
                }
            }
        }
        return this.rawUpdates;
    }
}
