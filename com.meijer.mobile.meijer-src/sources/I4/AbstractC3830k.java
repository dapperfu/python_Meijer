package I4;

import H2.b;
import I4.AbstractC3830k;
import Z.C5603a;
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
import o2.InterfaceC16068a;

/* renamed from: I4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3830k implements Cloneable {

    /* renamed from: L, reason: collision with root package name */
    private static final Animator[] f14240L = new Animator[0];

    /* renamed from: M, reason: collision with root package name */
    private static final int[] f14241M = {2, 1, 3, 4};

    /* renamed from: N, reason: collision with root package name */
    private static final AbstractC3826g f14242N = new a();

    /* renamed from: O, reason: collision with root package name */
    private static ThreadLocal<C5603a<Animator, d>> f14243O = new ThreadLocal<>();

    /* renamed from: F, reason: collision with root package name */
    private e f14249F;

    /* renamed from: G, reason: collision with root package name */
    private C5603a<String, String> f14250G;

    /* renamed from: I, reason: collision with root package name */
    long f14252I;

    /* renamed from: J, reason: collision with root package name */
    g f14253J;

    /* renamed from: K, reason: collision with root package name */
    long f14254K;

    /* renamed from: t, reason: collision with root package name */
    private ArrayList<y> f14274t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<y> f14275u;

    /* renamed from: v, reason: collision with root package name */
    private h[] f14276v;

    /* renamed from: a, reason: collision with root package name */
    private String f14255a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    private long f14256b = -1;

    /* renamed from: c, reason: collision with root package name */
    long f14257c = -1;

    /* renamed from: d, reason: collision with root package name */
    private TimeInterpolator f14258d = null;

    /* renamed from: e, reason: collision with root package name */
    ArrayList<Integer> f14259e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    ArrayList<View> f14260f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<String> f14261g = null;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<Class<?>> f14262h = null;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<Integer> f14263i = null;

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<View> f14264j = null;

    /* renamed from: k, reason: collision with root package name */
    private ArrayList<Class<?>> f14265k = null;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<String> f14266l = null;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<Integer> f14267m = null;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<View> f14268n = null;

    /* renamed from: o, reason: collision with root package name */
    private ArrayList<Class<?>> f14269o = null;

    /* renamed from: p, reason: collision with root package name */
    private z f14270p = new z();

    /* renamed from: q, reason: collision with root package name */
    private z f14271q = new z();

    /* renamed from: r, reason: collision with root package name */
    w f14272r = null;

    /* renamed from: s, reason: collision with root package name */
    private int[] f14273s = f14241M;

    /* renamed from: w, reason: collision with root package name */
    boolean f14277w = false;

    /* renamed from: x, reason: collision with root package name */
    ArrayList<Animator> f14278x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    private Animator[] f14279y = f14240L;

    /* renamed from: z, reason: collision with root package name */
    int f14280z = 0;

    /* renamed from: A, reason: collision with root package name */
    private boolean f14244A = false;

    /* renamed from: B, reason: collision with root package name */
    boolean f14245B = false;

    /* renamed from: C, reason: collision with root package name */
    private AbstractC3830k f14246C = null;

    /* renamed from: D, reason: collision with root package name */
    private ArrayList<h> f14247D = null;

    /* renamed from: E, reason: collision with root package name */
    ArrayList<Animator> f14248E = new ArrayList<>();

    /* renamed from: H, reason: collision with root package name */
    private AbstractC3826g f14251H = f14242N;

    /* renamed from: I4.k$a */
    class a extends AbstractC3826g {
        @Override // I4.AbstractC3826g
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }

        a() {
        }
    }

    /* renamed from: I4.k$b */
    class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C5603a f14281a;

        b(C5603a c5603a) {
            this.f14281a = c5603a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14281a.remove(animator);
            AbstractC3830k.this.f14278x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC3830k.this.f14278x.add(animator);
        }
    }

    /* renamed from: I4.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3830k.this.s();
            animator.removeListener(this);
        }
    }

    /* renamed from: I4.k$e */
    public static abstract class e {
    }

    /* renamed from: I4.k$f */
    private static class f {
        static void b(Animator animator, long j10) {
            ((AnimatorSet) animator).setCurrentPlayTime(j10);
        }

        static long a(Animator animator) {
            return animator.getTotalDuration();
        }
    }

    /* renamed from: I4.k$g */
    class g extends s implements v, b.r {

        /* renamed from: d, reason: collision with root package name */
        private boolean f14293d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14294e;

        /* renamed from: g, reason: collision with root package name */
        private H2.e f14296g;

        /* renamed from: j, reason: collision with root package name */
        private Runnable f14299j;

        /* renamed from: a, reason: collision with root package name */
        private long f14290a = -1;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<InterfaceC16068a<v>> f14291b = null;

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<InterfaceC16068a<v>> f14292c = null;

        /* renamed from: f, reason: collision with root package name */
        private int f14295f = 0;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC16068a<v>[] f14297h = null;

        /* renamed from: i, reason: collision with root package name */
        private final A f14298i = new A();

        @Override // I4.s, I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
            this.f14294e = true;
        }

        public void r() {
            this.f14293d = true;
            ArrayList<InterfaceC16068a<v>> arrayList = this.f14291b;
            if (arrayList != null) {
                this.f14291b = null;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    arrayList.get(i10).accept(this);
                }
            }
            o();
            int i11 = this.f14295f;
            if (i11 == 1) {
                this.f14295f = 0;
                d();
            } else if (i11 == 2) {
                this.f14295f = 0;
                k(this.f14299j);
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
                AbstractC3830k.this.X(i.f14302b, false);
                return;
            }
            long jC = gVar.c();
            AbstractC3830k abstractC3830kV0 = ((w) AbstractC3830k.this).v0(0);
            AbstractC3830k abstractC3830k = abstractC3830kV0.f14246C;
            abstractC3830kV0.f14246C = null;
            AbstractC3830k.this.h0(-1L, gVar.f14290a);
            AbstractC3830k.this.h0(jC, -1L);
            gVar.f14290a = jC;
            Runnable runnable = gVar.f14299j;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC3830k.this.f14248E.clear();
            if (abstractC3830k != null) {
                abstractC3830k.X(i.f14302b, true);
            }
        }

        private void o() {
            ArrayList<InterfaceC16068a<v>> arrayList = this.f14292c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f14292c.size();
            if (this.f14297h == null) {
                this.f14297h = new InterfaceC16068a[size];
            }
            InterfaceC16068a<v>[] interfaceC16068aArr = (InterfaceC16068a[]) this.f14292c.toArray(this.f14297h);
            this.f14297h = null;
            for (int i10 = 0; i10 < size; i10++) {
                interfaceC16068aArr[i10].accept(this);
                interfaceC16068aArr[i10] = null;
            }
            this.f14297h = interfaceC16068aArr;
        }

        private void p() {
            if (this.f14296g != null) {
                return;
            }
            this.f14298i.a(AnimationUtils.currentAnimationTimeMillis(), this.f14290a);
            this.f14296g = new H2.e(new H2.d());
            H2.f fVar = new H2.f();
            fVar.d(1.0f);
            fVar.f(200.0f);
            this.f14296g.u(fVar);
            this.f14296g.l(this.f14290a);
            this.f14296g.b(this);
            this.f14296g.m(this.f14298i.b());
            this.f14296g.h(c() + 1);
            this.f14296g.i(-1.0f);
            this.f14296g.j(4.0f);
            this.f14296g.a(new b.q() { // from class: I4.m
                @Override // H2.b.q
                public final void a(H2.b bVar, boolean z10, float f10, float f11) {
                    AbstractC3830k.g.n(this.f14306a, bVar, z10, f10, f11);
                }
            });
        }

        @Override // I4.v
        public boolean b() {
            return this.f14293d;
        }

        @Override // I4.v
        public long c() {
            return AbstractC3830k.this.I();
        }

        @Override // I4.v
        public void d() {
            if (this.f14293d) {
                p();
                this.f14296g.r(c() + 1);
            } else {
                this.f14295f = 1;
                this.f14299j = null;
            }
        }

        @Override // I4.v
        public void h(long j10) {
            if (this.f14296g != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j10 == this.f14290a || !b()) {
                return;
            }
            if (!this.f14294e) {
                if (j10 != 0 || this.f14290a <= 0) {
                    long jC = c();
                    if (j10 == jC && this.f14290a < jC) {
                        j10 = 1 + jC;
                    }
                } else {
                    j10 = -1;
                }
                long j11 = this.f14290a;
                if (j10 != j11) {
                    AbstractC3830k.this.h0(j10, j11);
                    this.f14290a = j10;
                }
            }
            o();
            this.f14298i.a(AnimationUtils.currentAnimationTimeMillis(), j10);
        }

        @Override // I4.v
        public void k(Runnable runnable) {
            this.f14299j = runnable;
            if (!this.f14293d) {
                this.f14295f = 2;
            } else {
                p();
                this.f14296g.r(0.0f);
            }
        }

        @Override // H2.b.r
        public void a(H2.b bVar, float f10, float f11) {
            long jMax = Math.max(-1L, Math.min(c() + 1, Math.round(f10)));
            AbstractC3830k.this.h0(jMax, this.f14290a);
            this.f14290a = jMax;
            o();
        }

        void q() {
            long j10 = 0;
            if (c() == 0) {
                j10 = 1;
            }
            AbstractC3830k.this.h0(j10, this.f14290a);
            this.f14290a = j10;
        }
    }

    private void e(C5603a<View, y> c5603a, C5603a<View, y> c5603a2) {
        for (int i10 = 0; i10 < c5603a.getSize(); i10++) {
            y yVarK = c5603a.k(i10);
            if (O(yVarK.f14326b)) {
                this.f14274t.add(yVarK);
                this.f14275u.add(null);
            }
        }
        for (int i11 = 0; i11 < c5603a2.getSize(); i11++) {
            y yVarK2 = c5603a2.k(i11);
            if (O(yVarK2.f14326b)) {
                this.f14275u.add(yVarK2);
                this.f14274t.add(null);
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
                Iterator<String> it = yVar.f14325a.keySet().iterator();
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

    /* renamed from: I4.k$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        View f14284a;

        /* renamed from: b, reason: collision with root package name */
        String f14285b;

        /* renamed from: c, reason: collision with root package name */
        y f14286c;

        /* renamed from: d, reason: collision with root package name */
        WindowId f14287d;

        /* renamed from: e, reason: collision with root package name */
        AbstractC3830k f14288e;

        /* renamed from: f, reason: collision with root package name */
        Animator f14289f;

        d(View view, String str, AbstractC3830k abstractC3830k, WindowId windowId, y yVar, Animator animator) {
            this.f14284a = view;
            this.f14285b = str;
            this.f14286c = yVar;
            this.f14287d = windowId;
            this.f14288e = abstractC3830k;
            this.f14289f = animator;
        }
    }

    /* renamed from: I4.k$h */
    public interface h {
        void e(AbstractC3830k abstractC3830k);

        void g(AbstractC3830k abstractC3830k);

        void j(AbstractC3830k abstractC3830k);

        void l(AbstractC3830k abstractC3830k);

        void m(AbstractC3830k abstractC3830k);

        default void f(AbstractC3830k abstractC3830k, boolean z10) {
            l(abstractC3830k);
        }

        default void i(AbstractC3830k abstractC3830k, boolean z10) {
            j(abstractC3830k);
        }
    }

    /* renamed from: I4.k$i */
    interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f14301a = new i() { // from class: I4.n
            @Override // I4.AbstractC3830k.i
            public final void b(AbstractC3830k.h hVar, AbstractC3830k abstractC3830k, boolean z10) {
                hVar.f(abstractC3830k, z10);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final i f14302b = new i() { // from class: I4.o
            @Override // I4.AbstractC3830k.i
            public final void b(AbstractC3830k.h hVar, AbstractC3830k abstractC3830k, boolean z10) {
                hVar.i(abstractC3830k, z10);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final i f14303c = new i() { // from class: I4.p
            @Override // I4.AbstractC3830k.i
            public final void b(AbstractC3830k.h hVar, AbstractC3830k abstractC3830k, boolean z10) {
                hVar.m(abstractC3830k);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final i f14304d = new i() { // from class: I4.q
            @Override // I4.AbstractC3830k.i
            public final void b(AbstractC3830k.h hVar, AbstractC3830k abstractC3830k, boolean z10) {
                hVar.g(abstractC3830k);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final i f14305e = new i() { // from class: I4.r
            @Override // I4.AbstractC3830k.i
            public final void b(AbstractC3830k.h hVar, AbstractC3830k abstractC3830k, boolean z10) {
                hVar.e(abstractC3830k);
            }
        };

        void b(h hVar, AbstractC3830k abstractC3830k, boolean z10);
    }

    private static C5603a<Animator, d> C() {
        C5603a<Animator, d> c5603a = f14243O.get();
        if (c5603a != null) {
            return c5603a;
        }
        C5603a<Animator, d> c5603a2 = new C5603a<>();
        f14243O.set(c5603a2);
        return c5603a2;
    }

    private static boolean P(y yVar, y yVar2, String str) {
        Object obj = yVar.f14325a.get(str);
        Object obj2 = yVar2.f14325a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void V(z zVar, z zVar2) {
        C5603a<View, y> c5603a = new C5603a<>(zVar.f14328a);
        C5603a<View, y> c5603a2 = new C5603a<>(zVar2.f14328a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.f14273s;
            if (i10 >= iArr.length) {
                e(c5603a, c5603a2);
                return;
            }
            int i11 = iArr[i10];
            if (i11 == 1) {
                R(c5603a, c5603a2);
            } else if (i11 == 2) {
                U(c5603a, c5603a2, zVar.f14331d, zVar2.f14331d);
            } else if (i11 == 3) {
                Q(c5603a, c5603a2, zVar.f14329b, zVar2.f14329b);
            } else if (i11 == 4) {
                S(c5603a, c5603a2, zVar.f14330c, zVar2.f14330c);
            }
            i10++;
        }
    }

    private void W(AbstractC3830k abstractC3830k, i iVar, boolean z10) {
        AbstractC3830k abstractC3830k2 = this.f14246C;
        if (abstractC3830k2 != null) {
            abstractC3830k2.W(abstractC3830k, iVar, z10);
        }
        ArrayList<h> arrayList = this.f14247D;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f14247D.size();
        h[] hVarArr = this.f14276v;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f14276v = null;
        h[] hVarArr2 = (h[]) this.f14247D.toArray(hVarArr);
        for (int i10 = 0; i10 < size; i10++) {
            iVar.b(hVarArr2[i10], abstractC3830k, z10);
            hVarArr2[i10] = null;
        }
        this.f14276v = hVarArr2;
    }

    private static void f(z zVar, View view, y yVar) {
        zVar.f14328a.put(view, yVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (zVar.f14329b.indexOfKey(id2) >= 0) {
                zVar.f14329b.put(id2, null);
            } else {
                zVar.f14329b.put(id2, view);
            }
        }
        String strI = ViewCompat.I(view);
        if (strI != null) {
            if (zVar.f14331d.containsKey(strI)) {
                zVar.f14331d.put(strI, null);
            } else {
                zVar.f14331d.put(strI, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.f14330c.e(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zVar.f14330c.i(itemIdAtPosition, view);
                    return;
                }
                View viewD = zVar.f14330c.d(itemIdAtPosition);
                if (viewD != null) {
                    viewD.setHasTransientState(false);
                    zVar.f14330c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void f0(Animator animator, C5603a<Animator, d> c5603a) {
        if (animator != null) {
            animator.addListener(new b(c5603a));
            g(animator);
        }
    }

    private void j(View view, boolean z10) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f14263i;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f14264j;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f14265k;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f14265k.get(i10).isInstance(view)) {
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
                    yVar.f14327c.add(this);
                    k(yVar);
                    if (z10) {
                        f(this.f14270p, view, yVar);
                    } else {
                        f(this.f14271q, view, yVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f14267m;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f14268n;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f14269o;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i11 = 0; i11 < size2; i11++) {
                                    if (this.f14269o.get(i11).isInstance(view)) {
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

    public final AbstractC3830k A() {
        w wVar = this.f14272r;
        return wVar != null ? wVar.A() : this;
    }

    public long D() {
        return this.f14256b;
    }

    public List<Integer> E() {
        return this.f14259e;
    }

    public List<String> F() {
        return this.f14261g;
    }

    public List<Class<?>> G() {
        return this.f14262h;
    }

    public List<View> H() {
        return this.f14260f;
    }

    final long I() {
        return this.f14252I;
    }

    public y K(View view, boolean z10) {
        w wVar = this.f14272r;
        if (wVar != null) {
            return wVar.K(view, z10);
        }
        return (z10 ? this.f14270p : this.f14271q).f14328a.get(view);
    }

    boolean L() {
        return !this.f14278x.isEmpty();
    }

    public void Y(View view) {
        if (this.f14245B) {
            return;
        }
        int size = this.f14278x.size();
        Animator[] animatorArr = (Animator[]) this.f14278x.toArray(this.f14279y);
        this.f14279y = f14240L;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.pause();
        }
        this.f14279y = animatorArr;
        X(i.f14304d, false);
        this.f14244A = true;
    }

    void Z(ViewGroup viewGroup) {
        d dVar;
        this.f14274t = new ArrayList<>();
        this.f14275u = new ArrayList<>();
        V(this.f14270p, this.f14271q);
        C5603a<Animator, d> c5603aC = C();
        int size = c5603aC.getSize();
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animatorG = c5603aC.g(i10);
            if (animatorG != null && (dVar = c5603aC.get(animatorG)) != null && dVar.f14284a != null && windowId.equals(dVar.f14287d)) {
                y yVar = dVar.f14286c;
                View view = dVar.f14284a;
                y yVarK = K(view, true);
                y yVarW = w(view, true);
                if (yVarK == null && yVarW == null) {
                    yVarW = this.f14271q.f14328a.get(view);
                }
                if ((yVarK != null || yVarW != null) && dVar.f14288e.N(yVar, yVarW)) {
                    AbstractC3830k abstractC3830k = dVar.f14288e;
                    if (abstractC3830k.A().f14253J != null) {
                        animatorG.cancel();
                        abstractC3830k.f14278x.remove(animatorG);
                        c5603aC.i(i10);
                        if (abstractC3830k.f14278x.size() == 0) {
                            arrayList.add(abstractC3830k);
                        }
                    } else if (animatorG.isRunning() || animatorG.isStarted()) {
                        animatorG.cancel();
                    } else {
                        c5603aC.i(i10);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            AbstractC3830k abstractC3830k2 = (AbstractC3830k) arrayList.get(i11);
            abstractC3830k2.X(i.f14303c, false);
            if (!abstractC3830k2.f14245B) {
                abstractC3830k2.f14245B = true;
                abstractC3830k2.X(i.f14302b, false);
            }
        }
        q(viewGroup, this.f14270p, this.f14271q, this.f14274t, this.f14275u);
        if (this.f14253J == null) {
            g0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            a0();
            this.f14253J.q();
            this.f14253J.r();
        }
    }

    public AbstractC3830k c(h hVar) {
        if (this.f14247D == null) {
            this.f14247D = new ArrayList<>();
        }
        this.f14247D.add(hVar);
        return this;
    }

    public AbstractC3830k c0(h hVar) {
        AbstractC3830k abstractC3830k;
        ArrayList<h> arrayList = this.f14247D;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (abstractC3830k = this.f14246C) != null) {
                abstractC3830k.c0(hVar);
            }
            if (this.f14247D.size() == 0) {
                this.f14247D = null;
            }
        }
        return this;
    }

    protected void cancel() {
        int size = this.f14278x.size();
        Animator[] animatorArr = (Animator[]) this.f14278x.toArray(this.f14279y);
        this.f14279y = f14240L;
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            animator.cancel();
        }
        this.f14279y = animatorArr;
        X(i.f14303c, false);
    }

    public AbstractC3830k d(View view) {
        this.f14260f.add(view);
        return this;
    }

    public AbstractC3830k d0(View view) {
        this.f14260f.remove(view);
        return this;
    }

    public void e0(View view) {
        if (this.f14244A) {
            if (!this.f14245B) {
                int size = this.f14278x.size();
                Animator[] animatorArr = (Animator[]) this.f14278x.toArray(this.f14279y);
                this.f14279y = f14240L;
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    Animator animator = animatorArr[i10];
                    animatorArr[i10] = null;
                    animator.resume();
                }
                this.f14279y = animatorArr;
                X(i.f14305e, false);
            }
            this.f14244A = false;
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
            this.f14245B = false;
            X(i.f14301a, z10);
        }
        int size = this.f14278x.size();
        Animator[] animatorArr = (Animator[]) this.f14278x.toArray(this.f14279y);
        this.f14279y = f14240L;
        while (i10 < size) {
            Animator animator = animatorArr[i10];
            animatorArr[i10] = null;
            f.b(animator, Math.min(Math.max(0L, j10), f.a(animator)));
            i10++;
            jI = jI;
        }
        long j12 = jI;
        this.f14279y = animatorArr;
        if ((j10 <= j12 || j11 > j12) && (j10 >= 0 || j11 < 0)) {
            return;
        }
        if (j10 > j12) {
            this.f14245B = true;
        }
        X(i.f14302b, z10);
    }

    public AbstractC3830k i0(long j10) {
        this.f14257c = j10;
        return this;
    }

    public void j0(e eVar) {
        this.f14249F = eVar;
    }

    public AbstractC3830k k0(TimeInterpolator timeInterpolator) {
        this.f14258d = timeInterpolator;
        return this;
    }

    public void l0(AbstractC3826g abstractC3826g) {
        if (abstractC3826g == null) {
            this.f14251H = f14242N;
        } else {
            this.f14251H = abstractC3826g;
        }
    }

    void n(boolean z10) {
        if (z10) {
            this.f14270p.f14328a.clear();
            this.f14270p.f14329b.clear();
            this.f14270p.f14330c.a();
        } else {
            this.f14271q.f14328a.clear();
            this.f14271q.f14329b.clear();
            this.f14271q.f14330c.a();
        }
    }

    public AbstractC3830k n0(long j10) {
        this.f14256b = j10;
        return this;
    }

    protected void o0() {
        if (this.f14280z == 0) {
            X(i.f14301a, false);
            this.f14245B = false;
        }
        this.f14280z++;
    }

    String p0(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f14257c != -1) {
            sb2.append("dur(");
            sb2.append(this.f14257c);
            sb2.append(") ");
        }
        if (this.f14256b != -1) {
            sb2.append("dly(");
            sb2.append(this.f14256b);
            sb2.append(") ");
        }
        if (this.f14258d != null) {
            sb2.append("interp(");
            sb2.append(this.f14258d);
            sb2.append(") ");
        }
        if (this.f14259e.size() > 0 || this.f14260f.size() > 0) {
            sb2.append("tgts(");
            if (this.f14259e.size() > 0) {
                for (int i10 = 0; i10 < this.f14259e.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f14259e.get(i10));
                }
            }
            if (this.f14260f.size() > 0) {
                for (int i11 = 0; i11 < this.f14260f.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(this.f14260f.get(i11));
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
        AbstractC3830k abstractC3830k = this;
        C5603a<Animator, d> c5603aC = C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z10 = abstractC3830k.A().f14253J != null;
        for (int i10 = 0; i10 < size; i10++) {
            y yVar2 = arrayList.get(i10);
            y yVar3 = arrayList2.get(i10);
            if (yVar2 != null && !yVar2.f14327c.contains(abstractC3830k)) {
                yVar2 = null;
            }
            if (yVar3 != null && !yVar3.f14327c.contains(abstractC3830k)) {
                yVar3 = null;
            }
            if ((yVar2 != null || yVar3 != null) && (yVar2 == null || yVar3 == null || abstractC3830k.N(yVar2, yVar3))) {
                Animator animatorP = abstractC3830k.p(viewGroup, yVar2, yVar3);
                if (animatorP != null) {
                    if (yVar3 != null) {
                        view = yVar3.f14326b;
                        String[] strArrJ = abstractC3830k.J();
                        if (strArrJ != null && strArrJ.length > 0) {
                            yVar = new y(view);
                            y yVar4 = zVar2.f14328a.get(view);
                            if (yVar4 != null) {
                                int i11 = 0;
                                while (i11 < strArrJ.length) {
                                    Map<String, Object> map = yVar.f14325a;
                                    String[] strArr = strArrJ;
                                    String str = strArr[i11];
                                    map.put(str, yVar4.f14325a.get(str));
                                    i11++;
                                    strArrJ = strArr;
                                    animatorP = animatorP;
                                }
                            }
                            Animator animator3 = animatorP;
                            int size2 = c5603aC.getSize();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = c5603aC.get(c5603aC.g(i12));
                                if (dVar.f14286c != null && dVar.f14284a == view && dVar.f14285b.equals(x()) && dVar.f14286c.equals(yVar)) {
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
                        view = yVar2.f14326b;
                        yVar = null;
                    }
                    View view2 = view;
                    if (animatorP != null) {
                        Animator animator4 = animatorP;
                        abstractC3830k = this;
                        d dVar2 = new d(view2, x(), abstractC3830k, viewGroup.getWindowId(), yVar, animator4);
                        if (z10) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator4);
                            animator = animatorSet;
                        } else {
                            animator = animator4;
                        }
                        c5603aC.put(animator, dVar2);
                        abstractC3830k.f14248E.add(animator);
                    } else {
                        abstractC3830k = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                d dVar3 = c5603aC.get(abstractC3830k.f14248E.get(sparseIntArray.keyAt(i13)));
                dVar3.f14289f.setStartDelay((sparseIntArray.valueAt(i13) - Long.MAX_VALUE) + dVar3.f14289f.getStartDelay());
            }
        }
    }

    v r() {
        g gVar = new g();
        this.f14253J = gVar;
        c(gVar);
        return this.f14253J;
    }

    protected void s() {
        int i10 = this.f14280z - 1;
        this.f14280z = i10;
        if (i10 == 0) {
            X(i.f14302b, false);
            for (int i11 = 0; i11 < this.f14270p.f14330c.m(); i11++) {
                View viewN = this.f14270p.f14330c.n(i11);
                if (viewN != null) {
                    viewN.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < this.f14271q.f14330c.m(); i12++) {
                View viewN2 = this.f14271q.f14330c.n(i12);
                if (viewN2 != null) {
                    viewN2.setHasTransientState(false);
                }
            }
            this.f14245B = true;
        }
    }

    public long t() {
        return this.f14257c;
    }

    public String toString() {
        return p0("");
    }

    public e u() {
        return this.f14249F;
    }

    public TimeInterpolator v() {
        return this.f14258d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f14275u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f14274t;
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
    I4.y w(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            I4.w r0 = r5.f14272r
            if (r0 == 0) goto L9
            I4.y r6 = r0.w(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<I4.y> r0 = r5.f14274t
            goto L10
        Le:
            java.util.ArrayList<I4.y> r0 = r5.f14275u
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
            I4.y r4 = (I4.y) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f14326b
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
            java.util.ArrayList<I4.y> r6 = r5.f14275u
            goto L36
        L34:
            java.util.ArrayList<I4.y> r6 = r5.f14274t
        L36:
            java.lang.Object r6 = r6.get(r3)
            I4.y r6 = (I4.y) r6
            return r6
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.AbstractC3830k.w(android.view.View, boolean):I4.y");
    }

    public String x() {
        return this.f14255a;
    }

    public AbstractC3826g y() {
        return this.f14251H;
    }

    private void Q(C5603a<View, y> c5603a, C5603a<View, y> c5603a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View viewValueAt = sparseArray.valueAt(i10);
            if (viewValueAt != null && O(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && O(view)) {
                y yVar = c5603a.get(viewValueAt);
                y yVar2 = c5603a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f14274t.add(yVar);
                    this.f14275u.add(yVar2);
                    c5603a.remove(viewValueAt);
                    c5603a2.remove(view);
                }
            }
        }
    }

    private void R(C5603a<View, y> c5603a, C5603a<View, y> c5603a2) {
        y yVarRemove;
        for (int size = c5603a.getSize() - 1; size >= 0; size--) {
            View viewG = c5603a.g(size);
            if (viewG != null && O(viewG) && (yVarRemove = c5603a2.remove(viewG)) != null && O(yVarRemove.f14326b)) {
                this.f14274t.add(c5603a.i(size));
                this.f14275u.add(yVarRemove);
            }
        }
    }

    private void S(C5603a<View, y> c5603a, C5603a<View, y> c5603a2, Z.C<View> c10, Z.C<View> c11) {
        View viewD;
        int iM = c10.m();
        for (int i10 = 0; i10 < iM; i10++) {
            View viewN = c10.n(i10);
            if (viewN != null && O(viewN) && (viewD = c11.d(c10.g(i10))) != null && O(viewD)) {
                y yVar = c5603a.get(viewN);
                y yVar2 = c5603a2.get(viewD);
                if (yVar != null && yVar2 != null) {
                    this.f14274t.add(yVar);
                    this.f14275u.add(yVar2);
                    c5603a.remove(viewN);
                    c5603a2.remove(viewD);
                }
            }
        }
    }

    private void U(C5603a<View, y> c5603a, C5603a<View, y> c5603a2, C5603a<String, View> c5603a3, C5603a<String, View> c5603a4) {
        View view;
        int size = c5603a3.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            View viewK = c5603a3.k(i10);
            if (viewK != null && O(viewK) && (view = c5603a4.get(c5603a3.g(i10))) != null && O(view)) {
                y yVar = c5603a.get(viewK);
                y yVar2 = c5603a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f14274t.add(yVar);
                    this.f14275u.add(yVar2);
                    c5603a.remove(viewK);
                    c5603a2.remove(view);
                }
            }
        }
    }

    boolean O(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f14263i;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f14264j;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f14265k;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f14265k.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f14266l != null && ViewCompat.I(view) != null && this.f14266l.contains(ViewCompat.I(view))) {
            return false;
        }
        if ((this.f14259e.size() == 0 && this.f14260f.size() == 0 && (((arrayList = this.f14262h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f14261g) == null || arrayList2.isEmpty()))) || this.f14259e.contains(Integer.valueOf(id2)) || this.f14260f.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f14261g;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.I(view))) {
            return true;
        }
        if (this.f14262h != null) {
            for (int i11 = 0; i11 < this.f14262h.size(); i11++) {
                if (this.f14262h.get(i11).isInstance(view)) {
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
        C5603a<Animator, d> c5603aC = C();
        this.f14252I = 0L;
        for (int i10 = 0; i10 < this.f14248E.size(); i10++) {
            Animator animator = this.f14248E.get(i10);
            d dVar = c5603aC.get(animator);
            if (animator != null && dVar != null) {
                if (t() >= 0) {
                    dVar.f14289f.setDuration(t());
                }
                if (D() >= 0) {
                    dVar.f14289f.setStartDelay(D() + dVar.f14289f.getStartDelay());
                }
                if (v() != null) {
                    dVar.f14289f.setInterpolator(v());
                }
                this.f14278x.add(animator);
                this.f14252I = Math.max(this.f14252I, f.a(animator));
            }
        }
        this.f14248E.clear();
    }

    protected void g0() {
        o0();
        C5603a<Animator, d> c5603aC = C();
        Iterator<Animator> it = this.f14248E.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c5603aC.containsKey(next)) {
                o0();
                f0(next, c5603aC);
            }
        }
        this.f14248E.clear();
        s();
    }

    void m(ViewGroup viewGroup, boolean z10) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C5603a<String, String> c5603a;
        n(z10);
        if ((this.f14259e.size() <= 0 && this.f14260f.size() <= 0) || (((arrayList = this.f14261g) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f14262h) != null && !arrayList2.isEmpty()))) {
            j(viewGroup, z10);
        } else {
            for (int i10 = 0; i10 < this.f14259e.size(); i10++) {
                View viewFindViewById = viewGroup.findViewById(this.f14259e.get(i10).intValue());
                if (viewFindViewById != null) {
                    y yVar = new y(viewFindViewById);
                    if (z10) {
                        l(yVar);
                    } else {
                        i(yVar);
                    }
                    yVar.f14327c.add(this);
                    k(yVar);
                    if (z10) {
                        f(this.f14270p, viewFindViewById, yVar);
                    } else {
                        f(this.f14271q, viewFindViewById, yVar);
                    }
                }
            }
            for (int i11 = 0; i11 < this.f14260f.size(); i11++) {
                View view = this.f14260f.get(i11);
                y yVar2 = new y(view);
                if (z10) {
                    l(yVar2);
                } else {
                    i(yVar2);
                }
                yVar2.f14327c.add(this);
                k(yVar2);
                if (z10) {
                    f(this.f14270p, view, yVar2);
                } else {
                    f(this.f14271q, view, yVar2);
                }
            }
        }
        if (!z10 && (c5603a = this.f14250G) != null) {
            int size = c5603a.getSize();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.f14270p.f14331d.remove(this.f14250G.g(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.f14270p.f14331d.put(this.f14250G.k(i13), view2);
                }
            }
        }
    }

    @Override // 
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3830k clone() {
        try {
            AbstractC3830k abstractC3830k = (AbstractC3830k) super.clone();
            abstractC3830k.f14248E = new ArrayList<>();
            abstractC3830k.f14270p = new z();
            abstractC3830k.f14271q = new z();
            abstractC3830k.f14274t = null;
            abstractC3830k.f14275u = null;
            abstractC3830k.f14253J = null;
            abstractC3830k.f14246C = this;
            abstractC3830k.f14247D = null;
            return abstractC3830k;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
