package bh;

import com.google.zxing.FormatException;

/* renamed from: bh.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6387a {

    /* renamed from: a, reason: collision with root package name */
    private final Ig.b f60371a;

    /* renamed from: b, reason: collision with root package name */
    private j f60372b;

    /* renamed from: c, reason: collision with root package name */
    private g f60373c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f60374d;

    void b() {
        int i10 = 0;
        while (i10 < this.f60371a.m()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f60371a.j(); i12++) {
                if (this.f60371a.f(i10, i12) != this.f60371a.f(i12, i10)) {
                    this.f60371a.e(i12, i10);
                    this.f60371a.e(i10, i12);
                }
            }
            i10 = i11;
        }
    }

    void g(boolean z10) {
        this.f60372b = null;
        this.f60373c = null;
        this.f60374d = z10;
    }

    private int a(int i10, int i11, int i12) {
        return this.f60374d ? this.f60371a.f(i11, i10) : this.f60371a.f(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    byte[] c() throws FormatException {
        g gVarD = d();
        j jVarE = e();
        EnumC6389c enumC6389c = EnumC6389c.values()[gVarD.c()];
        int iJ = this.f60371a.j();
        enumC6389c.b(this.f60371a, iJ);
        Ig.b bVarA = jVarE.a();
        byte[] bArr = new byte[jVarE.h()];
        int i10 = iJ - 1;
        boolean z10 = true;
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i11 > 0) {
            if (i11 == 6) {
                i11--;
            }
            for (int i15 = 0; i15 < iJ; i15++) {
                int i16 = z10 ? i10 - i15 : i15;
                for (int i17 = 0; i17 < 2; i17++) {
                    int i18 = i11 - i17;
                    if (!bVarA.f(i18, i16)) {
                        i13++;
                        i14 <<= 1;
                        if (this.f60371a.f(i18, i16)) {
                            i14 |= 1;
                        }
                        if (i13 == 8) {
                            bArr[i12] = (byte) i14;
                            i12++;
                            i13 = 0;
                            i14 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i11 -= 2;
        }
        if (i12 == jVarE.h()) {
            return bArr;
        }
        throw FormatException.a();
    }

    g d() throws FormatException {
        g gVar = this.f60373c;
        if (gVar != null) {
            return gVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            iA2 = a(i10, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i11 = 5; i11 >= 0; i11--) {
            iA3 = a(8, i11, iA3);
        }
        int iJ = this.f60371a.j();
        int i12 = iJ - 7;
        for (int i13 = iJ - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = iJ - 8; i14 < iJ; i14++) {
            iA = a(i14, 8, iA);
        }
        g gVarA = g.a(iA3, iA);
        this.f60373c = gVarA;
        if (gVarA != null) {
            return gVarA;
        }
        throw FormatException.a();
    }

    j e() throws FormatException {
        j jVar = this.f60372b;
        if (jVar != null) {
            return jVar;
        }
        int iJ = this.f60371a.j();
        int i10 = (iJ - 17) / 4;
        if (i10 <= 6) {
            return j.i(i10);
        }
        int i11 = iJ - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = iJ - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        j jVarC = j.c(iA2);
        if (jVarC != null && jVarC.e() == iJ) {
            this.f60372b = jVarC;
            return jVarC;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = iJ - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        j jVarC2 = j.c(iA);
        if (jVarC2 == null || jVarC2.e() != iJ) {
            throw FormatException.a();
        }
        this.f60372b = jVarC2;
        return jVarC2;
    }

    void f() {
        if (this.f60373c == null) {
            return;
        }
        EnumC6389c.values()[this.f60373c.c()].b(this.f60371a, this.f60371a.j());
    }

    C6387a(Ig.b bVar) throws FormatException {
        int iJ = bVar.j();
        if (iJ >= 21 && (iJ & 3) == 1) {
            this.f60371a = bVar;
            return;
        }
        throw FormatException.a();
    }
}
