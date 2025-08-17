package i6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import g6.D;
import j6.AbstractC14861a;
import j6.C14864d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import q6.AbstractC16472b;
import u6.C17230d;
import v6.C17514c;

/* loaded from: classes4.dex */
public class p implements InterfaceC14694e, m, InterfaceC14699j, AbstractC14861a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f137567a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f137568b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f137569c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16472b f137570d;

    /* renamed from: e, reason: collision with root package name */
    private final String f137571e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f137572f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC14861a<Float, Float> f137573g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC14861a<Float, Float> f137574h;

    /* renamed from: i, reason: collision with root package name */
    private final j6.p f137575i;

    /* renamed from: j, reason: collision with root package name */
    private C14693d f137576j;

    @Override // j6.AbstractC14861a.b
    public void a() {
        this.f137569c.invalidateSelf();
    }

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
        this.f137576j.b(list, list2);
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        if (this.f137575i.c(t10, c17514c)) {
            return;
        }
        if (t10 == D.f132867u) {
            this.f137573g.o(c17514c);
        } else if (t10 == D.f132868v) {
            this.f137574h.o(c17514c);
        }
    }

    @Override // i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        float fFloatValue = this.f137573g.h().floatValue();
        float fFloatValue2 = this.f137574h.h().floatValue();
        float fFloatValue3 = this.f137575i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f137575i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f137567a.set(matrix);
            float f10 = i11;
            this.f137567a.preConcat(this.f137575i.g(f10 + fFloatValue2));
            this.f137576j.e(canvas, this.f137567a, (int) (i10 * u6.l.i(fFloatValue3, fFloatValue4, f10 / fFloatValue)), c17230d);
        }
    }

    @Override // i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f137576j.g(rectF, matrix, z10);
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137571e;
    }

    @Override // i6.m
    public Path getPath() {
        Path path = this.f137576j.getPath();
        this.f137568b.reset();
        float fFloatValue = this.f137573g.h().floatValue();
        float fFloatValue2 = this.f137574h.h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f137567a.set(this.f137575i.g(i10 + fFloatValue2));
            this.f137568b.addPath(path, this.f137567a);
        }
        return this.f137568b;
    }

    @Override // i6.InterfaceC14699j
    public void h(ListIterator<InterfaceC14692c> listIterator) {
        if (this.f137576j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f137576j = new C14693d(this.f137569c, this.f137570d, "Repeater", this.f137572f, arrayList, null);
    }

    public p(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.m mVar) {
        this.f137569c = oVar;
        this.f137570d = abstractC16472b;
        this.f137571e = mVar.c();
        this.f137572f = mVar.f();
        C14864d c14864dA = mVar.b().a();
        this.f137573g = c14864dA;
        abstractC16472b.j(c14864dA);
        c14864dA.a(this);
        C14864d c14864dA2 = mVar.d().a();
        this.f137574h = c14864dA2;
        abstractC16472b.j(c14864dA2);
        c14864dA2.a(this);
        j6.p pVarB = mVar.e().b();
        this.f137575i = pVarB;
        pVarB.a(abstractC16472b);
        pVarB.b(this);
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        u6.l.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f137576j.k().size(); i11++) {
            InterfaceC14692c interfaceC14692c = this.f137576j.k().get(i11);
            if (interfaceC14692c instanceof k) {
                u6.l.k(eVar, i10, list, eVar2, (k) interfaceC14692c);
            }
        }
    }
}
