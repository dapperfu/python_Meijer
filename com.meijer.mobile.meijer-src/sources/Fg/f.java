package Fg;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class f {

    /* renamed from: f, reason: collision with root package name */
    static final f f10472f = new f(g.f10478b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f10473a;

    /* renamed from: b, reason: collision with root package name */
    private final g f10474b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10475c;

    /* renamed from: d, reason: collision with root package name */
    private final int f10476d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10477e;

    f b(int i10) {
        g gVarA;
        g gVar = j(4, 0).f10474b;
        int length = 3;
        if (i10 < 0) {
            gVarA = gVar.a(0, 3);
        } else {
            if (i10 > 999999) {
                throw new IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] bytes = Integer.toString(i10).getBytes(StandardCharsets.ISO_8859_1);
            g gVarA2 = gVar.a(bytes.length, 3);
            for (byte b10 : bytes) {
                gVarA2 = gVarA2.a(b10 - 46, 4);
            }
            length = 3 + (bytes.length * 4);
            gVarA = gVarA2;
        }
        return new f(gVarA, this.f10473a, 0, this.f10476d + length);
    }

    private static int c(int i10) {
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    f a(int i10) {
        g gVarA = this.f10474b;
        int i11 = this.f10473a;
        int i12 = this.f10476d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f10464d[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVarA = gVarA.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f10475c;
        f fVar = new f(gVarA, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f10475c == 2078 ? fVar.d(i10 + 1) : fVar;
    }

    f d(int i10) {
        int i11 = this.f10475c;
        return i11 == 0 ? this : new f(this.f10474b.b(i10 - i11, i11), this.f10473a, 0, this.f10476d);
    }

    int e() {
        return this.f10475c;
    }

    int f() {
        return this.f10476d;
    }

    int g() {
        return this.f10473a;
    }

    boolean h(f fVar) {
        int i10 = this.f10476d + (d.f10464d[this.f10473a][fVar.f10473a] >> 16);
        int i11 = this.f10475c;
        int i12 = fVar.f10475c;
        if (i11 < i12) {
            i10 += fVar.f10477e - this.f10477e;
        } else if (i11 > i12 && i12 > 0) {
            i10 += 10;
        }
        return i10 <= fVar.f10476d;
    }

    f i(int i10, int i11) {
        int i12 = this.f10476d;
        g gVarA = this.f10474b;
        int i13 = this.f10473a;
        if (i10 != i13) {
            int i14 = d.f10464d[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVarA = gVarA.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVarA.a(i11, i17), i10, 0, i12 + i17);
    }

    f j(int i10, int i11) {
        g gVar = this.f10474b;
        int i12 = this.f10473a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f10466f[i12][i10], i13).a(i11, 5), this.f10473a, 0, this.f10476d + i13 + 5);
    }

    Ig.a k(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (g gVarD = d(bArr.length).f10474b; gVarD != null; gVarD = gVarD.d()) {
            arrayList.add(gVarD);
        }
        Ig.a aVar = new Ig.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g) arrayList.get(size)).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f10463c[this.f10473a], Integer.valueOf(this.f10476d), Integer.valueOf(this.f10475c));
    }

    private f(g gVar, int i10, int i11, int i12) {
        this.f10474b = gVar;
        this.f10473a = i10;
        this.f10475c = i11;
        this.f10476d = i12;
        this.f10477e = c(i11);
    }
}
