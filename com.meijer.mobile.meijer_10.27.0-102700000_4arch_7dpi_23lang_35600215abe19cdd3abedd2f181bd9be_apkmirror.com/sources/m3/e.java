package m3;

import a3.t;
import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC6052h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import d3.C13466a;
import d3.K;
import h3.G;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import m3.InterfaceC15547c;

/* loaded from: classes.dex */
public class e extends AbstractC6052h {

    /* renamed from: A, reason: collision with root package name */
    private int f149806A;

    /* renamed from: B, reason: collision with root package name */
    private t f149807B;

    /* renamed from: C, reason: collision with root package name */
    private InterfaceC15547c f149808C;

    /* renamed from: D, reason: collision with root package name */
    private DecoderInputBuffer f149809D;

    /* renamed from: E, reason: collision with root package name */
    private ImageOutput f149810E;

    /* renamed from: F, reason: collision with root package name */
    private Bitmap f149811F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f149812G;

    /* renamed from: H, reason: collision with root package name */
    private b f149813H;

    /* renamed from: I, reason: collision with root package name */
    private b f149814I;

    /* renamed from: J, reason: collision with root package name */
    private int f149815J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f149816K;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC15547c.a f149817r;

    /* renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f149818s;

    /* renamed from: t, reason: collision with root package name */
    private final ArrayDeque<a> f149819t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f149820u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f149821v;

    /* renamed from: w, reason: collision with root package name */
    private a f149822w;

    /* renamed from: x, reason: collision with root package name */
    private long f149823x;

    /* renamed from: y, reason: collision with root package name */
    private long f149824y;

    /* renamed from: z, reason: collision with root package name */
    private int f149825z;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f149829a;

        /* renamed from: b, reason: collision with root package name */
        private final long f149830b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f149831c;

        public long a() {
            return this.f149830b;
        }

        public Bitmap b() {
            return this.f149831c;
        }

        public int c() {
            return this.f149829a;
        }

        public boolean d() {
            return this.f149831c != null;
        }

        public void e(Bitmap bitmap) {
            this.f149831c = bitmap;
        }

        public b(int i10, long j10) {
            this.f149829a = i10;
            this.f149830b = j10;
        }
    }

    public e(InterfaceC15547c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f149817r = aVar;
        this.f149810E = v0(imageOutput);
        this.f149818s = DecoderInputBuffer.I();
        this.f149822w = a.f149826c;
        this.f149819t = new ArrayDeque<>();
        this.f149824y = -9223372036854775807L;
        this.f149823x = -9223372036854775807L;
        this.f149825z = 0;
        this.f149806A = 1;
    }

    private void D0() {
        this.f149809D = null;
        this.f149825z = 0;
        this.f149824y = -9223372036854775807L;
        InterfaceC15547c interfaceC15547c = this.f149808C;
        if (interfaceC15547c != null) {
            interfaceC15547c.release();
            this.f149808C = null;
        }
    }

    protected boolean A0() throws ExoPlaybackException {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void d0() {
        this.f149807B = null;
        this.f149822w = a.f149826c;
        this.f149819t.clear();
        D0();
        this.f149810E.a();
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void g0(long j10, boolean z10) throws ExoPlaybackException {
        x0(1);
        this.f149821v = false;
        this.f149820u = false;
        this.f149811F = null;
        this.f149813H = null;
        this.f149814I = null;
        this.f149812G = false;
        this.f149809D = null;
        InterfaceC15547c interfaceC15547c = this.f149808C;
        if (interfaceC15547c != null) {
            interfaceC15547c.flush();
        }
        this.f149819t.clear();
    }

    private static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f149826c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f149827a;

        /* renamed from: b, reason: collision with root package name */
        public final long f149828b;

        public a(long j10, long j11) {
            this.f149827a = j10;
            this.f149828b = j11;
        }
    }

    private void B0(long j10) {
        this.f149823x = j10;
        while (!this.f149819t.isEmpty() && j10 >= this.f149819t.peek().f149827a) {
            this.f149822w = this.f149819t.removeFirst();
        }
    }

    private boolean r0(t tVar) {
        int iA = this.f149817r.a(tVar);
        return iA == I0.v(4) || iA == I0.v(3);
    }

    private Bitmap s0(int i10) {
        C13466a.i(this.f149811F);
        int width = this.f149811F.getWidth() / ((t) C13466a.i(this.f149807B)).f43931L;
        int height = this.f149811F.getHeight() / ((t) C13466a.i(this.f149807B)).f43932M;
        int i11 = this.f149807B.f43931L;
        return Bitmap.createBitmap(this.f149811F, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean t0(long j10, long j11) throws ExoPlaybackException, ImageDecoderException {
        if (this.f149811F != null && this.f149813H == null) {
            return false;
        }
        if (this.f149806A == 0 && getState() != 2) {
            return false;
        }
        if (this.f149811F == null) {
            C13466a.i(this.f149808C);
            AbstractC15548d abstractC15548dA = this.f149808C.a();
            if (abstractC15548dA == null) {
                return false;
            }
            if (((AbstractC15548d) C13466a.i(abstractC15548dA)).u()) {
                if (this.f149825z == 3) {
                    D0();
                    C13466a.i(this.f149807B);
                    z0();
                } else {
                    ((AbstractC15548d) C13466a.i(abstractC15548dA)).E();
                    if (this.f149819t.isEmpty()) {
                        this.f149821v = true;
                    }
                }
                return false;
            }
            C13466a.j(abstractC15548dA.f149805e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f149811F = abstractC15548dA.f149805e;
            ((AbstractC15548d) C13466a.i(abstractC15548dA)).E();
        }
        if (!this.f149812G || this.f149811F == null || this.f149813H == null) {
            return false;
        }
        C13466a.i(this.f149807B);
        t tVar = this.f149807B;
        int i10 = tVar.f43931L;
        boolean z10 = ((i10 == 1 && tVar.f43932M == 1) || i10 == -1 || tVar.f43932M == -1) ? false : true;
        if (!this.f149813H.d()) {
            b bVar = this.f149813H;
            bVar.e(z10 ? s0(bVar.c()) : (Bitmap) C13466a.i(this.f149811F));
        }
        if (!C0(j10, j11, (Bitmap) C13466a.i(this.f149813H.b()), this.f149813H.a())) {
            return false;
        }
        B0(((b) C13466a.i(this.f149813H)).a());
        this.f149806A = 3;
        if (!z10 || ((b) C13466a.i(this.f149813H)).c() == (((t) C13466a.i(this.f149807B)).f43932M * ((t) C13466a.i(this.f149807B)).f43931L) - 1) {
            this.f149811F = null;
        }
        this.f149813H = this.f149814I;
        this.f149814I = null;
        return true;
    }

    private boolean u0(long j10) throws DecoderException {
        if (this.f149812G && this.f149813H != null) {
            return false;
        }
        G gV = V();
        InterfaceC15547c interfaceC15547c = this.f149808C;
        if (interfaceC15547c == null || this.f149825z == 3 || this.f149820u) {
            return false;
        }
        if (this.f149809D == null) {
            DecoderInputBuffer decoderInputBufferE = interfaceC15547c.e();
            this.f149809D = decoderInputBufferE;
            if (decoderInputBufferE == null) {
                return false;
            }
        }
        if (this.f149825z == 2) {
            C13466a.i(this.f149809D);
            this.f149809D.D(4);
            ((InterfaceC15547c) C13466a.i(this.f149808C)).f(this.f149809D);
            this.f149809D = null;
            this.f149825z = 3;
            return false;
        }
        int iO0 = o0(gV, this.f149809D, 0);
        if (iO0 == -5) {
            this.f149807B = (t) C13466a.i(gV.f134191b);
            this.f149816K = true;
            this.f149825z = 2;
            return true;
        }
        if (iO0 != -4) {
            if (iO0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f149809D.G();
        ByteBuffer byteBuffer = this.f149809D.f55465d;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) C13466a.i(this.f149809D)).u();
        if (z10) {
            ((InterfaceC15547c) C13466a.i(this.f149808C)).f((DecoderInputBuffer) C13466a.i(this.f149809D));
            this.f149815J = 0;
        }
        y0(j10, (DecoderInputBuffer) C13466a.i(this.f149809D));
        if (((DecoderInputBuffer) C13466a.i(this.f149809D)).u()) {
            this.f149820u = true;
            this.f149809D = null;
            return false;
        }
        this.f149824y = Math.max(this.f149824y, ((DecoderInputBuffer) C13466a.i(this.f149809D)).f55467f);
        if (z10) {
            this.f149809D = null;
        } else {
            ((DecoderInputBuffer) C13466a.i(this.f149809D)).o();
        }
        return !this.f149812G;
    }

    private static ImageOutput v0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f56197a : imageOutput;
    }

    private boolean w0(b bVar) {
        return ((t) C13466a.i(this.f149807B)).f43931L == -1 || this.f149807B.f43932M == -1 || bVar.c() == (((t) C13466a.i(this.f149807B)).f43932M * this.f149807B.f43931L) - 1;
    }

    private void x0(int i10) {
        this.f149806A = Math.min(this.f149806A, i10);
    }

    protected boolean C0(long j10, long j11, Bitmap bitmap, long j12) throws ExoPlaybackException {
        long j13 = j12 - j10;
        if (!F0() && j13 >= 30000) {
            return false;
        }
        this.f149810E.onImageAvailable(j12 - this.f149822w.f149828b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        return this.f149817r.a(tVar);
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        int i10 = this.f149806A;
        if (i10 != 3) {
            return i10 == 0 && this.f149812G;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f149821v;
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void e0(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f149806A = z11 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) throws ExoPlaybackException {
        if (this.f149821v) {
            return;
        }
        if (this.f149807B == null) {
            G gV = V();
            this.f149818s.o();
            int iO0 = o0(gV, this.f149818s, 2);
            if (iO0 != -5) {
                if (iO0 == -4) {
                    C13466a.g(this.f149818s.u());
                    this.f149820u = true;
                    this.f149821v = true;
                    return;
                }
                return;
            }
            this.f149807B = (t) C13466a.i(gV.f134191b);
            this.f149816K = true;
        }
        if (this.f149808C != null || z0()) {
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

    @Override // androidx.media3.exoplayer.AbstractC6052h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 15) {
            super.x(i10, obj);
        } else {
            E0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    private void E0(ImageOutput imageOutput) {
        this.f149810E = v0(imageOutput);
    }

    private boolean F0() {
        boolean z10;
        if (getState() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = this.f149806A;
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
            this.f149812G = true;
            return;
        }
        b bVar = new b(this.f149815J, decoderInputBuffer.f55467f);
        this.f149814I = bVar;
        this.f149815J++;
        if (!this.f149812G) {
            long jA = bVar.a();
            if (jA - 30000 <= j10 && j10 <= 30000 + jA) {
                z10 = true;
            } else {
                z10 = false;
            }
            b bVar2 = this.f149813H;
            if (bVar2 != null && bVar2.a() <= j10 && j10 < jA) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zW0 = w0((b) C13466a.i(this.f149814I));
            if (!z10 && !z11 && !zW0) {
                z12 = false;
            }
            this.f149812G = z12;
            if (z11 && !z10) {
                return;
            }
        }
        this.f149813H = this.f149814I;
        this.f149814I = null;
    }

    private boolean z0() throws ExoPlaybackException {
        if (!A0()) {
            return false;
        }
        if (!this.f149816K) {
            return true;
        }
        if (r0((t) C13466a.e(this.f149807B))) {
            InterfaceC15547c interfaceC15547c = this.f149808C;
            if (interfaceC15547c != null) {
                interfaceC15547c.release();
            }
            this.f149808C = this.f149817r.b();
            this.f149816K = false;
            return true;
        }
        throw R(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.f149807B, 4005);
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void h0() {
        D0();
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void j0() {
        D0();
        x0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.AbstractC6052h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m0(a3.t[] r5, long r6, long r8, androidx.media3.exoplayer.source.r.b r10) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r4 = this;
            super.m0(r5, r6, r8, r10)
            r5 = r4
            m3.e$a r6 = r5.f149822w
            long r6 = r6.f149828b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque<m3.e$a> r6 = r5.f149819t
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f149824y
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f149823x
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque<m3.e$a> r6 = r5.f149819t
            m3.e$a r7 = new m3.e$a
            long r0 = r5.f149824y
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            m3.e$a r6 = new m3.e$a
            r6.<init>(r0, r8)
            r5.f149822w = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.e.m0(a3.t[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }
}
