package Ao;

import Ao.W;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0004j\u0002`\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LAo/b;", "", "<init>", "()V", "", "page", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "totalItems", "Lcom/meijer/mobile/core/models/products/ProductCode;", "upc", "", "quantity", "", "isOutOfStock", "isLowStock", "Lii/f;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZZ)Lii/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ao.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C2880b {

    /* renamed from: a, reason: collision with root package name */
    public static final C2880b f1759a = new C2880b();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, String str2, String str3, String str4, double d10, boolean z10, boolean z11, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(str);
        TrackingData.h("cartID", str2);
        TrackingData.h("Cart Items Count", str3);
        TrackingData.e(W.i(new W.Details(str4, null, null, Double.valueOf(d10), null, null, null, null, null, null, Boolean.valueOf(z10), null, null, Boolean.valueOf(z11), null, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -140298, 16383, null)));
        return Unit.f143329a;
    }

    public final TrackingData b(final String page, final String cartId, final String totalItems, final String upc, final double quantity, final boolean isOutOfStock, final boolean isLowStock) {
        Intrinsics.j(page, "page");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(totalItems, "totalItems");
        Intrinsics.j(upc, "upc");
        return C14760g.a(C14756c.a("Add backup item button clicked"), new Function1() { // from class: Ao.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2880b.c(page, cartId, totalItems, upc, quantity, isOutOfStock, isLowStock, (TrackingData) obj);
            }
        });
    }

    private C2880b() {
    }
}
