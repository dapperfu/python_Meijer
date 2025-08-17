package S3;

import S3.i;
import d3.C13466a;
import d3.D;
import d3.P;
import java.util.Arrays;
import x3.InterfaceC18012q;
import x3.J;
import x3.v;
import x3.w;
import x3.x;
import x3.y;

/* loaded from: classes4.dex */
final class b extends i {

    /* renamed from: n, reason: collision with root package name */
    private y f33165n;

    /* renamed from: o, reason: collision with root package name */
    private a f33166o;

    private static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private y f33167a;

        /* renamed from: b, reason: collision with root package name */
        private y.a f33168b;

        /* renamed from: c, reason: collision with root package name */
        private long f33169c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f33170d = -1;

        @Override // S3.g
        public long a(InterfaceC18012q interfaceC18012q) {
            long j10 = this.f33170d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f33170d = -1L;
            return j11;
        }

        @Override // S3.g
        public J b() {
            C13466a.g(this.f33169c != -1);
            return new x(this.f33167a, this.f33169c);
        }

        @Override // S3.g
        public void c(long j10) {
            long[] jArr = this.f33168b.f169271a;
            this.f33170d = jArr[P.g(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f33169c = j10;
        }

        public a(y yVar, y.a aVar) {
            this.f33167a = yVar;
            this.f33168b = aVar;
        }
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    b() {
    }

    private int n(D d10) {
        int i10 = (d10.e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            d10.X(4);
            d10.Q();
        }
        int iJ = v.j(d10, i10);
        d10.W(0);
        return iJ;
    }

    public static boolean p(D d10) {
        if (d10.a() >= 5 && d10.H() == 127 && d10.J() == 1179402563) {
            return true;
        }
        return false;
    }

    @Override // S3.i
    protected long f(D d10) {
        if (!o(d10.e())) {
            return -1L;
        }
        return n(d10);
    }

    @Override // S3.i
    protected boolean h(D d10, long j10, i.b bVar) {
        byte[] bArrE = d10.e();
        y yVar = this.f33165n;
        if (yVar == null) {
            y yVar2 = new y(bArrE, 17);
            this.f33165n = yVar2;
            bVar.f33207a = yVar2.g(Arrays.copyOfRange(bArrE, 9, d10.g()), null).b().U("audio/ogg").N();
            return true;
        }
        if ((bArrE[0] & Byte.MAX_VALUE) == 3) {
            y.a aVarF = w.f(d10);
            y yVarB = yVar.b(aVarF);
            this.f33165n = yVarB;
            this.f33166o = new a(yVarB, aVarF);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f33166o;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f33208b = this.f33166o;
        }
        C13466a.e(bVar.f33207a);
        return false;
    }

    @Override // S3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f33165n = null;
            this.f33166o = null;
        }
    }
}
