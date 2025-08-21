package kc;

import ab.AbstractC5678c;
import ac.C5679a;
import bb.C6346c;
import com.medallia.digital.mobilesdk.l8;
import eb.C13784a;
import eb.C13785b;

/* loaded from: classes4.dex */
public class o extends AbstractC5678c {

    /* renamed from: o, reason: collision with root package name */
    private static final C13784a f141822o = C13785b.a(o.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private Db.b f141823m;

    /* renamed from: n, reason: collision with root package name */
    private m f141824n;

    public o(C6346c c6346c, bb.e eVar, m mVar, Db.b bVar) {
        super(c6346c, eVar, "SightingsUploadJob");
        this.f141824n = mVar;
        this.f141823m = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5678c
    public final long p() {
        return Math.max(this.f141824n.a(), s()) + this.f141823m.o();
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C5679a c5679a = new C5679a();
        this.f141824n.b(c5679a);
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
