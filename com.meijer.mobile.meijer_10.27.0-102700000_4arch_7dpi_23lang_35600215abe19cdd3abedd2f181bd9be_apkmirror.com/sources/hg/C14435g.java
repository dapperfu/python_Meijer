package hg;

import com.fullstory.FS;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16286j;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u000eB\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Lhg/g;", "Lhg/h;", "LIf/b;", "Lpc/j;", "transportFactoryProvider", "<init>", "(LIf/b;)V", "Lhg/I;", "value", "", "c", "(Lhg/I;)[B", "sessionEvent", "", "a", "(Lhg/I;)V", "LIf/b;", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: hg.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14435g implements InterfaceC14436h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final If.b<InterfaceC16286j> transportFactoryProvider;

    public C14435g(If.b<InterfaceC16286j> transportFactoryProvider) {
        Intrinsics.j(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(SessionEvent value) {
        String strB = J.f134751a.c().b(value);
        Intrinsics.i(strB, "encode(...)");
        FS.log_d("FirebaseSessions", "Session Event Type: " + value.getEventType().name());
        byte[] bytes = strB.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // hg.InterfaceC14436h
    public void a(SessionEvent sessionEvent) {
        Intrinsics.j(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().a("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, C16279c.b("json"), new InterfaceC16284h() { // from class: hg.f
            @Override // pc.InterfaceC16284h
            public final Object apply(Object obj) {
                return this.f134905a.c((SessionEvent) obj);
            }
        }).a(AbstractC16280d.f(sessionEvent));
    }
}
