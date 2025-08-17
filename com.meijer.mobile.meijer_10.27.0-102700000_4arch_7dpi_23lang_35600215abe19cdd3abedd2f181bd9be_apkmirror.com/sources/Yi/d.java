package Yi;

import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"LYi/d;", "", "<init>", "()V", "Lhi/f;", "h", "()Lhi/f;", "", "message", "d", "(Ljava/lang/String;)Lhi/f;", "f", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f40271a = new d();

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
    public static final Unit i(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        return Unit.f142422a;
    }

    public final TrackingData d(final String message) {
        return C14480g.a(C14476c.a("login: authentication: failure"), new Function1() { // from class: Yi.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.e(message, (TrackingData) obj);
            }
        });
    }

    public final TrackingData f(final String message) {
        return C14480g.a(C14476c.a("login: authentication: fatal"), new Function1() { // from class: Yi.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.g(message, (TrackingData) obj);
            }
        });
    }

    public final TrackingData h() {
        return C14480g.a(C14476c.a("login: authentication: success"), new Function1() { // from class: Yi.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.i((TrackingData) obj);
            }
        });
    }

    private d() {
    }
}
