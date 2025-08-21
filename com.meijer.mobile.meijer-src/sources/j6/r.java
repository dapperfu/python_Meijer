package j6;

import android.graphics.Path;
import h6.D;
import java.util.List;
import k6.AbstractC15093a;
import r6.AbstractC16860b;
import w6.C17847c;

/* loaded from: classes4.dex */
public class r implements m, AbstractC15093a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f140117b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f140118c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.o f140119d;

    /* renamed from: e, reason: collision with root package name */
    private final k6.m f140120e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f140121f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f140116a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final C14950b f140122g = new C14950b();

    private void i() {
        this.f140121f = false;
        this.f140119d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // j6.InterfaceC14951c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List<j6.InterfaceC14951c> r6, java.util.List<j6.InterfaceC14951c> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L3c
            java.lang.Object r1 = r6.get(r0)
            j6.c r1 = (j6.InterfaceC14951c) r1
            boolean r2 = r1 instanceof j6.u
            if (r2 == 0) goto L26
            r2 = r1
            j6.u r2 = (j6.u) r2
            q6.t$a r3 = r2.k()
            q6.t$a r4 = q6.t.a.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            j6.b r1 = r5.f140122g
            r1.a(r2)
            r2.f(r5)
            goto L39
        L26:
            boolean r2 = r1 instanceof j6.s
            if (r2 == 0) goto L39
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            j6.s r1 = (j6.s) r1
            r1.c(r5)
            r7.add(r1)
        L39:
            int r0 = r0 + 1
            goto L2
        L3c:
            k6.m r6 = r5.f140120e
            r6.s(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.r.b(java.util.List, java.util.List):void");
    }

    @Override // o6.f
    public <T> void f(T t10, C17847c<T> c17847c) {
        if (t10 == D.f135022P) {
            this.f140120e.o(c17847c);
        }
    }

    @Override // j6.InterfaceC14951c
    public String getName() {
        return this.f140117b;
    }

    @Override // j6.m
    public Path getPath() {
        if (this.f140121f && !this.f140120e.k()) {
            return this.f140116a;
        }
        this.f140116a.reset();
        if (this.f140118c) {
            this.f140121f = true;
            return this.f140116a;
        }
        Path pathH = this.f140120e.h();
        if (pathH == null) {
            return this.f140116a;
        }
        this.f140116a.set(pathH);
        this.f140116a.setFillType(Path.FillType.EVEN_ODD);
        this.f140122g.b(this.f140116a);
        this.f140121f = true;
        return this.f140116a;
    }

    public r(com.airbnb.lottie.o oVar, AbstractC16860b abstractC16860b, q6.r rVar) {
        this.f140117b = rVar.b();
        this.f140118c = rVar.d();
        this.f140119d = oVar;
        k6.m mVarA = rVar.c().a();
        this.f140120e = mVarA;
        abstractC16860b.j(mVarA);
        mVarA.a(this);
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
