package I4;

import I4.AbstractC3830k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: I4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3821b extends AbstractC3830k {

    /* renamed from: Q, reason: collision with root package name */
    private static final String[] f14179Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: R, reason: collision with root package name */
    private static final Property<i, PointF> f14180R = new a(PointF.class, "topLeft");

    /* renamed from: S, reason: collision with root package name */
    private static final Property<i, PointF> f14181S = new C0225b(PointF.class, "bottomRight");

    /* renamed from: T, reason: collision with root package name */
    private static final Property<View, PointF> f14182T = new c(PointF.class, "bottomRight");

    /* renamed from: U, reason: collision with root package name */
    private static final Property<View, PointF> f14183U = new d(PointF.class, "topLeft");

    /* renamed from: V, reason: collision with root package name */
    private static final Property<View, PointF> f14184V = new e(PointF.class, "position");

    /* renamed from: W, reason: collision with root package name */
    private static final C3828i f14185W = new C3828i();

    /* renamed from: P, reason: collision with root package name */
    private boolean f14186P = false;

    /* renamed from: I4.b$d */
    class d extends Property<View, PointF> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }

        d(Class cls, String str) {
            super(cls, str);
        }
    }

    /* renamed from: I4.b$e */
    class e extends Property<View, PointF> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            C.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }

        e(Class cls, String str) {
            super(cls, str);
        }
    }

    /* renamed from: I4.b$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f14187a;
        private final i mViewBounds;

        f(i iVar) {
            this.f14187a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: I4.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC3830k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f14189a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f14190b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f14191c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f14192d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f14193e;

        /* renamed from: f, reason: collision with root package name */
        private final int f14194f;

        /* renamed from: g, reason: collision with root package name */
        private final int f14195g;

        /* renamed from: h, reason: collision with root package name */
        private final int f14196h;

        /* renamed from: i, reason: collision with root package name */
        private final int f14197i;

        /* renamed from: j, reason: collision with root package name */
        private final int f14198j;

        /* renamed from: k, reason: collision with root package name */
        private final int f14199k;

        /* renamed from: l, reason: collision with root package name */
        private final int f14200l;

        /* renamed from: m, reason: collision with root package name */
        private final int f14201m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f14202n;

        @Override // I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
            this.f14202n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // I4.AbstractC3830k.h
        public void e(AbstractC3830k abstractC3830k) {
            Rect rect = (Rect) this.f14189a.getTag(C3827h.f14234b);
            this.f14189a.setTag(C3827h.f14234b, null);
            this.f14189a.setClipBounds(rect);
        }

        @Override // I4.AbstractC3830k.h
        public void g(AbstractC3830k abstractC3830k) {
            this.f14189a.setTag(C3827h.f14234b, this.f14189a.getClipBounds());
            this.f14189a.setClipBounds(this.f14193e ? null : this.f14192d);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f14202n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f14191c) {
                    rect = this.f14190b;
                }
            } else if (!this.f14193e) {
                rect = this.f14192d;
            }
            this.f14189a.setClipBounds(rect);
            if (z10) {
                C.d(this.f14189a, this.f14194f, this.f14195g, this.f14196h, this.f14197i);
            } else {
                C.d(this.f14189a, this.f14198j, this.f14199k, this.f14200l, this.f14201m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f14196h - this.f14194f, this.f14200l - this.f14198j);
            int iMax2 = Math.max(this.f14197i - this.f14195g, this.f14201m - this.f14199k);
            int i10 = z10 ? this.f14198j : this.f14194f;
            int i11 = z10 ? this.f14199k : this.f14195g;
            C.d(this.f14189a, i10, i11, iMax + i10, iMax2 + i11);
            this.f14189a.setClipBounds(z10 ? this.f14192d : this.f14190b);
        }

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f14189a = view;
            this.f14190b = rect;
            this.f14191c = z10;
            this.f14192d = rect2;
            this.f14193e = z11;
            this.f14194f = i10;
            this.f14195g = i11;
            this.f14196h = i12;
            this.f14197i = i13;
            this.f14198j = i14;
            this.f14199k = i15;
            this.f14200l = i16;
            this.f14201m = i17;
        }
    }

    /* renamed from: I4.b$h */
    private static class h extends s {

        /* renamed from: a, reason: collision with root package name */
        boolean f14203a = false;

        /* renamed from: b, reason: collision with root package name */
        final ViewGroup f14204b;

        @Override // I4.s, I4.AbstractC3830k.h
        public void e(AbstractC3830k abstractC3830k) {
            B.b(this.f14204b, true);
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void g(AbstractC3830k abstractC3830k) {
            B.b(this.f14204b, false);
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            if (!this.f14203a) {
                B.b(this.f14204b, false);
            }
            abstractC3830k.c0(this);
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
            B.b(this.f14204b, false);
            this.f14203a = true;
        }

        h(ViewGroup viewGroup) {
            this.f14204b = viewGroup;
        }
    }

    /* renamed from: I4.b$i */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private int f14205a;

        /* renamed from: b, reason: collision with root package name */
        private int f14206b;

        /* renamed from: c, reason: collision with root package name */
        private int f14207c;

        /* renamed from: d, reason: collision with root package name */
        private int f14208d;

        /* renamed from: e, reason: collision with root package name */
        private final View f14209e;

        /* renamed from: f, reason: collision with root package name */
        private int f14210f;

        /* renamed from: g, reason: collision with root package name */
        private int f14211g;

        private void b() {
            C.d(this.f14209e, this.f14205a, this.f14206b, this.f14207c, this.f14208d);
            this.f14210f = 0;
            this.f14211g = 0;
        }

        void a(PointF pointF) {
            this.f14207c = Math.round(pointF.x);
            this.f14208d = Math.round(pointF.y);
            int i10 = this.f14211g + 1;
            this.f14211g = i10;
            if (this.f14210f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f14205a = Math.round(pointF.x);
            this.f14206b = Math.round(pointF.y);
            int i10 = this.f14210f + 1;
            this.f14210f = i10;
            if (i10 == this.f14211g) {
                b();
            }
        }

        i(View view) {
            this.f14209e = view;
        }
    }

    @Override // I4.AbstractC3830k
    public boolean M() {
        return true;
    }

    /* renamed from: I4.b$a */
    class a extends Property<i, PointF> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: I4.b$b, reason: collision with other inner class name */
    class C0225b extends Property<i, PointF> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        C0225b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: I4.b$c */
    class c extends Property<View, PointF> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    private void q0(y yVar) {
        View view = yVar.f14326b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        yVar.f14325a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        yVar.f14325a.put("android:changeBounds:parent", yVar.f14326b.getParent());
        if (this.f14186P) {
            yVar.f14325a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // I4.AbstractC3830k
    public String[] J() {
        return f14179Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I4.AbstractC3830k
    public Animator p(ViewGroup viewGroup, y yVar, y yVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (yVar == null || yVar2 == null) {
            return null;
        }
        Map<String, Object> map = yVar.f14325a;
        Map<String, Object> map2 = yVar2.f14325a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = yVar2.f14326b;
        Rect rect2 = (Rect) yVar.f14325a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) yVar2.f14325a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) yVar.f14325a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) yVar2.f14325a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.f14186P) {
            C.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                objectAnimatorA = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                objectAnimatorA = C3825f.a(view, f14184V, y().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i28 = rect5 == null ? 1 : i14;
            Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f14185W, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimatorOfObject.addListener(gVar);
                c(gVar);
            }
            animatorC = x.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            C.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? C3825f.a(view, f14182T, y().a(i19, i21, i20, i22)) : C3825f.a(view, f14183U, y().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = C3825f.a(view, f14184V, y().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = C3825f.a(iVar, f14180R, y().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = C3825f.a(iVar, f14181S, y().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            B.b(viewGroup4, true);
            A().c(new h(viewGroup4));
        }
        return animatorC;
    }

    @Override // I4.AbstractC3830k
    public void i(y yVar) {
        q0(yVar);
    }

    @Override // I4.AbstractC3830k
    public void l(y yVar) {
        Rect rect;
        q0(yVar);
        if (this.f14186P && (rect = (Rect) yVar.f14326b.getTag(C3827h.f14234b)) != null) {
            yVar.f14325a.put("android:changeBounds:clip", rect);
        }
    }
}
