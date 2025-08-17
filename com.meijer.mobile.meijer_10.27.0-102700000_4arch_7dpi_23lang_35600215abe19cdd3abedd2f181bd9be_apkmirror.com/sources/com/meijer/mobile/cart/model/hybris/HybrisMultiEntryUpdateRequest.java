package com.meijer.mobile.cart.model.hybris;

import com.meijer.mobile.product.model.hybris.api.models.HybrisProductIdentity;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HybrisMultiEntryUpdateRequest;", "", "", "quantityValue", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProductIdentity;", "product", "<init>", "(DLcom/meijer/mobile/product/model/hybris/api/models/HybrisProductIdentity;)V", "copy", "(DLcom/meijer/mobile/product/model/hybris/api/models/HybrisProductIdentity;)Lcom/meijer/mobile/cart/model/hybris/HybrisMultiEntryUpdateRequest;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProductIdentity;", "()Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProductIdentity;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisMultiEntryUpdateRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisProductIdentity product;

    public final HybrisMultiEntryUpdateRequest copy(@g(name = "quantityValue") double quantityValue, @g(name = "product") HybrisProductIdentity product) {
        Intrinsics.j(product, "product");
        return new HybrisMultiEntryUpdateRequest(quantityValue, product);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisMultiEntryUpdateRequest)) {
            return false;
        }
        HybrisMultiEntryUpdateRequest hybrisMultiEntryUpdateRequest = (HybrisMultiEntryUpdateRequest) other;
        return Double.compare(this.quantityValue, hybrisMultiEntryUpdateRequest.quantityValue) == 0 && Intrinsics.e(this.product, hybrisMultiEntryUpdateRequest.product);
    }

    public int hashCode() {
        return (Double.hashCode(this.quantityValue) * 31) + this.product.hashCode();
    }

    public String toString() {
        return "HybrisMultiEntryUpdateRequest(quantityValue=" + this.quantityValue + ", product=" + this.product + ')';
    }

    public HybrisMultiEntryUpdateRequest(@g(name = "quantityValue") double d10, @g(name = "product") HybrisProductIdentity product) {
        Intrinsics.j(product, "product");
        this.quantityValue = d10;
        this.product = product;
    }

    /* renamed from: a, reason: from getter */
    public final HybrisProductIdentity getProduct() {
        return this.product;
    }

    /* renamed from: b, reason: from getter */
    public final double getQuantityValue() {
        return this.quantityValue;
    }
}
