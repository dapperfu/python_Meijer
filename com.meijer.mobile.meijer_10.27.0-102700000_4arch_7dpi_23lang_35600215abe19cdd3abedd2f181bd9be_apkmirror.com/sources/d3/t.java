package d3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private int f127154a;

    /* renamed from: b, reason: collision with root package name */
    private int f127155b;

    /* renamed from: c, reason: collision with root package name */
    private int f127156c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f127157d;

    /* renamed from: e, reason: collision with root package name */
    private int f127158e;

    public t() {
        this(16);
    }

    public void b() {
        this.f127154a = 0;
        this.f127155b = -1;
        this.f127156c = 0;
    }

    public t(int i10) {
        C13466a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f127154a = 0;
        this.f127155b = -1;
        this.f127156c = 0;
        long[] jArr = new long[i10];
        this.f127157d = jArr;
        this.f127158e = jArr.length - 1;
    }

    private void c() {
        long[] jArr = this.f127157d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i10 = this.f127154a;
        int i11 = length2 - i10;
        System.arraycopy(jArr, i10, jArr2, 0, i11);
        System.arraycopy(this.f127157d, 0, jArr2, i11, i10);
        this.f127154a = 0;
        this.f127155b = this.f127156c - 1;
        this.f127157d = jArr2;
        this.f127158e = jArr2.length - 1;
    }

    public void a(long j10) {
        if (this.f127156c == this.f127157d.length) {
            c();
        }
        int i10 = (this.f127155b + 1) & this.f127158e;
        this.f127155b = i10;
        this.f127157d[i10] = j10;
        this.f127156c++;
    }

    public long d() {
        if (this.f127156c != 0) {
            return this.f127157d[this.f127154a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.f127156c == 0;
    }

    public long f() {
        int i10 = this.f127156c;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f127157d;
        int i11 = this.f127154a;
        long j10 = jArr[i11];
        this.f127154a = this.f127158e & (i11 + 1);
        this.f127156c = i10 - 1;
        return j10;
    }
}
