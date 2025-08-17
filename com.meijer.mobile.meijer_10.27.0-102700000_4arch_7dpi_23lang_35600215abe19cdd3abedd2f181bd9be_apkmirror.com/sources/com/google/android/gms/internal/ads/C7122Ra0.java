package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ra0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7122Ra0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f69890a;

    /* renamed from: b, reason: collision with root package name */
    private int f69891b;

    /* renamed from: c, reason: collision with root package name */
    private int f69892c;

    /* renamed from: d, reason: collision with root package name */
    private int f69893d = 0;

    private final int i() {
        int i10 = 0;
        while (!h()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? a(i10) : 0);
    }

    private final boolean k(int i10) {
        if (i10 < 2 || i10 >= this.f69891b) {
            return false;
        }
        byte[] bArr = this.f69890a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }

    private final void j() {
        int i10;
        int i11 = this.f69892c;
        boolean z10 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f69891b) || (i11 == i10 && this.f69893d == 0))) {
            z10 = true;
        }
        C8086gC.f(z10);
    }

    public final int a(int i10) {
        int i11;
        this.f69893d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f69893d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f69893d = i13;
            byte[] bArr = this.f69890a;
            int i14 = this.f69892c;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != k(i14 + 1)) {
                i = 1;
            }
            this.f69892c = i14 + i;
        }
        byte[] bArr2 = this.f69890a;
        int i15 = this.f69892c;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f69893d = 0;
            this.f69892c = i15 + (true != k(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        j();
        return i18;
    }

    public final void d() {
        int i10 = this.f69893d;
        if (i10 > 0) {
            f(8 - i10);
        }
    }

    public final void e() {
        int i10 = this.f69893d + 1;
        this.f69893d = i10;
        if (i10 == 8) {
            this.f69893d = 0;
            int i11 = this.f69892c;
            this.f69892c = i11 + (true == k(i11 + 1) ? 2 : 1);
        }
        j();
    }

    public final void f(int i10) {
        int i11 = this.f69892c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f69892c = i13;
        int i14 = this.f69893d + (i10 - (i12 * 8));
        this.f69893d = i14;
        if (i14 > 7) {
            this.f69892c = i13 + 1;
            this.f69893d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f69892c) {
                j();
                return;
            } else if (k(i11)) {
                this.f69892c++;
                i11 += 2;
            }
        }
    }

    public final boolean g(int i10) {
        int i11 = this.f69892c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f69893d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f69891b) {
                break;
            }
            if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f69891b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public final boolean h() {
        int i10 = this.f69890a[this.f69892c] & (128 >> this.f69893d);
        e();
        return i10 != 0;
    }

    public C7122Ra0(byte[] bArr, int i10, int i11) {
        this.f69890a = bArr;
        this.f69892c = i10;
        this.f69891b = i11;
        j();
    }

    public final int b() {
        int i10 = i();
        int i11 = i10 % 2;
        int i12 = 1;
        int i13 = i10 + 1;
        if (i11 == 0) {
            i12 = -1;
        }
        return i12 * (i13 / 2);
    }

    public final int c() {
        return i();
    }
}
