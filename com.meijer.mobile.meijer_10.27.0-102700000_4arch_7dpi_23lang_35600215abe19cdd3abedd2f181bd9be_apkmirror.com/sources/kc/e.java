package kc;

import Ob.g;
import Vb.a;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import cc.C6384a;
import ec.InterfaceC13640a;
import ic.C14713a;
import ic.l;
import java.util.ArrayList;
import java.util.List;
import jc.InterfaceC14881b;
import lc.C15396b;
import lc.C15397c;
import ob.C16010a;

/* loaded from: classes4.dex */
public class e implements d {

    /* renamed from: i, reason: collision with root package name */
    private static final C6380a f141829i = C6381b.a(e.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static final C6382c f141830j = C6383d.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private l f141831a;

    /* renamed from: b, reason: collision with root package name */
    private cc.e f141832b;

    /* renamed from: c, reason: collision with root package name */
    private C6384a f141833c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC13640a f141834d;

    /* renamed from: e, reason: collision with root package name */
    private Db.d f141835e;

    /* renamed from: f, reason: collision with root package name */
    private C16010a f141836f;

    /* renamed from: g, reason: collision with root package name */
    private cc.d f141837g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC14881b f141838h = new jc.f();

    final class a implements Rb.a<gc.e> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ gc.d f141839a;

        @Override // Rb.a
        public final /* synthetic */ void a(gc.e eVar) {
            e.this.d(eVar);
            e.this.f141834d.b(this.f141839a, e.this.new b());
        }

        a(gc.d dVar) {
            this.f141839a = dVar;
        }

        @Override // Rb.a
        public final void a(int i10, String str) {
            e.this.c(i10, str);
        }
    }

    final class b implements Rb.a<gc.e> {
        @Override // Rb.a
        public final /* bridge */ /* synthetic */ void a(gc.e eVar) {
            e.this.d(eVar);
        }

        b() {
        }

        @Override // Rb.a
        public final void a(int i10, String str) {
            e.this.c(i10, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void c(int i10, String str) {
        C16010a c16010a = this.f141836f;
        if (c16010a.f153228a && c16010a.f153229b) {
            C16010a.f153227d.d("Sighted unknown Gimbal beacon", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(gc.e eVar) {
        try {
            C15397c c15397c = new C15397c();
            c15397c.k(eVar.g());
            c15397c.v(eVar.b());
            c15397c.q(eVar.d());
            c15397c.r(eVar.e());
            c15397c.j(a.EnumC0807a.GIMBAL);
            c15397c.i(Integer.valueOf(eVar.h().a()));
            c15397c.t(Integer.valueOf(eVar.h().k()));
            ArrayList arrayList = new ArrayList();
            for (g gVar : eVar.f()) {
                C15396b c15396b = new C15396b();
                c15396b.k(gVar.e());
                c15396b.o(gVar.g());
                c15396b.n(gVar.f());
                gVar.b();
                arrayList.add(c15396b);
            }
            c15397c.s(arrayList);
            eVar.h().g();
            c15397c.c();
            c15397c.getName();
            if (eVar.c() != null && !eVar.c().isEmpty()) {
                e(eVar, c15397c);
                String strA = cc.c.a(eVar.c().get(0));
                C14713a c14713aB = this.f141832b.f61689a.b(strA, C14713a.class);
                C14713a c14713aH = eVar.h();
                if (c14713aB != null) {
                    c14713aH.g();
                    this.f141832b.f61689a.a(strA);
                    List<g> listF = eVar.f();
                    if (listF != null) {
                        eVar.d();
                        listF.size();
                        try {
                            this.f141835e.x(eVar.g(), listF);
                        } catch (Exception e10) {
                            f141830j.g("Unable to update places", e10);
                        }
                    }
                    byte[] bArrB = this.f141837g.b(strA);
                    if (bArrB != null) {
                        this.f141838h.a(c14713aB, bArrB);
                        c15397c.i(Integer.valueOf(c14713aB.a()));
                        c15397c.t(Integer.valueOf(c14713aB.k()));
                    }
                    this.f141831a.b(c14713aB, c15397c);
                    return;
                }
                c14713aH.g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // kc.d
    public final boolean a(C14713a c14713a, String str) {
        if (this.f141832b.a(c14713a).booleanValue()) {
            return false;
        }
        c14713a.g();
        this.f141832b.b(c14713a);
        gc.d dVar = new gc.d();
        dVar.c(c14713a.g());
        dVar.d(str);
        dVar.e(c14713a);
        this.f141834d.c(dVar, new a(dVar));
        return true;
    }

    public e(l lVar, C6384a c6384a, cc.e eVar, InterfaceC13640a interfaceC13640a, Db.d dVar, C16010a c16010a, cc.d dVar2) {
        this.f141832b = eVar;
        this.f141833c = c6384a;
        this.f141831a = lVar;
        this.f141834d = interfaceC13640a;
        this.f141835e = dVar;
        this.f141836f = c16010a;
        this.f141837g = dVar2;
    }

    private void e(gc.e eVar, C15397c c15397c) {
        int size = eVar.c().size();
        int size2 = eVar.a().size();
        for (int i10 = 0; i10 < size; i10++) {
            String strA = cc.c.a(eVar.c().get(i10));
            if (size2 > i10) {
                String str = eVar.a().get(i10);
                cc.d dVar = this.f141837g;
                dVar.f61687a.a(cc.c.a(strA), str);
            }
            C6384a c6384a = this.f141833c;
            cc.b bVarA = cc.b.a();
            String strC = c15397c.c();
            bVarA.f61684a.a(cc.b.b(strA), strC);
            c6384a.f61682a.a(c15397c.c(), c15397c);
        }
    }
}
