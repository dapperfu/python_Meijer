package S3;

import Ce.L;
import S3.i;
import a3.t;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import d3.D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import x3.S;

/* loaded from: classes4.dex */
final class j extends i {

    /* renamed from: n, reason: collision with root package name */
    private a f33209n;

    /* renamed from: o, reason: collision with root package name */
    private int f33210o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f33211p;

    /* renamed from: q, reason: collision with root package name */
    private S.c f33212q;

    /* renamed from: r, reason: collision with root package name */
    private S.a f33213r;

    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (l3.f92484c >>> (8 - i10));
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
        public final S.c f33214a;

        /* renamed from: b, reason: collision with root package name */
        public final S.a f33215b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f33216c;

        /* renamed from: d, reason: collision with root package name */
        public final S.b[] f33217d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33218e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f33214a = cVar;
            this.f33215b = aVar;
            this.f33216c = bArr;
            this.f33217d = bVarArr;
            this.f33218e = i10;
        }
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f33217d[p(b10, aVar.f33218e, 1)].f169112a ? aVar.f33214a.f169122g : aVar.f33214a.f169123h;
    }

    @Override // S3.i
    protected boolean h(D d10, long j10, i.b bVar) throws IOException {
        if (this.f33209n != null) {
            C13466a.e(bVar.f33207a);
            return false;
        }
        a aVarQ = q(d10);
        this.f33209n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        S.c cVar = aVarQ.f33214a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f169125j);
        arrayList.add(aVarQ.f33216c);
        bVar.f33207a = new t.b().U("audio/ogg").u0("audio/vorbis").Q(cVar.f169120e).p0(cVar.f169119d).R(cVar.f169117b).v0(cVar.f169118c).g0(arrayList).n0(S.d(L.t(aVarQ.f33215b.f169110b))).N();
        return true;
    }

    a q(D d10) throws IOException {
        S.c cVar = this.f33212q;
        if (cVar == null) {
            this.f33212q = S.l(d10);
            return null;
        }
        S.a aVar = this.f33213r;
        if (aVar == null) {
            this.f33213r = S.j(d10);
            return null;
        }
        byte[] bArr = new byte[d10.g()];
        System.arraycopy(d10.e(), 0, bArr, 0, d10.g());
        return new a(cVar, aVar, bArr, S.m(d10, cVar.f169117b), S.b(r4.length - 1));
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
        this.f33211p = z10;
        S.c cVar = this.f33212q;
        if (cVar != null) {
            i10 = cVar.f169122g;
        }
        this.f33210o = i10;
    }

    @Override // S3.i
    protected long f(D d10) {
        int i10 = 0;
        if ((d10.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(d10.e()[0], (a) C13466a.i(this.f33209n));
        if (this.f33211p) {
            i10 = (this.f33210o + iO) / 4;
        }
        long j10 = i10;
        n(d10, j10);
        this.f33211p = true;
        this.f33210o = iO;
        return j10;
    }

    @Override // S3.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f33209n = null;
            this.f33212q = null;
            this.f33213r = null;
        }
        this.f33210o = 0;
        this.f33211p = false;
    }
}
