package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5978t {

    /* renamed from: androidx.fragment.app.t$b */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f55107a;

        /* renamed from: b, reason: collision with root package name */
        private final View f55108b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f55109c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f55110d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f55111e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f55111e = true;
            this.f55107a = viewGroup;
            this.f55108b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f55111e = true;
            if (this.f55109c) {
                return !this.f55110d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f55109c = true;
                p2.J.a(this.f55107a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f55109c || !this.f55111e) {
                this.f55107a.endViewTransition(this.f55108b);
                this.f55110d = true;
            } else {
                this.f55111e = false;
                this.f55107a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f55111e = true;
            if (this.f55109c) {
                return !this.f55110d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f55109c = true;
                p2.J.a(this.f55107a, this);
            }
            return true;
        }
    }

    private static int a(Fragment fragment, boolean z10, boolean z11) {
        return z11 ? z10 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z10 ? fragment.getEnterAnim() : fragment.getExitAnim();
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? K2.a.f16273e : K2.a.f16274f;
        }
        if (i10 == 8194) {
            return z10 ? K2.a.f16269a : K2.a.f16270b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? K2.a.f16271c : K2.a.f16272d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    @SuppressLint({"ResourceType"})
    static a b(Context context, Fragment fragment, boolean z10, boolean z11) throws Resources.NotFoundException {
        int nextTransition = fragment.getNextTransition();
        int iA = a(fragment, z10, z11);
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(K2.b.f16277c) != null) {
            fragment.mContainer.setTag(K2.b.f16277c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z10, iA);
        if (animationOnCreateAnimation != null) {
            return new a(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z10, iA);
        if (animatorOnCreateAnimator != null) {
            return new a(animatorOnCreateAnimator);
        }
        if (iA == 0 && nextTransition != 0) {
            iA = d(context, nextTransition, z10);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            } else {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                    if (animatorLoadAnimator != null) {
                        return new a(animatorLoadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!zEquals) {
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    private static int c(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: androidx.fragment.app.t$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f55105a;

        /* renamed from: b, reason: collision with root package name */
        public final AnimatorSet f55106b;

        a(Animation animation) {
            this.f55105a = animation;
            this.f55106b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f55105a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f55106b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }
}
