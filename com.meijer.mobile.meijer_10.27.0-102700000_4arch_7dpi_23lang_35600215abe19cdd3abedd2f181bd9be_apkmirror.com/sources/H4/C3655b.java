package H4;

import H4.AbstractC3664k;
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

/* renamed from: H4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3655b extends AbstractC3664k {

    /* renamed from: Q, reason: collision with root package name */
    private static final String[] f12115Q = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: R, reason: collision with root package name */
    private static final Property<i, PointF> f12116R = new a(PointF.class, "topLeft");

    /* renamed from: S, reason: collision with root package name */
    private static final Property<i, PointF> f12117S = new C0184b(PointF.class, "bottomRight");

    /* renamed from: T, reason: collision with root package name */
    private static final Property<View, PointF> f12118T = new c(PointF.class, "bottomRight");

    /* renamed from: U, reason: collision with root package name */
    private static final Property<View, PointF> f12119U = new d(PointF.class, "topLeft");

    /* renamed from: V, reason: collision with root package name */
    private static final Property<View, PointF> f12120V = new e(PointF.class, "position");

    /* renamed from: W, reason: collision with root package name */
    private static final C3662i f12121W = new C3662i();

    /* renamed from: P, reason: collision with root package name */
    private boolean f12122P = false;

    /* renamed from: H4.b$d */
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

    /* renamed from: H4.b$e */
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

    /* renamed from: H4.b$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f12123a;
        private final i mViewBounds;

        f(i iVar) {
            this.f12123a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: H4.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC3664k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f12125a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f12126b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12127c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f12128d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f12129e;

        /* renamed from: f, reason: collision with root package name */
        private final int f12130f;

        /* renamed from: g, reason: collision with root package name */
        private final int f12131g;

        /* renamed from: h, reason: collision with root package name */
        private final int f12132h;

        /* renamed from: i, reason: collision with root package name */
        private final int f12133i;

        /* renamed from: j, reason: collision with root package name */
        private final int f12134j;

        /* renamed from: k, reason: collision with root package name */
        private final int f12135k;

        /* renamed from: l, reason: collision with root package name */
        private final int f12136l;

        /* renamed from: m, reason: collision with root package name */
        private final int f12137m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f12138n;

        @Override // H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
            this.f12138n = true;
        }

        @Override // H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // H4.AbstractC3664k.h
        public void f(AbstractC3664k abstractC3664k) {
            this.f12125a.setTag(C3661h.f12170b, this.f12125a.getClipBounds());
            this.f12125a.setClipBounds(this.f12129e ? null : this.f12128d);
        }

        @Override // H4.AbstractC3664k.h
        public void h(AbstractC3664k abstractC3664k) {
            Rect rect = (Rect) this.f12125a.getTag(C3661h.f12170b);
            this.f12125a.setTag(C3661h.f12170b, null);
            this.f12125a.setClipBounds(rect);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f12138n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f12127c) {
                    rect = this.f12126b;
                }
            } else if (!this.f12129e) {
                rect = this.f12128d;
            }
            this.f12125a.setClipBounds(rect);
            if (z10) {
                C.d(this.f12125a, this.f12130f, this.f12131g, this.f12132h, this.f12133i);
            } else {
                C.d(this.f12125a, this.f12134j, this.f12135k, this.f12136l, this.f12137m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f12132h - this.f12130f, this.f12136l - this.f12134j);
            int iMax2 = Math.max(this.f12133i - this.f12131g, this.f12137m - this.f12135k);
            int i10 = z10 ? this.f12134j : this.f12130f;
            int i11 = z10 ? this.f12135k : this.f12131g;
            C.d(this.f12125a, i10, i11, iMax + i10, iMax2 + i11);
            this.f12125a.setClipBounds(z10 ? this.f12128d : this.f12126b);
        }

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f12125a = view;
            this.f12126b = rect;
            this.f12127c = z10;
            this.f12128d = rect2;
            this.f12129e = z11;
            this.f12130f = i10;
            this.f12131g = i11;
            this.f12132h = i12;
            this.f12133i = i13;
            this.f12134j = i14;
            this.f12135k = i15;
            this.f12136l = i16;
            this.f12137m = i17;
        }
    }

    /* renamed from: H4.b$h */
    private static class h extends s {

        /* renamed from: a, reason: collision with root package name */
        boolean f12139a = false;

        /* renamed from: b, reason: collision with root package name */
        final ViewGroup f12140b;

        @Override // H4.s, H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            if (!this.f12139a) {
                B.b(this.f12140b, false);
            }
            abstractC3664k.b0(this);
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void f(AbstractC3664k abstractC3664k) {
            B.b(this.f12140b, false);
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void h(AbstractC3664k abstractC3664k) {
            B.b(this.f12140b, true);
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
            B.b(this.f12140b, false);
            this.f12139a = true;
        }

        h(ViewGroup viewGroup) {
            this.f12140b = viewGroup;
        }
    }

    /* renamed from: H4.b$i */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private int f12141a;

        /* renamed from: b, reason: collision with root package name */
        private int f12142b;

        /* renamed from: c, reason: collision with root package name */
        private int f12143c;

        /* renamed from: d, reason: collision with root package name */
        private int f12144d;

        /* renamed from: e, reason: collision with root package name */
        private final View f12145e;

        /* renamed from: f, reason: collision with root package name */
        private int f12146f;

        /* renamed from: g, reason: collision with root package name */
        private int f12147g;

        private void b() {
            C.d(this.f12145e, this.f12141a, this.f12142b, this.f12143c, this.f12144d);
            this.f12146f = 0;
            this.f12147g = 0;
        }

        void a(PointF pointF) {
            this.f12143c = Math.round(pointF.x);
            this.f12144d = Math.round(pointF.y);
            int i10 = this.f12147g + 1;
            this.f12147g = i10;
            if (this.f12146f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f12141a = Math.round(pointF.x);
            this.f12142b = Math.round(pointF.y);
            int i10 = this.f12146f + 1;
            this.f12146f = i10;
            if (i10 == this.f12147g) {
                b();
            }
        }

        i(View view) {
            this.f12145e = view;
        }
    }

    @Override // H4.AbstractC3664k
    public boolean M() {
        return true;
    }

    /* renamed from: H4.b$a */
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

    /* renamed from: H4.b$b, reason: collision with other inner class name */
    class C0184b extends Property<i, PointF> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        C0184b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: H4.b$c */
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

    private void r0(y yVar) {
        View view = yVar.f12262b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        yVar.f12261a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        yVar.f12261a.put("android:changeBounds:parent", yVar.f12262b.getParent());
        if (this.f12122P) {
            yVar.f12261a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // H4.AbstractC3664k
    public String[] J() {
        return f12115Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // H4.AbstractC3664k
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
        Map<String, Object> map = yVar.f12261a;
        Map<String, Object> map2 = yVar2.f12261a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = yVar2.f12262b;
        Rect rect2 = (Rect) yVar.f12261a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) yVar2.f12261a.get("android:changeBounds:bounds");
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
        Rect rect4 = (Rect) yVar.f12261a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) yVar2.f12261a.get("android:changeBounds:clip");
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
        if (this.f12122P) {
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
                objectAnimatorA = C3659f.a(view, f12120V, y().a(i15, i17, i16, i18));
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
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f12121W, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimatorOfObject.addListener(gVar);
                c(gVar);
            }
            animatorC = x.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            C.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? C3659f.a(view, f12118T, y().a(i19, i21, i20, i22)) : C3659f.a(view, f12119U, y().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = C3659f.a(view, f12120V, y().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = C3659f.a(iVar, f12116R, y().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = C3659f.a(iVar, f12117S, y().a(i19, i21, i20, i22));
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

    @Override // H4.AbstractC3664k
    public void i(y yVar) {
        r0(yVar);
    }

    @Override // H4.AbstractC3664k
    public void l(y yVar) {
        Rect rect;
        r0(yVar);
        if (this.f12122P && (rect = (Rect) yVar.f12262b.getTag(C3661h.f12170b)) != null) {
            yVar.f12261a.put("android:changeBounds:clip", rect);
        }
    }
}
