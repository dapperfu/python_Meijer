package fi;

import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi/a;", "", "page", "Lhi/f;", "b", "(Lfi/a;Ljava/lang/String;)Lhi/f;", "models_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fi.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13902c {
    public static final TrackingData b(final GoogleAdAnalytics googleAdAnalytics, final String str) {
        Intrinsics.j(googleAdAnalytics, "<this>");
        return C14480g.a(C14476c.a("RMN Ad clicked"), new Function1() { // from class: fi.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C13902c.c(str, googleAdAnalytics, (TrackingData) obj);
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
        return Unit.f142422a;
    }
}
