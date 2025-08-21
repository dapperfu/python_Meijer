package j6;

import android.graphics.Path;
import android.graphics.PointF;
import h6.D;
import java.util.List;
import k6.AbstractC15093a;
import q6.t;
import r6.AbstractC16860b;
import w6.C17847c;

/* renamed from: j6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14954f implements m, AbstractC15093a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f140015b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f140016c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC15093a<?, PointF> f140017d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC15093a<?, PointF> f140018e;

    /* renamed from: f, reason: collision with root package name */
    private final q6.b f140019f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f140021h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f140014a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final C14950b f140020g = new C14950b();

    private void i() {
        this.f140021h = false;
        this.f140016c.invalidateSelf();
    }

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC14951c interfaceC14951c = list.get(i10);
            if (interfaceC14951c instanceof u) {
                u uVar = (u) interfaceC14951c;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f140020g.a(uVar);
                    uVar.f(this);
                }
            }
        }
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        if (t10 == D.f135033k) {
            this.f140017d.o(c17847c);
        } else if (t10 == D.f135036n) {
            this.f140018e.o(c17847c);
        }
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140015b;
    }

    @Override // j6.m
    public Path getPath() {
        if (this.f140021h) {
            return this.f140014a;
        }
        this.f140014a.reset();
        if (this.f140019f.e()) {
            this.f140021h = true;
            return this.f140014a;
        }
        PointF pointFH = this.f140017d.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f140014a.reset();
        if (this.f140019f.f()) {
            float f14 = -f11;
            this.f140014a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f140014a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f140014a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f140014a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f140014a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f140014a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f140014a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f140014a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f140014a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f140014a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFH2 = this.f140018e.h();
        this.f140014a.offset(pointFH2.x, pointFH2.y);
        this.f140014a.close();
        this.f140020g.b(this.f140014a);
        this.f140021h = true;
        return this.f140014a;
    }

    public C14954f(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.b bVar) {
        this.f140015b = bVar.b();
        this.f140016c = oVar;
        AbstractC15093a<PointF, PointF> abstractC15093aA = bVar.d().a();
        this.f140017d = abstractC15093aA;
        AbstractC15093a<PointF, PointF> abstractC15093aA2 = bVar.c().a();
        this.f140018e = abstractC15093aA2;
        this.f140019f = bVar;
        abstractC16860b.j(abstractC15093aA);
        abstractC16860b.j(abstractC15093aA2);
        abstractC15093aA.a(this);
        abstractC15093aA2.a(this);
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        i();
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        v6.l.k(eVar, i10, list, eVar2, this);
    }
}
