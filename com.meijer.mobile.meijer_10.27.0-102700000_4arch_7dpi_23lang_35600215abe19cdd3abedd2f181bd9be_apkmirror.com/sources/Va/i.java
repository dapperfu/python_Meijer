package Va;

import cb.C6382c;
import cb.C6383d;
import fb.C13869f;
import nt.C15944b;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f37034b = C6383d.a(i.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final Lb.m<h> f37035c = new Lb.m<>(h.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Lb.m<d> f37036d = new Lb.m<>(d.class);

    /* renamed from: e, reason: collision with root package name */
    private static final Lb.m<g> f37037e = new Lb.m<>(g.class);

    /* renamed from: f, reason: collision with root package name */
    private static i f37038f;

    /* renamed from: a, reason: collision with root package name */
    private C13869f f37039a;

    public static synchronized i a() {
        if (f37038f == null) {
            try {
                f37038f = new i();
            } catch (Exception e10) {
                f37034b.g("Unable to create EstablishedLocationsManager", e10);
            }
        }
        return f37038f;
    }

    public void b() {
        this.f37039a.f130934p.d();
    }

    public void c() {
        this.f37039a.f130934p.e();
    }

    private i() {
        C15944b.a();
        this.f37039a = C13869f.a();
    }
}
