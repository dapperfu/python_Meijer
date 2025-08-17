package Yi;

import hi.C14476c;
import hi.C14480g;
import hi.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"LYi/i;", "", "<init>", "()V", "Lhi/f;", "e", "()Lhi/f;", "k", "", "message", "i", "(Ljava/lang/String;)Lhi/f;", "g", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f40273a = new i();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        TrackingData.h("errorMessage", str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        return Unit.f142422a;
    }

    public final TrackingData e() {
        return C14480g.a(C14476c.a("login"), new Function1() { // from class: Yi.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.f((TrackingData) obj);
            }
        });
    }

    public final TrackingData g() {
        return C14480g.a(C14476c.a("login: exit"), new Function1() { // from class: Yi.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.h((TrackingData) obj);
            }
        });
    }

    public final TrackingData i(final String message) {
        return C14480g.a(C14476c.a("login: failure"), new Function1() { // from class: Yi.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.j(message, (TrackingData) obj);
            }
        });
    }

    public final TrackingData k() {
        return C14480g.a(C14476c.a("login: success"), new Function1() { // from class: Yi.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.l((TrackingData) obj);
            }
        });
    }

    private i() {
    }
}
