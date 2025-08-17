package Tf;

import com.google.firebase.perf.session.SessionManager;

/* loaded from: classes7.dex */
public final class g implements Bu.d {

    /* renamed from: a, reason: collision with root package name */
    private final a f34970a;

    public static g a(a aVar) {
        return new g(aVar);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f34970a);
    }

    public g(a aVar) {
        this.f34970a = aVar;
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) Bu.c.d(aVar.f());
    }
}
