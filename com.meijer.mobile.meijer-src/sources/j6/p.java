package j6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import h6.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import k6.AbstractC15093a;
import k6.C15096d;
import r6.AbstractC16860b;
import v6.C17643d;
import w6.C17847c;

/* loaded from: classes4.dex */
public class p implements InterfaceC14953e, m, InterfaceC14958j, AbstractC15093a.b, k {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f140102a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f140103b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.o f140104c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16860b f140105d;

    /* renamed from: e, reason: collision with root package name */
    private final String f140106e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f140107f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC15093a<Float, Float> f140108g;

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC15093a<Float, Float> f140109h;

    /* renamed from: i, reason: collision with root package name */
    private final k6.p f140110i;

    /* renamed from: j, reason: collision with root package name */
    private C14952d f140111j;

    @Override // k6.AbstractC15093a.b
    public void a() {
        this.f140104c.invalidateSelf();
    }

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
        this.f140111j.b(list, list2);
    }

    @Override // j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        float fFloatValue = this.f140108g.h().floatValue();
        float fFloatValue2 = this.f140109h.h().floatValue();
        float fFloatValue3 = this.f140110i.i().h().floatValue() / 100.0f;
        float fFloatValue4 = this.f140110i.e().h().floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            this.f140102a.set(matrix);
            float f10 = i11;
            this.f140102a.preConcat(this.f140110i.g(f10 + fFloatValue2));
            this.f140111j.e(canvas, this.f140102a, (int) (i10 * v6.l.i(fFloatValue3, fFloatValue4, f10 / fFloatValue)), c17643d);
        }
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        if (this.f140110i.c(t10, c17847c)) {
            return;
        }
        if (t10 == D.f135043u) {
            this.f140108g.o(c17847c);
        } else if (t10 == D.f135044v) {
            this.f140109h.o(c17847c);
        }
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140106e;
    }

    @Override // j6.m
    public Path getPath() {
        Path path = this.f140111j.getPath();
        this.f140103b.reset();
        float fFloatValue = this.f140108g.h().floatValue();
        float fFloatValue2 = this.f140109h.h().floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            this.f140102a.set(this.f140110i.g(i10 + fFloatValue2));
            this.f140103b.addPath(path, this.f140102a);
        }
        return this.f140103b;
    }

    @Override // j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        this.f140111j.h(rectF, matrix, z10);
    }

    @Override // j6.InterfaceC14958j
    public void i(ListIterator<InterfaceC14951c> listIterator) {
        if (this.f140111j != null) {
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
        this.f140111j = new C14952d(this.f140104c, this.f140105d, "Repeater", this.f140107f, arrayList, null);
    }

    public p(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.m mVar) {
        this.f140104c = oVar;
        this.f140105d = abstractC16860b;
        this.f140106e = mVar.c();
        this.f140107f = mVar.f();
        C15096d c15096dA = mVar.b().a();
        this.f140108g = c15096dA;
        abstractC16860b.j(c15096dA);
        c15096dA.a(this);
        C15096d c15096dA2 = mVar.d().a();
        this.f140109h = c15096dA2;
        abstractC16860b.j(c15096dA2);
        c15096dA2.a(this);
        k6.p pVarB = mVar.e().b();
        this.f140110i = pVarB;
        pVarB.a(abstractC16860b);
        pVarB.b(this);
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        v6.l.k(eVar, i10, list, eVar2, this);
        for (int i11 = 0; i11 < this.f140111j.k().size(); i11++) {
            InterfaceC14951c interfaceC14951c = this.f140111j.k().get(i11);
            if (interfaceC14951c instanceof k) {
                v6.l.k(eVar, i10, list, eVar2, (k) interfaceC14951c);
            }
        }
    }
}
