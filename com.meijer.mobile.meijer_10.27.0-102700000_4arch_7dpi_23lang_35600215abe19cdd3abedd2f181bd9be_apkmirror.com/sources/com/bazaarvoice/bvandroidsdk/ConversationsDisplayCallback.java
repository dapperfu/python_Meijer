package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsResponse;

/* loaded from: classes4.dex */
public interface ConversationsDisplayCallback<T extends ConversationsResponse> {
    void onFailure(ConversationsException conversationsException);

    void onSuccess(T t10);
}
