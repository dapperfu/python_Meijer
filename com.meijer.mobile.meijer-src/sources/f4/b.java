package f4;

import a3.t;
import android.util.Pair;
import androidx.media3.common.ParserException;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d3.C13599a;
import d3.D;
import d3.P;
import fsimpl.C14170dq;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.O;
import x3.T;
import x3.r;
import x3.u;

/* loaded from: classes4.dex */
public final class b implements InterfaceC18077p {

    /* renamed from: h, reason: collision with root package name */
    public static final u f131541h = new u() { // from class: f4.a
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return b.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private r f131542a;

    /* renamed from: b, reason: collision with root package name */
    private O f131543b;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC2087b f131546e;

    /* renamed from: c, reason: collision with root package name */
    private int f131544c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f131545d = -1;

    /* renamed from: f, reason: collision with root package name */
    private int f131547f = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f131548g = -1;

    private static final class a implements InterfaceC2087b {

        /* renamed from: m, reason: collision with root package name */
        private static final int[] f131549m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        private static final int[] f131550n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, HttpResponseStatus.REDIRECTION_TEMPORARY_REDIRECT, 337, 371, HttpResponseStatus.ERROR_REQUEST_TIMEOUT, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        private final r f131551a;

        /* renamed from: b, reason: collision with root package name */
        private final O f131552b;

        /* renamed from: c, reason: collision with root package name */
        private final f4.c f131553c;

        /* renamed from: d, reason: collision with root package name */
        private final int f131554d;

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f131555e;

        /* renamed from: f, reason: collision with root package name */
        private final D f131556f;

        /* renamed from: g, reason: collision with root package name */
        private final int f131557g;

        /* renamed from: h, reason: collision with root package name */
        private final t f131558h;

        /* renamed from: i, reason: collision with root package name */
        private int f131559i;

        /* renamed from: j, reason: collision with root package name */
        private long f131560j;

        /* renamed from: k, reason: collision with root package name */
        private int f131561k;

        /* renamed from: l, reason: collision with root package name */
        private long f131562l;

        private void d(byte[] bArr, int i10, D d10) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f131553c.f131572b; i12++) {
                    e(bArr, i11, i12, d10.e());
                }
            }
            int iG = g(this.f131554d * i10);
            d10.W(0);
            d10.V(iG);
        }

        @Override // f4.b.InterfaceC2087b
        public void c(long j10) {
            this.f131559i = 0;
            this.f131560j = j10;
            this.f131561k = 0;
            this.f131562l = 0L;
        }

        private void e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            f4.c cVar = this.f131553c;
            int i12 = cVar.f131575e;
            int i13 = cVar.f131572b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int iO = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int iMin = Math.min(bArr[i14 + 2] & 255, 88);
            int i17 = f131550n[iMin];
            int i18 = ((i10 * this.f131554d * i13) + i11) * 2;
            bArr2[i18] = (byte) (iO & l3.f93323c);
            bArr2[i18 + 1] = (byte) (iO >> 8);
            for (int i19 = 0; i19 < i16 * 2; i19++) {
                byte b10 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)];
                int i20 = i19 % 2 == 0 ? b10 & C14170dq.MULTIPLY : (b10 & 255) >> 4;
                int i21 = ((((i20 & 7) * 2) + 1) * i17) >> 3;
                if ((i20 & 8) != 0) {
                    i21 = -i21;
                }
                iO = P.o(iO + i21, -32768, 32767);
                i18 += i13 * 2;
                bArr2[i18] = (byte) (iO & l3.f93323c);
                bArr2[i18 + 1] = (byte) (iO >> 8);
                int i22 = iMin + f131549m[i20];
                int[] iArr = f131550n;
                iMin = P.o(i22, 0, iArr.length - 1);
                i17 = iArr[iMin];
            }
        }

        private int f(int i10) {
            return i10 / (this.f131553c.f131572b * 2);
        }

        private int g(int i10) {
            return h(i10, this.f131553c.f131572b);
        }

        private static int h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        private void i(int i10) {
            long jV0 = this.f131560j + P.V0(this.f131562l, 1000000L, this.f131553c.f131573c);
            int iG = g(i10);
            this.f131552b.c(jV0, 1, iG, this.f131561k - iG, null);
            this.f131562l += i10;
            this.f131561k -= iG;
        }

        @Override // f4.b.InterfaceC2087b
        public void a(int i10, long j10) {
            e eVar = new e(this.f131553c, this.f131554d, i10, j10);
            this.f131551a.g(eVar);
            this.f131552b.b(this.f131558h);
            this.f131552b.f(eVar.l());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // f4.b.InterfaceC2087b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(x3.InterfaceC18078q r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f131557g
                int r1 = r6.f131561k
                int r1 = r6.f(r1)
                int r0 = r0 - r1
                int r1 = r6.f131554d
                int r0 = d3.P.j(r0, r1)
                f4.c r1 = r6.f131553c
                int r1 = r1.f131575e
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
                int r3 = r6.f131559i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f131555e
                int r5 = r6.f131559i
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f131559i
                int r4 = r4 + r3
                r6.f131559i = r4
                goto L1e
            L3e:
                int r7 = r6.f131559i
                f4.c r8 = r6.f131553c
                int r8 = r8.f131575e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f131555e
                d3.D r9 = r6.f131556f
                r6.d(r8, r7, r9)
                int r8 = r6.f131559i
                f4.c r9 = r6.f131553c
                int r9 = r9.f131575e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f131559i = r8
                d3.D r7 = r6.f131556f
                int r7 = r7.g()
                x3.O r8 = r6.f131552b
                d3.D r9 = r6.f131556f
                r8.d(r9, r7)
                int r8 = r6.f131561k
                int r8 = r8 + r7
                r6.f131561k = r8
                int r7 = r6.f(r8)
                int r8 = r6.f131557g
                if (r7 < r8) goto L75
                r6.i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f131561k
                int r7 = r6.f(r7)
                if (r7 <= 0) goto L82
                r6.i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: f4.b.a.b(x3.q, long):boolean");
        }

        public a(r rVar, O o10, f4.c cVar) throws ParserException {
            this.f131551a = rVar;
            this.f131552b = o10;
            this.f131553c = cVar;
            int iMax = Math.max(1, cVar.f131573c / 10);
            this.f131557g = iMax;
            D d10 = new D(cVar.f131577g);
            d10.z();
            int iZ = d10.z();
            this.f131554d = iZ;
            int i10 = cVar.f131572b;
            int i11 = (((cVar.f131575e - (i10 * 4)) * 8) / (cVar.f131576f * i10)) + 1;
            if (iZ == i11) {
                int iJ = P.j(iMax, iZ);
                this.f131555e = new byte[cVar.f131575e * iJ];
                this.f131556f = new D(iJ * h(iZ, i10));
                int i12 = ((cVar.f131573c * cVar.f131575e) * 8) / iZ;
                this.f131558h = new t.b().u0("audio/raw").Q(i12).p0(i12).k0(h(iMax, i10)).R(cVar.f131572b).v0(cVar.f131573c).o0(2).N();
                return;
            }
            throw ParserException.a("Expected frames per block: " + i11 + "; got: " + iZ, null);
        }
    }

    /* renamed from: f4.b$b, reason: collision with other inner class name */
    private interface InterfaceC2087b {
        void a(int i10, long j10) throws ParserException;

        boolean b(InterfaceC18078q interfaceC18078q, long j10) throws IOException;

        void c(long j10);
    }

    private static final class c implements InterfaceC2087b {

        /* renamed from: a, reason: collision with root package name */
        private final r f131563a;

        /* renamed from: b, reason: collision with root package name */
        private final O f131564b;

        /* renamed from: c, reason: collision with root package name */
        private final f4.c f131565c;

        /* renamed from: d, reason: collision with root package name */
        private final t f131566d;

        /* renamed from: e, reason: collision with root package name */
        private final int f131567e;

        /* renamed from: f, reason: collision with root package name */
        private long f131568f;

        /* renamed from: g, reason: collision with root package name */
        private int f131569g;

        /* renamed from: h, reason: collision with root package name */
        private long f131570h;

        @Override // f4.b.InterfaceC2087b
        public void a(int i10, long j10) {
            e eVar = new e(this.f131565c, 1, i10, j10);
            this.f131563a.g(eVar);
            this.f131564b.b(this.f131566d);
            this.f131564b.f(eVar.l());
        }

        @Override // f4.b.InterfaceC2087b
        public boolean b(InterfaceC18078q interfaceC18078q, long j10) throws IOException {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f131569g) < (i11 = this.f131567e)) {
                int iG = this.f131564b.g(interfaceC18078q, (int) Math.min(i11 - i10, j11), true);
                if (iG == -1) {
                    j11 = 0;
                } else {
                    this.f131569g += iG;
                    j11 -= iG;
                }
            }
            int i12 = this.f131565c.f131575e;
            int i13 = this.f131569g / i12;
            if (i13 > 0) {
                long jV0 = this.f131568f + P.V0(this.f131570h, 1000000L, r1.f131573c);
                int i14 = i13 * i12;
                int i15 = this.f131569g - i14;
                this.f131564b.c(jV0, 1, i14, i15, null);
                this.f131570h += i13;
                this.f131569g = i15;
            }
            return j11 <= 0;
        }

        @Override // f4.b.InterfaceC2087b
        public void c(long j10) {
            this.f131568f = j10;
            this.f131569g = 0;
            this.f131570h = 0L;
        }

        public c(r rVar, O o10, f4.c cVar, String str, int i10) throws ParserException {
            this.f131563a = rVar;
            this.f131564b = o10;
            this.f131565c = cVar;
            int i11 = (cVar.f131572b * cVar.f131576f) / 8;
            if (cVar.f131575e == i11) {
                int i12 = cVar.f131573c;
                int i13 = i12 * i11 * 8;
                int iMax = Math.max(i11, (i12 * i11) / 10);
                this.f131567e = iMax;
                this.f131566d = new t.b().U("audio/wav").u0(str).Q(i13).p0(i13).k0(iMax).R(cVar.f131572b).v0(cVar.f131573c).o0(i10).N();
                return;
            }
            throw ParserException.a("Expected block size: " + i11 + "; got: " + cVar.f131575e, null);
        }
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new b()};
    }

    private void f() {
        C13599a.i(this.f131543b);
        P.h(this.f131542a);
    }

    private int l(InterfaceC18078q interfaceC18078q) throws IOException {
        C13599a.g(this.f131548g != -1);
        return ((InterfaceC2087b) C13599a.e(this.f131546e)).b(interfaceC18078q, this.f131548g - interfaceC18078q.getPosition()) ? -1 : 0;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f131544c = j10 == 0 ? 0 : 4;
        InterfaceC2087b interfaceC2087b = this.f131546e;
        if (interfaceC2087b != null) {
            interfaceC2087b.c(j11);
        }
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f131542a = rVar;
        this.f131543b = rVar.t(0, 1);
        rVar.p();
    }

    private void g(InterfaceC18078q interfaceC18078q) throws IOException {
        boolean z10;
        if (interfaceC18078q.getPosition() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        int i10 = this.f131547f;
        if (i10 != -1) {
            interfaceC18078q.k(i10);
            this.f131544c = 4;
        } else {
            if (d.a(interfaceC18078q)) {
                interfaceC18078q.k((int) (interfaceC18078q.g() - interfaceC18078q.getPosition()));
                this.f131544c = 1;
                return;
            }
            throw ParserException.a("Unsupported or unrecognized wav file type.", null);
        }
    }

    private void h(InterfaceC18078q interfaceC18078q) throws IOException {
        f4.c cVarB = d.b(interfaceC18078q);
        int i10 = cVarB.f131571a;
        if (i10 == 17) {
            this.f131546e = new a(this.f131542a, this.f131543b, cVarB);
        } else if (i10 == 6) {
            this.f131546e = new c(this.f131542a, this.f131543b, cVarB, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            this.f131546e = new c(this.f131542a, this.f131543b, cVarB, "audio/g711-mlaw", -1);
        } else {
            int iA = T.a(i10, cVarB.f131576f);
            if (iA != 0) {
                this.f131546e = new c(this.f131542a, this.f131543b, cVarB, "audio/raw", iA);
            } else {
                throw ParserException.c("Unsupported WAV format type: " + cVarB.f131571a);
            }
        }
        this.f131544c = 3;
    }

    private void k(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f131545d = d.c(interfaceC18078q);
        this.f131544c = 2;
    }

    private void m(InterfaceC18078q interfaceC18078q) throws IOException {
        Pair<Long, Long> pairE = d.e(interfaceC18078q);
        this.f131547f = ((Long) pairE.first).intValue();
        long jLongValue = ((Long) pairE.second).longValue();
        long j10 = this.f131545d;
        if (j10 != -1 && jLongValue == 4294967295L) {
            jLongValue = j10;
        }
        this.f131548g = this.f131547f + jLongValue;
        long length = interfaceC18078q.getLength();
        if (length != -1 && this.f131548g > length) {
            d3.r.i("WavExtractor", "Data exceeds input length: " + this.f131548g + ", " + length);
            this.f131548g = length;
        }
        ((InterfaceC2087b) C13599a.e(this.f131546e)).a(this.f131547f, this.f131548g);
        this.f131544c = 4;
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        f();
        int i11 = this.f131544c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            return l(interfaceC18078q);
                        }
                        throw new IllegalStateException();
                    }
                    m(interfaceC18078q);
                    return 0;
                }
                h(interfaceC18078q);
                return 0;
            }
            k(interfaceC18078q);
            return 0;
        }
        g(interfaceC18078q);
        return 0;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        return d.a(interfaceC18078q);
    }
}
