package a3;

import a3.r;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import c3.C6350a;
import c3.C6351b;
import d3.P;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public interface B {

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f43555b = new a().e();

        /* renamed from: c, reason: collision with root package name */
        private static final String f43556c = P.y0(0);

        /* renamed from: a, reason: collision with root package name */
        private final r f43557a;

        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            private static final int[] f43558b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a, reason: collision with root package name */
            private final r.b f43559a = new r.b();

            public a a(int i10) {
                this.f43559a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f43559a.b(bVar.f43557a);
                return this;
            }

            public a c(int... iArr) {
                this.f43559a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f43559a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f43559a.e());
            }
        }

        private b(r rVar) {
            this.f43557a = rVar;
        }

        public boolean b(int i10) {
            return this.f43557a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f43557a.equals(((b) obj).f43557a);
            }
            return false;
        }

        public int hashCode() {
            return this.f43557a.hashCode();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final r f43560a;

        public boolean a(int... iArr) {
            return this.f43560a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f43560a.equals(((c) obj).f43560a);
            }
            return false;
        }

        public int hashCode() {
            return this.f43560a.hashCode();
        }

        public c(r rVar) {
            this.f43560a = rVar;
        }
    }

    public interface d {
        default void D0(int i10) {
        }

        default void E0(int i10) {
        }

        @Deprecated
        default void F0(boolean z10) {
        }

        default void G0(int i10) {
        }

        default void H0(int i10) {
        }

        default void I0(boolean z10) {
        }

        default void J0(int i10, boolean z10) {
        }

        default void K0(C5574n c5574n) {
        }

        default void L0() {
        }

        default void M0(B b10, c cVar) {
        }

        default void N0(F f10, int i10) {
        }

        default void O0(PlaybackException playbackException) {
        }

        default void P0(J j10) {
        }

        default void Q0(int i10, int i11) {
        }

        default void R0(x xVar) {
        }

        @Deprecated
        default void S0(int i10) {
        }

        default void T0(v vVar, int i10) {
        }

        default void U0(boolean z10) {
        }

        default void V0(float f10) {
        }

        default void W0(e eVar, e eVar2, int i10) {
        }

        @Deprecated
        default void X0(boolean z10, int i10) {
        }

        default void Y0(b bVar) {
        }

        default void Z0(PlaybackException playbackException) {
        }

        default void a1(boolean z10, int i10) {
        }

        default void b1(I i10) {
        }

        default void c(boolean z10) {
        }

        default void c1(boolean z10) {
        }

        default void e(N n10) {
        }

        default void i(C6351b c6351b) {
        }

        default void m(C5560A c5560a) {
        }

        @Deprecated
        default void n(List<C6350a> list) {
        }

        default void q(y yVar) {
        }
    }

    public static final class e {

        /* renamed from: k, reason: collision with root package name */
        static final String f43561k = P.y0(0);

        /* renamed from: l, reason: collision with root package name */
        private static final String f43562l = P.y0(1);

        /* renamed from: m, reason: collision with root package name */
        static final String f43563m = P.y0(2);

        /* renamed from: n, reason: collision with root package name */
        static final String f43564n = P.y0(3);

        /* renamed from: o, reason: collision with root package name */
        static final String f43565o = P.y0(4);

        /* renamed from: p, reason: collision with root package name */
        private static final String f43566p = P.y0(5);

        /* renamed from: q, reason: collision with root package name */
        private static final String f43567q = P.y0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Object f43568a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f43569b;

        /* renamed from: c, reason: collision with root package name */
        public final int f43570c;

        /* renamed from: d, reason: collision with root package name */
        public final v f43571d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f43572e;

        /* renamed from: f, reason: collision with root package name */
        public final int f43573f;

        /* renamed from: g, reason: collision with root package name */
        public final long f43574g;

        /* renamed from: h, reason: collision with root package name */
        public final long f43575h;

        /* renamed from: i, reason: collision with root package name */
        public final int f43576i;

        /* renamed from: j, reason: collision with root package name */
        public final int f43577j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f43568a, eVar.f43568a) && Objects.equals(this.f43572e, eVar.f43572e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(e eVar) {
            return this.f43570c == eVar.f43570c && this.f43573f == eVar.f43573f && this.f43574g == eVar.f43574g && this.f43575h == eVar.f43575h && this.f43576i == eVar.f43576i && this.f43577j == eVar.f43577j && Objects.equals(this.f43571d, eVar.f43571d);
        }

        public int hashCode() {
            return Objects.hash(this.f43568a, Integer.valueOf(this.f43570c), this.f43571d, this.f43572e, Integer.valueOf(this.f43573f), Long.valueOf(this.f43574g), Long.valueOf(this.f43575h), Integer.valueOf(this.f43576i), Integer.valueOf(this.f43577j));
        }

        public e(Object obj, int i10, v vVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f43568a = obj;
            this.f43569b = i10;
            this.f43570c = i10;
            this.f43571d = vVar;
            this.f43572e = obj2;
            this.f43573f = i11;
            this.f43574g = j10;
            this.f43575h = j11;
            this.f43576i = i12;
            this.f43577j = i13;
        }
    }

    I A();

    void B();

    void C(TextureView textureView);

    void D(int i10, long j10);

    b E();

    boolean F();

    void G(boolean z10);

    long H();

    long I();

    int J();

    void K(TextureView textureView);

    N L();

    void M(I i10);

    boolean N();

    int O();

    void P(long j10);

    void Q(v vVar);

    long R();

    long S();

    boolean T();

    int U();

    boolean V();

    int W();

    void X(int i10);

    void Y(SurfaceView surfaceView);

    void Z(d dVar);

    int a0();

    boolean b0();

    long c0();

    void d(C5560A c5560a);

    void d0();

    PlaybackException e();

    void e0();

    C5560A f();

    x f0();

    void g();

    long g0();

    long getDuration();

    float getVolume();

    void h(float f10);

    long h0();

    void i();

    boolean i0();

    boolean j();

    long k();

    void l(d dVar);

    void m();

    void n(List<v> list, boolean z10);

    void o(SurfaceView surfaceView);

    void p();

    void pause();

    void q(boolean z10);

    J r();

    boolean s();

    C6351b t();

    int u();

    boolean v(int i10);

    boolean w();

    int x();

    F y();

    Looper z();
}
