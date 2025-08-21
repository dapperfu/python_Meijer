package androidx.media3.exoplayer;

import a3.C5647d;
import android.content.Context;
import android.os.Looper;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.C6196i;
import androidx.media3.exoplayer.C6198j;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.C6225i;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.InterfaceC13606h;
import h3.C14448d;
import i3.C14638r0;
import i3.InterfaceC14599a;
import s3.AbstractC16998D;
import x3.C18073l;

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
        long f55762A;

        /* renamed from: B, reason: collision with root package name */
        long f55763B;

        /* renamed from: C, reason: collision with root package name */
        boolean f55764C;

        /* renamed from: D, reason: collision with root package name */
        boolean f55765D;

        /* renamed from: E, reason: collision with root package name */
        h3.J f55766E;

        /* renamed from: F, reason: collision with root package name */
        boolean f55767F;

        /* renamed from: G, reason: collision with root package name */
        boolean f55768G;

        /* renamed from: H, reason: collision with root package name */
        String f55769H;

        /* renamed from: I, reason: collision with root package name */
        boolean f55770I;

        /* renamed from: J, reason: collision with root package name */
        Q0 f55771J;

        /* renamed from: a, reason: collision with root package name */
        final Context f55772a;

        /* renamed from: b, reason: collision with root package name */
        InterfaceC13606h f55773b;

        /* renamed from: c, reason: collision with root package name */
        long f55774c;

        /* renamed from: d, reason: collision with root package name */
        De.w<h3.L> f55775d;

        /* renamed from: e, reason: collision with root package name */
        De.w<r.a> f55776e;

        /* renamed from: f, reason: collision with root package name */
        De.w<AbstractC16998D> f55777f;

        /* renamed from: g, reason: collision with root package name */
        De.w<InterfaceC6201k0> f55778g;

        /* renamed from: h, reason: collision with root package name */
        De.w<t3.d> f55779h;

        /* renamed from: i, reason: collision with root package name */
        De.g<InterfaceC13606h, InterfaceC14599a> f55780i;

        /* renamed from: j, reason: collision with root package name */
        Looper f55781j;

        /* renamed from: k, reason: collision with root package name */
        int f55782k;

        /* renamed from: l, reason: collision with root package name */
        PriorityTaskManager f55783l;

        /* renamed from: m, reason: collision with root package name */
        C5647d f55784m;

        /* renamed from: n, reason: collision with root package name */
        boolean f55785n;

        /* renamed from: o, reason: collision with root package name */
        int f55786o;

        /* renamed from: p, reason: collision with root package name */
        boolean f55787p;

        /* renamed from: q, reason: collision with root package name */
        boolean f55788q;

        /* renamed from: r, reason: collision with root package name */
        boolean f55789r;

        /* renamed from: s, reason: collision with root package name */
        int f55790s;

        /* renamed from: t, reason: collision with root package name */
        int f55791t;

        /* renamed from: u, reason: collision with root package name */
        boolean f55792u;

        /* renamed from: v, reason: collision with root package name */
        h3.M f55793v;

        /* renamed from: w, reason: collision with root package name */
        long f55794w;

        /* renamed from: x, reason: collision with root package name */
        long f55795x;

        /* renamed from: y, reason: collision with root package name */
        long f55796y;

        /* renamed from: z, reason: collision with root package name */
        h3.H f55797z;

        public b(final Context context) {
            this(context, new De.w() { // from class: h3.y
                @Override // De.w
                public final Object get() {
                    return ExoPlayer.b.a(context);
                }
            }, new De.w() { // from class: h3.z
                @Override // De.w
                public final Object get() {
                    return ExoPlayer.b.b(context);
                }
            });
        }

        public static /* synthetic */ r.a c(r.a aVar) {
            return aVar;
        }

        private b(final Context context, De.w<h3.L> wVar, De.w<r.a> wVar2) {
            this(context, wVar, wVar2, new De.w() { // from class: h3.A
                @Override // De.w
                public final Object get() {
                    return ExoPlayer.b.e(context);
                }
            }, new De.w() { // from class: h3.B
                @Override // De.w
                public final Object get() {
                    return new C6198j();
                }
            }, new De.w() { // from class: h3.C
                @Override // De.w
                public final Object get() {
                    return t3.h.l(context);
                }
            }, new De.g() { // from class: h3.D
                @Override // De.g
                public final Object apply(Object obj) {
                    return new C14638r0((InterfaceC13606h) obj);
                }
            });
        }

        public static /* synthetic */ h3.L a(Context context) {
            return new C14448d(context);
        }

        public static /* synthetic */ r.a b(Context context) {
            return new C6225i(context, new C18073l());
        }

        public static /* synthetic */ AbstractC16998D e(Context context) {
            return new s3.n(context);
        }

        public ExoPlayer f() {
            C13599a.g(!this.f55767F);
            this.f55767F = true;
            return new V(this, null);
        }

        public b g(final r.a aVar) {
            C13599a.g(!this.f55767F);
            C13599a.e(aVar);
            this.f55776e = new De.w() { // from class: h3.x
                @Override // De.w
                public final Object get() {
                    return ExoPlayer.b.c(aVar);
                }
            };
            return this;
        }

        private b(Context context, De.w<h3.L> wVar, De.w<r.a> wVar2, De.w<AbstractC16998D> wVar3, De.w<InterfaceC6201k0> wVar4, De.w<t3.d> wVar5, De.g<InterfaceC13606h, InterfaceC14599a> gVar) {
            this.f55772a = (Context) C13599a.e(context);
            this.f55775d = wVar;
            this.f55776e = wVar2;
            this.f55777f = wVar3;
            this.f55778g = wVar4;
            this.f55779h = wVar5;
            this.f55780i = gVar;
            this.f55781j = d3.P.T();
            this.f55784m = C5647d.f44629g;
            this.f55786o = 0;
            this.f55790s = 1;
            this.f55791t = 0;
            this.f55792u = true;
            this.f55793v = h3.M.f134674g;
            this.f55794w = 5000L;
            this.f55795x = 15000L;
            this.f55796y = 3000L;
            this.f55797z = new C6196i.b().a();
            this.f55773b = InterfaceC13606h.f127918a;
            this.f55762A = 500L;
            this.f55763B = 2000L;
            this.f55765D = true;
            this.f55769H = "";
            this.f55782k = -1000;
            this.f55771J = new C6202l();
        }
    }

    AbstractC16998D a();

    @Override // a3.B
    ExoPlaybackException e();

    void release();

    void setImageOutput(ImageOutput imageOutput);

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f55798b = new c(-9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f55799a;

        public c(long j10) {
            this.f55799a = j10;
        }
    }
}
