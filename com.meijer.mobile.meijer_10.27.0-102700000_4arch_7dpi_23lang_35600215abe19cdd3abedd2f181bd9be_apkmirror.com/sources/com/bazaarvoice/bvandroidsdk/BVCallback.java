package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
interface BVCallback<ResponseType> {
    void onFailure(BazaarException bazaarException);

    void onSuccess(ResponseType responsetype);
}
