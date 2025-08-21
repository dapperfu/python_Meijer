package androidx.media3.exoplayer.audio;

import Ee.L;
import a3.C5643A;
import a3.C5647d;
import a3.C5650g;
import a3.t;
import a3.z;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.e;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13599a;
import d3.P;
import d3.r;
import d3.u;
import h3.C14447c;
import h3.G;
import h3.I;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import x3.S;

/* loaded from: classes.dex */
public class m extends MediaCodecRenderer implements I {

    /* renamed from: F0, reason: collision with root package name */
    private final Context f56207F0;

    /* renamed from: G0, reason: collision with root package name */
    private final e.a f56208G0;

    /* renamed from: H0, reason: collision with root package name */
    private final AudioSink f56209H0;

    /* renamed from: I0, reason: collision with root package name */
    private final n3.h f56210I0;

    /* renamed from: J0, reason: collision with root package name */
    private int f56211J0;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f56212K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f56213L0;

    /* renamed from: M0, reason: collision with root package name */
    private t f56214M0;

    /* renamed from: N0, reason: collision with root package name */
    private t f56215N0;

    /* renamed from: O0, reason: collision with root package name */
    private long f56216O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f56217P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f56218Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f56219R0;

    /* renamed from: S0, reason: collision with root package name */
    private int f56220S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f56221T0;

    /* renamed from: U0, reason: collision with root package name */
    private long f56222U0;

    private static final class b {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    private final class c implements AudioSink.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void a(AudioSink.a aVar) {
            m.this.f56208G0.o(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void b(AudioSink.a aVar) {
            m.this.f56208G0.p(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void c(boolean z10) {
            m.this.f56208G0.w(z10);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void d(Exception exc) {
            r.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            m.this.f56208G0.n(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void e(long j10) {
            m.this.f56208G0.v(j10);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void f() {
            m.this.f56219R0 = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void g() {
            H0.a aVarZ0 = m.this.Z0();
            if (aVarZ0 != null) {
                aVarZ0.a();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void h(int i10, long j10, long j11) {
            m.this.f56208G0.x(i10, j10, j11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void i() {
            m.this.i0();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void j() {
            m.this.l2();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void k() {
            H0.a aVarZ0 = m.this.Z0();
            if (aVarZ0 != null) {
                aVarZ0.b();
            }
        }
    }

    public m(Context context, h.b bVar, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, e eVar, AudioSink audioSink) {
        this(context, bVar, lVar, z10, handler, eVar, audioSink, P.f127888a >= 35 ? new n3.h() : null);
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h, androidx.media3.exoplayer.H0
    public I P() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float Q0(float f10, t tVar, t[] tVarArr) {
        int iMax = -1;
        for (t tVar2 : tVarArr) {
            int i10 = tVar2.f44743F;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6194h
    protected void d0() {
        this.f56218Q0 = true;
        this.f56214M0 = null;
        this.f56222U0 = -9223372036854775807L;
        try {
            this.f56209H0.flush();
            try {
                super.d0();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.d0();
                throw th2;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6194h
    protected void j0() {
        this.f56219R0 = false;
        this.f56222U0 = -9223372036854775807L;
        try {
            super.j0();
        } finally {
            if (this.f56218Q0) {
                this.f56218Q0 = false;
                this.f56209H0.reset();
            }
        }
    }

    protected void l2() {
        this.f56217P0 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void o1(String str, h.a aVar, long j10, long j11) {
        this.f56208G0.q(str, j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6194h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 2) {
            this.f56209H0.h(((Float) C13599a.e(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f56209H0.s((C5647d) C13599a.e((C5647d) obj));
            return;
        }
        if (i10 == 6) {
            this.f56209H0.w((C5650g) C13599a.e((C5650g) obj));
            return;
        }
        if (i10 == 12) {
            if (P.f127888a >= 23) {
                b.a(this.f56209H0, obj);
            }
        } else if (i10 == 16) {
            this.f56220S0 = ((Integer) C13599a.e(obj)).intValue();
            n2();
        } else if (i10 == 9) {
            this.f56209H0.z(((Boolean) C13599a.e(obj)).booleanValue());
        } else if (i10 != 10) {
            super.x(i10, obj);
        } else {
            m2(((Integer) C13599a.e(obj)).intValue());
        }
    }

    private static boolean d2(String str) {
        if (P.f127888a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(Build.MANUFACTURER)) {
            return false;
        }
        String str2 = Build.DEVICE;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    private static boolean e2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean f2() {
        if (P.f127888a != 23) {
            return false;
        }
        String str = Build.MODEL;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int g2(t tVar) {
        d dVarY = this.f56209H0.y(tVar);
        if (!dVarY.f56131a) {
            return 0;
        }
        int i10 = dVarY.f56132b ? 1536 : 512;
        return dVarY.f56133c ? i10 | RecyclerView.m.FLAG_MOVED : i10;
    }

    private int h2(androidx.media3.exoplayer.mediacodec.j jVar, t tVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(jVar.f56716a) || (i10 = P.f127888a) >= 24 || (i10 == 23 && P.G0(this.f56207F0))) {
            return tVar.f44768p;
        }
        return -1;
    }

    private static List<androidx.media3.exoplayer.mediacodec.j> j2(androidx.media3.exoplayer.mediacodec.l lVar, t tVar, boolean z10, AudioSink audioSink) throws MediaCodecUtil.DecoderQueryException {
        androidx.media3.exoplayer.mediacodec.j jVarP;
        return tVar.f44767o == null ? L.x() : (!audioSink.a(tVar) || (jVarP = MediaCodecUtil.p()) == null) ? MediaCodecUtil.m(lVar, tVar, z10, false) : L.y(jVarP);
    }

    private void m2(int i10) {
        n3.h hVar;
        this.f56209H0.e(i10);
        if (P.f127888a < 35 || (hVar = this.f56210I0) == null) {
            return;
        }
        hVar.e(i10);
    }

    private void o2() {
        long jT = this.f56209H0.t(c());
        if (jT != Long.MIN_VALUE) {
            if (!this.f56217P0) {
                jT = Math.max(this.f56216O0, jT);
            }
            this.f56216O0 = jT;
            this.f56217P0 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void D1() throws ExoPlaybackException {
        try {
            this.f56209H0.q();
            if (U0() != -9223372036854775807L) {
                this.f56222U0 = U0();
            }
        } catch (AudioSink.WriteException e10) {
            throw S(e10, e10.f55988c, e10.f55987b, g1() ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<androidx.media3.exoplayer.mediacodec.j> S0(androidx.media3.exoplayer.mediacodec.l lVar, t tVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.n(j2(lVar, tVar, z10, this.f56209H0), tVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected long T0(long j10, long j11, boolean z10) {
        if (this.f56222U0 == -9223372036854775807L) {
            return super.T0(j10, j11, z10);
        }
        long jM0 = (long) (((r0 - j10) / (f() != null ? f().f44370a : 1.0f)) / 2.0f);
        if (this.f56221T0) {
            jM0 -= P.M0(T().c()) - j11;
        }
        return Math.max(10000L, jM0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int T1(androidx.media3.exoplayer.mediacodec.l lVar, t tVar) throws MediaCodecUtil.DecoderQueryException {
        int iG2;
        boolean z10;
        if (!z.n(tVar.f44767o)) {
            return I0.v(0);
        }
        boolean z11 = true;
        boolean z12 = tVar.f44751N != 0;
        boolean zU1 = MediaCodecRenderer.U1(tVar);
        int i10 = 8;
        if (!zU1 || (z12 && MediaCodecUtil.p() == null)) {
            iG2 = 0;
        } else {
            iG2 = g2(tVar);
            if (this.f56209H0.a(tVar)) {
                return I0.s(4, 8, 32, iG2);
            }
        }
        if ("audio/raw".equals(tVar.f44767o) && !this.f56209H0.a(tVar)) {
            return I0.v(1);
        }
        if (!this.f56209H0.a(P.f0(2, tVar.f44742E, tVar.f44743F))) {
            return I0.v(1);
        }
        List<androidx.media3.exoplayer.mediacodec.j> listJ2 = j2(lVar, tVar, false, this.f56209H0);
        if (listJ2.isEmpty()) {
            return I0.v(1);
        }
        if (!zU1) {
            return I0.v(2);
        }
        androidx.media3.exoplayer.mediacodec.j jVar = listJ2.get(0);
        boolean zO = jVar.o(tVar);
        if (zO) {
            z10 = true;
            z11 = zO;
        } else {
            for (int i11 = 1; i11 < listJ2.size(); i11++) {
                androidx.media3.exoplayer.mediacodec.j jVar2 = listJ2.get(i11);
                if (jVar2.o(tVar)) {
                    z10 = false;
                    jVar = jVar2;
                    break;
                }
            }
            z10 = true;
            z11 = zO;
        }
        int i12 = z11 ? 4 : 3;
        if (z11 && jVar.r(tVar)) {
            i10 = 16;
        }
        return I0.D(i12, i10, 32, jVar.f56723h ? 64 : 0, z10 ? 128 : 0, iG2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void a1(DecoderInputBuffer decoderInputBuffer) {
        t tVar;
        if (P.f127888a < 29 || (tVar = decoderInputBuffer.f55687b) == null || !Objects.equals(tVar.f44767o, "audio/opus") || !g1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C13599a.e(decoderInputBuffer.f55692g);
        int i10 = ((t) C13599a.e(decoderInputBuffer.f55687b)).f44745H;
        if (byteBuffer.remaining() == 8) {
            this.f56209H0.r(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.H0
    public boolean b() {
        return this.f56209H0.b() || super.b();
    }

    @Override // h3.I
    public void d(C5643A c5643a) {
        this.f56209H0.d(c5643a);
    }

    @Override // h3.I
    public C5643A f() {
        return this.f56209H0.f();
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void h0() {
        n3.h hVar;
        this.f56209H0.release();
        if (P.f127888a < 35 || (hVar = this.f56210I0) == null) {
            return;
        }
        hVar.c();
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat k2(t tVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", tVar.f44742E);
        mediaFormat.setInteger("sample-rate", tVar.f44743F);
        u.e(mediaFormat, tVar.f44770r);
        u.d(mediaFormat, "max-input-size", i10);
        int i11 = P.f127888a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !f2()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(tVar.f44767o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f56209H0.p(P.f0(4, tVar.f44742E, tVar.f44743F)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f56220S0));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void n1(Exception exc) {
        r.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f56208G0.m(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(String str) {
        this.f56208G0.r(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C14447c q1(G g10) throws ExoPlaybackException {
        t tVar = (t) C13599a.e(g10.f134662b);
        this.f56214M0 = tVar;
        C14447c c14447cQ1 = super.q1(g10);
        this.f56208G0.u(tVar, c14447cQ1);
        return c14447cQ1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(t tVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i10;
        t tVar2 = this.f56215N0;
        int[] iArrA = null;
        if (tVar2 != null) {
            tVar = tVar2;
        } else if (M0() != null) {
            C13599a.e(mediaFormat);
            t tVarN = new t.b().u0("audio/raw").o0("audio/raw".equals(tVar.f44767o) ? tVar.f44744G : (P.f127888a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? P.e0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).Z(tVar.f44745H).a0(tVar.f44746I).n0(tVar.f44764l).X(tVar.f44765m).f0(tVar.f44753a).h0(tVar.f44754b).i0(tVar.f44755c).j0(tVar.f44756d).w0(tVar.f44757e).s0(tVar.f44758f).R(mediaFormat.getInteger("channel-count")).v0(mediaFormat.getInteger("sample-rate")).N();
            if (this.f56212K0 && tVarN.f44742E == 6 && (i10 = tVar.f44742E) < 6) {
                iArrA = new int[i10];
                for (int i11 = 0; i11 < tVar.f44742E; i11++) {
                    iArrA[i11] = i11;
                }
            } else if (this.f56213L0) {
                iArrA = S.a(tVarN.f44742E);
            }
            tVar = tVarN;
        }
        try {
            if (P.f127888a >= 29) {
                if (!g1() || U().f134668a == 0) {
                    this.f56209H0.j(0);
                } else {
                    this.f56209H0.j(U().f134668a);
                }
            }
            this.f56209H0.l(tVar, 0, iArrA);
        } catch (AudioSink.ConfigurationException e10) {
            throw R(e10, e10.f55980a, 5001);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void s1(long j10) {
        this.f56209H0.u(j10);
    }

    @Override // h3.I
    public boolean w() {
        boolean z10 = this.f56219R0;
        this.f56219R0 = false;
        return z10;
    }

    public m(Context context, h.b bVar, androidx.media3.exoplayer.mediacodec.l lVar, boolean z10, Handler handler, e eVar, AudioSink audioSink, n3.h hVar) {
        super(1, bVar, lVar, z10, 44100.0f);
        this.f56207F0 = context.getApplicationContext();
        this.f56209H0 = audioSink;
        this.f56210I0 = hVar;
        this.f56220S0 = -1000;
        this.f56208G0 = new e.a(handler, eVar);
        this.f56222U0 = -9223372036854775807L;
        audioSink.g(new c());
    }

    private void n2() {
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null && P.f127888a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f56220S0));
            hVarM0.b(bundle);
        }
    }

    @Override // h3.I
    public long I() {
        if (getState() == 2) {
            o2();
        }
        return this.f56216O0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean S1(t tVar) {
        if (U().f134668a != 0) {
            int iG2 = g2(tVar);
            if ((iG2 & 512) != 0) {
                if (U().f134668a != 2 && (iG2 & 1024) == 0) {
                    if (tVar.f44745H == 0 && tVar.f44746I == 0) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return this.f56209H0.a(tVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected h.a V0(androidx.media3.exoplayer.mediacodec.j jVar, t tVar, MediaCrypto mediaCrypto, float f10) {
        t tVar2;
        this.f56211J0 = i2(jVar, tVar, Z());
        this.f56212K0 = d2(jVar.f56716a);
        this.f56213L0 = e2(jVar.f56716a);
        MediaFormat mediaFormatK2 = k2(tVar, jVar.f56718c, this.f56211J0, f10);
        if ("audio/raw".equals(jVar.f56717b) && !"audio/raw".equals(tVar.f44767o)) {
            tVar2 = tVar;
        } else {
            tVar2 = null;
        }
        this.f56215N0 = tVar2;
        return h.a.a(jVar, mediaFormatK2, tVar, mediaCrypto, this.f56210I0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.H0
    public boolean c() {
        if (super.c() && this.f56209H0.c()) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6194h
    protected void e0(boolean z10, boolean z11) throws ExoPlaybackException {
        super.e0(z10, z11);
        this.f56208G0.t(this.f56640z0);
        if (U().f134669b) {
            this.f56209H0.x();
        } else {
            this.f56209H0.k();
        }
        this.f56209H0.m(Y());
        this.f56209H0.n(T());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6194h
    protected void g0(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        super.g0(j10, z10);
        this.f56209H0.flush();
        this.f56216O0 = j10;
        this.f56222U0 = -9223372036854775807L;
        this.f56219R0 = false;
        this.f56217P0 = true;
    }

    protected int i2(androidx.media3.exoplayer.mediacodec.j jVar, t tVar, t[] tVarArr) {
        int iH2 = h2(jVar, tVar);
        if (tVarArr.length == 1) {
            return iH2;
        }
        for (t tVar2 : tVarArr) {
            if (jVar.e(tVar, tVar2).f134700d != 0) {
                iH2 = Math.max(iH2, h2(jVar, tVar2));
            }
        }
        return iH2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6194h
    protected void k0() {
        super.k0();
        this.f56209H0.i();
        this.f56221T0 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6194h
    protected void l0() {
        o2();
        this.f56221T0 = false;
        this.f56209H0.pause();
        super.l0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C14447c u0(androidx.media3.exoplayer.mediacodec.j jVar, t tVar, t tVar2) {
        int i10;
        C14447c c14447cE = jVar.e(tVar, tVar2);
        int i11 = c14447cE.f134701e;
        if (h1(tVar2)) {
            i11 |= 32768;
        }
        if (h2(jVar, tVar2) > this.f56211J0) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = jVar.f56716a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = c14447cE.f134700d;
        }
        return new C14447c(str, tVar, tVar2, i10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void u1() {
        super.u1();
        this.f56209H0.v();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean y1(long j10, long j11, androidx.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t tVar) throws ExoPlaybackException {
        int i13;
        int i14;
        C13599a.e(byteBuffer);
        this.f56222U0 = -9223372036854775807L;
        if (this.f56215N0 != null && (i11 & 2) != 0) {
            ((androidx.media3.exoplayer.mediacodec.h) C13599a.e(hVar)).o(i10, false);
            return true;
        }
        if (z10) {
            if (hVar != null) {
                hVar.o(i10, false);
            }
            this.f56640z0.f134690f += i12;
            this.f56209H0.v();
            return true;
        }
        try {
            if (this.f56209H0.o(byteBuffer, j12, i12)) {
                if (hVar != null) {
                    hVar.o(i10, false);
                }
                this.f56640z0.f134689e += i12;
                return true;
            }
            this.f56222U0 = j12;
            return false;
        } catch (AudioSink.InitializationException e10) {
            t tVar2 = this.f56214M0;
            boolean z12 = e10.f55982b;
            if (g1() && U().f134668a != 0) {
                i14 = 5004;
            } else {
                i14 = 5001;
            }
            throw S(e10, tVar2, z12, i14);
        } catch (AudioSink.WriteException e11) {
            boolean z13 = e11.f55987b;
            if (g1() && U().f134668a != 0) {
                i13 = 5003;
            } else {
                i13 = 5002;
            }
            throw S(e11, tVar, z13, i13);
        }
    }
}
