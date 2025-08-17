package i3;

import a3.B;
import a3.C5569i;
import a3.F;
import a3.J;
import a3.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.C13467b;
import h3.C14333b;
import i3.B1;
import i3.InterfaceC14599b;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class A1 implements InterfaceC14599b, B1.a {

    /* renamed from: A, reason: collision with root package name */
    private int f136952A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f136953B;

    /* renamed from: a, reason: collision with root package name */
    private final Context f136954a;

    /* renamed from: c, reason: collision with root package name */
    private final B1 f136956c;

    /* renamed from: d, reason: collision with root package name */
    private final PlaybackSession f136957d;

    /* renamed from: j, reason: collision with root package name */
    private String f136963j;

    /* renamed from: k, reason: collision with root package name */
    private PlaybackMetrics.Builder f136964k;

    /* renamed from: l, reason: collision with root package name */
    private int f136965l;

    /* renamed from: o, reason: collision with root package name */
    private PlaybackException f136968o;

    /* renamed from: p, reason: collision with root package name */
    private b f136969p;

    /* renamed from: q, reason: collision with root package name */
    private b f136970q;

    /* renamed from: r, reason: collision with root package name */
    private b f136971r;

    /* renamed from: s, reason: collision with root package name */
    private a3.t f136972s;

    /* renamed from: t, reason: collision with root package name */
    private a3.t f136973t;

    /* renamed from: u, reason: collision with root package name */
    private a3.t f136974u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f136975v;

    /* renamed from: w, reason: collision with root package name */
    private int f136976w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f136977x;

    /* renamed from: y, reason: collision with root package name */
    private int f136978y;

    /* renamed from: z, reason: collision with root package name */
    private int f136979z;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f136955b = C13467b.a();

    /* renamed from: f, reason: collision with root package name */
    private final F.c f136959f = new F.c();

    /* renamed from: g, reason: collision with root package name */
    private final F.b f136960g = new F.b();

    /* renamed from: i, reason: collision with root package name */
    private final HashMap<String, Long> f136962i = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f136961h = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final long f136958e = SystemClock.elapsedRealtime();

    /* renamed from: m, reason: collision with root package name */
    private int f136966m = 0;

    /* renamed from: n, reason: collision with root package name */
    private int f136967n = 0;

    private static int H0(a3.o oVar) {
        for (int i10 = 0; i10 < oVar.f43875d; i10++) {
            UUID uuid = oVar.c(i10).f43877b;
            if (uuid.equals(C5569i.f43835d)) {
                return 3;
            }
            if (uuid.equals(C5569i.f43836e)) {
                return 2;
            }
            if (uuid.equals(C5569i.f43834c)) {
                return 6;
            }
        }
        return 1;
    }

    private static int N0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void O0(InterfaceC14599b.C2163b c2163b) {
        for (int i10 = 0; i10 < c2163b.d(); i10++) {
            int iB = c2163b.b(i10);
            InterfaceC14599b.a aVarC = c2163b.c(iB);
            if (iB == 0) {
                this.f136956c.g(aVarC);
            } else if (iB == 11) {
                this.f136956c.e(aVarC, this.f136965l);
            } else {
                this.f136956c.c(aVarC);
            }
        }
    }

    private void S0(a3.B b10, InterfaceC14599b.C2163b c2163b, long j10) {
        if (c2163b.a(2)) {
            a3.J jR = b10.r();
            boolean zC = jR.c(2);
            boolean zC2 = jR.c(1);
            boolean zC3 = jR.c(3);
            if (zC || zC2 || zC3) {
                if (!zC) {
                    X0(j10, null, 0);
                }
                if (!zC2) {
                    T0(j10, null, 0);
                }
                if (!zC3) {
                    V0(j10, null, 0);
                }
            }
        }
        if (C0(this.f136969p)) {
            b bVar = this.f136969p;
            a3.t tVar = bVar.f136982a;
            if (tVar.f43957w != -1) {
                X0(j10, tVar, bVar.f136983b);
                this.f136969p = null;
            }
        }
        if (C0(this.f136970q)) {
            b bVar2 = this.f136970q;
            T0(j10, bVar2.f136982a, bVar2.f136983b);
            this.f136970q = null;
        }
        if (C0(this.f136971r)) {
            b bVar3 = this.f136971r;
            V0(j10, bVar3.f136982a, bVar3.f136983b);
            this.f136971r = null;
        }
    }

    private void U0(a3.B b10, InterfaceC14599b.C2163b c2163b) {
        a3.o oVarG0;
        if (c2163b.a(0)) {
            InterfaceC14599b.a aVarC = c2163b.c(0);
            if (this.f136964k != null) {
                W0(aVarC.f137047b, aVarC.f137049d);
            }
        }
        if (c2163b.a(2) && this.f136964k != null && (oVarG0 = G0(b10.r().a())) != null) {
            D0.a(d3.P.h(this.f136964k)).setDrmType(H0(oVarG0));
        }
        if (c2163b.a(1011)) {
            this.f136952A++;
        }
    }

    @Override // i3.InterfaceC14599b
    public void B(InterfaceC14599b.a aVar, B.e eVar, B.e eVar2, int i10) {
        if (i10 == 1) {
            this.f136975v = true;
        }
        this.f136965l = i10;
    }

    @Override // i3.B1.a
    public void C(InterfaceC14599b.a aVar, String str, String str2) {
    }

    @Override // i3.B1.a
    public void K(InterfaceC14599b.a aVar, String str) {
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f136980a;

        /* renamed from: b, reason: collision with root package name */
        public final int f136981b;

        public a(int i10, int i11) {
            this.f136980a = i10;
            this.f136981b = i11;
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final a3.t f136982a;

        /* renamed from: b, reason: collision with root package name */
        public final int f136983b;

        /* renamed from: c, reason: collision with root package name */
        public final String f136984c;

        public b(a3.t tVar, int i10, String str) {
            this.f136982a = tVar;
            this.f136983b = i10;
            this.f136984c = str;
        }
    }

    private boolean C0(b bVar) {
        return bVar != null && bVar.f136984c.equals(this.f136956c.a());
    }

    public static A1 D0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = o1.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new A1(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void E0() {
        PlaybackMetrics.Builder builder = this.f136964k;
        if (builder != null && this.f136953B) {
            builder.setAudioUnderrunCount(this.f136952A);
            this.f136964k.setVideoFramesDropped(this.f136978y);
            this.f136964k.setVideoFramesPlayed(this.f136979z);
            Long l10 = this.f136961h.get(this.f136963j);
            this.f136964k.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f136962i.get(this.f136963j);
            this.f136964k.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f136964k.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f136964k.build();
            this.f136955b.execute(new Runnable() { // from class: i3.y1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137188a.f136957d.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f136964k = null;
        this.f136963j = null;
        this.f136952A = 0;
        this.f136978y = 0;
        this.f136979z = 0;
        this.f136972s = null;
        this.f136973t = null;
        this.f136974u = null;
        this.f136953B = false;
    }

    private static a I0(PlaybackException playbackException, Context context, boolean z10) throws NumberFormatException {
        int i10;
        boolean z11;
        if (playbackException.f55334a == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z11 = exoPlaybackException.f55531j == 1;
            i10 = exoPlaybackException.f55535n;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th2 = (Throwable) C13466a.e(playbackException.getCause());
        if (!(th2 instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, d3.P.Y(((MediaCodecRenderer.DecoderInitializationException) th2).f56420d));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new a(14, ((MediaCodecDecoderException) th2).f56350c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th2).f55757a);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th2).f55762a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(F0(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th2).f55444d);
        }
        if ((th2 instanceof HttpDataSource$InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new a(z10 ? 10 : 11, 0);
        }
        boolean z12 = th2 instanceof HttpDataSource$HttpDataSourceException;
        if (z12 || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (d3.w.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : (z12 && ((HttpDataSource$HttpDataSourceException) th2).f55442c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.f55334a == 1002) {
            return new a(21, 0);
        }
        if (th2 instanceof DrmSession.DrmSessionException) {
            Throwable th3 = (Throwable) C13466a.e(th2.getCause());
            if (!(th3 instanceof MediaDrm.MediaDrmStateException)) {
                return (d3.P.f127086a < 23 || !(th3 instanceof MediaDrmResetException)) ? th3 instanceof NotProvisionedException ? new a(24, 0) : th3 instanceof DeniedByServerException ? new a(29, 0) : th3 instanceof UnsupportedDrmException ? new a(23, 0) : th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0) : new a(27, 0);
            }
            int iY = d3.P.Y(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(F0(iY), iY);
        }
        if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
            return new a(9, 0);
        }
        Throwable cause2 = ((Throwable) C13466a.e(th2.getCause())).getCause();
        return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
    }

    private static Pair<String, String> J0(String str) {
        String[] strArrC1 = d3.P.c1(str, "-");
        return Pair.create(strArrC1[0], strArrC1.length >= 2 ? strArrC1[1] : null);
    }

    private static int M0(a3.v vVar) {
        v.h hVar = vVar.f44012b;
        if (hVar == null) {
            return 0;
        }
        int iW0 = d3.P.w0(hVar.f44110a, hVar.f44111b);
        if (iW0 == 0) {
            return 3;
        }
        if (iW0 != 1) {
            return iW0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private void P0(long j10) {
        int iL0 = L0(this.f136954a);
        if (iL0 != this.f136967n) {
            this.f136967n = iL0;
            final NetworkEvent networkEventBuild = j1.a().setNetworkType(iL0).setTimeSinceCreatedMillis(j10 - this.f136958e).build();
            this.f136955b.execute(new Runnable() { // from class: i3.w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137179a.f136957d.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    private void Q0(long j10) throws NumberFormatException {
        PlaybackException playbackException = this.f136968o;
        if (playbackException == null) {
            return;
        }
        a aVarI0 = I0(playbackException, this.f136954a, this.f136976w == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = l1.a().setTimeSinceCreatedMillis(j10 - this.f136958e).setErrorCode(aVarI0.f136980a).setSubErrorCode(aVarI0.f136981b).setException(playbackException).build();
        this.f136955b.execute(new Runnable() { // from class: i3.x1
            @Override // java.lang.Runnable
            public final void run() {
                this.f137182a.f136957d.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.f136953B = true;
        this.f136968o = null;
    }

    private void T0(long j10, a3.t tVar, int i10) {
        if (Objects.equals(this.f136973t, tVar)) {
            return;
        }
        if (this.f136973t == null && i10 == 0) {
            i10 = 1;
        }
        this.f136973t = tVar;
        Y0(0, j10, tVar, i10);
    }

    private void V0(long j10, a3.t tVar, int i10) {
        if (Objects.equals(this.f136974u, tVar)) {
            return;
        }
        if (this.f136974u == null && i10 == 0) {
            i10 = 1;
        }
        this.f136974u = tVar;
        Y0(2, j10, tVar, i10);
    }

    private void W0(a3.F f10, r.b bVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.f136964k;
        if (bVar == null || (iB = f10.b(bVar.f56933a)) == -1) {
            return;
        }
        f10.f(iB, this.f136960g);
        f10.n(this.f136960g.f43594c, this.f136959f);
        builder.setStreamType(M0(this.f136959f.f43617c));
        F.c cVar = this.f136959f;
        if (cVar.f43627m != -9223372036854775807L && !cVar.f43625k && !cVar.f43623i && !cVar.f()) {
            builder.setMediaDurationMillis(this.f136959f.d());
        }
        builder.setPlaybackType(this.f136959f.f() ? 2 : 1);
        this.f136953B = true;
    }

    private void X0(long j10, a3.t tVar, int i10) {
        if (Objects.equals(this.f136972s, tVar)) {
            return;
        }
        if (this.f136972s == null && i10 == 0) {
            i10 = 1;
        }
        this.f136972s = tVar;
        Y0(1, j10, tVar, i10);
    }

    public LogSessionId K0() {
        return this.f136957d.getSessionId();
    }

    @Override // i3.InterfaceC14599b
    public void M(InterfaceC14599b.a aVar, p3.i iVar, p3.j jVar, IOException iOException, boolean z10) {
        this.f136976w = jVar.f155427a;
    }

    @Override // i3.InterfaceC14599b
    public void i(InterfaceC14599b.a aVar, a3.N n10) {
        b bVar = this.f136969p;
        if (bVar != null) {
            a3.t tVar = bVar.f136982a;
            if (tVar.f43957w == -1) {
                this.f136969p = new b(tVar.b().z0(n10.f43767a).d0(n10.f43768b).N(), bVar.f136983b, bVar.f136984c);
            }
        }
    }

    @Override // i3.InterfaceC14599b
    public void r(InterfaceC14599b.a aVar, PlaybackException playbackException) {
        this.f136968o = playbackException;
    }

    @Override // i3.B1.a
    public void s(InterfaceC14599b.a aVar, String str, boolean z10) {
        r.b bVar = aVar.f137049d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f136963j)) {
            E0();
        }
        this.f136961h.remove(str);
        this.f136962i.remove(str);
    }

    @Override // i3.InterfaceC14599b
    public void t(InterfaceC14599b.a aVar, C14333b c14333b) {
        this.f136978y += c14333b.f134220g;
        this.f136979z += c14333b.f134218e;
    }

    @Override // i3.InterfaceC14599b
    public void t0(InterfaceC14599b.a aVar, int i10, long j10, long j11) {
        r.b bVar = aVar.f137049d;
        if (bVar != null) {
            String strB = this.f136956c.b(aVar.f137047b, (r.b) C13466a.e(bVar));
            Long l10 = this.f136962i.get(strB);
            Long l11 = this.f136961h.get(strB);
            this.f136962i.put(strB, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f136961h.put(strB, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // i3.InterfaceC14599b
    public void u(InterfaceC14599b.a aVar, p3.j jVar) {
        if (aVar.f137049d == null) {
            return;
        }
        b bVar = new b((a3.t) C13466a.e(jVar.f155429c), jVar.f155430d, this.f136956c.b(aVar.f137047b, (r.b) C13466a.e(aVar.f137049d)));
        int i10 = jVar.f155428b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f136970q = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f136971r = bVar;
                return;
            }
        }
        this.f136969p = bVar;
    }

    @Override // i3.B1.a
    public void x(InterfaceC14599b.a aVar, String str) {
        r.b bVar = aVar.f137049d;
        if (bVar == null || !bVar.b()) {
            E0();
            this.f136963j = str;
            this.f136964k = k1.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.6.0");
            W0(aVar.f137047b, aVar.f137049d);
        }
    }

    private A1(Context context, PlaybackSession playbackSession) {
        this.f136954a = context.getApplicationContext();
        this.f136957d = playbackSession;
        C14639t0 c14639t0 = new C14639t0();
        this.f136956c = c14639t0;
        c14639t0.d(this);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int F0(int i10) {
        switch (d3.P.X(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static a3.o G0(Ce.L<J.a> l10) {
        a3.o oVar;
        Ce.y0<J.a> it = l10.iterator();
        while (it.hasNext()) {
            J.a next = it.next();
            for (int i10 = 0; i10 < next.f43757a; i10++) {
                if (next.g(i10) && (oVar = next.b(i10).f43953s) != null) {
                    return oVar;
                }
            }
        }
        return null;
    }

    private static int L0(Context context) {
        switch (d3.w.e(context).g()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private void R0(a3.B b10, InterfaceC14599b.C2163b c2163b, long j10) {
        if (b10.U() != 2) {
            this.f136975v = false;
        }
        if (b10.e() == null) {
            this.f136977x = false;
        } else if (c2163b.a(10)) {
            this.f136977x = true;
        }
        int iZ0 = Z0(b10);
        if (this.f136966m != iZ0) {
            this.f136966m = iZ0;
            this.f136953B = true;
            final PlaybackStateEvent playbackStateEventBuild = n1.a().setState(this.f136966m).setTimeSinceCreatedMillis(j10 - this.f136958e).build();
            this.f136955b.execute(new Runnable() { // from class: i3.z1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f137192a.f136957d.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    private void Y0(int i10, long j10, a3.t tVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = i1.a(i10).setTimeSinceCreatedMillis(j10 - this.f136958e);
        if (tVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(N0(i11));
            String str = tVar.f43948n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = tVar.f43949o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = tVar.f43945k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = tVar.f43944j;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = tVar.f43956v;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = tVar.f43957w;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = tVar.f43924E;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = tVar.f43925F;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = tVar.f43938d;
            if (str4 != null) {
                Pair<String, String> pairJ0 = J0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairJ0.first);
                Object obj = pairJ0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = tVar.f43958x;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f136953B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f136955b.execute(new Runnable() { // from class: i3.v1
            @Override // java.lang.Runnable
            public final void run() {
                this.f137176a.f136957d.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private int Z0(a3.B b10) {
        int iU = b10.U();
        if (this.f136975v) {
            return 5;
        }
        if (this.f136977x) {
            return 13;
        }
        if (iU == 4) {
            return 11;
        }
        if (iU == 2) {
            int i10 = this.f136966m;
            if (i10 == 0 || i10 == 2 || i10 == 12) {
                return 2;
            }
            if (!b10.F()) {
                return 7;
            }
            if (b10.x() != 0) {
                return 10;
            }
            return 6;
        }
        if (iU == 3) {
            if (!b10.F()) {
                return 4;
            }
            if (b10.x() == 0) {
                return 3;
            }
            return 9;
        }
        if (iU == 1 && this.f136966m != 0) {
            return 12;
        }
        return this.f136966m;
    }

    @Override // i3.InterfaceC14599b
    public void n0(a3.B b10, InterfaceC14599b.C2163b c2163b) throws NumberFormatException {
        if (c2163b.d() != 0) {
            O0(c2163b);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            U0(b10, c2163b);
            Q0(jElapsedRealtime);
            S0(b10, c2163b, jElapsedRealtime);
            P0(jElapsedRealtime);
            R0(b10, c2163b, jElapsedRealtime);
            if (c2163b.a(1028)) {
                this.f136956c.f(c2163b.c(1028));
            }
        }
    }
}
