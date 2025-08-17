package i6;

import android.graphics.PointF;
import j6.AbstractC14861a;
import java.util.ArrayList;
import java.util.List;
import n6.C15781a;
import q6.AbstractC16472b;

/* loaded from: classes4.dex */
public class q implements s, AbstractC14861a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.o f137577a;

    /* renamed from: b, reason: collision with root package name */
    private final String f137578b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC14861a<Float, Float> f137579c;

    /* renamed from: d, reason: collision with root package name */
    private p6.o f137580d;

    @Override // i6.InterfaceC14692c
    public void b(List<InterfaceC14692c> list, List<InterfaceC14692c> list2) {
    }

    private static int d(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    @Override // j6.AbstractC14861a.b
    public void a() {
        this.f137577a.invalidateSelf();
    }

    @Override // i6.s
    public void c(AbstractC14861a.b bVar) {
        this.f137579c.a(bVar);
    }

    public AbstractC14861a<Float, Float> i() {
        return this.f137579c;
    }

    public q(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.n nVar) {
        this.f137577a = oVar;
        this.f137578b = nVar.c();
        AbstractC14861a<Float, Float> abstractC14861aA = nVar.b().a();
        this.f137579c = abstractC14861aA;
        abstractC16472b.j(abstractC14861aA);
        abstractC14861aA.a(this);
    }

    private static int h(int i10, int i11) {
        return i10 - (d(i10, i11) * i11);
    }

    private p6.o j(p6.o oVar) {
        PointF pointFC;
        PointF pointFB;
        boolean z10;
        List<C15781a> listA = oVar.a();
        boolean zD = oVar.d();
        int i10 = 0;
        for (int size = listA.size() - 1; size >= 0; size--) {
            C15781a c15781a = listA.get(size);
            C15781a c15781a2 = listA.get(h(size - 1, listA.size()));
            if (size == 0 && !zD) {
                pointFC = oVar.b();
            } else {
                pointFC = c15781a2.c();
            }
            if (size == 0 && !zD) {
                pointFB = pointFC;
            } else {
                pointFB = c15781a2.b();
            }
            PointF pointFA = c15781a.a();
            if (!oVar.d() && (size == 0 || size == listA.size() - 1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (pointFB.equals(pointFC) && pointFA.equals(pointFC) && !z10) {
                i10 += 2;
            } else {
                i10++;
            }
        }
        p6.o oVar2 = this.f137580d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new C15781a());
            }
            this.f137580d = new p6.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f137580d.e(zD);
        return this.f137580d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    @Override // i6.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p6.o f(p6.o r19) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.q.f(p6.o):p6.o");
    }
}
