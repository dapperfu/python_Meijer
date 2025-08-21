package gi;

import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgi/a;", "", "page", "Lii/f;", "b", "(Lgi/a;Ljava/lang/String;)Lii/f;", "models_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: gi.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C14375c {
    public static final TrackingData b(final GoogleAdAnalytics googleAdAnalytics, final String str) {
        Intrinsics.j(googleAdAnalytics, "<this>");
        return C14760g.a(C14756c.a("RMN Ad clicked"), new Function1() { // from class: gi.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C14375c.c(str, googleAdAnalytics, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, GoogleAdAnalytics googleAdAnalytics, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        if (str != null) {
            TrackingData.n(str);
        }
        TrackingData.o(googleAdAnalytics.getPageType());
        TrackingData.h("RMNAdType", googleAdAnalytics.getAdType());
        TrackingData.h("RMNAdDisplaySize", googleAdAnalytics.getAdDisplaySize());
        TrackingData.h("RMNAdID", googleAdAnalytics.getAdUnitId());
        String mPerksShopperId = googleAdAnalytics.getMPerksShopperId();
        if (mPerksShopperId != null) {
            TrackingData.h("mperksShopperId", mPerksShopperId);
        }
        return Unit.f143329a;
    }
}
