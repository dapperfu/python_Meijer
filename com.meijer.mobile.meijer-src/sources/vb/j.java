package vb;

import ab.AbstractC5678c;
import ac.C5679a;
import bb.C6346c;
import com.medallia.digital.mobilesdk.l8;
import eb.C13784a;
import eb.C13785b;
import java.util.List;
import vb.k.b;

/* loaded from: classes4.dex */
public class j extends AbstractC5678c {

    /* renamed from: o, reason: collision with root package name */
    private static final C13784a f165737o = C13785b.a(j.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private Db.b f165738m;

    /* renamed from: n, reason: collision with root package name */
    private k f165739n;

    public j(C6346c c6346c, bb.e eVar, k kVar, Db.b bVar) {
        super(c6346c, eVar, "iBeaconSightingUploadJob");
        this.f165739n = kVar;
        this.f165738m = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5678c
    public final long p() {
        return Math.max(this.f165739n.f165745d.c(), s()) + this.f165738m.o();
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C5679a c5679a = new C5679a();
        k kVar = this.f165739n;
        if (kVar.f165745d.a() > 0) {
            List<b> listD = kVar.f165745d.d();
            listD.size();
            kVar.f165748g.e(kVar.c(listD), kVar.new b(listD, c5679a));
        }
        c5679a.b();
    }

    public final void a() {
        q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5678c
    public final long o() {
        return l8.b.f93364b;
    }
}
