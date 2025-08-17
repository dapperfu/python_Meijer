package H4;

import H4.AbstractC3664k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: H4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3656c extends N {

    /* renamed from: H4.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC3664k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f12148a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12149b = false;

        @Override // H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void g(AbstractC3664k abstractC3664k, boolean z10) {
        }

        @Override // H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
        }

        @Override // H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // H4.AbstractC3664k.h
        public void f(AbstractC3664k abstractC3664k) {
            this.f12148a.setTag(C3661h.f12172d, Float.valueOf(this.f12148a.getVisibility() == 0 ? C.b(this.f12148a) : 0.0f));
        }

        @Override // H4.AbstractC3664k.h
        public void h(AbstractC3664k abstractC3664k) {
            this.f12148a.setTag(C3661h.f12172d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C.e(this.f12148a, 1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f12149b) {
                this.f12148a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            C.e(this.f12148a, 1.0f);
            C.a(this.f12148a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f12148a.hasOverlappingRendering() && this.f12148a.getLayerType() == 0) {
                this.f12149b = true;
                this.f12148a.setLayerType(2, null);
            }
        }

        a(View view) {
            this.f12148a = view;
        }
    }

    public C3656c(int i10) {
        x0(i10);
    }

    @Override // H4.AbstractC3664k
    public boolean M() {
        return true;
    }

    private Animator y0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C.f12087b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        A().c(aVar);
        return objectAnimatorOfFloat;
    }

    private static float z0(y yVar, float f10) {
        Float f11;
        return (yVar == null || (f11 = (Float) yVar.f12261a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    public C3656c() {
    }

    @Override // H4.N, H4.AbstractC3664k
    public void l(y yVar) {
        super.l(yVar);
        Float fValueOf = (Float) yVar.f12262b.getTag(C3661h.f12172d);
        if (fValueOf == null) {
            if (yVar.f12262b.getVisibility() == 0) {
                fValueOf = Float.valueOf(C.b(yVar.f12262b));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        yVar.f12261a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // H4.N
    public Animator u0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        return y0(view, z0(yVar, 0.0f), 1.0f);
    }

    @Override // H4.N
    public Animator w0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        Animator animatorY0 = y0(view, z0(yVar, 1.0f), 0.0f);
        if (animatorY0 == null) {
            C.e(view, z0(yVar2, 1.0f));
        }
        return animatorY0;
    }
}
