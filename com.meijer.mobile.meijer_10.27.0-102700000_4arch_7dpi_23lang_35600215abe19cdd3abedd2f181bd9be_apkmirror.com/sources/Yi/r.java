package Yi;

import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"LYi/r;", "", "<init>", "()V", "", "message", "Lhi/f;", "f", "(Ljava/lang/String;)Lhi/f;", "h", "d", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f40279a = new r();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        TrackingData.h("errorMessage", str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        TrackingData.h("errorMessage", str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        TrackingData.h("errorMessage", str);
        return Unit.f142422a;
    }

    public final TrackingData d(final String message) {
        return C14480g.a(C14476c.a("refresh failure: fatal"), new Function1() { // from class: Yi.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.e(message, (TrackingData) obj);
            }
        });
    }

    public final TrackingData f(final String message) {
        return C14480g.a(C14476c.a("refresh failure: transient errors"), new Function1() { // from class: Yi.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.g(message, (TrackingData) obj);
            }
        });
    }

    public final TrackingData h(final String message) {
        return C14480g.a(C14476c.a("refresh failure: retry"), new Function1() { // from class: Yi.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r.i(message, (TrackingData) obj);
            }
        });
    }

    private r() {
    }
}
