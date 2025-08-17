package Uh;

import ak.AbstractC5607a;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\u001a\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b\u0017\u0010\u001f¨\u0006$"}, d2 = {"LUh/g;", "", "", "subscriptionId", "productName", "productImageUrl", "Lak/a;", "quantityAndPrice", "productPrice", "j$/time/LocalDate", "nextOrderDate", "deliveryFrequencyWeeks", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lak/a;Lak/a;Lj$/time/LocalDate;Lak/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSubscriptionId", "b", "d", "c", "Lak/a;", "f", "()Lak/a;", "e", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "g", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Uh.g, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SubscriptionCardDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subscriptionId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productImageUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a quantityAndPrice;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a productPrice;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate nextOrderDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a deliveryFrequencyWeeks;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionCardDecorator)) {
            return false;
        }
        SubscriptionCardDecorator subscriptionCardDecorator = (SubscriptionCardDecorator) other;
        return Intrinsics.e(this.subscriptionId, subscriptionCardDecorator.subscriptionId) && Intrinsics.e(this.productName, subscriptionCardDecorator.productName) && Intrinsics.e(this.productImageUrl, subscriptionCardDecorator.productImageUrl) && Intrinsics.e(this.quantityAndPrice, subscriptionCardDecorator.quantityAndPrice) && Intrinsics.e(this.productPrice, subscriptionCardDecorator.productPrice) && Intrinsics.e(this.nextOrderDate, subscriptionCardDecorator.nextOrderDate) && Intrinsics.e(this.deliveryFrequencyWeeks, subscriptionCardDecorator.deliveryFrequencyWeeks);
    }

    public SubscriptionCardDecorator(String subscriptionId, String productName, String productImageUrl, AbstractC5607a quantityAndPrice, AbstractC5607a abstractC5607a, LocalDate localDate, AbstractC5607a deliveryFrequencyWeeks) {
        Intrinsics.j(subscriptionId, "subscriptionId");
        Intrinsics.j(productName, "productName");
        Intrinsics.j(productImageUrl, "productImageUrl");
        Intrinsics.j(quantityAndPrice, "quantityAndPrice");
        Intrinsics.j(deliveryFrequencyWeeks, "deliveryFrequencyWeeks");
        this.subscriptionId = subscriptionId;
        this.productName = productName;
        this.productImageUrl = productImageUrl;
        this.quantityAndPrice = quantityAndPrice;
        this.productPrice = abstractC5607a;
        this.nextOrderDate = localDate;
        this.deliveryFrequencyWeeks = deliveryFrequencyWeeks;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getDeliveryFrequencyWeeks() {
        return this.deliveryFrequencyWeeks;
    }

    /* renamed from: b, reason: from getter */
    public final LocalDate getNextOrderDate() {
        return this.nextOrderDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC5607a getProductPrice() {
        return this.productPrice;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getQuantityAndPrice() {
        return this.quantityAndPrice;
    }

    public int hashCode() {
        int iHashCode = ((((((this.subscriptionId.hashCode() * 31) + this.productName.hashCode()) * 31) + this.productImageUrl.hashCode()) * 31) + this.quantityAndPrice.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.productPrice;
        int iHashCode2 = (iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode())) * 31;
        LocalDate localDate = this.nextOrderDate;
        return ((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31) + this.deliveryFrequencyWeeks.hashCode();
    }

    public String toString() {
        return "SubscriptionCardDecorator(subscriptionId=" + this.subscriptionId + ", productName=" + this.productName + ", productImageUrl=" + this.productImageUrl + ", quantityAndPrice=" + this.quantityAndPrice + ", productPrice=" + this.productPrice + ", nextOrderDate=" + this.nextOrderDate + ", deliveryFrequencyWeeks=" + this.deliveryFrequencyWeeks + ')';
    }
}
