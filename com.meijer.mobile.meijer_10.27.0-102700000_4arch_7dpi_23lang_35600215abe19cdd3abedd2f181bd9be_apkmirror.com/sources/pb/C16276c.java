package pb;

import Bb.e;
import Bb.k;
import Bb.l;
import Ib.h;
import Ib.j;
import Ya.f;
import cb.C6380a;
import cb.C6381b;
import eb.C13639a;
import java.util.Map;
import nt.InterfaceC15945c;
import rb.C16742a;
import vb.C17538d;

/* renamed from: pb.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16276c extends f implements k {

    /* renamed from: q, reason: collision with root package name */
    private static final C6380a f155693q = C6381b.a(C16276c.class.getName());

    /* renamed from: m, reason: collision with root package name */
    private e f155694m;

    /* renamed from: n, reason: collision with root package name */
    private Ib.f f155695n;

    /* renamed from: o, reason: collision with root package name */
    private h f155696o;

    /* renamed from: p, reason: collision with root package name */
    private C17538d f155697p;

    /* renamed from: pb.c$a */
    final class a implements InterfaceC15945c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C16742a f155698a;

        @Override // nt.InterfaceC15945c
        public final void a(Object obj) {
            C6380a unused = C16276c.f155693q;
            this.f155698a.a(null);
        }

        a(C16742a c16742a) {
            this.f155698a = c16742a;
        }

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C6380a unused = C16276c.f155693q;
            this.f155698a.a(i10, str);
        }
    }

    public C16276c(Za.c cVar, Za.e eVar, e eVar2, l lVar, Ib.f fVar, h hVar) {
        super(cVar, eVar, "UploadDeviceAttributesJob");
        this.f155697p = new C17538d();
        lVar.e(this, "deviceAttributes");
        eVar2.h(this, "Registration_Properties");
        this.f155694m = eVar2;
        this.f155695n = fVar;
        this.f155696o = hVar;
    }

    private C13639a A() {
        try {
            return new C13639a(this.f155694m.x().c());
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if (!"Registration_Properties".equals(str) || this.f155694m.v()) {
            u();
        }
    }

    @Override // Ya.c
    public final void x() throws Exception {
        Map<String, String> mapB;
        C13639a c13639aA = A();
        if (c13639aA == null || (mapB = C16275b.a().b()) == null) {
            return;
        }
        String strA = c13639aA.a(this.f155697p.h(mapB));
        String strC = this.f155695n.c(j.f13794m);
        Ib.l lVar = new Ib.l(this.f155696o);
        C16742a c16742a = new C16742a();
        lVar.i(strC, strA, Object.class, new a(c16742a));
        c16742a.b();
    }
}
