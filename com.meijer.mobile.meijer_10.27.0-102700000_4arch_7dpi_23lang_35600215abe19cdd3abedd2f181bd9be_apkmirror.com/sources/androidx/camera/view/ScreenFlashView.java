package androidx.camera.view;

import C.H;
import C.P;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.camera.view.ScreenFlashView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ScreenFlashView extends View {

    /* renamed from: a, reason: collision with root package name */
    private Window f47604a;

    /* renamed from: b, reason: collision with root package name */
    private H.i f47605b;

    class a implements H.i {

        /* renamed from: a, reason: collision with root package name */
        private float f47606a;

        /* renamed from: b, reason: collision with root package name */
        private ValueAnimator f47607b;

        a() {
        }

        @Override // C.H.i
        public void a(long j10, final H.j jVar) {
            P.a("ScreenFlashView", "ScreenFlash#apply");
            this.f47606a = ScreenFlashView.this.getBrightness();
            ScreenFlashView.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f47607b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ScreenFlashView screenFlashView = ScreenFlashView.this;
            Objects.requireNonNull(jVar);
            this.f47607b = screenFlashView.e(new Runnable() { // from class: U.g
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.a();
                }
            });
        }

        @Override // C.H.i
        public void clear() {
            P.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
            ValueAnimator valueAnimator = this.f47607b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f47607b = null;
            }
            ScreenFlashView.this.setAlpha(0.0f);
            ScreenFlashView.this.setBrightness(this.f47606a);
        }
    }

    class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f47609a;

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        b(Runnable runnable) {
            this.f47609a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            P.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f47609a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public ScreenFlashView(Context context) {
        this(context, null);
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ValueAnimator e(Runnable runnable) {
        P.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: U.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScreenFlashView.a(this.f35582a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    private void f(Window window) {
        if (this.f47604a != window) {
            this.f47605b = window == null ? null : new a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f47604a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        P.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f10) {
        if (this.f47604a == null) {
            P.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f10)) {
            P.c("ScreenFlashView", "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f47604a.getAttributes();
        attributes.screenBrightness = f10;
        this.f47604a.setAttributes(attributes);
        P.a("ScreenFlashView", "Brightness set to " + attributes.screenBrightness);
    }

    private void setScreenFlashUiInfo(H.i iVar) {
        P.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public H.i getScreenFlash() {
        return this.f47605b;
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public static /* synthetic */ void a(ScreenFlashView screenFlashView, ValueAnimator valueAnimator) {
        screenFlashView.getClass();
        P.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        screenFlashView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setController(U.a aVar) {
        G.o.a();
    }

    public void setScreenFlashWindow(Window window) {
        G.o.a();
        f(window);
        this.f47604a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public ScreenFlashView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }
}
