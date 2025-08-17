package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
abstract class ConversationsRequest {
    static final String API_VERSION = "5.4";
    static final String kAPI_VERSION = "apiversion";
    static final String kPASS_KEY = "passkey";

    abstract BazaarException getError();

    ConversationsRequest() {
    }
}
