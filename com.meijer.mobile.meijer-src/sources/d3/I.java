package d3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class I<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f127878a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f127879b;

    /* renamed from: c, reason: collision with root package name */
    private int f127880c;

    /* renamed from: d, reason: collision with root package name */
    private int f127881d;

    public I() {
        this(10);
    }

    private V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f127881d > 0) {
            long j12 = j10 - this.f127878a[this.f127880c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            vK = k();
            j11 = j12;
        }
        return vK;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f127880c = 0;
        this.f127881d = 0;
        Arrays.fill(this.f127879b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f127881d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f127881d;
    }

    public I(int i10) {
        this.f127878a = new long[i10];
        this.f127879b = (V[]) f(i10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f127880c;
        int i11 = this.f127881d;
        V[] vArr = this.f127879b;
        int length = (i10 + i11) % vArr.length;
        this.f127878a[length] = j10;
        vArr[length] = v10;
        this.f127881d = i11 + 1;
    }

    private void d(long j10) {
        if (this.f127881d > 0) {
            if (j10 <= this.f127878a[((this.f127880c + r0) - 1) % this.f127879b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f127879b.length;
        if (this.f127881d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f127880c;
        int i12 = length - i11;
        System.arraycopy(this.f127878a, i11, jArr, 0, i12);
        System.arraycopy(this.f127879b, this.f127880c, vArr, 0, i12);
        int i13 = this.f127880c;
        if (i13 > 0) {
            System.arraycopy(this.f127878a, 0, jArr, i12, i13);
            System.arraycopy(this.f127879b, 0, vArr, i12, this.f127880c);
        }
        this.f127878a = jArr;
        this.f127879b = vArr;
        this.f127880c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V k() {
        C13599a.g(this.f127881d > 0);
        V[] vArr = this.f127879b;
        int i10 = this.f127880c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f127880c = (i10 + 1) % vArr.length;
        this.f127881d--;
        return v10;
    }
}
