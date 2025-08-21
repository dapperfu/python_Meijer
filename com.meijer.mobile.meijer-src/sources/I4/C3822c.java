package I4;

import I4.AbstractC3830k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: I4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3822c extends N {

    /* renamed from: I4.c$a */
    private static class a extends AnimatorListenerAdapter implements AbstractC3830k.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f14212a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f14213b = false;

        @Override // I4.AbstractC3830k.h
        public void f(AbstractC3830k abstractC3830k, boolean z10) {
        }

        @Override // I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
        }

        @Override // I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // I4.AbstractC3830k.h
        public void e(AbstractC3830k abstractC3830k) {
            this.f14212a.setTag(C3827h.f14236d, null);
        }

        @Override // I4.AbstractC3830k.h
        public void g(AbstractC3830k abstractC3830k) {
            this.f14212a.setTag(C3827h.f14236d, Float.valueOf(this.f14212a.getVisibility() == 0 ? C.b(this.f14212a) : 0.0f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C.e(this.f14212a, 1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f14213b) {
                this.f14212a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            C.e(this.f14212a, 1.0f);
            C.a(this.f14212a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f14212a.hasOverlappingRendering() && this.f14212a.getLayerType() == 0) {
                this.f14213b = true;
                this.f14212a.setLayerType(2, null);
            }
        }

        a(View view) {
            this.f14212a = view;
        }
    }

    public C3822c(int i10) {
        x0(i10);
    }

    @Override // I4.AbstractC3830k
    public boolean M() {
        return true;
    }

    private Animator y0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, C.f14151b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        A().c(aVar);
        return objectAnimatorOfFloat;
    }

    private static float z0(y yVar, float f10) {
        Float f11;
        return (yVar == null || (f11 = (Float) yVar.f14325a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    public C3822c() {
    }

    @Override // I4.N, I4.AbstractC3830k
    public void l(y yVar) {
        super.l(yVar);
        Float fValueOf = (Float) yVar.f14326b.getTag(C3827h.f14236d);
        if (fValueOf == null) {
            if (yVar.f14326b.getVisibility() == 0) {
                fValueOf = Float.valueOf(C.b(yVar.f14326b));
            } else {
                fValueOf = Float.valueOf(0.0f);
            }
        }
        yVar.f14325a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // I4.N
    public Animator u0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        return y0(view, z0(yVar, 0.0f), 1.0f);
    }

    @Override // I4.N
    public Animator w0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        Animator animatorY0 = y0(view, z0(yVar, 1.0f), 0.0f);
        if (animatorY0 == null) {
            C.e(view, z0(yVar2, 1.0f));
        }
        return animatorY0;
    }
}
