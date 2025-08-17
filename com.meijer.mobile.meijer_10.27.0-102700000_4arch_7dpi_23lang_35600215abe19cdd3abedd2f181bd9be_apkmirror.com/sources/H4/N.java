package H4;

import H4.AbstractC3664k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

/* loaded from: classes4.dex */
public abstract class N extends AbstractC3664k {

    /* renamed from: Q, reason: collision with root package name */
    private static final String[] f12096Q = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: P, reason: collision with root package name */
    private int f12097P = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC3664k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f12098a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12099b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f12100c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f12101d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f12102e;

        /* renamed from: f, reason: collision with root package name */
        boolean f12103f = false;

        @Override // H4.AbstractC3664k.h
        public void f(AbstractC3664k abstractC3664k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            c(false);
            if (this.f12103f) {
                return;
            }
            C.f(this.f12098a, this.f12099b);
        }

        @Override // H4.AbstractC3664k.h
        public void h(AbstractC3664k abstractC3664k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            c(true);
            if (this.f12103f) {
                return;
            }
            C.f(this.f12098a, 0);
        }

        @Override // H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f12103f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        private void b() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f12103f) {
                C.f(this.f12098a, this.f12099b);
                ViewGroup viewGroup = this.f12100c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        private void c(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f12101d || this.f12102e == z10 || (viewGroup = this.f12100c) == null) {
                return;
            }
            this.f12102e = z10;
            B.b(viewGroup, z10);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                return;
            }
            b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                C.f(this.f12098a, 0);
                ViewGroup viewGroup = this.f12100c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        a(View view, int i10, boolean z10) {
            this.f12098a = view;
            this.f12099b = i10;
            this.f12100c = (ViewGroup) view.getParent();
            this.f12101d = z10;
            c(true);
        }

        @Override // H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            abstractC3664k.b0(this);
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC3664k.h {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f12104a;

        /* renamed from: b, reason: collision with root package name */
        private final View f12105b;

        /* renamed from: c, reason: collision with root package name */
        private final View f12106c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12107d = true;

        @Override // H4.AbstractC3664k.h
        public void f(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void h(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        b(ViewGroup viewGroup, View view, View view2) {
            this.f12104a = viewGroup;
            this.f12105b = view;
            this.f12106c = view2;
        }

        private void b() {
            this.f12106c.setTag(C3661h.f12169a, null);
            this.f12104a.getOverlay().remove(this.f12105b);
            this.f12107d = false;
        }

        @Override // H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
            if (this.f12107d) {
                b();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f12104a.getOverlay().remove(this.f12105b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f12105b.getParent() == null) {
                ViewCompat.e(this.f12104a, this.f12105b);
            } else {
                N.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f12106c.setTag(C3661h.f12169a, this.f12105b);
                ViewCompat.e(this.f12104a, this.f12105b);
                this.f12107d = true;
            }
        }

        @Override // H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            abstractC3664k.b0(this);
        }
    }

    @Override // H4.AbstractC3664k
    public boolean N(y yVar, y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f12261a.containsKey("android:visibility:visibility") != yVar.f12261a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarS0 = s0(yVar, yVar2);
        return cVarS0.f12109a && (cVarS0.f12111c == 0 || cVarS0.f12112d == 0);
    }

    public abstract Animator u0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    public abstract Animator w0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f12109a;

        /* renamed from: b, reason: collision with root package name */
        boolean f12110b;

        /* renamed from: c, reason: collision with root package name */
        int f12111c;

        /* renamed from: d, reason: collision with root package name */
        int f12112d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f12113e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f12114f;

        c() {
        }
    }

    private void r0(y yVar) {
        yVar.f12261a.put("android:visibility:visibility", Integer.valueOf(yVar.f12262b.getVisibility()));
        yVar.f12261a.put("android:visibility:parent", yVar.f12262b.getParent());
        int[] iArr = new int[2];
        yVar.f12262b.getLocationOnScreen(iArr);
        yVar.f12261a.put("android:visibility:screenLocation", iArr);
    }

    private c s0(y yVar, y yVar2) {
        c cVar = new c();
        cVar.f12109a = false;
        cVar.f12110b = false;
        if (yVar == null || !yVar.f12261a.containsKey("android:visibility:visibility")) {
            cVar.f12111c = -1;
            cVar.f12113e = null;
        } else {
            cVar.f12111c = ((Integer) yVar.f12261a.get("android:visibility:visibility")).intValue();
            cVar.f12113e = (ViewGroup) yVar.f12261a.get("android:visibility:parent");
        }
        if (yVar2 == null || !yVar2.f12261a.containsKey("android:visibility:visibility")) {
            cVar.f12112d = -1;
            cVar.f12114f = null;
        } else {
            cVar.f12112d = ((Integer) yVar2.f12261a.get("android:visibility:visibility")).intValue();
            cVar.f12114f = (ViewGroup) yVar2.f12261a.get("android:visibility:parent");
        }
        if (yVar != null && yVar2 != null) {
            int i10 = cVar.f12111c;
            int i11 = cVar.f12112d;
            if (i10 != i11 || cVar.f12113e != cVar.f12114f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f12110b = false;
                        cVar.f12109a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f12110b = true;
                        cVar.f12109a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f12114f == null) {
                        cVar.f12110b = false;
                        cVar.f12109a = true;
                        return cVar;
                    }
                    if (cVar.f12113e == null) {
                        cVar.f12110b = true;
                        cVar.f12109a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (yVar == null && cVar.f12112d == 0) {
                cVar.f12110b = true;
                cVar.f12109a = true;
                return cVar;
            }
            if (yVar2 == null && cVar.f12111c == 0) {
                cVar.f12110b = false;
                cVar.f12109a = true;
            }
        }
        return cVar;
    }

    @Override // H4.AbstractC3664k
    public String[] J() {
        return f12096Q;
    }

    public Animator t0(ViewGroup viewGroup, y yVar, int i10, y yVar2, int i11) {
        if ((this.f12097P & 1) != 1 || yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            View view = (View) yVar2.f12262b.getParent();
            if (s0(w(view, false), K(view, false)).f12109a) {
                return null;
            }
        }
        return u0(viewGroup, yVar2.f12262b, yVar, yVar2);
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
    public android.animation.Animator v0(android.view.ViewGroup r10, H4.y r11, int r12, H4.y r13, int r14) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.N.v0(android.view.ViewGroup, H4.y, int, H4.y, int):android.animation.Animator");
    }

    public void x0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f12097P = i10;
    }

    @Override // H4.AbstractC3664k
    public void i(y yVar) {
        r0(yVar);
    }

    @Override // H4.AbstractC3664k
    public void l(y yVar) {
        r0(yVar);
    }

    @Override // H4.AbstractC3664k
    public Animator p(ViewGroup viewGroup, y yVar, y yVar2) {
        c cVarS0 = s0(yVar, yVar2);
        if (cVarS0.f12109a) {
            if (cVarS0.f12113e != null || cVarS0.f12114f != null) {
                if (cVarS0.f12110b) {
                    return t0(viewGroup, yVar, cVarS0.f12111c, yVar2, cVarS0.f12112d);
                }
                return v0(viewGroup, yVar, cVarS0.f12111c, yVar2, cVarS0.f12112d);
            }
            return null;
        }
        return null;
    }
}
