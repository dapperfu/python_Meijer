package Hp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001b"}, d2 = {"LHp/a;", "", "", "upc", "name", "", "price", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;DI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "D", "()D", "I", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hp.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class BVOrderItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double price;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantity;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BVOrderItem)) {
            return false;
        }
        BVOrderItem bVOrderItem = (BVOrderItem) other;
        return Intrinsics.e(this.upc, bVOrderItem.upc) && Intrinsics.e(this.name, bVOrderItem.name) && Double.compare(this.price, bVOrderItem.price) == 0 && this.quantity == bVOrderItem.quantity;
    }

    public BVOrderItem(String upc, String name, double d10, int i10) {
        Intrinsics.j(upc, "upc");
        Intrinsics.j(name, "name");
        this.upc = upc;
        this.name = name;
        this.price = d10;
        this.quantity = i10;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: c, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    /* renamed from: d, reason: from getter */
    public final String getUpc() {
        return this.upc;
    }

    public int hashCode() {
        return (((((this.upc.hashCode() * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Integer.hashCode(this.quantity);
    }

    public String toString() {
        return "BVOrderItem(upc=" + this.upc + ", name=" + this.name + ", price=" + this.price + ", quantity=" + this.quantity + ')';
    }
}
