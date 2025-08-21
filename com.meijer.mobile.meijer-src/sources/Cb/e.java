package Cb;

import Db.k;
import Gb.f;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.List;
import kt.C15422h;
import nt.InterfaceC16021c;
import pt.InterfaceC16543c;
import ut.C17473g;
import vb.m;

/* loaded from: classes4.dex */
public class e implements k {

    /* renamed from: g, reason: collision with root package name */
    private static final C13784a f4176g = C13785b.a(e.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static final C13786c f4177h = C13787d.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C17473g f4178a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16543c f4179b;

    /* renamed from: c, reason: collision with root package name */
    public final Db.e f4180c;

    /* renamed from: d, reason: collision with root package name */
    private final Db.b f4181d;

    /* renamed from: e, reason: collision with root package name */
    private fc.d f4182e;

    /* renamed from: f, reason: collision with root package name */
    private m f4183f;

    final class a implements InterfaceC16021c<List<C15422h>> {
        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            e.f4177h.f("Failed to update places: {}", str);
        }

        a() {
        }

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(List<C15422h> list) {
            C13784a unused = e.f4176g;
        }
    }

    public final synchronized void b() {
        this.f4180c.A();
        this.f4180c.t(true);
        d();
    }

    public final synchronized void c() {
        this.f4180c.t(false);
        d();
    }

    public final synchronized void d() {
        try {
            if (!g()) {
                C17473g c17473g = this.f4178a;
                if (c17473g.f164568i) {
                    c17473g.f164568i = false;
                    c17473g.c();
                }
                if (this.f4182e.f131671e.get()) {
                    fc.d dVar = this.f4182e;
                    dVar.f131671e.set(false);
                    dVar.e();
                    this.f4183f.f165768j.set(false);
                }
                return;
            }
            C17473g c17473g2 = this.f4178a;
            if (!c17473g2.f164568i) {
                c17473g2.f164568i = true;
                c17473g2.c();
                this.f4179b.k(new a());
            }
            if (this.f4182e.f131671e.get()) {
                return;
            }
            fc.d dVar2 = this.f4182e;
            dVar2.f131671e.set(true);
            dVar2.e();
            this.f4183f.f165768j.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean g() {
        f fVarX = this.f4181d.x();
        f fVar = f.ON;
        if ((fVarX != fVar && ((fVarX != f.NOT_SET || !this.f4180c.H()) && !h())) || !this.f4180c.v()) {
            return false;
        }
        f fVarX2 = this.f4181d.x();
        if (fVarX2 != fVar) {
            return (fVarX2 == f.NOT_SET && this.f4181d.p() && this.f4180c.H()) || h();
        }
        return true;
    }

    private boolean h() {
        f fVarY = this.f4181d.y();
        if (fVarY != f.ON) {
            return fVarY == f.NOT_SET && this.f4181d.r() && this.f4180c.H();
        }
        return true;
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str)) {
            d();
            if (g()) {
                this.f4180c.A();
            }
        }
    }

    public e(C17473g c17473g, InterfaceC16543c interfaceC16543c, fc.d dVar, Db.e eVar, Db.b bVar, m mVar) {
        this.f4178a = c17473g;
        this.f4179b = interfaceC16543c;
        this.f4182e = dVar;
        this.f4180c = eVar;
        this.f4183f = mVar;
        this.f4181d = bVar;
        eVar.h(this, "Registration_Properties");
        bVar.g(this, "overrideProximity");
        bVar.g(this, "overrideGeofence");
    }
}
