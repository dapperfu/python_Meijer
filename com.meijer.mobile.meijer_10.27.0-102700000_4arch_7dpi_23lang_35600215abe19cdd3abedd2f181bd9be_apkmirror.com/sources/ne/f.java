package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C5614b;
import be.C6230a;

/* loaded from: classes4.dex */
public class f extends AbstractC15791a<View> {

    /* renamed from: g, reason: collision with root package name */
    private final float f151227g;

    /* renamed from: h, reason: collision with root package name */
    private final float f151228h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f151215b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f151215b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f151215b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f151215b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new Q2.b());
        return animatorSet;
    }

    public void h(C5614b c5614b, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f151215b, (Property<V, Float>) View.TRANSLATION_Y, this.f151215b.getHeight() * this.f151215b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new Q2.b());
        objectAnimatorOfFloat.setDuration(C6230a.c(this.f151216c, this.f151217d, c5614b.getProgress()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f151227g = resources.getDimension(ae.d.f44613l);
        this.f151228h = resources.getDimension(ae.d.f44615m);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f151218e);
        animatorG.start();
    }

    public void i(C5614b c5614b, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(C6230a.c(this.f151216c, this.f151217d, c5614b.getProgress()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(C5614b c5614b) {
        super.d(c5614b);
    }

    public void k(float f10) {
        float f11;
        float fA = a(f10);
        float width = this.f151215b.getWidth();
        float height = this.f151215b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f12 = this.f151227g / width;
            float f13 = this.f151228h / height;
            float fA2 = 1.0f - C6230a.a(0.0f, f12, fA);
            float fA3 = 1.0f - C6230a.a(0.0f, f13, fA);
            this.f151215b.setScaleX(fA2);
            this.f151215b.setPivotY(height);
            this.f151215b.setScaleY(fA3);
            V v10 = this.f151215b;
            if (v10 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v10;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    childAt.setPivotY(-childAt.getTop());
                    if (fA3 != 0.0f) {
                        f11 = fA2 / fA3;
                    } else {
                        f11 = 1.0f;
                    }
                    childAt.setScaleY(f11);
                }
            }
        }
    }

    public void l(C5614b c5614b) {
        if (super.e(c5614b) == null) {
            return;
        }
        k(c5614b.getProgress());
    }
}
