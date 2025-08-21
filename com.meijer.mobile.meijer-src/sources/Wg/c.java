package Wg;

import com.google.zxing.NotFoundException;
import com.google.zxing.o;

/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Ig.b f41030a;

    /* renamed from: b, reason: collision with root package name */
    private final o f41031b;

    /* renamed from: c, reason: collision with root package name */
    private final o f41032c;

    /* renamed from: d, reason: collision with root package name */
    private final o f41033d;

    /* renamed from: e, reason: collision with root package name */
    private final o f41034e;

    /* renamed from: f, reason: collision with root package name */
    private final int f41035f;

    /* renamed from: g, reason: collision with root package name */
    private final int f41036g;

    /* renamed from: h, reason: collision with root package name */
    private final int f41037h;

    /* renamed from: i, reason: collision with root package name */
    private final int f41038i;

    c(Ig.b bVar, o oVar, o oVar2, o oVar3, o oVar4) throws NotFoundException {
        boolean z10 = oVar == null || oVar2 == null;
        boolean z11 = oVar3 == null || oVar4 == null;
        if (z10 && z11) {
            throw NotFoundException.a();
        }
        if (z10) {
            oVar = new o(0.0f, oVar3.d());
            oVar2 = new o(0.0f, oVar4.d());
        } else if (z11) {
            oVar3 = new o(bVar.m() - 1, oVar.d());
            oVar4 = new o(bVar.m() - 1, oVar2.d());
        }
        this.f41030a = bVar;
        this.f41031b = oVar;
        this.f41032c = oVar2;
        this.f41033d = oVar3;
        this.f41034e = oVar4;
        this.f41035f = (int) Math.min(oVar.c(), oVar2.c());
        this.f41036g = (int) Math.max(oVar3.c(), oVar4.c());
        this.f41037h = (int) Math.min(oVar.d(), oVar3.d());
        this.f41038i = (int) Math.max(oVar2.d(), oVar4.d());
    }

    static c j(c cVar, c cVar2) throws NotFoundException {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f41030a, cVar.f41031b, cVar.f41032c, cVar2.f41033d, cVar2.f41034e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    Wg.c a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.o r0 = r12.f41031b
            com.google.zxing.o r1 = r12.f41032c
            com.google.zxing.o r2 = r12.f41033d
            com.google.zxing.o r3 = r12.f41034e
            if (r13 <= 0) goto L2a
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            com.google.zxing.o r13 = new com.google.zxing.o
            float r4 = r4.c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L27
            r8 = r13
        L25:
            r10 = r2
            goto L2c
        L27:
            r10 = r13
            r8 = r0
            goto L2c
        L2a:
            r8 = r0
            goto L25
        L2c:
            if (r14 <= 0) goto L5d
            if (r15 == 0) goto L33
            com.google.zxing.o r13 = r12.f41032c
            goto L35
        L33:
            com.google.zxing.o r13 = r12.f41034e
        L35:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            Ig.b r14 = r12.f41030a
            int r14 = r14.j()
            if (r0 < r14) goto L4b
            Ig.b r14 = r12.f41030a
            int r14 = r14.j()
            int r0 = r14 + (-1)
        L4b:
            com.google.zxing.o r14 = new com.google.zxing.o
            float r13 = r13.c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L5a
            r9 = r14
        L58:
            r11 = r3
            goto L5f
        L5a:
            r11 = r14
            r9 = r1
            goto L5f
        L5d:
            r9 = r1
            goto L58
        L5f:
            Wg.c r6 = new Wg.c
            Ig.b r7 = r12.f41030a
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Wg.c.a(int, int, boolean):Wg.c");
    }

    o b() {
        return this.f41032c;
    }

    o c() {
        return this.f41034e;
    }

    int d() {
        return this.f41036g;
    }

    int e() {
        return this.f41038i;
    }

    int f() {
        return this.f41035f;
    }

    int g() {
        return this.f41037h;
    }

    o h() {
        return this.f41031b;
    }

    o i() {
        return this.f41033d;
    }

    c(c cVar) {
        this.f41030a = cVar.f41030a;
        this.f41031b = cVar.f41031b;
        this.f41032c = cVar.f41032c;
        this.f41033d = cVar.f41033d;
        this.f41034e = cVar.f41034e;
        this.f41035f = cVar.f41035f;
        this.f41036g = cVar.f41036g;
        this.f41037h = cVar.f41037h;
        this.f41038i = cVar.f41038i;
    }
}
