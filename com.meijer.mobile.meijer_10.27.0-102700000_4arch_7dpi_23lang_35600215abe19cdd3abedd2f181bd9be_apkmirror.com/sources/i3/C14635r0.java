package i3;

import Ce.M;
import a3.B;
import a3.C5560A;
import a3.C5574n;
import a3.F;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.r;
import c3.C6350a;
import c3.C6351b;
import d3.C13466a;
import d3.C13482q;
import d3.InterfaceC13473h;
import d3.InterfaceC13479n;
import h3.C14333b;
import h3.C14334c;
import i3.InterfaceC14599b;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* renamed from: i3.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C14635r0 implements InterfaceC14596a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13473h f137133a;

    /* renamed from: b, reason: collision with root package name */
    private final F.b f137134b;

    /* renamed from: c, reason: collision with root package name */
    private final F.c f137135c;

    /* renamed from: d, reason: collision with root package name */
    private final a f137136d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<InterfaceC14599b.a> f137137e;

    /* renamed from: f, reason: collision with root package name */
    private C13482q<InterfaceC14599b> f137138f;

    /* renamed from: g, reason: collision with root package name */
    private a3.B f137139g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC13479n f137140h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f137141i;

    /* renamed from: i3.r0$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final F.b f137142a;

        /* renamed from: b, reason: collision with root package name */
        private Ce.L<r.b> f137143b = Ce.L.x();

        /* renamed from: c, reason: collision with root package name */
        private Ce.M<r.b, a3.F> f137144c = Ce.M.n();

        /* renamed from: d, reason: collision with root package name */
        private r.b f137145d;

        /* renamed from: e, reason: collision with root package name */
        private r.b f137146e;

        /* renamed from: f, reason: collision with root package name */
        private r.b f137147f;

        private void b(M.a<r.b, a3.F> aVar, r.b bVar, a3.F f10) {
            if (bVar == null) {
                return;
            }
            if (f10.b(bVar.f56933a) != -1) {
                aVar.f(bVar, f10);
                return;
            }
            a3.F f11 = this.f137144c.get(bVar);
            if (f11 != null) {
                aVar.f(bVar, f11);
            }
        }

        private static boolean i(r.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (!bVar.f56933a.equals(obj)) {
                return false;
            }
            if (z10 && bVar.f56934b == i10 && bVar.f56935c == i11) {
                return true;
            }
            return !z10 && bVar.f56934b == -1 && bVar.f56937e == i12;
        }

        public r.b d() {
            return this.f137145d;
        }

        public r.b e() {
            if (this.f137143b.isEmpty()) {
                return null;
            }
            return (r.b) Ce.Q.f(this.f137143b);
        }

        public a3.F f(r.b bVar) {
            return this.f137144c.get(bVar);
        }

        public r.b g() {
            return this.f137146e;
        }

        public r.b h() {
            return this.f137147f;
        }

        public void j(a3.B b10) {
            this.f137145d = c(b10, this.f137143b, this.f137146e, this.f137142a);
        }

        public void l(a3.B b10) {
            this.f137145d = c(b10, this.f137143b, this.f137146e, this.f137142a);
            m(b10.y());
        }

        public a(F.b bVar) {
            this.f137142a = bVar;
        }

        private static r.b c(a3.B b10, Ce.L<r.b> l10, r.b bVar, F.b bVar2) {
            Object objM;
            int iD;
            a3.F fY = b10.y();
            int iJ = b10.J();
            if (fY.q()) {
                objM = null;
            } else {
                objM = fY.m(iJ);
            }
            if (!b10.j() && !fY.q()) {
                iD = fY.f(iJ, bVar2).d(d3.P.M0(b10.g0()) - bVar2.o());
            } else {
                iD = -1;
            }
            int i10 = iD;
            for (int i11 = 0; i11 < l10.size(); i11++) {
                r.b bVar3 = l10.get(i11);
                if (i(bVar3, objM, b10.j(), b10.u(), b10.O(), i10)) {
                    return bVar3;
                }
            }
            if (!l10.isEmpty() || bVar == null || !i(bVar, objM, b10.j(), b10.u(), b10.O(), i10)) {
                return null;
            }
            return bVar;
        }

        private void m(a3.F f10) {
            M.a<r.b, a3.F> aVarA = Ce.M.a();
            if (this.f137143b.isEmpty()) {
                b(aVarA, this.f137146e, f10);
                if (!Objects.equals(this.f137147f, this.f137146e)) {
                    b(aVarA, this.f137147f, f10);
                }
                if (!Objects.equals(this.f137145d, this.f137146e) && !Objects.equals(this.f137145d, this.f137147f)) {
                    b(aVarA, this.f137145d, f10);
                }
            } else {
                for (int i10 = 0; i10 < this.f137143b.size(); i10++) {
                    b(aVarA, this.f137143b.get(i10), f10);
                }
                if (!this.f137143b.contains(this.f137145d)) {
                    b(aVarA, this.f137145d, f10);
                }
            }
            this.f137144c = aVarA.c();
        }

        public void k(List<r.b> list, r.b bVar, a3.B b10) {
            this.f137143b = Ce.L.s(list);
            if (!list.isEmpty()) {
                this.f137146e = list.get(0);
                this.f137147f = (r.b) C13466a.e(bVar);
            }
            if (this.f137145d == null) {
                this.f137145d = c(b10, this.f137143b, this.f137146e, this.f137142a);
            }
            m(b10.y());
        }
    }

    public static /* synthetic */ void B1(InterfaceC14599b interfaceC14599b, a3.r rVar) {
    }

    @Override // a3.B.d
    public void F0(boolean z10) {
    }

    @Override // a3.B.d
    public void L0() {
    }

    @Override // a3.B.d
    public void M0(a3.B b10, B.c cVar) {
    }

    @Override // a3.B.d
    public void S0(int i10) {
    }

    @Override // a3.B.d
    public final void W0(final B.e eVar, final B.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f137141i = false;
        }
        this.f137136d.j((a3.B) C13466a.e(this.f137139g));
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 11, new C13482q.a() { // from class: i3.f0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                C14635r0.C0(aVarF1, i10, eVar, eVar2, (InterfaceC14599b) obj);
            }
        });
    }

    private InterfaceC14599b.a H1(r.b bVar) {
        C13466a.e(this.f137139g);
        a3.F f10 = bVar == null ? null : this.f137136d.f(bVar);
        if (bVar != null && f10 != null) {
            return G1(f10, f10.h(bVar.f56933a, this.f137134b).f43594c, bVar);
        }
        int iW = this.f137139g.W();
        a3.F fY = this.f137139g.y();
        if (iW >= fY.p()) {
            fY = a3.F.f43583a;
        }
        return G1(fY, iW, null);
    }

    private InterfaceC14599b.a I1() {
        return H1(this.f137136d.e());
    }

    private InterfaceC14599b.a J1(int i10, r.b bVar) {
        C13466a.e(this.f137139g);
        if (bVar != null) {
            return this.f137136d.f(bVar) != null ? H1(bVar) : G1(a3.F.f43583a, i10, bVar);
        }
        a3.F fY = this.f137139g.y();
        if (i10 >= fY.p()) {
            fY = a3.F.f43583a;
        }
        return G1(fY, i10, null);
    }

    private InterfaceC14599b.a K1() {
        return H1(this.f137136d.g());
    }

    private InterfaceC14599b.a L1() {
        return H1(this.f137136d.h());
    }

    private InterfaceC14599b.a M1(PlaybackException playbackException) {
        r.b bVar;
        return (!(playbackException instanceof ExoPlaybackException) || (bVar = ((ExoPlaybackException) playbackException).f55536o) == null) ? F1() : H1(bVar);
    }

    @Override // i3.InterfaceC14596a
    public final void C(List<r.b> list, r.b bVar) {
        this.f137136d.k(list, bVar, (a3.B) C13466a.e(this.f137139g));
    }

    @Override // i3.InterfaceC14596a
    public final void D() {
        if (this.f137141i) {
            return;
        }
        final InterfaceC14599b.a aVarF1 = F1();
        this.f137141i = true;
        O1(aVarF1, -1, new C13482q.a() { // from class: i3.e0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).Z(aVarF1);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public void F(final a3.B b10, Looper looper) {
        C13466a.g(this.f137139g == null || this.f137136d.f137143b.isEmpty());
        this.f137139g = (a3.B) C13466a.e(b10);
        this.f137140h = this.f137133a.e(looper, null);
        this.f137138f = this.f137138f.e(looper, new C13482q.b() { // from class: i3.O
            @Override // d3.C13482q.b
            public final void a(Object obj, a3.r rVar) {
                InterfaceC14599b interfaceC14599b = (InterfaceC14599b) obj;
                interfaceC14599b.n0(b10, new InterfaceC14599b.C2163b(rVar, this.f137017a.f137137e));
            }
        });
    }

    protected final InterfaceC14599b.a F1() {
        return H1(this.f137136d.d());
    }

    protected final InterfaceC14599b.a G1(a3.F f10, int i10, r.b bVar) {
        r.b bVar2 = f10.q() ? null : bVar;
        long jC = this.f137133a.c();
        boolean z10 = f10.equals(this.f137139g.y()) && i10 == this.f137139g.W();
        long jB = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z10) {
                jB = this.f137139g.S();
            } else if (!f10.q()) {
                jB = f10.n(i10, this.f137135c).b();
            }
        } else if (z10 && this.f137139g.u() == bVar2.f56934b && this.f137139g.O() == bVar2.f56935c) {
            jB = this.f137139g.g0();
        }
        return new InterfaceC14599b.a(jC, f10, i10, bVar2, jB, this.f137139g.y(), this.f137139g.W(), this.f137136d.d(), this.f137139g.g0(), this.f137139g.k());
    }

    @Override // a3.B.d
    public final void N0(a3.F f10, final int i10) {
        this.f137136d.l((a3.B) C13466a.e(this.f137139g));
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 0, new C13482q.a() { // from class: i3.K
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).R(aVarF1, i10);
            }
        });
    }

    protected final void O1(InterfaceC14599b.a aVar, int i10, C13482q.a<InterfaceC14599b> aVar2) {
        this.f137137e.put(i10, aVar);
        this.f137138f.k(i10, aVar2);
    }

    @Override // i3.InterfaceC14596a
    public void release() {
        ((InterfaceC13479n) C13466a.i(this.f137140h)).post(new Runnable() { // from class: i3.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137083a.N1();
            }
        });
    }

    public C14635r0(InterfaceC13473h interfaceC13473h) {
        this.f137133a = (InterfaceC13473h) C13466a.e(interfaceC13473h);
        this.f137138f = new C13482q<>(d3.P.T(), interfaceC13473h, new C13482q.b() { // from class: i3.b0
            @Override // d3.C13482q.b
            public final void a(Object obj, a3.r rVar) {
                C14635r0.B1((InterfaceC14599b) obj, rVar);
            }
        });
        F.b bVar = new F.b();
        this.f137134b = bVar;
        this.f137135c = new F.c();
        this.f137136d = new a(bVar);
        this.f137137e = new SparseArray<>();
    }

    public static /* synthetic */ void C0(InterfaceC14599b.a aVar, int i10, B.e eVar, B.e eVar2, InterfaceC14599b interfaceC14599b) {
        interfaceC14599b.j(aVar, i10);
        interfaceC14599b.B(aVar, eVar, eVar2, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N1() {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 1028, new C13482q.a() { // from class: i3.V
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).b(aVarF1);
            }
        });
        this.f137138f.i();
    }

    public static /* synthetic */ void U(InterfaceC14599b.a aVar, int i10, InterfaceC14599b interfaceC14599b) {
        interfaceC14599b.W(aVar);
        interfaceC14599b.a0(aVar, i10);
    }

    public static /* synthetic */ void W(InterfaceC14599b.a aVar, String str, long j10, long j11, InterfaceC14599b interfaceC14599b) {
        interfaceC14599b.l(aVar, str, j10);
        interfaceC14599b.y(aVar, str, j11, j10);
    }

    public static /* synthetic */ void c0(InterfaceC14599b.a aVar, a3.N n10, InterfaceC14599b interfaceC14599b) {
        interfaceC14599b.i(aVar, n10);
        interfaceC14599b.X(aVar, n10.f43767a, n10.f43768b, 0, n10.f43770d);
    }

    public static /* synthetic */ void d0(InterfaceC14599b.a aVar, p3.i iVar, p3.j jVar, int i10, InterfaceC14599b interfaceC14599b) {
        interfaceC14599b.A(aVar, iVar, jVar);
        interfaceC14599b.V(aVar, iVar, jVar, i10);
    }

    public static /* synthetic */ void n0(InterfaceC14599b.a aVar, String str, long j10, long j11, InterfaceC14599b interfaceC14599b) {
        interfaceC14599b.a(aVar, str, j10);
        interfaceC14599b.f0(aVar, str, j11, j10);
    }

    public static /* synthetic */ void t0(InterfaceC14599b.a aVar, boolean z10, InterfaceC14599b interfaceC14599b) {
        interfaceC14599b.h0(aVar, z10);
        interfaceC14599b.k(aVar, z10);
    }

    @Override // i3.InterfaceC14596a
    public final void A(final long j10, final int i10) {
        final InterfaceC14599b.a aVarK1 = K1();
        O1(aVarK1, 1021, new C13482q.a() { // from class: i3.d
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).e0(aVarK1, j10, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void B(int i10, r.b bVar, final p3.i iVar, final p3.j jVar) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1002, new C13482q.a() { // from class: i3.e
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).T(aVarJ1, iVar, jVar);
            }
        });
    }

    @Override // a3.B.d
    public final void D0(final int i10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 8, new C13482q.a() { // from class: i3.i0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).w(aVarF1, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void E(int i10, r.b bVar) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1023, new C13482q.a() { // from class: i3.x
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).f(aVarJ1);
            }
        });
    }

    @Override // a3.B.d
    public final void E0(final int i10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 6, new C13482q.a() { // from class: i3.U
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).o0(aVarF1, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void G(int i10, r.b bVar, final p3.i iVar, final p3.j jVar, final IOException iOException, final boolean z10) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1003, new C13482q.a() { // from class: i3.n0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).M(aVarJ1, iVar, jVar, iOException, z10);
            }
        });
    }

    @Override // a3.B.d
    public final void G0(final int i10) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 21, new C13482q.a() { // from class: i3.l
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).m0(aVarL1, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void H(int i10, r.b bVar, final p3.i iVar, final p3.j jVar) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1001, new C13482q.a() { // from class: i3.j
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).j0(aVarJ1, iVar, jVar);
            }
        });
    }

    @Override // a3.B.d
    public final void H0(final int i10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 4, new C13482q.a() { // from class: i3.d0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).J(aVarF1, i10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void I(int i10, r.b bVar, final int i11) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1022, new C13482q.a() { // from class: i3.g
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                C14635r0.U(aVarJ1, i11, (InterfaceC14599b) obj);
            }
        });
    }

    @Override // a3.B.d
    public final void I0(final boolean z10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 9, new C13482q.a() { // from class: i3.l0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).I(aVarF1, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void J(int i10, r.b bVar) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1026, new C13482q.a() { // from class: i3.v
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).G(aVarJ1);
            }
        });
    }

    @Override // a3.B.d
    public void J0(final int i10, final boolean z10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 30, new C13482q.a() { // from class: i3.q0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).z(aVarF1, i10, z10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void K(int i10, r.b bVar, final Exception exc) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1024, new C13482q.a() { // from class: i3.i
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).d0(aVarJ1, exc);
            }
        });
    }

    @Override // a3.B.d
    public void K0(final C5574n c5574n) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 29, new C13482q.a() { // from class: i3.h
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).k0(aVarF1, c5574n);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void L(int i10, r.b bVar) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1025, new C13482q.a() { // from class: i3.w
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).P(aVarJ1);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void M(int i10, r.b bVar, final p3.i iVar, final p3.j jVar, final int i11) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1000, new C13482q.a() { // from class: i3.y
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                C14635r0.d0(aVarJ1, iVar, jVar, i11, (InterfaceC14599b) obj);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public void N(final int i10, final int i11, final boolean z10) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1033, new C13482q.a() { // from class: i3.Z
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).r0(aVarL1, i10, i11, z10);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public void O(InterfaceC14599b interfaceC14599b) {
        C13466a.e(interfaceC14599b);
        this.f137138f.c(interfaceC14599b);
    }

    @Override // a3.B.d
    public final void O0(final PlaybackException playbackException) {
        final InterfaceC14599b.a aVarM1 = M1(playbackException);
        O1(aVarM1, 10, new C13482q.a() { // from class: i3.c0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).r(aVarM1, playbackException);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void P(int i10, r.b bVar, final p3.j jVar) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1004, new C13482q.a() { // from class: i3.c
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).u(aVarJ1, jVar);
            }
        });
    }

    @Override // a3.B.d
    public void P0(final a3.J j10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 2, new C13482q.a() { // from class: i3.D
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).U(aVarF1, j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.h
    public final void Q(int i10, r.b bVar) {
        final InterfaceC14599b.a aVarJ1 = J1(i10, bVar);
        O1(aVarJ1, 1027, new C13482q.a() { // from class: i3.r
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).m(aVarJ1);
            }
        });
    }

    @Override // a3.B.d
    public final void Q0(final int i10, final int i11) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 24, new C13482q.a() { // from class: i3.m0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).L(aVarL1, i10, i11);
            }
        });
    }

    @Override // a3.B.d
    public void R0(final a3.x xVar) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 14, new C13482q.a() { // from class: i3.F
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).O(aVarF1, xVar);
            }
        });
    }

    @Override // a3.B.d
    public final void T0(final a3.v vVar, final int i10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 1, new C13482q.a() { // from class: i3.L
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).i0(aVarF1, vVar, i10);
            }
        });
    }

    @Override // a3.B.d
    public final void U0(final boolean z10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 3, new C13482q.a() { // from class: i3.G
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                C14635r0.t0(aVarF1, z10, (InterfaceC14599b) obj);
            }
        });
    }

    @Override // a3.B.d
    public final void V0(final float f10) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 22, new C13482q.a() { // from class: i3.M
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).b0(aVarL1, f10);
            }
        });
    }

    @Override // a3.B.d
    public final void X0(final boolean z10, final int i10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, -1, new C13482q.a() { // from class: i3.P
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).n(aVarF1, z10, i10);
            }
        });
    }

    @Override // a3.B.d
    public void Y0(final B.b bVar) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 13, new C13482q.a() { // from class: i3.I
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).Q(aVarF1, bVar);
            }
        });
    }

    @Override // a3.B.d
    public void Z0(final PlaybackException playbackException) {
        final InterfaceC14599b.a aVarM1 = M1(playbackException);
        O1(aVarM1, 10, new C13482q.a() { // from class: i3.X
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).p(aVarM1, playbackException);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public void a(final AudioSink.a aVar) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1031, new C13482q.a() { // from class: i3.B
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).v0(aVarL1, aVar);
            }
        });
    }

    @Override // a3.B.d
    public final void a1(final boolean z10, final int i10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 5, new C13482q.a() { // from class: i3.Y
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).S(aVarF1, z10, i10);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public void b(final AudioSink.a aVar) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1032, new C13482q.a() { // from class: i3.z
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).F(aVarL1, aVar);
            }
        });
    }

    @Override // a3.B.d
    public void b1(final a3.I i10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 19, new C13482q.a() { // from class: i3.J
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).v(aVarF1, i10);
            }
        });
    }

    @Override // a3.B.d
    public final void c(final boolean z10) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 23, new C13482q.a() { // from class: i3.A
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).e(aVarL1, z10);
            }
        });
    }

    @Override // a3.B.d
    public void c1(final boolean z10) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 7, new C13482q.a() { // from class: i3.S
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).c(aVarF1, z10);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void d(final Exception exc) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1014, new C13482q.a() { // from class: i3.s
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).g(aVarL1, exc);
            }
        });
    }

    @Override // a3.B.d
    public final void e(final a3.N n10) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 25, new C13482q.a() { // from class: i3.m
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                C14635r0.c0(aVarL1, n10, (InterfaceC14599b) obj);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void f(final C14333b c14333b) {
        final InterfaceC14599b.a aVarK1 = K1();
        O1(aVarK1, 1013, new C13482q.a() { // from class: i3.f
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).g0(aVarK1, c14333b);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void g(final String str) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1019, new C13482q.a() { // from class: i3.W
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).p0(aVarL1, str);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void h(final String str, final long j10, final long j11) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1016, new C13482q.a() { // from class: i3.k0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                C14635r0.n0(aVarL1, str, j11, j10, (InterfaceC14599b) obj);
            }
        });
    }

    @Override // a3.B.d
    public void i(final C6351b c6351b) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 27, new C13482q.a() { // from class: i3.E
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).s0(aVarF1, c6351b);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void j(final C14333b c14333b) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1015, new C13482q.a() { // from class: i3.p
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).w0(aVarL1, c14333b);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void k(final String str) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1012, new C13482q.a() { // from class: i3.H
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).D(aVarL1, str);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void l(final String str, final long j10, final long j11) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1008, new C13482q.a() { // from class: i3.T
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                C14635r0.W(aVarL1, str, j11, j10, (InterfaceC14599b) obj);
            }
        });
    }

    @Override // a3.B.d
    public final void m(final C5560A c5560a) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 12, new C13482q.a() { // from class: i3.C
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).q0(aVarF1, c5560a);
            }
        });
    }

    @Override // a3.B.d
    public void n(final List<C6350a> list) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 27, new C13482q.a() { // from class: i3.a0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).d(aVarF1, list);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void o(final long j10) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1010, new C13482q.a() { // from class: i3.o0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).l0(aVarL1, j10);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void p(final Exception exc) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1030, new C13482q.a() { // from class: i3.N
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).H(aVarL1, exc);
            }
        });
    }

    @Override // a3.B.d
    public final void q(final a3.y yVar) {
        final InterfaceC14599b.a aVarF1 = F1();
        O1(aVarF1, 28, new C13482q.a() { // from class: i3.Q
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).E(aVarF1, yVar);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void r(final a3.t tVar, final C14334c c14334c) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1009, new C13482q.a() { // from class: i3.o
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).N(aVarL1, tVar, c14334c);
            }
        });
    }

    @Override // t3.d.a
    public final void s(final int i10, final long j10, final long j11) {
        final InterfaceC14599b.a aVarI1 = I1();
        O1(aVarI1, 1006, new C13482q.a() { // from class: i3.t
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).t0(aVarI1, i10, j10, j11);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void t(final C14333b c14333b) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1007, new C13482q.a() { // from class: i3.g0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).h(aVarL1, c14333b);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void u(final int i10, final long j10) {
        final InterfaceC14599b.a aVarK1 = K1();
        O1(aVarK1, 1018, new C13482q.a() { // from class: i3.p0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).q(aVarK1, i10, j10);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void v(final Object obj, final long j10) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 26, new C13482q.a() { // from class: i3.q
            @Override // d3.C13482q.a
            public final void invoke(Object obj2) {
                ((InterfaceC14599b) obj2).u0(aVarL1, obj, j10);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void w(final Exception exc) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1029, new C13482q.a() { // from class: i3.j0
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).o(aVarL1, exc);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void x(final C14333b c14333b) {
        final InterfaceC14599b.a aVarK1 = K1();
        O1(aVarK1, 1020, new C13482q.a() { // from class: i3.n
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).t(aVarK1, c14333b);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void y(final a3.t tVar, final C14334c c14334c) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1017, new C13482q.a() { // from class: i3.k
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).c0(aVarL1, tVar, c14334c);
            }
        });
    }

    @Override // i3.InterfaceC14596a
    public final void z(final int i10, final long j10, final long j11) {
        final InterfaceC14599b.a aVarL1 = L1();
        O1(aVarL1, 1011, new C13482q.a() { // from class: i3.u
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((InterfaceC14599b) obj).Y(aVarL1, i10, j10, j11);
            }
        });
    }
}
