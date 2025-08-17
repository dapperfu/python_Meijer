package Ao;

import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LAo/g0;", "", "<init>", "()V", "", "variantName", "variantType", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "Lhi/f;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lhi/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f1298a = new g0();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, String str2, String str3, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("product detail page");
        TrackingData.h("&&products", ';' + str);
        TrackingData.h("productID", String.valueOf(str));
        TrackingData.h("variantType", str2);
        TrackingData.h("variantName", str3);
        return Unit.f142422a;
    }

    public final TrackingData b(final String variantName, final String variantType, final String productCode) {
        Intrinsics.j(variantName, "variantName");
        Intrinsics.j(variantType, "variantType");
        return C14480g.a(C14476c.a("Interacted with variant"), new Function1() { // from class: Ao.f0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g0.c(productCode, variantType, variantName, (TrackingData) obj);
            }
        });
    }

    private g0() {
    }
}
