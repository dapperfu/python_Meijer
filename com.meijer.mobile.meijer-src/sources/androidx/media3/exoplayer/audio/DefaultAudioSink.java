package androidx.media3.exoplayer.audio;

import Ee.L;
import Ee.y0;
import a3.C5643A;
import a3.C5647d;
import a3.C5650g;
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
import d3.C13599a;
import d3.InterfaceC13606h;
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
import x3.C18063b;
import x3.C18064c;
import x3.C18076o;
import x3.H;

/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {

    /* renamed from: l0, reason: collision with root package name */
    public static boolean f55995l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final Object f55996m0 = new Object();

    /* renamed from: n0, reason: collision with root package name */
    private static ScheduledExecutorService f55997n0;

    /* renamed from: o0, reason: collision with root package name */
    private static int f55998o0;

    /* renamed from: A, reason: collision with root package name */
    private k f55999A;

    /* renamed from: B, reason: collision with root package name */
    private C5647d f56000B;

    /* renamed from: C, reason: collision with root package name */
    private j f56001C;

    /* renamed from: D, reason: collision with root package name */
    private j f56002D;

    /* renamed from: E, reason: collision with root package name */
    private C5643A f56003E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f56004F;

    /* renamed from: G, reason: collision with root package name */
    private ByteBuffer f56005G;

    /* renamed from: H, reason: collision with root package name */
    private int f56006H;

    /* renamed from: I, reason: collision with root package name */
    private long f56007I;

    /* renamed from: J, reason: collision with root package name */
    private long f56008J;

    /* renamed from: K, reason: collision with root package name */
    private long f56009K;

    /* renamed from: L, reason: collision with root package name */
    private long f56010L;

    /* renamed from: M, reason: collision with root package name */
    private int f56011M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f56012N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f56013O;

    /* renamed from: P, reason: collision with root package name */
    private long f56014P;

    /* renamed from: Q, reason: collision with root package name */
    private float f56015Q;

    /* renamed from: R, reason: collision with root package name */
    private ByteBuffer f56016R;

    /* renamed from: S, reason: collision with root package name */
    private int f56017S;

    /* renamed from: T, reason: collision with root package name */
    private ByteBuffer f56018T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f56019U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f56020V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f56021W;

    /* renamed from: X, reason: collision with root package name */
    private boolean f56022X;

    /* renamed from: Y, reason: collision with root package name */
    private boolean f56023Y;

    /* renamed from: Z, reason: collision with root package name */
    private int f56024Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f56025a;

    /* renamed from: a0, reason: collision with root package name */
    private C5650g f56026a0;

    /* renamed from: b, reason: collision with root package name */
    private final b3.n f56027b;

    /* renamed from: b0, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.c f56028b0;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f56029c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f56030c0;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.h f56031d;

    /* renamed from: d0, reason: collision with root package name */
    private long f56032d0;

    /* renamed from: e, reason: collision with root package name */
    private final o f56033e;

    /* renamed from: e0, reason: collision with root package name */
    private long f56034e0;

    /* renamed from: f, reason: collision with root package name */
    private final L<AudioProcessor> f56035f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f56036f0;

    /* renamed from: g, reason: collision with root package name */
    private final L<AudioProcessor> f56037g;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f56038g0;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.media3.exoplayer.audio.g f56039h;

    /* renamed from: h0, reason: collision with root package name */
    private Looper f56040h0;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayDeque<j> f56041i;

    /* renamed from: i0, reason: collision with root package name */
    private long f56042i0;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f56043j;

    /* renamed from: j0, reason: collision with root package name */
    private long f56044j0;

    /* renamed from: k, reason: collision with root package name */
    private int f56045k;

    /* renamed from: k0, reason: collision with root package name */
    private Handler f56046k0;

    /* renamed from: l, reason: collision with root package name */
    private n f56047l;

    /* renamed from: m, reason: collision with root package name */
    private final l<AudioSink.InitializationException> f56048m;

    /* renamed from: n, reason: collision with root package name */
    private final l<AudioSink.WriteException> f56049n;

    /* renamed from: o, reason: collision with root package name */
    private final e f56050o;

    /* renamed from: p, reason: collision with root package name */
    private final d f56051p;

    /* renamed from: q, reason: collision with root package name */
    private final ExoPlayer.a f56052q;

    /* renamed from: r, reason: collision with root package name */
    private final f f56053r;

    /* renamed from: s, reason: collision with root package name */
    private E1 f56054s;

    /* renamed from: t, reason: collision with root package name */
    private AudioSink.b f56055t;

    /* renamed from: u, reason: collision with root package name */
    private h f56056u;

    /* renamed from: v, reason: collision with root package name */
    private h f56057v;

    /* renamed from: w, reason: collision with root package name */
    private androidx.media3.common.audio.a f56058w;

    /* renamed from: x, reason: collision with root package name */
    private AudioTrack f56059x;

    /* renamed from: y, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.a f56060y;

    /* renamed from: z, reason: collision with root package name */
    private androidx.media3.exoplayer.audio.b f56061z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class b {
        public static void a(AudioTrack audioTrack, androidx.media3.exoplayer.audio.c cVar) {
            audioTrack.setPreferredDevice(cVar == null ? null : cVar.f56129a);
        }
    }

    public interface d {
        androidx.media3.exoplayer.audio.d a(t tVar, C5647d c5647d);
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f56062a = new k.a().h();

        int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    public interface f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f56063a = new androidx.media3.exoplayer.audio.l();

        AudioTrack a(AudioSink.a aVar, C5647d c5647d, int i10);
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final Context f56064a;

        /* renamed from: c, reason: collision with root package name */
        private b3.n f56066c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56067d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f56068e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f56069f;

        /* renamed from: i, reason: collision with root package name */
        private d f56072i;

        /* renamed from: j, reason: collision with root package name */
        private ExoPlayer.a f56073j;

        /* renamed from: b, reason: collision with root package name */
        private androidx.media3.exoplayer.audio.a f56065b = androidx.media3.exoplayer.audio.a.f56105c;

        /* renamed from: g, reason: collision with root package name */
        private e f56070g = e.f56062a;

        /* renamed from: h, reason: collision with root package name */
        private f f56071h = f.f56063a;

        public DefaultAudioSink j() {
            C13599a.g(!this.f56069f);
            this.f56069f = true;
            if (this.f56066c == null) {
                this.f56066c = new i(new AudioProcessor[0]);
            }
            if (this.f56072i == null) {
                this.f56072i = new androidx.media3.exoplayer.audio.i(this.f56064a);
            }
            return new DefaultAudioSink(this);
        }

        public g k(boolean z10) {
            this.f56068e = z10;
            return this;
        }

        public g l(boolean z10) {
            this.f56067d = z10;
            return this;
        }

        public g(Context context) {
            this.f56064a = context;
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final t f56074a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56075b;

        /* renamed from: c, reason: collision with root package name */
        public final int f56076c;

        /* renamed from: d, reason: collision with root package name */
        public final int f56077d;

        /* renamed from: e, reason: collision with root package name */
        public final int f56078e;

        /* renamed from: f, reason: collision with root package name */
        public final int f56079f;

        /* renamed from: g, reason: collision with root package name */
        public final int f56080g;

        /* renamed from: h, reason: collision with root package name */
        public final int f56081h;

        /* renamed from: i, reason: collision with root package name */
        public final androidx.media3.common.audio.a f56082i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f56083j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f56084k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f56085l;

        public AudioSink.a a() {
            return new AudioSink.a(this.f56080g, this.f56078e, this.f56079f, this.f56085l, this.f56076c == 1, this.f56081h);
        }

        public boolean b(h hVar) {
            return hVar.f56076c == this.f56076c && hVar.f56080g == this.f56080g && hVar.f56078e == this.f56078e && hVar.f56079f == this.f56079f && hVar.f56077d == this.f56077d && hVar.f56083j == this.f56083j && hVar.f56084k == this.f56084k;
        }

        public h c(int i10) {
            return new h(this.f56074a, this.f56075b, this.f56076c, this.f56077d, this.f56078e, this.f56079f, this.f56080g, i10, this.f56082i, this.f56083j, this.f56084k, this.f56085l);
        }

        public long d(long j10) {
            return P.U0(j10, this.f56078e);
        }

        public long e(long j10) {
            return P.U0(j10, this.f56074a.f44743F);
        }

        public boolean f() {
            return this.f56076c == 1;
        }

        public h(t tVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, androidx.media3.common.audio.a aVar, boolean z10, boolean z11, boolean z12) {
            this.f56074a = tVar;
            this.f56075b = i10;
            this.f56076c = i11;
            this.f56077d = i12;
            this.f56078e = i13;
            this.f56079f = i14;
            this.f56080g = i15;
            this.f56081h = i16;
            this.f56082i = aVar;
            this.f56083j = z10;
            this.f56084k = z11;
            this.f56085l = z12;
        }
    }

    public static class i implements b3.n {

        /* renamed from: a, reason: collision with root package name */
        private final AudioProcessor[] f56086a;

        /* renamed from: b, reason: collision with root package name */
        private final J f56087b;

        /* renamed from: c, reason: collision with root package name */
        private final androidx.media3.common.audio.d f56088c;

        public i(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new J(), new androidx.media3.common.audio.d());
        }

        public i(AudioProcessor[] audioProcessorArr, J j10, androidx.media3.common.audio.d dVar) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f56086a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f56087b = j10;
            this.f56088c = dVar;
            audioProcessorArr2[audioProcessorArr.length] = j10;
            audioProcessorArr2[audioProcessorArr.length + 1] = dVar;
        }

        @Override // b3.n
        public long a(long j10) {
            return this.f56088c.a() ? this.f56088c.h(j10) : j10;
        }

        @Override // b3.n
        public AudioProcessor[] b() {
            return this.f56086a;
        }

        @Override // b3.n
        public C5643A c(C5643A c5643a) {
            this.f56088c.j(c5643a.f44370a);
            this.f56088c.i(c5643a.f44371b);
            return c5643a;
        }

        @Override // b3.n
        public long d() {
            return this.f56087b.u();
        }

        @Override // b3.n
        public boolean e(boolean z10) {
            this.f56087b.D(z10);
            return z10;
        }
    }

    private static final class j {

        /* renamed from: a, reason: collision with root package name */
        public final C5643A f56089a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56090b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56091c;

        /* renamed from: d, reason: collision with root package name */
        public long f56092d;

        private j(C5643A c5643a, long j10, long j11) {
            this.f56089a = c5643a;
            this.f56090b = j10;
            this.f56091c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f56093a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.audio.b f56094b;

        /* renamed from: c, reason: collision with root package name */
        private AudioRouting.OnRoutingChangedListener f56095c = new AudioRouting.OnRoutingChangedListener() { // from class: androidx.media3.exoplayer.audio.j
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                this.f56192a.b(audioRouting);
            }
        };

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AudioRouting audioRouting) {
            AudioDeviceInfo routedDevice;
            if (this.f56095c == null || (routedDevice = audioRouting.getRoutedDevice()) == null) {
                return;
            }
            this.f56094b.i(routedDevice);
        }

        public void c() {
            this.f56093a.removeOnRoutingChangedListener((AudioRouting.OnRoutingChangedListener) C13599a.e(this.f56095c));
            this.f56095c = null;
        }

        public k(AudioTrack audioTrack, androidx.media3.exoplayer.audio.b bVar) {
            this.f56093a = audioTrack;
            this.f56094b = bVar;
            audioTrack.addOnRoutingChangedListener(this.f56095c, new Handler(Looper.myLooper()));
        }
    }

    private static final class l<T extends Exception> {

        /* renamed from: a, reason: collision with root package name */
        private T f56096a;

        /* renamed from: b, reason: collision with root package name */
        private long f56097b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        private long f56098c = -9223372036854775807L;

        public void a() {
            this.f56096a = null;
            this.f56097b = -9223372036854775807L;
            this.f56098c = -9223372036854775807L;
        }

        public boolean b() {
            if (this.f56096a == null) {
                return false;
            }
            return DefaultAudioSink.Y() || SystemClock.elapsedRealtime() < this.f56098c;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: T extends java.lang.Exception */
        public void c(T t10) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f56096a == null) {
                this.f56096a = t10;
            }
            if (this.f56097b == -9223372036854775807L && !DefaultAudioSink.Y()) {
                this.f56097b = 200 + jElapsedRealtime;
            }
            long j10 = this.f56097b;
            if (j10 != -9223372036854775807L && jElapsedRealtime >= j10) {
                T t11 = this.f56096a;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f56096a;
                a();
                throw t12;
            }
            this.f56098c = jElapsedRealtime + 50;
        }
    }

    private final class m implements g.a {
        private m() {
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void a(int i10, long j10) {
            if (DefaultAudioSink.this.f56055t != null) {
                DefaultAudioSink.this.f56055t.h(i10, j10, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f56034e0);
            }
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void b(long j10) {
            r.i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void c(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if (DefaultAudioSink.f55995l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            r.i("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + DefaultAudioSink.this.V() + ", " + DefaultAudioSink.this.W();
            if (DefaultAudioSink.f55995l0) {
                throw new InvalidAudioTrackTimestampException(str);
            }
            r.i("DefaultAudioSink", str);
        }

        @Override // androidx.media3.exoplayer.audio.g.a
        public void e(long j10) {
            if (DefaultAudioSink.this.f56055t != null) {
                DefaultAudioSink.this.f56055t.e(j10);
            }
        }
    }

    private final class n {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f56100a = new Handler(Looper.myLooper());

        /* renamed from: b, reason: collision with root package name */
        private final AudioTrack$StreamEventCallback f56101b;

        class a extends AudioTrack$StreamEventCallback {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f56103a;

            a(DefaultAudioSink defaultAudioSink) {
                this.f56103a = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(DefaultAudioSink.this.f56059x) && DefaultAudioSink.this.f56055t != null && DefaultAudioSink.this.f56022X) {
                    DefaultAudioSink.this.f56055t.k();
                }
            }

            public void onPresentationEnded(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f56059x)) {
                    DefaultAudioSink.this.f56021W = true;
                }
            }

            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(DefaultAudioSink.this.f56059x) && DefaultAudioSink.this.f56055t != null && DefaultAudioSink.this.f56022X) {
                    DefaultAudioSink.this.f56055t.k();
                }
            }
        }

        public n() {
            this.f56101b = new a(DefaultAudioSink.this);
        }

        public void a(AudioTrack audioTrack) {
            Handler handler = this.f56100a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new F(handler), this.f56101b);
        }

        public void b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f56101b);
            this.f56100a.removeCallbacksAndMessages(null);
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
            synchronized (f55996m0) {
                try {
                    int i10 = f55998o0 - 1;
                    f55998o0 = i10;
                    if (i10 == 0) {
                        f55997n0.shutdown();
                        f55997n0 = null;
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
            synchronized (f55996m0) {
                try {
                    int i11 = f55998o0 - 1;
                    f55998o0 = i11;
                    if (i11 == 0) {
                        f55997n0.shutdown();
                        f55997n0 = null;
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
        this.f56022X = true;
        if (b0()) {
            this.f56039h.v();
            this.f56059x.play();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void pause() throws IllegalStateException {
        this.f56022X = false;
        if (b0()) {
            if (this.f56039h.p() || c0(this.f56059x)) {
                this.f56059x.pause();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void v() {
        this.f56012N = true;
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
        Context context = gVar.f56064a;
        this.f56025a = context;
        this.f56000B = C5647d.f44629g;
        this.f56060y = context != null ? null : gVar.f56065b;
        this.f56027b = gVar.f56066c;
        this.f56029c = gVar.f56067d;
        this.f56043j = P.f127888a >= 23 && gVar.f56068e;
        this.f56045k = 0;
        this.f56050o = gVar.f56070g;
        this.f56051p = (d) C13599a.e(gVar.f56072i);
        this.f56039h = new androidx.media3.exoplayer.audio.g(new m());
        androidx.media3.exoplayer.audio.h hVar = new androidx.media3.exoplayer.audio.h();
        this.f56031d = hVar;
        o oVar = new o();
        this.f56033e = oVar;
        this.f56035f = L.B(new androidx.media3.common.audio.e(), hVar, oVar);
        this.f56037g = L.B(new androidx.media3.exoplayer.audio.n(), hVar, oVar);
        this.f56015Q = 1.0f;
        this.f56024Z = 0;
        this.f56026a0 = new C5650g(0, 0.0f);
        C5643A c5643a = C5643A.f44367d;
        this.f56002D = new j(c5643a, 0L, 0L);
        this.f56003E = c5643a;
        this.f56004F = false;
        this.f56041i = new ArrayDeque<>();
        this.f56048m = new l<>();
        this.f56049n = new l<>();
        this.f56052q = gVar.f56073j;
        this.f56053r = gVar.f56071h;
    }

    private long M(long j10) {
        while (!this.f56041i.isEmpty() && j10 >= this.f56041i.getFirst().f56091c) {
            this.f56002D = this.f56041i.remove();
        }
        j jVar = this.f56002D;
        long j11 = j10 - jVar.f56091c;
        long jC0 = P.c0(j11, jVar.f56089a.f44370a);
        if (!this.f56041i.isEmpty()) {
            j jVar2 = this.f56002D;
            return jVar2.f56090b + jC0 + jVar2.f56092d;
        }
        long jA = this.f56027b.a(j11);
        j jVar3 = this.f56002D;
        long j12 = jVar3.f56090b + jA;
        jVar3.f56092d = jA - jC0;
        return j12;
    }

    private long N(long j10) {
        long jD = this.f56027b.d();
        long jD2 = j10 + this.f56057v.d(jD);
        long j11 = this.f56042i0;
        if (jD > j11) {
            long jD3 = this.f56057v.d(jD - j11);
            this.f56042i0 = jD;
            X(jD3);
        }
        return jD2;
    }

    private AudioTrack O(AudioSink.a aVar, C5647d c5647d, int i10, t tVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackA = this.f56053r.a(aVar, c5647d, i10);
            int state = audioTrackA.getState();
            if (state == 1) {
                return audioTrackA;
            }
            try {
                audioTrackA.release();
            } catch (Exception unused) {
            }
            throw new AudioSink.InitializationException(state, aVar.f55990b, aVar.f55991c, aVar.f55989a, tVar, aVar.f55993e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new AudioSink.InitializationException(0, aVar.f55990b, aVar.f55991c, aVar.f55989a, tVar, aVar.f55993e, e10);
        }
    }

    private AudioTrack Q() throws AudioSink.InitializationException {
        try {
            return P((h) C13599a.e(this.f56057v));
        } catch (AudioSink.InitializationException e10) {
            h hVar = this.f56057v;
            if (hVar.f56081h > 1000000) {
                h hVarC = hVar.c(1000000);
                try {
                    AudioTrack audioTrackP = P(hVarC);
                    this.f56057v = hVarC;
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
        if (this.f56018T == null || this.f56049n.b()) {
            return;
        }
        int iRemaining = this.f56018T.remaining();
        if (this.f56030c0) {
            C13599a.g(j10 != -9223372036854775807L);
            if (j10 == Long.MIN_VALUE) {
                j10 = this.f56032d0;
            } else {
                this.f56032d0 = j10;
            }
            defaultAudioSink = this;
            iV0 = defaultAudioSink.w0(this.f56059x, this.f56018T, iRemaining, j10);
        } else {
            defaultAudioSink = this;
            iV0 = v0(defaultAudioSink.f56059x, defaultAudioSink.f56018T, iRemaining);
        }
        defaultAudioSink.f56034e0 = SystemClock.elapsedRealtime();
        if (iV0 < 0) {
            if (a0(iV0)) {
                if (W() > 0) {
                    z = true;
                } else if (c0(defaultAudioSink.f56059x)) {
                    d0();
                    z = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(iV0, defaultAudioSink.f56057v.f56074a, z);
            AudioSink.b bVar2 = defaultAudioSink.f56055t;
            if (bVar2 != null) {
                bVar2.d(writeException);
            }
            if (!writeException.f55987b || defaultAudioSink.f56025a == null) {
                defaultAudioSink.f56049n.c(writeException);
                return;
            } else {
                defaultAudioSink.f56060y = androidx.media3.exoplayer.audio.a.f56105c;
                throw writeException;
            }
        }
        defaultAudioSink.f56049n.a();
        if (c0(defaultAudioSink.f56059x)) {
            if (defaultAudioSink.f56010L > 0) {
                defaultAudioSink.f56038g0 = false;
            }
            if (defaultAudioSink.f56022X && (bVar = defaultAudioSink.f56055t) != null && iV0 < iRemaining && !defaultAudioSink.f56038g0) {
                bVar.g();
            }
        }
        int i10 = defaultAudioSink.f56057v.f56076c;
        if (i10 == 0) {
            defaultAudioSink.f56009K += iV0;
        }
        if (iV0 == iRemaining) {
            if (i10 != 0) {
                C13599a.g(defaultAudioSink.f56018T == defaultAudioSink.f56016R);
                defaultAudioSink.f56010L += defaultAudioSink.f56011M * defaultAudioSink.f56017S;
            }
            defaultAudioSink.f56018T = null;
        }
    }

    private boolean S() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f56058w.f()) {
            R(Long.MIN_VALUE);
            return this.f56018T == null;
        }
        this.f56058w.h();
        j0(Long.MIN_VALUE);
        return this.f56058w.e() && ((byteBuffer = this.f56018T) == null || !byteBuffer.hasRemaining());
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
                            int iB = C18063b.b(byteBuffer);
                            if (iB == -1) {
                                return 0;
                            }
                            return C18063b.i(byteBuffer, iB) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            return C18064c.e(byteBuffer);
                        case 18:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i10);
                    }
            }
            return C18063b.e(byteBuffer);
        }
        return C18076o.f(byteBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long V() {
        return this.f56057v.f56076c == 0 ? this.f56007I / r0.f56075b : this.f56008J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long W() {
        return this.f56057v.f56076c == 0 ? P.k(this.f56009K, r0.f56077d) : this.f56010L;
    }

    private void X(long j10) {
        this.f56044j0 += j10;
        if (this.f56046k0 == null) {
            this.f56046k0 = new Handler(Looper.myLooper());
        }
        this.f56046k0.removeCallbacksAndMessages(null);
        this.f56046k0.postDelayed(new Runnable() { // from class: j3.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f139775a.f0();
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Y() {
        boolean z10;
        synchronized (f55996m0) {
            z10 = f55998o0 > 0;
        }
        return z10;
    }

    private boolean Z() throws AudioSink.InitializationException {
        androidx.media3.exoplayer.audio.b bVar;
        E1 e12;
        if (this.f56048m.b()) {
            return false;
        }
        AudioTrack audioTrackQ = Q();
        this.f56059x = audioTrackQ;
        if (c0(audioTrackQ)) {
            k0(this.f56059x);
            h hVar = this.f56057v;
            if (hVar.f56084k) {
                AudioTrack audioTrack = this.f56059x;
                t tVar = hVar.f56074a;
                audioTrack.setOffloadDelayPadding(tVar.f44745H, tVar.f44746I);
            }
        }
        int i10 = P.f127888a;
        if (i10 >= 31 && (e12 = this.f56054s) != null) {
            c.a(this.f56059x, e12);
        }
        this.f56024Z = this.f56059x.getAudioSessionId();
        androidx.media3.exoplayer.audio.g gVar = this.f56039h;
        AudioTrack audioTrack2 = this.f56059x;
        h hVar2 = this.f56057v;
        gVar.s(audioTrack2, hVar2.f56076c == 2, hVar2.f56080g, hVar2.f56077d, hVar2.f56081h);
        q0();
        int i11 = this.f56026a0.f44647a;
        if (i11 != 0) {
            this.f56059x.attachAuxEffect(i11);
            this.f56059x.setAuxEffectSendLevel(this.f56026a0.f44648b);
        }
        androidx.media3.exoplayer.audio.c cVar = this.f56028b0;
        if (cVar != null && i10 >= 23) {
            b.a(this.f56059x, cVar);
            androidx.media3.exoplayer.audio.b bVar2 = this.f56061z;
            if (bVar2 != null) {
                bVar2.i(this.f56028b0.f56129a);
            }
        }
        if (i10 >= 24 && (bVar = this.f56061z) != null) {
            this.f55999A = new k(this.f56059x, bVar);
        }
        this.f56013O = true;
        AudioSink.b bVar3 = this.f56055t;
        if (bVar3 != null) {
            bVar3.a(this.f56057v.a());
        }
        return true;
    }

    private static boolean a0(int i10) {
        return (P.f127888a >= 24 && i10 == -6) || i10 == -32;
    }

    private boolean b0() {
        return this.f56059x != null;
    }

    private static boolean c0(AudioTrack audioTrack) {
        return P.f127888a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void d0() {
        if (this.f56057v.f()) {
            this.f56036f0 = true;
        }
    }

    private ByteBuffer e0(ByteBuffer byteBuffer) {
        if (this.f56057v.f56076c == 0) {
            int iE = (int) P.E(P.M0(20L), this.f56057v.f56078e);
            long jW = W();
            if (jW < iE) {
                h hVar = this.f56057v;
                return I.a(byteBuffer, hVar.f56080g, hVar.f56077d, (int) jW, iE);
            }
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        if (this.f56044j0 >= 300000) {
            this.f56055t.f();
            this.f56044j0 = 0L;
        }
    }

    private void g0() {
        if (this.f56061z == null && this.f56025a != null) {
            this.f56040h0 = Looper.myLooper();
            androidx.media3.exoplayer.audio.b bVar = new androidx.media3.exoplayer.audio.b(this.f56025a, new b.f() { // from class: j3.z
                @Override // androidx.media3.exoplayer.audio.b.f
                public final void a(androidx.media3.exoplayer.audio.a aVar) {
                    this.f139831a.h0(aVar);
                }
            }, this.f56000B, this.f56028b0);
            this.f56061z = bVar;
            this.f56060y = bVar.g();
        }
        C13599a.e(this.f56060y);
    }

    private void i0() throws IllegalStateException {
        if (this.f56020V) {
            return;
        }
        this.f56020V = true;
        this.f56039h.g(W());
        if (c0(this.f56059x)) {
            this.f56021W = false;
        }
        this.f56059x.stop();
        this.f56006H = 0;
    }

    private void k0(AudioTrack audioTrack) {
        if (this.f56047l == null) {
            this.f56047l = new n();
        }
        this.f56047l.a(audioTrack);
    }

    private static void l0(final AudioTrack audioTrack, final AudioSink.b bVar, final AudioSink.a aVar) {
        final Handler handler = new Handler(Looper.myLooper());
        synchronized (f55996m0) {
            try {
                if (f55997n0 == null) {
                    f55997n0 = P.O0("ExoPlayer:AudioTrackReleaseThread");
                }
                f55998o0++;
                f55997n0.schedule(new Runnable() { // from class: j3.y
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
        this.f56007I = 0L;
        this.f56008J = 0L;
        this.f56009K = 0L;
        this.f56010L = 0L;
        this.f56038g0 = false;
        this.f56011M = 0;
        this.f56002D = new j(this.f56003E, 0L, 0L);
        this.f56014P = 0L;
        this.f56001C = null;
        this.f56041i.clear();
        this.f56016R = null;
        this.f56017S = 0;
        this.f56018T = null;
        this.f56020V = false;
        this.f56019U = false;
        this.f56021W = false;
        this.f56005G = null;
        this.f56006H = 0;
        this.f56033e.n();
        r0();
    }

    private void n0(C5643A c5643a) {
        j jVar = new j(c5643a, -9223372036854775807L, -9223372036854775807L);
        if (b0()) {
            this.f56001C = jVar;
        } else {
            this.f56002D = jVar;
        }
    }

    private void p0(ByteBuffer byteBuffer) {
        C13599a.g(this.f56018T == null);
        if (byteBuffer.hasRemaining()) {
            this.f56018T = e0(byteBuffer);
        }
    }

    private void r0() {
        androidx.media3.common.audio.a aVar = this.f56057v.f56082i;
        this.f56058w = aVar;
        aVar.b();
    }

    private boolean s0() {
        if (this.f56030c0) {
            return false;
        }
        h hVar = this.f56057v;
        return hVar.f56076c == 0 && !t0(hVar.f56074a.f44744G);
    }

    private boolean t0(int i10) {
        return this.f56029c && P.B0(i10);
    }

    private boolean u0() {
        h hVar = this.f56057v;
        return hVar != null && hVar.f56083j && P.f127888a >= 23;
    }

    private int w0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (P.f127888a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f56005G == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.f56005G = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.f56005G.putInt(1431633921);
        }
        if (this.f56006H == 0) {
            this.f56005G.putInt(4, i10);
            this.f56005G.putLong(8, j10 * 1000);
            this.f56005G.position(0);
            this.f56006H = i10;
        }
        int iRemaining = this.f56005G.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.f56005G, iRemaining, 1);
            if (iWrite < 0) {
                this.f56006H = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iV0 = v0(audioTrack, byteBuffer, i10);
        if (iV0 < 0) {
            this.f56006H = 0;
            return iV0;
        }
        this.f56006H -= iV0;
        return iV0;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void d(C5643A c5643a) {
        this.f56003E = new C5643A(P.n(c5643a.f44370a, 0.1f, 8.0f), P.n(c5643a.f44371b, 0.1f, 8.0f));
        if (u0()) {
            o0();
        } else {
            n0(c5643a);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void e(int i10) throws IllegalStateException {
        if (this.f56024Z != i10) {
            this.f56024Z = i10;
            this.f56023Y = i10 != 0;
            flush();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public C5643A f() {
        return this.f56003E;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void g(AudioSink.b bVar) {
        this.f56055t = bVar;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void h(float f10) {
        if (this.f56015Q != f10) {
            this.f56015Q = f10;
            q0();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void j(int i10) {
        C13599a.g(P.f127888a >= 29);
        this.f56045k = i10;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void k() throws IllegalStateException {
        if (this.f56030c0) {
            this.f56030c0 = false;
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
        if ("audio/raw".equals(tVar.f44767o)) {
            C13599a.a(P.C0(tVar.f44744G));
            int iG0 = P.g0(tVar.f44744G, tVar.f44742E);
            L.a aVar2 = new L.a();
            if (t0(tVar.f44744G)) {
                aVar2.j(this.f56037g);
            } else {
                aVar2.j(this.f56035f);
                aVar2.i(this.f56027b.b());
            }
            androidx.media3.common.audio.a aVar3 = new androidx.media3.common.audio.a(aVar2.k());
            if (aVar3.equals(this.f56058w)) {
                aVar3 = this.f56058w;
            }
            this.f56033e.o(tVar.f44745H, tVar.f44746I);
            this.f56031d.m(iArr);
            try {
                AudioProcessor.a aVarA = aVar3.a(new AudioProcessor.a(tVar));
                int i18 = aVarA.f55570c;
                i11 = aVarA.f55568a;
                int iL = P.L(aVarA.f55569b);
                int iG02 = P.g0(i18, aVarA.f55569b);
                i12 = 0;
                i14 = i18;
                i15 = iL;
                z11 = this.f56043j;
                aVar = aVar3;
                i16 = iG02;
                i13 = iG0;
                z10 = false;
            } catch (AudioProcessor.UnhandledAudioFormatException e10) {
                throw new AudioSink.ConfigurationException(e10, tVar);
            }
        } else {
            androidx.media3.common.audio.a aVar4 = new androidx.media3.common.audio.a(L.x());
            i11 = tVar.f44743F;
            androidx.media3.exoplayer.audio.d dVarY = this.f56045k != 0 ? y(tVar) : androidx.media3.exoplayer.audio.d.f56130d;
            if (this.f56045k == 0 || !dVarY.f56131a) {
                Pair<Integer, Integer> pairH = this.f56060y.h(tVar, this.f56000B);
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
                z11 = this.f56043j;
                aVar = aVar4;
            } else {
                int iF = z.f((String) C13599a.e(tVar.f44767o), tVar.f44763k);
                int iL2 = P.L(tVar.f44742E);
                z10 = dVarY.f56132b;
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
        int i19 = tVar.f44762j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(tVar.f44767o) && i19 == -1) {
            i19 = 768000;
        }
        int i20 = i19;
        if (i10 != 0) {
            iA = i10;
            i17 = i11;
        } else {
            i17 = i11;
            iA = this.f56050o.a(T(i11, i15, i14), i14, i12, i16 != -1 ? i16 : 1, i17, i20, z11 ? 8.0d : 1.0d);
        }
        this.f56036f0 = false;
        int i21 = i12;
        h hVar = new h(tVar, i13, i21, i16, i17, i15, i14, iA, aVar, z11, z10, this.f56030c0);
        if (b0()) {
            this.f56056u = hVar;
        } else {
            this.f56057v = hVar;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void m(E1 e12) {
        this.f56054s = e12;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void n(InterfaceC13606h interfaceC13606h) {
        this.f56039h.u(interfaceC13606h);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean o(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        ByteBuffer byteBuffer2 = this.f56016R;
        C13599a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f56056u != null) {
            if (!S()) {
                return false;
            }
            if (this.f56056u.b(this.f56057v)) {
                this.f56057v = this.f56056u;
                this.f56056u = null;
                AudioTrack audioTrack = this.f56059x;
                if (audioTrack != null && c0(audioTrack) && this.f56057v.f56084k) {
                    if (this.f56059x.getPlayState() == 3) {
                        this.f56059x.setOffloadEndOfStream();
                        this.f56039h.a();
                    }
                    AudioTrack audioTrack2 = this.f56059x;
                    t tVar = this.f56057v.f56074a;
                    audioTrack2.setOffloadDelayPadding(tVar.f44745H, tVar.f44746I);
                    this.f56038g0 = true;
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
                if (e10.f55982b) {
                    throw e10;
                }
                this.f56048m.c(e10);
                return false;
            }
        }
        this.f56048m.a();
        if (this.f56013O) {
            this.f56014P = Math.max(0L, j10);
            this.f56012N = false;
            this.f56013O = false;
            if (u0()) {
                o0();
            }
            L(j10);
            if (this.f56022X) {
                i();
            }
        }
        if (!this.f56039h.k(W())) {
            return false;
        }
        if (this.f56016R == null) {
            C13599a.a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            h hVar = this.f56057v;
            if (hVar.f56076c != 0 && this.f56011M == 0) {
                int iU = U(hVar.f56080g, byteBuffer);
                this.f56011M = iU;
                if (iU == 0) {
                    return true;
                }
            }
            if (this.f56001C != null) {
                if (!S()) {
                    return false;
                }
                L(j10);
                this.f56001C = null;
            }
            long jE = this.f56014P + this.f56057v.e(V() - this.f56033e.m());
            if (!this.f56012N && Math.abs(jE - j10) > 200000) {
                AudioSink.b bVar = this.f56055t;
                if (bVar != null) {
                    bVar.d(new AudioSink.UnexpectedDiscontinuityException(j10, jE));
                }
                this.f56012N = true;
            }
            if (this.f56012N) {
                if (!S()) {
                    return false;
                }
                long j11 = j10 - jE;
                this.f56014P += j11;
                this.f56012N = false;
                L(j10);
                AudioSink.b bVar2 = this.f56055t;
                if (bVar2 != null && j11 != 0) {
                    bVar2.j();
                }
            }
            if (this.f56057v.f56076c == 0) {
                this.f56007I += byteBuffer.remaining();
            } else {
                this.f56008J += this.f56011M * i10;
            }
            this.f56016R = byteBuffer;
            this.f56017S = i10;
        }
        j0(j10);
        if (!this.f56016R.hasRemaining()) {
            this.f56016R = null;
            this.f56017S = 0;
            return true;
        }
        if (!this.f56039h.j(W())) {
            return false;
        }
        r.i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void q() throws IllegalStateException, AudioSink.WriteException {
        if (!this.f56019U && b0() && S()) {
            i0();
            this.f56019U = true;
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void r(int i10, int i11) {
        h hVar;
        AudioTrack audioTrack = this.f56059x;
        if (audioTrack == null || !c0(audioTrack) || (hVar = this.f56057v) == null || !hVar.f56084k) {
            return;
        }
        this.f56059x.setOffloadDelayPadding(i10, i11);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void release() {
        androidx.media3.exoplayer.audio.b bVar = this.f56061z;
        if (bVar != null) {
            bVar.j();
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void s(C5647d c5647d) throws IllegalStateException {
        if (this.f56000B.equals(c5647d)) {
            return;
        }
        this.f56000B = c5647d;
        if (this.f56030c0) {
            return;
        }
        androidx.media3.exoplayer.audio.b bVar = this.f56061z;
        if (bVar != null) {
            bVar.h(c5647d);
        }
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f56028b0 = audioDeviceInfo == null ? null : new androidx.media3.exoplayer.audio.c(audioDeviceInfo);
        androidx.media3.exoplayer.audio.b bVar = this.f56061z;
        if (bVar != null) {
            bVar.i(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f56059x;
        if (audioTrack != null) {
            b.a(audioTrack, this.f56028b0);
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void w(C5650g c5650g) {
        if (this.f56026a0.equals(c5650g)) {
            return;
        }
        int i10 = c5650g.f44647a;
        float f10 = c5650g.f44648b;
        AudioTrack audioTrack = this.f56059x;
        if (audioTrack != null) {
            if (this.f56026a0.f44647a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f56059x.setAuxEffectSendLevel(f10);
            }
        }
        this.f56026a0 = c5650g;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void x() throws IllegalStateException {
        C13599a.g(this.f56023Y);
        if (this.f56030c0) {
            return;
        }
        this.f56030c0 = true;
        flush();
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public androidx.media3.exoplayer.audio.d y(t tVar) {
        return this.f56036f0 ? androidx.media3.exoplayer.audio.d.f56130d : this.f56051p.a(tVar, this.f56000B);
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void z(boolean z10) {
        this.f56004F = z10;
        n0(u0() ? C5643A.f44367d : this.f56003E);
    }

    private void L(long j10) {
        C5643A c5643aC;
        boolean zE;
        if (!u0()) {
            if (s0()) {
                c5643aC = this.f56027b.c(this.f56003E);
            } else {
                c5643aC = C5643A.f44367d;
            }
            this.f56003E = c5643aC;
        } else {
            c5643aC = C5643A.f44367d;
        }
        C5643A c5643a = c5643aC;
        if (s0()) {
            zE = this.f56027b.e(this.f56004F);
        } else {
            zE = false;
        }
        this.f56004F = zE;
        this.f56041i.add(new j(c5643a, Math.max(0L, j10), this.f56057v.d(W())));
        r0();
        AudioSink.b bVar = this.f56055t;
        if (bVar != null) {
            bVar.c(this.f56004F);
        }
    }

    private AudioTrack P(h hVar) throws AudioSink.InitializationException {
        try {
            AudioTrack audioTrackO = O(hVar.a(), this.f56000B, this.f56024Z, hVar.f56074a);
            ExoPlayer.a aVar = this.f56052q;
            if (aVar != null) {
                aVar.C(c0(audioTrackO));
                return audioTrackO;
            }
            return audioTrackO;
        } catch (AudioSink.InitializationException e10) {
            AudioSink.b bVar = this.f56055t;
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
        C13599a.g(z10);
        return minBufferSize;
    }

    private void j0(long j10) throws Exception {
        R(j10);
        if (this.f56018T == null) {
            if (!this.f56058w.f()) {
                ByteBuffer byteBuffer = this.f56016R;
                if (byteBuffer != null) {
                    p0(byteBuffer);
                    R(j10);
                    return;
                }
                return;
            }
            while (!this.f56058w.e()) {
                do {
                    ByteBuffer byteBufferD = this.f56058w.d();
                    if (byteBufferD.hasRemaining()) {
                        p0(byteBufferD);
                        R(j10);
                    } else {
                        ByteBuffer byteBuffer2 = this.f56016R;
                        if (byteBuffer2 != null && byteBuffer2.hasRemaining()) {
                            this.f56058w.i(this.f56016R);
                        } else {
                            return;
                        }
                    }
                } while (this.f56018T == null);
                return;
            }
        }
    }

    private void o0() {
        if (b0()) {
            try {
                this.f56059x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f56003E.f44370a).setPitch(this.f56003E.f44371b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                r.j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            C5643A c5643a = new C5643A(this.f56059x.getPlaybackParams().getSpeed(), this.f56059x.getPlaybackParams().getPitch());
            this.f56003E = c5643a;
            this.f56039h.t(c5643a.f44370a);
        }
    }

    private void q0() {
        if (b0()) {
            this.f56059x.setVolume(this.f56015Q);
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
            if ((P.f127888a < 29 || !this.f56059x.isOffloadedPlayback() || !this.f56021W) && this.f56039h.h(W())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public boolean c() {
        if (b0()) {
            if (!this.f56019U || b()) {
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
            if (this.f56039h.i()) {
                this.f56059x.pause();
            }
            if (c0(this.f56059x)) {
                ((n) C13599a.e(this.f56047l)).b(this.f56059x);
            }
            AudioSink.a aVarA = this.f56057v.a();
            h hVar = this.f56056u;
            if (hVar != null) {
                this.f56057v = hVar;
                this.f56056u = null;
            }
            this.f56039h.q();
            if (P.f127888a >= 24 && (kVar = this.f55999A) != null) {
                kVar.c();
                this.f55999A = null;
            }
            l0(this.f56059x, this.f56055t, aVarA);
            this.f56059x = null;
        }
        this.f56049n.a();
        this.f56048m.a();
        this.f56042i0 = 0L;
        this.f56044j0 = 0L;
        Handler handler = this.f56046k0;
        if (handler != null) {
            ((Handler) C13599a.e(handler)).removeCallbacksAndMessages(null);
        }
    }

    public void h0(androidx.media3.exoplayer.audio.a aVar) {
        String name;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f56040h0;
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
        androidx.media3.exoplayer.audio.a aVar2 = this.f56060y;
        if (aVar2 != null && !aVar.equals(aVar2)) {
            this.f56060y = aVar;
            AudioSink.b bVar = this.f56055t;
            if (bVar != null) {
                bVar.i();
            }
        }
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public int p(t tVar) {
        g0();
        if ("audio/raw".equals(tVar.f44767o)) {
            if (!P.C0(tVar.f44744G)) {
                r.i("DefaultAudioSink", "Invalid PCM encoding: " + tVar.f44744G);
                return 0;
            }
            int i10 = tVar.f44744G;
            if (i10 == 2 || (this.f56029c && i10 == 4)) {
                return 2;
            }
            return 1;
        }
        if (!this.f56060y.j(tVar, this.f56000B)) {
            return 0;
        }
        return 2;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public void reset() throws IllegalStateException {
        flush();
        y0<AudioProcessor> it = this.f56035f.iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
        y0<AudioProcessor> it2 = this.f56037g.iterator();
        while (it2.hasNext()) {
            it2.next().reset();
        }
        androidx.media3.common.audio.a aVar = this.f56058w;
        if (aVar != null) {
            aVar.j();
        }
        this.f56022X = false;
        this.f56036f0 = false;
    }

    @Override // androidx.media3.exoplayer.audio.AudioSink
    public long t(boolean z10) {
        if (b0() && !this.f56013O) {
            return N(M(Math.min(this.f56039h.c(), this.f56057v.d(W()))));
        }
        return Long.MIN_VALUE;
    }
}
