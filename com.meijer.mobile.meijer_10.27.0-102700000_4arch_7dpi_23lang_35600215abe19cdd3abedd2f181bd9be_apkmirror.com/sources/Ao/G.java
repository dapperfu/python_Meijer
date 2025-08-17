package Ao;

import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LAo/G;", "", "<init>", "()V", "", "viewOffer", "Lhi/f;", "b", "(Z)Lhi/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public static final G f1163a = new G();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(boolean z10, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.h("highValuePromptAlert", "yes");
        TrackingData.h("highValuePromptAlertAction", z10 ? "accepted" : "ignored");
        return Unit.f142422a;
    }

    public final TrackingData b(final boolean viewOffer) {
        return C14480g.a(C14476c.a("Meijer: Cart Page: High Value Prompt"), new Function1() { // from class: Ao.F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return G.c(viewOffer, (TrackingData) obj);
            }
        });
    }

    private G() {
    }
}
