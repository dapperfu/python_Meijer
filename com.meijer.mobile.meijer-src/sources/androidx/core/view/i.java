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
import p2.C16375p0;
import p2.C16377q0;
import p2.C16378r0;
import p2.C16384u0;
import p2.J;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private e f54158a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c2.d f54159a;

        /* renamed from: b, reason: collision with root package name */
        private final c2.d f54160b;

        public a(c2.d dVar, c2.d dVar2) {
            this.f54159a = dVar;
            this.f54160b = dVar2;
        }

        public static a e(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public c2.d a() {
            return this.f54159a;
        }

        public c2.d b() {
            return this.f54160b;
        }

        public a c(c2.d dVar) {
            return new a(j.r(this.f54159a, dVar.f61161a, dVar.f61162b, dVar.f61163c, dVar.f61164d), j.r(this.f54160b, dVar.f61161a, dVar.f61162b, dVar.f61163c, dVar.f61164d));
        }

        public String toString() {
            return "Bounds{lower=" + this.f54159a + " upper=" + this.f54160b + "}";
        }

        public WindowInsetsAnimation.Bounds d() {
            return d.e(this);
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f54159a = d.g(bounds);
            this.f54160b = d.f(bounds);
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        j f54161a;

        /* renamed from: b, reason: collision with root package name */
        private final int f54162b;

        public void b(i iVar) {
        }

        public void c(i iVar) {
        }

        public abstract j d(j jVar, List<i> list);

        public a e(i iVar, a aVar) {
            return aVar;
        }

        public final int a() {
            return this.f54162b;
        }

        public b(int i10) {
            this.f54162b = i10;
        }
    }

    private static class c extends e {

        /* renamed from: f, reason: collision with root package name */
        private static final Interpolator f54163f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: g, reason: collision with root package name */
        private static final Interpolator f54164g = new Q2.a();

        /* renamed from: h, reason: collision with root package name */
        private static final Interpolator f54165h = new DecelerateInterpolator(1.5f);

        /* renamed from: i, reason: collision with root package name */
        private static final Interpolator f54166i = new AccelerateInterpolator(1.5f);

        @SuppressLint({"WrongConstant"})
        static void e(j jVar, j jVar2, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                c2.d dVarF = jVar.f(i10);
                c2.d dVarF2 = jVar2.f(i10);
                int i11 = dVarF.f61161a;
                int i12 = dVarF2.f61161a;
                boolean z10 = i11 > i12 || dVarF.f61162b > dVarF2.f61162b || dVarF.f61163c > dVarF2.f61163c || dVarF.f61164d > dVarF2.f61164d;
                if (z10 != (i11 < i12 || dVarF.f61162b < dVarF2.f61162b || dVarF.f61163c < dVarF2.f61163c || dVarF.f61164d < dVarF2.f61164d)) {
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
            final b f54167a;

            /* renamed from: b, reason: collision with root package name */
            private j f54168b;

            /* renamed from: androidx.core.view.i$c$a$a, reason: collision with other inner class name */
            class C1111a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f54169a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j f54170b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ j f54171c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f54172d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ View f54173e;

                C1111a(i iVar, j jVar, j jVar2, int i10, View view) {
                    this.f54169a = iVar;
                    this.f54170b = jVar;
                    this.f54171c = jVar2;
                    this.f54172d = i10;
                    this.f54173e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f54169a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f54173e, c.o(this.f54170b, this.f54171c, this.f54169a.b(), this.f54172d), Collections.singletonList(this.f54169a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ i f54175a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ View f54176b;

                b(i iVar, View view) {
                    this.f54175a = iVar;
                    this.f54176b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f54175a.e(1.0f);
                    c.i(this.f54176b, this.f54175a);
                }
            }

            /* renamed from: androidx.core.view.i$c$a$c, reason: collision with other inner class name */
            class RunnableC1112c implements Runnable {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ View f54178a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ i f54179b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ a f54180c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ ValueAnimator f54181d;

                RunnableC1112c(View view, i iVar, a aVar, ValueAnimator valueAnimator) {
                    this.f54178a = view;
                    this.f54179b = iVar;
                    this.f54180c = aVar;
                    this.f54181d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f54178a, this.f54179b, this.f54180c);
                    this.f54181d.start();
                }
            }

            a(View view, b bVar) {
                j jVarA;
                this.f54167a = bVar;
                j jVarG = ViewCompat.G(view);
                if (jVarG != null) {
                    jVarA = new j.a(jVarG).a();
                } else {
                    jVarA = null;
                }
                this.f54168b = jVarA;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                long j10;
                if (!view.isLaidOut()) {
                    this.f54168b = j.C(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                j jVarC = j.C(windowInsets, view);
                if (this.f54168b == null) {
                    this.f54168b = ViewCompat.G(view);
                }
                if (this.f54168b == null) {
                    this.f54168b = jVarC;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if (bVarN != null && Objects.equals(bVarN.f54161a, jVarC)) {
                    return c.m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.e(jVarC, this.f54168b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f54168b = jVarC;
                    return c.m(view, windowInsets);
                }
                j jVar = this.f54168b;
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
                duration.addUpdateListener(new C1111a(iVar, jVarC, jVar, i12, view));
                duration.addListener(new b(iVar, view));
                J.a(view, new RunnableC1112c(view, iVar, aVarF, duration));
                this.f54168b = jVarC;
                return c.m(view, windowInsets);
            }
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(Y1.e.f42796M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(Y1.e.f42803T);
            if (tag instanceof a) {
                return ((a) tag).f54167a;
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
                    aVar.b(i11, j.r(dVarF, (int) (((dVarF.f61161a - dVarF2.f61161a) * f11) + 0.5d), (int) (((dVarF.f61162b - dVarF2.f61162b) * f11) + 0.5d), (int) (((dVarF.f61163c - dVarF2.f61163c) * f11) + 0.5d), (int) (((dVarF.f61164d - dVarF2.f61164d) * f11) + 0.5d)));
                }
            }
            return aVar.a();
        }

        static void p(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = bVar != null ? h(view, bVar) : null;
            view.setTag(Y1.e.f42803T, onApplyWindowInsetsListenerH);
            if (view.getTag(Y1.e.f42795L) == null && view.getTag(Y1.e.f42796M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static a f(j jVar, j jVar2, int i10) {
            c2.d dVarF = jVar.f(i10);
            c2.d dVarF2 = jVar2.f(i10);
            return new a(c2.d.b(Math.min(dVarF.f61161a, dVarF2.f61161a), Math.min(dVarF.f61162b, dVarF2.f61162b), Math.min(dVarF.f61163c, dVarF2.f61163c), Math.min(dVarF.f61164d, dVarF2.f61164d)), c2.d.b(Math.max(dVarF.f61161a, dVarF2.f61161a), Math.max(dVarF.f61162b, dVarF2.f61162b), Math.max(dVarF.f61163c, dVarF2.f61163c), Math.max(dVarF.f61164d, dVarF2.f61164d)));
        }

        static Interpolator g(int i10, int i11) {
            if ((j.n.d() & i10) != 0) {
                return f54163f;
            }
            if ((j.n.d() & i11) != 0) {
                return f54164g;
            }
            if ((i10 & j.n.i()) != 0) {
                return f54165h;
            }
            if ((j.n.i() & i11) != 0) {
                return f54166i;
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
                bVarN.f54161a = jVar;
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
        private final WindowInsetsAnimation f54183f;

        private static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            private final b f54184a;

            /* renamed from: b, reason: collision with root package name */
            private List<i> f54185b;

            /* renamed from: c, reason: collision with root package name */
            private ArrayList<i> f54186c;

            /* renamed from: d, reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, i> f54187d;

            private i a(WindowInsetsAnimation windowInsetsAnimation) {
                i iVar = this.f54187d.get(windowInsetsAnimation);
                if (iVar != null) {
                    return iVar;
                }
                i iVarF = i.f(windowInsetsAnimation);
                this.f54187d.put(windowInsetsAnimation, iVarF);
                return iVarF;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f54184a.b(a(windowInsetsAnimation));
                this.f54187d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f54184a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<i> arrayList = this.f54186c;
                if (arrayList == null) {
                    ArrayList<i> arrayList2 = new ArrayList<>(list.size());
                    this.f54186c = arrayList2;
                    this.f54185b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = C16384u0.a(list.get(size));
                    i iVarA = a(windowInsetsAnimationA);
                    iVarA.e(windowInsetsAnimationA.getFraction());
                    this.f54186c.add(iVarA);
                }
                return this.f54184a.d(j.B(windowInsets), this.f54185b).A();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f54184a.e(a(windowInsetsAnimation), a.e(bounds)).d();
            }

            a(b bVar) {
                super(bVar.a());
                this.f54187d = new HashMap<>();
                this.f54184a = bVar;
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f54183f = windowInsetsAnimation;
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // androidx.core.view.i.e
        public long a() {
            return this.f54183f.getDurationMillis();
        }

        @Override // androidx.core.view.i.e
        public float b() {
            return this.f54183f.getInterpolatedFraction();
        }

        @Override // androidx.core.view.i.e
        public int c() {
            return this.f54183f.getTypeMask();
        }

        @Override // androidx.core.view.i.e
        public void d(float f10) {
            this.f54183f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(C16375p0.a(i10, interpolator, j10));
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            C16378r0.a();
            return C16377q0.a(aVar.a().e(), aVar.b().e());
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
        private final int f54188a;

        /* renamed from: b, reason: collision with root package name */
        private float f54189b;

        /* renamed from: c, reason: collision with root package name */
        private final Interpolator f54190c;

        /* renamed from: d, reason: collision with root package name */
        private final long f54191d;

        /* renamed from: e, reason: collision with root package name */
        private float f54192e = 1.0f;

        public long a() {
            return this.f54191d;
        }

        public float b() {
            Interpolator interpolator = this.f54190c;
            return interpolator != null ? interpolator.getInterpolation(this.f54189b) : this.f54189b;
        }

        public int c() {
            return this.f54188a;
        }

        public void d(float f10) {
            this.f54189b = f10;
        }

        e(int i10, Interpolator interpolator, long j10) {
            this.f54188a = i10;
            this.f54190c = interpolator;
            this.f54191d = j10;
        }
    }

    public i(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f54158a = new d(i10, interpolator, j10);
        } else {
            this.f54158a = new c(i10, interpolator, j10);
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
        return this.f54158a.a();
    }

    public float b() {
        return this.f54158a.b();
    }

    public int c() {
        return this.f54158a.c();
    }

    public void e(float f10) {
        this.f54158a.d(f10);
    }

    private i(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f54158a = new d(windowInsetsAnimation);
        }
    }
}
