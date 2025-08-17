package i6;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.medallia.digital.mobilesdk.l3;
import g6.C14209i;
import j6.AbstractC14861a;
import java.util.ArrayList;
import java.util.List;
import q6.AbstractC16472b;
import u6.C17230d;
import u6.p;
import v6.C17514c;

/* renamed from: i6.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14693d implements InterfaceC14694e, m, AbstractC14861a.b, n6.f {

    /* renamed from: a, reason: collision with root package name */
    private final p.a f137467a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f137468b;

    /* renamed from: c, reason: collision with root package name */
    private final u6.p f137469c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f137470d;

    /* renamed from: e, reason: collision with root package name */
    private final Path f137471e;

    /* renamed from: f, reason: collision with root package name */
    private final RectF f137472f;

    /* renamed from: g, reason: collision with root package name */
    private final String f137473g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f137474h;

    /* renamed from: i, reason: collision with root package name */
    private final List<InterfaceC14692c> f137475i;

    /* renamed from: j, reason: collision with root package name */
    private final com.airbnb.lottie.o f137476j;

    /* renamed from: k, reason: collision with root package name */
    private List<m> f137477k;

    /* renamed from: l, reason: collision with root package name */
    private j6.p f137478l;

    public C14693d(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.q qVar, C14209i c14209i) {
        this(oVar, abstractC16472b, qVar.c(), qVar.d(), h(oVar, c14209i, abstractC16472b, qVar.b()), j(qVar.b()));
    }

    static o6.n j(List<p6.c> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            p6.c cVar = list.get(i10);
            if (cVar instanceof o6.n) {
                return (o6.n) cVar;
            }
        }
        return null;
    }

    private boolean n() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f137475i.size(); i11++) {
            if ((this.f137475i.get(i11) instanceof InterfaceC14694e) && (i10 = i10 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static List<InterfaceC14692c> h(com.airbnb.lottie.o oVar, C14209i c14209i, AbstractC16472b abstractC16472b, List<p6.c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            InterfaceC14692c interfaceC14692cA = list.get(i10).a(oVar, c14209i, abstractC16472b);
            if (interfaceC14692cA != null) {
                arrayList.add(interfaceC14692cA);
            }
        }
        return arrayList;
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        this.f137476j.invalidateSelf();
    }

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f137475i.size());
        arrayList.addAll(list);
        for (int size = this.f137475i.size() - 1; size >= 0; size--) {
            InterfaceC14692c interfaceC14692c = this.f137475i.get(size);
            interfaceC14692c.b(arrayList, this.f137475i.subList(0, size));
            arrayList.add(interfaceC14692c);
        }
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        j6.p pVar = this.f137478l;
        if (pVar != null) {
            pVar.c(t10, c17514c);
        }
    }

    @Override // i6.InterfaceC14694e
    public void e(Canvas canvas, Matrix matrix, int i10, C17230d c17230d) {
        if (this.f137474h) {
            return;
        }
        this.f137470d.set(matrix);
        j6.p pVar = this.f137478l;
        if (pVar != null) {
            this.f137470d.preConcat(pVar.f());
            i10 = (int) (((((this.f137478l.h() == null ? 100 : this.f137478l.h().h().intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        boolean zF0 = this.f137476j.f0();
        int i11 = l3.f92484c;
        boolean z10 = (zF0 && n() && i10 != 255) || (c17230d != null && this.f137476j.g0() && n());
        if (!z10) {
            i11 = i10;
        }
        if (z10) {
            this.f137468b.set(0.0f, 0.0f, 0.0f, 0.0f);
            g(this.f137468b, matrix, true);
            p.a aVar = this.f137467a;
            aVar.f162748a = i10;
            if (c17230d != null) {
                c17230d.b(aVar);
                c17230d = null;
            } else {
                aVar.f162751d = null;
            }
            canvas = this.f137469c.j(canvas, this.f137468b, this.f137467a);
        } else if (c17230d != null) {
            C17230d c17230d2 = new C17230d(c17230d);
            c17230d2.i(i11);
            c17230d = c17230d2;
        }
        for (int size = this.f137475i.size() - 1; size >= 0; size--) {
            InterfaceC14692c interfaceC14692c = this.f137475i.get(size);
            if (interfaceC14692c instanceof InterfaceC14694e) {
                ((InterfaceC14694e) interfaceC14692c).e(canvas, this.f137470d, i11, c17230d);
            }
        }
        if (z10) {
            this.f137469c.e();
        }
    }

    @Override // i6.InterfaceC14694e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f137470d.set(matrix);
        j6.p pVar = this.f137478l;
        if (pVar != null) {
            this.f137470d.preConcat(pVar.f());
        }
        this.f137472f.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f137475i.size() - 1; size >= 0; size--) {
            InterfaceC14692c interfaceC14692c = this.f137475i.get(size);
            if (interfaceC14692c instanceof InterfaceC14694e) {
                ((InterfaceC14694e) interfaceC14692c).g(this.f137472f, this.f137470d, z10);
                rectF.union(this.f137472f);
            }
        }
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137473g;
    }

    @Override // i6.m
    public Path getPath() {
        this.f137470d.reset();
        j6.p pVar = this.f137478l;
        if (pVar != null) {
            this.f137470d.set(pVar.f());
        }
        this.f137471e.reset();
        if (this.f137474h) {
            return this.f137471e;
        }
        for (int size = this.f137475i.size() - 1; size >= 0; size--) {
            InterfaceC14692c interfaceC14692c = this.f137475i.get(size);
            if (interfaceC14692c instanceof m) {
                this.f137471e.addPath(((m) interfaceC14692c).getPath(), this.f137470d);
            }
        }
        return this.f137471e;
    }

    public List<InterfaceC14692c> k() {
        return this.f137475i;
    }

    List<m> l() {
        if (this.f137477k == null) {
            this.f137477k = new ArrayList();
            for (int i10 = 0; i10 < this.f137475i.size(); i10++) {
                InterfaceC14692c interfaceC14692c = this.f137475i.get(i10);
                if (interfaceC14692c instanceof m) {
                    this.f137477k.add((m) interfaceC14692c);
                }
            }
        }
        return this.f137477k;
    }

    Matrix m() {
        j6.p pVar = this.f137478l;
        if (pVar != null) {
            return pVar.f();
        }
        this.f137470d.reset();
        return this.f137470d;
    }

    @Override // n6.f
    public void i(n6.e eVar, int i10, List<n6.e> list, n6.e eVar2) {
        if (eVar.g(getName(), i10) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                int iE = i10 + eVar.e(getName(), i10);
                for (int i11 = 0; i11 < this.f137475i.size(); i11++) {
                    InterfaceC14692c interfaceC14692c = this.f137475i.get(i11);
                    if (interfaceC14692c instanceof n6.f) {
                        ((n6.f) interfaceC14692c).i(eVar, iE, list, eVar2);
                    }
                }
            }
        }
    }

    C14693d(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, String str, boolean z10, List<InterfaceC14692c> list, o6.n nVar) {
        this.f137467a = new p.a();
        this.f137468b = new RectF();
        this.f137469c = new u6.p();
        this.f137470d = new Matrix();
        this.f137471e = new Path();
        this.f137472f = new RectF();
        this.f137473g = str;
        this.f137476j = oVar;
        this.f137474h = z10;
        this.f137475i = list;
        if (nVar != null) {
            j6.p pVarB = nVar.b();
            this.f137478l = pVarB;
            pVarB.a(abstractC16472b);
            this.f137478l.b(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC14692c interfaceC14692c = list.get(size);
            if (interfaceC14692c instanceof InterfaceC14699j) {
                arrayList.add((InterfaceC14699j) interfaceC14692c);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC14699j) arrayList.get(size2)).h(list.listIterator(list.size()));
        }
    }
}
