package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.ConversationsResponse;

/* loaded from: classes4.dex */
public interface ConversationsSubmissionCallback<T extends ConversationsResponse> {
    void onFailure(ConversationsSubmissionException conversationsSubmissionException);

    void onSuccess(T t10);
}
