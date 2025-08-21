package S3;

import d3.C13599a;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import x3.C18079s;
import x3.InterfaceC18078q;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final f f34331a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34332b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34333c;

    /* renamed from: d, reason: collision with root package name */
    private final i f34334d;

    /* renamed from: e, reason: collision with root package name */
    private int f34335e;

    /* renamed from: f, reason: collision with root package name */
    private long f34336f;

    /* renamed from: g, reason: collision with root package name */
    private long f34337g;

    /* renamed from: h, reason: collision with root package name */
    private long f34338h;

    /* renamed from: i, reason: collision with root package name */
    private long f34339i;

    /* renamed from: j, reason: collision with root package name */
    private long f34340j;

    /* renamed from: k, reason: collision with root package name */
    private long f34341k;

    /* renamed from: l, reason: collision with root package name */
    private long f34342l;

    private final class b implements J {
        private b() {
        }

        @Override // x3.J
        public boolean g() {
            return true;
        }

        @Override // x3.J
        public J.a d(long j10) {
            return new J.a(new K(j10, P.p((a.this.f34332b + BigInteger.valueOf(a.this.f34334d.c(j10)).multiply(BigInteger.valueOf(a.this.f34333c - a.this.f34332b)).divide(BigInteger.valueOf(a.this.f34336f)).longValue()) - 30000, a.this.f34332b, a.this.f34333c - 1)));
        }

        @Override // x3.J
        public long l() {
            return a.this.f34334d.b(a.this.f34336f);
        }
    }

    private long i(InterfaceC18078q interfaceC18078q) throws IOException {
        if (this.f34339i == this.f34340j) {
            return -1L;
        }
        long position = interfaceC18078q.getPosition();
        if (!this.f34331a.d(interfaceC18078q, this.f34340j)) {
            long j10 = this.f34339i;
            if (j10 != position) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f34331a.a(interfaceC18078q, false);
        interfaceC18078q.d();
        long j11 = this.f34338h;
        f fVar = this.f34331a;
        long j12 = fVar.f34361c;
        long j13 = j11 - j12;
        int i10 = fVar.f34366h + fVar.f34367i;
        if (0 <= j13 && j13 < 72000) {
            return -1L;
        }
        if (j13 < 0) {
            this.f34340j = position;
            this.f34342l = j12;
        } else {
            this.f34339i = interfaceC18078q.getPosition() + i10;
            this.f34341k = this.f34331a.f34361c;
        }
        long j14 = this.f34340j;
        long j15 = this.f34339i;
        if (j14 - j15 < 100000) {
            this.f34340j = j15;
            return j15;
        }
        long position2 = interfaceC18078q.getPosition() - (i10 * (j13 <= 0 ? 2L : 1L));
        long j16 = this.f34340j;
        long j17 = this.f34339i;
        return P.p(position2 + ((j13 * (j16 - j17)) / (this.f34342l - this.f34341k)), j17, j16 - 1);
    }

    private void k(InterfaceC18078q interfaceC18078q) throws IOException {
        while (true) {
            this.f34331a.c(interfaceC18078q);
            this.f34331a.a(interfaceC18078q, false);
            f fVar = this.f34331a;
            if (fVar.f34361c > this.f34338h) {
                interfaceC18078q.d();
                return;
            } else {
                interfaceC18078q.k(fVar.f34366h + fVar.f34367i);
                this.f34339i = interfaceC18078q.getPosition();
                this.f34341k = this.f34331a.f34361c;
            }
        }
    }

    @Override // S3.g
    public long a(InterfaceC18078q interfaceC18078q) throws IOException {
        int i10 = this.f34335e;
        if (i10 == 0) {
            long position = interfaceC18078q.getPosition();
            this.f34337g = position;
            this.f34335e = 1;
            long j10 = this.f34333c - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long jI = i(interfaceC18078q);
                if (jI != -1) {
                    return jI;
                }
                this.f34335e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(interfaceC18078q);
            this.f34335e = 4;
            return -(this.f34341k + 2);
        }
        this.f34336f = j(interfaceC18078q);
        this.f34335e = 4;
        return this.f34337g;
    }

    @Override // S3.g
    public void c(long j10) {
        this.f34338h = P.p(j10, 0L, this.f34336f - 1);
        this.f34335e = 2;
        this.f34339i = this.f34332b;
        this.f34340j = this.f34333c;
        this.f34341k = 0L;
        this.f34342l = this.f34336f;
    }

    @Override // S3.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f34336f != 0) {
            return new b();
        }
        return null;
    }

    long j(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f34331a.b();
        if (!this.f34331a.c(interfaceC18078q)) {
            throw new EOFException();
        }
        this.f34331a.a(interfaceC18078q, false);
        f fVar = this.f34331a;
        interfaceC18078q.k(fVar.f34366h + fVar.f34367i);
        long j10 = this.f34331a.f34361c;
        while (true) {
            f fVar2 = this.f34331a;
            if ((fVar2.f34360b & 4) == 4 || !fVar2.c(interfaceC18078q) || interfaceC18078q.getPosition() >= this.f34333c || !this.f34331a.a(interfaceC18078q, true)) {
                break;
            }
            f fVar3 = this.f34331a;
            if (!C18079s.e(interfaceC18078q, fVar3.f34366h + fVar3.f34367i)) {
                break;
            }
            j10 = this.f34331a.f34361c;
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
        C13599a.a(z11);
        this.f34334d = iVar;
        this.f34332b = j10;
        this.f34333c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f34335e = 0;
        } else {
            this.f34336f = j13;
            this.f34335e = 4;
        }
        this.f34331a = new f();
    }
}
