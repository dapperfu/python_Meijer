package j6;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import k6.AbstractC15093a;
import o6.C16075a;
import r6.AbstractC16860b;

/* loaded from: classes4.dex */
public class q implements s, AbstractC15093a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.airbnb.lottie.o f140112a;

    /* renamed from: b, reason: collision with root package name */
    private final String f140113b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC15093a<Float, Float> f140114c;

    /* renamed from: d, reason: collision with root package name */
    private q6.o f140115d;

    @Override // j6.InterfaceC14951c
    public void b(List<InterfaceC14951c> list, List<InterfaceC14951c> list2) {
    }

    private static int f(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    @Override // k6.AbstractC15093a.b
    public void a() {
        this.f140112a.invalidateSelf();
    }

    @Override // j6.s
    public void c(AbstractC15093a.b bVar) {
        this.f140114c.a(bVar);
    }

    public AbstractC15093a<Float, Float> i() {
        return this.f140114c;
    }

    public q(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.n nVar) {
        this.f140112a = oVar;
        this.f140113b = nVar.c();
        AbstractC15093a<Float, Float> abstractC15093aA = nVar.b().a();
        this.f140114c = abstractC15093aA;
        abstractC16860b.j(abstractC15093aA);
        abstractC15093aA.a(this);
    }

    private static int g(int i10, int i11) {
        return i10 - (f(i10, i11) * i11);
    }

    private q6.o j(q6.o oVar) {
        PointF pointFC;
        PointF pointFB;
        boolean z10;
        List<C16075a> listA = oVar.a();
        boolean zD = oVar.d();
        int i10 = 0;
        for (int size = listA.size() - 1; size >= 0; size--) {
            C16075a c16075a = listA.get(size);
            C16075a c16075a2 = listA.get(g(size - 1, listA.size()));
            if (size == 0 && !zD) {
                pointFC = oVar.b();
            } else {
                pointFC = c16075a2.c();
            }
            if (size == 0 && !zD) {
                pointFB = pointFC;
            } else {
                pointFB = c16075a2.b();
            }
            PointF pointFA = c16075a.a();
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
        q6.o oVar2 = this.f140115d;
        if (oVar2 == null || oVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new C16075a());
            }
            this.f140115d = new q6.o(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f140115d.e(zD);
        return this.f140115d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    @Override // j6.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q6.o d(q6.o r19) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.q.d(q6.o):q6.o");
    }
}
