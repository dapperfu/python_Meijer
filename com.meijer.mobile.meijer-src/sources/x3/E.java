package x3;

import d3.C13599a;
import x3.J;

/* loaded from: classes.dex */
public final class E implements J {

    /* renamed from: a, reason: collision with root package name */
    private final d3.s f170148a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.s f170149b;

    /* renamed from: c, reason: collision with root package name */
    private long f170150c;

    public void a(long j10, long j11) {
        if (this.f170149b.d() == 0 && j10 > 0) {
            this.f170148a.a(0L);
            this.f170149b.a(0L);
        }
        this.f170148a.a(j11);
        this.f170149b.a(j10);
    }

    public boolean b(long j10, long j11) {
        if (this.f170149b.d() == 0) {
            return false;
        }
        d3.s sVar = this.f170149b;
        return j10 - sVar.c(sVar.d() - 1) < j11;
    }

    public void c(long j10) {
        this.f170150c = j10;
    }

    @Override // x3.J
    public J.a d(long j10) {
        if (this.f170149b.d() == 0) {
            return new J.a(K.f170170c);
        }
        int iE = d3.P.e(this.f170149b, j10, true, true);
        K k10 = new K(this.f170149b.c(iE), this.f170148a.c(iE));
        if (k10.f170171a == j10 || iE == this.f170149b.d() - 1) {
            return new J.a(k10);
        }
        int i10 = iE + 1;
        return new J.a(k10, new K(this.f170149b.c(i10), this.f170148a.c(i10)));
    }

    @Override // x3.J
    public boolean g() {
        return this.f170149b.d() > 0;
    }

    public long h(long j10) {
        if (this.f170149b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f170149b.c(d3.P.e(this.f170148a, j10, true, true));
    }

    @Override // x3.J
    public long l() {
        return this.f170150c;
    }

    public E(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i10 = length + 1;
            d3.s sVar = new d3.s(i10);
            this.f170148a = sVar;
            d3.s sVar2 = new d3.s(i10);
            this.f170149b = sVar2;
            sVar.a(0L);
            sVar2.a(0L);
        } else {
            this.f170148a = new d3.s(length);
            this.f170149b = new d3.s(length);
        }
        this.f170148a.b(jArr);
        this.f170149b.b(jArr2);
        this.f170150c = j10;
    }
}
