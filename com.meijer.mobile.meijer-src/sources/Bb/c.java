package Bb;

import Db.e;
import Db.k;
import ab.AbstractC5677b;
import bb.C6346c;
import java.util.ArrayList;
import tb.C17216a;

/* loaded from: classes4.dex */
public final class c extends AbstractC5677b implements k {

    /* renamed from: n, reason: collision with root package name */
    private Cb.b f2626n;

    /* renamed from: o, reason: collision with root package name */
    private a f2627o;

    /* renamed from: p, reason: collision with root package name */
    private e f2628p;

    public c(C6346c c6346c, bb.e eVar, Cb.b bVar, a aVar, e eVar2) {
        super(c6346c, eVar, "PlaceStateJob", 2592000000L);
        this.f2627o = aVar;
        this.f2626n = bVar;
        this.f2628p = eVar2;
        eVar2.h(this, "Place_State_Aggregate_Permission");
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Place_State_Aggregate_Permission".equals(str) && obj != null && ((Boolean) obj).booleanValue()) {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.g, ab.AbstractC5678c
    public final long p() {
        if (this.f2628p.c()) {
            return super.p();
        }
        return 4611686018427387903L;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        Cb.b bVar = this.f2626n;
        ArrayList arrayList = new ArrayList();
        for (Fb.b bVar2 : bVar.f4164a.u()) {
            if (bVar2.f() == null && bVar2.n()) {
                arrayList.add(Ab.a.a(bVar2));
            }
        }
        C17216a c17216a = new C17216a();
        this.f2627o.f(arrayList, c17216a);
        c17216a.b();
    }
}
