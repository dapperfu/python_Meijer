package pp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lpp/a;", "", "", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "", "actualQuantity", "Lnk/b;", "price", "totalPrice", "<init>", "(Ljava/lang/String;DLnk/b;Lnk/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "D", "()D", "Lnk/b;", "()Lnk/b;", "d", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pp.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class CriteoCartEntry {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b price;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b totalPrice;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CriteoCartEntry)) {
            return false;
        }
        CriteoCartEntry criteoCartEntry = (CriteoCartEntry) other;
        return Intrinsics.e(this.productCode, criteoCartEntry.productCode) && Double.compare(this.actualQuantity, criteoCartEntry.actualQuantity) == 0 && Intrinsics.e(this.price, criteoCartEntry.price) && Intrinsics.e(this.totalPrice, criteoCartEntry.totalPrice);
    }

    public CriteoCartEntry(String productCode, double d10, nk.b price, nk.b totalPrice) {
        Intrinsics.j(productCode, "productCode");
        Intrinsics.j(price, "price");
        Intrinsics.j(totalPrice, "totalPrice");
        this.productCode = productCode;
        this.actualQuantity = d10;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    /* renamed from: a, reason: from getter */
    public final double getActualQuantity() {
        return this.actualQuantity;
    }

    /* renamed from: b, reason: from getter */
    public final nk.b getPrice() {
        return this.price;
    }

    /* renamed from: c, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* renamed from: d, reason: from getter */
    public final nk.b getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        return (((((this.productCode.hashCode() * 31) + Double.hashCode(this.actualQuantity)) * 31) + this.price.hashCode()) * 31) + this.totalPrice.hashCode();
    }

    public String toString() {
        return "CriteoCartEntry(productCode=" + this.productCode + ", actualQuantity=" + this.actualQuantity + ", price=" + this.price + ", totalPrice=" + this.totalPrice + ')';
    }
}
