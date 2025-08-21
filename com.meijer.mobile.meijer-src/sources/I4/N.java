package I4;

import I4.AbstractC3830k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public abstract class N extends AbstractC3830k {

    /* renamed from: Q, reason: collision with root package name */
    private static final String[] f14160Q = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: P, reason: collision with root package name */
    private int f14161P = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC3830k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f14162a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14163b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f14164c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f14165d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f14166e;

        /* renamed from: f, reason: collision with root package name */
        boolean f14167f = false;

        @Override // I4.AbstractC3830k.h
        public void e(AbstractC3830k abstractC3830k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            b(true);
            if (this.f14167f) {
                return;
            }
            C.f(this.f14162a, 0);
        }

        @Override // I4.AbstractC3830k.h
        public void g(AbstractC3830k abstractC3830k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            b(false);
            if (this.f14167f) {
                return;
            }
            C.f(this.f14162a, this.f14163b);
        }

        @Override // I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14167f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        private void a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f14167f) {
                C.f(this.f14162a, this.f14163b);
                ViewGroup viewGroup = this.f14164c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            b(false);
        }

        private void b(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f14165d || this.f14166e == z10 || (viewGroup = this.f14164c) == null) {
                return;
            }
            this.f14166e = z10;
            B.b(viewGroup, z10);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                return;
            }
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                C.f(this.f14162a, 0);
                ViewGroup viewGroup = this.f14164c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        a(View view, int i10, boolean z10) {
            this.f14162a = view;
            this.f14163b = i10;
            this.f14164c = (ViewGroup) view.getParent();
            this.f14165d = z10;
            b(true);
        }

        @Override // I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            abstractC3830k.c0(this);
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC3830k.h {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f14168a;

        /* renamed from: b, reason: collision with root package name */
        private final View f14169b;

        /* renamed from: c, reason: collision with root package name */
        private final View f14170c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f14171d = true;

        @Override // I4.AbstractC3830k.h
        public void e(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void g(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        b(ViewGroup viewGroup, View view, View view2) {
            this.f14168a = viewGroup;
            this.f14169b = view;
            this.f14170c = view2;
        }

        private void a() {
            this.f14170c.setTag(C3827h.f14233a, null);
            this.f14168a.getOverlay().remove(this.f14169b);
            this.f14171d = false;
        }

        @Override // I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
            if (this.f14171d) {
                a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f14168a.getOverlay().remove(this.f14169b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f14169b.getParent() == null) {
                ViewCompat.e(this.f14168a, this.f14169b);
            } else {
                N.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f14170c.setTag(C3827h.f14233a, this.f14169b);
                ViewCompat.e(this.f14168a, this.f14169b);
                this.f14171d = true;
            }
        }

        @Override // I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            abstractC3830k.c0(this);
        }
    }

    @Override // I4.AbstractC3830k
    public boolean N(y yVar, y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f14325a.containsKey("android:visibility:visibility") != yVar.f14325a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarS0 = s0(yVar, yVar2);
        return cVarS0.f14173a && (cVarS0.f14175c == 0 || cVarS0.f14176d == 0);
    }

    public abstract Animator u0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    public abstract Animator w0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f14173a;

        /* renamed from: b, reason: collision with root package name */
        boolean f14174b;

        /* renamed from: c, reason: collision with root package name */
        int f14175c;

        /* renamed from: d, reason: collision with root package name */
        int f14176d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f14177e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f14178f;

        c() {
        }
    }

    private void q0(y yVar) {
        yVar.f14325a.put("android:visibility:visibility", Integer.valueOf(yVar.f14326b.getVisibility()));
        yVar.f14325a.put("android:visibility:parent", yVar.f14326b.getParent());
        int[] iArr = new int[2];
        yVar.f14326b.getLocationOnScreen(iArr);
        yVar.f14325a.put("android:visibility:screenLocation", iArr);
    }

    private c s0(y yVar, y yVar2) {
        c cVar = new c();
        cVar.f14173a = false;
        cVar.f14174b = false;
        if (yVar == null || !yVar.f14325a.containsKey("android:visibility:visibility")) {
            cVar.f14175c = -1;
            cVar.f14177e = null;
        } else {
            cVar.f14175c = ((Integer) yVar.f14325a.get("android:visibility:visibility")).intValue();
            cVar.f14177e = (ViewGroup) yVar.f14325a.get("android:visibility:parent");
        }
        if (yVar2 == null || !yVar2.f14325a.containsKey("android:visibility:visibility")) {
            cVar.f14176d = -1;
            cVar.f14178f = null;
        } else {
            cVar.f14176d = ((Integer) yVar2.f14325a.get("android:visibility:visibility")).intValue();
            cVar.f14178f = (ViewGroup) yVar2.f14325a.get("android:visibility:parent");
        }
        if (yVar != null && yVar2 != null) {
            int i10 = cVar.f14175c;
            int i11 = cVar.f14176d;
            if (i10 != i11 || cVar.f14177e != cVar.f14178f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f14174b = false;
                        cVar.f14173a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f14174b = true;
                        cVar.f14173a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f14178f == null) {
                        cVar.f14174b = false;
                        cVar.f14173a = true;
                        return cVar;
                    }
                    if (cVar.f14177e == null) {
                        cVar.f14174b = true;
                        cVar.f14173a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (yVar == null && cVar.f14176d == 0) {
                cVar.f14174b = true;
                cVar.f14173a = true;
                return cVar;
            }
            if (yVar2 == null && cVar.f14175c == 0) {
                cVar.f14174b = false;
                cVar.f14173a = true;
            }
        }
        return cVar;
    }

    @Override // I4.AbstractC3830k
    public String[] J() {
        return f14160Q;
    }

    public Animator t0(ViewGroup viewGroup, y yVar, int i10, y yVar2, int i11) {
        if ((this.f14161P & 1) != 1 || yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            View view = (View) yVar2.f14326b.getParent();
            if (s0(w(view, false), K(view, false)).f14173a) {
                return null;
            }
        }
        return u0(viewGroup, yVar2.f14326b, yVar, yVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
      0x0069: PHI (r2v3 android.view.View) = 
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v2 android.view.View)
      (r2v6 android.view.View)
     binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator v0(android.view.ViewGroup r10, I4.y r11, int r12, I4.y r13, int r14) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.N.v0(android.view.ViewGroup, I4.y, int, I4.y, int):android.animation.Animator");
    }

    public void x0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f14161P = i10;
    }

    @Override // I4.AbstractC3830k
    public void i(y yVar) {
        q0(yVar);
    }

    @Override // I4.AbstractC3830k
    public void l(y yVar) {
        q0(yVar);
    }

    @Override // I4.AbstractC3830k
    public Animator p(ViewGroup viewGroup, y yVar, y yVar2) {
        c cVarS0 = s0(yVar, yVar2);
        if (cVarS0.f14173a) {
            if (cVarS0.f14177e != null || cVarS0.f14178f != null) {
                if (cVarS0.f14174b) {
                    return t0(viewGroup, yVar, cVarS0.f14175c, yVar2, cVarS0.f14176d);
                }
                return v0(viewGroup, yVar, cVarS0.f14175c, yVar2, cVarS0.f14176d);
            }
            return null;
        }
        return null;
    }
}
