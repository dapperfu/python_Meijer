package H4;

import H2.b;
import H4.AbstractC3664k;
import Z.C5503a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o2.InterfaceC15993a;

/* renamed from: H4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3664k implements Cloneable {

    /* renamed from: L, reason: collision with root package name */
    private static final Animator[] f12176L = new Animator[0];

    /* renamed from: M, reason: collision with root package name */
    private static final int[] f12177M = {2, 1, 3, 4};

    /* renamed from: N, reason: collision with root package name */
    private static final AbstractC3660g f12178N = new a();

    /* renamed from: O, reason: collision with root package name */
    private static ThreadLocal<C5503a<Animator, d>> f12179O = new ThreadLocal<>();

    /* renamed from: F, reason: collision with root package name */
    private e f12185F;

    /* renamed from: G, reason: collision with root package name */
    private C5503a<String, String> f12186G;

    /* renamed from: I, reason: collision with root package name */
    long f12188I;

    /* renamed from: J, reason: collision with root package name */
    g f12189J;

    /* renamed from: K, reason: collision with root package name */
    long f12190K;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<y> f12210t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<y> f12211u;

    /* renamed from: v, reason: collision with root package name */
    private h[] f12212v;

    /* renamed from: a, reason: collision with root package name */
    private String f12191a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    private long f12192b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f12193c = -1;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f12194d = null;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<Integer> f12195e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    ArrayList<View> f12196f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f12197g = null;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<Class<?>> f12198h = null;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<Integer> f12199i = null;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<View> f12200j = null;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<Class<?>> f12201k = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<String> f12202l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<Integer> f12203m = null;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<View> f12204n = null;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<Class<?>> f12205o = null;

    /* renamed from: p, reason: collision with root package name */
    private z f12206p = new z();

    /* renamed from: q, reason: collision with root package name */
    private z f12207q = new z();

    /* renamed from: r, reason: collision with root package name */
    w f12208r = null;

    /* renamed from: s, reason: collision with root package name */
    private int[] f12209s = f12177M;

    /* renamed from: w, reason: collision with root package name */
    boolean f12213w = false;

    /* renamed from: x, reason: collision with root package name */
    ArrayList<Animator> f12214x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private Animator[] f12215y = f12176L;

    /* renamed from: z, reason: collision with root package name */
    int f12216z = 0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f12180A = false;

    /* renamed from: B, reason: collision with root package name */
    boolean f12181B = false;

    /* renamed from: C, reason: collision with root package name */
    private AbstractC3664k f12182C = null;

    /* renamed from: D, reason: collision with root package name */
    private ArrayList<h> f12183D = null;

    /* renamed from: E, reason: collision with root package name */
    ArrayList<Animator> f12184E = new ArrayList<>();

    /* renamed from: H, reason: collision with root package name */
    private AbstractC3660g f12187H = f12178N;

    /* renamed from: H4.k$a */
    class a extends AbstractC3660g {
        @Override // H4.AbstractC3660g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }

        a() {
        }
    }

    /* renamed from: H4.k$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5503a f12217a;

        b(C5503a c5503a) {
            this.f12217a = c5503a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f12217a.remove(animator);
            AbstractC3664k.this.f12214x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC3664k.this.f12214x.add(animator);
        }
    }

    /* renamed from: H4.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3664k.this.s();
            animator.removeListener(this);
        }
    }

    /* renamed from: H4.k$e */
    public static abstract class e {
    }

    /* renamed from: H4.k$f */
    private static class f {
        static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }

        static long a(Animator animator) {
            return animator.getTotalDuration();
        }
    }

    /* renamed from: H4.k$g */
    class g extends s implements v, b.r {

        /* renamed from: d, reason: collision with root package name */
        private boolean f12229d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12230e;

        /* renamed from: g, reason: collision with root package name */
        private H2.e f12232g;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f12235j;

        /* renamed from: a, reason: collision with root package name */
        private long f12226a = -1;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<InterfaceC15993a<v>> f12227b = null;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<InterfaceC15993a<v>> f12228c = null;

        /* renamed from: f, reason: collision with root package name */
        private int f12231f = 0;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC15993a<v>[] f12233h = null;

        /* renamed from: i, reason: collision with root package name */
        private final A f12234i = new A();

        @Override // H4.s, H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
            this.f12230e = true;
        }

        public void r() {
            this.f12229d = true;
            ArrayList<InterfaceC15993a<v>> arrayList = this.f12227b;
            if (arrayList != null) {
                this.f12227b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            o();
            int i11 = this.f12231f;
            if (i11 == 1) {
                this.f12231f = 0;
                d();
            } else if (i11 == 2) {
                this.f12231f = 0;
                l(this.f12235j);
            }
        }

        g() {
        }

        public static /* synthetic */ void n(g gVar, H2.b bVar, boolean z10, float f10, float f11) {
            if (z10) {
                gVar.getClass();
                return;
            }
            if (f10 >= 1.0f) {
                AbstractC3664k.this.X(i.f12238b, false);
                return;
            }
            long jC = gVar.c();
            AbstractC3664k abstractC3664kV0 = ((w) AbstractC3664k.this).v0(0);
            AbstractC3664k abstractC3664k = abstractC3664kV0.f12182C;
            abstractC3664kV0.f12182C = null;
            AbstractC3664k.this.h0(-1L, gVar.f12226a);
            AbstractC3664k.this.h0(jC, -1L);
            gVar.f12226a = jC;
            Runnable runnable = gVar.f12235j;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC3664k.this.f12184E.clear();
            if (abstractC3664k != null) {
                abstractC3664k.X(i.f12238b, true);
            }
        }

        private void o() {
            ArrayList<InterfaceC15993a<v>> arrayList = this.f12228c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f12228c.size();
            if (this.f12233h == null) {
                this.f12233h = new InterfaceC15993a[size];
            }
            InterfaceC15993a<v>[] interfaceC15993aArr = (InterfaceC15993a[]) this.f12228c.toArray(this.f12233h);
            this.f12233h = null;
            for (int i10 = 0; i10 < size; i10++) {
                interfaceC15993aArr[i10].accept(this);
                interfaceC15993aArr[i10] = null;
            }
            this.f12233h = interfaceC15993aArr;
        }

        private void p() {
            if (this.f12232g != null) {
                return;
            }
            this.f12234i.a(AnimationUtils.currentAnimationTimeMillis(), this.f12226a);
            this.f12232g = new H2.e(new H2.d());
            H2.f fVar = new H2.f();
            fVar.d(1.0f);
            fVar.f(200.0f);
            this.f12232g.u(fVar);
            this.f12232g.l(this.f12226a);
            this.f12232g.b(this);
            this.f12232g.m(this.f12234i.b());
            this.f12232g.h(c() + 1);
            this.f12232g.i(-1.0f);
            this.f12232g.j(4.0f);
            this.f12232g.a(new b.q() { // from class: H4.m
                @Override // H2.b.q
                public final void a(H2.b bVar, boolean z10, float f10, float f11) {
                    AbstractC3664k.g.n(this.f12242a, bVar, z10, f10, f11);
                }
            });
        }

        @Override // H4.v
        public boolean b() {
            return this.f12229d;
        }

        @Override // H4.v
        public long c() {
            return AbstractC3664k.this.I();
        }

        @Override // H4.v
        public void d() {
            if (this.f12229d) {
                p();
                this.f12232g.r(c() + 1);
            } else {
                this.f12231f = 1;
                this.f12235j = null;
            }
        }

        @Override // H4.v
        public void k(long j10) {
            if (this.f12232g != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f12226a || !b()) {
                return;
            }
            if (!this.f12230e) {
                if (j10 != 0 || this.f12226a <= 0) {
                    long jC = c();
                    if (j10 == jC && this.f12226a < jC) {
                        j10 = 1 + jC;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f12226a;
                if (j10 != j11) {
                    AbstractC3664k.this.h0(j10, j11);
                    this.f12226a = j10;
                }
            }
            o();
            this.f12234i.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // H4.v
        public void l(Runnable runnable) {
            this.f12235j = runnable;
            if (!this.f12229d) {
                this.f12231f = 2;
            } else {
                p();
                this.f12232g.r(0.0f);
            }
        }

        @Override // H2.b.r
        public void e(H2.b bVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(c() + 1, Math.round(f10)));
            AbstractC3664k.this.h0(jMax, this.f12226a);
            this.f12226a = jMax;
            o();
        }

        void q() {
            long j10 = 0;
            if (c() == 0) {
                j10 = 1;
            }
            AbstractC3664k.this.h0(j10, this.f12226a);
            this.f12226a = j10;
        }
    }

    private void e(C5503a<View, y> c5503a, C5503a<View, y> c5503a2) {
        for (int i10 = 0; i10 < c5503a.getSize(); i10++) {
            y yVarK = c5503a.k(i10);
            if (O(yVarK.f12262b)) {
                this.f12210t.add(yVarK);
                this.f12211u.add(null);
            }
        }
        for (int i11 = 0; i11 < c5503a2.getSize(); i11++) {
            y yVarK2 = c5503a2.k(i11);
            if (O(yVarK2.f12262b)) {
                this.f12211u.add(yVarK2);
                this.f12210t.add(null);
            }
        }
    }

    public String[] J() {
        return null;
    }

    public boolean M() {
        return false;
    }

    public boolean N(y yVar, y yVar2) {
        if (yVar != null && yVar2 != null) {
            String[] strArrJ = J();
            if (strArrJ != null) {
                for (String str : strArrJ) {
                    if (P(yVar, yVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = yVar.f12261a.keySet().iterator();
                while (it.hasNext()) {
                    if (P(yVar, yVar2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public abstract void i(y yVar);

    void k(y yVar) {
    }

    public abstract void l(y yVar);

    public void m0(u uVar) {
    }

    public Animator p(ViewGroup viewGroup, y yVar, y yVar2) {
        return null;
    }

    public u z() {
        return null;
    }

    /* renamed from: H4.k$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f12220a;

        /* renamed from: b, reason: collision with root package name */
        String f12221b;

        /* renamed from: c, reason: collision with root package name */
        y f12222c;

        /* renamed from: d, reason: collision with root package name */
        WindowId f12223d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC3664k f12224e;

        /* renamed from: f, reason: collision with root package name */
        Animator f12225f;

        d(View view, String str, AbstractC3664k abstractC3664k, WindowId windowId, y yVar, Animator animator) {
            this.f12220a = view;
            this.f12221b = str;
            this.f12222c = yVar;
            this.f12223d = windowId;
            this.f12224e = abstractC3664k;
            this.f12225f = animator;
        }
    }

    /* renamed from: H4.k$h */
    public interface h {
        void a(AbstractC3664k abstractC3664k);

        void f(AbstractC3664k abstractC3664k);

        void h(AbstractC3664k abstractC3664k);

        void j(AbstractC3664k abstractC3664k);

        void m(AbstractC3664k abstractC3664k);

        default void g(AbstractC3664k abstractC3664k, boolean z10) {
            m(abstractC3664k);
        }

        default void i(AbstractC3664k abstractC3664k, boolean z10) {
            a(abstractC3664k);
        }
    }

    /* renamed from: H4.k$i */
    interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f12237a = new i() { // from class: H4.n
            @Override // H4.AbstractC3664k.i
            public final void c(AbstractC3664k.h hVar, AbstractC3664k abstractC3664k, boolean z10) {
                hVar.g(abstractC3664k, z10);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final i f12238b = new i() { // from class: H4.o
            @Override // H4.AbstractC3664k.i
            public final void c(AbstractC3664k.h hVar, AbstractC3664k abstractC3664k, boolean z10) {
                hVar.i(abstractC3664k, z10);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final i f12239c = new i() { // from class: H4.p
            @Override // H4.AbstractC3664k.i
            public final void c(AbstractC3664k.h hVar, AbstractC3664k abstractC3664k, boolean z10) {
                hVar.j(abstractC3664k);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final i f12240d = new i() { // from class: H4.q
            @Override // H4.AbstractC3664k.i
            public final void c(AbstractC3664k.h hVar, AbstractC3664k abstractC3664k, boolean z10) {
                hVar.f(abstractC3664k);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final i f12241e = new i() { // from class: H4.r
            @Override // H4.AbstractC3664k.i
            public final void c(AbstractC3664k.h hVar, AbstractC3664k abstractC3664k, boolean z10) {
                hVar.h(abstractC3664k);
            }
        };

        void c(h hVar, AbstractC3664k abstractC3664k, boolean z10);
    }

    private static C5503a<Animator, d> C() {
        C5503a<Animator, d> c5503a = f12179O.get();
        if (c5503a != null) {
            return c5503a;
        }
        C5503a<Animator, d> c5503a2 = new C5503a<>();
        f12179O.set(c5503a2);
        return c5503a2;
    }

    private static boolean P(y yVar, y yVar2, String str) {
        Object obj = yVar.f12261a.get(str);
        Object obj2 = yVar2.f12261a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void V(z zVar, z zVar2) {
        C5503a<View, y> c5503a = new C5503a<>(zVar.f12264a);
        C5503a<View, y> c5503a2 = new C5503a<>(zVar2.f12264a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f12209s;
            if (i10 >= iArr.length) {
                e(c5503a, c5503a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                R(c5503a, c5503a2);
            } else if (i11 == 2) {
                U(c5503a, c5503a2, zVar.f12267d, zVar2.f12267d);
            } else if (i11 == 3) {
                Q(c5503a, c5503a2, zVar.f12265b, zVar2.f12265b);
            } else if (i11 == 4) {
                S(c5503a, c5503a2, zVar.f12266c, zVar2.f12266c);
            }
            i10++;
        }
    }

    private void W(AbstractC3664k abstractC3664k, i iVar, boolean z10) {
        AbstractC3664k abstractC3664k2 = this.f12182C;
        if (abstractC3664k2 != null) {
            abstractC3664k2.W(abstractC3664k, iVar, z10);
        }
        ArrayList<h> arrayList = this.f12183D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f12183D.size();
        h[] hVarArr = this.f12212v;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f12212v = null;
        h[] hVarArr2 = (h[]) this.f12183D.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.c(hVarArr2[i10], abstractC3664k, z10);
            hVarArr2[i10] = null;
        }
        this.f12212v = hVarArr2;
    }

    private static void f(z zVar, View view, y yVar) {
        zVar.f12264a.put(view, yVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (zVar.f12265b.indexOfKey(id2) >= 0) {
                zVar.f12265b.put(id2, null);
            } else {
                zVar.f12265b.put(id2, view);
            }
        }
        String strI = ViewCompat.I(view);
        if (strI != null) {
            if (zVar.f12267d.containsKey(strI)) {
                zVar.f12267d.put(strI, null);
            } else {
                zVar.f12267d.put(strI, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.f12266c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zVar.f12266c.i(itemIdAtPosition, view);
                    return;
                }
                View viewD = zVar.f12266c.d(itemIdAtPosition);
                if (viewD != null) {
                    viewD.setHasTransientState(false);
                    zVar.f12266c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void f0(Animator animator, C5503a<Animator, d> c5503a) {
        if (animator != null) {
            animator.addListener(new b(c5503a));
            g(animator);
        }
    }

    private void j(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f12199i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f12200j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f12201k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f12201k.get(i10).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    y yVar = new y(view);
                    if (z10) {
                        l(yVar);
                    } else {
                        i(yVar);
                    }
                    yVar.f12263c.add(this);
                    k(yVar);
                    if (z10) {
                        f(this.f12206p, view, yVar);
                    } else {
                        f(this.f12207q, view, yVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f12203m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f12204n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f12205o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f12205o.get(i11).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                j(viewGroup.getChildAt(i12), z10);
                            }
                        }
                    }
                }
            }
        }
    }

    public final AbstractC3664k A() {
        w wVar = this.f12208r;
        return wVar != null ? wVar.A() : this;
    }

    public long D() {
        return this.f12192b;
    }

    public List<Integer> E() {
        return this.f12195e;
    }

    public List<String> F() {
        return this.f12197g;
    }

    public List<Class<?>> G() {
        return this.f12198h;
    }

    public List<View> H() {
        return this.f12196f;
    }

    final long I() {
        return this.f12188I;
    }

    public y K(View view, boolean z10) {
        w wVar = this.f12208r;
        if (wVar != null) {
            return wVar.K(view, z10);
        }
        return (z10 ? this.f12206p : this.f12207q).f12264a.get(view);
    }

    boolean L() {
        return !this.f12214x.isEmpty();
    }

    public void Y(View view) {
        if (this.f12181B) {
            return;
        }
        int size = this.f12214x.size();
        Animator[] animatorArr = (Animator[]) this.f12214x.toArray(this.f12215y);
        this.f12215y = f12176L;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f12215y = animatorArr;
        X(i.f12240d, false);
        this.f12180A = true;
    }

    void Z(ViewGroup viewGroup) {
        d dVar;
        this.f12210t = new ArrayList<>();
        this.f12211u = new ArrayList<>();
        V(this.f12206p, this.f12207q);
        C5503a<Animator, d> c5503aC = C();
        int size = c5503aC.getSize();
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorG = c5503aC.g(i10);
            if (animatorG != null && (dVar = c5503aC.get(animatorG)) != null && dVar.f12220a != null && windowId.equals(dVar.f12223d)) {
                y yVar = dVar.f12222c;
                View view = dVar.f12220a;
                y yVarK = K(view, true);
                y yVarW = w(view, true);
                if (yVarK == null && yVarW == null) {
                    yVarW = this.f12207q.f12264a.get(view);
                }
                if ((yVarK != null || yVarW != null) && dVar.f12224e.N(yVar, yVarW)) {
                    AbstractC3664k abstractC3664k = dVar.f12224e;
                    if (abstractC3664k.A().f12189J != null) {
                        animatorG.cancel();
                        abstractC3664k.f12214x.remove(animatorG);
                        c5503aC.i(i10);
                        if (abstractC3664k.f12214x.size() == 0) {
                            arrayList.add(abstractC3664k);
                        }
                    } else if (animatorG.isRunning() || animatorG.isStarted()) {
                        animatorG.cancel();
                    } else {
                        c5503aC.i(i10);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            AbstractC3664k abstractC3664k2 = (AbstractC3664k) arrayList.get(i11);
            abstractC3664k2.X(i.f12239c, false);
            if (!abstractC3664k2.f12181B) {
                abstractC3664k2.f12181B = true;
                abstractC3664k2.X(i.f12238b, false);
            }
        }
        q(viewGroup, this.f12206p, this.f12207q, this.f12210t, this.f12211u);
        if (this.f12189J == null) {
            g0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            a0();
            this.f12189J.q();
            this.f12189J.r();
        }
    }

    public AbstractC3664k b0(h hVar) {
        AbstractC3664k abstractC3664k;
        ArrayList<h> arrayList = this.f12183D;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (abstractC3664k = this.f12182C) != null) {
                abstractC3664k.b0(hVar);
            }
            if (this.f12183D.size() == 0) {
                this.f12183D = null;
            }
        }
        return this;
    }

    public AbstractC3664k c(h hVar) {
        if (this.f12183D == null) {
            this.f12183D = new ArrayList<>();
        }
        this.f12183D.add(hVar);
        return this;
    }

    protected void cancel() {
        int size = this.f12214x.size();
        Animator[] animatorArr = (Animator[]) this.f12214x.toArray(this.f12215y);
        this.f12215y = f12176L;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f12215y = animatorArr;
        X(i.f12239c, false);
    }

    public AbstractC3664k d(View view) {
        this.f12196f.add(view);
        return this;
    }

    public AbstractC3664k d0(View view) {
        this.f12196f.remove(view);
        return this;
    }

    public void e0(View view) {
        if (this.f12180A) {
            if (!this.f12181B) {
                int size = this.f12214x.size();
                Animator[] animatorArr = (Animator[]) this.f12214x.toArray(this.f12215y);
                this.f12215y = f12176L;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f12215y = animatorArr;
                X(i.f12241e, false);
            }
            this.f12180A = false;
        }
    }

    protected void g(Animator animator) {
        if (animator == null) {
            s();
            return;
        }
        if (t() >= 0) {
            animator.setDuration(t());
        }
        if (D() >= 0) {
            animator.setStartDelay(D() + animator.getStartDelay());
        }
        if (v() != null) {
            animator.setInterpolator(v());
        }
        animator.addListener(new c());
        animator.start();
    }

    void h0(long j10, long j11) {
        long jI = I();
        int i10 = 0;
        boolean z10 = j10 < j11;
        if ((j11 < 0 && j10 >= 0) || (j11 > jI && j10 <= jI)) {
            this.f12181B = false;
            X(i.f12237a, z10);
        }
        int size = this.f12214x.size();
        Animator[] animatorArr = (Animator[]) this.f12214x.toArray(this.f12215y);
        this.f12215y = f12176L;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0L, j10), f.a(animator)));
            i10++;
            jI = jI;
        }
        long j12 = jI;
        this.f12215y = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f12181B = true;
        }
        X(i.f12238b, z10);
    }

    public AbstractC3664k i0(long j10) {
        this.f12193c = j10;
        return this;
    }

    public void j0(e eVar) {
        this.f12185F = eVar;
    }

    public AbstractC3664k k0(TimeInterpolator timeInterpolator) {
        this.f12194d = timeInterpolator;
        return this;
    }

    public void l0(AbstractC3660g abstractC3660g) {
        if (abstractC3660g == null) {
            this.f12187H = f12178N;
        } else {
            this.f12187H = abstractC3660g;
        }
    }

    void n(boolean z10) {
        if (z10) {
            this.f12206p.f12264a.clear();
            this.f12206p.f12265b.clear();
            this.f12206p.f12266c.a();
        } else {
            this.f12207q.f12264a.clear();
            this.f12207q.f12265b.clear();
            this.f12207q.f12266c.a();
        }
    }

    public AbstractC3664k n0(long j10) {
        this.f12192b = j10;
        return this;
    }

    protected void o0() {
        if (this.f12216z == 0) {
            X(i.f12237a, false);
            this.f12181B = false;
        }
        this.f12216z++;
    }

    String p0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f12193c != -1) {
            sb2.append("dur(");
            sb2.append(this.f12193c);
            sb2.append(") ");
        }
        if (this.f12192b != -1) {
            sb2.append("dly(");
            sb2.append(this.f12192b);
            sb2.append(") ");
        }
        if (this.f12194d != null) {
            sb2.append("interp(");
            sb2.append(this.f12194d);
            sb2.append(") ");
        }
        if (this.f12195e.size() > 0 || this.f12196f.size() > 0) {
            sb2.append("tgts(");
            if (this.f12195e.size() > 0) {
                for (int i10 = 0; i10 < this.f12195e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f12195e.get(i10));
                }
            }
            if (this.f12196f.size() > 0) {
                for (int i11 = 0; i11 < this.f12196f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f12196f.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    void q(ViewGroup viewGroup, z zVar, z zVar2, ArrayList<y> arrayList, ArrayList<y> arrayList2) {
        View view;
        y yVar;
        Animator animator;
        Animator animator2;
        AbstractC3664k abstractC3664k = this;
        C5503a<Animator, d> c5503aC = C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z10 = abstractC3664k.A().f12189J != null;
        for (int i10 = 0; i10 < size; i10++) {
            y yVar2 = arrayList.get(i10);
            y yVar3 = arrayList2.get(i10);
            if (yVar2 != null && !yVar2.f12263c.contains(abstractC3664k)) {
                yVar2 = null;
            }
            if (yVar3 != null && !yVar3.f12263c.contains(abstractC3664k)) {
                yVar3 = null;
            }
            if ((yVar2 != null || yVar3 != null) && (yVar2 == null || yVar3 == null || abstractC3664k.N(yVar2, yVar3))) {
                Animator animatorP = abstractC3664k.p(viewGroup, yVar2, yVar3);
                if (animatorP != null) {
                    if (yVar3 != null) {
                        view = yVar3.f12262b;
                        String[] strArrJ = abstractC3664k.J();
                        if (strArrJ != null && strArrJ.length > 0) {
                            yVar = new y(view);
                            y yVar4 = zVar2.f12264a.get(view);
                            if (yVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrJ.length) {
                                    Map<String, Object> map = yVar.f12261a;
                                    String[] strArr = strArrJ;
                                    String str = strArr[i11];
                                    map.put(str, yVar4.f12261a.get(str));
                                    i11++;
                                    strArrJ = strArr;
                                    animatorP = animatorP;
                                }
                            }
                            Animator animator3 = animatorP;
                            int size2 = c5503aC.getSize();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = c5503aC.get(c5503aC.g(i12));
                                if (dVar.f12222c != null && dVar.f12220a == view && dVar.f12221b.equals(x()) && dVar.f12222c.equals(yVar)) {
                                    animator2 = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            animator2 = animatorP;
                            yVar = null;
                        }
                        animatorP = animator2;
                    } else {
                        view = yVar2.f12262b;
                        yVar = null;
                    }
                    View view2 = view;
                    if (animatorP != null) {
                        Animator animator4 = animatorP;
                        abstractC3664k = this;
                        d dVar2 = new d(view2, x(), abstractC3664k, viewGroup.getWindowId(), yVar, animator4);
                        if (z10) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator4);
                            animator = animatorSet;
                        } else {
                            animator = animator4;
                        }
                        c5503aC.put(animator, dVar2);
                        abstractC3664k.f12184E.add(animator);
                    } else {
                        abstractC3664k = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar3 = c5503aC.get(abstractC3664k.f12184E.get(sparseIntArray.keyAt(i13)));
                dVar3.f12225f.setStartDelay((sparseIntArray.valueAt(i13) - Long.MAX_VALUE) + dVar3.f12225f.getStartDelay());
            }
        }
    }

    v r() {
        g gVar = new g();
        this.f12189J = gVar;
        c(gVar);
        return this.f12189J;
    }

    protected void s() {
        int i10 = this.f12216z - 1;
        this.f12216z = i10;
        if (i10 == 0) {
            X(i.f12238b, false);
            for (int i11 = 0; i11 < this.f12206p.f12266c.m(); i11++) {
                View viewN = this.f12206p.f12266c.n(i11);
                if (viewN != null) {
                    viewN.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f12207q.f12266c.m(); i12++) {
                View viewN2 = this.f12207q.f12266c.n(i12);
                if (viewN2 != null) {
                    viewN2.setHasTransientState(false);
                }
            }
            this.f12181B = true;
        }
    }

    public long t() {
        return this.f12193c;
    }

    public String toString() {
        return p0("");
    }

    public e u() {
        return this.f12185F;
    }

    public TimeInterpolator v() {
        return this.f12194d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f12211u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f12210t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    H4.y w(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            H4.w r0 = r5.f12208r
            if (r0 == 0) goto L9
            H4.y r6 = r0.w(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<H4.y> r0 = r5.f12210t
            goto L10
        Le:
            java.util.ArrayList<H4.y> r0 = r5.f12211u
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            H4.y r4 = (H4.y) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f12262b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList<H4.y> r6 = r5.f12211u
            goto L36
        L34:
            java.util.ArrayList<H4.y> r6 = r5.f12210t
        L36:
            java.lang.Object r6 = r6.get(r3)
            H4.y r6 = (H4.y) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.AbstractC3664k.w(android.view.View, boolean):H4.y");
    }

    public String x() {
        return this.f12191a;
    }

    public AbstractC3660g y() {
        return this.f12187H;
    }

    private void Q(C5503a<View, y> c5503a, C5503a<View, y> c5503a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && O(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && O(view)) {
                y yVar = c5503a.get(viewValueAt);
                y yVar2 = c5503a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f12210t.add(yVar);
                    this.f12211u.add(yVar2);
                    c5503a.remove(viewValueAt);
                    c5503a2.remove(view);
                }
            }
        }
    }

    private void R(C5503a<View, y> c5503a, C5503a<View, y> c5503a2) {
        y yVarRemove;
        for (int size = c5503a.getSize() - 1; size >= 0; size--) {
            View viewG = c5503a.g(size);
            if (viewG != null && O(viewG) && (yVarRemove = c5503a2.remove(viewG)) != null && O(yVarRemove.f12262b)) {
                this.f12210t.add(c5503a.i(size));
                this.f12211u.add(yVarRemove);
            }
        }
    }

    private void S(C5503a<View, y> c5503a, C5503a<View, y> c5503a2, Z.C<View> c10, Z.C<View> c11) {
        View viewD;
        int iM = c10.m();
        for (int i10 = 0; i10 < iM; i10++) {
            View viewN = c10.n(i10);
            if (viewN != null && O(viewN) && (viewD = c11.d(c10.g(i10))) != null && O(viewD)) {
                y yVar = c5503a.get(viewN);
                y yVar2 = c5503a2.get(viewD);
                if (yVar != null && yVar2 != null) {
                    this.f12210t.add(yVar);
                    this.f12211u.add(yVar2);
                    c5503a.remove(viewN);
                    c5503a2.remove(viewD);
                }
            }
        }
    }

    private void U(C5503a<View, y> c5503a, C5503a<View, y> c5503a2, C5503a<String, View> c5503a3, C5503a<String, View> c5503a4) {
        View view;
        int size = c5503a3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            View viewK = c5503a3.k(i10);
            if (viewK != null && O(viewK) && (view = c5503a4.get(c5503a3.g(i10))) != null && O(view)) {
                y yVar = c5503a.get(viewK);
                y yVar2 = c5503a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f12210t.add(yVar);
                    this.f12211u.add(yVar2);
                    c5503a.remove(viewK);
                    c5503a2.remove(view);
                }
            }
        }
    }

    boolean O(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f12199i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f12200j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f12201k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f12201k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f12202l != null && ViewCompat.I(view) != null && this.f12202l.contains(ViewCompat.I(view))) {
            return false;
        }
        if ((this.f12195e.size() == 0 && this.f12196f.size() == 0 && (((arrayList = this.f12198h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12197g) == null || arrayList2.isEmpty()))) || this.f12195e.contains(Integer.valueOf(id2)) || this.f12196f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f12197g;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.I(view))) {
            return true;
        }
        if (this.f12198h != null) {
            for (int i11 = 0; i11 < this.f12198h.size(); i11++) {
                if (this.f12198h.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void X(i iVar, boolean z10) {
        W(this, iVar, z10);
    }

    void a0() {
        C5503a<Animator, d> c5503aC = C();
        this.f12188I = 0L;
        for (int i10 = 0; i10 < this.f12184E.size(); i10++) {
            Animator animator = this.f12184E.get(i10);
            d dVar = c5503aC.get(animator);
            if (animator != null && dVar != null) {
                if (t() >= 0) {
                    dVar.f12225f.setDuration(t());
                }
                if (D() >= 0) {
                    dVar.f12225f.setStartDelay(D() + dVar.f12225f.getStartDelay());
                }
                if (v() != null) {
                    dVar.f12225f.setInterpolator(v());
                }
                this.f12214x.add(animator);
                this.f12188I = Math.max(this.f12188I, f.a(animator));
            }
        }
        this.f12184E.clear();
    }

    protected void g0() {
        o0();
        C5503a<Animator, d> c5503aC = C();
        Iterator<Animator> it = this.f12184E.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c5503aC.containsKey(next)) {
                o0();
                f0(next, c5503aC);
            }
        }
        this.f12184E.clear();
        s();
    }

    void m(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C5503a<String, String> c5503a;
        n(z10);
        if ((this.f12195e.size() <= 0 && this.f12196f.size() <= 0) || (((arrayList = this.f12197g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f12198h) != null && !arrayList2.isEmpty()))) {
            j(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.f12195e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f12195e.get(i10).intValue());
                if (viewFindViewById != null) {
                    y yVar = new y(viewFindViewById);
                    if (z10) {
                        l(yVar);
                    } else {
                        i(yVar);
                    }
                    yVar.f12263c.add(this);
                    k(yVar);
                    if (z10) {
                        f(this.f12206p, viewFindViewById, yVar);
                    } else {
                        f(this.f12207q, viewFindViewById, yVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f12196f.size(); i11++) {
                View view = this.f12196f.get(i11);
                y yVar2 = new y(view);
                if (z10) {
                    l(yVar2);
                } else {
                    i(yVar2);
                }
                yVar2.f12263c.add(this);
                k(yVar2);
                if (z10) {
                    f(this.f12206p, view, yVar2);
                } else {
                    f(this.f12207q, view, yVar2);
                }
            }
        }
        if (!z10 && (c5503a = this.f12186G) != null) {
            int size = c5503a.getSize();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f12206p.f12267d.remove(this.f12186G.g(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f12206p.f12267d.put(this.f12186G.k(i13), view2);
                }
            }
        }
    }

    @Override // 
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3664k clone() {
        try {
            AbstractC3664k abstractC3664k = (AbstractC3664k) super.clone();
            abstractC3664k.f12184E = new ArrayList<>();
            abstractC3664k.f12206p = new z();
            abstractC3664k.f12207q = new z();
            abstractC3664k.f12210t = null;
            abstractC3664k.f12211u = null;
            abstractC3664k.f12189J = null;
            abstractC3664k.f12182C = this;
            abstractC3664k.f12183D = null;
            return abstractC3664k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
