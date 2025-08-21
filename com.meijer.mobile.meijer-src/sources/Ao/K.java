package Ao;

import Ao.W;
import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LAo/K;", "", "<init>", "()V", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "", "LAo/W$b;", "productList", "Lii/f;", "b", "(Ljava/lang/String;Ljava/util/List;)Lii/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f1662a = new K();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, List list, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n("Meijer:CartPage");
        TrackingData.h("cartID", str);
        TrackingData.e(W.j(list));
        return Unit.f143329a;
    }

    public final TrackingData b(final String cartId, final List<W.Details> productList) {
        Intrinsics.j(productList, "productList");
        return C14760g.a(C14756c.a("event: cart removal: all OOS"), new Function1() { // from class: Ao.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return K.c(cartId, productList, (TrackingData) obj);
            }
        });
    }

    private K() {
    }
}
