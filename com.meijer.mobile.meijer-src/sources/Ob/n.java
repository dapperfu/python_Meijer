package Ob;

import java.io.IOException;
import java.util.List;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    Db.j f23290a;

    public final a a() {
        return (a) this.f23290a.a("ACTIVE_TRIP", a.class);
    }

    public final void b(a aVar) throws IOException {
        this.f23290a.b("ACTIVE_TRIP", aVar);
    }

    public final void c(b bVar) throws IOException {
        this.f23290a.b("ACTIVE_VISIT", bVar);
    }

    public final b e() {
        return (b) this.f23290a.a("ACTIVE_VISIT", b.class);
    }

    public n(Db.j jVar) {
        this.f23290a = jVar;
    }

    public final void d(List<f> list) throws IOException {
        f[] fVarArr = new f[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            fVarArr[i10] = list.get(i10);
        }
        this.f23290a.b("QUEUE", fVarArr);
    }
}
