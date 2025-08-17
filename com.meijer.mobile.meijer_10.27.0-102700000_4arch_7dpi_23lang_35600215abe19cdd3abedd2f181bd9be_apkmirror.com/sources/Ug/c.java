package Ug;

import com.google.zxing.NotFoundException;
import com.google.zxing.o;

/* loaded from: classes7.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Gg.b f36005a;

    /* renamed from: b, reason: collision with root package name */
    private final o f36006b;

    /* renamed from: c, reason: collision with root package name */
    private final o f36007c;

    /* renamed from: d, reason: collision with root package name */
    private final o f36008d;

    /* renamed from: e, reason: collision with root package name */
    private final o f36009e;

    /* renamed from: f, reason: collision with root package name */
    private final int f36010f;

    /* renamed from: g, reason: collision with root package name */
    private final int f36011g;

    /* renamed from: h, reason: collision with root package name */
    private final int f36012h;

    /* renamed from: i, reason: collision with root package name */
    private final int f36013i;

    c(Gg.b bVar, o oVar, o oVar2, o oVar3, o oVar4) throws NotFoundException {
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
        this.f36005a = bVar;
        this.f36006b = oVar;
        this.f36007c = oVar2;
        this.f36008d = oVar3;
        this.f36009e = oVar4;
        this.f36010f = (int) Math.min(oVar.c(), oVar2.c());
        this.f36011g = (int) Math.max(oVar3.c(), oVar4.c());
        this.f36012h = (int) Math.min(oVar.d(), oVar3.d());
        this.f36013i = (int) Math.max(oVar2.d(), oVar4.d());
    }

    static c j(c cVar, c cVar2) throws NotFoundException {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f36005a, cVar.f36006b, cVar.f36007c, cVar2.f36008d, cVar2.f36009e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    Ug.c a(int r13, int r14, boolean r15) throws com.google.zxing.NotFoundException {
        /*
            r12 = this;
            com.google.zxing.o r0 = r12.f36006b
            com.google.zxing.o r1 = r12.f36007c
            com.google.zxing.o r2 = r12.f36008d
            com.google.zxing.o r3 = r12.f36009e
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
            com.google.zxing.o r13 = r12.f36007c
            goto L35
        L33:
            com.google.zxing.o r13 = r12.f36009e
        L35:
            float r0 = r13.d()
            int r0 = (int) r0
            int r0 = r0 + r14
            Gg.b r14 = r12.f36005a
            int r14 = r14.j()
            if (r0 < r14) goto L4b
            Gg.b r14 = r12.f36005a
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
            Ug.c r6 = new Ug.c
            Gg.b r7 = r12.f36005a
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ug.c.a(int, int, boolean):Ug.c");
    }

    o b() {
        return this.f36007c;
    }

    o c() {
        return this.f36009e;
    }

    int d() {
        return this.f36011g;
    }

    int e() {
        return this.f36013i;
    }

    int f() {
        return this.f36010f;
    }

    int g() {
        return this.f36012h;
    }

    o h() {
        return this.f36006b;
    }

    o i() {
        return this.f36008d;
    }

    c(c cVar) {
        this.f36005a = cVar.f36005a;
        this.f36006b = cVar.f36006b;
        this.f36007c = cVar.f36007c;
        this.f36008d = cVar.f36008d;
        this.f36009e = cVar.f36009e;
        this.f36010f = cVar.f36010f;
        this.f36011g = cVar.f36011g;
        this.f36012h = cVar.f36012h;
        this.f36013i = cVar.f36013i;
    }
}
