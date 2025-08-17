package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p2.C16230p0;
import p2.C16232q0;
import p2.C16233r0;
import p2.C16239u0;
import p2.J;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private e f53934a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c2.d f53935a;

        /* renamed from: b, reason: collision with root package name */
        private final c2.d f53936b;

        public a(c2.d dVar, c2.d dVar2) {
            this.f53935a = dVar;
            this.f53936b = dVar2;
        }

        public static a e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public c2.d a() {
            return this.f53935a;
        }

        public c2.d b() {
            return this.f53936b;
        }

        public a c(c2.d dVar) {
            return new a(j.r(this.f53935a, dVar.f61362a, dVar.f61363b, dVar.f61364c, dVar.f61365d), j.r(this.f53936b, dVar.f61362a, dVar.f61363b, dVar.f61364c, dVar.f61365d));
        }

        public String toString() {
            return "Bounds{lower=" + this.f53935a + " upper=" + this.f53936b + "}";
        }

        public WindowInsetsAnimation.Bounds d() {
            return d.e(this);
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f53935a = d.g(bounds);
            this.f53936b = d.f(bounds);
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        j f53937a;

        /* renamed from: b, reason: collision with root package name */
        private final int f53938b;

        public void b(i iVar) {
        }

        public void c(i iVar) {
        }

        public abstract j d(j jVar, List<i> list);

        public a e(i iVar, a aVar) {
            return aVar;
        }

        public final int a() {
            return this.f53938b;
        }

        public b(int i10) {
            this.f53938b = i10;
        }
    }

    private static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f53939f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f53940g = new Q2.a();

        /* renamed from: h, reason: collision with root package name */
        private static final Interpolator f53941h = new DecelerateInterpolator(1.5f);

        /* renamed from: i, reason: collision with root package name */
        private static final Interpolator f53942i = new AccelerateInterpolator(1.5f);

        @SuppressLint({"WrongConstant"})
        static void e(j jVar, j jVar2, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                c2.d dVarF = jVar.f(i10);
                c2.d dVarF2 = jVar2.f(i10);
                int i11 = dVarF.f61362a;
                int i12 = dVarF2.f61362a;
                boolean z10 = i11 > i12 || dVarF.f61363b > dVarF2.f61363b || dVarF.f61364c > dVarF2.f61364c || dVarF.f61365d > dVarF2.f61365d;
                if (z10 != (i11 < i12 || dVarF.f61363b < dVarF2.f61363b || dVarF.f61364c < dVarF2.f61364c || dVarF.f61365d < dVarF2.f61365d)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        private static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            final b f53943a;

            /* renamed from: b, reason: collision with root package name */
            private j f53944b;

            /* renamed from: androidx.core.view.i$c$a$a, reason: collision with other inner class name */
            class C1098a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f53945a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j f53946b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j f53947c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f53948d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f53949e;

                C1098a(i iVar, j jVar, j jVar2, int i10, View view) {
                    this.f53945a = iVar;
                    this.f53946b = jVar;
                    this.f53947c = jVar2;
                    this.f53948d = i10;
                    this.f53949e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f53945a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f53949e, c.o(this.f53946b, this.f53947c, this.f53945a.b(), this.f53948d), Collections.singletonList(this.f53945a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f53951a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f53952b;

                b(i iVar, View view) {
                    this.f53951a = iVar;
                    this.f53952b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f53951a.e(1.0f);
                    c.i(this.f53952b, this.f53951a);
                }
            }

            /* renamed from: androidx.core.view.i$c$a$c, reason: collision with other inner class name */
            class RunnableC1099c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f53954a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f53955b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f53956c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f53957d;

                RunnableC1099c(View view, i iVar, a aVar, ValueAnimator valueAnimator) {
                    this.f53954a = view;
                    this.f53955b = iVar;
                    this.f53956c = aVar;
                    this.f53957d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f53954a, this.f53955b, this.f53956c);
                    this.f53957d.start();
                }
            }

            a(View view, b bVar) {
                j jVarA;
                this.f53943a = bVar;
                j jVarG = ViewCompat.G(view);
                if (jVarG != null) {
                    jVarA = new j.a(jVarG).a();
                } else {
                    jVarA = null;
                }
                this.f53944b = jVarA;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                long j10;
                if (!view.isLaidOut()) {
                    this.f53944b = j.C(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                j jVarC = j.C(windowInsets, view);
                if (this.f53944b == null) {
                    this.f53944b = ViewCompat.G(view);
                }
                if (this.f53944b == null) {
                    this.f53944b = jVarC;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if (bVarN != null && Objects.equals(bVarN.f53937a, jVarC)) {
                    return c.m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.e(jVarC, this.f53944b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f53944b = jVarC;
                    return c.m(view, windowInsets);
                }
                j jVar = this.f53944b;
                Interpolator interpolatorG = c.g(i10, i11);
                if ((j.n.d() & i12) != 0) {
                    j10 = 160;
                } else {
                    j10 = 250;
                }
                i iVar = new i(i12, interpolatorG, j10);
                iVar.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(iVar.a());
                a aVarF = c.f(jVarC, jVar, i12);
                c.j(view, iVar, jVarC, false);
                duration.addUpdateListener(new C1098a(iVar, jVarC, jVar, i12, view));
                duration.addListener(new b(iVar, view));
                J.a(view, new RunnableC1099c(view, iVar, aVarF, duration));
                this.f53944b = jVarC;
                return c.m(view, windowInsets);
            }
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(Y1.e.f39983M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(Y1.e.f39990T);
            if (tag instanceof a) {
                return ((a) tag).f53943a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static j o(j jVar, j jVar2, float f10, int i10) {
            j.a aVar = new j.a(jVar);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    aVar.b(i11, jVar.f(i11));
                } else {
                    c2.d dVarF = jVar.f(i11);
                    c2.d dVarF2 = jVar2.f(i11);
                    float f11 = 1.0f - f10;
                    aVar.b(i11, j.r(dVarF, (int) (((dVarF.f61362a - dVarF2.f61362a) * f11) + 0.5d), (int) (((dVarF.f61363b - dVarF2.f61363b) * f11) + 0.5d), (int) (((dVarF.f61364c - dVarF2.f61364c) * f11) + 0.5d), (int) (((dVarF.f61365d - dVarF2.f61365d) * f11) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = bVar != null ? h(view, bVar) : null;
            view.setTag(Y1.e.f39990T, onApplyWindowInsetsListenerH);
            if (view.getTag(Y1.e.f39982L) == null && view.getTag(Y1.e.f39983M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static a f(j jVar, j jVar2, int i10) {
            c2.d dVarF = jVar.f(i10);
            c2.d dVarF2 = jVar2.f(i10);
            return new a(c2.d.b(Math.min(dVarF.f61362a, dVarF2.f61362a), Math.min(dVarF.f61363b, dVarF2.f61363b), Math.min(dVarF.f61364c, dVarF2.f61364c), Math.min(dVarF.f61365d, dVarF2.f61365d)), c2.d.b(Math.max(dVarF.f61362a, dVarF2.f61362a), Math.max(dVarF.f61363b, dVarF2.f61363b), Math.max(dVarF.f61364c, dVarF2.f61364c), Math.max(dVarF.f61365d, dVarF2.f61365d)));
        }

        static Interpolator g(int i10, int i11) {
            if ((j.n.d() & i10) != 0) {
                return f53939f;
            }
            if ((j.n.d() & i11) != 0) {
                return f53940g;
            }
            if ((i10 & j.n.i()) != 0) {
                return f53941h;
            }
            if ((j.n.i() & i11) != 0) {
                return f53942i;
            }
            return null;
        }

        static void i(View view, i iVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.b(iVar);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), iVar);
                }
            }
        }

        static void j(View view, i iVar, j jVar, boolean z10) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f53937a = jVar;
                if (!z10) {
                    bVarN.c(iVar);
                    if (bVarN.a() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), iVar, jVar, z10);
                }
            }
        }

        static void k(View view, j jVar, List<i> list) {
            b bVarN = n(view);
            if (bVarN != null) {
                jVar = bVarN.d(jVar, list);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), jVar, list);
                }
            }
        }

        static void l(View view, i iVar, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.e(iVar, aVar);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), iVar, aVar);
                }
            }
        }
    }

    private static class d extends e {

        /* renamed from: f, reason: collision with root package name */
        private final WindowInsetsAnimation f53959f;

        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f53960a;

            /* renamed from: b, reason: collision with root package name */
            private List<i> f53961b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList<i> f53962c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, i> f53963d;

            private i a(WindowInsetsAnimation windowInsetsAnimation) {
                i iVar = this.f53963d.get(windowInsetsAnimation);
                if (iVar != null) {
                    return iVar;
                }
                i iVarF = i.f(windowInsetsAnimation);
                this.f53963d.put(windowInsetsAnimation, iVarF);
                return iVarF;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f53960a.b(a(windowInsetsAnimation));
                this.f53963d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f53960a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<i> arrayList = this.f53962c;
                if (arrayList == null) {
                    ArrayList<i> arrayList2 = new ArrayList<>(list.size());
                    this.f53962c = arrayList2;
                    this.f53961b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = C16239u0.a(list.get(size));
                    i iVarA = a(windowInsetsAnimationA);
                    iVarA.e(windowInsetsAnimationA.getFraction());
                    this.f53962c.add(iVarA);
                }
                return this.f53960a.d(j.B(windowInsets), this.f53961b).A();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f53960a.e(a(windowInsetsAnimation), a.e(bounds)).d();
            }

            a(b bVar) {
                super(bVar.a());
                this.f53963d = new HashMap<>();
                this.f53960a = bVar;
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f53959f = windowInsetsAnimation;
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.i.e
        public long a() {
            return this.f53959f.getDurationMillis();
        }

        @Override // androidx.core.view.i.e
        public float b() {
            return this.f53959f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.i.e
        public int c() {
            return this.f53959f.getTypeMask();
        }

        @Override // androidx.core.view.i.e
        public void d(float f10) {
            this.f53959f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(C16230p0.a(i10, interpolator, j10));
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            C16233r0.a();
            return C16232q0.a(aVar.a().e(), aVar.b().e());
        }

        public static c2.d f(WindowInsetsAnimation.Bounds bounds) {
            return c2.d.d(bounds.getUpperBound());
        }

        public static c2.d g(WindowInsetsAnimation.Bounds bounds) {
            return c2.d.d(bounds.getLowerBound());
        }
    }

    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f53964a;

        /* renamed from: b, reason: collision with root package name */
        private float f53965b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f53966c;

        /* renamed from: d, reason: collision with root package name */
        private final long f53967d;

        /* renamed from: e, reason: collision with root package name */
        private float f53968e = 1.0f;

        public long a() {
            return this.f53967d;
        }

        public float b() {
            Interpolator interpolator = this.f53966c;
            return interpolator != null ? interpolator.getInterpolation(this.f53965b) : this.f53965b;
        }

        public int c() {
            return this.f53964a;
        }

        public void d(float f10) {
            this.f53965b = f10;
        }

        e(int i10, Interpolator interpolator, long j10) {
            this.f53964a = i10;
            this.f53966c = interpolator;
            this.f53967d = j10;
        }
    }

    public i(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f53934a = new d(i10, interpolator, j10);
        } else {
            this.f53934a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static i f(WindowInsetsAnimation windowInsetsAnimation) {
        return new i(windowInsetsAnimation);
    }

    public long a() {
        return this.f53934a.a();
    }

    public float b() {
        return this.f53934a.b();
    }

    public int c() {
        return this.f53934a.c();
    }

    public void e(float f10) {
        this.f53934a.d(f10);
    }

    private i(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f53934a = new d(windowInsetsAnimation);
        }
    }
}
