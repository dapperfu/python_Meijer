package g8;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    private static final String f133198b = x.f133195a + "GuardedEventDispatcher";

    /* renamed from: a, reason: collision with root package name */
    private s7.h f133199a = null;

    public interface a {
        void a(s7.h hVar);
    }

    public void c() {
        this.f133199a = null;
    }

    public void a(n8.b bVar, a aVar) {
        if (bVar == null) {
            if (x.f133196b) {
                x8.f.u(f133198b, "Session object is null");
            }
        } else if (bVar.o() && bVar.m()) {
            s7.h hVar = this.f133199a;
            if (hVar != null) {
                aVar.a(hVar);
            } else if (x.f133196b) {
                x8.f.u(f133198b, "event dispatcher is not available");
            }
        }
    }

    public void b(s7.h hVar) {
        this.f133199a = hVar;
    }
}
