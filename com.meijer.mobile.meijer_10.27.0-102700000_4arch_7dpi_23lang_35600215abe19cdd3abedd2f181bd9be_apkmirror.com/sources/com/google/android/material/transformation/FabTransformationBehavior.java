package com.google.android.material.transformation;

import ae.f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import be.C6230a;
import be.C6231b;
import be.C6232c;
import be.C6233d;
import be.C6234e;
import be.C6237h;
import be.C6238i;
import be.C6239j;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.List;
import me.C15608a;

@Deprecated
/* loaded from: classes4.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f87990c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f87991d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f87992e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f87993f;

    /* renamed from: g, reason: collision with root package name */
    private float f87994g;

    /* renamed from: h, reason: collision with root package name */
    private float f87995h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f87996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f87997b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f87998c;

        a(boolean z10, View view, View view2) {
            this.f87996a = z10;
            this.f87997b = view;
            this.f87998c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f87996a) {
                return;
            }
            this.f87997b.setVisibility(4);
            this.f87998c.setAlpha(1.0f);
            this.f87998c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f87996a) {
                this.f87997b.setVisibility(0);
                this.f87998c.setAlpha(0.0f);
                this.f87998c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f88000a;

        b(View view) {
            this.f88000a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f88000a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f88002a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f88003b;

        c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f88002a = cVar;
            this.f88003b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f88002a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f88002a.setCircularRevealOverlayDrawable(this.f88003b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f88005a;

        d(com.google.android.material.circularreveal.c cVar) {
            this.f88005a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.f88005a.getRevealInfo();
            revealInfo.f86785c = Float.MAX_VALUE;
            this.f88005a.setRevealInfo(revealInfo);
        }
    }

    public FabTransformationBehavior() {
        this.f87990c = new Rect();
        this.f87991d = new RectF();
        this.f87992e = new RectF();
        this.f87993f = new int[2];
    }

    private Pair<C6238i, C6238i> R(float f10, float f11, boolean z10, e eVar) {
        C6238i c6238iE;
        C6238i c6238iE2;
        if (f10 == 0.0f || f11 == 0.0f) {
            c6238iE = eVar.f88007a.e("translationXLinear");
            c6238iE2 = eVar.f88007a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            c6238iE = eVar.f88007a.e("translationXCurveDownwards");
            c6238iE2 = eVar.f88007a.e("translationYCurveDownwards");
        } else {
            c6238iE = eVar.f88007a.e("translationXCurveUpwards");
            c6238iE2 = eVar.f88007a.e("translationYCurveUpwards");
        }
        return new Pair<>(c6238iE, c6238iE2);
    }

    private void e0(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(j13);
            animatorCreateCircularReveal.setDuration(j12 - j13);
            list.add(animatorCreateCircularReveal);
        }
    }

    protected abstract e i0(Context context, boolean z10);

    protected static class e {

        /* renamed from: a, reason: collision with root package name */
        public C6237h f88007a;

        /* renamed from: b, reason: collision with root package name */
        public C6239j f88008b;

        protected e() {
        }
    }

    private ViewGroup O(View view) {
        View viewFindViewById = view.findViewById(f.f44662H);
        return viewFindViewById != null ? j0(viewFindViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    private float S(View view, View view2, C6239j c6239j) {
        RectF rectF = this.f87991d;
        RectF rectF2 = this.f87992e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, c6239j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float T(View view, View view2, C6239j c6239j) {
        RectF rectF = this.f87991d;
        RectF rectF2 = this.f87992e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, c6239j));
        return rectF.centerY() - rectF2.top;
    }

    private float U(View view, View view2, C6239j c6239j) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f87991d;
        RectF rectF2 = this.f87992e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = c6239j.f60135a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + c6239j.f60136b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + c6239j.f60136b;
    }

    private float V(View view, View view2, C6239j c6239j) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f87991d;
        RectF rectF2 = this.f87992e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = c6239j.f60135a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + c6239j.f60137c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + c6239j.f60137c;
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.c) && com.google.android.material.circularreveal.b.f86778a == 0) || (viewGroupO = O(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    C6233d.f60121a.set(viewGroupO, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, C6233d.f60121a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, C6233d.f60121a, 0.0f);
            }
            eVar.f88007a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Z(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            int iH0 = h0(view);
            int i10 = 16777215 & iH0;
            if (z10) {
                if (!z11) {
                    cVar.setCircularRevealScrimColor(iH0);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, c.d.f86782a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, c.d.f86782a, iH0);
            }
            objectAnimatorOfInt.setEvaluator(C6232c.b());
            eVar.f88007a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void a0(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float fU = U(view, view2, eVar.f88008b);
        float fV = V(view, view2, eVar.f88008b);
        Pair<C6238i, C6238i> pairR = R(fU, fV, z10, eVar);
        C6238i c6238i = (C6238i) pairR.first;
        C6238i c6238i2 = (C6238i) pairR.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fU = this.f87994g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fU);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fV = this.f87995h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fV);
        c6238i.a(objectAnimatorOfFloat);
        c6238i2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float fS = S(view, view2, eVar.f88008b);
            float fT = T(view, view2, eVar.f88008b);
            ((FloatingActionButton) view).i(this.f87990c);
            float fWidth = this.f87990c.width() / 2.0f;
            C6238i c6238iE = eVar.f88007a.e("expansion");
            if (z10) {
                if (!z11) {
                    cVar.setRevealInfo(new c.e(fS, fT, fWidth));
                }
                if (z11) {
                    fWidth = cVar.getRevealInfo().f86785c;
                }
                animatorA = com.google.android.material.circularreveal.a.a(cVar, fS, fT, C15608a.b(fS, fT, 0.0f, 0.0f, f10, f11));
                animatorA.addListener(new d(cVar));
                f0(view2, c6238iE.c(), (int) fS, (int) fT, fWidth, list);
            } else {
                float f12 = cVar.getRevealInfo().f86785c;
                Animator animatorA2 = com.google.android.material.circularreveal.a.a(cVar, fS, fT, fWidth);
                int i10 = (int) fS;
                int i11 = (int) fT;
                f0(view2, c6238iE.c(), i10, i11, f12, list);
                e0(view2, c6238iE.c(), c6238iE.d(), eVar.f88007a.f(), i10, i11, fWidth, list);
                animatorA = animatorA2;
            }
            c6238iE.a(animatorA);
            list.add(animatorA);
            list2.add(com.google.android.material.circularreveal.a.b(cVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof com.google.android.material.circularreveal.c) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z10) {
                if (!z11) {
                    drawable.setAlpha(l3.f92484c);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C6234e.f60122b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C6234e.f60122b, l3.f92484c);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f88007a.e("iconFade").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new c(cVar, drawable));
        }
    }

    private void f0(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (j10 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j10);
            list.add(animatorCreateCircularReveal);
        }
    }

    private void g0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        C6238i c6238i;
        C6238i c6238i2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fU = U(view, view2, eVar.f88008b);
        float fV = V(view, view2, eVar.f88008b);
        Pair<C6238i, C6238i> pairR = R(fU, fV, z10, eVar);
        C6238i c6238i3 = (C6238i) pairR.first;
        C6238i c6238i4 = (C6238i) pairR.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fU);
                view2.setTranslationY(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            c6238i = c6238i4;
            c6238i2 = c6238i3;
            P(view2, eVar, c6238i2, c6238i, -fU, -fV, 0.0f, 0.0f, rectF);
        } else {
            c6238i = c6238i4;
            c6238i2 = c6238i3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fU);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fV);
        }
        c6238i2.a(objectAnimatorOfFloat);
        c6238i.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private ViewGroup j0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void k(CoordinatorLayout.f fVar) {
        if (fVar.f53638h == 0) {
            fVar.f53638h = 80;
        }
    }

    private void P(View view, e eVar, C6238i c6238i, C6238i c6238i2, float f10, float f11, float f12, float f13, RectF rectF) {
        float fW = W(eVar, c6238i, f10, f12);
        float fW2 = W(eVar, c6238i2, f11, f13);
        Rect rect = this.f87990c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f87991d;
        rectF2.set(rect);
        RectF rectF3 = this.f87992e;
        X(view, rectF3);
        rectF3.offset(fW, fW2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(View view, RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f87994g, this.f87995h);
    }

    private float W(e eVar, C6238i c6238i, float f10, float f11) {
        long jC = c6238i.c();
        long jD = c6238i.d();
        C6238i c6238iE = eVar.f88007a.e("expansion");
        return C6230a.a(f10, f11, c6238i.e().getInterpolation((((c6238iE.c() + c6238iE.d()) + 17) - jC) / jD));
    }

    private void X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f87993f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    @TargetApi(21)
    private void b0(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fU = ViewCompat.u(view2) - ViewCompat.u(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fU);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fU);
        }
        eVar.f88007a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private int h0(View view) {
        ColorStateList colorStateListR = ViewCompat.r(view);
        if (colorStateListR != null) {
            return colorStateListR.getColorForState(view.getDrawableState(), colorStateListR.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet N(View view, View view2, boolean z10, boolean z11) {
        e eVarI0 = i0(view2.getContext(), z10);
        if (z10) {
            this.f87994g = view.getTranslationX();
            this.f87995h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        RectF rectF = this.f87991d;
        g0(view, view2, z10, z11, eVarI0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        a0(view, view2, z10, eVarI0, arrayList);
        d0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        c0(view, view2, z10, z11, eVarI0, fWidth, fHeight, arrayList, arrayList2);
        Z(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        Y(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C6231b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener(arrayList2.get(i10));
        }
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (!(view2 instanceof FloatingActionButton)) {
                return false;
            }
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint != 0 && expandedComponentIdHint != view.getId()) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f87990c = new Rect();
        this.f87991d = new RectF();
        this.f87992e = new RectF();
        this.f87993f = new int[2];
    }
}
