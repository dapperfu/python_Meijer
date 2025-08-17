package hq;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lhq/d;", "", "Lak/a;", "itemTotal", "estimatedTaxes", "subtotal", "estimatedTotal", "totalSavings", "<init>", "(Lak/a;Lak/a;Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "d", "e", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanCheckoutSummaryDecorator {

    /* renamed from: f, reason: collision with root package name */
    public static final int f136180f = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a itemTotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a estimatedTaxes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a subtotal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a estimatedTotal;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a totalSavings;

    public ShopAndScanCheckoutSummaryDecorator() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanCheckoutSummaryDecorator)) {
            return false;
        }
        ShopAndScanCheckoutSummaryDecorator shopAndScanCheckoutSummaryDecorator = (ShopAndScanCheckoutSummaryDecorator) other;
        return Intrinsics.e(this.itemTotal, shopAndScanCheckoutSummaryDecorator.itemTotal) && Intrinsics.e(this.estimatedTaxes, shopAndScanCheckoutSummaryDecorator.estimatedTaxes) && Intrinsics.e(this.subtotal, shopAndScanCheckoutSummaryDecorator.subtotal) && Intrinsics.e(this.estimatedTotal, shopAndScanCheckoutSummaryDecorator.estimatedTotal) && Intrinsics.e(this.totalSavings, shopAndScanCheckoutSummaryDecorator.totalSavings);
    }

    public ShopAndScanCheckoutSummaryDecorator(AbstractC5607a itemTotal, AbstractC5607a estimatedTaxes, AbstractC5607a subtotal, AbstractC5607a estimatedTotal, AbstractC5607a totalSavings) {
        Intrinsics.j(itemTotal, "itemTotal");
        Intrinsics.j(estimatedTaxes, "estimatedTaxes");
        Intrinsics.j(subtotal, "subtotal");
        Intrinsics.j(estimatedTotal, "estimatedTotal");
        Intrinsics.j(totalSavings, "totalSavings");
        this.itemTotal = itemTotal;
        this.estimatedTaxes = estimatedTaxes;
        this.subtotal = subtotal;
        this.estimatedTotal = estimatedTotal;
        this.totalSavings = totalSavings;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getEstimatedTaxes() {
        return this.estimatedTaxes;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getEstimatedTotal() {
        return this.estimatedTotal;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getItemTotal() {
        return this.itemTotal;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getSubtotal() {
        return this.subtotal;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getTotalSavings() {
        return this.totalSavings;
    }

    public int hashCode() {
        return (((((((this.itemTotal.hashCode() * 31) + this.estimatedTaxes.hashCode()) * 31) + this.subtotal.hashCode()) * 31) + this.estimatedTotal.hashCode()) * 31) + this.totalSavings.hashCode();
    }

    public String toString() {
        return "ShopAndScanCheckoutSummaryDecorator(itemTotal=" + this.itemTotal + ", estimatedTaxes=" + this.estimatedTaxes + ", subtotal=" + this.subtotal + ", estimatedTotal=" + this.estimatedTotal + ", totalSavings=" + this.totalSavings + ')';
    }

    public /* synthetic */ ShopAndScanCheckoutSummaryDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, AbstractC5607a abstractC5607a4, AbstractC5607a abstractC5607a5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, (i10 & 2) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a2, (i10 & 4) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a3, (i10 & 8) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a4, (i10 & 16) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a5);
    }
}
