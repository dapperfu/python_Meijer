package Ao;

import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LAo/O;", "", "<init>", "()V", "", "promoCode", "analyticsMessage", "", "promoCodeState", "Lii/f;", "b", "(Ljava/lang/String;Ljava/lang/String;I)Lii/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static final O f1669a = new O();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(int i10, String str, String str2, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        String str3 = i10 != 1 ? i10 != 2 ? "" : "0" : "1";
        TrackingData.h("promoCodeText", str);
        TrackingData.h("promoCodeStatus", str3);
        if (i10 == 2) {
            TrackingData.h("promoCodeFailureMessage", str2);
        }
        return Unit.f143329a;
    }

    public final TrackingData b(final String promoCode, final String analyticsMessage, final int promoCodeState) {
        return C14760g.a(C14756c.a("Meijer Cart Page: Apply Promo"), new Function1() { // from class: Ao.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return O.c(promoCodeState, promoCode, analyticsMessage, (TrackingData) obj);
            }
        });
    }

    private O() {
    }
}
