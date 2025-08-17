package d3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class I<V> {

    /* renamed from: a, reason: collision with root package name */
    private long[] f127076a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f127077b;

    /* renamed from: c, reason: collision with root package name */
    private int f127078c;

    /* renamed from: d, reason: collision with root package name */
    private int f127079d;

    public I() {
        this(10);
    }

    private V h(long j10, boolean z10) {
        V vK = null;
        long j11 = Long.MAX_VALUE;
        while (this.f127079d > 0) {
            long j12 = j10 - this.f127076a[this.f127078c];
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
        this.f127078c = 0;
        this.f127079d = 0;
        Arrays.fill(this.f127077b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f127079d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f127079d;
    }

    public I(int i10) {
        this.f127076a = new long[i10];
        this.f127077b = (V[]) f(i10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f127078c;
        int i11 = this.f127079d;
        V[] vArr = this.f127077b;
        int length = (i10 + i11) % vArr.length;
        this.f127076a[length] = j10;
        vArr[length] = v10;
        this.f127079d = i11 + 1;
    }

    private void d(long j10) {
        if (this.f127079d > 0) {
            if (j10 <= this.f127076a[((this.f127078c + r0) - 1) % this.f127077b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f127077b.length;
        if (this.f127079d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) f(i10);
        int i11 = this.f127078c;
        int i12 = length - i11;
        System.arraycopy(this.f127076a, i11, jArr, 0, i12);
        System.arraycopy(this.f127077b, this.f127078c, vArr, 0, i12);
        int i13 = this.f127078c;
        if (i13 > 0) {
            System.arraycopy(this.f127076a, 0, jArr, i12, i13);
            System.arraycopy(this.f127077b, 0, vArr, i12, this.f127078c);
        }
        this.f127076a = jArr;
        this.f127077b = vArr;
        this.f127078c = 0;
    }

    private static <V> V[] f(int i10) {
        return (V[]) new Object[i10];
    }

    private V k() {
        C13466a.g(this.f127079d > 0);
        V[] vArr = this.f127077b;
        int i10 = this.f127078c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f127078c = (i10 + 1) % vArr.length;
        this.f127079d--;
        return v10;
    }
}
