package Kq;

import Co.ProductFullDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"LKq/d;", "", "LCo/h;", "product", "", "quantityRequested", "<init>", "(LCo/h;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "I", "domain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kq.d, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class TLProduct {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantityRequested;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TLProduct)) {
            return false;
        }
        TLProduct tLProduct = (TLProduct) other;
        return Intrinsics.e(this.product, tLProduct.product) && this.quantityRequested == tLProduct.quantityRequested;
    }

    public TLProduct(ProductFullDetails product, int i10) {
        Intrinsics.j(product, "product");
        this.product = product;
        this.quantityRequested = i10;
    }

    /* renamed from: a, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: b, reason: from getter */
    public final int getQuantityRequested() {
        return this.quantityRequested;
    }

    public int hashCode() {
        return (this.product.hashCode() * 31) + Integer.hashCode(this.quantityRequested);
    }

    public String toString() {
        return "TLProduct(product=" + this.product + ", quantityRequested=" + this.quantityRequested + ')';
    }
}
