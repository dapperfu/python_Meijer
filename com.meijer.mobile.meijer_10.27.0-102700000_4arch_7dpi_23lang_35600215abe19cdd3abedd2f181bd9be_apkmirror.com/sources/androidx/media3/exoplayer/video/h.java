package androidx.media3.exoplayer.video;

import Ce.L;
import a3.F;
import a3.N;
import a3.t;
import a3.z;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.i;
import androidx.media3.exoplayer.video.n;
import androidx.media3.exoplayer.video.p;
import d3.C13466a;
import d3.F;
import d3.K;
import d3.P;
import d3.r;
import d3.u;
import h3.C14333b;
import h3.C14334c;
import h3.G;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import v3.C17491c;

/* loaded from: classes.dex */
public class h extends MediaCodecRenderer implements n.b {

    /* renamed from: u1, reason: collision with root package name */
    private static final int[] f57033u1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: v1, reason: collision with root package name */
    private static boolean f57034v1;

    /* renamed from: w1, reason: collision with root package name */
    private static boolean f57035w1;

    /* renamed from: F0, reason: collision with root package name */
    private final Context f57036F0;

    /* renamed from: G0, reason: collision with root package name */
    private final boolean f57037G0;

    /* renamed from: H0, reason: collision with root package name */
    private final p.a f57038H0;

    /* renamed from: I0, reason: collision with root package name */
    private final int f57039I0;

    /* renamed from: J0, reason: collision with root package name */
    private final boolean f57040J0;

    /* renamed from: K0, reason: collision with root package name */
    private final n f57041K0;

    /* renamed from: L0, reason: collision with root package name */
    private final n.a f57042L0;

    /* renamed from: M0, reason: collision with root package name */
    private final androidx.media3.exoplayer.video.a f57043M0;

    /* renamed from: N0, reason: collision with root package name */
    private final long f57044N0;

    /* renamed from: O0, reason: collision with root package name */
    private final PriorityQueue<Long> f57045O0;

    /* renamed from: P0, reason: collision with root package name */
    private e f57046P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f57047Q0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f57048R0;

    /* renamed from: S0, reason: collision with root package name */
    private VideoSink f57049S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f57050T0;

    /* renamed from: U0, reason: collision with root package name */
    private List<Object> f57051U0;

    /* renamed from: V0, reason: collision with root package name */
    private Surface f57052V0;

    /* renamed from: W0, reason: collision with root package name */
    private C17491c f57053W0;

    /* renamed from: X0, reason: collision with root package name */
    private F f57054X0;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean f57055Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private int f57056Z0;

    /* renamed from: a1, reason: collision with root package name */
    private int f57057a1;

    /* renamed from: b1, reason: collision with root package name */
    private long f57058b1;

    /* renamed from: c1, reason: collision with root package name */
    private int f57059c1;

    /* renamed from: d1, reason: collision with root package name */
    private int f57060d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f57061e1;

    /* renamed from: f1, reason: collision with root package name */
    private long f57062f1;

    /* renamed from: g1, reason: collision with root package name */
    private int f57063g1;

    /* renamed from: h1, reason: collision with root package name */
    private long f57064h1;

    /* renamed from: i1, reason: collision with root package name */
    private N f57065i1;

    /* renamed from: j1, reason: collision with root package name */
    private N f57066j1;

    /* renamed from: k1, reason: collision with root package name */
    private int f57067k1;

    /* renamed from: l1, reason: collision with root package name */
    private boolean f57068l1;

    /* renamed from: m1, reason: collision with root package name */
    private int f57069m1;

    /* renamed from: n1, reason: collision with root package name */
    f f57070n1;

    /* renamed from: o1, reason: collision with root package name */
    private v3.h f57071o1;

    /* renamed from: p1, reason: collision with root package name */
    private long f57072p1;

    /* renamed from: q1, reason: collision with root package name */
    private long f57073q1;

    /* renamed from: r1, reason: collision with root package name */
    private boolean f57074r1;

    /* renamed from: s1, reason: collision with root package name */
    private boolean f57075s1;

    /* renamed from: t1, reason: collision with root package name */
    private int f57076t1;

    class a implements VideoSink.a {
        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void a(VideoSink videoSink, N n10) {
        }

        a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void b(VideoSink videoSink) {
            if (h.this.f57052V0 != null) {
                h.this.G2();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void c(VideoSink videoSink) {
            if (h.this.f57052V0 != null) {
                h.this.b3(0, 1);
            }
        }
    }

    class b implements VideoSink.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.exoplayer.mediacodec.h f57078a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f57079b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f57080c;

        b(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
            this.f57078a = hVar;
            this.f57079b = i10;
            this.f57080c = j10;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void a(long j10) {
            h.this.L2(this.f57078a, this.f57079b, this.f57080c, j10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void skip() {
            h.this.Y2(this.f57078a, this.f57079b, this.f57080c);
        }
    }

    private static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final Context f57082a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f57083b;

        /* renamed from: d, reason: collision with root package name */
        private h.b f57085d;

        /* renamed from: e, reason: collision with root package name */
        private long f57086e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f57087f;

        /* renamed from: g, reason: collision with root package name */
        private Handler f57088g;

        /* renamed from: h, reason: collision with root package name */
        private p f57089h;

        /* renamed from: i, reason: collision with root package name */
        private int f57090i;

        /* renamed from: k, reason: collision with root package name */
        private VideoSink f57092k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f57093l;

        /* renamed from: c, reason: collision with root package name */
        private androidx.media3.exoplayer.mediacodec.l f57084c = androidx.media3.exoplayer.mediacodec.l.f56505a;

        /* renamed from: j, reason: collision with root package name */
        private float f57091j = 30.0f;

        /* renamed from: m, reason: collision with root package name */
        private long f57094m = -9223372036854775807L;

        public h m() {
            C13466a.g(!this.f57083b);
            Handler handler = this.f57088g;
            C13466a.g((handler == null && this.f57089h == null) || !(handler == null || this.f57089h == null));
            this.f57083b = true;
            return new h(this);
        }

        public d n(long j10) {
            this.f57094m = j10;
            return this;
        }

        public d o(boolean z10) {
            this.f57093l = z10;
            return this;
        }

        public d p(long j10) {
            this.f57086e = j10;
            return this;
        }

        public d q(h.b bVar) {
            this.f57085d = bVar;
            return this;
        }

        public d r(boolean z10) {
            this.f57087f = z10;
            return this;
        }

        public d s(Handler handler) {
            this.f57088g = handler;
            return this;
        }

        public d t(p pVar) {
            this.f57089h = pVar;
            return this;
        }

        public d u(int i10) {
            this.f57090i = i10;
            return this;
        }

        public d v(androidx.media3.exoplayer.mediacodec.l lVar) {
            this.f57084c = lVar;
            return this;
        }

        public d(Context context) {
            this.f57082a = context;
            this.f57085d = h.b.a(context);
        }
    }

    private final class f implements h.d, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f57098a;

        public f(androidx.media3.exoplayer.mediacodec.h hVar) {
            Handler handlerA = P.A(this);
            this.f57098a = handlerA;
            hVar.e(this, handlerA);
        }

        private void b(long j10) {
            h hVar = h.this;
            if (this != hVar.f57070n1 || hVar.M0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                h.this.I2();
                return;
            }
            try {
                h.this.H2(j10);
            } catch (ExoPlaybackException e10) {
                h.this.L1(e10);
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.d
        public void a(androidx.media3.exoplayer.mediacodec.h hVar, long j10, long j11) {
            if (P.f127086a >= 30) {
                b(j10);
            } else {
                this.f57098a.sendMessageAtFrontOfQueue(Message.obtain(this.f57098a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(P.h1(message.arg1, message.arg2));
            return true;
        }
    }

    private void c3(long j10) {
        int i10 = 0;
        while (true) {
            Long lPeek = this.f57045O0.peek();
            if (lPeek == null || lPeek.longValue() >= j10) {
                break;
            }
            i10++;
            this.f57045O0.poll();
        }
        b3(i10, 0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float Q0(float f10, t tVar, t[] tVarArr) {
        float fMax = -1.0f;
        for (t tVar2 : tVarArr) {
            float f11 = tVar2.f43958x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    protected boolean S2(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    protected boolean T2(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    protected boolean U2(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    protected boolean V2() {
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h
    protected void d0() {
        this.f57066j1 = null;
        this.f57073q1 = -9223372036854775807L;
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.s();
        } else {
            this.f57041K0.g();
        }
        E2();
        this.f57055Y0 = false;
        this.f57070n1 = null;
        try {
            super.d0();
        } finally {
            this.f57038H0.m(this.f56416z0);
            this.f57038H0.t(N.f43763e);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void o1(String str, h.a aVar, long j10, long j11) {
        this.f57038H0.k(str, j10, j11);
        this.f57047Q0 = f2(str);
        this.f57048R0 = ((androidx.media3.exoplayer.mediacodec.j) C13466a.e(O0())).p();
        E2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h, androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
        if (i10 == 1) {
            O2(obj);
            return;
        }
        if (i10 == 7) {
            v3.h hVar = (v3.h) C13466a.e(obj);
            this.f57071o1 = hVar;
            VideoSink videoSink = this.f57049S0;
            if (videoSink != null) {
                videoSink.o(hVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) C13466a.e(obj)).intValue();
            if (this.f57069m1 != iIntValue) {
                this.f57069m1 = iIntValue;
                if (this.f57068l1) {
                    C1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.f57056Z0 = ((Integer) C13466a.e(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
            if (hVarM0 != null) {
                hVarM0.h(this.f57056Z0);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue2 = ((Integer) C13466a.e(obj)).intValue();
            this.f57057a1 = iIntValue2;
            VideoSink videoSink2 = this.f57049S0;
            if (videoSink2 != null) {
                videoSink2.t(iIntValue2);
                return;
            } else {
                this.f57041K0.n(iIntValue2);
                return;
            }
        }
        if (i10 == 13) {
            R2((List) C13466a.e(obj));
            return;
        }
        if (i10 == 14) {
            F f10 = (F) C13466a.e(obj);
            if (f10.b() == 0 || f10.a() == 0) {
                return;
            }
            this.f57054X0 = f10;
            VideoSink videoSink3 = this.f57049S0;
            if (videoSink3 != null) {
                videoSink3.r((Surface) C13466a.i(this.f57052V0), f10);
                return;
            }
            return;
        }
        if (i10 == 16) {
            this.f57067k1 = ((Integer) C13466a.e(obj)).intValue();
            a3();
        } else {
            if (i10 != 17) {
                super.x(i10, obj);
                return;
            }
            Surface surface = this.f57052V0;
            O2(null);
            ((h) C13466a.e(obj)).x(1, surface);
        }
    }

    protected static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f57095a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57096b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57097c;

        public e(int i10, int i11, int i12) {
            this.f57095a = i10;
            this.f57096b = i11;
            this.f57097c = i12;
        }
    }

    private void A2(N n10) {
        if (n10.equals(N.f43763e) || n10.equals(this.f57066j1)) {
            return;
        }
        this.f57066j1 = n10;
        this.f57038H0.t(n10);
    }

    private void B2() {
        Surface surface = this.f57052V0;
        if (surface == null || !this.f57055Y0) {
            return;
        }
        this.f57038H0.q(surface);
    }

    private void C2() {
        N n10 = this.f57066j1;
        if (n10 != null) {
            this.f57038H0.t(n10);
        }
    }

    private void D2(MediaFormat mediaFormat) {
        if (this.f57049S0 == null || P.D0(this.f57036F0)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void E2() {
        int i10;
        androidx.media3.exoplayer.mediacodec.h hVarM0;
        if (!this.f57068l1 || (i10 = P.f127086a) < 23 || (hVarM0 = M0()) == null) {
            return;
        }
        this.f57070n1 = new f(hVarM0);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            hVarM0.b(bundle);
        }
    }

    private void F2(long j10, long j11, t tVar) {
        v3.h hVar = this.f57071o1;
        if (hVar != null) {
            hVar.a(j10, j11, tVar, R0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G2() {
        this.f57038H0.q(this.f57052V0);
        this.f57055Y0 = true;
    }

    private void J2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, t tVar) {
        h hVar2;
        long jG = this.f57042L0.g();
        long jF = this.f57042L0.f();
        if (V2() && jG == this.f57064h1) {
            Y2(hVar, i10, j10);
            hVar2 = this;
        } else {
            hVar2 = this;
            hVar2.F2(j10, jG, tVar);
            hVar2.M2(hVar, i10, j10, jG);
            jG = jG;
        }
        e3(jF);
        hVar2.f57064h1 = jG;
    }

    private void K2() {
        C17491c c17491c = this.f57053W0;
        if (c17491c != null) {
            c17491c.release();
            this.f57053W0 = null;
        }
    }

    private static void N2(androidx.media3.exoplayer.mediacodec.h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.b(bundle);
    }

    private void O2(Object obj) throws ExoPlaybackException {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f57052V0 == surface) {
            if (surface != null) {
                C2();
                B2();
                return;
            }
            return;
        }
        this.f57052V0 = surface;
        if (this.f57049S0 == null) {
            this.f57041K0.q(surface);
        }
        this.f57055Y0 = false;
        int state = getState();
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null && this.f57049S0 == null) {
            androidx.media3.exoplayer.mediacodec.j jVar = (androidx.media3.exoplayer.mediacodec.j) C13466a.e(O0());
            boolean zT2 = t2(jVar);
            if (P.f127086a < 23 || !zT2 || this.f57047Q0) {
                C1();
                k1();
            } else {
                P2(hVarM0, s2(jVar));
            }
        }
        if (surface != null) {
            C2();
        } else {
            this.f57066j1 = null;
            VideoSink videoSink = this.f57049S0;
            if (videoSink != null) {
                videoSink.v();
            }
        }
        if (state == 2) {
            VideoSink videoSink2 = this.f57049S0;
            if (videoSink2 != null) {
                videoSink2.A(true);
            } else {
                this.f57041K0.e(true);
            }
        }
        E2();
    }

    private void P2(androidx.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        int i10 = P.f127086a;
        if (i10 >= 23 && surface != null) {
            Q2(hVar, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            g2(hVar);
        }
    }

    private static int Z2(Context context, androidx.media3.exoplayer.mediacodec.l lVar, t tVar) throws MediaCodecUtil.DecoderQueryException {
        boolean z10;
        int i10 = 0;
        if (!z.q(tVar.f43949o)) {
            return I0.v(0);
        }
        boolean z11 = tVar.f43953s != null;
        List<androidx.media3.exoplayer.mediacodec.j> listO2 = o2(context, lVar, tVar, z11, false);
        if (z11 && listO2.isEmpty()) {
            listO2 = o2(context, lVar, tVar, false, false);
        }
        if (listO2.isEmpty()) {
            return I0.v(1);
        }
        if (!MediaCodecRenderer.U1(tVar)) {
            return I0.v(2);
        }
        androidx.media3.exoplayer.mediacodec.j jVar = listO2.get(0);
        boolean zO = jVar.o(tVar);
        if (zO) {
            z10 = true;
        } else {
            for (int i11 = 1; i11 < listO2.size(); i11++) {
                androidx.media3.exoplayer.mediacodec.j jVar2 = listO2.get(i11);
                if (jVar2.o(tVar)) {
                    z10 = false;
                    zO = true;
                    jVar = jVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i12 = zO ? 4 : 3;
        int i13 = jVar.r(tVar) ? 16 : 8;
        int i14 = jVar.f56499h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (P.f127086a >= 26 && "video/dolby-vision".equals(tVar.f43949o) && !c.a(context)) {
            i15 = 256;
        }
        if (zO) {
            List<androidx.media3.exoplayer.mediacodec.j> listO22 = o2(context, lVar, tVar, z11, true);
            if (!listO22.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.j jVar3 = MediaCodecUtil.n(listO22, tVar).get(0);
                if (jVar3.o(tVar) && jVar3.r(tVar)) {
                    i10 = 32;
                }
            }
        }
        return I0.r(i12, i13, i10, i14, i15);
    }

    private static boolean h2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean j2() {
        /*
            Method dump skipped, instructions count: 3182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.h.j2():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int l2(androidx.media3.exoplayer.mediacodec.j r10, a3.t r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.h.l2(androidx.media3.exoplayer.mediacodec.j, a3.t):int");
    }

    private static Point m2(androidx.media3.exoplayer.mediacodec.j jVar, t tVar) {
        int i10 = tVar.f43957w;
        int i11 = tVar.f43956v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f57033u1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point pointC = jVar.c(i15, i13);
            float f11 = tVar.f43958x;
            if (pointC != null && jVar.u(pointC.x, pointC.y, f11)) {
                return pointC;
            }
        }
        return null;
    }

    private static List<androidx.media3.exoplayer.mediacodec.j> o2(Context context, androidx.media3.exoplayer.mediacodec.l lVar, t tVar, boolean z10, boolean z11) throws MediaCodecUtil.DecoderQueryException {
        String str = tVar.f43949o;
        if (str == null) {
            return L.x();
        }
        if (P.f127086a >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List<androidx.media3.exoplayer.mediacodec.j> listG = MediaCodecUtil.g(lVar, tVar, z10, z11);
            if (!listG.isEmpty()) {
                return listG;
            }
        }
        return MediaCodecUtil.m(lVar, tVar, z10, z11);
    }

    protected static int p2(androidx.media3.exoplayer.mediacodec.j jVar, t tVar) {
        if (tVar.f43950p == -1) {
            return l2(jVar, tVar);
        }
        int size = tVar.f43952r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += tVar.f43952r.get(i10).length;
        }
        return tVar.f43950p + length;
    }

    private static int q2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private Surface s2(androidx.media3.exoplayer.mediacodec.j jVar) {
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            return videoSink.b();
        }
        Surface surface = this.f57052V0;
        if (surface != null) {
            return surface;
        }
        if (W2(jVar)) {
            return null;
        }
        C13466a.g(X2(jVar));
        C17491c c17491c = this.f57053W0;
        if (c17491c != null && c17491c.f164437a != jVar.f56498g) {
            K2();
        }
        if (this.f57053W0 == null) {
            this.f57053W0 = C17491c.c(this.f57036F0, jVar.f56498g);
        }
        return this.f57053W0;
    }

    private boolean t2(androidx.media3.exoplayer.mediacodec.j jVar) {
        if (this.f57049S0 != null) {
            return true;
        }
        Surface surface = this.f57052V0;
        return (surface != null && surface.isValid()) || W2(jVar) || X2(jVar);
    }

    private boolean u2(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.f55467f < X();
    }

    private void x2() {
        if (this.f57059c1 > 0) {
            long jC = T().c();
            this.f57038H0.n(this.f57059c1, jC - this.f57058b1);
            this.f57059c1 = 0;
            this.f57058b1 = jC;
        }
    }

    private void y2() {
        if (!this.f57041K0.i() || this.f57052V0 == null) {
            return;
        }
        G2();
    }

    private void z2() {
        int i10 = this.f57063g1;
        if (i10 != 0) {
            this.f57038H0.r(this.f57062f1, i10);
            this.f57062f1 = 0L;
            this.f57063g1 = 0;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException A0(Throwable th2, androidx.media3.exoplayer.mediacodec.j jVar) {
        return new MediaCodecVideoDecoderException(th2, jVar, this.f57052V0);
    }

    @Override // androidx.media3.exoplayer.video.n.b
    public boolean C(long j10, long j11, long j12, boolean z10, boolean z11) throws ExoPlaybackException {
        long j13 = this.f57044N0;
        if (j13 != -9223372036854775807L) {
            this.f57075s1 = j10 < j13;
        }
        return S2(j10, j12, z10) && w2(j11, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void D1() {
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.i();
        }
    }

    protected void M2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        K.a("releaseOutputBuffer");
        hVar.l(i10, j11);
        K.b();
        this.f56416z0.f134218e++;
        this.f57060d1 = 0;
        if (this.f57049S0 == null) {
            A2(this.f57065i1);
            y2();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int N0(DecoderInputBuffer decoderInputBuffer) {
        return (P.f127086a >= 34 && this.f57068l1 && u2(decoderInputBuffer)) ? 32 : 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean P0() {
        return this.f57068l1 && P.f127086a < 23;
    }

    public void R2(List<Object> list) {
        this.f57051U0 = list;
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.m(list);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<androidx.media3.exoplayer.mediacodec.j> S0(androidx.media3.exoplayer.mediacodec.l lVar, t tVar, boolean z10) throws MediaCodecUtil.DecoderQueryException {
        return MediaCodecUtil.n(o2(this.f57036F0, lVar, tVar, z10, this.f57068l1), tVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int T1(androidx.media3.exoplayer.mediacodec.l lVar, t tVar) throws MediaCodecUtil.DecoderQueryException {
        return Z2(this.f57036F0, lVar, tVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected h.a V0(androidx.media3.exoplayer.mediacodec.j jVar, t tVar, MediaCrypto mediaCrypto, float f10) {
        String str = jVar.f56494c;
        e eVarN2 = n2(jVar, tVar, Z());
        this.f57046P0 = eVarN2;
        MediaFormat mediaFormatR2 = r2(tVar, str, eVarN2, f10, this.f57040J0, this.f57068l1 ? this.f57069m1 : 0);
        Surface surfaceS2 = s2(jVar);
        D2(mediaFormatR2);
        return h.a.b(jVar, mediaFormatR2, tVar, surfaceS2, mediaCrypto);
    }

    protected boolean W2(androidx.media3.exoplayer.mediacodec.j jVar) {
        return P.f127086a >= 35 && jVar.f56502k;
    }

    protected boolean X2(androidx.media3.exoplayer.mediacodec.j jVar) {
        if (P.f127086a < 23 || this.f57068l1 || f2(jVar.f56492a)) {
            return false;
        }
        return !jVar.f56498g || C17491c.b(this.f57036F0);
    }

    protected void Y2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        K.a("skipVideoBuffer");
        hVar.o(i10, false);
        K.b();
        this.f56416z0.f134219f++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    protected void a1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.f57048R0) {
            ByteBuffer byteBuffer = (ByteBuffer) C13466a.e(decoderInputBuffer.f55468g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        N2((androidx.media3.exoplayer.mediacodec.h) C13466a.e(M0()), bArr);
                    }
                }
            }
        }
    }

    protected void b3(int i10, int i11) {
        C14333b c14333b = this.f56416z0;
        c14333b.f134221h += i10;
        int i12 = i10 + i11;
        c14333b.f134220g += i12;
        this.f57059c1 += i12;
        int i13 = this.f57060d1 + i12;
        this.f57060d1 = i13;
        c14333b.f134222i = Math.max(i13, c14333b.f134222i);
        int i14 = this.f57039I0;
        if (i14 <= 0 || this.f57059c1 < i14) {
            return;
        }
        x2();
    }

    @Override // androidx.media3.exoplayer.H0
    public void e() {
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.e();
        } else {
            this.f57041K0.a();
        }
    }

    protected void e2(VideoSink videoSink, int i10, t tVar) {
        List<Object> listX = this.f57051U0;
        if (listX == null) {
            listX = L.x();
        }
        videoSink.y(i10, tVar, listX);
    }

    protected void e3(long j10) {
        this.f56416z0.a(j10);
        this.f57062f1 += j10;
        this.f57063g1++;
    }

    protected boolean f2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            try {
                if (!f57034v1) {
                    f57035w1 = j2();
                    f57034v1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f57035w1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h
    protected void g0(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            if (!z10) {
                videoSink.w(true);
            }
            this.f57049S0.j(X0(), k2());
            this.f57074r1 = true;
        }
        super.g0(j10, z10);
        if (this.f57049S0 == null) {
            this.f57041K0.m();
        }
        if (z10) {
            VideoSink videoSink2 = this.f57049S0;
            if (videoSink2 != null) {
                videoSink2.A(false);
            } else {
                this.f57041K0.e(false);
            }
        }
        E2();
        this.f57060d1 = 0;
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.H0
    public void h(long j10, long j11) throws MediaCryptoException, ExoPlaybackException {
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            try {
                videoSink.h(j10, j11);
            } catch (VideoSink.VideoSinkException e10) {
                throw R(e10, e10.f57013a, 7001);
            }
        }
        super.h(j10, j11);
    }

    protected void i2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10) {
        K.a("dropVideoBuffer");
        hVar.o(i10, false);
        K.b();
        b3(0, 1);
    }

    protected long k2() {
        return -this.f57072p1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean m1(t tVar) throws ExoPlaybackException {
        VideoSink videoSink = this.f57049S0;
        if (videoSink == null || videoSink.a()) {
            return true;
        }
        try {
            return this.f57049S0.g(tVar);
        } catch (VideoSink.VideoSinkException e10) {
            throw R(e10, tVar, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void n1(Exception exc) {
        r.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f57038H0.s(exc);
    }

    protected e n2(androidx.media3.exoplayer.mediacodec.j jVar, t tVar, t[] tVarArr) {
        int iL2;
        int iMax = tVar.f43956v;
        int iMax2 = tVar.f43957w;
        int iP2 = p2(jVar, tVar);
        if (tVarArr.length == 1) {
            if (iP2 != -1 && (iL2 = l2(jVar, tVar)) != -1) {
                iP2 = Math.min((int) (iP2 * 1.5f), iL2);
            }
            return new e(iMax, iMax2, iP2);
        }
        int length = tVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            t tVarN = tVarArr[i10];
            if (tVar.f43922C != null && tVarN.f43922C == null) {
                tVarN = tVarN.b().T(tVar.f43922C).N();
            }
            if (jVar.e(tVar, tVarN).f134229d != 0) {
                int i11 = tVarN.f43956v;
                z10 |= i11 == -1 || tVarN.f43957w == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, tVarN.f43957w);
                iP2 = Math.max(iP2, p2(jVar, tVarN));
            }
        }
        if (z10) {
            r.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointM2 = m2(jVar, tVar);
            if (pointM2 != null) {
                iMax = Math.max(iMax, pointM2.x);
                iMax2 = Math.max(iMax2, pointM2.y);
                iP2 = Math.max(iP2, l2(jVar, tVar.b().z0(iMax).d0(iMax2).N()));
                r.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iP2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(String str) {
        this.f57038H0.l(str);
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat r2(t tVar, String str, e eVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairI;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", tVar.f43956v);
        mediaFormat.setInteger("height", tVar.f43957w);
        u.e(mediaFormat, tVar.f43952r);
        u.c(mediaFormat, "frame-rate", tVar.f43958x);
        u.d(mediaFormat, "rotation-degrees", tVar.f43959y);
        u.b(mediaFormat, tVar.f43922C);
        if ("video/dolby-vision".equals(tVar.f43949o) && (pairI = MediaCodecUtil.i(tVar)) != null) {
            u.d(mediaFormat, "profile", ((Integer) pairI.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f57095a);
        mediaFormat.setInteger("max-height", eVar.f57096b);
        u.d(mediaFormat, "max-input-size", eVar.f57097c);
        int i11 = P.f127086a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f57067k1));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void v1(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        ByteBuffer byteBuffer;
        if (this.f57043M0 != null && ((androidx.media3.exoplayer.mediacodec.j) C13466a.e(O0())).f56493b.equals("video/av01") && (byteBuffer = decoderInputBuffer.f55465d) != null) {
            this.f57043M0.b(byteBuffer);
        }
        this.f57076t1 = 0;
        boolean z10 = this.f57068l1;
        if (!z10) {
            this.f57061e1++;
        }
        if (P.f127086a >= 23 || !z10) {
            return;
        }
        H2(decoderInputBuffer.f55467f);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1(H0.a aVar) {
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.l(aVar);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean y1(long j10, long j11, androidx.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t tVar) throws ExoPlaybackException {
        C13466a.e(hVar);
        long jW0 = j12 - W0();
        c3(j12);
        if (this.f57049S0 != null) {
            if (!z10 || z11) {
                return this.f57049S0.f(k2() + j12, z11, new b(hVar, i10, jW0));
            }
            Y2(hVar, i10, jW0);
            return true;
        }
        int iC = this.f57041K0.c(j12, j10, j11, X0(), z10, z11, this.f57042L0);
        if (iC == 0) {
            long jB = T().b();
            F2(jW0, jB, tVar);
            L2(hVar, i10, jW0, jB);
            e3(this.f57042L0.f());
            return true;
        }
        if (iC == 1) {
            J2((androidx.media3.exoplayer.mediacodec.h) C13466a.i(hVar), i10, jW0, tVar);
            return true;
        }
        if (iC == 2) {
            i2(hVar, i10, jW0);
            e3(this.f57042L0.f());
            return true;
        }
        if (iC == 3) {
            Y2(hVar, i10, jW0);
            e3(this.f57042L0.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    protected h(d dVar) {
        boolean z10;
        super(2, dVar.f57085d, dVar.f57084c, dVar.f57087f, dVar.f57091j);
        Context applicationContext = dVar.f57082a.getApplicationContext();
        this.f57036F0 = applicationContext;
        this.f57039I0 = dVar.f57090i;
        this.f57049S0 = dVar.f57092k;
        this.f57038H0 = new p.a(dVar.f57088g, dVar.f57089h);
        if (this.f57049S0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f57037G0 = z10;
        this.f57041K0 = new n(applicationContext, this, dVar.f57086e);
        this.f57042L0 = new n.a();
        this.f57040J0 = h2();
        this.f57054X0 = F.f127068c;
        this.f57056Z0 = 1;
        this.f57057a1 = 0;
        this.f57065i1 = N.f43763e;
        this.f57069m1 = 0;
        this.f57066j1 = null;
        this.f57067k1 = -1000;
        this.f57072p1 = -9223372036854775807L;
        this.f57073q1 = -9223372036854775807L;
        this.f57043M0 = dVar.f57093l ? new androidx.media3.exoplayer.video.a() : null;
        this.f57045O0 = new PriorityQueue<>();
        this.f57044N0 = dVar.f57094m != -9223372036854775807L ? -dVar.f57094m : -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I2() {
        K1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2(androidx.media3.exoplayer.mediacodec.h hVar, int i10, long j10, long j11) {
        M2(hVar, i10, j10, j11);
    }

    private void a3() {
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null && P.f127086a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f57067k1));
            hVarM0.b(bundle);
        }
    }

    private void d3(r.b bVar) {
        a3.F fB0 = b0();
        if (fB0.q()) {
            this.f57073q1 = -9223372036854775807L;
        } else {
            this.f57073q1 = fB0.h(((r.b) C13466a.e(bVar)).f56933a, new F.b()).k();
        }
    }

    private boolean v2(DecoderInputBuffer decoderInputBuffer) {
        if (m() || decoderInputBuffer.B() || this.f57073q1 == -9223372036854775807L) {
            return true;
        }
        if (this.f57073q1 - (decoderInputBuffer.f55467f - W0()) <= 100000) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.video.n.b
    public boolean A(long j10, long j11) {
        return U2(j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void E1() {
        super.E1();
        this.f57045O0.clear();
        this.f57075s1 = false;
        this.f57061e1 = 0;
        this.f57076t1 = 0;
        androidx.media3.exoplayer.video.a aVar = this.f57043M0;
        if (aVar != null) {
            aVar.c();
        }
    }

    protected void H2(long j10) throws ExoPlaybackException {
        X1(j10);
        A2(this.f57065i1);
        this.f56416z0.f134218e++;
        y2();
        t1(j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.H0
    public void J(float f10, float f11) throws ExoPlaybackException {
        super.J(f10, f11);
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.u(f10);
        } else {
            this.f57041K0.r(f10);
        }
    }

    @Override // androidx.media3.exoplayer.video.n.b
    public boolean K(long j10, long j11, boolean z10) {
        return T2(j10, j11, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean O1(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        boolean z10;
        boolean z11;
        if (v2(decoderInputBuffer) || decoderInputBuffer.H()) {
            return false;
        }
        boolean zU2 = u2(decoderInputBuffer);
        if ((!zU2 && !this.f57075s1) || decoderInputBuffer.t()) {
            return false;
        }
        if (decoderInputBuffer.C()) {
            decoderInputBuffer.o();
            if (zU2) {
                this.f56416z0.f134217d++;
            } else if (this.f57075s1) {
                this.f57045O0.add(Long.valueOf(decoderInputBuffer.f55467f));
                this.f57076t1++;
            }
            return true;
        }
        if (this.f57043M0 != null && ((androidx.media3.exoplayer.mediacodec.j) C13466a.e(O0())).f56493b.equals("video/av01") && (byteBuffer = decoderInputBuffer.f55465d) != null) {
            if (!zU2 && this.f57076t1 > 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            byteBufferAsReadOnlyBuffer.flip();
            int iD = this.f57043M0.d(byteBufferAsReadOnlyBuffer, z10);
            if (((e) C13466a.e(this.f57046P0)).f57097c + iD < byteBufferAsReadOnlyBuffer.capacity()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (iD != byteBufferAsReadOnlyBuffer.limit() && z11) {
                ((ByteBuffer) C13466a.e(decoderInputBuffer.f55465d)).position(iD);
                if (zU2) {
                    this.f56416z0.f134217d++;
                } else if (this.f57075s1) {
                    this.f57045O0.add(Long.valueOf(decoderInputBuffer.f55467f));
                    this.f57076t1++;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean P1(androidx.media3.exoplayer.mediacodec.j jVar) {
        return t2(jVar);
    }

    protected void Q2(androidx.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        hVar.j(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.H0
    public boolean b() {
        boolean zB = super.b();
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            return videoSink.n(zB);
        }
        if (zB && (M0() == null || this.f57068l1)) {
            return true;
        }
        return this.f57041K0.d(zB);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.H0
    public boolean c() {
        if (super.c()) {
            VideoSink videoSink = this.f57049S0;
            if (videoSink == null || videoSink.c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h
    protected void e0(boolean z10, boolean z11) throws ExoPlaybackException {
        boolean z12;
        super.e0(z10, z11);
        boolean z13 = U().f134198b;
        if (z13 && this.f57069m1 == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        C13466a.g(z12);
        if (this.f57068l1 != z13) {
            this.f57068l1 = z13;
            C1();
        }
        this.f57038H0.o(this.f56416z0);
        if (!this.f57050T0) {
            if (this.f57051U0 != null && this.f57049S0 == null) {
                i iVarH = new i.b(this.f57036F0, this.f57041K0).i(T()).h();
                iVarH.N(1);
                this.f57049S0 = iVarH.C(0);
            }
            this.f57050T0 = true;
        }
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.B(new a(), com.google.common.util.concurrent.u.a());
            v3.h hVar = this.f57071o1;
            if (hVar != null) {
                this.f57049S0.o(hVar);
            }
            if (this.f57052V0 != null && !this.f57054X0.equals(d3.F.f127068c)) {
                this.f57049S0.r(this.f57052V0, this.f57054X0);
            }
            this.f57049S0.t(this.f57057a1);
            this.f57049S0.u(Y0());
            List<Object> list = this.f57051U0;
            if (list != null) {
                this.f57049S0.m(list);
            }
            this.f57049S0.p(z11);
            H0.a aVarZ0 = Z0();
            if (aVarZ0 != null) {
                this.f57049S0.l(aVarZ0);
                return;
            }
            return;
        }
        this.f57041K0.o(T());
        this.f57041K0.h(z11);
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void f0() {
        super.f0();
    }

    protected void g2(androidx.media3.exoplayer.mediacodec.h hVar) {
        hVar.g();
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void h0() {
        super.h0();
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null && this.f57037G0) {
            videoSink.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h
    protected void k0() {
        super.k0();
        this.f57059c1 = 0;
        this.f57058b1 = T().c();
        this.f57062f1 = 0L;
        this.f57063g1 = 0;
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.q();
        } else {
            this.f57041K0.k();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h
    protected void l0() {
        x2();
        z2();
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.k();
        } else {
            this.f57041K0.l();
        }
        super.l0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h
    protected void m0(t[] tVarArr, long j10, long j11, r.b bVar) throws ExoPlaybackException {
        super.m0(tVarArr, j10, j11, bVar);
        if (this.f57072p1 == -9223372036854775807L) {
            this.f57072p1 = j10;
        }
        d3(bVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C14334c q1(G g10) throws ExoPlaybackException {
        C14334c c14334cQ1 = super.q1(g10);
        this.f57038H0.p((t) C13466a.e(g10.f134191b), c14334cQ1);
        return c14334cQ1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(t tVar, MediaFormat mediaFormat) {
        boolean z10;
        int integer;
        int integer2;
        int i10;
        int i11;
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null) {
            hVarM0.h(this.f57056Z0);
        }
        if (this.f57068l1) {
            i11 = tVar.f43956v;
            i10 = tVar.f43957w;
        } else {
            C13466a.e(mediaFormat);
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i12 = integer;
            i10 = integer2;
            i11 = i12;
        }
        float f10 = tVar.f43960z;
        int i13 = tVar.f43959y;
        if (i13 == 90 || i13 == 270) {
            f10 = 1.0f / f10;
            int i14 = i10;
            i10 = i11;
            i11 = i14;
        }
        this.f57065i1 = new N(i11, i10, f10);
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null && this.f57074r1) {
            e2(videoSink, 1, tVar.b().z0(i11).d0(i10).q0(f10).N());
        } else {
            this.f57041K0.p(tVar.f43958x);
        }
        this.f57074r1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void t1(long j10) {
        super.t1(j10);
        if (!this.f57068l1) {
            this.f57061e1--;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected C14334c u0(androidx.media3.exoplayer.mediacodec.j jVar, t tVar, t tVar2) {
        int i10;
        C14334c c14334cE = jVar.e(tVar, tVar2);
        int i11 = c14334cE.f134230e;
        e eVar = (e) C13466a.e(this.f57046P0);
        if (tVar2.f43956v > eVar.f57095a || tVar2.f43957w > eVar.f57096b) {
            i11 |= 256;
        }
        if (p2(jVar, tVar2) > eVar.f57097c) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = jVar.f56492a;
        if (i12 != 0) {
            i10 = 0;
        } else {
            i10 = c14334cE.f134229d;
        }
        return new C14334c(str, tVar, tVar2, i10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void u1() {
        super.u1();
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.i();
            this.f57049S0.j(X0(), k2());
        } else {
            this.f57041K0.j();
        }
        this.f57074r1 = true;
        E2();
    }

    protected boolean w2(long j10, boolean z10) throws MediaCryptoException, ExoPlaybackException {
        int iQ0 = q0(j10);
        if (iQ0 == 0) {
            return false;
        }
        if (z10) {
            C14333b c14333b = this.f56416z0;
            int i10 = c14333b.f134217d + iQ0;
            c14333b.f134217d = i10;
            c14333b.f134219f += this.f57061e1;
            c14333b.f134217d = i10 + this.f57045O0.size();
        } else {
            this.f56416z0.f134223j++;
            b3(iQ0 + this.f57045O0.size(), this.f57061e1);
        }
        J0();
        VideoSink videoSink = this.f57049S0;
        if (videoSink != null) {
            videoSink.w(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC6052h
    protected void j0() {
        try {
            super.j0();
        } finally {
            this.f57050T0 = false;
            this.f57072p1 = -9223372036854775807L;
            K2();
        }
    }
}
