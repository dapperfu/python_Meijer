package Hp;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u000eR\u001b\u0010\u0007\u001a\u00060\u0004j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001f"}, d2 = {"LHp/b;", "", "", "tax", "", "currency", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "shipping", "total", "discount", "<init>", "(DLjava/lang/String;Ljava/lang/String;DDD)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "e", "()D", "b", "Ljava/lang/String;", "c", "d", "f", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hp.b, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class BVOrderTransactionExtras {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double tax;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currency;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double shipping;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double total;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final double discount;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BVOrderTransactionExtras)) {
            return false;
        }
        BVOrderTransactionExtras bVOrderTransactionExtras = (BVOrderTransactionExtras) other;
        return Double.compare(this.tax, bVOrderTransactionExtras.tax) == 0 && Intrinsics.e(this.currency, bVOrderTransactionExtras.currency) && Intrinsics.e(this.orderId, bVOrderTransactionExtras.orderId) && Double.compare(this.shipping, bVOrderTransactionExtras.shipping) == 0 && Double.compare(this.total, bVOrderTransactionExtras.total) == 0 && Double.compare(this.discount, bVOrderTransactionExtras.discount) == 0;
    }

    public BVOrderTransactionExtras(double d10, String currency, String orderId, double d11, double d12, double d13) {
        Intrinsics.j(currency, "currency");
        Intrinsics.j(orderId, "orderId");
        this.tax = d10;
        this.currency = currency;
        this.orderId = orderId;
        this.shipping = d11;
        this.total = d12;
        this.discount = d13;
    }

    /* renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: b, reason: from getter */
    public final double getDiscount() {
        return this.discount;
    }

    /* renamed from: c, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: d, reason: from getter */
    public final double getShipping() {
        return this.shipping;
    }

    /* renamed from: e, reason: from getter */
    public final double getTax() {
        return this.tax;
    }

    /* renamed from: f, reason: from getter */
    public final double getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.tax) * 31) + this.currency.hashCode()) * 31) + this.orderId.hashCode()) * 31) + Double.hashCode(this.shipping)) * 31) + Double.hashCode(this.total)) * 31) + Double.hashCode(this.discount);
    }

    public String toString() {
        return "BVOrderTransactionExtras(tax=" + this.tax + ", currency=" + this.currency + ", orderId=" + this.orderId + ", shipping=" + this.shipping + ", total=" + this.total + ", discount=" + this.discount + ')';
    }
}
