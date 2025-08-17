package zb;

import Bb.e;
import Bb.k;
import java.util.ArrayList;
import rb.C16742a;
import yb.C18199a;

/* renamed from: zb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18415c extends Ya.b implements k {

    /* renamed from: n, reason: collision with root package name */
    private Ab.b f171712n;

    /* renamed from: o, reason: collision with root package name */
    private C18413a f171713o;

    /* renamed from: p, reason: collision with root package name */
    private e f171714p;

    public C18415c(Za.c cVar, Za.e eVar, Ab.b bVar, C18413a c18413a, e eVar2) {
        super(cVar, eVar, "PlaceStateJob", 2592000000L);
        this.f171713o = c18413a;
        this.f171712n = bVar;
        this.f171714p = eVar2;
        eVar2.h(this, "Place_State_Aggregate_Permission");
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("Place_State_Aggregate_Permission".equals(str) && obj != null && ((Boolean) obj).booleanValue()) {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Ya.g, Ya.c
    public final long p() {
        if (this.f171714p.c()) {
            return super.p();
        }
        return 4611686018427387903L;
    }

    @Override // Ya.c
    public final void x() throws Exception {
        Ab.b bVar = this.f171712n;
        ArrayList arrayList = new ArrayList();
        for (Db.b bVar2 : bVar.f168a.u()) {
            if (bVar2.f() == null && bVar2.n()) {
                arrayList.add(C18199a.a(bVar2));
            }
        }
        C16742a c16742a = new C16742a();
        this.f171713o.f(arrayList, c16742a);
        c16742a.b();
    }
}
