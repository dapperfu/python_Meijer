package pe;

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
import androidx.view.C5756b;
import de.C13661a;
import p2.r;

/* loaded from: classes4.dex */
public class h extends AbstractC16419a<View> {

    /* renamed from: g, reason: collision with root package name */
    private final float f156361g;

    /* renamed from: h, reason: collision with root package name */
    private final float f156362h;

    /* renamed from: i, reason: collision with root package name */
    private final float f156363i;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f156364a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f156365b;

        a(boolean z10, int i10) {
            this.f156364a = z10;
            this.f156365b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h.this.f156346b.setTranslationX(0.0f);
            h.this.k(0.0f, this.f156364a, this.f156365b);
        }
    }

    private boolean g(int i10, int i11) {
        return (r.b(i10, ViewCompat.z(this.f156346b)) & i11) == i11;
    }

    private int i(boolean z10) {
        ViewGroup.LayoutParams layoutParams = this.f156346b.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.f156361g = resources.getDimension(ce.d.f61634o);
        this.f156362h = resources.getDimension(ce.d.f61632n);
        this.f156363i = resources.getDimension(ce.d.f61636p);
    }

    public void f() {
        if (super.b() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.f156346b, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.f156346b, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v10 = this.f156346b;
        if (v10 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v10;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i10), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.f156349e);
        animatorSet.start();
    }

    public void h(C5756b c5756b, int i10, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z10;
        if (c5756b.getSwipeEdge() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zG = g(i10, 3);
        float width = (this.f156346b.getWidth() * this.f156346b.getScaleX()) + i(zG);
        V v10 = this.f156346b;
        Property property = View.TRANSLATION_X;
        if (zG) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v10, (Property<V, Float>) property, width);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new Q2.b());
        objectAnimatorOfFloat.setDuration(C13661a.c(this.f156347c, this.f156348d, c5756b.getProgress()));
        objectAnimatorOfFloat.addListener(new a(z10, i10));
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void j(C5756b c5756b) {
        super.d(c5756b);
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
        int width = this.f156346b.getWidth();
        int height = this.f156346b.getHeight();
        float f13 = width;
        if (f13 > 0.0f) {
            float f14 = height;
            if (f14 > 0.0f) {
                float f15 = this.f156361g / f13;
                float f16 = this.f156362h / f13;
                float f17 = this.f156363i / f14;
                V v10 = this.f156346b;
                if (zG) {
                    f13 = 0.0f;
                }
                v10.setPivotX(f13);
                if (!z11) {
                    f16 = -f15;
                }
                float fA2 = C13661a.a(0.0f, f16, fA);
                float f18 = fA2 + 1.0f;
                this.f156346b.setScaleX(f18);
                float fA3 = 1.0f - C13661a.a(0.0f, f17, fA);
                this.f156346b.setScaleY(fA3);
                V v11 = this.f156346b;
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

    public void l(C5756b c5756b, int i10) {
        boolean z10;
        if (super.e(c5756b) == null) {
            return;
        }
        if (c5756b.getSwipeEdge() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k(c5756b.getProgress(), z10, i10);
    }
}
