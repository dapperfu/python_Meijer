package Cg;

import Gg.l;
import Ig.c;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.o;
import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f4148g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    private final Gg.b f4149a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4150b;

    /* renamed from: c, reason: collision with root package name */
    private int f4151c;

    /* renamed from: d, reason: collision with root package name */
    private int f4152d;

    /* renamed from: e, reason: collision with root package name */
    private int f4153e;

    /* renamed from: f, reason: collision with root package name */
    private int f4154f;

    /* renamed from: Cg.a$a, reason: collision with other inner class name */
    static final class C0074a {

        /* renamed from: a, reason: collision with root package name */
        private final int f4155a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4156b;

        int a() {
            return this.f4155a;
        }

        int b() {
            return this.f4156b;
        }

        C0074a(int i10, int i11) {
            this.f4155a = i10;
            this.f4156b = i11;
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f4157a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4158b;

        int a() {
            return this.f4157a;
        }

        int b() {
            return this.f4158b;
        }

        o c() {
            return new o(this.f4157a, this.f4158b);
        }

        public String toString() {
            return "<" + this.f4157a + ' ' + this.f4158b + '>';
        }

        b(int i10, int i11) {
            this.f4157a = i10;
            this.f4158b = i11;
        }
    }

    private static o[] d(o[] oVarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float fC = oVarArr[0].c() - oVarArr[2].c();
        float fD = oVarArr[0].d() - oVarArr[2].d();
        float fC2 = (oVarArr[0].c() + oVarArr[2].c()) / 2.0f;
        float fD2 = (oVarArr[0].d() + oVarArr[2].d()) / 2.0f;
        float f11 = fC * f10;
        float f12 = fD * f10;
        o oVar = new o(fC2 + f11, fD2 + f12);
        o oVar2 = new o(fC2 - f11, fD2 - f12);
        float fC3 = oVarArr[1].c() - oVarArr[3].c();
        float fD3 = oVarArr[1].d() - oVarArr[3].d();
        float fC4 = (oVarArr[1].c() + oVarArr[3].c()) / 2.0f;
        float fD4 = (oVarArr[1].d() + oVarArr[3].d()) / 2.0f;
        float f13 = fC3 * f10;
        float f14 = f10 * fD3;
        return new o[]{oVar, new o(fC4 + f13, fD4 + f14), oVar2, new o(fC4 - f13, fD4 - f14)};
    }

    private int e(o[] oVarArr) throws NotFoundException {
        long j10;
        long j11;
        if (!o(oVarArr[0]) || !o(oVarArr[1]) || !o(oVarArr[2]) || !o(oVarArr[3])) {
            throw NotFoundException.a();
        }
        int i10 = this.f4153e * 2;
        int[] iArr = {r(oVarArr[0], oVarArr[1], i10), r(oVarArr[1], oVarArr[2], i10), r(oVarArr[2], oVarArr[3], i10), r(oVarArr[3], oVarArr[0], i10)};
        this.f4154f = m(iArr, i10);
        long j12 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = iArr[(this.f4154f + i11) % 4];
            if (this.f4150b) {
                j10 = j12 << 7;
                j11 = (i12 >> 1) & l3.f92485d;
            } else {
                j10 = j12 << 10;
                j11 = ((i12 >> 2) & 992) + ((i12 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        C0074a c0074aH = h(j12, this.f4150b);
        int iA = c0074aH.a();
        if (this.f4150b) {
            this.f4151c = (iA >> 6) + 1;
            this.f4152d = (iA & 63) + 1;
        } else {
            this.f4151c = (iA >> 11) + 1;
            this.f4152d = (iA & 2047) + 1;
        }
        return c0074aH.b();
    }

    private o[] f(b bVar) throws NotFoundException {
        this.f4153e = 1;
        b bVar2 = bVar;
        b bVar3 = bVar2;
        b bVar4 = bVar3;
        boolean z10 = true;
        while (this.f4153e < 9) {
            b bVarJ = j(bVar, z10, 1, -1);
            b bVarJ2 = j(bVar2, z10, 1, 1);
            b bVarJ3 = j(bVar3, z10, -1, 1);
            b bVarJ4 = j(bVar4, z10, -1, -1);
            if (this.f4153e > 2) {
                double dB = (b(bVarJ4, bVarJ) * this.f4153e) / (b(bVar4, bVar) * (this.f4153e + 2));
                if (dB < 0.75d || dB > 1.25d || !p(bVarJ, bVarJ2, bVarJ3, bVarJ4)) {
                    break;
                }
            }
            z10 = !z10;
            this.f4153e++;
            bVar4 = bVarJ4;
            bVar = bVarJ;
            bVar2 = bVarJ2;
            bVar3 = bVarJ3;
        }
        int i10 = this.f4153e;
        if (i10 != 5 && i10 != 7) {
            throw NotFoundException.a();
        }
        this.f4150b = i10 == 5;
        return d(new o[]{new o(bVar.a() + 0.5f, bVar.b() - 0.5f), new o(bVar2.a() + 0.5f, bVar2.b() + 0.5f), new o(bVar3.a() - 0.5f, bVar3.b() + 0.5f), new o(bVar4.a() - 0.5f, bVar4.b() - 0.5f)}, (r0 * 2) - 3, this.f4153e * 2);
    }

    private static C0074a h(long j10, boolean z10) throws NotFoundException {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            int iA = new c(Ig.a.f13872k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return new C0074a(i14, iA);
        } catch (ReedSolomonException unused) {
            throw NotFoundException.a();
        }
    }

    private b k() {
        o oVarC;
        o oVar;
        o oVar2;
        o oVar3;
        o oVarC2;
        o oVarC3;
        o oVarC4;
        o oVarC5;
        try {
            o[] oVarArrC = new Hg.b(this.f4149a).c();
            oVar2 = oVarArrC[0];
            oVar3 = oVarArrC[1];
            oVar = oVarArrC[2];
            oVarC = oVarArrC[3];
        } catch (NotFoundException unused) {
            int iM = this.f4149a.m() / 2;
            int iJ = this.f4149a.j() / 2;
            int i10 = iM + 7;
            int i11 = iJ - 7;
            o oVarC6 = j(new b(i10, i11), false, 1, -1).c();
            int i12 = iJ + 7;
            o oVarC7 = j(new b(i10, i12), false, 1, 1).c();
            int i13 = iM - 7;
            o oVarC8 = j(new b(i13, i12), false, -1, 1).c();
            oVarC = j(new b(i13, i11), false, -1, -1).c();
            oVar = oVarC8;
            oVar2 = oVarC6;
            oVar3 = oVarC7;
        }
        int iC = Hg.a.c((((oVar2.c() + oVarC.c()) + oVar3.c()) + oVar.c()) / 4.0f);
        int iC2 = Hg.a.c((((oVar2.d() + oVarC.d()) + oVar3.d()) + oVar.d()) / 4.0f);
        try {
            o[] oVarArrC2 = new Hg.b(this.f4149a, 15, iC, iC2).c();
            oVarC2 = oVarArrC2[0];
            oVarC3 = oVarArrC2[1];
            oVarC4 = oVarArrC2[2];
            oVarC5 = oVarArrC2[3];
        } catch (NotFoundException unused2) {
            int i14 = iC + 7;
            int i15 = iC2 - 7;
            oVarC2 = j(new b(i14, i15), false, 1, -1).c();
            int i16 = iC2 + 7;
            oVarC3 = j(new b(i14, i16), false, 1, 1).c();
            int i17 = iC - 7;
            oVarC4 = j(new b(i17, i16), false, -1, 1).c();
            oVarC5 = j(new b(i17, i15), false, -1, -1).c();
        }
        return new b(Hg.a.c((((oVarC2.c() + oVarC5.c()) + oVarC3.c()) + oVarC4.c()) / 4.0f), Hg.a.c((((oVarC2.d() + oVarC5.d()) + oVarC3.d()) + oVarC4.d()) / 4.0f));
    }

    private static int m(int[] iArr, int i10) throws NotFoundException {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f4148g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw NotFoundException.a();
    }

    private int i() {
        if (this.f4150b) {
            return (this.f4151c * 4) + 11;
        }
        int i10 = this.f4151c;
        return (i10 * 4) + ((((i10 * 2) + 6) / 15) * 2) + 15;
    }

    private o[] l(o[] oVarArr) {
        return d(oVarArr, this.f4153e * 2, i());
    }

    private boolean n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f4149a.m() && i11 >= 0 && i11 < this.f4149a.j();
    }

    private boolean p(b bVar, b bVar2, b bVar3, b bVar4) {
        b bVar5 = new b(Math.max(0, bVar.a() - 3), Math.min(this.f4149a.j() - 1, bVar.b() + 3));
        b bVar6 = new b(Math.max(0, bVar2.a() - 3), Math.max(0, bVar2.b() - 3));
        b bVar7 = new b(Math.min(this.f4149a.m() - 1, bVar3.a() + 3), Math.max(0, Math.min(this.f4149a.j() - 1, bVar3.b() - 3)));
        b bVar8 = new b(Math.min(this.f4149a.m() - 1, bVar4.a() + 3), Math.min(this.f4149a.j() - 1, bVar4.b() + 3));
        int iG = g(bVar8, bVar5);
        return iG != 0 && g(bVar5, bVar6) == iG && g(bVar6, bVar7) == iG && g(bVar7, bVar8) == iG;
    }

    public a(Gg.b bVar) {
        this.f4149a = bVar;
    }

    private static float b(b bVar, b bVar2) {
        return Hg.a.b(bVar.a(), bVar.b(), bVar2.a(), bVar2.b());
    }

    private static float c(o oVar, o oVar2) {
        return Hg.a.a(oVar.c(), oVar.d(), oVar2.c(), oVar2.d());
    }

    private int g(b bVar, b bVar2) {
        float fB = b(bVar, bVar2);
        boolean z10 = false;
        if (fB == 0.0f) {
            return 0;
        }
        float fA = (bVar2.a() - bVar.a()) / fB;
        float fB2 = (bVar2.b() - bVar.b()) / fB;
        float fA2 = bVar.a();
        float fB3 = bVar.b();
        boolean zF = this.f4149a.f(bVar.a(), bVar.b());
        int iFloor = (int) Math.floor(fB);
        int i10 = 0;
        for (int i11 = 0; i11 < iFloor; i11++) {
            if (this.f4149a.f(Hg.a.c(fA2), Hg.a.c(fB3)) != zF) {
                i10++;
            }
            fA2 += fA;
            fB3 += fB2;
        }
        float f10 = i10 / fB;
        if (f10 > 0.1f && f10 < 0.9f) {
            return 0;
        }
        if (f10 <= 0.1f) {
            z10 = true;
        }
        if (z10 == zF) {
            return 1;
        }
        return -1;
    }

    private b j(b bVar, boolean z10, int i10, int i11) {
        int iA = bVar.a() + i10;
        int iB = bVar.b();
        while (true) {
            iB += i11;
            if (!n(iA, iB) || this.f4149a.f(iA, iB) != z10) {
                break;
            }
            iA += i10;
        }
        int i12 = iA - i10;
        int i13 = iB - i11;
        while (n(i12, i13) && this.f4149a.f(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (n(i14, i13) && this.f4149a.f(i14, i13) == z10) {
            i13 += i11;
        }
        return new b(i14, i13 - i11);
    }

    private boolean o(o oVar) {
        return n(Hg.a.c(oVar.c()), Hg.a.c(oVar.d()));
    }

    private Gg.b q(Gg.b bVar, o oVar, o oVar2, o oVar3, o oVar4) throws NotFoundException {
        l lVarB = l.b();
        int i10 = i();
        float f10 = i10 / 2.0f;
        int i11 = this.f4153e;
        float f11 = f10 - i11;
        float f12 = f10 + i11;
        return lVarB.c(bVar, i10, i10, f11, f11, f12, f11, f12, f12, f11, f12, oVar.c(), oVar.d(), oVar2.c(), oVar2.d(), oVar3.c(), oVar3.d(), oVar4.c(), oVar4.d());
    }

    private int r(o oVar, o oVar2, int i10) {
        float fC = c(oVar, oVar2);
        float f10 = fC / i10;
        float fC2 = oVar.c();
        float fD = oVar.d();
        float fC3 = ((oVar2.c() - oVar.c()) * f10) / fC;
        float fD2 = (f10 * (oVar2.d() - oVar.d())) / fC;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f4149a.f(Hg.a.c((f11 * fC3) + fC2), Hg.a.c((f11 * fD2) + fD))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public Ag.a a(boolean z10) throws NotFoundException {
        o[] oVarArrF = f(k());
        if (z10) {
            o oVar = oVarArrF[0];
            oVarArrF[0] = oVarArrF[2];
            oVarArrF[2] = oVar;
        }
        int iE = e(oVarArrF);
        Gg.b bVar = this.f4149a;
        int i10 = this.f4154f;
        return new Ag.a(q(bVar, oVarArrF[i10 % 4], oVarArrF[(i10 + 1) % 4], oVarArrF[(i10 + 2) % 4], oVarArrF[(i10 + 3) % 4]), l(oVarArrF), this.f4150b, this.f4152d, this.f4151c, iE);
    }
}
