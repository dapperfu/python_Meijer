package Xo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y6.AbstractC18169C;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LXo/c;", "", "", "by", "Ly6/C;", "order", "<init>", "(Ljava/lang/String;Ly6/C;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ly6/C;", "()Ly6/C;", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xo.c, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductSortInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String by;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18169C<String> order;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSortInput)) {
            return false;
        }
        ProductSortInput productSortInput = (ProductSortInput) other;
        return Intrinsics.e(this.by, productSortInput.by) && Intrinsics.e(this.order, productSortInput.order);
    }

    public ProductSortInput(String by, AbstractC18169C<String> order) {
        Intrinsics.j(by, "by");
        Intrinsics.j(order, "order");
        this.by = by;
        this.order = order;
    }

    /* renamed from: a, reason: from getter */
    public final String getBy() {
        return this.by;
    }

    public final AbstractC18169C<String> b() {
        return this.order;
    }

    public int hashCode() {
        return (this.by.hashCode() * 31) + this.order.hashCode();
    }

    public String toString() {
        return "ProductSortInput(by=" + this.by + ", order=" + this.order + ')';
    }
}
