package i6;

import android.graphics.Path;
import android.graphics.PointF;
import g6.D;
import j6.AbstractC14861a;
import java.util.List;
import p6.t;
import q6.AbstractC16472b;
import v6.C17514c;

/* renamed from: i6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14695f implements m, AbstractC14861a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f137480b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f137481c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC14861a<?, PointF> f137482d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC14861a<?, PointF> f137483e;

    /* renamed from: f, reason: collision with root package name */
    private final p6.b f137484f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f137486h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f137479a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final C14691b f137485g = new C14691b();

    private void h() {
        this.f137486h = false;
        this.f137481c.invalidateSelf();
    }

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC14692c interfaceC14692c = list.get(i10);
            if (interfaceC14692c instanceof u) {
                u uVar = (u) interfaceC14692c;
                if (uVar.k() == t.a.SIMULTANEOUSLY) {
                    this.f137485g.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        if (t10 == D.f132857k) {
            this.f137482d.o(c17514c);
        } else if (t10 == D.f132860n) {
            this.f137483e.o(c17514c);
        }
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137480b;
    }

    @Override // i6.m
    public Path getPath() {
        if (this.f137486h) {
            return this.f137479a;
        }
        this.f137479a.reset();
        if (this.f137484f.e()) {
            this.f137486h = true;
            return this.f137479a;
        }
        PointF pointFH = this.f137482d.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f137479a.reset();
        if (this.f137484f.f()) {
            float f14 = -f11;
            this.f137479a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f137479a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f137479a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f137479a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f137479a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f137479a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f137479a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f137479a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f137479a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f137479a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFH2 = this.f137483e.h();
        this.f137479a.offset(pointFH2.x, pointFH2.y);
        this.f137479a.close();
        this.f137485g.b(this.f137479a);
        this.f137486h = true;
        return this.f137479a;
    }

    public C14695f(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.b bVar) {
        this.f137480b = bVar.b();
        this.f137481c = oVar;
        AbstractC14861a<PointF, PointF> abstractC14861aA = bVar.d().a();
        this.f137482d = abstractC14861aA;
        AbstractC14861a<PointF, PointF> abstractC14861aA2 = bVar.c().a();
        this.f137483e = abstractC14861aA2;
        this.f137484f = bVar;
        abstractC16472b.j(abstractC14861aA);
        abstractC16472b.j(abstractC14861aA2);
        abstractC14861aA.a(this);
        abstractC14861aA2.a(this);
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        h();
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        u6.l.k(eVar, i10, list, eVar2, this);
    }
}
