package s3;

import Ce.L;
import Ce.g0;
import a3.C5564d;
import a3.G;
import a3.H;
import a3.I;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import d3.C13466a;
import d3.P;
import h3.K;
import j3.F;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import s3.AbstractC16849A;
import s3.C16854a;
import s3.n;
import s3.y;

/* loaded from: classes.dex */
public class n extends AbstractC16849A implements I0.a {

    /* renamed from: j, reason: collision with root package name */
    private static final g0<Integer> f159942j = g0.b(new Comparator() { // from class: s3.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.v((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final Object f159943d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f159944e;

    /* renamed from: f, reason: collision with root package name */
    private final y.b f159945f;

    /* renamed from: g, reason: collision with root package name */
    private e f159946g;

    /* renamed from: h, reason: collision with root package name */
    private g f159947h;

    /* renamed from: i, reason: collision with root package name */
    private C5564d f159948i;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends i<b> implements Comparable<b> {

        /* renamed from: e, reason: collision with root package name */
        private final int f159949e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f159950f;

        /* renamed from: g, reason: collision with root package name */
        private final String f159951g;

        /* renamed from: h, reason: collision with root package name */
        private final e f159952h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f159953i;

        /* renamed from: j, reason: collision with root package name */
        private final int f159954j;

        /* renamed from: k, reason: collision with root package name */
        private final int f159955k;

        /* renamed from: l, reason: collision with root package name */
        private final int f159956l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f159957m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f159958n;

        /* renamed from: o, reason: collision with root package name */
        private final int f159959o;

        /* renamed from: p, reason: collision with root package name */
        private final int f159960p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f159961q;

        /* renamed from: r, reason: collision with root package name */
        private final int f159962r;

        /* renamed from: s, reason: collision with root package name */
        private final int f159963s;

        /* renamed from: t, reason: collision with root package name */
        private final int f159964t;

        /* renamed from: u, reason: collision with root package name */
        private final int f159965u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f159966v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f159967w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f159968x;

        private int o(int i10, boolean z10, int i11) {
            if (!I0.p(i10, this.f159952h.f159994A0)) {
                return 0;
            }
            if (!this.f159950f && !this.f159952h.f160004t0) {
                return 0;
            }
            e eVar = this.f159952h;
            if (eVar.f43703u.f43713a == 2 && !n.V(eVar, i10, this.f160052d)) {
                return 0;
            }
            if (!I0.p(i10, false) || !this.f159950f || this.f160052d.f43944j == -1) {
                return 1;
            }
            e eVar2 = this.f159952h;
            if (eVar2.f43680C || eVar2.f43679B) {
                return 1;
            }
            return ((!eVar2.f159996C0 && z10) || eVar2.f43703u.f43713a == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // s3.n.i
        public int a() {
            return this.f159949e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            g0 g0VarF = (this.f159950f && this.f159953i) ? n.f159942j : n.f159942j.f();
            Ce.B bG = Ce.B.k().h(this.f159953i, bVar.f159953i).g(Integer.valueOf(this.f159955k), Integer.valueOf(bVar.f159955k), g0.d().f()).d(this.f159954j, bVar.f159954j).d(this.f159956l, bVar.f159956l).h(this.f159961q, bVar.f159961q).h(this.f159958n, bVar.f159958n).g(Integer.valueOf(this.f159959o), Integer.valueOf(bVar.f159959o), g0.d().f()).d(this.f159960p, bVar.f159960p).h(this.f159950f, bVar.f159950f).g(Integer.valueOf(this.f159965u), Integer.valueOf(bVar.f159965u), g0.d().f());
            if (this.f159952h.f43679B) {
                bG = bG.g(Integer.valueOf(this.f159964t), Integer.valueOf(bVar.f159964t), n.f159942j.f());
            }
            Ce.B bG2 = bG.h(this.f159966v, bVar.f159966v).h(this.f159967w, bVar.f159967w).h(this.f159968x, bVar.f159968x).g(Integer.valueOf(this.f159962r), Integer.valueOf(bVar.f159962r), g0VarF).g(Integer.valueOf(this.f159963s), Integer.valueOf(bVar.f159963s), g0VarF);
            if (Objects.equals(this.f159951g, bVar.f159951g)) {
                bG2 = bG2.g(Integer.valueOf(this.f159964t), Integer.valueOf(bVar.f159964t), g0VarF);
            }
            return bG2.j();
        }

        @Override // s3.n.i
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f159952h.f160007w0 && ((i11 = this.f160052d.f43924E) == -1 || i11 != bVar.f160052d.f43924E)) {
                return false;
            }
            if (!this.f159957m && ((str = this.f160052d.f43949o) == null || !TextUtils.equals(str, bVar.f160052d.f43949o))) {
                return false;
            }
            e eVar = this.f159952h;
            if (!eVar.f160006v0 && ((i10 = this.f160052d.f43925F) == -1 || i10 != bVar.f160052d.f43925F)) {
                return false;
            }
            if (eVar.f160008x0) {
                return true;
            }
            return this.f159966v == bVar.f159966v && this.f159967w == bVar.f159967w;
        }

        public b(int i10, G g10, int i11, e eVar, int i12, boolean z10, Be.q<a3.t> qVar, int i13) {
            int i14;
            boolean z11;
            int i15;
            int iH;
            boolean z12;
            boolean z13;
            boolean z14;
            int iH2;
            boolean z15;
            super(i10, g10, i11);
            this.f159952h = eVar;
            if (eVar.f160009y0) {
                i14 = 24;
            } else {
                i14 = 16;
            }
            if (eVar.f160005u0 && (i13 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f159957m = z11;
            this.f159951g = n.U(this.f160052d.f43938d);
            this.f159953i = I0.p(i12, false);
            int i16 = 0;
            while (true) {
                int size = eVar.f43698p.size();
                i15 = a.e.API_PRIORITY_OTHER;
                if (i16 < size) {
                    iH = n.H(this.f160052d, eVar.f43698p.get(i16), false);
                    if (iH > 0) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    iH = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f159955k = i16;
            this.f159954j = iH;
            this.f159956l = n.L(this.f160052d.f43940f, eVar.f43699q);
            a3.t tVar = this.f160052d;
            int i17 = tVar.f43940f;
            if (i17 != 0 && (i17 & 1) == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f159958n = z12;
            if ((tVar.f43939e & 1) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f159961q = z13;
            this.f159968x = n.P(tVar);
            a3.t tVar2 = this.f160052d;
            int i18 = tVar2.f43924E;
            this.f159962r = i18;
            this.f159963s = tVar2.f43925F;
            int i19 = tVar2.f43944j;
            this.f159964t = i19;
            if ((i19 == -1 || i19 <= eVar.f43701s) && ((i18 == -1 || i18 <= eVar.f43700r) && qVar.apply(tVar2))) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f159950f = z14;
            String[] strArrL0 = P.l0();
            int i20 = 0;
            while (true) {
                if (i20 < strArrL0.length) {
                    iH2 = n.H(this.f160052d, strArrL0[i20], false);
                    if (iH2 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                } else {
                    iH2 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                }
            }
            this.f159959o = i20;
            this.f159960p = iH2;
            int i21 = 0;
            while (true) {
                if (i21 < eVar.f43702t.size()) {
                    String str = this.f160052d.f43949o;
                    if (str != null && str.equals(eVar.f43702t.get(i21))) {
                        i15 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f159965u = i15;
            if (I0.n(i12) == 128) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f159966v = z15;
            this.f159967w = I0.F(i12) == 64;
            this.f159949e = o(i12, z10, i14);
        }

        public static int e(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static L<b> m(int i10, G g10, e eVar, int[] iArr, boolean z10, Be.q<a3.t> qVar, int i11) {
            L.a aVarP = L.p();
            for (int i12 = 0; i12 < g10.f43633a; i12++) {
                aVarP.a(new b(i10, g10, i12, eVar, iArr[i12], z10, qVar, i11));
            }
            return aVarP.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends i<c> implements Comparable<c> {

        /* renamed from: e, reason: collision with root package name */
        private final int f159969e;

        /* renamed from: f, reason: collision with root package name */
        private final int f159970f;

        public static int e(List<c> list, List<c> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // s3.n.i
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean b(c cVar) {
            return false;
        }

        @Override // s3.n.i
        public int a() {
            return this.f159969e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f159970f, cVar.f159970f);
        }

        public c(int i10, G g10, int i11, e eVar, int i12) {
            super(i10, g10, i11);
            this.f159969e = I0.p(i12, eVar.f159994A0) ? 1 : 0;
            this.f159970f = this.f160052d.e();
        }

        public static L<c> m(int i10, G g10, e eVar, int[] iArr) {
            L.a aVarP = L.p();
            for (int i11 = 0; i11 < g10.f43633a; i11++) {
                aVarP.a(new c(i10, g10, i11, eVar, iArr[i11]));
            }
            return aVarP.k();
        }
    }

    public static final class e extends I {

        /* renamed from: G0, reason: collision with root package name */
        public static final e f159973G0;

        /* renamed from: H0, reason: collision with root package name */
        @Deprecated
        public static final e f159974H0;

        /* renamed from: I0, reason: collision with root package name */
        private static final String f159975I0;

        /* renamed from: J0, reason: collision with root package name */
        private static final String f159976J0;

        /* renamed from: K0, reason: collision with root package name */
        private static final String f159977K0;

        /* renamed from: L0, reason: collision with root package name */
        private static final String f159978L0;

        /* renamed from: M0, reason: collision with root package name */
        private static final String f159979M0;

        /* renamed from: N0, reason: collision with root package name */
        private static final String f159980N0;

        /* renamed from: O0, reason: collision with root package name */
        private static final String f159981O0;

        /* renamed from: P0, reason: collision with root package name */
        private static final String f159982P0;

        /* renamed from: Q0, reason: collision with root package name */
        private static final String f159983Q0;

        /* renamed from: R0, reason: collision with root package name */
        private static final String f159984R0;

        /* renamed from: S0, reason: collision with root package name */
        private static final String f159985S0;

        /* renamed from: T0, reason: collision with root package name */
        private static final String f159986T0;

        /* renamed from: U0, reason: collision with root package name */
        private static final String f159987U0;

        /* renamed from: V0, reason: collision with root package name */
        private static final String f159988V0;

        /* renamed from: W0, reason: collision with root package name */
        private static final String f159989W0;

        /* renamed from: X0, reason: collision with root package name */
        private static final String f159990X0;

        /* renamed from: Y0, reason: collision with root package name */
        private static final String f159991Y0;

        /* renamed from: Z0, reason: collision with root package name */
        private static final String f159992Z0;

        /* renamed from: a1, reason: collision with root package name */
        private static final String f159993a1;

        /* renamed from: A0, reason: collision with root package name */
        public final boolean f159994A0;

        /* renamed from: B0, reason: collision with root package name */
        public final boolean f159995B0;

        /* renamed from: C0, reason: collision with root package name */
        public final boolean f159996C0;

        /* renamed from: D0, reason: collision with root package name */
        public final boolean f159997D0;

        /* renamed from: E0, reason: collision with root package name */
        private final SparseArray<Map<p3.w, f>> f159998E0;

        /* renamed from: F0, reason: collision with root package name */
        private final SparseBooleanArray f159999F0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f160000p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f160001q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f160002r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f160003s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f160004t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f160005u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f160006v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f160007w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f160008x0;

        /* renamed from: y0, reason: collision with root package name */
        public final boolean f160009y0;

        /* renamed from: z0, reason: collision with root package name */
        public final boolean f160010z0;

        public static final class a extends I.c {

            /* renamed from: F, reason: collision with root package name */
            private boolean f160011F;

            /* renamed from: G, reason: collision with root package name */
            private boolean f160012G;

            /* renamed from: H, reason: collision with root package name */
            private boolean f160013H;

            /* renamed from: I, reason: collision with root package name */
            private boolean f160014I;

            /* renamed from: J, reason: collision with root package name */
            private boolean f160015J;

            /* renamed from: K, reason: collision with root package name */
            private boolean f160016K;

            /* renamed from: L, reason: collision with root package name */
            private boolean f160017L;

            /* renamed from: M, reason: collision with root package name */
            private boolean f160018M;

            /* renamed from: N, reason: collision with root package name */
            private boolean f160019N;

            /* renamed from: O, reason: collision with root package name */
            private boolean f160020O;

            /* renamed from: P, reason: collision with root package name */
            private boolean f160021P;

            /* renamed from: Q, reason: collision with root package name */
            private boolean f160022Q;

            /* renamed from: R, reason: collision with root package name */
            private boolean f160023R;

            /* renamed from: S, reason: collision with root package name */
            private boolean f160024S;

            /* renamed from: T, reason: collision with root package name */
            private boolean f160025T;

            /* renamed from: U, reason: collision with root package name */
            private final SparseArray<Map<p3.w, f>> f160026U;

            /* renamed from: V, reason: collision with root package name */
            private final SparseBooleanArray f160027V;

            private void k0() {
                this.f160011F = true;
                this.f160012G = false;
                this.f160013H = true;
                this.f160014I = false;
                this.f160015J = true;
                this.f160016K = false;
                this.f160017L = false;
                this.f160018M = false;
                this.f160019N = false;
                this.f160020O = true;
                this.f160021P = true;
                this.f160022Q = true;
                this.f160023R = false;
                this.f160024S = true;
                this.f160025T = false;
            }

            public a() {
                this.f160026U = new SparseArray<>();
                this.f160027V = new SparseBooleanArray();
                k0();
            }

            private static SparseArray<Map<p3.w, f>> j0(SparseArray<Map<p3.w, f>> sparseArray) {
                SparseArray<Map<p3.w, f>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            @Override // a3.I.c
            /* renamed from: h0, reason: merged with bridge method [inline-methods] */
            public e F() {
                return new e(this);
            }

            public a r0(int i10, boolean z10) {
                if (this.f160027V.get(i10) == z10) {
                    return this;
                }
                if (z10) {
                    this.f160027V.put(i10, true);
                    return this;
                }
                this.f160027V.delete(i10);
                return this;
            }

            @Override // a3.I.c
            /* renamed from: i0, reason: merged with bridge method [inline-methods] */
            public a G(int i10) {
                super.G(i10);
                return this;
            }

            protected a l0(I i10) {
                super.J(i10);
                return this;
            }

            @Override // a3.I.c
            /* renamed from: m0, reason: merged with bridge method [inline-methods] */
            public a K(int i10) {
                super.K(i10);
                return this;
            }

            @Override // a3.I.c
            /* renamed from: n0, reason: merged with bridge method [inline-methods] */
            public a L(H h10) {
                super.L(h10);
                return this;
            }

            @Override // a3.I.c
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a M(String str) {
                super.M(str);
                return this;
            }

            @Override // a3.I.c
            /* renamed from: p0, reason: merged with bridge method [inline-methods] */
            public a N(String... strArr) {
                super.N(strArr);
                return this;
            }

            @Override // a3.I.c
            /* renamed from: q0, reason: merged with bridge method [inline-methods] */
            public a O(int i10) {
                super.O(i10);
                return this;
            }

            @Override // a3.I.c
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public a P(int i10, boolean z10) {
                super.P(i10, z10);
                return this;
            }

            private a(e eVar) {
                super(eVar);
                this.f160011F = eVar.f160000p0;
                this.f160012G = eVar.f160001q0;
                this.f160013H = eVar.f160002r0;
                this.f160014I = eVar.f160003s0;
                this.f160015J = eVar.f160004t0;
                this.f160016K = eVar.f160005u0;
                this.f160017L = eVar.f160006v0;
                this.f160018M = eVar.f160007w0;
                this.f160019N = eVar.f160008x0;
                this.f160020O = eVar.f160009y0;
                this.f160021P = eVar.f160010z0;
                this.f160022Q = eVar.f159994A0;
                this.f160023R = eVar.f159995B0;
                this.f160024S = eVar.f159996C0;
                this.f160025T = eVar.f159997D0;
                this.f160026U = j0(eVar.f159998E0);
                this.f160027V = eVar.f159999F0.clone();
            }
        }

        @Override // a3.I
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f160000p0 == eVar.f160000p0 && this.f160001q0 == eVar.f160001q0 && this.f160002r0 == eVar.f160002r0 && this.f160003s0 == eVar.f160003s0 && this.f160004t0 == eVar.f160004t0 && this.f160005u0 == eVar.f160005u0 && this.f160006v0 == eVar.f160006v0 && this.f160007w0 == eVar.f160007w0 && this.f160008x0 == eVar.f160008x0 && this.f160009y0 == eVar.f160009y0 && this.f160010z0 == eVar.f160010z0 && this.f159994A0 == eVar.f159994A0 && this.f159995B0 == eVar.f159995B0 && this.f159996C0 == eVar.f159996C0 && this.f159997D0 == eVar.f159997D0 && d(this.f159999F0, eVar.f159999F0) && e(this.f159998E0, eVar.f159998E0)) {
                    return true;
                }
            }
            return false;
        }

        static {
            e eVarF = new a().F();
            f159973G0 = eVarF;
            f159974H0 = eVarF;
            f159975I0 = P.y0(1000);
            f159976J0 = P.y0(1001);
            f159977K0 = P.y0(1002);
            f159978L0 = P.y0(1003);
            f159979M0 = P.y0(1004);
            f159980N0 = P.y0(1005);
            f159981O0 = P.y0(1006);
            f159982P0 = P.y0(1007);
            f159983Q0 = P.y0(1008);
            f159984R0 = P.y0(1009);
            f159985S0 = P.y0(1010);
            f159986T0 = P.y0(1011);
            f159987U0 = P.y0(1012);
            f159988V0 = P.y0(1013);
            f159989W0 = P.y0(1014);
            f159990X0 = P.y0(1015);
            f159991Y0 = P.y0(1016);
            f159992Z0 = P.y0(1017);
            f159993a1 = P.y0(1018);
        }

        private e(a aVar) {
            super(aVar);
            this.f160000p0 = aVar.f160011F;
            this.f160001q0 = aVar.f160012G;
            this.f160002r0 = aVar.f160013H;
            this.f160003s0 = aVar.f160014I;
            this.f160004t0 = aVar.f160015J;
            this.f160005u0 = aVar.f160016K;
            this.f160006v0 = aVar.f160017L;
            this.f160007w0 = aVar.f160018M;
            this.f160008x0 = aVar.f160019N;
            this.f160009y0 = aVar.f160020O;
            this.f160010z0 = aVar.f160021P;
            this.f159994A0 = aVar.f160022Q;
            this.f159995B0 = aVar.f160023R;
            this.f159996C0 = aVar.f160024S;
            this.f159997D0 = aVar.f160025T;
            this.f159998E0 = aVar.f160026U;
            this.f159999F0 = aVar.f160027V;
        }

        @Override // a3.I
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        public boolean h(int i10) {
            return this.f159999F0.get(i10);
        }

        @Deprecated
        public f i(int i10, p3.w wVar) {
            Map<p3.w, f> map = this.f159998E0.get(i10);
            if (map != null) {
                return map.get(wVar);
            }
            return null;
        }

        @Deprecated
        public boolean j(int i10, p3.w wVar) {
            Map<p3.w, f> map = this.f159998E0.get(i10);
            return map != null && map.containsKey(wVar);
        }

        private static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(SparseArray<Map<p3.w, f>> sparseArray, SparseArray<Map<p3.w, f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !f(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean f(Map<p3.w, f> map, Map<p3.w, f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<p3.w, f> entry : map.entrySet()) {
                p3.w key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        @Override // a3.I
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f160000p0 ? 1 : 0)) * 31) + (this.f160001q0 ? 1 : 0)) * 31) + (this.f160002r0 ? 1 : 0)) * 31) + (this.f160003s0 ? 1 : 0)) * 31) + (this.f160004t0 ? 1 : 0)) * 31) + (this.f160005u0 ? 1 : 0)) * 31) + (this.f160006v0 ? 1 : 0)) * 31) + (this.f160007w0 ? 1 : 0)) * 31) + (this.f160008x0 ? 1 : 0)) * 31) + (this.f160009y0 ? 1 : 0)) * 31) + (this.f160010z0 ? 1 : 0)) * 31) + (this.f159994A0 ? 1 : 0)) * 31) + (this.f159995B0 ? 1 : 0)) * 31) + (this.f159996C0 ? 1 : 0)) * 31) + (this.f159997D0 ? 1 : 0);
        }
    }

    public static final class f {

        /* renamed from: d, reason: collision with root package name */
        private static final String f160028d = P.y0(0);

        /* renamed from: e, reason: collision with root package name */
        private static final String f160029e = P.y0(1);

        /* renamed from: f, reason: collision with root package name */
        private static final String f160030f = P.y0(2);

        /* renamed from: a, reason: collision with root package name */
        public final int f160031a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f160032b;

        /* renamed from: c, reason: collision with root package name */
        public final int f160033c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f160031a == fVar.f160031a && Arrays.equals(this.f160032b, fVar.f160032b) && this.f160033c == fVar.f160033c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f160031a * 31) + Arrays.hashCode(this.f160032b)) * 31) + this.f160033c;
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f160034a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f160035b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f160036c;

        /* renamed from: d, reason: collision with root package name */
        private final Spatializer$OnSpatializerStateChangedListener f160037d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f160038a;

            a(n nVar) {
                this.f160038a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f160038a.S();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f160038a.S();
            }
        }

        public boolean a(C5564d c5564d, a3.t tVar) throws IllegalArgumentException {
            int i10;
            if (Objects.equals(tVar.f43949o, "audio/eac3-joc")) {
                i10 = tVar.f43924E;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(tVar.f43949o, "audio/iamf")) {
                i10 = tVar.f43924E;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(tVar.f43949o, "audio/ac4")) {
                i10 = tVar.f43924E;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = tVar.f43924E;
            }
            int iL = P.L(i10);
            if (iL == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iL);
            int i11 = tVar.f43925F;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return o.a(C13466a.e(this.f160034a)).canBeSpatialized(c5564d.a().f43823a, channelMask.build());
        }

        public boolean b() {
            return o.a(C13466a.e(this.f160034a)).isAvailable();
        }

        public boolean c() {
            return o.a(C13466a.e(this.f160034a)).isEnabled();
        }

        public boolean d() {
            return this.f160035b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f160034a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f160037d) == null || this.f160036c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f160036c.removeCallbacksAndMessages(null);
        }

        public g(Context context, n nVar) {
            AudioManager audioManagerC;
            if (context == null) {
                audioManagerC = null;
            } else {
                audioManagerC = b3.m.c(context);
            }
            if (audioManagerC != null && !P.G0((Context) C13466a.e(context))) {
                Spatializer spatializer = audioManagerC.getSpatializer();
                this.f160034a = spatializer;
                this.f160035b = spatializer.getImmersiveAudioLevel() != 0;
                a aVar = new a(nVar);
                this.f160037d = aVar;
                Handler handler = new Handler((Looper) C13466a.i(Looper.myLooper()));
                this.f160036c = handler;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new F(handler), aVar);
                return;
            }
            this.f160034a = null;
            this.f160035b = false;
            this.f160036c = null;
            this.f160037d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class h extends i<h> implements Comparable<h> {

        /* renamed from: e, reason: collision with root package name */
        private final int f160040e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f160041f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f160042g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f160043h;

        /* renamed from: i, reason: collision with root package name */
        private final int f160044i;

        /* renamed from: j, reason: collision with root package name */
        private final int f160045j;

        /* renamed from: k, reason: collision with root package name */
        private final int f160046k;

        /* renamed from: l, reason: collision with root package name */
        private final int f160047l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f160048m;

        public static int e(List<h> list, List<h> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        @Override // s3.n.i
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public boolean b(h hVar) {
            return false;
        }

        @Override // s3.n.i
        public int a() {
            return this.f160040e;
        }

        public h(int i10, G g10, int i11, e eVar, int i12, String str, String str2) {
            boolean z10;
            boolean z11;
            L<String> lY;
            int iH;
            int i13;
            boolean z12;
            boolean z13;
            boolean z14;
            super(i10, g10, i11);
            int i14 = 0;
            this.f160041f = I0.p(i12, false);
            int i15 = this.f160052d.f43939e & (~eVar.f43707y);
            if ((i15 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f160042g = z10;
            if ((i15 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f160043h = z11;
            if (str2 != null) {
                lY = L.y(str2);
            } else if (eVar.f43704v.isEmpty()) {
                lY = L.y("");
            } else {
                lY = eVar.f43704v;
            }
            int i16 = 0;
            while (true) {
                if (i16 < lY.size()) {
                    iH = n.H(this.f160052d, lY.get(i16), eVar.f43708z);
                    if (iH > 0) {
                        break;
                    } else {
                        i16++;
                    }
                } else {
                    i16 = a.e.API_PRIORITY_OTHER;
                    iH = 0;
                    break;
                }
            }
            this.f160044i = i16;
            this.f160045j = iH;
            if (str2 != null) {
                i13 = 1088;
            } else {
                i13 = eVar.f43705w;
            }
            int iL = n.L(this.f160052d.f43940f, i13);
            this.f160046k = iL;
            if ((1088 & this.f160052d.f43940f) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f160048m = z12;
            if (n.U(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int iH2 = n.H(this.f160052d, str, z13);
            this.f160047l = iH2;
            if (iH <= 0 && ((!eVar.f43704v.isEmpty() || iL <= 0) && !this.f160042g && (!this.f160043h || iH2 <= 0))) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (I0.p(i12, eVar.f159994A0) && z14) {
                i14 = 1;
            }
            this.f160040e = i14;
        }

        public static L<h> m(int i10, G g10, e eVar, int[] iArr, String str, String str2) {
            L.a aVarP = L.p();
            for (int i11 = 0; i11 < g10.f43633a; i11++) {
                aVarP.a(new h(i10, g10, i11, eVar, iArr[i11], str, str2));
            }
            return aVarP.k();
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            g0 g0VarF;
            Ce.B bH = Ce.B.k().h(this.f160041f, hVar.f160041f).g(Integer.valueOf(this.f160044i), Integer.valueOf(hVar.f160044i), g0.d().f()).d(this.f160045j, hVar.f160045j).d(this.f160046k, hVar.f160046k).h(this.f160042g, hVar.f160042g);
            Boolean boolValueOf = Boolean.valueOf(this.f160043h);
            Boolean boolValueOf2 = Boolean.valueOf(hVar.f160043h);
            if (this.f160045j == 0) {
                g0VarF = g0.d();
            } else {
                g0VarF = g0.d().f();
            }
            Ce.B bD = bH.g(boolValueOf, boolValueOf2, g0VarF).d(this.f160047l, hVar.f160047l);
            if (this.f160046k == 0) {
                bD = bD.i(this.f160048m, hVar.f160048m);
            }
            return bD.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends i<j> {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f160053e;

        /* renamed from: f, reason: collision with root package name */
        private final e f160054f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f160055g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f160056h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f160057i;

        /* renamed from: j, reason: collision with root package name */
        private final int f160058j;

        /* renamed from: k, reason: collision with root package name */
        private final int f160059k;

        /* renamed from: l, reason: collision with root package name */
        private final int f160060l;

        /* renamed from: m, reason: collision with root package name */
        private final int f160061m;

        /* renamed from: n, reason: collision with root package name */
        private final int f160062n;

        /* renamed from: o, reason: collision with root package name */
        private final int f160063o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f160064p;

        /* renamed from: q, reason: collision with root package name */
        private final int f160065q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f160066r;

        /* renamed from: s, reason: collision with root package name */
        private final int f160067s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f160068t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f160069u;

        /* renamed from: v, reason: collision with root package name */
        private final int f160070v;

        /* JADX INFO: Access modifiers changed from: private */
        public static int o(j jVar, j jVar2) {
            g0 g0VarF = (jVar.f160053e && jVar.f160056h) ? n.f159942j : n.f159942j.f();
            Ce.B bK = Ce.B.k();
            if (jVar.f160054f.f43679B) {
                bK = bK.g(Integer.valueOf(jVar.f160058j), Integer.valueOf(jVar2.f160058j), n.f159942j.f());
            }
            return bK.g(Integer.valueOf(jVar.f160059k), Integer.valueOf(jVar2.f160059k), g0VarF).g(Integer.valueOf(jVar.f160058j), Integer.valueOf(jVar2.f160058j), g0VarF).j();
        }

        public static L<j> t(int i10, G g10, e eVar, int[] iArr, String str, int i11, Point point) {
            int I10 = n.I(g10, point != null ? point.x : eVar.f43691i, point != null ? point.y : eVar.f43692j, eVar.f43694l);
            L.a aVarP = L.p();
            for (int i12 = 0; i12 < g10.f43633a; i12++) {
                int iE = g10.a(i12).e();
                aVarP.a(new j(i10, g10, i12, eVar, iArr[i12], str, i11, I10 == Integer.MAX_VALUE || (iE != -1 && iE <= I10)));
            }
            return aVarP.k();
        }

        private int u(int i10, int i11) {
            if ((this.f160052d.f43940f & 16384) != 0 || !I0.p(i10, this.f160054f.f159994A0)) {
                return 0;
            }
            if (!this.f160053e && !this.f160054f.f160000p0) {
                return 0;
            }
            if (!I0.p(i10, false) || !this.f160055g || !this.f160053e || this.f160052d.f43944j == -1) {
                return 1;
            }
            e eVar = this.f160054f;
            return (eVar.f43680C || eVar.f43679B || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // s3.n.i
        public int a() {
            return this.f160067s;
        }

        @Override // s3.n.i
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            if (!this.f160066r && !Objects.equals(this.f160052d.f43949o, jVar.f160052d.f43949o)) {
                return false;
            }
            if (this.f160054f.f160003s0) {
                return true;
            }
            return this.f160068t == jVar.f160068t && this.f160069u == jVar.f160069u;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public j(int r5, a3.G r6, int r7, s3.n.e r8, int r9, java.lang.String r10, int r11, boolean r12) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: s3.n.j.<init>(int, a3.G, int, s3.n$e, int, java.lang.String, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int m(j jVar, j jVar2) {
            Ce.B bH = Ce.B.k().h(jVar.f160056h, jVar2.f160056h).g(Integer.valueOf(jVar.f160061m), Integer.valueOf(jVar2.f160061m), g0.d().f()).d(jVar.f160062n, jVar2.f160062n).d(jVar.f160063o, jVar2.f160063o).h(jVar.f160064p, jVar2.f160064p).d(jVar.f160065q, jVar2.f160065q).h(jVar.f160057i, jVar2.f160057i).h(jVar.f160053e, jVar2.f160053e).h(jVar.f160055g, jVar2.f160055g).g(Integer.valueOf(jVar.f160060l), Integer.valueOf(jVar2.f160060l), g0.d().f()).h(jVar.f160068t, jVar2.f160068t).h(jVar.f160069u, jVar2.f160069u);
            if (jVar.f160068t && jVar.f160069u) {
                bH = bH.d(jVar.f160070v, jVar2.f160070v);
            }
            return bH.j();
        }

        public static int p(List<j> list, List<j> list2) {
            return Ce.B.k().g((j) Collections.max(list, new Comparator() { // from class: s3.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.m((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: s3.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.m((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: s3.w
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.m((n.j) obj, (n.j) obj2);
                }
            }).d(list.size(), list2.size()).g((j) Collections.max(list, new Comparator() { // from class: s3.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.o((n.j) obj, (n.j) obj2);
                }
            }), (j) Collections.max(list2, new Comparator() { // from class: s3.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.o((n.j) obj, (n.j) obj2);
                }
            }), new Comparator() { // from class: s3.x
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return n.j.o((n.j) obj, (n.j) obj2);
                }
            }).j();
        }
    }

    public n(Context context) {
        this(context, new C16854a.b());
    }

    private static void G(p3.w wVar, I i10, Map<Integer, H> map) {
        H h10;
        for (int i11 = 0; i11 < wVar.f155475a; i11++) {
            H h11 = i10.f43681D.get(wVar.b(i11));
            if (h11 != null && ((h10 = map.get(Integer.valueOf(h11.a()))) == null || (h10.f43641b.isEmpty() && !h11.f43641b.isEmpty()))) {
                map.put(Integer.valueOf(h11.a()), h11);
            }
        }
    }

    private static String K(Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return P.a0(locale);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int M(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    private static void Q(e eVar, AbstractC16849A.a aVar, int[][][] iArr, K[] kArr, y[] yVarArr) {
        int i10 = -1;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            y yVar = yVarArr[i12];
            if (iE != 1 && yVar != null) {
                return;
            }
            if (iE == 1 && yVar != null && yVar.length() == 1) {
                if (V(eVar, iArr[i12][aVar.f(i12).d(yVar.g())][yVar.c(0)], yVar.j())) {
                    i11++;
                    i10 = i12;
                }
            }
        }
        if (i11 == 1) {
            int i13 = eVar.f43703u.f43714b ? 1 : 2;
            K k10 = kArr[i10];
            if (k10 != null && k10.f134198b) {
                z10 = true;
            }
            kArr[i10] = new K(i13, z10);
        }
    }

    private static void R(AbstractC16849A.a aVar, int[][][] iArr, K[] kArr, y[] yVarArr) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.d(); i12++) {
            int iE = aVar.e(i12);
            y yVar = yVarArr[i12];
            if ((iE == 1 || iE == 2) && yVar != null && W(iArr[i12], aVar.f(i12), yVar)) {
                if (iE == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (z10 && ((i11 == -1 || i10 == -1) ? false : true)) {
            K k10 = new K(0, true);
            kArr[i11] = k10;
            kArr[i10] = k10;
        }
    }

    private static boolean W(int[][] iArr, p3.w wVar, y yVar) {
        if (yVar == null) {
            return false;
        }
        int iD = wVar.d(yVar.g());
        for (int i10 = 0; i10 < yVar.length(); i10++) {
            if (I0.t(iArr[iD][yVar.c(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    protected Pair<y.a, Integer> Y(AbstractC16849A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) throws ExoPlaybackException {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f155475a > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return c0(1, aVar, iArr, new i.a() { // from class: s3.j
            @Override // s3.n.i.a
            public final List a(int i11, G g10, int[] iArr3) {
                return n.r(this.f159935a, eVar, z10, iArr2, i11, g10, iArr3);
            }
        }, new Comparator() { // from class: s3.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.e((List) obj, (List) obj2);
            }
        });
    }

    @Override // s3.AbstractC16852D
    public I0.a d() {
        return this;
    }

    @Override // s3.AbstractC16852D
    public boolean h() {
        return true;
    }

    private static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f159971a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f159972b;

        public d(a3.t tVar, int i10) {
            this.f159971a = (tVar.f43939e & 1) != 0;
            this.f159972b = I0.p(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Ce.B.k().h(this.f159972b, dVar.f159972b).h(this.f159971a, dVar.f159971a).j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class i<T extends i<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f160049a;

        /* renamed from: b, reason: collision with root package name */
        public final G f160050b;

        /* renamed from: c, reason: collision with root package name */
        public final int f160051c;

        /* renamed from: d, reason: collision with root package name */
        public final a3.t f160052d;

        public interface a<T extends i<T>> {
            List<T> a(int i10, G g10, int[] iArr);
        }

        public abstract int a();

        public abstract boolean b(T t10);

        public i(int i10, G g10, int i11) {
            this.f160049a = i10;
            this.f160050b = g10;
            this.f160051c = i11;
            this.f160052d = g10.a(i11);
        }
    }

    public n(Context context, y.b bVar) {
        this(context, e.f159973G0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int L(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : a.e.API_PRIORITY_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N(a3.t tVar, e eVar) {
        int i10;
        g gVar;
        g gVar2;
        if (!eVar.f160010z0 || (i10 = tVar.f43924E) == -1 || i10 <= 2) {
            return true;
        }
        if (!O(tVar) || (P.f127086a >= 32 && (gVar2 = this.f159947h) != null && gVar2.d())) {
            return P.f127086a >= 32 && (gVar = this.f159947h) != null && gVar.d() && this.f159947h.b() && this.f159947h.c() && this.f159947h.a(this.f159948i, tVar);
        }
        return true;
    }

    private static boolean O(a3.t tVar) {
        String str = tVar.f43949o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean P(a3.t tVar) {
        String str = tVar.f43949o;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        boolean z10;
        g gVar;
        synchronized (this.f159943d) {
            try {
                z10 = this.f159946g.f160010z0 && P.f127086a >= 32 && (gVar = this.f159947h) != null && gVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            f();
        }
    }

    private void T(H0 h02) {
        boolean z10;
        synchronized (this.f159943d) {
            z10 = this.f159946g.f159997D0;
        }
        if (z10) {
            g(h02);
        }
    }

    private <T extends i<T>> Pair<y.a, Integer> c0(int i10, AbstractC16849A.a aVar, int[][][] iArr, i.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessY;
        AbstractC16849A.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                p3.w wVarF = aVar3.f(i12);
                for (int i13 = 0; i13 < wVarF.f155475a; i13++) {
                    G gB = wVarF.b(i13);
                    List<T> listA = aVar2.a(i12, gB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[gB.f43633a];
                    int i14 = 0;
                    while (i14 < gB.f43633a) {
                        T t10 = listA.get(i14);
                        int iA = t10.a();
                        if (zArr[i14] || iA == 0) {
                            i11 = iD;
                        } else {
                            if (iA == 1) {
                                randomAccessY = L.y(t10);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < gB.f43633a) {
                                    T t11 = listA.get(i15);
                                    int i16 = iD;
                                    if (t11.a() == 2 && t10.b(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    iD = i16;
                                }
                                randomAccessY = arrayList2;
                            }
                            i11 = iD;
                            arrayList.add(randomAccessY);
                        }
                        i14++;
                        iD = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            iD = iD;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((i) list.get(i17)).f160051c;
        }
        i iVar = (i) list.get(0);
        return Pair.create(new y.a(iVar.f160050b, iArr2), Integer.valueOf(iVar.f160049a));
    }

    @Override // s3.AbstractC16852D
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f159943d) {
            eVar = this.f159946g;
        }
        return eVar;
    }

    protected Pair<y.a, Integer> Z(AbstractC16849A.a aVar, int[][][] iArr, final e eVar) throws ExoPlaybackException {
        if (eVar.f43703u.f43713a == 2) {
            return null;
        }
        return c0(4, aVar, iArr, new i.a() { // from class: s3.f
            @Override // s3.n.i.a
            public final List a(int i10, G g10, int[] iArr2) {
                return n.c.m(i10, g10, eVar, iArr2);
            }
        }, new Comparator() { // from class: s3.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.c.e((List) obj, (List) obj2);
            }
        });
    }

    protected y.a a0(int i10, p3.w wVar, int[][] iArr, e eVar) throws ExoPlaybackException {
        if (eVar.f43703u.f43713a == 2) {
            return null;
        }
        int i11 = 0;
        G g10 = null;
        d dVar = null;
        for (int i12 = 0; i12 < wVar.f155475a; i12++) {
            G gB = wVar.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < gB.f43633a; i13++) {
                if (I0.p(iArr2[i13], eVar.f159994A0)) {
                    d dVar2 = new d(gB.a(i13), iArr2[i13]);
                    if (dVar == null || dVar2.compareTo(dVar) > 0) {
                        g10 = gB;
                        i11 = i13;
                        dVar = dVar2;
                    }
                }
            }
        }
        if (g10 == null) {
            return null;
        }
        return new y.a(g10, i11);
    }

    protected Pair<y.a, Integer> b0(AbstractC16849A.a aVar, int[][][] iArr, final e eVar, final String str) throws ExoPlaybackException {
        if (eVar.f43703u.f43713a == 2) {
            return null;
        }
        final String strK = eVar.f43706x ? K(this.f159944e) : null;
        return c0(3, aVar, iArr, new i.a() { // from class: s3.l
            @Override // s3.n.i.a
            public final List a(int i10, G g10, int[] iArr2) {
                return n.h.m(i10, g10, eVar, iArr2, str, strK);
            }
        }, new Comparator() { // from class: s3.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.h.e((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<y.a, Integer> d0(AbstractC16849A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) throws ExoPlaybackException {
        Context context;
        final Point pointR = null;
        if (eVar.f43703u.f43713a == 2) {
            return null;
        }
        if (eVar.f43693k && (context = this.f159944e) != null) {
            pointR = P.R(context);
        }
        return c0(2, aVar, iArr, new i.a() { // from class: s3.h
            @Override // s3.n.i.a
            public final List a(int i10, G g10, int[] iArr3) {
                return n.j.t(i10, g10, eVar, iArr3, str, iArr2[i10], pointR);
            }
        }, new Comparator() { // from class: s3.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.j.p((List) obj, (List) obj2);
            }
        });
    }

    @Override // s3.AbstractC16852D
    public void j() {
        g gVar;
        if (P.f127086a >= 32 && (gVar = this.f159947h) != null) {
            gVar.e();
        }
        super.j();
    }

    @Override // s3.AbstractC16852D
    public void l(C5564d c5564d) {
        if (this.f159948i.equals(c5564d)) {
            return;
        }
        this.f159948i = c5564d;
        S();
    }

    @Override // s3.AbstractC16852D
    public void m(I i10) {
        if (i10 instanceof e) {
            e0((e) i10);
        }
        e0(new e.a().l0(i10).F());
    }

    @Override // s3.AbstractC16849A
    protected final Pair<K[], y[]> q(AbstractC16849A.a aVar, int[][][] iArr, int[] iArr2, r.b bVar, a3.F f10) throws ExoPlaybackException {
        e eVar;
        synchronized (this.f159943d) {
            eVar = this.f159946g;
        }
        if (eVar.f160010z0 && P.f127086a >= 32 && this.f159947h == null) {
            this.f159947h = new g(this.f159944e, this);
        }
        int iD = aVar.d();
        y.a[] aVarArrX = X(aVar, iArr, iArr2, eVar);
        F(aVar, eVar, aVarArrX);
        E(aVar, eVar, aVarArrX);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.h(i10) || eVar.f43682E.contains(Integer.valueOf(iE))) {
                aVarArrX[i10] = null;
            }
        }
        y[] yVarArrA = this.f159945f.a(aVarArrX, b(), bVar, f10);
        K[] kArr = new K[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            kArr[i11] = (eVar.h(i11) || eVar.f43682E.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && yVarArrA[i11] == null)) ? null : K.f134196c;
        }
        if (eVar.f159995B0) {
            R(aVar, iArr, kArr, yVarArrA);
        }
        if (eVar.f43703u.f43713a != 0) {
            Q(eVar, aVar, iArr, kArr, yVarArrA);
        }
        return Pair.create(kArr, yVarArrA);
    }

    public n(Context context, I i10, y.b bVar) {
        this(i10, bVar, context);
    }

    private static void E(AbstractC16849A.a aVar, e eVar, y.a[] aVarArr) {
        y.a aVar2;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            p3.w wVarF = aVar.f(i10);
            if (eVar.j(i10, wVarF)) {
                f fVarI = eVar.i(i10, wVarF);
                if (fVarI != null && fVarI.f160032b.length != 0) {
                    aVar2 = new y.a(wVarF.b(fVarI.f160031a), fVarI.f160032b, fVarI.f160033c);
                } else {
                    aVar2 = null;
                }
                aVarArr[i10] = aVar2;
            }
        }
    }

    private static void F(AbstractC16849A.a aVar, I i10, y.a[] aVarArr) {
        y.a aVar2;
        int iD = aVar.d();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < iD; i11++) {
            G(aVar.f(i11), i10, map);
        }
        G(aVar.h(), i10, map);
        for (int i12 = 0; i12 < iD; i12++) {
            H h10 = (H) map.get(Integer.valueOf(aVar.e(i12)));
            if (h10 != null) {
                if (!h10.f43641b.isEmpty() && aVar.f(i12).d(h10.f43640a) != -1) {
                    aVar2 = new y.a(h10.f43640a, He.f.l(h10.f43641b));
                } else {
                    aVar2 = null;
                }
                aVarArr[i12] = aVar2;
            }
        }
    }

    protected static int H(a3.t tVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(tVar.f43938d)) {
            return 4;
        }
        String strU = U(str);
        String strU2 = U(tVar.f43938d);
        if (strU2 != null && strU != null) {
            if (!strU2.startsWith(strU) && !strU.startsWith(strU2)) {
                if (!P.d1(strU2, "-")[0].equals(P.d1(strU, "-")[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || strU2 != null) {
            return 0;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(G g10, int i10, int i11, boolean z10) {
        int i12;
        int i13 = a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < g10.f43633a; i14++) {
                a3.t tVarA = g10.a(i14);
                int i15 = tVarA.f43956v;
                if (i15 > 0 && (i12 = tVarA.f43957w) > 0) {
                    Point pointC = C16851C.c(z10, i10, i11, i15, i12);
                    int i16 = tVarA.f43956v;
                    int i17 = tVarA.f43957w;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (pointC.x * 0.98f)) && i17 >= ((int) (pointC.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    protected static String U(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "und")) {
            return str;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean V(e eVar, int i10, a3.t tVar) {
        boolean z10;
        boolean z11;
        if (I0.z(i10) == 0) {
            return false;
        }
        if (eVar.f43703u.f43715c && (I0.z(i10) & RecyclerView.m.FLAG_MOVED) == 0) {
            return false;
        }
        if (eVar.f43703u.f43714b) {
            if (tVar.f43927H == 0 && tVar.f43928I == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if ((I0.z(i10) & 1024) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    private void e0(e eVar) {
        boolean zEquals;
        C13466a.e(eVar);
        synchronized (this.f159943d) {
            zEquals = this.f159946g.equals(eVar);
            this.f159946g = eVar;
        }
        if (!zEquals) {
            if (eVar.f160010z0 && this.f159944e == null) {
                d3.r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            f();
        }
    }

    public static /* synthetic */ List r(final n nVar, final e eVar, boolean z10, int[] iArr, int i10, G g10, int[] iArr2) {
        nVar.getClass();
        return b.m(i10, g10, eVar, iArr2, z10, new Be.q() { // from class: s3.d
            @Override // Be.q
            public final boolean apply(Object obj) {
                return this.f159928a.N((a3.t) obj, eVar);
            }
        }, iArr[i10]);
    }

    public static /* synthetic */ int v(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            if (num2.intValue() != -1) {
                return -1;
            }
            return 0;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    protected y.a[] X(AbstractC16849A.a aVar, int[][][] iArr, int[] iArr2, e eVar) throws ExoPlaybackException {
        String str;
        int iD = aVar.d();
        y.a[] aVarArr = new y.a[iD];
        Pair<y.a, Integer> pairY = Y(aVar, iArr, iArr2, eVar);
        if (pairY != null) {
            aVarArr[((Integer) pairY.second).intValue()] = (y.a) pairY.first;
        }
        Pair<y.a, Integer> pairZ = null;
        if (pairY == null) {
            str = null;
        } else {
            Object obj = pairY.first;
            str = ((y.a) obj).f160071a.a(((y.a) obj).f160072b[0]).f43938d;
        }
        Pair<y.a, Integer> pairD0 = d0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        if (eVar.f43678A || pairD0 == null) {
            pairZ = Z(aVar, iArr, eVar);
        }
        if (pairZ != null) {
            aVarArr[((Integer) pairZ.second).intValue()] = (y.a) pairZ.first;
        } else if (pairD0 != null) {
            aVarArr[((Integer) pairD0.second).intValue()] = (y.a) pairD0.first;
        }
        Pair<y.a, Integer> pairB0 = b0(aVar, iArr, eVar, str2);
        if (pairB0 != null) {
            aVarArr[((Integer) pairB0.second).intValue()] = (y.a) pairB0.first;
        }
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (iE != 2 && iE != 1 && iE != 3 && iE != 4) {
                aVarArr[i10] = a0(iE, aVar.f(i10), iArr[i10], eVar);
            }
        }
        return aVarArr;
    }

    @Override // androidx.media3.exoplayer.I0.a
    public void a(H0 h02) {
        T(h02);
    }

    private n(I i10, y.b bVar, Context context) {
        this.f159943d = new Object();
        this.f159944e = context != null ? context.getApplicationContext() : null;
        this.f159945f = bVar;
        if (i10 instanceof e) {
            this.f159946g = (e) i10;
        } else {
            this.f159946g = e.f159973G0.a().l0(i10).F();
        }
        this.f159948i = C5564d.f43811g;
        if (this.f159946g.f160010z0 && context == null) {
            d3.r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
