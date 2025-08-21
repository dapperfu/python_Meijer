package d3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private int f127956a;

    /* renamed from: b, reason: collision with root package name */
    private int f127957b;

    /* renamed from: c, reason: collision with root package name */
    private int f127958c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f127959d;

    /* renamed from: e, reason: collision with root package name */
    private int f127960e;

    public t() {
        this(16);
    }

    public void b() {
        this.f127956a = 0;
        this.f127957b = -1;
        this.f127958c = 0;
    }

    public t(int i10) {
        C13599a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f127956a = 0;
        this.f127957b = -1;
        this.f127958c = 0;
        long[] jArr = new long[i10];
        this.f127959d = jArr;
        this.f127960e = jArr.length - 1;
    }

    private void c() {
        long[] jArr = this.f127959d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f127956a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f127959d, 0, jArr2, i11, i10);
        this.f127956a = 0;
        this.f127957b = this.f127958c - 1;
        this.f127959d = jArr2;
        this.f127960e = jArr2.length - 1;
    }

    public void a(long j10) {
        if (this.f127958c == this.f127959d.length) {
            c();
        }
        int i10 = (this.f127957b + 1) & this.f127960e;
        this.f127957b = i10;
        this.f127959d[i10] = j10;
        this.f127958c++;
    }

    public long d() {
        if (this.f127958c != 0) {
            return this.f127959d[this.f127956a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f127958c == 0;
    }

    public long f() {
        int i10 = this.f127958c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f127959d;
        int i11 = this.f127956a;
        long j10 = jArr[i11];
        this.f127956a = this.f127960e & (i11 + 1);
        this.f127958c = i10 - 1;
        return j10;
    }
}
