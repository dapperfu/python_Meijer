package i3;

import a3.B;
import a3.C5560A;
import a3.C5574n;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.r;
import c3.C6350a;
import c3.C6351b;
import d3.C13466a;
import h3.C14333b;
import h3.C14334c;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* renamed from: i3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC14599b {

    /* renamed from: i3.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f137046a;

        /* renamed from: b, reason: collision with root package name */
        public final a3.F f137047b;

        /* renamed from: c, reason: collision with root package name */
        public final int f137048c;

        /* renamed from: d, reason: collision with root package name */
        public final r.b f137049d;

        /* renamed from: e, reason: collision with root package name */
        public final long f137050e;

        /* renamed from: f, reason: collision with root package name */
        public final a3.F f137051f;

        /* renamed from: g, reason: collision with root package name */
        public final int f137052g;

        /* renamed from: h, reason: collision with root package name */
        public final r.b f137053h;

        /* renamed from: i, reason: collision with root package name */
        public final long f137054i;

        /* renamed from: j, reason: collision with root package name */
        public final long f137055j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f137046a == aVar.f137046a && this.f137048c == aVar.f137048c && this.f137050e == aVar.f137050e && this.f137052g == aVar.f137052g && this.f137054i == aVar.f137054i && this.f137055j == aVar.f137055j && Objects.equals(this.f137047b, aVar.f137047b) && Objects.equals(this.f137049d, aVar.f137049d) && Objects.equals(this.f137051f, aVar.f137051f) && Objects.equals(this.f137053h, aVar.f137053h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f137046a), this.f137047b, Integer.valueOf(this.f137048c), this.f137049d, Long.valueOf(this.f137050e), this.f137051f, Integer.valueOf(this.f137052g), this.f137053h, Long.valueOf(this.f137054i), Long.valueOf(this.f137055j));
        }

        public a(long j10, a3.F f10, int i10, r.b bVar, long j11, a3.F f11, int i11, r.b bVar2, long j12, long j13) {
            this.f137046a = j10;
            this.f137047b = f10;
            this.f137048c = i10;
            this.f137049d = bVar;
            this.f137050e = j11;
            this.f137051f = f11;
            this.f137052g = i11;
            this.f137053h = bVar2;
            this.f137054i = j12;
            this.f137055j = j13;
        }
    }

    /* renamed from: i3.b$b, reason: collision with other inner class name */
    public static final class C2163b {

        /* renamed from: a, reason: collision with root package name */
        private final a3.r f137056a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f137057b;

        public boolean a(int i10) {
            return this.f137056a.a(i10);
        }

        public int b(int i10) {
            return this.f137056a.c(i10);
        }

        public a c(int i10) {
            return (a) C13466a.e(this.f137057b.get(i10));
        }

        public int d() {
            return this.f137056a.d();
        }

        public C2163b(a3.r rVar, SparseArray<a> sparseArray) {
            this.f137056a = rVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(rVar.d());
            for (int i10 = 0; i10 < rVar.d(); i10++) {
                int iC = rVar.c(i10);
                sparseArray2.append(iC, (a) C13466a.e(sparseArray.get(iC)));
            }
            this.f137057b = sparseArray2;
        }
    }

    @Deprecated
    default void A(a aVar, p3.i iVar, p3.j jVar) {
    }

    default void B(a aVar, B.e eVar, B.e eVar2, int i10) {
    }

    default void D(a aVar, String str) {
    }

    default void E(a aVar, a3.y yVar) {
    }

    default void F(a aVar, AudioSink.a aVar2) {
    }

    default void G(a aVar) {
    }

    default void H(a aVar, Exception exc) {
    }

    default void I(a aVar, boolean z10) {
    }

    default void J(a aVar, int i10) {
    }

    default void L(a aVar, int i10, int i11) {
    }

    default void M(a aVar, p3.i iVar, p3.j jVar, IOException iOException, boolean z10) {
    }

    default void N(a aVar, a3.t tVar, C14334c c14334c) {
    }

    default void O(a aVar, a3.x xVar) {
    }

    default void P(a aVar) {
    }

    default void Q(a aVar, B.b bVar) {
    }

    default void R(a aVar, int i10) {
    }

    default void S(a aVar, boolean z10, int i10) {
    }

    default void T(a aVar, p3.i iVar, p3.j jVar) {
    }

    default void U(a aVar, a3.J j10) {
    }

    default void V(a aVar, p3.i iVar, p3.j jVar, int i10) {
    }

    @Deprecated
    default void W(a aVar) {
    }

    @Deprecated
    default void X(a aVar, int i10, int i11, int i12, float f10) {
    }

    default void Y(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    default void Z(a aVar) {
    }

    @Deprecated
    default void a(a aVar, String str, long j10) {
    }

    default void a0(a aVar, int i10) {
    }

    default void b(a aVar) {
    }

    default void b0(a aVar, float f10) {
    }

    default void c(a aVar, boolean z10) {
    }

    default void c0(a aVar, a3.t tVar, C14334c c14334c) {
    }

    @Deprecated
    default void d(a aVar, List<C6350a> list) {
    }

    default void d0(a aVar, Exception exc) {
    }

    default void e(a aVar, boolean z10) {
    }

    default void e0(a aVar, long j10, int i10) {
    }

    default void f(a aVar) {
    }

    default void f0(a aVar, String str, long j10, long j11) {
    }

    default void g(a aVar, Exception exc) {
    }

    default void g0(a aVar, C14333b c14333b) {
    }

    default void h(a aVar, C14333b c14333b) {
    }

    @Deprecated
    default void h0(a aVar, boolean z10) {
    }

    default void i(a aVar, a3.N n10) {
    }

    default void i0(a aVar, a3.v vVar, int i10) {
    }

    @Deprecated
    default void j(a aVar, int i10) {
    }

    default void j0(a aVar, p3.i iVar, p3.j jVar) {
    }

    default void k(a aVar, boolean z10) {
    }

    default void k0(a aVar, C5574n c5574n) {
    }

    @Deprecated
    default void l(a aVar, String str, long j10) {
    }

    default void l0(a aVar, long j10) {
    }

    default void m(a aVar) {
    }

    default void m0(a aVar, int i10) {
    }

    @Deprecated
    default void n(a aVar, boolean z10, int i10) {
    }

    default void n0(a3.B b10, C2163b c2163b) {
    }

    default void o(a aVar, Exception exc) {
    }

    default void o0(a aVar, int i10) {
    }

    default void p(a aVar, PlaybackException playbackException) {
    }

    default void p0(a aVar, String str) {
    }

    default void q(a aVar, int i10, long j10) {
    }

    default void q0(a aVar, C5560A c5560a) {
    }

    default void r(a aVar, PlaybackException playbackException) {
    }

    default void r0(a aVar, int i10, int i11, boolean z10) {
    }

    default void s0(a aVar, C6351b c6351b) {
    }

    default void t(a aVar, C14333b c14333b) {
    }

    default void t0(a aVar, int i10, long j10, long j11) {
    }

    default void u(a aVar, p3.j jVar) {
    }

    default void u0(a aVar, Object obj, long j10) {
    }

    default void v(a aVar, a3.I i10) {
    }

    default void v0(a aVar, AudioSink.a aVar2) {
    }

    default void w(a aVar, int i10) {
    }

    default void w0(a aVar, C14333b c14333b) {
    }

    default void y(a aVar, String str, long j10, long j11) {
    }

    default void z(a aVar, int i10, boolean z10) {
    }
}
