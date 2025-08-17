package androidx.media3.exoplayer.audio;

import Ce.L;
import Ce.y0;
import a3.C5560A;
import a3.C5564d;
import a3.C5567g;
import a3.t;
import a3.z;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.b;
import androidx.media3.exoplayer.audio.g;
import androidx.media3.exoplayer.audio.k;
import androidx.recyclerview.widget.RecyclerView;
import com.google.maps.android.BuildConfig;
import d3.C13466a;
import d3.InterfaceC13473h;
import d3.P;
import d3.r;
import i3.E1;
import j3.F;
import j3.I;
import j3.J;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import x3.C17997b;
import x3.C17998c;
import x3.C18010o;
import x3.H;

/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: l0, reason: collision with root package name */
    public static boolean f55771l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final Object f55772m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    private static ScheduledExecutorService f55773n0;

    /* renamed from: o0, reason: collision with root package name */
    private static int f55774o0;

    /* renamed from: A, reason: collision with root package name */
    private k f55775A;

    /* renamed from: B, reason: collision with root package name */
    private C5564d f55776B;

    /* renamed from: C, reason: collision with root package name */
    private j f55777C;

    /* renamed from: D, reason: collision with root package name */
    private j f55778D;

    /* renamed from: E, reason: collision with root package name */
    private C5560A f55779E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f55780F;

    /* renamed from: G, reason: collision with root package name */
    private ByteBuffer f55781G;

    /* renamed from: H, reason: collision with root package name */
    private int f55782H;

    /* renamed from: I, reason: collision with root package name */
    private long f55783I;

    /* renamed from: J, reason: collision with root package name */
    private long f55784J;

    /* renamed from: K, reason: collision with root package name */
    private long f55785K;

    /* renamed from: L, reason: collision with root package name */
    private long f55786L;

    /* renamed from: M, reason: collision with root package name */
    private int f55787M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f55788N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f55789O;

    /* renamed from: P, reason: collision with root package name */
    private long f55790P;

    /* renamed from: Q, reason: collision with root package name */
    private float f55791Q;

    /* renamed from: R, reason: collision with root package name */
    private ByteBuffer f55792R;

    /* renamed from: S, reason: collision with root package name */
    private int f55793S;

    /* renamed from: T, reason: collision with root package name */
    private ByteBuffer f55794T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f55795U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f55796V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f55797W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f55798X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f55799Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f55800Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f55801a;

    /* renamed from: a0, reason: collision with root package name */
    private C5567g f55802a0;

    /* renamed from: b, reason: collision with root package name */
    private final b3.n f55803b;

    /* renamed from: b0, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f55804b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f55805c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f55806c0;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.h f55807d;

    /* renamed from: d0, reason: collision with root package name */
    private long f55808d0;

    /* renamed from: e, reason: collision with root package name */
    private final o f55809e;

    /* renamed from: e0, reason: collision with root package name */
    private long f55810e0;

    /* renamed from: f, reason: collision with root package name */
    private final L<AudioProcessor> f55811f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f55812f0;

    /* renamed from: g, reason: collision with root package name */
    private final L<AudioProcessor> f55813g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f55814g0;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.g f55815h;

    /* renamed from: h0, reason: collision with root package name */
    private Looper f55816h0;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayDeque<j> f55817i;

    /* renamed from: i0, reason: collision with root package name */
    private long f55818i0;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f55819j;

    /* renamed from: j0, reason: collision with root package name */
    private long f55820j0;

    /* renamed from: k, reason: collision with root package name */
    private int f55821k;

    /* renamed from: k0, reason: collision with root package name */
    private Handler f55822k0;

    /* renamed from: l, reason: collision with root package name */
    private n f55823l;

    /* renamed from: m, reason: collision with root package name */
    private final l<AudioSink.InitializationException> f55824m;

    /* renamed from: n, reason: collision with root package name */
    private final l<AudioSink.WriteException> f55825n;

    /* renamed from: o, reason: collision with root package name */
    private final e f55826o;

    /* renamed from: p, reason: collision with root package name */
    private final d f55827p;

    /* renamed from: q, reason: collision with root package name */
    private final ExoPlayer.a f55828q;

    /* renamed from: r, reason: collision with root package name */
    private final f f55829r;

    /* renamed from: s, reason: collision with root package name */
    private E1 f55830s;

    /* renamed from: t, reason: collision with root package name */
    private AudioSink.b f55831t;

    /* renamed from: u, reason: collision with root package name */
    private h f55832u;

    /* renamed from: v, reason: collision with root package name */
    private h f55833v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.media3.common.audio.a f55834w;

    /* renamed from: x, reason: collision with root package name */
    private AudioTrack f55835x;

    /* renamed from: y, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f55836y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.b f55837z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, androidx.media3.exoplayer.audio.c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f55905a);
        }
    }

    public interface d {
        androidx.media3.exoplayer.audio.d a(t tVar, C5564d c5564d);
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f55838a = new k.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f55839a = new androidx.media3.exoplayer.audio.l();

        AudioTrack a(AudioSink.a aVar, C5564d c5564d, int i10);
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f55840a;

        /* renamed from: c, reason: collision with root package name */
        private b3.n f55842c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f55843d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f55844e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f55845f;

        /* renamed from: i, reason: collision with root package name */
        private d f55848i;

        /* renamed from: j, reason: collision with root package name */
        private ExoPlayer.a f55849j;

        /* renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.audio.a f55841b = androidx.media3.exoplayer.audio.a.f55881c;

        /* renamed from: g, reason: collision with root package name */
        private e f55846g = e.f55838a;

        /* renamed from: h, reason: collision with root package name */
        private f f55847h = f.f55839a;

        public DefaultAudioSink j() {
            C13466a.g(!this.f55845f);
            this.f55845f = true;
            if (this.f55842c == null) {
                this.f55842c = new i(new AudioProcessor[0]);
            }
            if (this.f55848i == null) {
                this.f55848i = new androidx.media3.exoplayer.audio.i(this.f55840a);
            }
            return new DefaultAudioSink(this);
        }

        public g k(boolean z10) {
            this.f55844e = z10;
            return this;
        }

        public g l(boolean z10) {
            this.f55843d = z10;
            return this;
        }

        public g(Context context) {
            this.f55840a = context;
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final t f55850a;

        /* renamed from: b, reason: collision with root package name */
        public final int f55851b;

        /* renamed from: c, reason: collision with root package name */
        public final int f55852c;

        /* renamed from: d, reason: collision with root package name */
        public final int f55853d;

        /* renamed from: e, reason: collision with root package name */
        public final int f55854e;

        /* renamed from: f, reason: collision with root package name */
        public final int f55855f;

        /* renamed from: g, reason: collision with root package name */
        public final int f55856g;

        /* renamed from: h, reason: collision with root package name */
        public final int f55857h;

        /* renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f55858i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f55859j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f55860k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f55861l;

        public AudioSink.a a() {
            return new AudioSink.a(this.f55856g, this.f55854e, this.f55855f, this.f55861l, this.f55852c == 1, this.f55857h);
        }

        public boolean b(h hVar) {
            return hVar.f55852c == this.f55852c && hVar.f55856g == this.f55856g && hVar.f55854e == this.f55854e && hVar.f55855f == this.f55855f && hVar.f55853d == this.f55853d && hVar.f55859j == this.f55859j && hVar.f55860k == this.f55860k;
        }

        public h c(int i10) {
            return new h(this.f55850a, this.f55851b, this.f55852c, this.f55853d, this.f55854e, this.f55855f, this.f55856g, i10, this.f55858i, this.f55859j, this.f55860k, this.f55861l);
        }

        public long d(long j10) {
            return P.U0(j10, this.f55854e);
        }

        public long e(long j10) {
            return P.U0(j10, this.f55850a.f43925F);
        }

        public boolean f() {
            return this.f55852c == 1;
        }

        public h(t tVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, androidx.media3.common.audio.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f55850a = tVar;
            this.f55851b = i10;
            this.f55852c = i11;
            this.f55853d = i12;
            this.f55854e = i13;
            this.f55855f = i14;
            this.f55856g = i15;
            this.f55857h = i16;
            this.f55858i = aVar;
            this.f55859j = z10;
            this.f55860k = z11;
            this.f55861l = z12;
        }
    }

    public static class i implements b3.n {

        /* renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f55862a;

        /* renamed from: b, reason: collision with root package name */
        private final J f55863b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.audio.d f55864c;

        public i(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new J(), new androidx.media3.common.audio.d());
        }

        public i(AudioProcessor[] audioProcessorArr, J j10, androidx.media3.common.audio.d dVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f55862a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f55863b = j10;
            this.f55864c = dVar;
            audioProcessorArr2[audioProcessorArr.length] = j10;
            audioProcessorArr2[audioProcessorArr.length + 1] = dVar;
        }

        @Override // b3.n
        public long a(long j10) {
            return this.f55864c.a() ? this.f55864c.h(j10) : j10;
        }

        @Override // b3.n
        public AudioProcessor[] b() {
            return this.f55862a;
        }

        @Override // b3.n
        public C5560A c(C5560A c5560a) {
            this.f55864c.j(c5560a.f43552a);
            this.f55864c.i(c5560a.f43553b);
            return c5560a;
        }

        @Override // b3.n
        public long d() {
            return this.f55863b.u();
        }

        @Override // b3.n
        public boolean e(boolean z10) {
            this.f55863b.D(z10);
            return z10;
        }
    }

    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final C5560A f55865a;

        /* renamed from: b, reason: collision with root package name */
        public final long f55866b;

        /* renamed from: c, reason: collision with root package name */
        public final long f55867c;

        /* renamed from: d, reason: collision with root package name */
        public long f55868d;

        private j(C5560A c5560a, long j10, long j11) {
            this.f55865a = c5560a;
            this.f55866b = j10;
            this.f55867c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f55869a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.audio.b f55870b;

        /* renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f55871c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.j
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f55968a.b(audioRouting);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f55871c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f55870b.i(routedDevice);
        }

        public void c() {
            this.f55869a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) C13466a.e(this.f55871c));
            this.f55871c = null;
        }

        public k(AudioTrack audioTrack, androidx.media3.exoplayer.audio.b bVar) {
            this.f55869a = audioTrack;
            this.f55870b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f55871c, new Handler(Looper.myLooper()));
        }
    }

    private static final class l<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private T f55872a;

        /* renamed from: b, reason: collision with root package name */
        private long f55873b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        private long f55874c = -9223372036854775807L;

        public void a() {
            this.f55872a = null;
            this.f55873b = -9223372036854775807L;
            this.f55874c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f55872a == null) {
                return false;
            }
            return DefaultAudioSink.Y() || SystemClock.elapsedRealtime() < this.f55874c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void c(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f55872a == null) {
                this.f55872a = t10;
            }
            if (this.f55873b == -9223372036854775807L && !DefaultAudioSink.Y()) {
                this.f55873b = 200 + jElapsedRealtime;
            }
            long j10 = this.f55873b;
            if (j10 != -9223372036854775807L && jElapsedRealtime >= j10) {
                T t11 = this.f55872a;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f55872a;
                a();
                throw t12;
            }
            this.f55874c = jElapsedRealtime + 50;
        }
    }

    private final class m implements g.a {
        private m() {
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void a(int i10, long j10) {
            if (DefaultAudioSink.this.f55831t != null) {
                DefaultAudioSink.this.f55831t.h(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f55810e0);
            }
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void b(long j10) {
            r.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if (DefaultAudioSink.f55771l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            r.i("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if (DefaultAudioSink.f55771l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            r.i("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void e(long j10) {
            if (DefaultAudioSink.this.f55831t != null) {
                DefaultAudioSink.this.f55831t.e(j10);
            }
        }
    }

    private final class n {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f55876a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f55877b;

        class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f55879a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f55879a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.f55835x) && DefaultAudioSink.this.f55831t != null && DefaultAudioSink.this.f55798X) {
                    DefaultAudioSink.this.f55831t.k();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f55835x)) {
                    DefaultAudioSink.this.f55797W = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f55835x) && DefaultAudioSink.this.f55831t != null && DefaultAudioSink.this.f55798X) {
                    DefaultAudioSink.this.f55831t.k();
                }
            }
        }

        public n() {
            this.f55877b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f55876a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new F(handler), this.f55877b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f55877b);
            this.f55876a.removeCallbacksAndMessages(null);
        }
    }

    public static /* synthetic */ void C(AudioTrack audioTrack, final AudioSink.b bVar, Handler handler, final AudioSink.a aVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: j3.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.b(aVar);
                    }
                });
            }
            synchronized (f55772m0) {
                try {
                    int i10 = f55774o0 - 1;
                    f55774o0 = i10;
                    if (i10 == 0) {
                        f55773n0.shutdown();
                        f55773n0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (bVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: j3.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        bVar.b(aVar);
                    }
                });
            }
            synchronized (f55772m0) {
                try {
                    int i11 = f55774o0 - 1;
                    f55774o0 = i11;
                    if (i11 == 0) {
                        f55773n0.shutdown();
                        f55773n0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private static int v0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void i() throws IllegalStateException {
        this.f55798X = true;
        if (b0()) {
            this.f55815h.v();
            this.f55835x.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() throws IllegalStateException {
        this.f55798X = false;
        if (b0()) {
            if (this.f55815h.p() || c0(this.f55835x)) {
                this.f55835x.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void v() {
        this.f55788N = true;
    }

    private static final class c {
        public static void a(AudioTrack audioTrack, E1 e12) {
            LogSessionId logSessionIdA = e12.a();
            if (!logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(logSessionIdA);
            }
        }
    }

    private DefaultAudioSink(g gVar) {
        Context context = gVar.f55840a;
        this.f55801a = context;
        this.f55776B = C5564d.f43811g;
        this.f55836y = context != null ? null : gVar.f55841b;
        this.f55803b = gVar.f55842c;
        this.f55805c = gVar.f55843d;
        this.f55819j = P.f127086a >= 23 && gVar.f55844e;
        this.f55821k = 0;
        this.f55826o = gVar.f55846g;
        this.f55827p = (d) C13466a.e(gVar.f55848i);
        this.f55815h = new androidx.media3.exoplayer.audio.g(new m());
        androidx.media3.exoplayer.audio.h hVar = new androidx.media3.exoplayer.audio.h();
        this.f55807d = hVar;
        o oVar = new o();
        this.f55809e = oVar;
        this.f55811f = L.B(new androidx.media3.common.audio.e(), hVar, oVar);
        this.f55813g = L.B(new androidx.media3.exoplayer.audio.n(), hVar, oVar);
        this.f55791Q = 1.0f;
        this.f55800Z = 0;
        this.f55802a0 = new C5567g(0, 0.0f);
        C5560A c5560a = C5560A.f43549d;
        this.f55778D = new j(c5560a, 0L, 0L);
        this.f55779E = c5560a;
        this.f55780F = false;
        this.f55817i = new ArrayDeque<>();
        this.f55824m = new l<>();
        this.f55825n = new l<>();
        this.f55828q = gVar.f55849j;
        this.f55829r = gVar.f55847h;
    }

    private long M(long j10) {
        while (!this.f55817i.isEmpty() && j10 >= this.f55817i.getFirst().f55867c) {
            this.f55778D = this.f55817i.remove();
        }
        j jVar = this.f55778D;
        long j11 = j10 - jVar.f55867c;
        long jC0 = P.c0(j11, jVar.f55865a.f43552a);
        if (!this.f55817i.isEmpty()) {
            j jVar2 = this.f55778D;
            return jVar2.f55866b + jC0 + jVar2.f55868d;
        }
        long jA = this.f55803b.a(j11);
        j jVar3 = this.f55778D;
        long j12 = jVar3.f55866b + jA;
        jVar3.f55868d = jA - jC0;
        return j12;
    }

    private long N(long j10) {
        long jD = this.f55803b.d();
        long jD2 = j10 + this.f55833v.d(jD);
        long j11 = this.f55818i0;
        if (jD > j11) {
            long jD3 = this.f55833v.d(jD - j11);
            this.f55818i0 = jD;
            X(jD3);
        }
        return jD2;
    }

    private AudioTrack O(AudioSink.a aVar, C5564d c5564d, int i10, t tVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = this.f55829r.a(aVar, c5564d, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, aVar.f55766b, aVar.f55767c, aVar.f55765a, tVar, aVar.f55769e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new AudioSink.InitializationException(0, aVar.f55766b, aVar.f55767c, aVar.f55765a, tVar, aVar.f55769e, e10);
        }
    }

    private AudioTrack Q() throws AudioSink.InitializationException {
        try {
            return P((h) C13466a.e(this.f55833v));
        } catch (AudioSink.InitializationException e10) {
            h hVar = this.f55833v;
            if (hVar.f55857h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackP = P(hVarC);
                    this.f55833v = hVarC;
                    return audioTrackP;
                } catch (AudioSink.InitializationException e11) {
                    e10.addSuppressed(e11);
                    d0();
                    throw e10;
                }
            }
            d0();
            throw e10;
        }
    }

    private void R(long j10) throws Exception {
        DefaultAudioSink defaultAudioSink;
        int iV0;
        AudioSink.b bVar;
        if (this.f55794T == null || this.f55825n.b()) {
            return;
        }
        int iRemaining = this.f55794T.remaining();
        if (this.f55806c0) {
            C13466a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f55808d0;
            } else {
                this.f55808d0 = j10;
            }
            defaultAudioSink = this;
            iV0 = defaultAudioSink.w0(this.f55835x, this.f55794T, iRemaining, j10);
        } else {
            defaultAudioSink = this;
            iV0 = v0(defaultAudioSink.f55835x, defaultAudioSink.f55794T, iRemaining);
        }
        defaultAudioSink.f55810e0 = SystemClock.elapsedRealtime();
        if (iV0 < 0) {
            if (a0(iV0)) {
                if (W() > 0) {
                    z = true;
                } else if (c0(defaultAudioSink.f55835x)) {
                    d0();
                    z = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iV0, defaultAudioSink.f55833v.f55850a, z);
            AudioSink.b bVar2 = defaultAudioSink.f55831t;
            if (bVar2 != null) {
                bVar2.d(writeException);
            }
            if (!writeException.f55763b || defaultAudioSink.f55801a == null) {
                defaultAudioSink.f55825n.c(writeException);
                return;
            } else {
                defaultAudioSink.f55836y = androidx.media3.exoplayer.audio.a.f55881c;
                throw writeException;
            }
        }
        defaultAudioSink.f55825n.a();
        if (c0(defaultAudioSink.f55835x)) {
            if (defaultAudioSink.f55786L > 0) {
                defaultAudioSink.f55814g0 = false;
            }
            if (defaultAudioSink.f55798X && (bVar = defaultAudioSink.f55831t) != null && iV0 < iRemaining && !defaultAudioSink.f55814g0) {
                bVar.g();
            }
        }
        int i10 = defaultAudioSink.f55833v.f55852c;
        if (i10 == 0) {
            defaultAudioSink.f55785K += iV0;
        }
        if (iV0 == iRemaining) {
            if (i10 != 0) {
                C13466a.g(defaultAudioSink.f55794T == defaultAudioSink.f55792R);
                defaultAudioSink.f55786L += defaultAudioSink.f55787M * defaultAudioSink.f55793S;
            }
            defaultAudioSink.f55794T = null;
        }
    }

    private boolean S() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f55834w.f()) {
            R(Long.MIN_VALUE);
            return this.f55794T == null;
        }
        this.f55834w.h();
        j0(Long.MIN_VALUE);
        return this.f55834w.e() && ((byteBuffer = this.f55794T) == null || !byteBuffer.hasRemaining());
    }

    private static int U(int i10, ByteBuffer byteBuffer) {
        if (i10 == 20) {
            return H.h(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iM = x3.F.m(P.O(byteBuffer, byteBuffer.position()));
                    if (iM != -1) {
                        return iM;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return RecyclerView.m.FLAG_MOVED;
                default:
                    switch (i10) {
                        case 14:
                            int iB = C17997b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return C17997b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return C17998c.e(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
            }
            return C17997b.e(byteBuffer);
        }
        return C18010o.f(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long V() {
        return this.f55833v.f55852c == 0 ? this.f55783I / r0.f55851b : this.f55784J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long W() {
        return this.f55833v.f55852c == 0 ? P.k(this.f55785K, r0.f55853d) : this.f55786L;
    }

    private void X(long j10) {
        this.f55820j0 += j10;
        if (this.f55822k0 == null) {
            this.f55822k0 = new Handler(Looper.myLooper());
        }
        this.f55822k0.removeCallbacksAndMessages(null);
        this.f55822k0.postDelayed(new Runnable() { // from class: j3.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f139185a.f0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Y() {
        boolean z10;
        synchronized (f55772m0) {
            z10 = f55774o0 > 0;
        }
        return z10;
    }

    private boolean Z() throws AudioSink.InitializationException {
        androidx.media3.exoplayer.audio.b bVar;
        E1 e12;
        if (this.f55824m.b()) {
            return false;
        }
        AudioTrack audioTrackQ = Q();
        this.f55835x = audioTrackQ;
        if (c0(audioTrackQ)) {
            k0(this.f55835x);
            h hVar = this.f55833v;
            if (hVar.f55860k) {
                AudioTrack audioTrack = this.f55835x;
                t tVar = hVar.f55850a;
                audioTrack.setOffloadDelayPadding(tVar.f43927H, tVar.f43928I);
            }
        }
        int i10 = P.f127086a;
        if (i10 >= 31 && (e12 = this.f55830s) != null) {
            c.a(this.f55835x, e12);
        }
        this.f55800Z = this.f55835x.getAudioSessionId();
        androidx.media3.exoplayer.audio.g gVar = this.f55815h;
        AudioTrack audioTrack2 = this.f55835x;
        h hVar2 = this.f55833v;
        gVar.s(audioTrack2, hVar2.f55852c == 2, hVar2.f55856g, hVar2.f55853d, hVar2.f55857h);
        q0();
        int i11 = this.f55802a0.f43829a;
        if (i11 != 0) {
            this.f55835x.attachAuxEffect(i11);
            this.f55835x.setAuxEffectSendLevel(this.f55802a0.f43830b);
        }
        androidx.media3.exoplayer.audio.c cVar = this.f55804b0;
        if (cVar != null && i10 >= 23) {
            b.a(this.f55835x, cVar);
            androidx.media3.exoplayer.audio.b bVar2 = this.f55837z;
            if (bVar2 != null) {
                bVar2.i(this.f55804b0.f55905a);
            }
        }
        if (i10 >= 24 && (bVar = this.f55837z) != null) {
            this.f55775A = new k(this.f55835x, bVar);
        }
        this.f55789O = true;
        AudioSink.b bVar3 = this.f55831t;
        if (bVar3 != null) {
            bVar3.a(this.f55833v.a());
        }
        return true;
    }

    private static boolean a0(int i10) {
        return (P.f127086a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean b0() {
        return this.f55835x != null;
    }

    private static boolean c0(AudioTrack audioTrack) {
        return P.f127086a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void d0() {
        if (this.f55833v.f()) {
            this.f55812f0 = true;
        }
    }

    private ByteBuffer e0(ByteBuffer byteBuffer) {
        if (this.f55833v.f55852c == 0) {
            int iE = (int) P.E(P.M0(20L), this.f55833v.f55854e);
            long jW = W();
            if (jW < iE) {
                h hVar = this.f55833v;
                return I.a(byteBuffer, hVar.f55856g, hVar.f55853d, (int) jW, iE);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        if (this.f55820j0 >= 300000) {
            this.f55831t.f();
            this.f55820j0 = 0L;
        }
    }

    private void g0() {
        if (this.f55837z == null && this.f55801a != null) {
            this.f55816h0 = Looper.myLooper();
            androidx.media3.exoplayer.audio.b bVar = new androidx.media3.exoplayer.audio.b(this.f55801a, new b.f() { // from class: j3.z
                @Override // androidx.media3.exoplayer.audio.b.f
                public final void a(androidx.media3.exoplayer.audio.a aVar) {
                    this.f139241a.h0(aVar);
                }
            }, this.f55776B, this.f55804b0);
            this.f55837z = bVar;
            this.f55836y = bVar.g();
        }
        C13466a.e(this.f55836y);
    }

    private void i0() throws IllegalStateException {
        if (this.f55796V) {
            return;
        }
        this.f55796V = true;
        this.f55815h.g(W());
        if (c0(this.f55835x)) {
            this.f55797W = false;
        }
        this.f55835x.stop();
        this.f55782H = 0;
    }

    private void k0(AudioTrack audioTrack) {
        if (this.f55823l == null) {
            this.f55823l = new n();
        }
        this.f55823l.a(audioTrack);
    }

    private static void l0(final AudioTrack audioTrack, final AudioSink.b bVar, final AudioSink.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f55772m0) {
            try {
                if (f55773n0 == null) {
                    f55773n0 = P.O0("ExoPlayer:AudioTrackReleaseThread");
                }
                f55774o0++;
                f55773n0.schedule(new Runnable() { // from class: j3.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAudioSink.C(audioTrack, bVar, handler, aVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m0() {
        this.f55783I = 0L;
        this.f55784J = 0L;
        this.f55785K = 0L;
        this.f55786L = 0L;
        this.f55814g0 = false;
        this.f55787M = 0;
        this.f55778D = new j(this.f55779E, 0L, 0L);
        this.f55790P = 0L;
        this.f55777C = null;
        this.f55817i.clear();
        this.f55792R = null;
        this.f55793S = 0;
        this.f55794T = null;
        this.f55796V = false;
        this.f55795U = false;
        this.f55797W = false;
        this.f55781G = null;
        this.f55782H = 0;
        this.f55809e.n();
        r0();
    }

    private void n0(C5560A c5560a) {
        j jVar = new j(c5560a, -9223372036854775807L, -9223372036854775807L);
        if (b0()) {
            this.f55777C = jVar;
        } else {
            this.f55778D = jVar;
        }
    }

    private void p0(ByteBuffer byteBuffer) {
        C13466a.g(this.f55794T == null);
        if (byteBuffer.hasRemaining()) {
            this.f55794T = e0(byteBuffer);
        }
    }

    private void r0() {
        androidx.media3.common.audio.a aVar = this.f55833v.f55858i;
        this.f55834w = aVar;
        aVar.b();
    }

    private boolean s0() {
        if (this.f55806c0) {
            return false;
        }
        h hVar = this.f55833v;
        return hVar.f55852c == 0 && !t0(hVar.f55850a.f43926G);
    }

    private boolean t0(int i10) {
        return this.f55805c && P.B0(i10);
    }

    private boolean u0() {
        h hVar = this.f55833v;
        return hVar != null && hVar.f55859j && P.f127086a >= 23;
    }

    private int w0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (P.f127086a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f55781G == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f55781G = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f55781G.putInt(1431633921);
        }
        if (this.f55782H == 0) {
            this.f55781G.putInt(4, i10);
            this.f55781G.putLong(8, j10 * 1000);
            this.f55781G.position(0);
            this.f55782H = i10;
        }
        int iRemaining = this.f55781G.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f55781G, iRemaining, 1);
            if (iWrite < 0) {
                this.f55782H = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iV0 = v0(audioTrack, byteBuffer, i10);
        if (iV0 < 0) {
            this.f55782H = 0;
            return iV0;
        }
        this.f55782H -= iV0;
        return iV0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void d(C5560A c5560a) {
        this.f55779E = new C5560A(P.n(c5560a.f43552a, 0.1f, 8.0f), P.n(c5560a.f43553b, 0.1f, 8.0f));
        if (u0()) {
            o0();
        } else {
            n0(c5560a);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void e(int i10) throws IllegalStateException {
        if (this.f55800Z != i10) {
            this.f55800Z = i10;
            this.f55799Y = i10 != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public C5560A f() {
        return this.f55779E;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void g(AudioSink.b bVar) {
        this.f55831t = bVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void h(float f10) {
        if (this.f55791Q != f10) {
            this.f55791Q = f10;
            q0();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void j(int i10) {
        C13466a.g(P.f127086a >= 29);
        this.f55821k = i10;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void k() throws IllegalStateException {
        if (this.f55806c0) {
            this.f55806c0 = false;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void l(t tVar, int i10, int[] iArr) throws AudioSink.ConfigurationException {
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        androidx.media3.common.audio.a aVar;
        int i16;
        int i17;
        int iA;
        g0();
        if ("audio/raw".equals(tVar.f43949o)) {
            C13466a.a(P.C0(tVar.f43926G));
            int iG0 = P.g0(tVar.f43926G, tVar.f43924E);
            L.a aVar2 = new L.a();
            if (t0(tVar.f43926G)) {
                aVar2.j(this.f55813g);
            } else {
                aVar2.j(this.f55811f);
                aVar2.i(this.f55803b.b());
            }
            androidx.media3.common.audio.a aVar3 = new androidx.media3.common.audio.a(aVar2.k());
            if (aVar3.equals(this.f55834w)) {
                aVar3 = this.f55834w;
            }
            this.f55809e.o(tVar.f43927H, tVar.f43928I);
            this.f55807d.m(iArr);
            try {
                AudioProcessor.a aVarA = aVar3.a(new AudioProcessor.a(tVar));
                int i18 = aVarA.f55346c;
                i11 = aVarA.f55344a;
                int iL = P.L(aVarA.f55345b);
                int iG02 = P.g0(i18, aVarA.f55345b);
                i12 = 0;
                i14 = i18;
                i15 = iL;
                z11 = this.f55819j;
                aVar = aVar3;
                i16 = iG02;
                i13 = iG0;
                z10 = false;
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw new AudioSink.ConfigurationException(e10, tVar);
            }
        } else {
            androidx.media3.common.audio.a aVar4 = new androidx.media3.common.audio.a(L.x());
            i11 = tVar.f43925F;
            androidx.media3.exoplayer.audio.d dVarY = this.f55821k != 0 ? y(tVar) : androidx.media3.exoplayer.audio.d.f55906d;
            if (this.f55821k == 0 || !dVarY.f55907a) {
                Pair<Integer, Integer> pairH = this.f55836y.h(tVar, this.f55776B);
                if (pairH == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + tVar, tVar);
                }
                int iIntValue = ((Integer) pairH.first).intValue();
                int iIntValue2 = ((Integer) pairH.second).intValue();
                i12 = 2;
                i13 = -1;
                z10 = false;
                i14 = iIntValue;
                i15 = iIntValue2;
                z11 = this.f55819j;
                aVar = aVar4;
            } else {
                int iF = z.f((String) C13466a.e(tVar.f43949o), tVar.f43945k);
                int iL2 = P.L(tVar.f43924E);
                z10 = dVarY.f55908b;
                i13 = -1;
                aVar = aVar4;
                i14 = iF;
                i15 = iL2;
                z11 = true;
                i12 = 1;
            }
            i16 = i13;
        }
        if (i14 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i12 + ") for: " + tVar, tVar);
        }
        if (i15 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i12 + ") for: " + tVar, tVar);
        }
        int i19 = tVar.f43944j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(tVar.f43949o) && i19 == -1) {
            i19 = 768000;
        }
        int i20 = i19;
        if (i10 != 0) {
            iA = i10;
            i17 = i11;
        } else {
            i17 = i11;
            iA = this.f55826o.a(T(i11, i15, i14), i14, i12, i16 != -1 ? i16 : 1, i17, i20, z11 ? 8.0d : 1.0d);
        }
        this.f55812f0 = false;
        int i21 = i12;
        h hVar = new h(tVar, i13, i21, i16, i17, i15, i14, iA, aVar, z11, z10, this.f55806c0);
        if (b0()) {
            this.f55832u = hVar;
        } else {
            this.f55833v = hVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void m(E1 e12) {
        this.f55830s = e12;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void n(InterfaceC13473h interfaceC13473h) {
        this.f55815h.u(interfaceC13473h);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean o(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.f55792R;
        C13466a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f55832u != null) {
            if (!S()) {
                return false;
            }
            if (this.f55832u.b(this.f55833v)) {
                this.f55833v = this.f55832u;
                this.f55832u = null;
                AudioTrack audioTrack = this.f55835x;
                if (audioTrack != null && c0(audioTrack) && this.f55833v.f55860k) {
                    if (this.f55835x.getPlayState() == 3) {
                        this.f55835x.setOffloadEndOfStream();
                        this.f55815h.a();
                    }
                    AudioTrack audioTrack2 = this.f55835x;
                    t tVar = this.f55833v.f55850a;
                    audioTrack2.setOffloadDelayPadding(tVar.f43927H, tVar.f43928I);
                    this.f55814g0 = true;
                }
            } else {
                i0();
                if (b()) {
                    return false;
                }
                flush();
            }
            L(j10);
        }
        if (!b0()) {
            try {
                if (!Z()) {
                    return false;
                }
            } catch (AudioSink.InitializationException e10) {
                if (e10.f55758b) {
                    throw e10;
                }
                this.f55824m.c(e10);
                return false;
            }
        }
        this.f55824m.a();
        if (this.f55789O) {
            this.f55790P = Math.max(0L, j10);
            this.f55788N = false;
            this.f55789O = false;
            if (u0()) {
                o0();
            }
            L(j10);
            if (this.f55798X) {
                i();
            }
        }
        if (!this.f55815h.k(W())) {
            return false;
        }
        if (this.f55792R == null) {
            C13466a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f55833v;
            if (hVar.f55852c != 0 && this.f55787M == 0) {
                int iU = U(hVar.f55856g, byteBuffer);
                this.f55787M = iU;
                if (iU == 0) {
                    return true;
                }
            }
            if (this.f55777C != null) {
                if (!S()) {
                    return false;
                }
                L(j10);
                this.f55777C = null;
            }
            long jE = this.f55790P + this.f55833v.e(V() - this.f55809e.m());
            if (!this.f55788N && Math.abs(jE - j10) > 200000) {
                AudioSink.b bVar = this.f55831t;
                if (bVar != null) {
                    bVar.d(new AudioSink.UnexpectedDiscontinuityException(j10, jE));
                }
                this.f55788N = true;
            }
            if (this.f55788N) {
                if (!S()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.f55790P += j11;
                this.f55788N = false;
                L(j10);
                AudioSink.b bVar2 = this.f55831t;
                if (bVar2 != null && j11 != 0) {
                    bVar2.j();
                }
            }
            if (this.f55833v.f55852c == 0) {
                this.f55783I += byteBuffer.remaining();
            } else {
                this.f55784J += this.f55787M * i10;
            }
            this.f55792R = byteBuffer;
            this.f55793S = i10;
        }
        j0(j10);
        if (!this.f55792R.hasRemaining()) {
            this.f55792R = null;
            this.f55793S = 0;
            return true;
        }
        if (!this.f55815h.j(W())) {
            return false;
        }
        r.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void q() throws IllegalStateException, AudioSink.WriteException {
        if (!this.f55795U && b0() && S()) {
            i0();
            this.f55795U = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void r(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f55835x;
        if (audioTrack == null || !c0(audioTrack) || (hVar = this.f55833v) == null || !hVar.f55860k) {
            return;
        }
        this.f55835x.setOffloadDelayPadding(i10, i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        androidx.media3.exoplayer.audio.b bVar = this.f55837z;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void s(C5564d c5564d) throws IllegalStateException {
        if (this.f55776B.equals(c5564d)) {
            return;
        }
        this.f55776B = c5564d;
        if (this.f55806c0) {
            return;
        }
        androidx.media3.exoplayer.audio.b bVar = this.f55837z;
        if (bVar != null) {
            bVar.h(c5564d);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f55804b0 = audioDeviceInfo == null ? null : new androidx.media3.exoplayer.audio.c(audioDeviceInfo);
        androidx.media3.exoplayer.audio.b bVar = this.f55837z;
        if (bVar != null) {
            bVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f55835x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f55804b0);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void w(C5567g c5567g) {
        if (this.f55802a0.equals(c5567g)) {
            return;
        }
        int i10 = c5567g.f43829a;
        float f10 = c5567g.f43830b;
        AudioTrack audioTrack = this.f55835x;
        if (audioTrack != null) {
            if (this.f55802a0.f43829a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f55835x.setAuxEffectSendLevel(f10);
            }
        }
        this.f55802a0 = c5567g;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void x() throws IllegalStateException {
        C13466a.g(this.f55799Y);
        if (this.f55806c0) {
            return;
        }
        this.f55806c0 = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.d y(t tVar) {
        return this.f55812f0 ? androidx.media3.exoplayer.audio.d.f55906d : this.f55827p.a(tVar, this.f55776B);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void z(boolean z10) {
        this.f55780F = z10;
        n0(u0() ? C5560A.f43549d : this.f55779E);
    }

    private void L(long j10) {
        C5560A c5560aC;
        boolean zE;
        if (!u0()) {
            if (s0()) {
                c5560aC = this.f55803b.c(this.f55779E);
            } else {
                c5560aC = C5560A.f43549d;
            }
            this.f55779E = c5560aC;
        } else {
            c5560aC = C5560A.f43549d;
        }
        C5560A c5560a = c5560aC;
        if (s0()) {
            zE = this.f55803b.e(this.f55780F);
        } else {
            zE = false;
        }
        this.f55780F = zE;
        this.f55817i.add(new j(c5560a, Math.max(0L, j10), this.f55833v.d(W())));
        r0();
        AudioSink.b bVar = this.f55831t;
        if (bVar != null) {
            bVar.c(this.f55780F);
        }
    }

    private AudioTrack P(h hVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackO = O(hVar.a(), this.f55776B, this.f55800Z, hVar.f55850a);
            ExoPlayer.a aVar = this.f55828q;
            if (aVar != null) {
                aVar.C(c0(audioTrackO));
                return audioTrackO;
            }
            return audioTrackO;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.b bVar = this.f55831t;
            if (bVar != null) {
                bVar.d(e10);
            }
            throw e10;
        }
    }

    private static int T(int i10, int i11, int i12) {
        boolean z10;
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        if (minBufferSize != -2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        return minBufferSize;
    }

    private void j0(long j10) throws Exception {
        R(j10);
        if (this.f55794T == null) {
            if (!this.f55834w.f()) {
                ByteBuffer byteBuffer = this.f55792R;
                if (byteBuffer != null) {
                    p0(byteBuffer);
                    R(j10);
                    return;
                }
                return;
            }
            while (!this.f55834w.e()) {
                do {
                    ByteBuffer byteBufferD = this.f55834w.d();
                    if (byteBufferD.hasRemaining()) {
                        p0(byteBufferD);
                        R(j10);
                    } else {
                        ByteBuffer byteBuffer2 = this.f55792R;
                        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                            this.f55834w.i(this.f55792R);
                        } else {
                            return;
                        }
                    }
                } while (this.f55794T == null);
                return;
            }
        }
    }

    private void o0() {
        if (b0()) {
            try {
                this.f55835x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f55779E.f43552a).setPitch(this.f55779E.f43553b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                r.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            C5560A c5560a = new C5560A(this.f55835x.getPlaybackParams().getSpeed(), this.f55835x.getPlaybackParams().getPitch());
            this.f55779E = c5560a;
            this.f55815h.t(c5560a.f43552a);
        }
    }

    private void q0() {
        if (b0()) {
            this.f55835x.setVolume(this.f55791Q);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean a(t tVar) {
        if (p(tVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean b() {
        if (b0()) {
            if ((P.f127086a < 29 || !this.f55835x.isOffloadedPlayback() || !this.f55797W) && this.f55815h.h(W())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean c() {
        if (b0()) {
            if (!this.f55795U || b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void flush() throws IllegalStateException {
        k kVar;
        if (b0()) {
            m0();
            if (this.f55815h.i()) {
                this.f55835x.pause();
            }
            if (c0(this.f55835x)) {
                ((n) C13466a.e(this.f55823l)).b(this.f55835x);
            }
            AudioSink.a aVarA = this.f55833v.a();
            h hVar = this.f55832u;
            if (hVar != null) {
                this.f55833v = hVar;
                this.f55832u = null;
            }
            this.f55815h.q();
            if (P.f127086a >= 24 && (kVar = this.f55775A) != null) {
                kVar.c();
                this.f55775A = null;
            }
            l0(this.f55835x, this.f55831t, aVarA);
            this.f55835x = null;
        }
        this.f55825n.a();
        this.f55824m.a();
        this.f55818i0 = 0L;
        this.f55820j0 = 0L;
        Handler handler = this.f55822k0;
        if (handler != null) {
            ((Handler) C13466a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    public void h0(androidx.media3.exoplayer.audio.a aVar) {
        String name;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f55816h0;
        if (looper != looperMyLooper) {
            String name2 = BuildConfig.TRAVIS;
            if (looper == null) {
                name = BuildConfig.TRAVIS;
            } else {
                name = looper.getThread().getName();
            }
            if (looperMyLooper != null) {
                name2 = looperMyLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + name2 + ") is not the playback looper (" + name + ")");
        }
        androidx.media3.exoplayer.audio.a aVar2 = this.f55836y;
        if (aVar2 != null && !aVar.equals(aVar2)) {
            this.f55836y = aVar;
            AudioSink.b bVar = this.f55831t;
            if (bVar != null) {
                bVar.i();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int p(t tVar) {
        g0();
        if ("audio/raw".equals(tVar.f43949o)) {
            if (!P.C0(tVar.f43926G)) {
                r.i("DefaultAudioSink", "Invalid PCM encoding: " + tVar.f43926G);
                return 0;
            }
            int i10 = tVar.f43926G;
            if (i10 == 2 || (this.f55805c && i10 == 4)) {
                return 2;
            }
            return 1;
        }
        if (!this.f55836y.j(tVar, this.f55776B)) {
            return 0;
        }
        return 2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() throws IllegalStateException {
        flush();
        y0<AudioProcessor> it = this.f55811f.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        y0<AudioProcessor> it2 = this.f55813g.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        androidx.media3.common.audio.a aVar = this.f55834w;
        if (aVar != null) {
            aVar.j();
        }
        this.f55798X = false;
        this.f55812f0 = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long t(boolean z10) {
        if (b0() && !this.f55789O) {
            return N(M(Math.min(this.f55815h.c(), this.f55833v.d(W()))));
        }
        return Long.MIN_VALUE;
    }
}
