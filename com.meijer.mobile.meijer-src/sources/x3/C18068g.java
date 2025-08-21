package x3;

import java.util.Arrays;
import x3.J;

/* renamed from: x3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18068g implements J {

    /* renamed from: a, reason: collision with root package name */
    public final int f170279a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f170280b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f170281c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f170282d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f170283e;

    /* renamed from: f, reason: collision with root package name */
    private final long f170284f;

    @Override // x3.J
    public boolean g() {
        return true;
    }

    public int a(long j10) {
        return d3.P.g(this.f170283e, j10, true, true);
    }

    @Override // x3.J
    public long l() {
        return this.f170284f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f170279a + ", sizes=" + Arrays.toString(this.f170280b) + ", offsets=" + Arrays.toString(this.f170281c) + ", timeUs=" + Arrays.toString(this.f170283e) + ", durationsUs=" + Arrays.toString(this.f170282d) + ")";
    }

    public C18068g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f170280b = iArr;
        this.f170281c = jArr;
        this.f170282d = jArr2;
        this.f170283e = jArr3;
        int length = iArr.length;
        this.f170279a = length;
        if (length > 0) {
            this.f170284f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f170284f = 0L;
        }
    }

    @Override // x3.J
    public J.a d(long j10) {
        int iA = a(j10);
        K k10 = new K(this.f170283e[iA], this.f170281c[iA]);
        if (k10.f170171a < j10 && iA != this.f170279a - 1) {
            int i10 = iA + 1;
            return new J.a(k10, new K(this.f170283e[i10], this.f170281c[i10]));
        }
        return new J.a(k10);
    }
}
