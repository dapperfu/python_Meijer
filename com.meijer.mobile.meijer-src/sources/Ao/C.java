package Ao;

import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LAo/C;", "", "<init>", "()V", "", "page", "Lii/f;", "b", "(Ljava/lang/String;)Lii/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f1653a = new C();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.n(str);
        TrackingData.h("emptyCart", "1");
        return Unit.f143329a;
    }

    public final TrackingData b(final String page) {
        Intrinsics.j(page, "page");
        return C14760g.a(C14756c.a("Cart Emptied"), new Function1() { // from class: Ao.B
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C.c(page, (TrackingData) obj);
            }
        });
    }

    private C() {
    }
}
