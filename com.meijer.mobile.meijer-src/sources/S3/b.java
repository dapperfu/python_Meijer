package S3;

import S3.i;
import d3.C13599a;
import d3.D;
import d3.P;
import java.util.Arrays;
import x3.InterfaceC18078q;
import x3.J;
import x3.v;
import x3.w;
import x3.x;
import x3.y;

/* loaded from: classes4.dex */
final class b extends i {

    /* renamed from: n, reason: collision with root package name */
    private y f34344n;

    /* renamed from: o, reason: collision with root package name */
    private a f34345o;

    private static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private y f34346a;

        /* renamed from: b, reason: collision with root package name */
        private y.a f34347b;

        /* renamed from: c, reason: collision with root package name */
        private long f34348c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f34349d = -1;

        @Override // S3.g
        public long a(InterfaceC18078q interfaceC18078q) {
            long j10 = this.f34349d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f34349d = -1L;
            return j11;
        }

        @Override // S3.g
        public J b() {
            C13599a.g(this.f34348c != -1);
            return new x(this.f34346a, this.f34348c);
        }

        @Override // S3.g
        public void c(long j10) {
            long[] jArr = this.f34347b.f170359a;
            this.f34349d = jArr[P.g(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f34348c = j10;
        }

        public a(y yVar, y.a aVar) {
            this.f34346a = yVar;
            this.f34347b = aVar;
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
        y yVar = this.f34344n;
        if (yVar == null) {
            y yVar2 = new y(bArrE, 17);
            this.f34344n = yVar2;
            bVar.f34386a = yVar2.g(Arrays.copyOfRange(bArrE, 9, d10.g()), null).b().U("audio/ogg").N();
            return true;
        }
        if ((bArrE[0] & Byte.MAX_VALUE) == 3) {
            y.a aVarF = w.f(d10);
            y yVarB = yVar.b(aVarF);
            this.f34344n = yVarB;
            this.f34345o = new a(yVarB, aVarF);
            return true;
        }
        if (!o(bArrE)) {
            return true;
        }
        a aVar = this.f34345o;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f34387b = this.f34345o;
        }
        C13599a.e(bVar.f34386a);
        return false;
    }

    @Override // S3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f34344n = null;
            this.f34345o = null;
        }
    }
}
