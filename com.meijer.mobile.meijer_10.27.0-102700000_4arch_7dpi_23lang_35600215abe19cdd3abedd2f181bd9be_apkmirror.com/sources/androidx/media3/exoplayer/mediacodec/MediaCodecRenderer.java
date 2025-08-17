package androidx.media3.exoplayer.mediacodec;

import a3.C5569i;
import a3.t;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.AbstractC6052h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.h;
import d3.C13466a;
import d3.I;
import d3.K;
import d3.P;
import fsimpl.C14045dq;
import g3.InterfaceC14195b;
import h3.C14333b;
import h3.C14334c;
import h3.G;
import i3.E1;
import j3.H;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class MediaCodecRenderer extends AbstractC6052h {

    /* renamed from: E0, reason: collision with root package name */
    private static final byte[] f56351E0 = {0, 0, 1, 103, 66, -64, C14045dq.DST_ATOP, -38, 37, -112, 0, 0, 1, 104, -50, C14045dq.MULTIPLY, 19, 32, 0, 0, 1, 101, -120, -124, C14045dq.DARKEN, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final ArrayDeque<d> f56352A;

    /* renamed from: A0, reason: collision with root package name */
    private d f56353A0;

    /* renamed from: B, reason: collision with root package name */
    private final H f56354B;

    /* renamed from: B0, reason: collision with root package name */
    private long f56355B0;

    /* renamed from: C, reason: collision with root package name */
    private t f56356C;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f56357C0;

    /* renamed from: D, reason: collision with root package name */
    private t f56358D;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f56359D0;

    /* renamed from: E, reason: collision with root package name */
    private DrmSession f56360E;

    /* renamed from: F, reason: collision with root package name */
    private DrmSession f56361F;

    /* renamed from: G, reason: collision with root package name */
    private H0.a f56362G;

    /* renamed from: H, reason: collision with root package name */
    private MediaCrypto f56363H;

    /* renamed from: I, reason: collision with root package name */
    private long f56364I;

    /* renamed from: J, reason: collision with root package name */
    private float f56365J;

    /* renamed from: K, reason: collision with root package name */
    private float f56366K;

    /* renamed from: L, reason: collision with root package name */
    private h f56367L;

    /* renamed from: M, reason: collision with root package name */
    private t f56368M;

    /* renamed from: N, reason: collision with root package name */
    private MediaFormat f56369N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f56370O;

    /* renamed from: P, reason: collision with root package name */
    private float f56371P;

    /* renamed from: Q, reason: collision with root package name */
    private ArrayDeque<j> f56372Q;

    /* renamed from: R, reason: collision with root package name */
    private DecoderInitializationException f56373R;

    /* renamed from: S, reason: collision with root package name */
    private j f56374S;

    /* renamed from: T, reason: collision with root package name */
    private int f56375T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f56376U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f56377V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f56378W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f56379X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f56380Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f56381Z;

    /* renamed from: a0, reason: collision with root package name */
    private long f56382a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f56383b0;

    /* renamed from: c0, reason: collision with root package name */
    private long f56384c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f56385d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f56386e0;

    /* renamed from: f0, reason: collision with root package name */
    private ByteBuffer f56387f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f56388g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f56389h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f56390i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f56391j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f56392k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f56393l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f56394m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f56395n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f56396o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f56397p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f56398q0;

    /* renamed from: r, reason: collision with root package name */
    private final h.b f56399r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f56400r0;

    /* renamed from: s, reason: collision with root package name */
    private final l f56401s;

    /* renamed from: s0, reason: collision with root package name */
    private long f56402s0;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f56403t;

    /* renamed from: t0, reason: collision with root package name */
    private long f56404t0;

    /* renamed from: u, reason: collision with root package name */
    private final float f56405u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f56406u0;

    /* renamed from: v, reason: collision with root package name */
    private final DecoderInputBuffer f56407v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f56408v0;

    /* renamed from: w, reason: collision with root package name */
    private final DecoderInputBuffer f56409w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f56410w0;

    /* renamed from: x, reason: collision with root package name */
    private final DecoderInputBuffer f56411x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f56412x0;

    /* renamed from: y, reason: collision with root package name */
    private final f f56413y;

    /* renamed from: y0, reason: collision with root package name */
    private ExoPlaybackException f56414y0;

    /* renamed from: z, reason: collision with root package name */
    private final MediaCodec.BufferInfo f56415z;

    /* renamed from: z0, reason: collision with root package name */
    protected C14333b f56416z0;

    public static class DecoderInitializationException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f56417a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56418b;

        /* renamed from: c, reason: collision with root package name */
        public final j f56419c;

        /* renamed from: d, reason: collision with root package name */
        public final String f56420d;

        /* renamed from: e, reason: collision with root package name */
        public final DecoderInitializationException f56421e;

        public DecoderInitializationException(t tVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + tVar, th2, tVar.f43949o, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f56417a, this.f56418b, this.f56419c, this.f56420d, decoderInitializationException);
        }

        public DecoderInitializationException(t tVar, Throwable th2, boolean z10, j jVar) {
            this("Decoder init failed: " + jVar.f56492a + ", " + tVar, th2, tVar.f43949o, z10, jVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, j jVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f56417a = str2;
            this.f56418b = z10;
            this.f56419c = jVar;
            this.f56420d = str3;
            this.f56421e = decoderInitializationException;
        }
    }

    private final class c implements h.c {
        private c() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void a() {
            if (MediaCodecRenderer.this.f56362G != null) {
                MediaCodecRenderer.this.f56362G.b();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void b() {
            if (MediaCodecRenderer.this.f56362G != null) {
                MediaCodecRenderer.this.f56362G.b();
            }
        }
    }

    private void B0() {
        this.f56392k0 = false;
        this.f56413y.o();
        this.f56411x.o();
        this.f56391j0 = false;
        this.f56390i0 = false;
        this.f56354B.d();
    }

    private boolean G0(j jVar, t tVar, DrmSession drmSession, DrmSession drmSession2) throws ExoPlaybackException {
        InterfaceC14195b interfaceC14195bD;
        InterfaceC14195b interfaceC14195bD2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (interfaceC14195bD = drmSession2.d()) != null && (interfaceC14195bD2 = drmSession.d()) != null && interfaceC14195bD.getClass().equals(interfaceC14195bD2.getClass())) {
            if (!(interfaceC14195bD instanceof k3.l)) {
                return false;
            }
            if (!drmSession2.a().equals(drmSession.a()) || P.f127086a < 23) {
                return true;
            }
            UUID uuid = C5569i.f43836e;
            if (!uuid.equals(drmSession.a()) && !uuid.equals(drmSession2.a())) {
                return !jVar.f56498g && (drmSession2.getState() == 2 || ((drmSession2.getState() == 3 || drmSession2.getState() == 4) && drmSession2.h((String) C13466a.e(tVar.f43949o))));
            }
        }
        return true;
    }

    private void G1() {
        this.f56385d0 = -1;
        this.f56409w.f55465d = null;
    }

    private void H1() {
        this.f56386e0 = -1;
        this.f56387f0 = null;
    }

    private void z1() {
        this.f56400r0 = true;
        MediaFormat mediaFormatF = ((h) C13466a.e(this.f56367L)).f();
        if (this.f56375T != 0 && mediaFormatF.getInteger("width") == 32 && mediaFormatF.getInteger("height") == 32) {
            this.f56380Y = true;
        } else {
            this.f56369N = mediaFormatF;
            this.f56370O = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void C1() {
        try {
            h hVar = this.f56367L;
            if (hVar != null) {
                hVar.release();
                this.f56416z0.f134215b++;
                p1(((j) C13466a.e(this.f56374S)).f56492a);
            }
            this.f56367L = null;
            try {
                MediaCrypto mediaCrypto = this.f56363H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f56367L = null;
            try {
                MediaCrypto mediaCrypto2 = this.f56363H;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    protected abstract void D1() throws ExoPlaybackException;

    protected final void K1() {
        this.f56412x0 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h, androidx.media3.exoplayer.I0
    public final int M() {
        return 8;
    }

    protected int N0(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected boolean P0() {
        return false;
    }

    protected boolean P1(j jVar) {
        return true;
    }

    protected abstract float Q0(float f10, t tVar, t[] tVarArr);

    protected boolean Q1() {
        return false;
    }

    protected boolean R1(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    protected abstract List<j> S0(l lVar, t tVar, boolean z10) throws MediaCodecUtil.DecoderQueryException;

    protected boolean S1(t tVar) {
        return false;
    }

    protected abstract int T1(l lVar, t tVar) throws MediaCodecUtil.DecoderQueryException;

    protected abstract h.a V0(j jVar, t tVar, MediaCrypto mediaCrypto, float f10);

    protected abstract void a1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException;

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void d0() throws MediaCryptoException {
        this.f56356C = null;
        J1(d.f56423e);
        this.f56352A.clear();
        K0();
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void g0(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        this.f56406u0 = false;
        this.f56408v0 = false;
        this.f56412x0 = false;
        if (this.f56390i0) {
            this.f56413y.o();
            this.f56411x.o();
            this.f56391j0 = false;
            this.f56354B.d();
        } else {
            J0();
        }
        if (this.f56353A0.f56427d.l() > 0) {
            this.f56410w0 = true;
        }
        this.f56353A0.f56427d.c();
        this.f56352A.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void j0() {
        try {
            B0();
            C1();
        } finally {
            M1(null);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void k0() {
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void l0() {
    }

    protected boolean m1(t tVar) throws ExoPlaybackException {
        return true;
    }

    protected abstract void n1(Exception exc);

    protected abstract void o1(String str, h.a aVar, long j10, long j11);

    protected abstract void p1(String str);

    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected h3.C14334c q1(h3.G r12) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.q1(h3.G):h3.c");
    }

    protected abstract void r1(t tVar, MediaFormat mediaFormat) throws ExoPlaybackException;

    protected void s1(long j10) {
    }

    protected abstract C14334c u0(j jVar, t tVar, t tVar2);

    protected void u1() {
    }

    protected void v1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    protected void w1(H0.a aVar) {
    }

    protected abstract boolean y1(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t tVar) throws ExoPlaybackException;

    private static final class b {
        public static void a(h.a aVar, E1 e12) {
            LogSessionId logSessionIdA = e12.a();
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f56486b.setString("log-session-id", logSessionIdA.getStringId());
            }
        }
    }

    private static final class d {

        /* renamed from: e, reason: collision with root package name */
        public static final d f56423e = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f56424a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56425b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56426c;

        /* renamed from: d, reason: collision with root package name */
        public final I<t> f56427d = new I<>();

        public d(long j10, long j11, long j12) {
            this.f56424a = j10;
            this.f56425b = j11;
            this.f56426c = j12;
        }
    }

    private boolean C0() {
        if (this.f56397p0) {
            this.f56395n0 = 1;
            if (this.f56377V) {
                this.f56396o0 = 3;
                return false;
            }
            this.f56396o0 = 1;
        }
        return true;
    }

    private void D0() throws ExoPlaybackException {
        if (!this.f56397p0) {
            B1();
        } else {
            this.f56395n0 = 1;
            this.f56396o0 = 3;
        }
    }

    @TargetApi(23)
    private boolean E0() throws MediaCryptoException, ExoPlaybackException {
        if (this.f56397p0) {
            this.f56395n0 = 1;
            if (this.f56377V) {
                this.f56396o0 = 3;
                return false;
            }
            this.f56396o0 = 2;
        } else {
            W1();
        }
        return true;
    }

    private boolean F0(long j10, long j11) throws MediaCryptoException, ExoPlaybackException {
        boolean z10;
        boolean zY1;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int iN;
        h hVar = (h) C13466a.e(this.f56367L);
        if (!b1()) {
            if (this.f56378W && this.f56398q0) {
                try {
                    iN = hVar.n(this.f56415z);
                } catch (IllegalStateException unused) {
                    x1();
                    if (this.f56408v0) {
                        C1();
                    }
                    return false;
                }
            } else {
                iN = hVar.n(this.f56415z);
            }
            if (iN < 0) {
                if (iN == -2) {
                    z1();
                    return true;
                }
                if (this.f56381Z && (this.f56406u0 || this.f56395n0 == 2)) {
                    x1();
                }
                long j12 = this.f56382a0;
                if (j12 != -9223372036854775807L && j12 + 100 < T().a()) {
                    x1();
                }
                return false;
            }
            if (this.f56380Y) {
                this.f56380Y = false;
                hVar.o(iN, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f56415z;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                x1();
                return false;
            }
            this.f56386e0 = iN;
            ByteBuffer byteBufferP = hVar.p(iN);
            this.f56387f0 = byteBufferP;
            if (byteBufferP != null) {
                byteBufferP.position(this.f56415z.offset);
                ByteBuffer byteBuffer2 = this.f56387f0;
                MediaCodec.BufferInfo bufferInfo3 = this.f56415z;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            this.f56388g0 = this.f56415z.presentationTimeUs < X();
            long j13 = this.f56404t0;
            this.f56389h0 = j13 != -9223372036854775807L && j13 <= this.f56415z.presentationTimeUs;
            X1(this.f56415z.presentationTimeUs);
        }
        if (this.f56378W && this.f56398q0) {
            try {
                byteBuffer = this.f56387f0;
                i10 = this.f56386e0;
                bufferInfo = this.f56415z;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zY1 = y1(j10, j11, hVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f56388g0, this.f56389h0, (t) C13466a.e(this.f56358D));
            } catch (IllegalStateException unused3) {
                x1();
                if (this.f56408v0) {
                    C1();
                }
                return z10;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f56387f0;
            int i11 = this.f56386e0;
            MediaCodec.BufferInfo bufferInfo4 = this.f56415z;
            zY1 = y1(j10, j11, hVar, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f56388g0, this.f56389h0, (t) C13466a.e(this.f56358D));
        }
        if (zY1) {
            t1(this.f56415z.presentationTimeUs);
            boolean z11 = (this.f56415z.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f56398q0 && this.f56389h0) {
                this.f56382a0 = T().a();
            }
            H1();
            if (!z11) {
                return true;
            }
            x1();
        }
        return z10;
    }

    private boolean H0() throws MediaCryptoException, ExoPlaybackException {
        int i10;
        if (this.f56367L == null || (i10 = this.f56395n0) == 2 || this.f56406u0) {
            return false;
        }
        if (i10 == 0 && Q1()) {
            D0();
        }
        h hVar = (h) C13466a.e(this.f56367L);
        if (this.f56385d0 < 0) {
            int iM = hVar.m();
            this.f56385d0 = iM;
            if (iM < 0) {
                return false;
            }
            this.f56409w.f55465d = hVar.i(iM);
            this.f56409w.o();
        }
        if (this.f56395n0 == 1) {
            if (!this.f56381Z) {
                this.f56398q0 = true;
                hVar.a(this.f56385d0, 0, 0, 0L, 4);
                G1();
            }
            this.f56395n0 = 2;
            return false;
        }
        if (this.f56379X) {
            this.f56379X = false;
            ByteBuffer byteBuffer = (ByteBuffer) C13466a.e(this.f56409w.f55465d);
            byte[] bArr = f56351E0;
            byteBuffer.put(bArr);
            hVar.a(this.f56385d0, 0, bArr.length, 0L, 0);
            G1();
            this.f56397p0 = true;
            return true;
        }
        if (this.f56394m0 == 1) {
            for (int i11 = 0; i11 < ((t) C13466a.e(this.f56368M)).f43952r.size(); i11++) {
                ((ByteBuffer) C13466a.e(this.f56409w.f55465d)).put(this.f56368M.f43952r.get(i11));
            }
            this.f56394m0 = 2;
        }
        int iPosition = ((ByteBuffer) C13466a.e(this.f56409w.f55465d)).position();
        G gV = V();
        try {
            int iO0 = o0(gV, this.f56409w, 0);
            if (iO0 == -3) {
                if (m()) {
                    this.f56404t0 = this.f56402s0;
                }
                return false;
            }
            if (iO0 == -5) {
                if (this.f56394m0 == 2) {
                    this.f56409w.o();
                    this.f56394m0 = 1;
                }
                q1(gV);
                return true;
            }
            if (this.f56409w.u()) {
                this.f56404t0 = this.f56402s0;
                if (this.f56394m0 == 2) {
                    this.f56409w.o();
                    this.f56394m0 = 1;
                }
                this.f56406u0 = true;
                if (!this.f56397p0) {
                    x1();
                    return false;
                }
                if (!this.f56381Z) {
                    this.f56398q0 = true;
                    hVar.a(this.f56385d0, 0, 0, 0L, 4);
                    G1();
                }
                return false;
            }
            if (!this.f56397p0 && !this.f56409w.z()) {
                this.f56409w.o();
                if (this.f56394m0 == 2) {
                    this.f56394m0 = 1;
                }
                return true;
            }
            if (O1(this.f56409w)) {
                return true;
            }
            boolean zH = this.f56409w.H();
            if (zH) {
                this.f56409w.f55464c.b(iPosition);
            }
            long j10 = this.f56409w.f55467f;
            if (this.f56410w0) {
                if (this.f56352A.isEmpty()) {
                    this.f56353A0.f56427d.a(j10, (t) C13466a.e(this.f56356C));
                } else {
                    this.f56352A.peekLast().f56427d.a(j10, (t) C13466a.e(this.f56356C));
                }
                this.f56410w0 = false;
            }
            this.f56402s0 = Math.max(this.f56402s0, j10);
            if (m() || this.f56409w.B()) {
                this.f56404t0 = this.f56402s0;
            }
            this.f56409w.G();
            if (this.f56409w.t()) {
                a1(this.f56409w);
            }
            v1(this.f56409w);
            int iN0 = N0(this.f56409w);
            if (zH) {
                ((h) C13466a.e(hVar)).c(this.f56385d0, 0, this.f56409w.f55464c, j10, iN0);
            } else {
                ((h) C13466a.e(hVar)).a(this.f56385d0, 0, ((ByteBuffer) C13466a.e(this.f56409w.f55465d)).limit(), j10, iN0);
            }
            G1();
            this.f56397p0 = true;
            this.f56394m0 = 0;
            this.f56416z0.f134216c++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e10) {
            n1(e10);
            A1(0);
            I0();
            return true;
        }
    }

    private void I0() {
        try {
            ((h) C13466a.i(this.f56367L)).flush();
        } finally {
            E1();
        }
    }

    private void I1(DrmSession drmSession) {
        DrmSession.c(this.f56360E, drmSession);
        this.f56360E = drmSession;
    }

    private void J1(d dVar) {
        this.f56353A0 = dVar;
        long j10 = dVar.f56426c;
        if (j10 != -9223372036854775807L) {
            this.f56357C0 = true;
            s1(j10);
        }
    }

    private List<j> L0(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        t tVar = (t) C13466a.e(this.f56356C);
        List<j> listS0 = S0(this.f56401s, tVar, z10);
        if (!listS0.isEmpty() || !z10) {
            return listS0;
        }
        List<j> listS02 = S0(this.f56401s, tVar, false);
        if (!listS02.isEmpty()) {
            d3.r.i("MediaCodecRenderer", "Drm session requires secure decoder for " + tVar.f43949o + ", but no secure decoder available. Trying to proceed with " + listS02 + ".");
        }
        return listS02;
    }

    private void M1(DrmSession drmSession) {
        DrmSession.c(this.f56361F, drmSession);
        this.f56361F = drmSession;
    }

    private boolean N1(long j10) {
        return this.f56364I == -9223372036854775807L || T().c() - j10 < this.f56364I;
    }

    protected static boolean U1(t tVar) {
        int i10 = tVar.f43933N;
        return i10 == 0 || i10 == 2;
    }

    private boolean V1(t tVar) throws ExoPlaybackException {
        if (P.f127086a >= 23 && this.f56367L != null && this.f56396o0 != 3 && getState() != 0) {
            float fQ0 = Q0(this.f56366K, (t) C13466a.e(tVar), Z());
            float f10 = this.f56371P;
            if (f10 == fQ0) {
                return true;
            }
            if (fQ0 == -1.0f) {
                D0();
                return false;
            }
            if (f10 == -1.0f && fQ0 <= this.f56405u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fQ0);
            ((h) C13466a.e(this.f56367L)).b(bundle);
            this.f56371P = fQ0;
        }
        return true;
    }

    private void W1() throws MediaCryptoException, ExoPlaybackException {
        InterfaceC14195b interfaceC14195bD = ((DrmSession) C13466a.e(this.f56361F)).d();
        if (interfaceC14195bD instanceof k3.l) {
            try {
                ((MediaCrypto) C13466a.e(this.f56363H)).setMediaDrmSession(((k3.l) interfaceC14195bD).f141225b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f56356C, 6006);
            }
        }
        I1(this.f56361F);
        this.f56395n0 = 0;
        this.f56396o0 = 0;
    }

    private boolean b1() {
        return this.f56386e0 >= 0;
    }

    private boolean c1() {
        if (!this.f56413y.P()) {
            return true;
        }
        long jX = X();
        return i1(jX, this.f56413y.N()) == i1(jX, this.f56411x.f55467f);
    }

    private void e1(j jVar, MediaCrypto mediaCrypto) throws Exception {
        t tVar = (t) C13466a.e(this.f56356C);
        String str = jVar.f56492a;
        int i10 = P.f127086a;
        float fQ0 = i10 < 23 ? -1.0f : Q0(this.f56366K, tVar, Z());
        float f10 = fQ0 > this.f56405u ? fQ0 : -1.0f;
        long jC = T().c();
        h.a aVarV0 = V0(jVar, tVar, mediaCrypto, f10);
        if (i10 >= 31) {
            b.a(aVarV0, Y());
        }
        try {
            K.a("createCodec:" + str);
            h hVarB = this.f56399r.b(aVarV0);
            this.f56367L = hVarB;
            this.f56383b0 = hVarB.d(new c());
            K.b();
            long jC2 = T().c();
            if (!jVar.o(tVar)) {
                d3.r.i("MediaCodecRenderer", P.F("Format exceeds selected codec's capabilities [%s, %s]", t.h(tVar), str));
            }
            this.f56374S = jVar;
            this.f56371P = f10;
            this.f56368M = tVar;
            this.f56375T = v0(str);
            this.f56376U = z0(str);
            this.f56377V = w0(str);
            this.f56378W = x0(str);
            this.f56381Z = y0(jVar) || P0();
            if (((h) C13466a.e(this.f56367L)).k()) {
                this.f56393l0 = true;
                this.f56394m0 = 1;
                this.f56379X = this.f56375T != 0;
            }
            if (getState() == 2) {
                this.f56384c0 = T().c() + 1000;
            }
            this.f56416z0.f134214a++;
            o1(str, aVarV0, jC2, jC2 - jC);
        } catch (Throwable th2) {
            K.b();
            throw th2;
        }
    }

    private boolean f1() throws ExoPlaybackException {
        C13466a.g(this.f56363H == null);
        DrmSession drmSession = this.f56360E;
        InterfaceC14195b interfaceC14195bD = drmSession.d();
        if (k3.l.f141223d && (interfaceC14195bD instanceof k3.l)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) C13466a.e(drmSession.getError());
                throw R(drmSessionException, this.f56356C, drmSessionException.f56095a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (interfaceC14195bD == null) {
            return drmSession.getError() != null;
        }
        if (interfaceC14195bD instanceof k3.l) {
            k3.l lVar = (k3.l) interfaceC14195bD;
            try {
                this.f56363H = new MediaCrypto(lVar.f141224a, lVar.f141225b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f56356C, 6006);
            }
        }
        return true;
    }

    private boolean i1(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        t tVar = this.f56358D;
        return (tVar != null && Objects.equals(tVar.f43949o, "audio/opus") && x3.H.g(j10, j11)) ? false : true;
    }

    private static boolean j1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void l1(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException, ExoPlaybackException {
        t tVar = (t) C13466a.e(this.f56356C);
        if (this.f56372Q == null) {
            try {
                List<j> listL0 = L0(z10);
                ArrayDeque<j> arrayDeque = new ArrayDeque<>();
                this.f56372Q = arrayDeque;
                if (this.f56403t) {
                    arrayDeque.addAll(listL0);
                } else if (!listL0.isEmpty()) {
                    this.f56372Q.add(listL0.get(0));
                }
                this.f56373R = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(tVar, e10, z10, -49998);
            }
        }
        if (this.f56372Q.isEmpty()) {
            throw new DecoderInitializationException(tVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) C13466a.e(this.f56372Q);
        while (this.f56367L == null) {
            j jVar = (j) C13466a.e((j) arrayDeque2.peekFirst());
            if (!m1(tVar) || !P1(jVar)) {
                return;
            }
            try {
                e1(jVar, mediaCrypto);
            } catch (Exception e11) {
                d3.r.j("MediaCodecRenderer", "Failed to initialize decoder: " + jVar, e11);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(tVar, e11, z10, jVar);
                n1(decoderInitializationException);
                if (this.f56373R == null) {
                    this.f56373R = decoderInitializationException;
                } else {
                    this.f56373R = this.f56373R.c(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f56373R;
                }
            }
        }
        this.f56372Q = null;
    }

    private void s0() throws ExoPlaybackException {
        C13466a.g(!this.f56406u0);
        G gV = V();
        this.f56411x.o();
        do {
            this.f56411x.o();
            int iO0 = o0(gV, this.f56411x, 0);
            if (iO0 == -5) {
                q1(gV);
                return;
            }
            if (iO0 == -4) {
                if (!this.f56411x.u()) {
                    this.f56402s0 = Math.max(this.f56402s0, this.f56411x.f55467f);
                    if (m() || this.f56409w.B()) {
                        this.f56404t0 = this.f56402s0;
                    }
                    if (this.f56410w0) {
                        t tVar = (t) C13466a.e(this.f56356C);
                        this.f56358D = tVar;
                        if (Objects.equals(tVar.f43949o, "audio/opus") && !this.f56358D.f43952r.isEmpty()) {
                            this.f56358D = this.f56358D.b().Z(x3.H.f(this.f56358D.f43952r.get(0))).N();
                        }
                        r1(this.f56358D, null);
                        this.f56410w0 = false;
                    }
                    this.f56411x.G();
                    t tVar2 = this.f56358D;
                    if (tVar2 != null && Objects.equals(tVar2.f43949o, "audio/opus")) {
                        if (this.f56411x.t()) {
                            DecoderInputBuffer decoderInputBuffer = this.f56411x;
                            decoderInputBuffer.f55463b = this.f56358D;
                            a1(decoderInputBuffer);
                        }
                        if (x3.H.g(X(), this.f56411x.f55467f)) {
                            this.f56354B.a(this.f56411x, this.f56358D.f43952r);
                        }
                    }
                    if (!c1()) {
                        break;
                    }
                } else {
                    this.f56406u0 = true;
                    this.f56404t0 = this.f56402s0;
                    return;
                }
            } else {
                if (iO0 != -3) {
                    throw new IllegalStateException();
                }
                if (m()) {
                    this.f56404t0 = this.f56402s0;
                    return;
                }
                return;
            }
        } while (this.f56413y.K(this.f56411x));
        this.f56391j0 = true;
    }

    private boolean t0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        C13466a.g(!this.f56408v0);
        if (this.f56413y.P()) {
            f fVar = this.f56413y;
            z10 = false;
            if (!y1(j10, j11, null, fVar.f55465d, this.f56386e0, 0, fVar.O(), this.f56413y.M(), i1(X(), this.f56413y.N()), this.f56413y.u(), (t) C13466a.e(this.f56358D))) {
                return false;
            }
            t1(this.f56413y.N());
            this.f56413y.o();
        } else {
            z10 = false;
        }
        if (this.f56406u0) {
            this.f56408v0 = true;
            return z10;
        }
        if (this.f56391j0) {
            C13466a.g(this.f56413y.K(this.f56411x));
            this.f56391j0 = z10;
        }
        if (this.f56392k0) {
            if (this.f56413y.P()) {
                return true;
            }
            B0();
            this.f56392k0 = z10;
            k1();
            if (!this.f56390i0) {
                return z10;
            }
        }
        s0();
        if (this.f56413y.P()) {
            this.f56413y.G();
        }
        if (this.f56413y.P() || this.f56406u0 || this.f56392k0) {
            return true;
        }
        return z10;
    }

    private int v0(String str) {
        int i10 = P.f127086a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Build.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean w0(String str) {
        return P.f127086a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean x0(String str) {
        return P.f127086a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    @TargetApi(23)
    private void x1() throws MediaCryptoException, ExoPlaybackException {
        int i10 = this.f56396o0;
        if (i10 == 1) {
            I0();
            return;
        }
        if (i10 == 2) {
            I0();
            W1();
        } else if (i10 == 3) {
            B1();
        } else {
            this.f56408v0 = true;
            D1();
        }
    }

    private static boolean y0(j jVar) {
        String str = jVar.f56492a;
        int i10 = P.f127086a;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && jVar.f56498g;
        }
        return true;
    }

    private static boolean z0(String str) {
        return P.f127086a == 29 && "c2.android.aac.decoder".equals(str);
    }

    protected MediaCodecDecoderException A0(Throwable th2, j jVar) {
        return new MediaCodecDecoderException(th2, jVar);
    }

    @Override // androidx.media3.exoplayer.H0
    public final long E(long j10, long j11) {
        return T0(j10, j11, this.f56383b0);
    }

    @Override // androidx.media3.exoplayer.H0
    public void J(float f10, float f11) throws ExoPlaybackException {
        this.f56365J = f10;
        this.f56366K = f11;
        V1(this.f56368M);
    }

    protected boolean K0() throws MediaCryptoException {
        if (this.f56367L == null) {
            return false;
        }
        int i10 = this.f56396o0;
        if (i10 == 3 || ((this.f56376U && !this.f56400r0) || (this.f56377V && this.f56398q0))) {
            C1();
            return true;
        }
        if (i10 == 2) {
            int i11 = P.f127086a;
            C13466a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    W1();
                } catch (ExoPlaybackException e10) {
                    d3.r.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    C1();
                    return true;
                }
            }
        }
        I0();
        return false;
    }

    protected final void L1(ExoPlaybackException exoPlaybackException) {
        this.f56414y0 = exoPlaybackException;
    }

    protected final h M0() {
        return this.f56367L;
    }

    protected final j O0() {
        return this.f56374S;
    }

    protected final MediaFormat R0() {
        return this.f56369N;
    }

    protected long U0() {
        return this.f56404t0;
    }

    protected final long W0() {
        return this.f56353A0.f56426c;
    }

    protected final long X0() {
        return this.f56353A0.f56425b;
    }

    protected final void X1(long j10) throws ExoPlaybackException {
        t tVarJ = this.f56353A0.f56427d.j(j10);
        if (tVarJ == null && this.f56357C0 && this.f56369N != null) {
            tVarJ = this.f56353A0.f56427d.i();
        }
        if (tVarJ != null) {
            this.f56358D = tVarJ;
        } else if (!this.f56370O || this.f56358D == null) {
            return;
        }
        r1((t) C13466a.e(this.f56358D), this.f56369N);
        this.f56370O = false;
        this.f56357C0 = false;
    }

    protected float Y0() {
        return this.f56365J;
    }

    protected final H0.a Z0() {
        return this.f56362G;
    }

    @Override // androidx.media3.exoplayer.I0
    public final int a(t tVar) throws ExoPlaybackException {
        try {
            return T1(this.f56401s, tVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw R(e10, tVar, 4002);
        }
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        if (this.f56356C == null) {
            return false;
        }
        if (c0() || b1()) {
            return true;
        }
        return this.f56384c0 != -9223372036854775807L && T().c() < this.f56384c0;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f56408v0;
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void e0(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f56416z0 = new C14333b();
    }

    protected final boolean g1() {
        return this.f56390i0;
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) throws MediaCryptoException, ExoPlaybackException {
        boolean z10 = false;
        if (this.f56412x0) {
            this.f56412x0 = false;
            x1();
        }
        ExoPlaybackException exoPlaybackException = this.f56414y0;
        if (exoPlaybackException != null) {
            this.f56414y0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f56408v0) {
                D1();
                return;
            }
            if (this.f56356C != null || A1(2)) {
                k1();
                if (this.f56390i0) {
                    K.a("bypassRender");
                    while (t0(j10, j11)) {
                    }
                    K.b();
                } else if (this.f56367L != null) {
                    long jC = T().c();
                    K.a("drainAndFeed");
                    while (F0(j10, j11) && N1(jC)) {
                    }
                    while (H0() && N1(jC)) {
                    }
                    K.b();
                } else {
                    this.f56416z0.f134217d += q0(j10);
                    A1(1);
                }
                this.f56416z0.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw R(e10, this.f56356C, P.X(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!j1(e11)) {
                throw e11;
            }
            n1(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                C1();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionA0 = A0(e11, O0());
            throw S(mediaCodecDecoderExceptionA0, this.f56356C, z10, mediaCodecDecoderExceptionA0.f56350c == 1101 ? 4006 : 4003);
        }
    }

    protected final boolean h1(t tVar) {
        return this.f56361F == null && S1(tVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void k1() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r3 = this;
            androidx.media3.exoplayer.mediacodec.h r0 = r3.f56367L
            if (r0 != 0) goto L6b
            boolean r0 = r3.f56390i0
            if (r0 != 0) goto L6b
            a3.t r0 = r3.f56356C
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            boolean r1 = r3.h1(r0)
            if (r1 == 0) goto L17
            r3.d1(r0)
            return
        L17:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56361F
            r3.I1(r1)
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56360E
            if (r1 == 0) goto L26
            boolean r1 = r3.f1()
            if (r1 == 0) goto L55
        L26:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56360E     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            if (r1 == 0) goto L4f
            int r1 = r1.getState()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r2 = 3
            if (r1 == r2) goto L3d
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56360E     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            int r1 = r1.getState()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r2 = 4
            if (r1 != r2) goto L4f
            goto L3d
        L3b:
            r1 = move-exception
            goto L64
        L3d:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56360E     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.String r2 = r0.f43949o     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.Object r2 = d3.C13466a.i(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            boolean r1 = r1.h(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            android.media.MediaCrypto r2 = r3.f56363H     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r3.l1(r2, r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
        L55:
            android.media.MediaCrypto r0 = r3.f56363H
            if (r0 == 0) goto L6b
            androidx.media3.exoplayer.mediacodec.h r1 = r3.f56367L
            if (r1 != 0) goto L6b
            r0.release()
            r0 = 0
            r3.f56363H = r0
            return
        L64:
            r2 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.ExoPlaybackException r0 = r3.R(r1, r0, r2)
            throw r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.k1():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.AbstractC6052h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m0(a3.t[] r12, long r13, long r15, androidx.media3.exoplayer.source.r.b r17) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r11 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r12 = r11.f56353A0
            long r0 = r12.f56426c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.J1(r4)
            boolean r12 = r11.f56359D0
            if (r12 == 0) goto L56
            r11.u1()
            return
        L24:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r12 = r11.f56352A
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.f56402s0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.f56355B0
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.J1(r4)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r12 = r11.f56353A0
            long r12 = r12.f56426c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.u1()
        L56:
            return
        L57:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r12 = r11.f56352A
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            long r1 = r11.f56402s0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.m0(a3.t[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }

    protected void t1(long j10) {
        this.f56355B0 = j10;
        while (!this.f56352A.isEmpty() && j10 >= this.f56352A.peek().f56424a) {
            J1((d) C13466a.e(this.f56352A.poll()));
            u1();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 11) {
            super.x(i10, obj);
            return;
        }
        H0.a aVar = (H0.a) C13466a.e((H0.a) obj);
        this.f56362G = aVar;
        w1(aVar);
    }

    public MediaCodecRenderer(int i10, h.b bVar, l lVar, boolean z10, float f10) {
        super(i10);
        this.f56399r = bVar;
        this.f56401s = (l) C13466a.e(lVar);
        this.f56403t = z10;
        this.f56405u = f10;
        this.f56407v = DecoderInputBuffer.I();
        this.f56409w = new DecoderInputBuffer(0);
        this.f56411x = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f56413y = fVar;
        this.f56415z = new MediaCodec.BufferInfo();
        this.f56365J = 1.0f;
        this.f56366K = 1.0f;
        this.f56364I = -9223372036854775807L;
        this.f56352A = new ArrayDeque<>();
        this.f56353A0 = d.f56423e;
        fVar.F(0);
        fVar.f55465d.order(ByteOrder.nativeOrder());
        this.f56354B = new H();
        this.f56371P = -1.0f;
        this.f56375T = 0;
        this.f56394m0 = 0;
        this.f56385d0 = -1;
        this.f56386e0 = -1;
        this.f56384c0 = -9223372036854775807L;
        this.f56402s0 = -9223372036854775807L;
        this.f56404t0 = -9223372036854775807L;
        this.f56355B0 = -9223372036854775807L;
        this.f56382a0 = -9223372036854775807L;
        this.f56395n0 = 0;
        this.f56396o0 = 0;
        this.f56416z0 = new C14333b();
    }

    private boolean A1(int i10) throws MediaCryptoException, ExoPlaybackException {
        G gV = V();
        this.f56407v.o();
        int iO0 = o0(gV, this.f56407v, i10 | 4);
        if (iO0 == -5) {
            q1(gV);
            return true;
        }
        if (iO0 == -4 && this.f56407v.u()) {
            this.f56406u0 = true;
            x1();
            return false;
        }
        return false;
    }

    private void B1() throws ExoPlaybackException {
        C1();
        k1();
    }

    private void d1(t tVar) {
        B0();
        String str = tVar.f43949o;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.f56413y.Q(1);
        } else {
            this.f56413y.Q(32);
        }
        this.f56390i0 = true;
    }

    protected void E1() {
        G1();
        H1();
        this.f56384c0 = -9223372036854775807L;
        this.f56398q0 = false;
        this.f56382a0 = -9223372036854775807L;
        this.f56397p0 = false;
        this.f56379X = false;
        this.f56380Y = false;
        this.f56388g0 = false;
        this.f56389h0 = false;
        this.f56402s0 = -9223372036854775807L;
        this.f56404t0 = -9223372036854775807L;
        this.f56355B0 = -9223372036854775807L;
        this.f56395n0 = 0;
        this.f56396o0 = 0;
        this.f56394m0 = this.f56393l0 ? 1 : 0;
    }

    protected void F1() {
        E1();
        this.f56414y0 = null;
        this.f56372Q = null;
        this.f56374S = null;
        this.f56368M = null;
        this.f56369N = null;
        this.f56370O = false;
        this.f56400r0 = false;
        this.f56371P = -1.0f;
        this.f56375T = 0;
        this.f56376U = false;
        this.f56377V = false;
        this.f56378W = false;
        this.f56381Z = false;
        this.f56383b0 = false;
        this.f56393l0 = false;
        this.f56394m0 = 0;
    }

    protected final boolean J0() throws MediaCryptoException, ExoPlaybackException {
        boolean zK0 = K0();
        if (zK0) {
            k1();
        }
        return zK0;
    }

    protected boolean O1(DecoderInputBuffer decoderInputBuffer) {
        if (R1(decoderInputBuffer)) {
            decoderInputBuffer.o();
            this.f56416z0.f134217d++;
            return true;
        }
        return false;
    }

    protected long T0(long j10, long j11, boolean z10) {
        return super.E(j10, j11);
    }
}
