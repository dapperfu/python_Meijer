package a3;

import a3.r;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import c3.C6476a;
import c3.C6477b;
import d3.P;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public interface B {

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f44373b = new a().e();

        /* renamed from: c, reason: collision with root package name */
        private static final String f44374c = P.y0(0);

        /* renamed from: a, reason: collision with root package name */
        private final r f44375a;

        public static final class a {

            /* renamed from: b, reason: collision with root package name */
            private static final int[] f44376b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* renamed from: a, reason: collision with root package name */
            private final r.b f44377a = new r.b();

            public a a(int i10) {
                this.f44377a.a(i10);
                return this;
            }

            public a b(b bVar) {
                this.f44377a.b(bVar.f44375a);
                return this;
            }

            public a c(int... iArr) {
                this.f44377a.c(iArr);
                return this;
            }

            public a d(int i10, boolean z10) {
                this.f44377a.d(i10, z10);
                return this;
            }

            public b e() {
                return new b(this.f44377a.e());
            }
        }

        private b(r rVar) {
            this.f44375a = rVar;
        }

        public boolean b(int i10) {
            return this.f44375a.a(i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f44375a.equals(((b) obj).f44375a);
            }
            return false;
        }

        public int hashCode() {
            return this.f44375a.hashCode();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final r f44378a;

        public boolean a(int... iArr) {
            return this.f44378a.b(iArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f44378a.equals(((c) obj).f44378a);
            }
            return false;
        }

        public int hashCode() {
            return this.f44378a.hashCode();
        }

        public c(r rVar) {
            this.f44378a = rVar;
        }
    }

    public interface d {
        default void G0(int i10) {
        }

        default void H0(int i10) {
        }

        @Deprecated
        default void I0(boolean z10) {
        }

        default void J0(int i10) {
        }

        default void K0(int i10) {
        }

        default void L0(boolean z10) {
        }

        default void M0(int i10, boolean z10) {
        }

        default void N0(C5657n c5657n) {
        }

        default void O0() {
        }

        default void P0(B b10, c cVar) {
        }

        default void Q0(F f10, int i10) {
        }

        default void R0(PlaybackException playbackException) {
        }

        default void S0(J j10) {
        }

        default void T0(int i10, int i11) {
        }

        default void U0(x xVar) {
        }

        @Deprecated
        default void V0(int i10) {
        }

        default void W0(v vVar, int i10) {
        }

        default void X0(boolean z10) {
        }

        default void Y0(float f10) {
        }

        default void Z0(e eVar, e eVar2, int i10) {
        }

        @Deprecated
        default void a1(boolean z10, int i10) {
        }

        default void b1(b bVar) {
        }

        default void c(boolean z10) {
        }

        default void c1(PlaybackException playbackException) {
        }

        default void d1(boolean z10, int i10) {
        }

        default void e(N n10) {
        }

        default void e1(I i10) {
        }

        default void f1(boolean z10) {
        }

        default void i(C6477b c6477b) {
        }

        default void m(C5643A c5643a) {
        }

        @Deprecated
        default void n(List<C6476a> list) {
        }

        default void q(y yVar) {
        }
    }

    public static final class e {

        /* renamed from: k, reason: collision with root package name */
        static final String f44379k = P.y0(0);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44380l = P.y0(1);

        /* renamed from: m, reason: collision with root package name */
        static final String f44381m = P.y0(2);

        /* renamed from: n, reason: collision with root package name */
        static final String f44382n = P.y0(3);

        /* renamed from: o, reason: collision with root package name */
        static final String f44383o = P.y0(4);

        /* renamed from: p, reason: collision with root package name */
        private static final String f44384p = P.y0(5);

        /* renamed from: q, reason: collision with root package name */
        private static final String f44385q = P.y0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Object f44386a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final int f44387b;

        /* renamed from: c, reason: collision with root package name */
        public final int f44388c;

        /* renamed from: d, reason: collision with root package name */
        public final v f44389d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f44390e;

        /* renamed from: f, reason: collision with root package name */
        public final int f44391f;

        /* renamed from: g, reason: collision with root package name */
        public final long f44392g;

        /* renamed from: h, reason: collision with root package name */
        public final long f44393h;

        /* renamed from: i, reason: collision with root package name */
        public final int f44394i;

        /* renamed from: j, reason: collision with root package name */
        public final int f44395j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (a(eVar) && Objects.equals(this.f44386a, eVar.f44386a) && Objects.equals(this.f44390e, eVar.f44390e)) {
                    return true;
                }
            }
            return false;
        }

        public boolean a(e eVar) {
            return this.f44388c == eVar.f44388c && this.f44391f == eVar.f44391f && this.f44392g == eVar.f44392g && this.f44393h == eVar.f44393h && this.f44394i == eVar.f44394i && this.f44395j == eVar.f44395j && Objects.equals(this.f44389d, eVar.f44389d);
        }

        public int hashCode() {
            return Objects.hash(this.f44386a, Integer.valueOf(this.f44388c), this.f44389d, this.f44390e, Integer.valueOf(this.f44391f), Long.valueOf(this.f44392g), Long.valueOf(this.f44393h), Integer.valueOf(this.f44394i), Integer.valueOf(this.f44395j));
        }

        public e(Object obj, int i10, v vVar, Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f44386a = obj;
            this.f44387b = i10;
            this.f44388c = i10;
            this.f44389d = vVar;
            this.f44390e = obj2;
            this.f44391f = i11;
            this.f44392g = j10;
            this.f44393h = j11;
            this.f44394i = i12;
            this.f44395j = i13;
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

    void d(C5643A c5643a);

    void d0();

    PlaybackException e();

    void e0();

    C5643A f();

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

    C6477b t();

    int u();

    boolean v(int i10);

    boolean w();

    int x();

    F y();

    Looper z();
}
