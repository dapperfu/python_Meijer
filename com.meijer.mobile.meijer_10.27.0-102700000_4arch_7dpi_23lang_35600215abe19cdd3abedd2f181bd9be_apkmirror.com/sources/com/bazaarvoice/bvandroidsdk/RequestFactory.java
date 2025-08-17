package com.bazaarvoice.bvandroidsdk;

import okhttp3.Request;

/* loaded from: classes4.dex */
interface RequestFactory {
    <RequestType extends ConversationsRequest> Request create(RequestType requesttype);
}
