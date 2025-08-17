package f4;

import a3.t;
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13466a;
import d3.D;
import d3.P;
import fsimpl.C14045dq;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.O;
import x3.T;
import x3.r;
import x3.u;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13843b implements InterfaceC18011p {

    /* renamed from: h, reason: collision with root package name */
    public static final u f130707h = new u() { // from class: f4.a
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return C13843b.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private r f130708a;

    /* renamed from: b, reason: collision with root package name */
    private O f130709b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC2077b f130712e;

    /* renamed from: c, reason: collision with root package name */
    private int f130710c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f130711d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f130713f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f130714g = -1;

    /* renamed from: f4.b$a */
    private static final class a implements InterfaceC2077b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f130715m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f130716n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT, 337, 371, HttpResponseStatus.ERROR_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final r f130717a;

        /* renamed from: b, reason: collision with root package name */
        private final O f130718b;

        /* renamed from: c, reason: collision with root package name */
        private final f4.c f130719c;

        /* renamed from: d, reason: collision with root package name */
        private final int f130720d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f130721e;

        /* renamed from: f, reason: collision with root package name */
        private final D f130722f;

        /* renamed from: g, reason: collision with root package name */
        private final int f130723g;

        /* renamed from: h, reason: collision with root package name */
        private final t f130724h;

        /* renamed from: i, reason: collision with root package name */
        private int f130725i;

        /* renamed from: j, reason: collision with root package name */
        private long f130726j;

        /* renamed from: k, reason: collision with root package name */
        private int f130727k;

        /* renamed from: l, reason: collision with root package name */
        private long f130728l;

        private void d(byte[] bArr, int i10, D d10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f130719c.f130738b; i12++) {
                    e(bArr, i11, i12, d10.e());
                }
            }
            int iG = g(this.f130720d * i10);
            d10.W(0);
            d10.V(iG);
        }

        @Override // f4.C13843b.InterfaceC2077b
        public void c(long j10) {
            this.f130725i = 0;
            this.f130726j = j10;
            this.f130727k = 0;
            this.f130728l = 0L;
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            f4.c cVar = this.f130719c;
            int i12 = cVar.f130741e;
            int i13 = cVar.f130738b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iO = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f130716n[iMin];
            int i18 = ((i10 * this.f130720d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iO & l3.f92484c);
            bArr2[i18 + 1] = (byte) (iO >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & C14045dq.MULTIPLY : (b10 & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iO = P.o(iO + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iO & l3.f92484c);
                bArr2[i18 + 1] = (byte) (iO >> 8);
                int i22 = iMin + f130715m[i20];
                int[] iArr = f130716n;
                iMin = P.o(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f130719c.f130738b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f130719c.f130738b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jV0 = this.f130726j + P.V0(this.f130728l, 1000000L, this.f130719c.f130739c);
            int iG = g(i10);
            this.f130718b.c(jV0, 1, iG, this.f130727k - iG, null);
            this.f130728l += i10;
            this.f130727k -= iG;
        }

        @Override // f4.C13843b.InterfaceC2077b
        public void a(int i10, long j10) {
            e eVar = new e(this.f130719c, this.f130720d, i10, j10);
            this.f130717a.g(eVar);
            this.f130718b.b(this.f130724h);
            this.f130718b.f(eVar.l());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // f4.C13843b.InterfaceC2077b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(x3.InterfaceC18012q r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f130723g
                int r1 = r6.f130727k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f130720d
                int r0 = d3.P.j(r0, r1)
                f4.c r1 = r6.f130719c
                int r1 = r1.f130741e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f130725i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f130721e
                int r5 = r6.f130725i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f130725i
                int r4 = r4 + r3
                r6.f130725i = r4
                goto L1e
            L3e:
                int r7 = r6.f130725i
                f4.c r8 = r6.f130719c
                int r8 = r8.f130741e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f130721e
                d3.D r9 = r6.f130722f
                r6.d(r8, r7, r9)
                int r8 = r6.f130725i
                f4.c r9 = r6.f130719c
                int r9 = r9.f130741e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f130725i = r8
                d3.D r7 = r6.f130722f
                int r7 = r7.g()
                x3.O r8 = r6.f130718b
                d3.D r9 = r6.f130722f
                r8.d(r9, r7)
                int r8 = r6.f130727k
                int r8 = r8 + r7
                r6.f130727k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f130723g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f130727k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f4.C13843b.a.b(x3.q, long):boolean");
        }

        public a(r rVar, O o10, f4.c cVar) throws ParserException {
            this.f130717a = rVar;
            this.f130718b = o10;
            this.f130719c = cVar;
            int iMax = Math.max(1, cVar.f130739c / 10);
            this.f130723g = iMax;
            D d10 = new D(cVar.f130743g);
            d10.z();
            int iZ = d10.z();
            this.f130720d = iZ;
            int i10 = cVar.f130738b;
            int i11 = (((cVar.f130741e - (i10 * 4)) * 8) / (cVar.f130742f * i10)) + 1;
            if (iZ == i11) {
                int iJ = P.j(iMax, iZ);
                this.f130721e = new byte[cVar.f130741e * iJ];
                this.f130722f = new D(iJ * h(iZ, i10));
                int i12 = ((cVar.f130739c * cVar.f130741e) * 8) / iZ;
                this.f130724h = new t.b().u0("audio/raw").Q(i12).p0(i12).k0(h(iMax, i10)).R(cVar.f130738b).v0(cVar.f130739c).o0(2).N();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i11 + "; got: " + iZ, null);
        }
    }

    /* renamed from: f4.b$b, reason: collision with other inner class name */
    private interface InterfaceC2077b {
        void a(int i10, long j10) throws ParserException;

        boolean b(InterfaceC18012q interfaceC18012q, long j10) throws IOException;

        void c(long j10);
    }

    /* renamed from: f4.b$c */
    private static final class c implements InterfaceC2077b {

        /* renamed from: a, reason: collision with root package name */
        private final r f130729a;

        /* renamed from: b, reason: collision with root package name */
        private final O f130730b;

        /* renamed from: c, reason: collision with root package name */
        private final f4.c f130731c;

        /* renamed from: d, reason: collision with root package name */
        private final t f130732d;

        /* renamed from: e, reason: collision with root package name */
        private final int f130733e;

        /* renamed from: f, reason: collision with root package name */
        private long f130734f;

        /* renamed from: g, reason: collision with root package name */
        private int f130735g;

        /* renamed from: h, reason: collision with root package name */
        private long f130736h;

        @Override // f4.C13843b.InterfaceC2077b
        public void a(int i10, long j10) {
            e eVar = new e(this.f130731c, 1, i10, j10);
            this.f130729a.g(eVar);
            this.f130730b.b(this.f130732d);
            this.f130730b.f(eVar.l());
        }

        @Override // f4.C13843b.InterfaceC2077b
        public boolean b(InterfaceC18012q interfaceC18012q, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f130735g) < (i11 = this.f130733e)) {
                int iG = this.f130730b.g(interfaceC18012q, (int) Math.min(i11 - i10, j11), true);
                if (iG == -1) {
                    j11 = 0;
                } else {
                    this.f130735g += iG;
                    j11 -= iG;
                }
            }
            int i12 = this.f130731c.f130741e;
            int i13 = this.f130735g / i12;
            if (i13 > 0) {
                long jV0 = this.f130734f + P.V0(this.f130736h, 1000000L, r1.f130739c);
                int i14 = i13 * i12;
                int i15 = this.f130735g - i14;
                this.f130730b.c(jV0, 1, i14, i15, null);
                this.f130736h += i13;
                this.f130735g = i15;
            }
            return j11 <= 0;
        }

        @Override // f4.C13843b.InterfaceC2077b
        public void c(long j10) {
            this.f130734f = j10;
            this.f130735g = 0;
            this.f130736h = 0L;
        }

        public c(r rVar, O o10, f4.c cVar, String str, int i10) throws ParserException {
            this.f130729a = rVar;
            this.f130730b = o10;
            this.f130731c = cVar;
            int i11 = (cVar.f130738b * cVar.f130742f) / 8;
            if (cVar.f130741e == i11) {
                int i12 = cVar.f130739c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f130733e = iMax;
                this.f130732d = new t.b().U("audio/wav").u0(str).Q(i13).p0(i13).k0(iMax).R(cVar.f130738b).v0(cVar.f130739c).o0(i10).N();
                return;
            }
            throw ParserException.a("Expected block size: " + i11 + "; got: " + cVar.f130741e, null);
        }
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new C13843b()};
    }

    private void f() {
        C13466a.i(this.f130709b);
        P.h(this.f130708a);
    }

    private int l(InterfaceC18012q interfaceC18012q) throws IOException {
        C13466a.g(this.f130714g != -1);
        return ((InterfaceC2077b) C13466a.e(this.f130712e)).b(interfaceC18012q, this.f130714g - interfaceC18012q.getPosition()) ? -1 : 0;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f130710c = j10 == 0 ? 0 : 4;
        InterfaceC2077b interfaceC2077b = this.f130712e;
        if (interfaceC2077b != null) {
            interfaceC2077b.c(j11);
        }
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f130708a = rVar;
        this.f130709b = rVar.t(0, 1);
        rVar.p();
    }

    private void g(InterfaceC18012q interfaceC18012q) throws IOException {
        boolean z10;
        if (interfaceC18012q.getPosition() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        int i10 = this.f130713f;
        if (i10 != -1) {
            interfaceC18012q.k(i10);
            this.f130710c = 4;
        } else {
            if (d.a(interfaceC18012q)) {
                interfaceC18012q.k((int) (interfaceC18012q.g() - interfaceC18012q.getPosition()));
                this.f130710c = 1;
                return;
            }
            throw ParserException.a("Unsupported or unrecognized wav file type.", null);
        }
    }

    private void h(InterfaceC18012q interfaceC18012q) throws IOException {
        f4.c cVarB = d.b(interfaceC18012q);
        int i10 = cVarB.f130737a;
        if (i10 == 17) {
            this.f130712e = new a(this.f130708a, this.f130709b, cVarB);
        } else if (i10 == 6) {
            this.f130712e = new c(this.f130708a, this.f130709b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f130712e = new c(this.f130708a, this.f130709b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = T.a(i10, cVarB.f130742f);
            if (iA != 0) {
                this.f130712e = new c(this.f130708a, this.f130709b, cVarB, "audio/raw", iA);
            } else {
                throw ParserException.c("Unsupported WAV format type: " + cVarB.f130737a);
            }
        }
        this.f130710c = 3;
    }

    private void k(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f130711d = d.c(interfaceC18012q);
        this.f130710c = 2;
    }

    private void m(InterfaceC18012q interfaceC18012q) throws IOException {
        Pair<Long, Long> pairE = d.e(interfaceC18012q);
        this.f130713f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f130711d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f130714g = this.f130713f + jLongValue;
        long length = interfaceC18012q.getLength();
        if (length != -1 && this.f130714g > length) {
            d3.r.i("WavExtractor", "Data exceeds input length: " + this.f130714g + ", " + length);
            this.f130714g = length;
        }
        ((InterfaceC2077b) C13466a.e(this.f130712e)).a(this.f130713f, this.f130714g);
        this.f130710c = 4;
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        f();
        int i11 = this.f130710c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return l(interfaceC18012q);
                        }
                        throw new IllegalStateException();
                    }
                    m(interfaceC18012q);
                    return 0;
                }
                h(interfaceC18012q);
                return 0;
            }
            k(interfaceC18012q);
            return 0;
        }
        g(interfaceC18012q);
        return 0;
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        return d.a(interfaceC18012q);
    }
}
