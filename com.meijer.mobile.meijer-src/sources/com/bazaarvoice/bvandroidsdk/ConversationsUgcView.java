package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.util.AttributeSet;

@Deprecated
/* loaded from: classes4.dex */
abstract class ConversationsUgcView extends BVView {
    private Product product;

    ConversationsUgcView(Context context) {
        super(context);
    }

    abstract String getViewName();

    ConversationsUgcView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public String getProductId() {
        Product product = this.product;
        if (product != null) {
            return product.getId();
        }
        throw new IllegalStateException("Must associate a product with a " + getViewName());
    }

    public void setProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product must not be null");
        }
        this.product = product;
    }

    ConversationsUgcView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    ConversationsUgcView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
