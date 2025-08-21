package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.SortableProductRequest;

/* loaded from: classes4.dex */
public class BulkProductRequest extends SortableProductRequest {

    public static final class Builder extends SortableProductRequest.Builder<Builder, BulkProductRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bazaarvoice.bvandroidsdk.SortableProductRequest.Builder
        public BulkProductRequest build() {
            return new BulkProductRequest(this);
        }
    }

    private BulkProductRequest(Builder builder) {
        super(builder);
    }
}
