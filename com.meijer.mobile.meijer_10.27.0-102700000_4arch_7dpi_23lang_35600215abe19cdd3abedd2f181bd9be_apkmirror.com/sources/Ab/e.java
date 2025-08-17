package Ab;

import Bb.k;
import Eb.f;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.List;
import kt.C15319h;
import nt.InterfaceC15945c;
import pt.InterfaceC16417c;
import tb.m;
import ut.C17321g;

/* loaded from: classes4.dex */
public class e implements k {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f180g = C6381b.a(e.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static final C6382c f181h = C6383d.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C17321g f182a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC16417c f183b;

    /* renamed from: c, reason: collision with root package name */
    public final Bb.e f184c;

    /* renamed from: d, reason: collision with root package name */
    private final Bb.b f185d;

    /* renamed from: e, reason: collision with root package name */
    private dc.d f186e;

    /* renamed from: f, reason: collision with root package name */
    private m f187f;

    final class a implements InterfaceC15945c<List<C15319h>> {
        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            e.f181h.f("Failed to update places: {}", str);
        }

        a() {
        }

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(List<C15319h> list) {
            C6380a unused = e.f180g;
        }
    }

    public final synchronized void b() {
        this.f184c.A();
        this.f184c.t(true);
        d();
    }

    public final synchronized void c() {
        this.f184c.t(false);
        d();
    }

    public final synchronized void d() {
        try {
            if (!g()) {
                C17321g c17321g = this.f182a;
                if (c17321g.f163490i) {
                    c17321g.f163490i = false;
                    c17321g.c();
                }
                if (this.f186e.f127342e.get()) {
                    dc.d dVar = this.f186e;
                    dVar.f127342e.set(false);
                    dVar.e();
                    this.f187f.f161590j.set(false);
                }
                return;
            }
            C17321g c17321g2 = this.f182a;
            if (!c17321g2.f163490i) {
                c17321g2.f163490i = true;
                c17321g2.c();
                this.f183b.k(new a());
            }
            if (this.f186e.f127342e.get()) {
                return;
            }
            dc.d dVar2 = this.f186e;
            dVar2.f127342e.set(true);
            dVar2.e();
            this.f187f.f161590j.set(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private boolean g() {
        f fVarX = this.f185d.x();
        f fVar = f.ON;
        if ((fVarX != fVar && ((fVarX != f.NOT_SET || !this.f184c.H()) && !h())) || !this.f184c.v()) {
            return false;
        }
        f fVarX2 = this.f185d.x();
        if (fVarX2 != fVar) {
            return (fVarX2 == f.NOT_SET && this.f185d.p() && this.f184c.H()) || h();
        }
        return true;
    }

    private boolean h() {
        f fVarY = this.f185d.y();
        if (fVarY != f.ON) {
            return fVarY == f.NOT_SET && this.f185d.r() && this.f184c.H();
        }
        return true;
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str)) {
            d();
            if (g()) {
                this.f184c.A();
            }
        }
    }

    public e(C17321g c17321g, InterfaceC16417c interfaceC16417c, dc.d dVar, Bb.e eVar, Bb.b bVar, m mVar) {
        this.f182a = c17321g;
        this.f183b = interfaceC16417c;
        this.f186e = dVar;
        this.f184c = eVar;
        this.f187f = mVar;
        this.f185d = bVar;
        eVar.h(this, "Registration_Properties");
        bVar.g(this, "overrideProximity");
        bVar.g(this, "overrideGeofence");
    }
}
