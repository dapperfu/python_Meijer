package R3;

import d3.C13466a;
import d3.P;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final t f31850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31851b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f31852c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f31853d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31854e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f31855f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f31856g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31857h;

    public int a(long j10) {
        for (int iG = P.g(this.f31855f, j10, true, false); iG >= 0; iG--) {
            if ((this.f31856g[iG] & 1) != 0) {
                return iG;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iD = P.d(this.f31855f, j10, true, false); iD < this.f31855f.length; iD++) {
            if ((this.f31856g[iD] & 1) != 0) {
                return iD;
            }
        }
        return -1;
    }

    public w(t tVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        C13466a.a(z11);
        C13466a.a(iArr2.length == jArr2.length);
        this.f31850a = tVar;
        this.f31852c = jArr;
        this.f31853d = iArr;
        this.f31854e = i10;
        this.f31855f = jArr2;
        this.f31856g = iArr2;
        this.f31857h = j10;
        this.f31851b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }
}
