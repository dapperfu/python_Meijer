package R3;

import d3.C13599a;
import d3.P;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final t f31852a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31853b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f31854c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f31855d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31856e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f31857f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f31858g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31859h;

    public int a(long j10) {
        for (int iG = P.g(this.f31857f, j10, true, false); iG >= 0; iG--) {
            if ((this.f31858g[iG] & 1) != 0) {
                return iG;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iD = P.d(this.f31857f, j10, true, false); iD < this.f31857f.length; iD++) {
            if ((this.f31858g[iD] & 1) != 0) {
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
        C13599a.a(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        C13599a.a(z11);
        C13599a.a(iArr2.length == jArr2.length);
        this.f31852a = tVar;
        this.f31854c = jArr;
        this.f31855d = iArr;
        this.f31856e = i10;
        this.f31857f = jArr2;
        this.f31858g = iArr2;
        this.f31859h = j10;
        this.f31853b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }
}
