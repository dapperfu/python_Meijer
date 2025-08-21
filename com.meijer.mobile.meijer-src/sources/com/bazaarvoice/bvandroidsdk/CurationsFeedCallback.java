package com.bazaarvoice.bvandroidsdk;

import java.util.List;

/* loaded from: classes4.dex */
public interface CurationsFeedCallback {
    void onFailure(Throwable th2);

    void onSuccess(List<CurationsFeedItem> list);
}
