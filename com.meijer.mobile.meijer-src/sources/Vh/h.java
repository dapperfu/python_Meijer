package Vh;

import bk.AbstractC6392a;
import cr.ProductInfo;
import cr.SubscriptionDetails;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kr.C15409c;
import kr.C15410d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcr/j;", "LVh/g;", "a", "(Lcr/j;)LVh/g;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h {
    public static final SubscriptionCardDecorator a(SubscriptionDetails subscriptionDetails) {
        Intrinsics.j(subscriptionDetails, "<this>");
        ProductInfo productInfo = subscriptionDetails.getProductInfo();
        AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
        int i10 = C15410d.f148789j0;
        Integer numValueOf = Integer.valueOf(productInfo.getProductQty());
        String strValueOf = String.valueOf(productInfo.getProductPrice());
        String lowerCase = String.valueOf(productInfo.getProductUnit()).toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        AbstractC6392a abstractC6392aD = companion.d(i10, numValueOf, strValueOf, lowerCase);
        AbstractC6392a abstractC6392aB = companion.b(C15409c.f148731a, subscriptionDetails.getDeliveryFrequency(), Integer.valueOf(subscriptionDetails.getDeliveryFrequency()));
        String productPrice = productInfo.getProductPrice();
        AbstractC6392a abstractC6392aD2 = productPrice != null ? companion.d(C15410d.f148781f0, StringsKt.K0(productPrice, "$")) : null;
        String id2 = subscriptionDetails.getId();
        String productName = productInfo.getProductName();
        String str = productName == null ? "" : productName;
        String productImageThumbnail = productInfo.getProductImageThumbnail();
        return new SubscriptionCardDecorator(id2, str, productImageThumbnail == null ? "" : productImageThumbnail, abstractC6392aD, abstractC6392aD2, subscriptionDetails.getNextOrderDate(), abstractC6392aB);
    }
}
