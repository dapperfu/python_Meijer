package Xa;

import eb.C13786c;
import eb.C13787d;
import hb.C14499f;
import nt.C16020b;

/* loaded from: classes4.dex */
public class i {

    /* renamed from: b, reason: collision with root package name */
    private static final C13786c f41746b = C13787d.a(i.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final Nb.m<h> f41747c = new Nb.m<>(h.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Nb.m<d> f41748d = new Nb.m<>(d.class);

    /* renamed from: e, reason: collision with root package name */
    private static final Nb.m<g> f41749e = new Nb.m<>(g.class);

    /* renamed from: f, reason: collision with root package name */
    private static i f41750f;

    /* renamed from: a, reason: collision with root package name */
    private C14499f f41751a;

    public static synchronized i a() {
        if (f41750f == null) {
            try {
                f41750f = new i();
            } catch (Exception e10) {
                f41746b.g("Unable to create EstablishedLocationsManager", e10);
            }
        }
        return f41750f;
    }

    public void b() {
        this.f41751a.f135280p.d();
    }

    public void c() {
        this.f41751a.f135280p.e();
    }

    private i() {
        C16020b.a();
        this.f41751a = C14499f.a();
    }
}
