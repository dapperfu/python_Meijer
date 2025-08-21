package Zi;

import ii.C14756c;
import ii.C14760g;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LZi/n;", "", "<init>", "()V", "Lii/f;", "e", "()Lii/f;", "i", "k", "", "message", "g", "(Ljava/lang/String;)Lii/f;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f43843a = new n();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(String str, TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        TrackingData.h("errorMessage", str);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(TrackingData TrackingData) {
        Intrinsics.j(TrackingData, "$this$TrackingData");
        TrackingData.v("my meijer");
        TrackingData.n("my meijer");
        return Unit.f143329a;
    }

    public final TrackingData e() {
        return C14760g.a(C14756c.a("event: force sign out"), new Function1() { // from class: Zi.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.f((TrackingData) obj);
            }
        });
    }

    public final TrackingData g(final String message) {
        return C14760g.a(C14756c.a("logout: failure"), new Function1() { // from class: Zi.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.h(message, (TrackingData) obj);
            }
        });
    }

    public final TrackingData i() {
        return C14760g.a(C14756c.a("logout: start"), new Function1() { // from class: Zi.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.j((TrackingData) obj);
            }
        });
    }

    public final TrackingData k() {
        return C14760g.a(C14756c.a("event: sign out"), new Function1() { // from class: Zi.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.l((TrackingData) obj);
            }
        });
    }

    private n() {
    }
}
