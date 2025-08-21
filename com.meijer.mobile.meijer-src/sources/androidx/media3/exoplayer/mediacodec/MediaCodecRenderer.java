package androidx.media3.exoplayer.mediacodec;

import a3.C5652i;
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
import androidx.media3.exoplayer.AbstractC6194h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.h;
import d3.C13599a;
import d3.I;
import d3.K;
import d3.P;
import fsimpl.C14170dq;
import g3.InterfaceC14324b;
import h3.C14446b;
import h3.C14447c;
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
public abstract class MediaCodecRenderer extends AbstractC6194h {

    /* renamed from: E0, reason: collision with root package name */
    private static final byte[] f56575E0 = {0, 0, 1, 103, 66, -64, C14170dq.DST_ATOP, -38, 37, -112, 0, 0, 1, 104, -50, C14170dq.MULTIPLY, 19, 32, 0, 0, 1, 101, -120, -124, C14170dq.DARKEN, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    private final ArrayDeque<d> f56576A;

    /* renamed from: A0, reason: collision with root package name */
    private d f56577A0;

    /* renamed from: B, reason: collision with root package name */
    private final H f56578B;

    /* renamed from: B0, reason: collision with root package name */
    private long f56579B0;

    /* renamed from: C, reason: collision with root package name */
    private t f56580C;

    /* renamed from: C0, reason: collision with root package name */
    private boolean f56581C0;

    /* renamed from: D, reason: collision with root package name */
    private t f56582D;

    /* renamed from: D0, reason: collision with root package name */
    private boolean f56583D0;

    /* renamed from: E, reason: collision with root package name */
    private DrmSession f56584E;

    /* renamed from: F, reason: collision with root package name */
    private DrmSession f56585F;

    /* renamed from: G, reason: collision with root package name */
    private H0.a f56586G;

    /* renamed from: H, reason: collision with root package name */
    private MediaCrypto f56587H;

    /* renamed from: I, reason: collision with root package name */
    private long f56588I;

    /* renamed from: J, reason: collision with root package name */
    private float f56589J;

    /* renamed from: K, reason: collision with root package name */
    private float f56590K;

    /* renamed from: L, reason: collision with root package name */
    private h f56591L;

    /* renamed from: M, reason: collision with root package name */
    private t f56592M;

    /* renamed from: N, reason: collision with root package name */
    private MediaFormat f56593N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f56594O;

    /* renamed from: P, reason: collision with root package name */
    private float f56595P;

    /* renamed from: Q, reason: collision with root package name */
    private ArrayDeque<j> f56596Q;

    /* renamed from: R, reason: collision with root package name */
    private DecoderInitializationException f56597R;

    /* renamed from: S, reason: collision with root package name */
    private j f56598S;

    /* renamed from: T, reason: collision with root package name */
    private int f56599T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f56600U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f56601V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f56602W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f56603X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f56604Y;

    /* renamed from: Z, reason: collision with root package name */
    private boolean f56605Z;

    /* renamed from: a0, reason: collision with root package name */
    private long f56606a0;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f56607b0;

    /* renamed from: c0, reason: collision with root package name */
    private long f56608c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f56609d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f56610e0;

    /* renamed from: f0, reason: collision with root package name */
    private ByteBuffer f56611f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f56612g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f56613h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f56614i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f56615j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f56616k0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f56617l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f56618m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f56619n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f56620o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f56621p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f56622q0;

    /* renamed from: r, reason: collision with root package name */
    private final h.b f56623r;

    /* renamed from: r0, reason: collision with root package name */
    private boolean f56624r0;

    /* renamed from: s, reason: collision with root package name */
    private final l f56625s;

    /* renamed from: s0, reason: collision with root package name */
    private long f56626s0;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f56627t;

    /* renamed from: t0, reason: collision with root package name */
    private long f56628t0;

    /* renamed from: u, reason: collision with root package name */
    private final float f56629u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f56630u0;

    /* renamed from: v, reason: collision with root package name */
    private final DecoderInputBuffer f56631v;

    /* renamed from: v0, reason: collision with root package name */
    private boolean f56632v0;

    /* renamed from: w, reason: collision with root package name */
    private final DecoderInputBuffer f56633w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f56634w0;

    /* renamed from: x, reason: collision with root package name */
    private final DecoderInputBuffer f56635x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f56636x0;

    /* renamed from: y, reason: collision with root package name */
    private final f f56637y;

    /* renamed from: y0, reason: collision with root package name */
    private ExoPlaybackException f56638y0;

    /* renamed from: z, reason: collision with root package name */
    private final MediaCodec.BufferInfo f56639z;

    /* renamed from: z0, reason: collision with root package name */
    protected C14446b f56640z0;

    public static class DecoderInitializationException extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f56641a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56642b;

        /* renamed from: c, reason: collision with root package name */
        public final j f56643c;

        /* renamed from: d, reason: collision with root package name */
        public final String f56644d;

        /* renamed from: e, reason: collision with root package name */
        public final DecoderInitializationException f56645e;

        public DecoderInitializationException(t tVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + tVar, th2, tVar.f44767o, z10, null, b(i10), null);
        }

        private static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f56641a, this.f56642b, this.f56643c, this.f56644d, decoderInitializationException);
        }

        public DecoderInitializationException(t tVar, Throwable th2, boolean z10, j jVar) {
            this("Decoder init failed: " + jVar.f56716a + ", " + tVar, th2, tVar.f44767o, z10, jVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z10, j jVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f56641a = str2;
            this.f56642b = z10;
            this.f56643c = jVar;
            this.f56644d = str3;
            this.f56645e = decoderInitializationException;
        }
    }

    private final class c implements h.c {
        private c() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void a() {
            if (MediaCodecRenderer.this.f56586G != null) {
                MediaCodecRenderer.this.f56586G.b();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void b() {
            if (MediaCodecRenderer.this.f56586G != null) {
                MediaCodecRenderer.this.f56586G.b();
            }
        }
    }

    private void B0() {
        this.f56616k0 = false;
        this.f56637y.o();
        this.f56635x.o();
        this.f56615j0 = false;
        this.f56614i0 = false;
        this.f56578B.d();
    }

    private boolean G0(j jVar, t tVar, DrmSession drmSession, DrmSession drmSession2) throws ExoPlaybackException {
        InterfaceC14324b interfaceC14324bD;
        InterfaceC14324b interfaceC14324bD2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (interfaceC14324bD = drmSession2.d()) != null && (interfaceC14324bD2 = drmSession.d()) != null && interfaceC14324bD.getClass().equals(interfaceC14324bD2.getClass())) {
            if (!(interfaceC14324bD instanceof k3.l)) {
                return false;
            }
            if (!drmSession2.a().equals(drmSession.a()) || P.f127888a < 23) {
                return true;
            }
            UUID uuid = C5652i.f44654e;
            if (!uuid.equals(drmSession.a()) && !uuid.equals(drmSession2.a())) {
                return !jVar.f56722g && (drmSession2.getState() == 2 || ((drmSession2.getState() == 3 || drmSession2.getState() == 4) && drmSession2.h((String) C13599a.e(tVar.f44767o))));
            }
        }
        return true;
    }

    private void G1() {
        this.f56609d0 = -1;
        this.f56633w.f55689d = null;
    }

    private void H1() {
        this.f56610e0 = -1;
        this.f56611f0 = null;
    }

    private void z1() {
        this.f56624r0 = true;
        MediaFormat mediaFormatF = ((h) C13599a.e(this.f56591L)).f();
        if (this.f56599T != 0 && mediaFormatF.getInteger("width") == 32 && mediaFormatF.getInteger("height") == 32) {
            this.f56604Y = true;
        } else {
            this.f56593N = mediaFormatF;
            this.f56594O = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void C1() {
        try {
            h hVar = this.f56591L;
            if (hVar != null) {
                hVar.release();
                this.f56640z0.f134686b++;
                p1(((j) C13599a.e(this.f56598S)).f56716a);
            }
            this.f56591L = null;
            try {
                MediaCrypto mediaCrypto = this.f56587H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f56591L = null;
            try {
                MediaCrypto mediaCrypto2 = this.f56587H;
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
        this.f56636x0 = true;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h, androidx.media3.exoplayer.I0
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

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void d0() throws MediaCryptoException {
        this.f56580C = null;
        J1(d.f56647e);
        this.f56576A.clear();
        K0();
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void g0(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        this.f56630u0 = false;
        this.f56632v0 = false;
        this.f56636x0 = false;
        if (this.f56614i0) {
            this.f56637y.o();
            this.f56635x.o();
            this.f56615j0 = false;
            this.f56578B.d();
        } else {
            J0();
        }
        if (this.f56577A0.f56651d.l() > 0) {
            this.f56634w0 = true;
        }
        this.f56577A0.f56651d.c();
        this.f56576A.clear();
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void j0() {
        try {
            B0();
            C1();
        } finally {
            M1(null);
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void k0() {
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
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
    protected h3.C14447c q1(h3.G r12) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.q1(h3.G):h3.c");
    }

    protected abstract void r1(t tVar, MediaFormat mediaFormat) throws ExoPlaybackException;

    protected void s1(long j10) {
    }

    protected abstract C14447c u0(j jVar, t tVar, t tVar2);

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
                aVar.f56710b.setString("log-session-id", logSessionIdA.getStringId());
            }
        }
    }

    private static final class d {

        /* renamed from: e, reason: collision with root package name */
        public static final d f56647e = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f56648a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56649b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56650c;

        /* renamed from: d, reason: collision with root package name */
        public final I<t> f56651d = new I<>();

        public d(long j10, long j11, long j12) {
            this.f56648a = j10;
            this.f56649b = j11;
            this.f56650c = j12;
        }
    }

    private boolean C0() {
        if (this.f56621p0) {
            this.f56619n0 = 1;
            if (this.f56601V) {
                this.f56620o0 = 3;
                return false;
            }
            this.f56620o0 = 1;
        }
        return true;
    }

    private void D0() throws ExoPlaybackException {
        if (!this.f56621p0) {
            B1();
        } else {
            this.f56619n0 = 1;
            this.f56620o0 = 3;
        }
    }

    @TargetApi(23)
    private boolean E0() throws MediaCryptoException, ExoPlaybackException {
        if (this.f56621p0) {
            this.f56619n0 = 1;
            if (this.f56601V) {
                this.f56620o0 = 3;
                return false;
            }
            this.f56620o0 = 2;
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
        h hVar = (h) C13599a.e(this.f56591L);
        if (!b1()) {
            if (this.f56602W && this.f56622q0) {
                try {
                    iN = hVar.n(this.f56639z);
                } catch (IllegalStateException unused) {
                    x1();
                    if (this.f56632v0) {
                        C1();
                    }
                    return false;
                }
            } else {
                iN = hVar.n(this.f56639z);
            }
            if (iN < 0) {
                if (iN == -2) {
                    z1();
                    return true;
                }
                if (this.f56605Z && (this.f56630u0 || this.f56619n0 == 2)) {
                    x1();
                }
                long j12 = this.f56606a0;
                if (j12 != -9223372036854775807L && j12 + 100 < T().a()) {
                    x1();
                }
                return false;
            }
            if (this.f56604Y) {
                this.f56604Y = false;
                hVar.o(iN, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f56639z;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                x1();
                return false;
            }
            this.f56610e0 = iN;
            ByteBuffer byteBufferP = hVar.p(iN);
            this.f56611f0 = byteBufferP;
            if (byteBufferP != null) {
                byteBufferP.position(this.f56639z.offset);
                ByteBuffer byteBuffer2 = this.f56611f0;
                MediaCodec.BufferInfo bufferInfo3 = this.f56639z;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            this.f56612g0 = this.f56639z.presentationTimeUs < X();
            long j13 = this.f56628t0;
            this.f56613h0 = j13 != -9223372036854775807L && j13 <= this.f56639z.presentationTimeUs;
            X1(this.f56639z.presentationTimeUs);
        }
        if (this.f56602W && this.f56622q0) {
            try {
                byteBuffer = this.f56611f0;
                i10 = this.f56610e0;
                bufferInfo = this.f56639z;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zY1 = y1(j10, j11, hVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f56612g0, this.f56613h0, (t) C13599a.e(this.f56582D));
            } catch (IllegalStateException unused3) {
                x1();
                if (this.f56632v0) {
                    C1();
                }
                return z10;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.f56611f0;
            int i11 = this.f56610e0;
            MediaCodec.BufferInfo bufferInfo4 = this.f56639z;
            zY1 = y1(j10, j11, hVar, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f56612g0, this.f56613h0, (t) C13599a.e(this.f56582D));
        }
        if (zY1) {
            t1(this.f56639z.presentationTimeUs);
            boolean z11 = (this.f56639z.flags & 4) != 0 ? true : z10;
            if (!z11 && this.f56622q0 && this.f56613h0) {
                this.f56606a0 = T().a();
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
        if (this.f56591L == null || (i10 = this.f56619n0) == 2 || this.f56630u0) {
            return false;
        }
        if (i10 == 0 && Q1()) {
            D0();
        }
        h hVar = (h) C13599a.e(this.f56591L);
        if (this.f56609d0 < 0) {
            int iM = hVar.m();
            this.f56609d0 = iM;
            if (iM < 0) {
                return false;
            }
            this.f56633w.f55689d = hVar.i(iM);
            this.f56633w.o();
        }
        if (this.f56619n0 == 1) {
            if (!this.f56605Z) {
                this.f56622q0 = true;
                hVar.a(this.f56609d0, 0, 0, 0L, 4);
                G1();
            }
            this.f56619n0 = 2;
            return false;
        }
        if (this.f56603X) {
            this.f56603X = false;
            ByteBuffer byteBuffer = (ByteBuffer) C13599a.e(this.f56633w.f55689d);
            byte[] bArr = f56575E0;
            byteBuffer.put(bArr);
            hVar.a(this.f56609d0, 0, bArr.length, 0L, 0);
            G1();
            this.f56621p0 = true;
            return true;
        }
        if (this.f56618m0 == 1) {
            for (int i11 = 0; i11 < ((t) C13599a.e(this.f56592M)).f44770r.size(); i11++) {
                ((ByteBuffer) C13599a.e(this.f56633w.f55689d)).put(this.f56592M.f44770r.get(i11));
            }
            this.f56618m0 = 2;
        }
        int iPosition = ((ByteBuffer) C13599a.e(this.f56633w.f55689d)).position();
        G gV = V();
        try {
            int iO0 = o0(gV, this.f56633w, 0);
            if (iO0 == -3) {
                if (m()) {
                    this.f56628t0 = this.f56626s0;
                }
                return false;
            }
            if (iO0 == -5) {
                if (this.f56618m0 == 2) {
                    this.f56633w.o();
                    this.f56618m0 = 1;
                }
                q1(gV);
                return true;
            }
            if (this.f56633w.u()) {
                this.f56628t0 = this.f56626s0;
                if (this.f56618m0 == 2) {
                    this.f56633w.o();
                    this.f56618m0 = 1;
                }
                this.f56630u0 = true;
                if (!this.f56621p0) {
                    x1();
                    return false;
                }
                if (!this.f56605Z) {
                    this.f56622q0 = true;
                    hVar.a(this.f56609d0, 0, 0, 0L, 4);
                    G1();
                }
                return false;
            }
            if (!this.f56621p0 && !this.f56633w.z()) {
                this.f56633w.o();
                if (this.f56618m0 == 2) {
                    this.f56618m0 = 1;
                }
                return true;
            }
            if (O1(this.f56633w)) {
                return true;
            }
            boolean zH = this.f56633w.H();
            if (zH) {
                this.f56633w.f55688c.b(iPosition);
            }
            long j10 = this.f56633w.f55691f;
            if (this.f56634w0) {
                if (this.f56576A.isEmpty()) {
                    this.f56577A0.f56651d.a(j10, (t) C13599a.e(this.f56580C));
                } else {
                    this.f56576A.peekLast().f56651d.a(j10, (t) C13599a.e(this.f56580C));
                }
                this.f56634w0 = false;
            }
            this.f56626s0 = Math.max(this.f56626s0, j10);
            if (m() || this.f56633w.B()) {
                this.f56628t0 = this.f56626s0;
            }
            this.f56633w.G();
            if (this.f56633w.t()) {
                a1(this.f56633w);
            }
            v1(this.f56633w);
            int iN0 = N0(this.f56633w);
            if (zH) {
                ((h) C13599a.e(hVar)).c(this.f56609d0, 0, this.f56633w.f55688c, j10, iN0);
            } else {
                ((h) C13599a.e(hVar)).a(this.f56609d0, 0, ((ByteBuffer) C13599a.e(this.f56633w.f55689d)).limit(), j10, iN0);
            }
            G1();
            this.f56621p0 = true;
            this.f56618m0 = 0;
            this.f56640z0.f134687c++;
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
            ((h) C13599a.i(this.f56591L)).flush();
        } finally {
            E1();
        }
    }

    private void I1(DrmSession drmSession) {
        DrmSession.c(this.f56584E, drmSession);
        this.f56584E = drmSession;
    }

    private void J1(d dVar) {
        this.f56577A0 = dVar;
        long j10 = dVar.f56650c;
        if (j10 != -9223372036854775807L) {
            this.f56581C0 = true;
            s1(j10);
        }
    }

    private List<j> L0(boolean z10) throws MediaCodecUtil.DecoderQueryException {
        t tVar = (t) C13599a.e(this.f56580C);
        List<j> listS0 = S0(this.f56625s, tVar, z10);
        if (!listS0.isEmpty() || !z10) {
            return listS0;
        }
        List<j> listS02 = S0(this.f56625s, tVar, false);
        if (!listS02.isEmpty()) {
            d3.r.i("MediaCodecRenderer", "Drm session requires secure decoder for " + tVar.f44767o + ", but no secure decoder available. Trying to proceed with " + listS02 + ".");
        }
        return listS02;
    }

    private void M1(DrmSession drmSession) {
        DrmSession.c(this.f56585F, drmSession);
        this.f56585F = drmSession;
    }

    private boolean N1(long j10) {
        return this.f56588I == -9223372036854775807L || T().c() - j10 < this.f56588I;
    }

    protected static boolean U1(t tVar) {
        int i10 = tVar.f44751N;
        return i10 == 0 || i10 == 2;
    }

    private boolean V1(t tVar) throws ExoPlaybackException {
        if (P.f127888a >= 23 && this.f56591L != null && this.f56620o0 != 3 && getState() != 0) {
            float fQ0 = Q0(this.f56590K, (t) C13599a.e(tVar), Z());
            float f10 = this.f56595P;
            if (f10 == fQ0) {
                return true;
            }
            if (fQ0 == -1.0f) {
                D0();
                return false;
            }
            if (f10 == -1.0f && fQ0 <= this.f56629u) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fQ0);
            ((h) C13599a.e(this.f56591L)).b(bundle);
            this.f56595P = fQ0;
        }
        return true;
    }

    private void W1() throws MediaCryptoException, ExoPlaybackException {
        InterfaceC14324b interfaceC14324bD = ((DrmSession) C13599a.e(this.f56585F)).d();
        if (interfaceC14324bD instanceof k3.l) {
            try {
                ((MediaCrypto) C13599a.e(this.f56587H)).setMediaDrmSession(((k3.l) interfaceC14324bD).f141418b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f56580C, 6006);
            }
        }
        I1(this.f56585F);
        this.f56619n0 = 0;
        this.f56620o0 = 0;
    }

    private boolean b1() {
        return this.f56610e0 >= 0;
    }

    private boolean c1() {
        if (!this.f56637y.P()) {
            return true;
        }
        long jX = X();
        return i1(jX, this.f56637y.N()) == i1(jX, this.f56635x.f55691f);
    }

    private void e1(j jVar, MediaCrypto mediaCrypto) throws Exception {
        t tVar = (t) C13599a.e(this.f56580C);
        String str = jVar.f56716a;
        int i10 = P.f127888a;
        float fQ0 = i10 < 23 ? -1.0f : Q0(this.f56590K, tVar, Z());
        float f10 = fQ0 > this.f56629u ? fQ0 : -1.0f;
        long jC = T().c();
        h.a aVarV0 = V0(jVar, tVar, mediaCrypto, f10);
        if (i10 >= 31) {
            b.a(aVarV0, Y());
        }
        try {
            K.a("createCodec:" + str);
            h hVarB = this.f56623r.b(aVarV0);
            this.f56591L = hVarB;
            this.f56607b0 = hVarB.d(new c());
            K.b();
            long jC2 = T().c();
            if (!jVar.o(tVar)) {
                d3.r.i("MediaCodecRenderer", P.F("Format exceeds selected codec's capabilities [%s, %s]", t.h(tVar), str));
            }
            this.f56598S = jVar;
            this.f56595P = f10;
            this.f56592M = tVar;
            this.f56599T = v0(str);
            this.f56600U = z0(str);
            this.f56601V = w0(str);
            this.f56602W = x0(str);
            this.f56605Z = y0(jVar) || P0();
            if (((h) C13599a.e(this.f56591L)).k()) {
                this.f56617l0 = true;
                this.f56618m0 = 1;
                this.f56603X = this.f56599T != 0;
            }
            if (getState() == 2) {
                this.f56608c0 = T().c() + 1000;
            }
            this.f56640z0.f134685a++;
            o1(str, aVarV0, jC2, jC2 - jC);
        } catch (Throwable th2) {
            K.b();
            throw th2;
        }
    }

    private boolean f1() throws ExoPlaybackException {
        C13599a.g(this.f56587H == null);
        DrmSession drmSession = this.f56584E;
        InterfaceC14324b interfaceC14324bD = drmSession.d();
        if (k3.l.f141416d && (interfaceC14324bD instanceof k3.l)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) C13599a.e(drmSession.getError());
                throw R(drmSessionException, this.f56580C, drmSessionException.f56319a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (interfaceC14324bD == null) {
            return drmSession.getError() != null;
        }
        if (interfaceC14324bD instanceof k3.l) {
            k3.l lVar = (k3.l) interfaceC14324bD;
            try {
                this.f56587H = new MediaCrypto(lVar.f141417a, lVar.f141418b);
            } catch (MediaCryptoException e10) {
                throw R(e10, this.f56580C, 6006);
            }
        }
        return true;
    }

    private boolean i1(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        t tVar = this.f56582D;
        return (tVar != null && Objects.equals(tVar.f44767o, "audio/opus") && x3.H.g(j10, j11)) ? false : true;
    }

    private static boolean j1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void l1(MediaCrypto mediaCrypto, boolean z10) throws DecoderInitializationException, ExoPlaybackException {
        t tVar = (t) C13599a.e(this.f56580C);
        if (this.f56596Q == null) {
            try {
                List<j> listL0 = L0(z10);
                ArrayDeque<j> arrayDeque = new ArrayDeque<>();
                this.f56596Q = arrayDeque;
                if (this.f56627t) {
                    arrayDeque.addAll(listL0);
                } else if (!listL0.isEmpty()) {
                    this.f56596Q.add(listL0.get(0));
                }
                this.f56597R = null;
            } catch (MediaCodecUtil.DecoderQueryException e10) {
                throw new DecoderInitializationException(tVar, e10, z10, -49998);
            }
        }
        if (this.f56596Q.isEmpty()) {
            throw new DecoderInitializationException(tVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) C13599a.e(this.f56596Q);
        while (this.f56591L == null) {
            j jVar = (j) C13599a.e((j) arrayDeque2.peekFirst());
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
                if (this.f56597R == null) {
                    this.f56597R = decoderInitializationException;
                } else {
                    this.f56597R = this.f56597R.c(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f56597R;
                }
            }
        }
        this.f56596Q = null;
    }

    private void s0() throws ExoPlaybackException {
        C13599a.g(!this.f56630u0);
        G gV = V();
        this.f56635x.o();
        do {
            this.f56635x.o();
            int iO0 = o0(gV, this.f56635x, 0);
            if (iO0 == -5) {
                q1(gV);
                return;
            }
            if (iO0 == -4) {
                if (!this.f56635x.u()) {
                    this.f56626s0 = Math.max(this.f56626s0, this.f56635x.f55691f);
                    if (m() || this.f56633w.B()) {
                        this.f56628t0 = this.f56626s0;
                    }
                    if (this.f56634w0) {
                        t tVar = (t) C13599a.e(this.f56580C);
                        this.f56582D = tVar;
                        if (Objects.equals(tVar.f44767o, "audio/opus") && !this.f56582D.f44770r.isEmpty()) {
                            this.f56582D = this.f56582D.b().Z(x3.H.f(this.f56582D.f44770r.get(0))).N();
                        }
                        r1(this.f56582D, null);
                        this.f56634w0 = false;
                    }
                    this.f56635x.G();
                    t tVar2 = this.f56582D;
                    if (tVar2 != null && Objects.equals(tVar2.f44767o, "audio/opus")) {
                        if (this.f56635x.t()) {
                            DecoderInputBuffer decoderInputBuffer = this.f56635x;
                            decoderInputBuffer.f55687b = this.f56582D;
                            a1(decoderInputBuffer);
                        }
                        if (x3.H.g(X(), this.f56635x.f55691f)) {
                            this.f56578B.a(this.f56635x, this.f56582D.f44770r);
                        }
                    }
                    if (!c1()) {
                        break;
                    }
                } else {
                    this.f56630u0 = true;
                    this.f56628t0 = this.f56626s0;
                    return;
                }
            } else {
                if (iO0 != -3) {
                    throw new IllegalStateException();
                }
                if (m()) {
                    this.f56628t0 = this.f56626s0;
                    return;
                }
                return;
            }
        } while (this.f56637y.K(this.f56635x));
        this.f56615j0 = true;
    }

    private boolean t0(long j10, long j11) throws ExoPlaybackException {
        boolean z10;
        C13599a.g(!this.f56632v0);
        if (this.f56637y.P()) {
            f fVar = this.f56637y;
            z10 = false;
            if (!y1(j10, j11, null, fVar.f55689d, this.f56610e0, 0, fVar.O(), this.f56637y.M(), i1(X(), this.f56637y.N()), this.f56637y.u(), (t) C13599a.e(this.f56582D))) {
                return false;
            }
            t1(this.f56637y.N());
            this.f56637y.o();
        } else {
            z10 = false;
        }
        if (this.f56630u0) {
            this.f56632v0 = true;
            return z10;
        }
        if (this.f56615j0) {
            C13599a.g(this.f56637y.K(this.f56635x));
            this.f56615j0 = z10;
        }
        if (this.f56616k0) {
            if (this.f56637y.P()) {
                return true;
            }
            B0();
            this.f56616k0 = z10;
            k1();
            if (!this.f56614i0) {
                return z10;
            }
        }
        s0();
        if (this.f56637y.P()) {
            this.f56637y.G();
        }
        if (this.f56637y.P() || this.f56630u0 || this.f56616k0) {
            return true;
        }
        return z10;
    }

    private int v0(String str) {
        int i10 = P.f127888a;
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
        return P.f127888a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean x0(String str) {
        return P.f127888a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    @TargetApi(23)
    private void x1() throws MediaCryptoException, ExoPlaybackException {
        int i10 = this.f56620o0;
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
            this.f56632v0 = true;
            D1();
        }
    }

    private static boolean y0(j jVar) {
        String str = jVar.f56716a;
        int i10 = P.f127888a;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && jVar.f56722g;
        }
        return true;
    }

    private static boolean z0(String str) {
        return P.f127888a == 29 && "c2.android.aac.decoder".equals(str);
    }

    protected MediaCodecDecoderException A0(Throwable th2, j jVar) {
        return new MediaCodecDecoderException(th2, jVar);
    }

    @Override // androidx.media3.exoplayer.H0
    public final long E(long j10, long j11) {
        return T0(j10, j11, this.f56607b0);
    }

    @Override // androidx.media3.exoplayer.H0
    public void J(float f10, float f11) throws ExoPlaybackException {
        this.f56589J = f10;
        this.f56590K = f11;
        V1(this.f56592M);
    }

    protected boolean K0() throws MediaCryptoException {
        if (this.f56591L == null) {
            return false;
        }
        int i10 = this.f56620o0;
        if (i10 == 3 || ((this.f56600U && !this.f56624r0) || (this.f56601V && this.f56622q0))) {
            C1();
            return true;
        }
        if (i10 == 2) {
            int i11 = P.f127888a;
            C13599a.g(i11 >= 23);
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
        this.f56638y0 = exoPlaybackException;
    }

    protected final h M0() {
        return this.f56591L;
    }

    protected final j O0() {
        return this.f56598S;
    }

    protected final MediaFormat R0() {
        return this.f56593N;
    }

    protected long U0() {
        return this.f56628t0;
    }

    protected final long W0() {
        return this.f56577A0.f56650c;
    }

    protected final long X0() {
        return this.f56577A0.f56649b;
    }

    protected final void X1(long j10) throws ExoPlaybackException {
        t tVarJ = this.f56577A0.f56651d.j(j10);
        if (tVarJ == null && this.f56581C0 && this.f56593N != null) {
            tVarJ = this.f56577A0.f56651d.i();
        }
        if (tVarJ != null) {
            this.f56582D = tVarJ;
        } else if (!this.f56594O || this.f56582D == null) {
            return;
        }
        r1((t) C13599a.e(this.f56582D), this.f56593N);
        this.f56594O = false;
        this.f56581C0 = false;
    }

    protected float Y0() {
        return this.f56589J;
    }

    protected final H0.a Z0() {
        return this.f56586G;
    }

    @Override // androidx.media3.exoplayer.I0
    public final int a(t tVar) throws ExoPlaybackException {
        try {
            return T1(this.f56625s, tVar);
        } catch (MediaCodecUtil.DecoderQueryException e10) {
            throw R(e10, tVar, 4002);
        }
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        if (this.f56580C == null) {
            return false;
        }
        if (c0() || b1()) {
            return true;
        }
        return this.f56608c0 != -9223372036854775807L && T().c() < this.f56608c0;
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f56632v0;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void e0(boolean z10, boolean z11) throws ExoPlaybackException {
        this.f56640z0 = new C14446b();
    }

    protected final boolean g1() {
        return this.f56614i0;
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) throws MediaCryptoException, ExoPlaybackException {
        boolean z10 = false;
        if (this.f56636x0) {
            this.f56636x0 = false;
            x1();
        }
        ExoPlaybackException exoPlaybackException = this.f56638y0;
        if (exoPlaybackException != null) {
            this.f56638y0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f56632v0) {
                D1();
                return;
            }
            if (this.f56580C != null || A1(2)) {
                k1();
                if (this.f56614i0) {
                    K.a("bypassRender");
                    while (t0(j10, j11)) {
                    }
                    K.b();
                } else if (this.f56591L != null) {
                    long jC = T().c();
                    K.a("drainAndFeed");
                    while (F0(j10, j11) && N1(jC)) {
                    }
                    while (H0() && N1(jC)) {
                    }
                    K.b();
                } else {
                    this.f56640z0.f134688d += q0(j10);
                    A1(1);
                }
                this.f56640z0.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw R(e10, this.f56580C, P.X(e10.getErrorCode()));
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
            throw S(mediaCodecDecoderExceptionA0, this.f56580C, z10, mediaCodecDecoderExceptionA0.f56574c == 1101 ? 4006 : 4003);
        }
    }

    protected final boolean h1(t tVar) {
        return this.f56585F == null && S1(tVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void k1() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r3 = this;
            androidx.media3.exoplayer.mediacodec.h r0 = r3.f56591L
            if (r0 != 0) goto L6b
            boolean r0 = r3.f56614i0
            if (r0 != 0) goto L6b
            a3.t r0 = r3.f56580C
            if (r0 != 0) goto Ld
            goto L6b
        Ld:
            boolean r1 = r3.h1(r0)
            if (r1 == 0) goto L17
            r3.d1(r0)
            return
        L17:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56585F
            r3.I1(r1)
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56584E
            if (r1 == 0) goto L26
            boolean r1 = r3.f1()
            if (r1 == 0) goto L55
        L26:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56584E     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            if (r1 == 0) goto L4f
            int r1 = r1.getState()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r2 = 3
            if (r1 == r2) goto L3d
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56584E     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            int r1 = r1.getState()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r2 = 4
            if (r1 != r2) goto L4f
            goto L3d
        L3b:
            r1 = move-exception
            goto L64
        L3d:
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.f56584E     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.String r2 = r0.f44767o     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.Object r2 = d3.C13599a.i(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            boolean r1 = r1.h(r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            if (r1 == 0) goto L4f
            r1 = 1
            goto L50
        L4f:
            r1 = 0
        L50:
            android.media.MediaCrypto r2 = r3.f56587H     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
            r3.l1(r2, r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.DecoderInitializationException -> L3b
        L55:
            android.media.MediaCrypto r0 = r3.f56587H
            if (r0 == 0) goto L6b
            androidx.media3.exoplayer.mediacodec.h r1 = r3.f56591L
            if (r1 != 0) goto L6b
            r0.release()
            r0 = 0
            r3.f56587H = r0
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
    @Override // androidx.media3.exoplayer.AbstractC6194h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void m0(a3.t[] r12, long r13, long r15, androidx.media3.exoplayer.source.r.b r17) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r11 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r12 = r11.f56577A0
            long r0 = r12.f56650c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.J1(r4)
            boolean r12 = r11.f56583D0
            if (r12 == 0) goto L56
            r11.u1()
            return
        L24:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r12 = r11.f56576A
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.f56626s0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.f56579B0
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
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r12 = r11.f56577A0
            long r12 = r12.f56650c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.u1()
        L56:
            return
        L57:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r12 = r11.f56576A
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            long r1 = r11.f56626s0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.m0(a3.t[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }

    protected void t1(long j10) {
        this.f56579B0 = j10;
        while (!this.f56576A.isEmpty() && j10 >= this.f56576A.peek().f56648a) {
            J1((d) C13599a.e(this.f56576A.poll()));
            u1();
        }
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 != 11) {
            super.x(i10, obj);
            return;
        }
        H0.a aVar = (H0.a) C13599a.e((H0.a) obj);
        this.f56586G = aVar;
        w1(aVar);
    }

    public MediaCodecRenderer(int i10, h.b bVar, l lVar, boolean z10, float f10) {
        super(i10);
        this.f56623r = bVar;
        this.f56625s = (l) C13599a.e(lVar);
        this.f56627t = z10;
        this.f56629u = f10;
        this.f56631v = DecoderInputBuffer.I();
        this.f56633w = new DecoderInputBuffer(0);
        this.f56635x = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f56637y = fVar;
        this.f56639z = new MediaCodec.BufferInfo();
        this.f56589J = 1.0f;
        this.f56590K = 1.0f;
        this.f56588I = -9223372036854775807L;
        this.f56576A = new ArrayDeque<>();
        this.f56577A0 = d.f56647e;
        fVar.F(0);
        fVar.f55689d.order(ByteOrder.nativeOrder());
        this.f56578B = new H();
        this.f56595P = -1.0f;
        this.f56599T = 0;
        this.f56618m0 = 0;
        this.f56609d0 = -1;
        this.f56610e0 = -1;
        this.f56608c0 = -9223372036854775807L;
        this.f56626s0 = -9223372036854775807L;
        this.f56628t0 = -9223372036854775807L;
        this.f56579B0 = -9223372036854775807L;
        this.f56606a0 = -9223372036854775807L;
        this.f56619n0 = 0;
        this.f56620o0 = 0;
        this.f56640z0 = new C14446b();
    }

    private boolean A1(int i10) throws MediaCryptoException, ExoPlaybackException {
        G gV = V();
        this.f56631v.o();
        int iO0 = o0(gV, this.f56631v, i10 | 4);
        if (iO0 == -5) {
            q1(gV);
            return true;
        }
        if (iO0 == -4 && this.f56631v.u()) {
            this.f56630u0 = true;
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
        String str = tVar.f44767o;
        if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
            this.f56637y.Q(1);
        } else {
            this.f56637y.Q(32);
        }
        this.f56614i0 = true;
    }

    protected void E1() {
        G1();
        H1();
        this.f56608c0 = -9223372036854775807L;
        this.f56622q0 = false;
        this.f56606a0 = -9223372036854775807L;
        this.f56621p0 = false;
        this.f56603X = false;
        this.f56604Y = false;
        this.f56612g0 = false;
        this.f56613h0 = false;
        this.f56626s0 = -9223372036854775807L;
        this.f56628t0 = -9223372036854775807L;
        this.f56579B0 = -9223372036854775807L;
        this.f56619n0 = 0;
        this.f56620o0 = 0;
        this.f56618m0 = this.f56617l0 ? 1 : 0;
    }

    protected void F1() {
        E1();
        this.f56638y0 = null;
        this.f56596Q = null;
        this.f56598S = null;
        this.f56592M = null;
        this.f56593N = null;
        this.f56594O = false;
        this.f56624r0 = false;
        this.f56595P = -1.0f;
        this.f56599T = 0;
        this.f56600U = false;
        this.f56601V = false;
        this.f56602W = false;
        this.f56605Z = false;
        this.f56607b0 = false;
        this.f56617l0 = false;
        this.f56618m0 = 0;
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
            this.f56640z0.f134688d++;
            return true;
        }
        return false;
    }

    protected long T0(long j10, long j11, boolean z10) {
        return super.E(j10, j11);
    }
}
