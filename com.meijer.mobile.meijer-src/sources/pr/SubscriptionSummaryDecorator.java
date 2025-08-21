package pr;

import Co.ProductFullDetails;
import cr.SubscriptionDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!¨\u0006\""}, d2 = {"Lpr/c;", "", "LCo/h;", "product", "Lpr/a;", "action", "Lcr/j;", "subscriptionDetails", "Lpr/b;", "source", "<init>", "(LCo/h;Lpr/a;Lcr/j;Lpr/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "b", "()LCo/h;", "Lpr/a;", "()Lpr/a;", "c", "Lcr/j;", "d", "()Lcr/j;", "Lpr/b;", "()Lpr/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pr.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class SubscriptionSummaryDecorator {

    /* renamed from: e, reason: collision with root package name */
    public static final int f157072e = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ProductFullDetails product;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC16490a action;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetails subscriptionDetails;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC16491b source;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionSummaryDecorator)) {
            return false;
        }
        SubscriptionSummaryDecorator subscriptionSummaryDecorator = (SubscriptionSummaryDecorator) other;
        return Intrinsics.e(this.product, subscriptionSummaryDecorator.product) && Intrinsics.e(this.action, subscriptionSummaryDecorator.action) && Intrinsics.e(this.subscriptionDetails, subscriptionSummaryDecorator.subscriptionDetails) && this.source == subscriptionSummaryDecorator.source;
    }

    public SubscriptionSummaryDecorator(ProductFullDetails product, AbstractC16490a action, SubscriptionDetails subscriptionDetails, EnumC16491b source) {
        Intrinsics.j(product, "product");
        Intrinsics.j(action, "action");
        Intrinsics.j(source, "source");
        this.product = product;
        this.action = action;
        this.subscriptionDetails = subscriptionDetails;
        this.source = source;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC16490a getAction() {
        return this.action;
    }

    /* renamed from: b, reason: from getter */
    public final ProductFullDetails getProduct() {
        return this.product;
    }

    /* renamed from: c, reason: from getter */
    public final EnumC16491b getSource() {
        return this.source;
    }

    /* renamed from: d, reason: from getter */
    public final SubscriptionDetails getSubscriptionDetails() {
        return this.subscriptionDetails;
    }

    public int hashCode() {
        int iHashCode = ((this.product.hashCode() * 31) + this.action.hashCode()) * 31;
        SubscriptionDetails subscriptionDetails = this.subscriptionDetails;
        return ((iHashCode + (subscriptionDetails == null ? 0 : subscriptionDetails.hashCode())) * 31) + this.source.hashCode();
    }

    public String toString() {
        return "SubscriptionSummaryDecorator(product=" + this.product + ", action=" + this.action + ", subscriptionDetails=" + this.subscriptionDetails + ", source=" + this.source + ')';
    }
}
