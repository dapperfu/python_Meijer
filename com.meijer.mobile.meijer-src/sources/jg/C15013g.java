package jg;

import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16890j;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Ljg/g;", "Ljg/h;", "LKf/b;", "Lrc/j;", "transportFactoryProvider", "<init>", "(LKf/b;)V", "Ljg/I;", "value", "", "c", "(Ljg/I;)[B", "sessionEvent", "", "a", "(Ljg/I;)V", "LKf/b;", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15013g implements InterfaceC15014h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Kf.b<InterfaceC16890j> transportFactoryProvider;

    public C15013g(Kf.b<InterfaceC16890j> transportFactoryProvider) {
        Intrinsics.j(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(SessionEvent value) {
        String strB = J.f140446a.c().b(value);
        Intrinsics.i(strB, "encode(...)");
        FS.log_d("FirebaseSessions", "Session Event Type: " + value.getEventType().name());
        byte[] bytes = strB.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // jg.InterfaceC15014h
    public void a(SessionEvent sessionEvent) {
        Intrinsics.j(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().a("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, C16883c.b("json"), new InterfaceC16888h() { // from class: jg.f
            @Override // rc.InterfaceC16888h
            public final Object apply(Object obj) {
                return this.f140600a.c((SessionEvent) obj);
            }
        }).b(AbstractC16884d.f(sessionEvent));
    }
}
