package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import p2.InterfaceC16357g0;
import p2.InterfaceC16361i0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f54154a;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16357g0 f54155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54156b;

        a(InterfaceC16357g0 interfaceC16357g0, View view) {
            this.f54155a = interfaceC16357g0;
            this.f54156b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f54155a.a(this.f54156b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54155a.b(this.f54156b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f54155a.c(this.f54156b);
        }
    }

    private void h(View view, InterfaceC16357g0 interfaceC16357g0) {
        if (interfaceC16357g0 != null) {
            view.animate().setListener(new a(interfaceC16357g0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public h b(float f10) {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f54154a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public h e(long j10) {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public h g(InterfaceC16357g0 interfaceC16357g0) {
        View view = this.f54154a.get();
        if (view != null) {
            h(view, interfaceC16357g0);
        }
        return this;
    }

    public h i(long j10) {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public h j(final InterfaceC16361i0 interfaceC16361i0) {
        final View view = this.f54154a.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC16361i0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: p2.f0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC16361i0.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public h l(float f10) {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().translationXBy(f10);
        }
        return this;
    }

    public h m(float f10) {
        View view = this.f54154a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }

    h(View view) {
        this.f54154a = new WeakReference<>(view);
    }
}
