package x3;

import d3.C13466a;
import x3.J;

/* loaded from: classes.dex */
public final class E implements J {

    /* renamed from: a, reason: collision with root package name */
    private final d3.s f169060a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.s f169061b;

    /* renamed from: c, reason: collision with root package name */
    private long f169062c;

    public void a(long j10, long j11) {
        if (this.f169061b.d() == 0 && j10 > 0) {
            this.f169060a.a(0L);
            this.f169061b.a(0L);
        }
        this.f169060a.a(j11);
        this.f169061b.a(j10);
    }

    public boolean b(long j10, long j11) {
        if (this.f169061b.d() == 0) {
            return false;
        }
        d3.s sVar = this.f169061b;
        return j10 - sVar.c(sVar.d() - 1) < j11;
    }

    public void c(long j10) {
        this.f169062c = j10;
    }

    @Override // x3.J
    public J.a d(long j10) {
        if (this.f169061b.d() == 0) {
            return new J.a(K.f169082c);
        }
        int iE = d3.P.e(this.f169061b, j10, true, true);
        K k10 = new K(this.f169061b.c(iE), this.f169060a.c(iE));
        if (k10.f169083a == j10 || iE == this.f169061b.d() - 1) {
            return new J.a(k10);
        }
        int i10 = iE + 1;
        return new J.a(k10, new K(this.f169061b.c(i10), this.f169060a.c(i10)));
    }

    @Override // x3.J
    public boolean g() {
        return this.f169061b.d() > 0;
    }

    public long h(long j10) {
        if (this.f169061b.d() == 0) {
            return -9223372036854775807L;
        }
        return this.f169061b.c(d3.P.e(this.f169060a, j10, true, true));
    }

    @Override // x3.J
    public long l() {
        return this.f169062c;
    }

    public E(long[] jArr, long[] jArr2, long j10) {
        boolean z10;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        int length = jArr2.length;
        if (length > 0 && jArr2[0] > 0) {
            int i10 = length + 1;
            d3.s sVar = new d3.s(i10);
            this.f169060a = sVar;
            d3.s sVar2 = new d3.s(i10);
            this.f169061b = sVar2;
            sVar.a(0L);
            sVar2.a(0L);
        } else {
            this.f169060a = new d3.s(length);
            this.f169061b = new d3.s(length);
        }
        this.f169060a.b(jArr);
        this.f169061b.b(jArr2);
        this.f169062c = j10;
    }
}
