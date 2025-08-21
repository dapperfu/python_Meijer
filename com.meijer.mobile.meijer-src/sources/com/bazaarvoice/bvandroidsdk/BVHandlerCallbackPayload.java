package com.bazaarvoice.bvandroidsdk;

/* loaded from: classes4.dex */
class BVHandlerCallbackPayload {
    private final BazaarException error;
    private final BVCallback externalCB;
    private final BVHandlerCallback internalCB;
    private final Object payload;

    public BazaarException getError() {
        return this.error;
    }

    BVCallback getExternalCB() {
        return this.externalCB;
    }

    BVHandlerCallback getInternalCB() {
        return this.internalCB;
    }

    Object getPayload() {
        return this.payload;
    }

    public BVHandlerCallbackPayload(BVHandlerCallback bVHandlerCallback, BVCallback bVCallback, Object obj, BazaarException bazaarException) {
        this.payload = obj;
        this.externalCB = bVCallback;
        this.internalCB = bVHandlerCallback;
        this.error = bazaarException;
    }
}
