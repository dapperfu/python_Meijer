package Ao;

import Ao.W;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ju\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u00060\u0004j\u0002`\u000b2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015Ja\u0010\u0018\u001a\u00020\u00132\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\u0010\f\u001a\u00060\u0004j\u0002`\u000b2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LAo/S;", "", "<init>", "()V", "", "page", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "upc", "searchTerm", "searchMethod", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "itemCount", "", "quantity", "price", "", "isLowStock", "Lii/f;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;)Lii/f;", "backUpProductId", "trackingDoNotAddBackup", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Z)Lii/f;", "trackingData", "c", "(Ljava/lang/String;Lii/f;)Lii/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final S f1688a = new S();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, String str2, String str3, String str4, String str5, String str6, String str7, Double d10, Double d11, Boolean bool, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(str);
        TrackingData.h("productID", str2);
        TrackingData.h("backupProductID", str3);
        TrackingData.h("itemSelectedFromRecommendation", "false");
        TrackingData.h("searchTerm", str4);
        TrackingData.h("searchMethod", str5);
        TrackingData.h("cartID", str6);
        TrackingData.h("Cart Items Count", str7);
        TrackingData.e(W.i(new W.Details(str2, null, str3, d10, d11, null, null, null, null, null, null, Boolean.TRUE, null, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10270, 16383, null)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, String str2, String str3, String str4, boolean z10, Double d10, Double d11, Boolean bool, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.h("productID", str);
        TrackingData.h("backupProductID", str2);
        TrackingData.h("itemSelectedFromRecommendation", "true");
        TrackingData.h("cartID", str3);
        TrackingData.h("Cart Items Count", str4);
        String str5 = !z10 ? str2 : null;
        Boolean bool2 = Boolean.TRUE;
        TrackingData.e(W.i(new W.Details(str, null, str5, d10, d11, null, null, null, null, null, null, bool2, bool2, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -14366, 16383, null)));
        return Unit.f143329a;
    }

    public final TrackingData c(String page, TrackingData trackingData) {
        Intrinsics.j(page, "page");
        if (trackingData != null) {
            return Intrinsics.e(trackingData.getEvent(), C14756c.a("add backup item")) ? trackingData.n(page) : trackingData;
        }
        return null;
    }

    public final TrackingData d(final String page, final String productCode, final String upc, final String searchTerm, final String searchMethod, final String cartId, final String itemCount, final Double quantity, final Double price, final Boolean isLowStock) {
        Intrinsics.j(page, "page");
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(itemCount, "itemCount");
        return C14760g.a(C14756c.a("add backup item"), new Function1() { // from class: Ao.P
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.e(page, productCode, upc, searchTerm, searchMethod, cartId, itemCount, quantity, price, isLowStock, (TrackingData) obj);
            }
        });
    }

    public final TrackingData f(final String productCode, final String backUpProductId, final String cartId, final String itemCount, final Double quantity, final Double price, final Boolean isLowStock, final boolean trackingDoNotAddBackup) {
        Intrinsics.j(cartId, "cartId");
        Intrinsics.j(itemCount, "itemCount");
        return C14760g.a(C14756c.a("add backup item"), new Function1() { // from class: Ao.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return S.g(productCode, backUpProductId, cartId, itemCount, trackingDoNotAddBackup, quantity, price, isLowStock, (TrackingData) obj);
            }
        });
    }

    private S() {
    }
}
