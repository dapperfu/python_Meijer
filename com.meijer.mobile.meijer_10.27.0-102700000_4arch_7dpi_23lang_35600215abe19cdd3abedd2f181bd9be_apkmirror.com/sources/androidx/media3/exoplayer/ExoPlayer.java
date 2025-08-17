package androidx.media3.exoplayer;

import a3.C5564d;
import android.content.Context;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.C6054i;
import androidx.media3.exoplayer.C6056j;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.C6083i;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.InterfaceC13473h;
import h3.C14335d;
import i3.C14635r0;
import i3.InterfaceC14596a;
import s3.AbstractC16852D;
import x3.C18007l;

/* loaded from: classes.dex */
public interface ExoPlayer extends a3.B {

    public interface a {
        default void C(boolean z10) {
        }

        default void F(boolean z10) {
        }
    }

    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        long f55538A;

        /* renamed from: B, reason: collision with root package name */
        long f55539B;

        /* renamed from: C, reason: collision with root package name */
        boolean f55540C;

        /* renamed from: D, reason: collision with root package name */
        boolean f55541D;

        /* renamed from: E, reason: collision with root package name */
        h3.J f55542E;

        /* renamed from: F, reason: collision with root package name */
        boolean f55543F;

        /* renamed from: G, reason: collision with root package name */
        boolean f55544G;

        /* renamed from: H, reason: collision with root package name */
        String f55545H;

        /* renamed from: I, reason: collision with root package name */
        boolean f55546I;

        /* renamed from: J, reason: collision with root package name */
        Q0 f55547J;

        /* renamed from: a, reason: collision with root package name */
        final Context f55548a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC13473h f55549b;

        /* renamed from: c, reason: collision with root package name */
        long f55550c;

        /* renamed from: d, reason: collision with root package name */
        Be.w<h3.L> f55551d;

        /* renamed from: e, reason: collision with root package name */
        Be.w<r.a> f55552e;

        /* renamed from: f, reason: collision with root package name */
        Be.w<AbstractC16852D> f55553f;

        /* renamed from: g, reason: collision with root package name */
        Be.w<InterfaceC6059k0> f55554g;

        /* renamed from: h, reason: collision with root package name */
        Be.w<t3.d> f55555h;

        /* renamed from: i, reason: collision with root package name */
        Be.g<InterfaceC13473h, InterfaceC14596a> f55556i;

        /* renamed from: j, reason: collision with root package name */
        Looper f55557j;

        /* renamed from: k, reason: collision with root package name */
        int f55558k;

        /* renamed from: l, reason: collision with root package name */
        PriorityTaskManager f55559l;

        /* renamed from: m, reason: collision with root package name */
        C5564d f55560m;

        /* renamed from: n, reason: collision with root package name */
        boolean f55561n;

        /* renamed from: o, reason: collision with root package name */
        int f55562o;

        /* renamed from: p, reason: collision with root package name */
        boolean f55563p;

        /* renamed from: q, reason: collision with root package name */
        boolean f55564q;

        /* renamed from: r, reason: collision with root package name */
        boolean f55565r;

        /* renamed from: s, reason: collision with root package name */
        int f55566s;

        /* renamed from: t, reason: collision with root package name */
        int f55567t;

        /* renamed from: u, reason: collision with root package name */
        boolean f55568u;

        /* renamed from: v, reason: collision with root package name */
        h3.M f55569v;

        /* renamed from: w, reason: collision with root package name */
        long f55570w;

        /* renamed from: x, reason: collision with root package name */
        long f55571x;

        /* renamed from: y, reason: collision with root package name */
        long f55572y;

        /* renamed from: z, reason: collision with root package name */
        h3.H f55573z;

        public b(final Context context) {
            this(context, new Be.w() { // from class: h3.y
                @Override // Be.w
                public final Object get() {
                    return ExoPlayer.b.a(context);
                }
            }, new Be.w() { // from class: h3.z
                @Override // Be.w
                public final Object get() {
                    return ExoPlayer.b.b(context);
                }
            });
        }

        public static /* synthetic */ r.a c(r.a aVar) {
            return aVar;
        }

        private b(final Context context, Be.w<h3.L> wVar, Be.w<r.a> wVar2) {
            this(context, wVar, wVar2, new Be.w() { // from class: h3.A
                @Override // Be.w
                public final Object get() {
                    return ExoPlayer.b.e(context);
                }
            }, new Be.w() { // from class: h3.B
                @Override // Be.w
                public final Object get() {
                    return new C6056j();
                }
            }, new Be.w() { // from class: h3.C
                @Override // Be.w
                public final Object get() {
                    return t3.h.l(context);
                }
            }, new Be.g() { // from class: h3.D
                @Override // Be.g
                public final Object apply(Object obj) {
                    return new C14635r0((InterfaceC13473h) obj);
                }
            });
        }

        public static /* synthetic */ h3.L a(Context context) {
            return new C14335d(context);
        }

        public static /* synthetic */ r.a b(Context context) {
            return new C6083i(context, new C18007l());
        }

        public static /* synthetic */ AbstractC16852D e(Context context) {
            return new s3.n(context);
        }

        public ExoPlayer f() {
            C13466a.g(!this.f55543F);
            this.f55543F = true;
            return new V(this, null);
        }

        public b g(final r.a aVar) {
            C13466a.g(!this.f55543F);
            C13466a.e(aVar);
            this.f55552e = new Be.w() { // from class: h3.x
                @Override // Be.w
                public final Object get() {
                    return ExoPlayer.b.c(aVar);
                }
            };
            return this;
        }

        private b(Context context, Be.w<h3.L> wVar, Be.w<r.a> wVar2, Be.w<AbstractC16852D> wVar3, Be.w<InterfaceC6059k0> wVar4, Be.w<t3.d> wVar5, Be.g<InterfaceC13473h, InterfaceC14596a> gVar) {
            this.f55548a = (Context) C13466a.e(context);
            this.f55551d = wVar;
            this.f55552e = wVar2;
            this.f55553f = wVar3;
            this.f55554g = wVar4;
            this.f55555h = wVar5;
            this.f55556i = gVar;
            this.f55557j = d3.P.T();
            this.f55560m = C5564d.f43811g;
            this.f55562o = 0;
            this.f55566s = 1;
            this.f55567t = 0;
            this.f55568u = true;
            this.f55569v = h3.M.f134203g;
            this.f55570w = 5000L;
            this.f55571x = 15000L;
            this.f55572y = 3000L;
            this.f55573z = new C6054i.b().a();
            this.f55549b = InterfaceC13473h.f127116a;
            this.f55538A = 500L;
            this.f55539B = 2000L;
            this.f55541D = true;
            this.f55545H = "";
            this.f55558k = -1000;
            this.f55547J = new C6060l();
        }
    }

    AbstractC16852D a();

    @Override // a3.B
    ExoPlaybackException e();

    void release();

    void setImageOutput(ImageOutput imageOutput);

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f55574b = new c(-9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f55575a;

        public c(long j10) {
            this.f55575a = j10;
        }
    }
}
