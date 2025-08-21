package com.bazaarvoice.bvandroidsdk;

import com.bazaarvoice.bvandroidsdk.Filter;
import com.bazaarvoice.bvandroidsdk.SortableProductRequest;

/* loaded from: classes4.dex */
public class ProductDisplayPageRequest extends SortableProductRequest {

    public static final class Builder extends SortableProductRequest.Builder<Builder, ProductDisplayPageRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bazaarvoice.bvandroidsdk.SortableProductRequest.Builder
        public ProductDisplayPageRequest build() {
            return new ProductDisplayPageRequest(this);
        }

        public Builder(String str) {
            addFilter(new Filter(Filter.Type.Id, EqualityOperator.EQ, str));
        }
    }

    private ProductDisplayPageRequest(Builder builder) {
        super(builder);
    }
}
