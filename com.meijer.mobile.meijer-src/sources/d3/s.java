package d3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private int f127954a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f127955b;

    public s() {
        this(32);
    }

    public s(int i10) {
        this.f127955b = new long[i10];
    }

    public void a(long j10) {
        int i10 = this.f127954a;
        long[] jArr = this.f127955b;
        if (i10 == jArr.length) {
            this.f127955b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f127955b;
        int i11 = this.f127954a;
        this.f127954a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f127954a + jArr.length;
        long[] jArr2 = this.f127955b;
        if (length > jArr2.length) {
            this.f127955b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f127955b, this.f127954a, jArr.length);
        this.f127954a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f127954a) {
            return this.f127955b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f127954a);
    }

    public int d() {
        return this.f127954a;
    }
}
