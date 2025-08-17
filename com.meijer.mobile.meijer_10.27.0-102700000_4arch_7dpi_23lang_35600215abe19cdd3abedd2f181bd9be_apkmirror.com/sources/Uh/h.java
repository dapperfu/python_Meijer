package Uh;

import ak.AbstractC5607a;
import cr.ProductInfo;
import cr.SubscriptionDetails;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kr.C15306c;
import kr.C15307d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcr/j;", "LUh/g;", "a", "(Lcr/j;)LUh/g;", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h {
    public static final SubscriptionCardDecorator a(SubscriptionDetails subscriptionDetails) {
        Intrinsics.j(subscriptionDetails, "<this>");
        ProductInfo productInfo = subscriptionDetails.getProductInfo();
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        int i10 = C15307d.f147879j0;
        Integer numValueOf = Integer.valueOf(productInfo.getProductQty());
        String strValueOf = String.valueOf(productInfo.getProductPrice());
        String lowerCase = String.valueOf(productInfo.getProductUnit()).toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        AbstractC5607a abstractC5607aD = companion.d(i10, numValueOf, strValueOf, lowerCase);
        AbstractC5607a abstractC5607aB = companion.b(C15306c.f147823a, subscriptionDetails.getDeliveryFrequency(), Integer.valueOf(subscriptionDetails.getDeliveryFrequency()));
        String productPrice = productInfo.getProductPrice();
        AbstractC5607a abstractC5607aD2 = productPrice != null ? companion.d(C15307d.f147871f0, StringsKt.J0(productPrice, "$")) : null;
        String id2 = subscriptionDetails.getId();
        String productName = productInfo.getProductName();
        String str = productName == null ? "" : productName;
        String productImageThumbnail = productInfo.getProductImageThumbnail();
        return new SubscriptionCardDecorator(id2, str, productImageThumbnail == null ? "" : productImageThumbnail, abstractC5607aD, abstractC5607aD2, subscriptionDetails.getNextOrderDate(), abstractC5607aB);
    }
}
