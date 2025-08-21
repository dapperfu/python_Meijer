package s3;

import Ee.L;
import Ee.g0;
import a3.C5647d;
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
import d3.C13599a;
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
import s3.AbstractC16995A;
import s3.C17000a;
import s3.n;
import s3.y;

/* loaded from: classes.dex */
public class n extends AbstractC16995A implements I0.a {

    /* renamed from: j, reason: collision with root package name */
    private static final g0<Integer> f159805j = g0.b(new Comparator() { // from class: s3.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return n.v((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final Object f159806d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f159807e;

    /* renamed from: f, reason: collision with root package name */
    private final y.b f159808f;

    /* renamed from: g, reason: collision with root package name */
    private e f159809g;

    /* renamed from: h, reason: collision with root package name */
    private g f159810h;

    /* renamed from: i, reason: collision with root package name */
    private C5647d f159811i;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends i<b> implements Comparable<b> {

        /* renamed from: e, reason: collision with root package name */
        private final int f159812e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f159813f;

        /* renamed from: g, reason: collision with root package name */
        private final String f159814g;

        /* renamed from: h, reason: collision with root package name */
        private final e f159815h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f159816i;

        /* renamed from: j, reason: collision with root package name */
        private final int f159817j;

        /* renamed from: k, reason: collision with root package name */
        private final int f159818k;

        /* renamed from: l, reason: collision with root package name */
        private final int f159819l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f159820m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f159821n;

        /* renamed from: o, reason: collision with root package name */
        private final int f159822o;

        /* renamed from: p, reason: collision with root package name */
        private final int f159823p;

        /* renamed from: q, reason: collision with root package name */
        private final boolean f159824q;

        /* renamed from: r, reason: collision with root package name */
        private final int f159825r;

        /* renamed from: s, reason: collision with root package name */
        private final int f159826s;

        /* renamed from: t, reason: collision with root package name */
        private final int f159827t;

        /* renamed from: u, reason: collision with root package name */
        private final int f159828u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f159829v;

        /* renamed from: w, reason: collision with root package name */
        private final boolean f159830w;

        /* renamed from: x, reason: collision with root package name */
        private final boolean f159831x;

        private int o(int i10, boolean z10, int i11) {
            if (!I0.p(i10, this.f159815h.f159857A0)) {
                return 0;
            }
            if (!this.f159813f && !this.f159815h.f159867t0) {
                return 0;
            }
            e eVar = this.f159815h;
            if (eVar.f44521u.f44531a == 2 && !n.V(eVar, i10, this.f159915d)) {
                return 0;
            }
            if (!I0.p(i10, false) || !this.f159813f || this.f159915d.f44762j == -1) {
                return 1;
            }
            e eVar2 = this.f159815h;
            if (eVar2.f44498C || eVar2.f44497B) {
                return 1;
            }
            return ((!eVar2.f159859C0 && z10) || eVar2.f44521u.f44531a == 2 || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // s3.n.i
        public int a() {
            return this.f159812e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            g0 g0VarF = (this.f159813f && this.f159816i) ? n.f159805j : n.f159805j.f();
            Ee.B bG = Ee.B.k().h(this.f159816i, bVar.f159816i).g(Integer.valueOf(this.f159818k), Integer.valueOf(bVar.f159818k), g0.d().f()).d(this.f159817j, bVar.f159817j).d(this.f159819l, bVar.f159819l).h(this.f159824q, bVar.f159824q).h(this.f159821n, bVar.f159821n).g(Integer.valueOf(this.f159822o), Integer.valueOf(bVar.f159822o), g0.d().f()).d(this.f159823p, bVar.f159823p).h(this.f159813f, bVar.f159813f).g(Integer.valueOf(this.f159828u), Integer.valueOf(bVar.f159828u), g0.d().f());
            if (this.f159815h.f44497B) {
                bG = bG.g(Integer.valueOf(this.f159827t), Integer.valueOf(bVar.f159827t), n.f159805j.f());
            }
            Ee.B bG2 = bG.h(this.f159829v, bVar.f159829v).h(this.f159830w, bVar.f159830w).h(this.f159831x, bVar.f159831x).g(Integer.valueOf(this.f159825r), Integer.valueOf(bVar.f159825r), g0VarF).g(Integer.valueOf(this.f159826s), Integer.valueOf(bVar.f159826s), g0VarF);
            if (Objects.equals(this.f159814g, bVar.f159814g)) {
                bG2 = bG2.g(Integer.valueOf(this.f159827t), Integer.valueOf(bVar.f159827t), g0VarF);
            }
            return bG2.j();
        }

        @Override // s3.n.i
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i10;
            String str;
            int i11;
            if (!this.f159815h.f159870w0 && ((i11 = this.f159915d.f44742E) == -1 || i11 != bVar.f159915d.f44742E)) {
                return false;
            }
            if (!this.f159820m && ((str = this.f159915d.f44767o) == null || !TextUtils.equals(str, bVar.f159915d.f44767o))) {
                return false;
            }
            e eVar = this.f159815h;
            if (!eVar.f159869v0 && ((i10 = this.f159915d.f44743F) == -1 || i10 != bVar.f159915d.f44743F)) {
                return false;
            }
            if (eVar.f159871x0) {
                return true;
            }
            return this.f159829v == bVar.f159829v && this.f159830w == bVar.f159830w;
        }

        public b(int i10, G g10, int i11, e eVar, int i12, boolean z10, De.q<a3.t> qVar, int i13) {
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
            this.f159815h = eVar;
            if (eVar.f159872y0) {
                i14 = 24;
            } else {
                i14 = 16;
            }
            if (eVar.f159868u0 && (i13 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f159820m = z11;
            this.f159814g = n.U(this.f159915d.f44756d);
            this.f159816i = I0.p(i12, false);
            int i16 = 0;
            while (true) {
                int size = eVar.f44516p.size();
                i15 = a.e.API_PRIORITY_OTHER;
                if (i16 < size) {
                    iH = n.H(this.f159915d, eVar.f44516p.get(i16), false);
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
            this.f159818k = i16;
            this.f159817j = iH;
            this.f159819l = n.L(this.f159915d.f44758f, eVar.f44517q);
            a3.t tVar = this.f159915d;
            int i17 = tVar.f44758f;
            if (i17 != 0 && (i17 & 1) == 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            this.f159821n = z12;
            if ((tVar.f44757e & 1) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f159824q = z13;
            this.f159831x = n.P(tVar);
            a3.t tVar2 = this.f159915d;
            int i18 = tVar2.f44742E;
            this.f159825r = i18;
            this.f159826s = tVar2.f44743F;
            int i19 = tVar2.f44762j;
            this.f159827t = i19;
            if ((i19 == -1 || i19 <= eVar.f44519s) && ((i18 == -1 || i18 <= eVar.f44518r) && qVar.apply(tVar2))) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f159813f = z14;
            String[] strArrL0 = P.l0();
            int i20 = 0;
            while (true) {
                if (i20 < strArrL0.length) {
                    iH2 = n.H(this.f159915d, strArrL0[i20], false);
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
            this.f159822o = i20;
            this.f159823p = iH2;
            int i21 = 0;
            while (true) {
                if (i21 < eVar.f44520t.size()) {
                    String str = this.f159915d.f44767o;
                    if (str != null && str.equals(eVar.f44520t.get(i21))) {
                        i15 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f159828u = i15;
            if (I0.n(i12) == 128) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.f159829v = z15;
            this.f159830w = I0.F(i12) == 64;
            this.f159812e = o(i12, z10, i14);
        }

        public static int e(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static L<b> m(int i10, G g10, e eVar, int[] iArr, boolean z10, De.q<a3.t> qVar, int i11) {
            L.a aVarP = L.p();
            for (int i12 = 0; i12 < g10.f44451a; i12++) {
                aVarP.a(new b(i10, g10, i12, eVar, iArr[i12], z10, qVar, i11));
            }
            return aVarP.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends i<c> implements Comparable<c> {

        /* renamed from: e, reason: collision with root package name */
        private final int f159832e;

        /* renamed from: f, reason: collision with root package name */
        private final int f159833f;

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
            return this.f159832e;
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return Integer.compare(this.f159833f, cVar.f159833f);
        }

        public c(int i10, G g10, int i11, e eVar, int i12) {
            super(i10, g10, i11);
            this.f159832e = I0.p(i12, eVar.f159857A0) ? 1 : 0;
            this.f159833f = this.f159915d.e();
        }

        public static L<c> m(int i10, G g10, e eVar, int[] iArr) {
            L.a aVarP = L.p();
            for (int i11 = 0; i11 < g10.f44451a; i11++) {
                aVarP.a(new c(i10, g10, i11, eVar, iArr[i11]));
            }
            return aVarP.k();
        }
    }

    public static final class e extends I {

        /* renamed from: G0, reason: collision with root package name */
        public static final e f159836G0;

        /* renamed from: H0, reason: collision with root package name */
        @Deprecated
        public static final e f159837H0;

        /* renamed from: I0, reason: collision with root package name */
        private static final String f159838I0;

        /* renamed from: J0, reason: collision with root package name */
        private static final String f159839J0;

        /* renamed from: K0, reason: collision with root package name */
        private static final String f159840K0;

        /* renamed from: L0, reason: collision with root package name */
        private static final String f159841L0;

        /* renamed from: M0, reason: collision with root package name */
        private static final String f159842M0;

        /* renamed from: N0, reason: collision with root package name */
        private static final String f159843N0;

        /* renamed from: O0, reason: collision with root package name */
        private static final String f159844O0;

        /* renamed from: P0, reason: collision with root package name */
        private static final String f159845P0;

        /* renamed from: Q0, reason: collision with root package name */
        private static final String f159846Q0;

        /* renamed from: R0, reason: collision with root package name */
        private static final String f159847R0;

        /* renamed from: S0, reason: collision with root package name */
        private static final String f159848S0;

        /* renamed from: T0, reason: collision with root package name */
        private static final String f159849T0;

        /* renamed from: U0, reason: collision with root package name */
        private static final String f159850U0;

        /* renamed from: V0, reason: collision with root package name */
        private static final String f159851V0;

        /* renamed from: W0, reason: collision with root package name */
        private static final String f159852W0;

        /* renamed from: X0, reason: collision with root package name */
        private static final String f159853X0;

        /* renamed from: Y0, reason: collision with root package name */
        private static final String f159854Y0;

        /* renamed from: Z0, reason: collision with root package name */
        private static final String f159855Z0;

        /* renamed from: a1, reason: collision with root package name */
        private static final String f159856a1;

        /* renamed from: A0, reason: collision with root package name */
        public final boolean f159857A0;

        /* renamed from: B0, reason: collision with root package name */
        public final boolean f159858B0;

        /* renamed from: C0, reason: collision with root package name */
        public final boolean f159859C0;

        /* renamed from: D0, reason: collision with root package name */
        public final boolean f159860D0;

        /* renamed from: E0, reason: collision with root package name */
        private final SparseArray<Map<p3.w, f>> f159861E0;

        /* renamed from: F0, reason: collision with root package name */
        private final SparseBooleanArray f159862F0;

        /* renamed from: p0, reason: collision with root package name */
        public final boolean f159863p0;

        /* renamed from: q0, reason: collision with root package name */
        public final boolean f159864q0;

        /* renamed from: r0, reason: collision with root package name */
        public final boolean f159865r0;

        /* renamed from: s0, reason: collision with root package name */
        public final boolean f159866s0;

        /* renamed from: t0, reason: collision with root package name */
        public final boolean f159867t0;

        /* renamed from: u0, reason: collision with root package name */
        public final boolean f159868u0;

        /* renamed from: v0, reason: collision with root package name */
        public final boolean f159869v0;

        /* renamed from: w0, reason: collision with root package name */
        public final boolean f159870w0;

        /* renamed from: x0, reason: collision with root package name */
        public final boolean f159871x0;

        /* renamed from: y0, reason: collision with root package name */
        public final boolean f159872y0;

        /* renamed from: z0, reason: collision with root package name */
        public final boolean f159873z0;

        public static final class a extends I.c {

            /* renamed from: F, reason: collision with root package name */
            private boolean f159874F;

            /* renamed from: G, reason: collision with root package name */
            private boolean f159875G;

            /* renamed from: H, reason: collision with root package name */
            private boolean f159876H;

            /* renamed from: I, reason: collision with root package name */
            private boolean f159877I;

            /* renamed from: J, reason: collision with root package name */
            private boolean f159878J;

            /* renamed from: K, reason: collision with root package name */
            private boolean f159879K;

            /* renamed from: L, reason: collision with root package name */
            private boolean f159880L;

            /* renamed from: M, reason: collision with root package name */
            private boolean f159881M;

            /* renamed from: N, reason: collision with root package name */
            private boolean f159882N;

            /* renamed from: O, reason: collision with root package name */
            private boolean f159883O;

            /* renamed from: P, reason: collision with root package name */
            private boolean f159884P;

            /* renamed from: Q, reason: collision with root package name */
            private boolean f159885Q;

            /* renamed from: R, reason: collision with root package name */
            private boolean f159886R;

            /* renamed from: S, reason: collision with root package name */
            private boolean f159887S;

            /* renamed from: T, reason: collision with root package name */
            private boolean f159888T;

            /* renamed from: U, reason: collision with root package name */
            private final SparseArray<Map<p3.w, f>> f159889U;

            /* renamed from: V, reason: collision with root package name */
            private final SparseBooleanArray f159890V;

            private void k0() {
                this.f159874F = true;
                this.f159875G = false;
                this.f159876H = true;
                this.f159877I = false;
                this.f159878J = true;
                this.f159879K = false;
                this.f159880L = false;
                this.f159881M = false;
                this.f159882N = false;
                this.f159883O = true;
                this.f159884P = true;
                this.f159885Q = true;
                this.f159886R = false;
                this.f159887S = true;
                this.f159888T = false;
            }

            public a() {
                this.f159889U = new SparseArray<>();
                this.f159890V = new SparseBooleanArray();
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
                if (this.f159890V.get(i10) == z10) {
                    return this;
                }
                if (z10) {
                    this.f159890V.put(i10, true);
                    return this;
                }
                this.f159890V.delete(i10);
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
                this.f159874F = eVar.f159863p0;
                this.f159875G = eVar.f159864q0;
                this.f159876H = eVar.f159865r0;
                this.f159877I = eVar.f159866s0;
                this.f159878J = eVar.f159867t0;
                this.f159879K = eVar.f159868u0;
                this.f159880L = eVar.f159869v0;
                this.f159881M = eVar.f159870w0;
                this.f159882N = eVar.f159871x0;
                this.f159883O = eVar.f159872y0;
                this.f159884P = eVar.f159873z0;
                this.f159885Q = eVar.f159857A0;
                this.f159886R = eVar.f159858B0;
                this.f159887S = eVar.f159859C0;
                this.f159888T = eVar.f159860D0;
                this.f159889U = j0(eVar.f159861E0);
                this.f159890V = eVar.f159862F0.clone();
            }
        }

        @Override // a3.I
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (super.equals(eVar) && this.f159863p0 == eVar.f159863p0 && this.f159864q0 == eVar.f159864q0 && this.f159865r0 == eVar.f159865r0 && this.f159866s0 == eVar.f159866s0 && this.f159867t0 == eVar.f159867t0 && this.f159868u0 == eVar.f159868u0 && this.f159869v0 == eVar.f159869v0 && this.f159870w0 == eVar.f159870w0 && this.f159871x0 == eVar.f159871x0 && this.f159872y0 == eVar.f159872y0 && this.f159873z0 == eVar.f159873z0 && this.f159857A0 == eVar.f159857A0 && this.f159858B0 == eVar.f159858B0 && this.f159859C0 == eVar.f159859C0 && this.f159860D0 == eVar.f159860D0 && d(this.f159862F0, eVar.f159862F0) && e(this.f159861E0, eVar.f159861E0)) {
                    return true;
                }
            }
            return false;
        }

        static {
            e eVarF = new a().F();
            f159836G0 = eVarF;
            f159837H0 = eVarF;
            f159838I0 = P.y0(1000);
            f159839J0 = P.y0(1001);
            f159840K0 = P.y0(1002);
            f159841L0 = P.y0(1003);
            f159842M0 = P.y0(1004);
            f159843N0 = P.y0(1005);
            f159844O0 = P.y0(1006);
            f159845P0 = P.y0(1007);
            f159846Q0 = P.y0(1008);
            f159847R0 = P.y0(1009);
            f159848S0 = P.y0(1010);
            f159849T0 = P.y0(1011);
            f159850U0 = P.y0(1012);
            f159851V0 = P.y0(1013);
            f159852W0 = P.y0(1014);
            f159853X0 = P.y0(1015);
            f159854Y0 = P.y0(1016);
            f159855Z0 = P.y0(1017);
            f159856a1 = P.y0(1018);
        }

        private e(a aVar) {
            super(aVar);
            this.f159863p0 = aVar.f159874F;
            this.f159864q0 = aVar.f159875G;
            this.f159865r0 = aVar.f159876H;
            this.f159866s0 = aVar.f159877I;
            this.f159867t0 = aVar.f159878J;
            this.f159868u0 = aVar.f159879K;
            this.f159869v0 = aVar.f159880L;
            this.f159870w0 = aVar.f159881M;
            this.f159871x0 = aVar.f159882N;
            this.f159872y0 = aVar.f159883O;
            this.f159873z0 = aVar.f159884P;
            this.f159857A0 = aVar.f159885Q;
            this.f159858B0 = aVar.f159886R;
            this.f159859C0 = aVar.f159887S;
            this.f159860D0 = aVar.f159888T;
            this.f159861E0 = aVar.f159889U;
            this.f159862F0 = aVar.f159890V;
        }

        @Override // a3.I
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a();
        }

        public boolean h(int i10) {
            return this.f159862F0.get(i10);
        }

        @Deprecated
        public f i(int i10, p3.w wVar) {
            Map<p3.w, f> map = this.f159861E0.get(i10);
            if (map != null) {
                return map.get(wVar);
            }
            return null;
        }

        @Deprecated
        public boolean j(int i10, p3.w wVar) {
            Map<p3.w, f> map = this.f159861E0.get(i10);
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
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f159863p0 ? 1 : 0)) * 31) + (this.f159864q0 ? 1 : 0)) * 31) + (this.f159865r0 ? 1 : 0)) * 31) + (this.f159866s0 ? 1 : 0)) * 31) + (this.f159867t0 ? 1 : 0)) * 31) + (this.f159868u0 ? 1 : 0)) * 31) + (this.f159869v0 ? 1 : 0)) * 31) + (this.f159870w0 ? 1 : 0)) * 31) + (this.f159871x0 ? 1 : 0)) * 31) + (this.f159872y0 ? 1 : 0)) * 31) + (this.f159873z0 ? 1 : 0)) * 31) + (this.f159857A0 ? 1 : 0)) * 31) + (this.f159858B0 ? 1 : 0)) * 31) + (this.f159859C0 ? 1 : 0)) * 31) + (this.f159860D0 ? 1 : 0);
        }
    }

    public static final class f {

        /* renamed from: d, reason: collision with root package name */
        private static final String f159891d = P.y0(0);

        /* renamed from: e, reason: collision with root package name */
        private static final String f159892e = P.y0(1);

        /* renamed from: f, reason: collision with root package name */
        private static final String f159893f = P.y0(2);

        /* renamed from: a, reason: collision with root package name */
        public final int f159894a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f159895b;

        /* renamed from: c, reason: collision with root package name */
        public final int f159896c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f159894a == fVar.f159894a && Arrays.equals(this.f159895b, fVar.f159895b) && this.f159896c == fVar.f159896c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f159894a * 31) + Arrays.hashCode(this.f159895b)) * 31) + this.f159896c;
        }
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        private final Spatializer f159897a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f159898b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f159899c;

        /* renamed from: d, reason: collision with root package name */
        private final Spatializer$OnSpatializerStateChangedListener f159900d;

        class a implements Spatializer$OnSpatializerStateChangedListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n f159901a;

            a(n nVar) {
                this.f159901a = nVar;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f159901a.S();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f159901a.S();
            }
        }

        public boolean a(C5647d c5647d, a3.t tVar) throws IllegalArgumentException {
            int i10;
            if (Objects.equals(tVar.f44767o, "audio/eac3-joc")) {
                i10 = tVar.f44742E;
                if (i10 == 16) {
                    i10 = 12;
                }
            } else if (Objects.equals(tVar.f44767o, "audio/iamf")) {
                i10 = tVar.f44742E;
                if (i10 == -1) {
                    i10 = 6;
                }
            } else if (Objects.equals(tVar.f44767o, "audio/ac4")) {
                i10 = tVar.f44742E;
                if (i10 == 18 || i10 == 21) {
                    i10 = 24;
                }
            } else {
                i10 = tVar.f44742E;
            }
            int iL = P.L(i10);
            if (iL == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iL);
            int i11 = tVar.f44743F;
            if (i11 != -1) {
                channelMask.setSampleRate(i11);
            }
            return o.a(C13599a.e(this.f159897a)).canBeSpatialized(c5647d.a().f44641a, channelMask.build());
        }

        public boolean b() {
            return o.a(C13599a.e(this.f159897a)).isAvailable();
        }

        public boolean c() {
            return o.a(C13599a.e(this.f159897a)).isEnabled();
        }

        public boolean d() {
            return this.f159898b;
        }

        public void e() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener;
            Spatializer spatializer = this.f159897a;
            if (spatializer == null || (spatializer$OnSpatializerStateChangedListener = this.f159900d) == null || this.f159899c == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            this.f159899c.removeCallbacksAndMessages(null);
        }

        public g(Context context, n nVar) {
            AudioManager audioManagerC;
            if (context == null) {
                audioManagerC = null;
            } else {
                audioManagerC = b3.m.c(context);
            }
            if (audioManagerC != null && !P.G0((Context) C13599a.e(context))) {
                Spatializer spatializer = audioManagerC.getSpatializer();
                this.f159897a = spatializer;
                this.f159898b = spatializer.getImmersiveAudioLevel() != 0;
                a aVar = new a(nVar);
                this.f159900d = aVar;
                Handler handler = new Handler((Looper) C13599a.i(Looper.myLooper()));
                this.f159899c = handler;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new F(handler), aVar);
                return;
            }
            this.f159897a = null;
            this.f159898b = false;
            this.f159899c = null;
            this.f159900d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class h extends i<h> implements Comparable<h> {

        /* renamed from: e, reason: collision with root package name */
        private final int f159903e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f159904f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f159905g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f159906h;

        /* renamed from: i, reason: collision with root package name */
        private final int f159907i;

        /* renamed from: j, reason: collision with root package name */
        private final int f159908j;

        /* renamed from: k, reason: collision with root package name */
        private final int f159909k;

        /* renamed from: l, reason: collision with root package name */
        private final int f159910l;

        /* renamed from: m, reason: collision with root package name */
        private final boolean f159911m;

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
            return this.f159903e;
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
            this.f159904f = I0.p(i12, false);
            int i15 = this.f159915d.f44757e & (~eVar.f44525y);
            if ((i15 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f159905g = z10;
            if ((i15 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f159906h = z11;
            if (str2 != null) {
                lY = L.y(str2);
            } else if (eVar.f44522v.isEmpty()) {
                lY = L.y("");
            } else {
                lY = eVar.f44522v;
            }
            int i16 = 0;
            while (true) {
                if (i16 < lY.size()) {
                    iH = n.H(this.f159915d, lY.get(i16), eVar.f44526z);
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
            this.f159907i = i16;
            this.f159908j = iH;
            if (str2 != null) {
                i13 = 1088;
            } else {
                i13 = eVar.f44523w;
            }
            int iL = n.L(this.f159915d.f44758f, i13);
            this.f159909k = iL;
            if ((1088 & this.f159915d.f44758f) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f159911m = z12;
            if (n.U(str) == null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int iH2 = n.H(this.f159915d, str, z13);
            this.f159910l = iH2;
            if (iH <= 0 && ((!eVar.f44522v.isEmpty() || iL <= 0) && !this.f159905g && (!this.f159906h || iH2 <= 0))) {
                z14 = false;
            } else {
                z14 = true;
            }
            if (I0.p(i12, eVar.f159857A0) && z14) {
                i14 = 1;
            }
            this.f159903e = i14;
        }

        public static L<h> m(int i10, G g10, e eVar, int[] iArr, String str, String str2) {
            L.a aVarP = L.p();
            for (int i11 = 0; i11 < g10.f44451a; i11++) {
                aVarP.a(new h(i10, g10, i11, eVar, iArr[i11], str, str2));
            }
            return aVarP.k();
        }

        @Override // java.lang.Comparable
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            g0 g0VarF;
            Ee.B bH = Ee.B.k().h(this.f159904f, hVar.f159904f).g(Integer.valueOf(this.f159907i), Integer.valueOf(hVar.f159907i), g0.d().f()).d(this.f159908j, hVar.f159908j).d(this.f159909k, hVar.f159909k).h(this.f159905g, hVar.f159905g);
            Boolean boolValueOf = Boolean.valueOf(this.f159906h);
            Boolean boolValueOf2 = Boolean.valueOf(hVar.f159906h);
            if (this.f159908j == 0) {
                g0VarF = g0.d();
            } else {
                g0VarF = g0.d().f();
            }
            Ee.B bD = bH.g(boolValueOf, boolValueOf2, g0VarF).d(this.f159910l, hVar.f159910l);
            if (this.f159909k == 0) {
                bD = bD.i(this.f159911m, hVar.f159911m);
            }
            return bD.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class j extends i<j> {

        /* renamed from: e, reason: collision with root package name */
        private final boolean f159916e;

        /* renamed from: f, reason: collision with root package name */
        private final e f159917f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f159918g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f159919h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f159920i;

        /* renamed from: j, reason: collision with root package name */
        private final int f159921j;

        /* renamed from: k, reason: collision with root package name */
        private final int f159922k;

        /* renamed from: l, reason: collision with root package name */
        private final int f159923l;

        /* renamed from: m, reason: collision with root package name */
        private final int f159924m;

        /* renamed from: n, reason: collision with root package name */
        private final int f159925n;

        /* renamed from: o, reason: collision with root package name */
        private final int f159926o;

        /* renamed from: p, reason: collision with root package name */
        private final boolean f159927p;

        /* renamed from: q, reason: collision with root package name */
        private final int f159928q;

        /* renamed from: r, reason: collision with root package name */
        private final boolean f159929r;

        /* renamed from: s, reason: collision with root package name */
        private final int f159930s;

        /* renamed from: t, reason: collision with root package name */
        private final boolean f159931t;

        /* renamed from: u, reason: collision with root package name */
        private final boolean f159932u;

        /* renamed from: v, reason: collision with root package name */
        private final int f159933v;

        /* JADX INFO: Access modifiers changed from: private */
        public static int o(j jVar, j jVar2) {
            g0 g0VarF = (jVar.f159916e && jVar.f159919h) ? n.f159805j : n.f159805j.f();
            Ee.B bK = Ee.B.k();
            if (jVar.f159917f.f44497B) {
                bK = bK.g(Integer.valueOf(jVar.f159921j), Integer.valueOf(jVar2.f159921j), n.f159805j.f());
            }
            return bK.g(Integer.valueOf(jVar.f159922k), Integer.valueOf(jVar2.f159922k), g0VarF).g(Integer.valueOf(jVar.f159921j), Integer.valueOf(jVar2.f159921j), g0VarF).j();
        }

        public static L<j> t(int i10, G g10, e eVar, int[] iArr, String str, int i11, Point point) {
            int I10 = n.I(g10, point != null ? point.x : eVar.f44509i, point != null ? point.y : eVar.f44510j, eVar.f44512l);
            L.a aVarP = L.p();
            for (int i12 = 0; i12 < g10.f44451a; i12++) {
                int iE = g10.a(i12).e();
                aVarP.a(new j(i10, g10, i12, eVar, iArr[i12], str, i11, I10 == Integer.MAX_VALUE || (iE != -1 && iE <= I10)));
            }
            return aVarP.k();
        }

        private int u(int i10, int i11) {
            if ((this.f159915d.f44758f & 16384) != 0 || !I0.p(i10, this.f159917f.f159857A0)) {
                return 0;
            }
            if (!this.f159916e && !this.f159917f.f159863p0) {
                return 0;
            }
            if (!I0.p(i10, false) || !this.f159918g || !this.f159916e || this.f159915d.f44762j == -1) {
                return 1;
            }
            e eVar = this.f159917f;
            return (eVar.f44498C || eVar.f44497B || (i10 & i11) == 0) ? 1 : 2;
        }

        @Override // s3.n.i
        public int a() {
            return this.f159930s;
        }

        @Override // s3.n.i
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public boolean b(j jVar) {
            if (!this.f159929r && !Objects.equals(this.f159915d.f44767o, jVar.f159915d.f44767o)) {
                return false;
            }
            if (this.f159917f.f159866s0) {
                return true;
            }
            return this.f159931t == jVar.f159931t && this.f159932u == jVar.f159932u;
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
            Ee.B bH = Ee.B.k().h(jVar.f159919h, jVar2.f159919h).g(Integer.valueOf(jVar.f159924m), Integer.valueOf(jVar2.f159924m), g0.d().f()).d(jVar.f159925n, jVar2.f159925n).d(jVar.f159926o, jVar2.f159926o).h(jVar.f159927p, jVar2.f159927p).d(jVar.f159928q, jVar2.f159928q).h(jVar.f159920i, jVar2.f159920i).h(jVar.f159916e, jVar2.f159916e).h(jVar.f159918g, jVar2.f159918g).g(Integer.valueOf(jVar.f159923l), Integer.valueOf(jVar2.f159923l), g0.d().f()).h(jVar.f159931t, jVar2.f159931t).h(jVar.f159932u, jVar2.f159932u);
            if (jVar.f159931t && jVar.f159932u) {
                bH = bH.d(jVar.f159933v, jVar2.f159933v);
            }
            return bH.j();
        }

        public static int p(List<j> list, List<j> list2) {
            return Ee.B.k().g((j) Collections.max(list, new Comparator() { // from class: s3.w
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
        this(context, new C17000a.b());
    }

    private static void G(p3.w wVar, I i10, Map<Integer, H> map) {
        H h10;
        for (int i11 = 0; i11 < wVar.f156149a; i11++) {
            H h11 = i10.f44499D.get(wVar.b(i11));
            if (h11 != null && ((h10 = map.get(Integer.valueOf(h11.a()))) == null || (h10.f44459b.isEmpty() && !h11.f44459b.isEmpty()))) {
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

    private static void Q(e eVar, AbstractC16995A.a aVar, int[][][] iArr, K[] kArr, y[] yVarArr) {
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
            int i13 = eVar.f44521u.f44532b ? 1 : 2;
            K k10 = kArr[i10];
            if (k10 != null && k10.f134669b) {
                z10 = true;
            }
            kArr[i10] = new K(i13, z10);
        }
    }

    private static void R(AbstractC16995A.a aVar, int[][][] iArr, K[] kArr, y[] yVarArr) {
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

    protected Pair<y.a, Integer> Y(AbstractC16995A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar) throws ExoPlaybackException {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.d()) {
                if (2 == aVar.e(i10) && aVar.f(i10).f156149a > 0) {
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
                return n.r(this.f159798a, eVar, z10, iArr2, i11, g10, iArr3);
            }
        }, new Comparator() { // from class: s3.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return n.b.e((List) obj, (List) obj2);
            }
        });
    }

    @Override // s3.AbstractC16998D
    public I0.a d() {
        return this;
    }

    @Override // s3.AbstractC16998D
    public boolean h() {
        return true;
    }

    private static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f159834a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f159835b;

        public d(a3.t tVar, int i10) {
            this.f159834a = (tVar.f44757e & 1) != 0;
            this.f159835b = I0.p(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Ee.B.k().h(this.f159835b, dVar.f159835b).h(this.f159834a, dVar.f159834a).j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class i<T extends i<T>> {

        /* renamed from: a, reason: collision with root package name */
        public final int f159912a;

        /* renamed from: b, reason: collision with root package name */
        public final G f159913b;

        /* renamed from: c, reason: collision with root package name */
        public final int f159914c;

        /* renamed from: d, reason: collision with root package name */
        public final a3.t f159915d;

        public interface a<T extends i<T>> {
            List<T> a(int i10, G g10, int[] iArr);
        }

        public abstract int a();

        public abstract boolean b(T t10);

        public i(int i10, G g10, int i11) {
            this.f159912a = i10;
            this.f159913b = g10;
            this.f159914c = i11;
            this.f159915d = g10.a(i11);
        }
    }

    public n(Context context, y.b bVar) {
        this(context, e.f159836G0, bVar);
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
        if (!eVar.f159873z0 || (i10 = tVar.f44742E) == -1 || i10 <= 2) {
            return true;
        }
        if (!O(tVar) || (P.f127888a >= 32 && (gVar2 = this.f159810h) != null && gVar2.d())) {
            return P.f127888a >= 32 && (gVar = this.f159810h) != null && gVar.d() && this.f159810h.b() && this.f159810h.c() && this.f159810h.a(this.f159811i, tVar);
        }
        return true;
    }

    private static boolean O(a3.t tVar) {
        String str = tVar.f44767o;
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
        String str = tVar.f44767o;
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
        synchronized (this.f159806d) {
            try {
                z10 = this.f159809g.f159873z0 && P.f127888a >= 32 && (gVar = this.f159810h) != null && gVar.d();
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
        synchronized (this.f159806d) {
            z10 = this.f159809g.f159860D0;
        }
        if (z10) {
            g(h02);
        }
    }

    private <T extends i<T>> Pair<y.a, Integer> c0(int i10, AbstractC16995A.a aVar, int[][][] iArr, i.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccessY;
        AbstractC16995A.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int iD = aVar3.d();
        int i12 = 0;
        while (i12 < iD) {
            if (i10 == aVar3.e(i12)) {
                p3.w wVarF = aVar3.f(i12);
                for (int i13 = 0; i13 < wVarF.f156149a; i13++) {
                    G gB = wVarF.b(i13);
                    List<T> listA = aVar2.a(i12, gB, iArr[i12][i13]);
                    boolean[] zArr = new boolean[gB.f44451a];
                    int i14 = 0;
                    while (i14 < gB.f44451a) {
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
                                while (i15 < gB.f44451a) {
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
            iArr2[i17] = ((i) list.get(i17)).f159914c;
        }
        i iVar = (i) list.get(0);
        return Pair.create(new y.a(iVar.f159913b, iArr2), Integer.valueOf(iVar.f159912a));
    }

    @Override // s3.AbstractC16998D
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public e c() {
        e eVar;
        synchronized (this.f159806d) {
            eVar = this.f159809g;
        }
        return eVar;
    }

    protected Pair<y.a, Integer> Z(AbstractC16995A.a aVar, int[][][] iArr, final e eVar) throws ExoPlaybackException {
        if (eVar.f44521u.f44531a == 2) {
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
        if (eVar.f44521u.f44531a == 2) {
            return null;
        }
        int i11 = 0;
        G g10 = null;
        d dVar = null;
        for (int i12 = 0; i12 < wVar.f156149a; i12++) {
            G gB = wVar.b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < gB.f44451a; i13++) {
                if (I0.p(iArr2[i13], eVar.f159857A0)) {
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

    protected Pair<y.a, Integer> b0(AbstractC16995A.a aVar, int[][][] iArr, final e eVar, final String str) throws ExoPlaybackException {
        if (eVar.f44521u.f44531a == 2) {
            return null;
        }
        final String strK = eVar.f44524x ? K(this.f159807e) : null;
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

    protected Pair<y.a, Integer> d0(AbstractC16995A.a aVar, int[][][] iArr, final int[] iArr2, final e eVar, final String str) throws ExoPlaybackException {
        Context context;
        final Point pointR = null;
        if (eVar.f44521u.f44531a == 2) {
            return null;
        }
        if (eVar.f44511k && (context = this.f159807e) != null) {
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

    @Override // s3.AbstractC16998D
    public void j() {
        g gVar;
        if (P.f127888a >= 32 && (gVar = this.f159810h) != null) {
            gVar.e();
        }
        super.j();
    }

    @Override // s3.AbstractC16998D
    public void l(C5647d c5647d) {
        if (this.f159811i.equals(c5647d)) {
            return;
        }
        this.f159811i = c5647d;
        S();
    }

    @Override // s3.AbstractC16998D
    public void m(I i10) {
        if (i10 instanceof e) {
            e0((e) i10);
        }
        e0(new e.a().l0(i10).F());
    }

    @Override // s3.AbstractC16995A
    protected final Pair<K[], y[]> q(AbstractC16995A.a aVar, int[][][] iArr, int[] iArr2, r.b bVar, a3.F f10) throws ExoPlaybackException {
        e eVar;
        synchronized (this.f159806d) {
            eVar = this.f159809g;
        }
        if (eVar.f159873z0 && P.f127888a >= 32 && this.f159810h == null) {
            this.f159810h = new g(this.f159807e, this);
        }
        int iD = aVar.d();
        y.a[] aVarArrX = X(aVar, iArr, iArr2, eVar);
        F(aVar, eVar, aVarArrX);
        E(aVar, eVar, aVarArrX);
        for (int i10 = 0; i10 < iD; i10++) {
            int iE = aVar.e(i10);
            if (eVar.h(i10) || eVar.f44500E.contains(Integer.valueOf(iE))) {
                aVarArrX[i10] = null;
            }
        }
        y[] yVarArrA = this.f159808f.a(aVarArrX, b(), bVar, f10);
        K[] kArr = new K[iD];
        for (int i11 = 0; i11 < iD; i11++) {
            kArr[i11] = (eVar.h(i11) || eVar.f44500E.contains(Integer.valueOf(aVar.e(i11))) || (aVar.e(i11) != -2 && yVarArrA[i11] == null)) ? null : K.f134667c;
        }
        if (eVar.f159858B0) {
            R(aVar, iArr, kArr, yVarArrA);
        }
        if (eVar.f44521u.f44531a != 0) {
            Q(eVar, aVar, iArr, kArr, yVarArrA);
        }
        return Pair.create(kArr, yVarArrA);
    }

    public n(Context context, I i10, y.b bVar) {
        this(i10, bVar, context);
    }

    private static void E(AbstractC16995A.a aVar, e eVar, y.a[] aVarArr) {
        y.a aVar2;
        int iD = aVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            p3.w wVarF = aVar.f(i10);
            if (eVar.j(i10, wVarF)) {
                f fVarI = eVar.i(i10, wVarF);
                if (fVarI != null && fVarI.f159895b.length != 0) {
                    aVar2 = new y.a(wVarF.b(fVarI.f159894a), fVarI.f159895b, fVarI.f159896c);
                } else {
                    aVar2 = null;
                }
                aVarArr[i10] = aVar2;
            }
        }
    }

    private static void F(AbstractC16995A.a aVar, I i10, y.a[] aVarArr) {
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
                if (!h10.f44459b.isEmpty() && aVar.f(i12).d(h10.f44458a) != -1) {
                    aVar2 = new y.a(h10.f44458a, Je.f.l(h10.f44459b));
                } else {
                    aVar2 = null;
                }
                aVarArr[i12] = aVar2;
            }
        }
    }

    protected static int H(a3.t tVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(tVar.f44756d)) {
            return 4;
        }
        String strU = U(str);
        String strU2 = U(tVar.f44756d);
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
            for (int i14 = 0; i14 < g10.f44451a; i14++) {
                a3.t tVarA = g10.a(i14);
                int i15 = tVarA.f44774v;
                if (i15 > 0 && (i12 = tVarA.f44775w) > 0) {
                    Point pointC = C16997C.c(z10, i10, i11, i15, i12);
                    int i16 = tVarA.f44774v;
                    int i17 = tVarA.f44775w;
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
        if (eVar.f44521u.f44533c && (I0.z(i10) & RecyclerView.m.FLAG_MOVED) == 0) {
            return false;
        }
        if (eVar.f44521u.f44532b) {
            if (tVar.f44745H == 0 && tVar.f44746I == 0) {
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
        C13599a.e(eVar);
        synchronized (this.f159806d) {
            zEquals = this.f159809g.equals(eVar);
            this.f159809g = eVar;
        }
        if (!zEquals) {
            if (eVar.f159873z0 && this.f159807e == null) {
                d3.r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            f();
        }
    }

    public static /* synthetic */ List r(final n nVar, final e eVar, boolean z10, int[] iArr, int i10, G g10, int[] iArr2) {
        nVar.getClass();
        return b.m(i10, g10, eVar, iArr2, z10, new De.q() { // from class: s3.d
            @Override // De.q
            public final boolean apply(Object obj) {
                return this.f159791a.N((a3.t) obj, eVar);
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

    protected y.a[] X(AbstractC16995A.a aVar, int[][][] iArr, int[] iArr2, e eVar) throws ExoPlaybackException {
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
            str = ((y.a) obj).f159934a.a(((y.a) obj).f159935b[0]).f44756d;
        }
        Pair<y.a, Integer> pairD0 = d0(aVar, iArr, iArr2, eVar, str);
        String str2 = str;
        if (eVar.f44496A || pairD0 == null) {
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
        this.f159806d = new Object();
        this.f159807e = context != null ? context.getApplicationContext() : null;
        this.f159808f = bVar;
        if (i10 instanceof e) {
            this.f159809g = (e) i10;
        } else {
            this.f159809g = e.f159836G0.a().l0(i10).F();
        }
        this.f159811i = C5647d.f44629g;
        if (this.f159809g.f159873z0 && context == null) {
            d3.r.i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
