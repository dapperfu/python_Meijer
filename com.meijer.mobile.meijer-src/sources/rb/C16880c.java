package rb;

import Db.e;
import Db.k;
import Db.l;
import Kb.h;
import Kb.j;
import ab.f;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import gb.C14343a;
import java.util.Map;
import nt.InterfaceC16021c;
import tb.C17216a;
import xb.C18150d;

/* renamed from: rb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16880c extends f implements k {

    /* renamed from: q, reason: collision with root package name */
    private static final C13784a f159450q = C13785b.a(C16880c.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private e f159451m;

    /* renamed from: n, reason: collision with root package name */
    private Kb.f f159452n;

    /* renamed from: o, reason: collision with root package name */
    private h f159453o;

    /* renamed from: p, reason: collision with root package name */
    private C18150d f159454p;

    /* renamed from: rb.c$a */
    final class a implements InterfaceC16021c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C17216a f159455a;

        @Override // nt.InterfaceC16021c
        public final void a(Object obj) {
            C13784a unused = C16880c.f159450q;
            this.f159455a.a(null);
        }

        a(C17216a c17216a) {
            this.f159455a = c17216a;
        }

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C13784a unused = C16880c.f159450q;
            this.f159455a.a(i10, str);
        }
    }

    public C16880c(C6346c c6346c, bb.e eVar, e eVar2, l lVar, Kb.f fVar, h hVar) {
        super(c6346c, eVar, "UploadDeviceAttributesJob");
        this.f159454p = new C18150d();
        lVar.j(this, "deviceAttributes");
        eVar2.h(this, "Registration_Properties");
        this.f159451m = eVar2;
        this.f159452n = fVar;
        this.f159453o = hVar;
    }

    private C14343a A() {
        try {
            return new C14343a(this.f159451m.x().c());
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if (!"Registration_Properties".equals(str) || this.f159451m.v()) {
            u();
        }
    }

    @Override // ab.AbstractC5678c
    public final void x() throws Exception {
        Map<String, String> mapB;
        C14343a c14343aA = A();
        if (c14343aA == null || (mapB = C16879b.a().b()) == null) {
            return;
        }
        String strA = c14343aA.a(this.f159454p.h(mapB));
        String strC = this.f159452n.c(j.f16540m);
        Kb.l lVar = new Kb.l(this.f159453o);
        C17216a c17216a = new C17216a();
        lVar.i(strC, strA, Object.class, new a(c17216a));
        c17216a.b();
    }
}
