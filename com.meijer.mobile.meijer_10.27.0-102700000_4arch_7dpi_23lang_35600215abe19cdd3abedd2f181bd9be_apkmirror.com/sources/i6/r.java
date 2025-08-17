package i6;

import android.graphics.Path;
import g6.D;
import j6.AbstractC14861a;
import java.util.List;
import q6.AbstractC16472b;
import v6.C17514c;

/* loaded from: classes4.dex */
public class r implements m, AbstractC14861a.b, k {

    /* renamed from: b, reason: collision with root package name */
    private final String f137582b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f137583c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.o f137584d;

    /* renamed from: e, reason: collision with root package name */
    private final j6.m f137585e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f137586f;

    /* renamed from: a, reason: collision with root package name */
    private final Path f137581a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final C14691b f137587g = new C14691b();

    private void h() {
        this.f137586f = false;
        this.f137584d.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // i6.InterfaceC14692c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.List<i6.InterfaceC14692c> r6, java.util.List<i6.InterfaceC14692c> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L3c
            java.lang.Object r1 = r6.get(r0)
            i6.c r1 = (i6.InterfaceC14692c) r1
            boolean r2 = r1 instanceof i6.u
            if (r2 == 0) goto L26
            r2 = r1
            i6.u r2 = (i6.u) r2
            p6.t$a r3 = r2.k()
            p6.t$a r4 = p6.t.a.SIMULTANEOUSLY
            if (r3 != r4) goto L26
            i6.b r1 = r5.f137587g
            r1.a(r2)
            r2.d(r5)
            goto L39
        L26:
            boolean r2 = r1 instanceof i6.s
            if (r2 == 0) goto L39
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            i6.s r1 = (i6.s) r1
            r1.c(r5)
            r7.add(r1)
        L39:
            int r0 = r0 + 1
            goto L2
        L3c:
            j6.m r6 = r5.f137585e
            r6.s(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.r.b(java.util.List, java.util.List):void");
    }

    @Override // n6.f
    public <T> void d(T t10, C17514c<T> c17514c) {
        if (t10 == D.f132846P) {
            this.f137585e.o(c17514c);
        }
    }

    @Override // i6.InterfaceC14692c
    public String getName() {
        return this.f137582b;
    }

    @Override // i6.m
    public Path getPath() {
        if (this.f137586f && !this.f137585e.k()) {
            return this.f137581a;
        }
        this.f137581a.reset();
        if (this.f137583c) {
            this.f137586f = true;
            return this.f137581a;
        }
        Path pathH = this.f137585e.h();
        if (pathH == null) {
            return this.f137581a;
        }
        this.f137581a.set(pathH);
        this.f137581a.setFillType(Path.FillType.EVEN_ODD);
        this.f137587g.b(this.f137581a);
        this.f137586f = true;
        return this.f137581a;
    }

    public r(com.airbnb.lottie.o oVar, AbstractC16472b abstractC16472b, p6.r rVar) {
        this.f137582b = rVar.b();
        this.f137583c = rVar.d();
        this.f137584d = oVar;
        j6.m mVarA = rVar.c().a();
        this.f137585e = mVarA;
        abstractC16472b.j(mVarA);
        mVarA.a(this);
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
