package xa;

import I9.o;
import K9.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxa/f;", "Lxa/h;", "Ljava/lang/Class;", "klass", "<init>", "(Ljava/lang/Class;)V", "", "pushToken", "LX8/a;", "completionListener", "", "b", "(Ljava/lang/String;LX8/a;)V", "c", "(LX8/a;)V", "sid", "d", "LY9/a;", "notificationEventHandler", "a", "(LY9/a;)V", "Ljava/lang/Class;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xa.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18142f implements InterfaceC18144h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> klass;

    @Override // xa.InterfaceC18144h
    public void c(X8.a completionListener) {
        Map mapG = MapsKt.g(TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, mapG), false, 2, null);
    }

    public C18142f(Class<?> klass) {
        Intrinsics.j(klass, "klass");
        this.klass = klass;
    }

    @Override // xa.InterfaceC18144h
    public void a(Y9.a notificationEventHandler) {
        Intrinsics.j(notificationEventHandler, "notificationEventHandler");
        Map mapG = MapsKt.g(TuplesKt.a("notification_event_handler", Boolean.TRUE));
        String strA = o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, mapG), false, 2, null);
    }

    @Override // xa.InterfaceC18144h
    public void b(String pushToken, X8.a completionListener) {
        Intrinsics.j(pushToken, "pushToken");
        Map mapO = MapsKt.o(TuplesKt.a("push_token", pushToken), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, mapO), false, 2, null);
    }

    @Override // xa.InterfaceC18144h
    public void d(String sid, X8.a completionListener) {
        Map mapO = MapsKt.o(TuplesKt.a("messageId", sid), TuplesKt.a("completion_listener", Boolean.valueOf(completionListener != null)));
        String strA = o.a();
        e.Companion companion = K9.e.INSTANCE;
        Class<?> cls = this.klass;
        Intrinsics.g(strA);
        e.Companion.b(companion, new L9.g(cls, strA, mapO), false, 2, null);
    }
}
