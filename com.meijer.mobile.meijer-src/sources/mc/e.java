package mc;

import Qb.g;
import Xb.a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import ec.C13788a;
import gc.InterfaceC14344a;
import java.util.ArrayList;
import java.util.List;
import kc.C15116a;
import kc.l;
import lc.InterfaceC15480b;
import nc.C15930b;
import nc.C15931c;
import qb.C16618a;

/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: i, reason: collision with root package name */
    private static final C13784a f150975i = C13785b.a(e.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static final C13786c f150976j = C13787d.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private l f150977a;

    /* renamed from: b, reason: collision with root package name */
    private ec.e f150978b;

    /* renamed from: c, reason: collision with root package name */
    private C13788a f150979c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC14344a f150980d;

    /* renamed from: e, reason: collision with root package name */
    private Fb.d f150981e;

    /* renamed from: f, reason: collision with root package name */
    private C16618a f150982f;

    /* renamed from: g, reason: collision with root package name */
    private ec.d f150983g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC15480b f150984h = new lc.f();

    final class a implements Tb.a<ic.e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ic.d f150985a;

        @Override // Tb.a
        public final /* synthetic */ void a(ic.e eVar) {
            e.this.d(eVar);
            e.this.f150980d.b(this.f150985a, e.this.new b());
        }

        a(ic.d dVar) {
            this.f150985a = dVar;
        }

        @Override // Tb.a
        public final void a(int i10, String str) {
            e.this.c(i10, str);
        }
    }

    final class b implements Tb.a<ic.e> {
        @Override // Tb.a
        public final /* bridge */ /* synthetic */ void a(ic.e eVar) {
            e.this.d(eVar);
        }

        b() {
        }

        @Override // Tb.a
        public final void a(int i10, String str) {
            e.this.c(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(int i10, String str) {
        C16618a c16618a = this.f150982f;
        if (c16618a.f158080a && c16618a.f158081b) {
            C16618a.f158079d.d("Sighted unknown Gimbal beacon", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(ic.e eVar) {
        try {
            C15931c c15931c = new C15931c();
            c15931c.k(eVar.g());
            c15931c.v(eVar.b());
            c15931c.q(eVar.d());
            c15931c.r(eVar.e());
            c15931c.j(a.EnumC0897a.GIMBAL);
            c15931c.i(Integer.valueOf(eVar.h().a()));
            c15931c.t(Integer.valueOf(eVar.h().k()));
            ArrayList arrayList = new ArrayList();
            for (g gVar : eVar.f()) {
                C15930b c15930b = new C15930b();
                c15930b.k(gVar.e());
                c15930b.o(gVar.g());
                c15930b.n(gVar.f());
                gVar.b();
                arrayList.add(c15930b);
            }
            c15931c.s(arrayList);
            eVar.h().g();
            c15931c.c();
            c15931c.getName();
            if (eVar.c() != null && !eVar.c().isEmpty()) {
                e(eVar, c15931c);
                String strA = ec.c.a(eVar.c().get(0));
                C15116a c15116aB = this.f150978b.f130071a.b(strA, C15116a.class);
                C15116a c15116aH = eVar.h();
                if (c15116aB != null) {
                    c15116aH.g();
                    this.f150978b.f130071a.a(strA);
                    List<g> listF = eVar.f();
                    if (listF != null) {
                        eVar.d();
                        listF.size();
                        try {
                            this.f150981e.x(eVar.g(), listF);
                        } catch (Exception e10) {
                            f150976j.g("Unable to update places", e10);
                        }
                    }
                    byte[] bArrB = this.f150983g.b(strA);
                    if (bArrB != null) {
                        this.f150984h.a(c15116aB, bArrB);
                        c15931c.i(Integer.valueOf(c15116aB.a()));
                        c15931c.t(Integer.valueOf(c15116aB.k()));
                    }
                    this.f150977a.b(c15116aB, c15931c);
                    return;
                }
                c15116aH.g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // mc.d
    public final boolean a(C15116a c15116a, String str) {
        if (this.f150978b.a(c15116a).booleanValue()) {
            return false;
        }
        c15116a.g();
        this.f150978b.b(c15116a);
        ic.d dVar = new ic.d();
        dVar.c(c15116a.g());
        dVar.d(str);
        dVar.e(c15116a);
        this.f150980d.d(dVar, new a(dVar));
        return true;
    }

    public e(l lVar, C13788a c13788a, ec.e eVar, InterfaceC14344a interfaceC14344a, Fb.d dVar, C16618a c16618a, ec.d dVar2) {
        this.f150978b = eVar;
        this.f150979c = c13788a;
        this.f150977a = lVar;
        this.f150980d = interfaceC14344a;
        this.f150981e = dVar;
        this.f150982f = c16618a;
        this.f150983g = dVar2;
    }

    private void e(ic.e eVar, C15931c c15931c) {
        int size = eVar.c().size();
        int size2 = eVar.a().size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = ec.c.a(eVar.c().get(i10));
            if (size2 > i10) {
                String str = eVar.a().get(i10);
                ec.d dVar = this.f150983g;
                dVar.f130069a.a(ec.c.a(strA), str);
            }
            C13788a c13788a = this.f150979c;
            ec.b bVarA = ec.b.a();
            String strC = c15931c.c();
            bVarA.f130066a.a(ec.b.b(strA), strC);
            c13788a.f130064a.a(c15931c.c(), c15931c);
        }
    }
}
