package com.meijer.mobile.subscription.ux.subscribedItems;

import ak.AbstractC5607a;
import cr.SubscriptionDetails;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kr.C15307d;
import vk.C17590a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u0017\u0010\bR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006%"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/t;", "", "Lcr/j;", "subscriptionDetails", "<init>", "(Lcr/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcr/j;", "getSubscriptionDetails", "()Lcr/j;", "b", "I", "deliveryWeek", "c", "Ljava/lang/String;", "e", "productName", "d", "productImageUrl", "formattedNextOrderDate", "f", "priceWithDollar", "Lak/a;", "g", "Lak/a;", "()Lak/a;", "quantityAndPrice", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.t, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionOrderDetailsDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final SubscriptionDetails subscriptionDetails;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int deliveryWeek;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String productName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String productImageUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String formattedNextOrderDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String priceWithDollar;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a quantityAndPrice;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SubscriptionOrderDetailsDecorator) && Intrinsics.e(this.subscriptionDetails, ((SubscriptionOrderDetailsDecorator) other).subscriptionDetails);
    }

    public int hashCode() {
        return this.subscriptionDetails.hashCode();
    }

    public String toString() {
        return "SubscriptionOrderDetailsDecorator(subscriptionDetails=" + this.subscriptionDetails + ')';
    }

    public SubscriptionOrderDetailsDecorator(SubscriptionDetails subscriptionDetails) {
        Intrinsics.j(subscriptionDetails, "subscriptionDetails");
        this.subscriptionDetails = subscriptionDetails;
        this.deliveryWeek = subscriptionDetails.getDeliveryFrequency();
        this.productName = subscriptionDetails.getProductInfo().getProductName();
        this.productImageUrl = subscriptionDetails.getProductInfo().getProductImageThumbnail();
        String str = subscriptionDetails.getNextOrderDate().format(C17590a.f164803a.p());
        Intrinsics.i(str, "format(...)");
        this.formattedNextOrderDate = str;
        String productPrice = subscriptionDetails.getProductInfo().getProductPrice();
        String str2 = null;
        if (productPrice != null) {
            if (!StringsKt.W(productPrice, "$", false, 2, null)) {
                productPrice = '$' + productPrice;
            }
            str2 = productPrice;
        }
        this.priceWithDollar = String.valueOf(str2);
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = C15307d.f147879j0;
        String strValueOf = String.valueOf(subscriptionDetails.getProductInfo().getProductQty());
        String strValueOf2 = String.valueOf(subscriptionDetails.getProductInfo().getProductPrice());
        String lowerCase = String.valueOf(subscriptionDetails.getProductInfo().getProductUnit()).toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        this.quantityAndPrice = companion.d(i10, strValueOf, strValueOf2, lowerCase);
    }

    /* renamed from: a, reason: from getter */
    public final int getDeliveryWeek() {
        return this.deliveryWeek;
    }

    /* renamed from: b, reason: from getter */
    public final String getFormattedNextOrderDate() {
        return this.formattedNextOrderDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getPriceWithDollar() {
        return this.priceWithDollar;
    }

    /* renamed from: d, reason: from getter */
    public final String getProductImageUrl() {
        return this.productImageUrl;
    }

    /* renamed from: e, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC5607a getQuantityAndPrice() {
        return this.quantityAndPrice;
    }
}
