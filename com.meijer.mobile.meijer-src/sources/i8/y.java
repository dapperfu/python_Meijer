package i8;

/* loaded from: classes4.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    private static final String f137414b = x.f137411a + "GuardedEventDispatcher";

    /* renamed from: a, reason: collision with root package name */
    private u7.h f137415a = null;

    public interface a {
        void a(u7.h hVar);
    }

    public void c() {
        this.f137415a = null;
    }

    public void a(p8.b bVar, a aVar) {
        if (bVar == null) {
            if (x.f137412b) {
                z8.f.u(f137414b, "Session object is null");
            }
        } else if (bVar.o() && bVar.m()) {
            u7.h hVar = this.f137415a;
            if (hVar != null) {
                aVar.a(hVar);
            } else if (x.f137412b) {
                z8.f.u(f137414b, "event dispatcher is not available");
            }
        }
    }

    public void b(u7.h hVar) {
        this.f137415a = hVar;
    }
}
