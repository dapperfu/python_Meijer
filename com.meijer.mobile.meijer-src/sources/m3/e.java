package m3;

import a3.t;
import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC6194h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import d3.C13599a;
import d3.K;
import h3.G;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import m3.InterfaceC15658c;

/* loaded from: classes.dex */
public class e extends AbstractC6194h {

    /* renamed from: A, reason: collision with root package name */
    private int f150548A;

    /* renamed from: B, reason: collision with root package name */
    private t f150549B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC15658c f150550C;

    /* renamed from: D, reason: collision with root package name */
    private DecoderInputBuffer f150551D;

    /* renamed from: E, reason: collision with root package name */
    private ImageOutput f150552E;

    /* renamed from: F, reason: collision with root package name */
    private Bitmap f150553F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f150554G;

    /* renamed from: H, reason: collision with root package name */
    private b f150555H;

    /* renamed from: I, reason: collision with root package name */
    private b f150556I;

    /* renamed from: J, reason: collision with root package name */
    private int f150557J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f150558K;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC15658c.a f150559r;

    /* renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f150560s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayDeque<a> f150561t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f150562u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f150563v;

    /* renamed from: w, reason: collision with root package name */
    private a f150564w;

    /* renamed from: x, reason: collision with root package name */
    private long f150565x;

    /* renamed from: y, reason: collision with root package name */
    private long f150566y;

    /* renamed from: z, reason: collision with root package name */
    private int f150567z;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f150571a;

        /* renamed from: b, reason: collision with root package name */
        private final long f150572b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f150573c;

        public long a() {
            return this.f150572b;
        }

        public Bitmap b() {
            return this.f150573c;
        }

        public int c() {
            return this.f150571a;
        }

        public boolean d() {
            return this.f150573c != null;
        }

        public void e(Bitmap bitmap) {
            this.f150573c = bitmap;
        }

        public b(int i10, long j10) {
            this.f150571a = i10;
            this.f150572b = j10;
        }
    }

    public e(InterfaceC15658c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f150559r = aVar;
        this.f150552E = v0(imageOutput);
        this.f150560s = DecoderInputBuffer.I();
        this.f150564w = a.f150568c;
        this.f150561t = new ArrayDeque<>();
        this.f150566y = -9223372036854775807L;
        this.f150565x = -9223372036854775807L;
        this.f150567z = 0;
        this.f150548A = 1;
    }

    private void D0() {
        this.f150551D = null;
        this.f150567z = 0;
        this.f150566y = -9223372036854775807L;
        InterfaceC15658c interfaceC15658c = this.f150550C;
        if (interfaceC15658c != null) {
            interfaceC15658c.release();
            this.f150550C = null;
        }
    }

    protected boolean A0() throws ExoPlaybackException {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void d0() {
        this.f150549B = null;
        this.f150564w = a.f150568c;
        this.f150561t.clear();
        D0();
        this.f150552E.a();
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void g0(long j10, boolean z10) throws ExoPlaybackException {
        x0(1);
        this.f150563v = false;
        this.f150562u = false;
        this.f150553F = null;
        this.f150555H = null;
        this.f150556I = null;
        this.f150554G = false;
        this.f150551D = null;
        InterfaceC15658c interfaceC15658c = this.f150550C;
        if (interfaceC15658c != null) {
            interfaceC15658c.flush();
        }
        this.f150561t.clear();
    }

    private static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f150568c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f150569a;

        /* renamed from: b, reason: collision with root package name */
        public final long f150570b;

        public a(long j10, long j11) {
            this.f150569a = j10;
            this.f150570b = j11;
        }
    }

    private void B0(long j10) {
        this.f150565x = j10;
        while (!this.f150561t.isEmpty() && j10 >= this.f150561t.peek().f150569a) {
            this.f150564w = this.f150561t.removeFirst();
        }
    }

    private boolean r0(t tVar) {
        int iA = this.f150559r.a(tVar);
        return iA == I0.v(4) || iA == I0.v(3);
    }

    private Bitmap s0(int i10) {
        C13599a.i(this.f150553F);
        int width = this.f150553F.getWidth() / ((t) C13599a.i(this.f150549B)).f44749L;
        int height = this.f150553F.getHeight() / ((t) C13599a.i(this.f150549B)).f44750M;
        int i11 = this.f150549B.f44749L;
        return Bitmap.createBitmap(this.f150553F, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean t0(long j10, long j11) throws ExoPlaybackException, ImageDecoderException {
        if (this.f150553F != null && this.f150555H == null) {
            return false;
        }
        if (this.f150548A == 0 && getState() != 2) {
            return false;
        }
        if (this.f150553F == null) {
            C13599a.i(this.f150550C);
            AbstractC15659d abstractC15659dA = this.f150550C.a();
            if (abstractC15659dA == null) {
                return false;
            }
            if (((AbstractC15659d) C13599a.i(abstractC15659dA)).u()) {
                if (this.f150567z == 3) {
                    D0();
                    C13599a.i(this.f150549B);
                    z0();
                } else {
                    ((AbstractC15659d) C13599a.i(abstractC15659dA)).E();
                    if (this.f150561t.isEmpty()) {
                        this.f150563v = true;
                    }
                }
                return false;
            }
            C13599a.j(abstractC15659dA.f150547e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f150553F = abstractC15659dA.f150547e;
            ((AbstractC15659d) C13599a.i(abstractC15659dA)).E();
        }
        if (!this.f150554G || this.f150553F == null || this.f150555H == null) {
            return false;
        }
        C13599a.i(this.f150549B);
        t tVar = this.f150549B;
        int i10 = tVar.f44749L;
        boolean z10 = ((i10 == 1 && tVar.f44750M == 1) || i10 == -1 || tVar.f44750M == -1) ? false : true;
        if (!this.f150555H.d()) {
            b bVar = this.f150555H;
            bVar.e(z10 ? s0(bVar.c()) : (Bitmap) C13599a.i(this.f150553F));
        }
        if (!C0(j10, j11, (Bitmap) C13599a.i(this.f150555H.b()), this.f150555H.a())) {
            return false;
        }
        B0(((b) C13599a.i(this.f150555H)).a());
        this.f150548A = 3;
        if (!z10 || ((b) C13599a.i(this.f150555H)).c() == (((t) C13599a.i(this.f150549B)).f44750M * ((t) C13599a.i(this.f150549B)).f44749L) - 1) {
            this.f150553F = null;
        }
        this.f150555H = this.f150556I;
        this.f150556I = null;
        return true;
    }

    private boolean u0(long j10) throws DecoderException {
        if (this.f150554G && this.f150555H != null) {
            return false;
        }
        G gV = V();
        InterfaceC15658c interfaceC15658c = this.f150550C;
        if (interfaceC15658c == null || this.f150567z == 3 || this.f150562u) {
            return false;
        }
        if (this.f150551D == null) {
            DecoderInputBuffer decoderInputBufferE = interfaceC15658c.e();
            this.f150551D = decoderInputBufferE;
            if (decoderInputBufferE == null) {
                return false;
            }
        }
        if (this.f150567z == 2) {
            C13599a.i(this.f150551D);
            this.f150551D.D(4);
            ((InterfaceC15658c) C13599a.i(this.f150550C)).f(this.f150551D);
            this.f150551D = null;
            this.f150567z = 3;
            return false;
        }
        int iO0 = o0(gV, this.f150551D, 0);
        if (iO0 == -5) {
            this.f150549B = (t) C13599a.i(gV.f134662b);
            this.f150558K = true;
            this.f150567z = 2;
            return true;
        }
        if (iO0 != -4) {
            if (iO0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f150551D.G();
        ByteBuffer byteBuffer = this.f150551D.f55689d;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) C13599a.i(this.f150551D)).u();
        if (z10) {
            ((InterfaceC15658c) C13599a.i(this.f150550C)).f((DecoderInputBuffer) C13599a.i(this.f150551D));
            this.f150557J = 0;
        }
        y0(j10, (DecoderInputBuffer) C13599a.i(this.f150551D));
        if (((DecoderInputBuffer) C13599a.i(this.f150551D)).u()) {
            this.f150562u = true;
            this.f150551D = null;
            return false;
        }
        this.f150566y = Math.max(this.f150566y, ((DecoderInputBuffer) C13599a.i(this.f150551D)).f55691f);
        if (z10) {
            this.f150551D = null;
        } else {
            ((DecoderInputBuffer) C13599a.i(this.f150551D)).o();
        }
        return !this.f150554G;
    }

    private static ImageOutput v0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f56421a : imageOutput;
    }

    private boolean w0(b bVar) {
        return ((t) C13599a.i(this.f150549B)).f44749L == -1 || this.f150549B.f44750M == -1 || bVar.c() == (((t) C13599a.i(this.f150549B)).f44750M * this.f150549B.f44749L) - 1;
    }

    private void x0(int i10) {
        this.f150548A = Math.min(this.f150548A, i10);
    }

    protected boolean C0(long j10, long j11, Bitmap bitmap, long j12) throws ExoPlaybackException {
        long j13 = j12 - j10;
        if (!F0() && j13 >= 30000) {
            return false;
        }
        this.f150552E.onImageAvailable(j12 - this.f150564w.f150570b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        return this.f150559r.a(tVar);
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        int i10 = this.f150548A;
        if (i10 != 3) {
            return i10 == 0 && this.f150554G;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f150563v;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void e0(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f150548A = z11 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) throws ExoPlaybackException {
        if (this.f150563v) {
            return;
        }
        if (this.f150549B == null) {
            G gV = V();
            this.f150560s.o();
            int iO0 = o0(gV, this.f150560s, 2);
            if (iO0 != -5) {
                if (iO0 == -4) {
                    C13599a.g(this.f150560s.u());
                    this.f150562u = true;
                    this.f150563v = true;
                    return;
                }
                return;
            }
            this.f150549B = (t) C13599a.i(gV.f134662b);
            this.f150558K = true;
        }
        if (this.f150550C != null || z0()) {
            try {
                K.a("drainAndFeedDecoder");
                while (t0(j10, j11)) {
                }
                while (u0(j10)) {
                }
                K.b();
            } catch (ImageDecoderException e10) {
                throw R(e10, null, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 15) {
            super.x(i10, obj);
        } else {
            E0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    private void E0(ImageOutput imageOutput) {
        this.f150552E = v0(imageOutput);
    }

    private boolean F0() {
        boolean z10;
        if (getState() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f150548A;
        if (i10 != 0) {
            if (i10 == 1) {
                return true;
            }
            if (i10 == 3) {
                return false;
            }
            throw new IllegalStateException();
        }
        return z10;
    }

    private void y0(long j10, DecoderInputBuffer decoderInputBuffer) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (decoderInputBuffer.u()) {
            this.f150554G = true;
            return;
        }
        b bVar = new b(this.f150557J, decoderInputBuffer.f55691f);
        this.f150556I = bVar;
        this.f150557J++;
        if (!this.f150554G) {
            long jA = bVar.a();
            if (jA - 30000 <= j10 && j10 <= 30000 + jA) {
                z10 = true;
            } else {
                z10 = false;
            }
            b bVar2 = this.f150555H;
            if (bVar2 != null && bVar2.a() <= j10 && j10 < jA) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zW0 = w0((b) C13599a.i(this.f150556I));
            if (!z10 && !z11 && !zW0) {
                z12 = false;
            }
            this.f150554G = z12;
            if (z11 && !z10) {
                return;
            }
        }
        this.f150555H = this.f150556I;
        this.f150556I = null;
    }

    private boolean z0() throws ExoPlaybackException {
        if (!A0()) {
            return false;
        }
        if (!this.f150558K) {
            return true;
        }
        if (r0((t) C13599a.e(this.f150549B))) {
            InterfaceC15658c interfaceC15658c = this.f150550C;
            if (interfaceC15658c != null) {
                interfaceC15658c.release();
            }
            this.f150550C = this.f150559r.b();
            this.f150558K = false;
            return true;
        }
        throw R(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f150549B, 4005);
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void h0() {
        D0();
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void j0() {
        D0();
        x0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.AbstractC6194h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m0(a3.t[] r5, long r6, long r8, androidx.media3.exoplayer.source.r.b r10) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r4 = this;
            super.m0(r5, r6, r8, r10)
            r5 = r4
            m3.e$a r6 = r5.f150564w
            long r6 = r6.f150570b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque<m3.e$a> r6 = r5.f150561t
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f150566y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f150565x
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque<m3.e$a> r6 = r5.f150561t
            m3.e$a r7 = new m3.e$a
            long r0 = r5.f150566y
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            m3.e$a r6 = new m3.e$a
            r6.<init>(r0, r8)
            r5.f150564w = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.e.m0(a3.t[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }
}
