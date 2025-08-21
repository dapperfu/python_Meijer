package j6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.medallia.digital.mobilesdk.l3;
import h6.C14478i;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC15093a;
import r6.AbstractC16860b;
import v6.C17643d;
import v6.p;
import w6.C17847c;

/* renamed from: j6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14952d implements InterfaceC14953e, m, AbstractC15093a.b, o6.f {

    /* renamed from: a, reason: collision with root package name */
    private final p.a f140002a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f140003b;

    /* renamed from: c, reason: collision with root package name */
    private final v6.p f140004c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f140005d;

    /* renamed from: e, reason: collision with root package name */
    private final Path f140006e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f140007f;

    /* renamed from: g, reason: collision with root package name */
    private final String f140008g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f140009h;

    /* renamed from: i, reason: collision with root package name */
    private final List<InterfaceC14951c> f140010i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.o f140011j;

    /* renamed from: k, reason: collision with root package name */
    private List<m> f140012k;

    /* renamed from: l, reason: collision with root package name */
    private k6.p f140013l;

    public C14952d(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.q qVar, C14478i c14478i) {
        this(oVar, abstractC16860b, qVar.c(), qVar.d(), i(oVar, c14478i, abstractC16860b, qVar.b()), j(qVar.b()));
    }

    static p6.n j(List<q6.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            q6.c cVar = list.get(i10);
            if (cVar instanceof p6.n) {
                return (p6.n) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f140010i.size(); i11++) {
            if ((this.f140010i.get(i11) instanceof InterfaceC14953e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<InterfaceC14951c> i(com.airbnb.lottie.o oVar, C14478i c14478i, AbstractC16860b abstractC16860b, List<q6.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC14951c interfaceC14951cA = list.get(i10).a(oVar, c14478i, abstractC16860b);
            if (interfaceC14951cA != null) {
                arrayList.add(interfaceC14951cA);
            }
        }
        return arrayList;
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        this.f140011j.invalidateSelf();
    }

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f140010i.size());
        arrayList.addAll(list);
        for (int size = this.f140010i.size() - 1; size >= 0; size--) {
            InterfaceC14951c interfaceC14951c = this.f140010i.get(size);
            interfaceC14951c.b(arrayList, this.f140010i.subList(0, size));
            arrayList.add(interfaceC14951c);
        }
    }

    @Override // j6.InterfaceC14953e
    public void e(Canvas canvas, Matrix matrix, int i10, C17643d c17643d) {
        if (this.f140009h) {
            return;
        }
        this.f140005d.set(matrix);
        k6.p pVar = this.f140013l;
        if (pVar != null) {
            this.f140005d.preConcat(pVar.f());
            i10 = (int) (((((this.f140013l.h() == null ? 100 : this.f140013l.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean zF0 = this.f140011j.f0();
        int i11 = l3.f93323c;
        boolean z10 = (zF0 && n() && i10 != 255) || (c17643d != null && this.f140011j.g0() && n());
        if (!z10) {
            i11 = i10;
        }
        if (z10) {
            this.f140003b.set(0.0f, 0.0f, 0.0f, 0.0f);
            h(this.f140003b, matrix, true);
            p.a aVar = this.f140002a;
            aVar.f165677a = i10;
            if (c17643d != null) {
                c17643d.b(aVar);
                c17643d = null;
            } else {
                aVar.f165680d = null;
            }
            canvas = this.f140004c.j(canvas, this.f140003b, this.f140002a);
        } else if (c17643d != null) {
            C17643d c17643d2 = new C17643d(c17643d);
            c17643d2.i(i11);
            c17643d = c17643d2;
        }
        for (int size = this.f140010i.size() - 1; size >= 0; size--) {
            InterfaceC14951c interfaceC14951c = this.f140010i.get(size);
            if (interfaceC14951c instanceof InterfaceC14953e) {
                ((InterfaceC14953e) interfaceC14951c).e(canvas, this.f140005d, i11, c17643d);
            }
        }
        if (z10) {
            this.f140004c.e();
        }
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        k6.p pVar = this.f140013l;
        if (pVar != null) {
            pVar.c(t10, c17847c);
        }
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140008g;
    }

    @Override // j6.m
    public Path getPath() {
        this.f140005d.reset();
        k6.p pVar = this.f140013l;
        if (pVar != null) {
            this.f140005d.set(pVar.f());
        }
        this.f140006e.reset();
        if (this.f140009h) {
            return this.f140006e;
        }
        for (int size = this.f140010i.size() - 1; size >= 0; size--) {
            InterfaceC14951c interfaceC14951c = this.f140010i.get(size);
            if (interfaceC14951c instanceof m) {
                this.f140006e.addPath(((m) interfaceC14951c).getPath(), this.f140005d);
            }
        }
        return this.f140006e;
    }

    @Override // j6.InterfaceC14953e
    public void h(RectF rectF, Matrix matrix, boolean z10) {
        this.f140005d.set(matrix);
        k6.p pVar = this.f140013l;
        if (pVar != null) {
            this.f140005d.preConcat(pVar.f());
        }
        this.f140007f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f140010i.size() - 1; size >= 0; size--) {
            InterfaceC14951c interfaceC14951c = this.f140010i.get(size);
            if (interfaceC14951c instanceof InterfaceC14953e) {
                ((InterfaceC14953e) interfaceC14951c).h(this.f140007f, this.f140005d, z10);
                rectF.union(this.f140007f);
            }
        }
    }

    public List<InterfaceC14951c> k() {
        return this.f140010i;
    }

    List<m> l() {
        if (this.f140012k == null) {
            this.f140012k = new ArrayList();
            for (int i10 = 0; i10 < this.f140010i.size(); i10++) {
                InterfaceC14951c interfaceC14951c = this.f140010i.get(i10);
                if (interfaceC14951c instanceof m) {
                    this.f140012k.add((m) interfaceC14951c);
                }
            }
        }
        return this.f140012k;
    }

    Matrix m() {
        k6.p pVar = this.f140013l;
        if (pVar != null) {
            return pVar.f();
        }
        this.f140005d.reset();
        return this.f140005d;
    }

    @Override // o6.f
    public void g(o6.e eVar, int i10, List<o6.e> list, o6.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f140010i.size(); i11++) {
                    InterfaceC14951c interfaceC14951c = this.f140010i.get(i11);
                    if (interfaceC14951c instanceof o6.f) {
                        ((o6.f) interfaceC14951c).g(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    C14952d(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, String str, boolean z10, List<InterfaceC14951c> list, p6.n nVar) {
        this.f140002a = new p.a();
        this.f140003b = new RectF();
        this.f140004c = new v6.p();
        this.f140005d = new Matrix();
        this.f140006e = new Path();
        this.f140007f = new RectF();
        this.f140008g = str;
        this.f140011j = oVar;
        this.f140009h = z10;
        this.f140010i = list;
        if (nVar != null) {
            k6.p pVarB = nVar.b();
            this.f140013l = pVarB;
            pVarB.a(abstractC16860b);
            this.f140013l.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC14951c interfaceC14951c = list.get(size);
            if (interfaceC14951c instanceof InterfaceC14958j) {
                arrayList.add((InterfaceC14958j) interfaceC14951c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC14958j) arrayList.get(size2)).i(list.listIterator(list.size()));
        }
    }
}
