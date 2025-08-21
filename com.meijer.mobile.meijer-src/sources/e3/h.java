package e3;

import d3.C13599a;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f129509a;

    /* renamed from: b, reason: collision with root package name */
    private int f129510b;

    /* renamed from: c, reason: collision with root package name */
    private int f129511c;

    /* renamed from: d, reason: collision with root package name */
    private int f129512d;

    private int g() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? f(i10) : 0);
    }

    private boolean k(int i10) {
        if (2 > i10 || i10 >= this.f129510b) {
            return false;
        }
        byte[] bArr = this.f129509a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    private void a() {
        int i10;
        int i11 = this.f129511c;
        C13599a.g(i11 >= 0 && (i11 < (i10 = this.f129510b) || (i11 == i10 && this.f129512d == 0)));
    }

    public void b() {
        int i10 = this.f129512d;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f129511c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f129512d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f129510b) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f129510b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f129511c;
        int i11 = this.f129512d;
        int i12 = 0;
        while (this.f129511c < this.f129510b && !e()) {
            i12++;
        }
        boolean z10 = this.f129511c == this.f129510b;
        this.f129511c = i10;
        this.f129512d = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.f129509a[this.f129511c] & (128 >> this.f129512d)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        this.f129512d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f129512d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f129512d = i13;
            byte[] bArr = this.f129509a;
            int i14 = this.f129511c;
            i12 |= (bArr[i14] & 255) << i13;
            if (!k(i14 + 1)) {
                i = 1;
            }
            this.f129511c = i14 + i;
        }
        byte[] bArr2 = this.f129509a;
        int i15 = this.f129511c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f129512d = 0;
            this.f129511c = i15 + (k(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f129509a = bArr;
        this.f129511c = i10;
        this.f129510b = i11;
        this.f129512d = 0;
        a();
    }

    public void l() {
        int i10 = this.f129512d + 1;
        this.f129512d = i10;
        if (i10 == 8) {
            this.f129512d = 0;
            int i11 = this.f129511c;
            this.f129511c = i11 + (k(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f129511c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f129511c = i13;
        int i14 = this.f129512d + (i10 - (i12 * 8));
        this.f129512d = i14;
        if (i14 > 7) {
            this.f129511c = i13 + 1;
            this.f129512d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f129511c) {
                a();
                return;
            } else if (k(i11)) {
                this.f129511c++;
                i11 += 2;
            }
        }
    }

    public h(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    public int h() {
        int i10;
        int iG = g();
        if (iG % 2 == 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return i10 * ((iG + 1) / 2);
    }

    public int i() {
        return g();
    }
}
