package S3;

import Ee.L;
import S3.i;
import a3.t;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
import d3.D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import x3.S;

/* loaded from: classes4.dex */
final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    private a f34388n;

    /* renamed from: o, reason: collision with root package name */
    private int f34389o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f34390p;

    /* renamed from: q, reason: collision with root package name */
    private S.c f34391q;

    /* renamed from: r, reason: collision with root package name */
    private S.a f34392r;

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (l3.f93323c >>> (8 - i10));
    }

    public static boolean r(D d10) {
        try {
            return S.o(1, d10, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final S.c f34393a;

        /* renamed from: b, reason: collision with root package name */
        public final S.a f34394b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f34395c;

        /* renamed from: d, reason: collision with root package name */
        public final S.b[] f34396d;

        /* renamed from: e, reason: collision with root package name */
        public final int f34397e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f34393a = cVar;
            this.f34394b = aVar;
            this.f34395c = bArr;
            this.f34396d = bVarArr;
            this.f34397e = i10;
        }
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f34396d[p(b10, aVar.f34397e, 1)].f170200a ? aVar.f34393a.f170210g : aVar.f34393a.f170211h;
    }

    @Override // S3.i
    protected boolean h(D d10, long j10, i.b bVar) throws IOException {
        if (this.f34388n != null) {
            C13599a.e(bVar.f34386a);
            return false;
        }
        a aVarQ = q(d10);
        this.f34388n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        S.c cVar = aVarQ.f34393a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f170213j);
        arrayList.add(aVarQ.f34395c);
        bVar.f34386a = new t.b().U("audio/ogg").u0("audio/vorbis").Q(cVar.f170208e).p0(cVar.f170207d).R(cVar.f170205b).v0(cVar.f170206c).g0(arrayList).n0(S.d(L.t(aVarQ.f34394b.f170198b))).N();
        return true;
    }

    a q(D d10) throws IOException {
        S.c cVar = this.f34391q;
        if (cVar == null) {
            this.f34391q = S.l(d10);
            return null;
        }
        S.a aVar = this.f34392r;
        if (aVar == null) {
            this.f34392r = S.j(d10);
            return null;
        }
        byte[] bArr = new byte[d10.g()];
        System.arraycopy(d10.e(), 0, bArr, 0, d10.g());
        return new a(cVar, aVar, bArr, S.m(d10, cVar.f170205b), S.b(r4.length - 1));
    }

    j() {
    }

    static void n(D d10, long j10) {
        if (d10.b() < d10.g() + 4) {
            d10.T(Arrays.copyOf(d10.e(), d10.g() + 4));
        } else {
            d10.V(d10.g() + 4);
        }
        byte[] bArrE = d10.e();
        bArrE[d10.g() - 4] = (byte) (j10 & 255);
        bArrE[d10.g() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrE[d10.g() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrE[d10.g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    @Override // S3.i
    protected void e(long j10) {
        boolean z10;
        super.e(j10);
        int i10 = 0;
        if (j10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f34390p = z10;
        S.c cVar = this.f34391q;
        if (cVar != null) {
            i10 = cVar.f170210g;
        }
        this.f34389o = i10;
    }

    @Override // S3.i
    protected long f(D d10) {
        int i10 = 0;
        if ((d10.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(d10.e()[0], (a) C13599a.i(this.f34388n));
        if (this.f34390p) {
            i10 = (this.f34389o + iO) / 4;
        }
        long j10 = i10;
        n(d10, j10);
        this.f34390p = true;
        this.f34389o = iO;
        return j10;
    }

    @Override // S3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f34388n = null;
            this.f34391q = null;
            this.f34392r = null;
        }
        this.f34389o = 0;
        this.f34390p = false;
    }
}
