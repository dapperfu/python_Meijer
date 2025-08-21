package Vf;

import com.google.firebase.perf.session.SessionManager;
import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class g implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final a f39903a;

    public static g a(a aVar) {
        return new g(aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f39903a);
    }

    public g(a aVar) {
        this.f39903a = aVar;
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) C18225c.d(aVar.f());
    }
}
