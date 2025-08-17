package Ao;

import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LAo/I;", "", "<init>", "()V", "", "rewardAction", "mperksPoint", "Lhi/f;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lhi/f;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final I f1165a = new I();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.h("mperksPoints", str);
        TrackingData.v("mPerks 4.0");
        TrackingData.o("cart");
        return Unit.f142422a;
    }

    public final TrackingData b(String rewardAction, final String mperksPoint) {
        Intrinsics.j(rewardAction, "rewardAction");
        Intrinsics.j(mperksPoint, "mperksPoint");
        return C14480g.a(C14476c.a(rewardAction), new Function1() { // from class: Ao.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I.c(mperksPoint, (TrackingData) obj);
            }
        });
    }

    private I() {
    }
}
