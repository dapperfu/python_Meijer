package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p2.InterfaceC16212g0;
import p2.InterfaceC16216i0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f53930a;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16212g0 f53931a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f53932b;

        a(InterfaceC16212g0 interfaceC16212g0, View view) {
            this.f53931a = interfaceC16212g0;
            this.f53932b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f53931a.a(this.f53932b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f53931a.b(this.f53932b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f53931a.c(this.f53932b);
        }
    }

    private void h(View view, InterfaceC16212g0 interfaceC16212g0) {
        if (interfaceC16212g0 != null) {
            view.animate().setListener(new a(interfaceC16212g0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public h b(float f10) {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f53930a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public h e(long j10) {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public h g(InterfaceC16212g0 interfaceC16212g0) {
        View view = this.f53930a.get();
        if (view != null) {
            h(view, interfaceC16212g0);
        }
        return this;
    }

    public h i(long j10) {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public h j(final InterfaceC16216i0 interfaceC16216i0) {
        final View view = this.f53930a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC16216i0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: p2.f0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC16216i0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public h l(float f10) {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }

    public h m(float f10) {
        View view = this.f53930a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    h(View view) {
        this.f53930a = new WeakReference<>(view);
    }
}
