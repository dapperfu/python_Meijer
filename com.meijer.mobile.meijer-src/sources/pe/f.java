package pe;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C5756b;
import de.C13661a;

/* loaded from: classes4.dex */
public class f extends AbstractC16419a<View> {

    /* renamed from: g, reason: collision with root package name */
    private final float f156358g;

    /* renamed from: h, reason: collision with root package name */
    private final float f156359h;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f156346b.setTranslationY(0.0f);
            f.this.k(0.0f);
        }
    }

    private Animator g() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f156346b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f156346b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f156346b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new Q2.b());
        return animatorSet;
    }

    public void h(C5756b c5756b, Animator.AnimatorListener animatorListener) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f156346b, (Property<V, Float>) View.TRANSLATION_Y, this.f156346b.getHeight() * this.f156346b.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new Q2.b());
        objectAnimatorOfFloat.setDuration(C13661a.c(this.f156347c, this.f156348d, c5756b.getProgress()));
        objectAnimatorOfFloat.addListener(new a());
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f156358g = resources.getDimension(ce.d.f61628l);
        this.f156359h = resources.getDimension(ce.d.f61630m);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        Animator animatorG = g();
        animatorG.setDuration(this.f156349e);
        animatorG.start();
    }

    public void i(C5756b c5756b, Animator.AnimatorListener animatorListener) {
        Animator animatorG = g();
        animatorG.setDuration(C13661a.c(this.f156347c, this.f156348d, c5756b.getProgress()));
        if (animatorListener != null) {
            animatorG.addListener(animatorListener);
        }
        animatorG.start();
    }

    public void j(C5756b c5756b) {
        super.d(c5756b);
    }

    public void k(float f10) {
        float f11;
        float fA = a(f10);
        float width = this.f156346b.getWidth();
        float height = this.f156346b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f12 = this.f156358g / width;
            float f13 = this.f156359h / height;
            float fA2 = 1.0f - C13661a.a(0.0f, f12, fA);
            float fA3 = 1.0f - C13661a.a(0.0f, f13, fA);
            this.f156346b.setScaleX(fA2);
            this.f156346b.setPivotY(height);
            this.f156346b.setScaleY(fA3);
            V v10 = this.f156346b;
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

    public void l(C5756b c5756b) {
        if (super.e(c5756b) == null) {
            return;
        }
        k(c5756b.getProgress());
    }
}
