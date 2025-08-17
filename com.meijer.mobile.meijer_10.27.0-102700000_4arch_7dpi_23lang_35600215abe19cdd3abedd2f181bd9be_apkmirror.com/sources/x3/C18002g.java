package x3;

import java.util.Arrays;
import x3.J;

/* renamed from: x3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18002g implements J {

    /* renamed from: a, reason: collision with root package name */
    public final int f169191a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f169192b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f169193c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f169194d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f169195e;

    /* renamed from: f, reason: collision with root package name */
    private final long f169196f;

    @Override // x3.J
    public boolean g() {
        return true;
    }

    public int a(long j10) {
        return d3.P.g(this.f169195e, j10, true, true);
    }

    @Override // x3.J
    public long l() {
        return this.f169196f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f169191a + ", sizes=" + Arrays.toString(this.f169192b) + ", offsets=" + Arrays.toString(this.f169193c) + ", timeUs=" + Arrays.toString(this.f169195e) + ", durationsUs=" + Arrays.toString(this.f169194d) + ")";
    }

    public C18002g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f169192b = iArr;
        this.f169193c = jArr;
        this.f169194d = jArr2;
        this.f169195e = jArr3;
        int length = iArr.length;
        this.f169191a = length;
        if (length > 0) {
            this.f169196f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f169196f = 0L;
        }
    }

    @Override // x3.J
    public J.a d(long j10) {
        int iA = a(j10);
        K k10 = new K(this.f169195e[iA], this.f169193c[iA]);
        if (k10.f169083a < j10 && iA != this.f169191a - 1) {
            int i10 = iA + 1;
            return new J.a(k10, new K(this.f169195e[i10], this.f169193c[i10]));
        }
        return new J.a(k10);
    }
}
