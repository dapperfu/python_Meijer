package ne;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.view.C5614b;
import be.C6230a;
import p2.r;

/* loaded from: classes4.dex */
public class h extends AbstractC15791a<View> {

    /* renamed from: g, reason: collision with root package name */
    private final float f151230g;

    /* renamed from: h, reason: collision with root package name */
    private final float f151231h;

    /* renamed from: i, reason: collision with root package name */
    private final float f151232i;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f151233a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f151234b;

        a(boolean z10, int i10) {
            this.f151233a = z10;
            this.f151234b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.f151215b.setTranslationX(0.0f);
            h.this.k(0.0f, this.f151233a, this.f151234b);
        }
    }

    private boolean g(int i10, int i11) {
        return (r.b(i10, ViewCompat.z(this.f151215b)) & i11) == i11;
    }

    private int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f151215b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f151230g = resources.getDimension(ae.d.f44619o);
        this.f151231h = resources.getDimension(ae.d.f44617n);
        this.f151232i = resources.getDimension(ae.d.f44621p);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f151215b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f151215b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f151215b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f151218e);
        animatorSet.start();
    }

    public void h(C5614b c5614b, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10;
        if (c5614b.getSwipeEdge() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zG = g(i10, 3);
        float width = (this.f151215b.getWidth() * this.f151215b.getScaleX()) + i(zG);
        V v10 = this.f151215b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new Q2.b());
        objectAnimatorOfFloat.setDuration(C6230a.c(this.f151216c, this.f151217d, c5614b.getProgress()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void j(C5614b c5614b) {
        super.d(c5614b);
    }

    public void k(float f10, boolean z10, int i10) {
        boolean z11;
        int right;
        float f11;
        float f12;
        float fA = a(f10);
        boolean zG = g(i10, 3);
        if (z10 == zG) {
            z11 = true;
        } else {
            z11 = false;
        }
        int width = this.f151215b.getWidth();
        int height = this.f151215b.getHeight();
        float f13 = width;
        if (f13 > 0.0f) {
            float f14 = height;
            if (f14 > 0.0f) {
                float f15 = this.f151230g / f13;
                float f16 = this.f151231h / f13;
                float f17 = this.f151232i / f14;
                V v10 = this.f151215b;
                if (zG) {
                    f13 = 0.0f;
                }
                v10.setPivotX(f13);
                if (!z11) {
                    f16 = -f15;
                }
                float fA2 = C6230a.a(0.0f, f16, fA);
                float f18 = fA2 + 1.0f;
                this.f151215b.setScaleX(f18);
                float fA3 = 1.0f - C6230a.a(0.0f, f17, fA);
                this.f151215b.setScaleY(fA3);
                V v11 = this.f151215b;
                if (v11 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) v11;
                    for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                        View childAt = viewGroup.getChildAt(i11);
                        if (zG) {
                            right = (width - childAt.getRight()) + childAt.getWidth();
                        } else {
                            right = -childAt.getLeft();
                        }
                        childAt.setPivotX(right);
                        childAt.setPivotY(-childAt.getTop());
                        if (z11) {
                            f11 = 1.0f - fA2;
                        } else {
                            f11 = 1.0f;
                        }
                        if (fA3 != 0.0f) {
                            f12 = (f18 / fA3) * f11;
                        } else {
                            f12 = 1.0f;
                        }
                        childAt.setScaleX(f11);
                        childAt.setScaleY(f12);
                    }
                }
            }
        }
    }

    public void l(C5614b c5614b, int i10) {
        boolean z10;
        if (super.e(c5614b) == null) {
            return;
        }
        if (c5614b.getSwipeEdge() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(c5614b.getProgress(), z10, i10);
    }
}
