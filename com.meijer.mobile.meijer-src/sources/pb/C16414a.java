package pb;

import Kb.j;
import Kb.k;
import ab.AbstractC5677b;
import bb.C6346c;
import bb.e;
import pb.C16415b.a;
import tb.C17216a;

/* renamed from: pb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16414a extends AbstractC5677b {

    /* renamed from: n, reason: collision with root package name */
    private C16415b f156247n;

    /* renamed from: o, reason: collision with root package name */
    private Db.b f156248o;

    public C16414a(C6346c c6346c, e eVar, C16415b c16415b, Db.b bVar) {
        super(c6346c, eVar, "ApplicationConfigurationJob", bVar.n());
        this.f156247n = c16415b;
        this.f156248o = bVar;
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        C17216a c17216a = new C17216a();
        C16415b c16415b = this.f156247n;
        new k(c16415b.f156252c).i(c16415b.f156251b.e(j.f16534g), Qb.b.class, c16415b.new a(c17216a));
        c17216a.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ab.AbstractC5677b, ab.g
    public final long z() {
        return this.f156248o.n();
    }
}
