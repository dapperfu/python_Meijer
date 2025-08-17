package S3;

import d3.C13466a;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import x3.C18013s;
import x3.InterfaceC18012q;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final f f33152a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33153b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33154c;

    /* renamed from: d, reason: collision with root package name */
    private final i f33155d;

    /* renamed from: e, reason: collision with root package name */
    private int f33156e;

    /* renamed from: f, reason: collision with root package name */
    private long f33157f;

    /* renamed from: g, reason: collision with root package name */
    private long f33158g;

    /* renamed from: h, reason: collision with root package name */
    private long f33159h;

    /* renamed from: i, reason: collision with root package name */
    private long f33160i;

    /* renamed from: j, reason: collision with root package name */
    private long f33161j;

    /* renamed from: k, reason: collision with root package name */
    private long f33162k;

    /* renamed from: l, reason: collision with root package name */
    private long f33163l;

    private final class b implements J {
        private b() {
        }

        @Override // x3.J
        public boolean g() {
            return true;
        }

        @Override // x3.J
        public J.a d(long j10) {
            return new J.a(new K(j10, P.p((a.this.f33153b + BigInteger.valueOf(a.this.f33155d.c(j10)).multiply(BigInteger.valueOf(a.this.f33154c - a.this.f33153b)).divide(BigInteger.valueOf(a.this.f33157f)).longValue()) - 30000, a.this.f33153b, a.this.f33154c - 1)));
        }

        @Override // x3.J
        public long l() {
            return a.this.f33155d.b(a.this.f33157f);
        }
    }

    private long i(InterfaceC18012q interfaceC18012q) throws IOException {
        if (this.f33160i == this.f33161j) {
            return -1L;
        }
        long position = interfaceC18012q.getPosition();
        if (!this.f33152a.d(interfaceC18012q, this.f33161j)) {
            long j10 = this.f33160i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f33152a.a(interfaceC18012q, false);
        interfaceC18012q.d();
        long j11 = this.f33159h;
        f fVar = this.f33152a;
        long j12 = fVar.f33182c;
        long j13 = j11 - j12;
        int i10 = fVar.f33187h + fVar.f33188i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f33161j = position;
            this.f33163l = j12;
        } else {
            this.f33160i = interfaceC18012q.getPosition() + i10;
            this.f33162k = this.f33152a.f33182c;
        }
        long j14 = this.f33161j;
        long j15 = this.f33160i;
        if (j14 - j15 < 100000) {
            this.f33161j = j15;
            return j15;
        }
        long position2 = interfaceC18012q.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f33161j;
        long j17 = this.f33160i;
        return P.p(position2 + ((j13 * (j16 - j17)) / (this.f33163l - this.f33162k)), j17, j16 - 1);
    }

    private void k(InterfaceC18012q interfaceC18012q) throws IOException {
        while (true) {
            this.f33152a.c(interfaceC18012q);
            this.f33152a.a(interfaceC18012q, false);
            f fVar = this.f33152a;
            if (fVar.f33182c > this.f33159h) {
                interfaceC18012q.d();
                return;
            } else {
                interfaceC18012q.k(fVar.f33187h + fVar.f33188i);
                this.f33160i = interfaceC18012q.getPosition();
                this.f33162k = this.f33152a.f33182c;
            }
        }
    }

    @Override // S3.g
    public long a(InterfaceC18012q interfaceC18012q) throws IOException {
        int i10 = this.f33156e;
        if (i10 == 0) {
            long position = interfaceC18012q.getPosition();
            this.f33158g = position;
            this.f33156e = 1;
            long j10 = this.f33154c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(interfaceC18012q);
                if (jI != -1) {
                    return jI;
                }
                this.f33156e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC18012q);
            this.f33156e = 4;
            return -(this.f33162k + 2);
        }
        this.f33157f = j(interfaceC18012q);
        this.f33156e = 4;
        return this.f33158g;
    }

    @Override // S3.g
    public void c(long j10) {
        this.f33159h = P.p(j10, 0L, this.f33157f - 1);
        this.f33156e = 2;
        this.f33160i = this.f33153b;
        this.f33161j = this.f33154c;
        this.f33162k = 0L;
        this.f33163l = this.f33157f;
    }

    @Override // S3.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f33157f != 0) {
            return new b();
        }
        return null;
    }

    long j(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f33152a.b();
        if (!this.f33152a.c(interfaceC18012q)) {
            throw new EOFException();
        }
        this.f33152a.a(interfaceC18012q, false);
        f fVar = this.f33152a;
        interfaceC18012q.k(fVar.f33187h + fVar.f33188i);
        long j10 = this.f33152a.f33182c;
        while (true) {
            f fVar2 = this.f33152a;
            if ((fVar2.f33181b & 4) == 4 || !fVar2.c(interfaceC18012q) || interfaceC18012q.getPosition() >= this.f33154c || !this.f33152a.a(interfaceC18012q, true)) {
                break;
            }
            f fVar3 = this.f33152a;
            if (!C18013s.e(interfaceC18012q, fVar3.f33187h + fVar3.f33188i)) {
                break;
            }
            j10 = this.f33152a.f33182c;
        }
        return j10;
    }

    public a(i iVar, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        C13466a.a(z11);
        this.f33155d = iVar;
        this.f33153b = j10;
        this.f33154c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f33156e = 0;
        } else {
            this.f33157f = j13;
            this.f33156e = 4;
        }
        this.f33152a = new f();
    }
}
