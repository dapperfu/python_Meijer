package d3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private int f127152a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f127153b;

    public s() {
        this(32);
    }

    public s(int i10) {
        this.f127153b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f127152a;
        long[] jArr = this.f127153b;
        if (i10 == jArr.length) {
            this.f127153b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f127153b;
        int i11 = this.f127152a;
        this.f127152a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f127152a + jArr.length;
        long[] jArr2 = this.f127153b;
        if (length > jArr2.length) {
            this.f127153b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f127153b, this.f127152a, jArr.length);
        this.f127152a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f127152a) {
            return this.f127153b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f127152a);
    }

    public int d() {
        return this.f127152a;
    }
}
