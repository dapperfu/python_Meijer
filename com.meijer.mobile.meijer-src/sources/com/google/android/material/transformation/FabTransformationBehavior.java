package com.google.android.material.transformation;

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
import ce.f;
import com.google.android.material.circularreveal.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.medallia.digital.mobilesdk.l3;
import de.C13661a;
import de.C13662b;
import de.C13663c;
import de.C13664d;
import de.C13665e;
import de.C13668h;
import de.C13669i;
import de.C13670j;
import java.util.ArrayList;
import java.util.List;
import oe.C16118a;

@Deprecated
/* loaded from: classes4.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    private final Rect f88830c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f88831d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f88832e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f88833f;

    /* renamed from: g, reason: collision with root package name */
    private float f88834g;

    /* renamed from: h, reason: collision with root package name */
    private float f88835h;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f88836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f88837b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f88838c;

        a(boolean z10, View view, View view2) {
            this.f88836a = z10;
            this.f88837b = view;
            this.f88838c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f88836a) {
                return;
            }
            this.f88837b.setVisibility(4);
            this.f88838c.setAlpha(1.0f);
            this.f88838c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f88836a) {
                this.f88837b.setVisibility(0);
                this.f88838c.setAlpha(0.0f);
                this.f88838c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f88840a;

        b(View view) {
            this.f88840a = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f88840a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f88842a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Drawable f88843b;

        c(com.google.android.material.circularreveal.c cVar, Drawable drawable) {
            this.f88842a = cVar;
            this.f88843b = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f88842a.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f88842a.setCircularRevealOverlayDrawable(this.f88843b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.circularreveal.c f88845a;

        d(com.google.android.material.circularreveal.c cVar) {
            this.f88845a = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.e revealInfo = this.f88845a.getRevealInfo();
            revealInfo.f87625c = Float.MAX_VALUE;
            this.f88845a.setRevealInfo(revealInfo);
        }
    }

    public FabTransformationBehavior() {
        this.f88830c = new Rect();
        this.f88831d = new RectF();
        this.f88832e = new RectF();
        this.f88833f = new int[2];
    }

    private Pair<C13669i, C13669i> R(float f10, float f11, boolean z10, e eVar) {
        C13669i c13669iE;
        C13669i c13669iE2;
        if (f10 == 0.0f || f11 == 0.0f) {
            c13669iE = eVar.f88847a.e("translationXLinear");
            c13669iE2 = eVar.f88847a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            c13669iE = eVar.f88847a.e("translationXCurveDownwards");
            c13669iE2 = eVar.f88847a.e("translationYCurveDownwards");
        } else {
            c13669iE = eVar.f88847a.e("translationXCurveUpwards");
            c13669iE2 = eVar.f88847a.e("translationYCurveUpwards");
        }
        return new Pair<>(c13669iE, c13669iE2);
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
        public C13668h f88847a;

        /* renamed from: b, reason: collision with root package name */
        public C13670j f88848b;

        protected e() {
        }
    }

    private ViewGroup O(View view) {
        View viewFindViewById = view.findViewById(f.f61677H);
        return viewFindViewById != null ? j0(viewFindViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? j0(((ViewGroup) view).getChildAt(0)) : j0(view);
    }

    private float S(View view, View view2, C13670j c13670j) {
        RectF rectF = this.f88831d;
        RectF rectF2 = this.f88832e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(-U(view, view2, c13670j), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float T(View view, View view2, C13670j c13670j) {
        RectF rectF = this.f88831d;
        RectF rectF2 = this.f88832e;
        Q(view, rectF);
        X(view2, rectF2);
        rectF2.offset(0.0f, -V(view, view2, c13670j));
        return rectF.centerY() - rectF2.top;
    }

    private float U(View view, View view2, C13670j c13670j) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f88831d;
        RectF rectF2 = this.f88832e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = c13670j.f128370a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + c13670j.f128371b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + c13670j.f128371b;
    }

    private float V(View view, View view2, C13670j c13670j) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f88831d;
        RectF rectF2 = this.f88832e;
        Q(view, rectF);
        X(view2, rectF2);
        int i10 = c13670j.f128370a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + c13670j.f128372c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + c13670j.f128372c;
    }

    private void Y(View view, View view2, boolean z10, boolean z11, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupO;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.c) && com.google.android.material.circularreveal.b.f87618a == 0) || (viewGroupO = O(view2)) == null) {
                return;
            }
            if (z10) {
                if (!z11) {
                    C13664d.f128356a.set(viewGroupO, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, C13664d.f128356a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupO, C13664d.f128356a, 0.0f);
            }
            eVar.f88847a.e("contentFade").a(objectAnimatorOfFloat);
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
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, c.d.f87622a, i10);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(cVar, c.d.f87622a, iH0);
            }
            objectAnimatorOfInt.setEvaluator(C13663c.b());
            eVar.f88847a.e("color").a(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void a0(View view, View view2, boolean z10, e eVar, List<Animator> list) {
        float fU = U(view, view2, eVar.f88848b);
        float fV = V(view, view2, eVar.f88848b);
        Pair<C13669i, C13669i> pairR = R(fU, fV, z10, eVar);
        C13669i c13669i = (C13669i) pairR.first;
        C13669i c13669i2 = (C13669i) pairR.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fU = this.f88834g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fU);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fV = this.f88835h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fV);
        c13669i.a(objectAnimatorOfFloat);
        c13669i2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c0(View view, View view2, boolean z10, boolean z11, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animatorA;
        if (view2 instanceof com.google.android.material.circularreveal.c) {
            com.google.android.material.circularreveal.c cVar = (com.google.android.material.circularreveal.c) view2;
            float fS = S(view, view2, eVar.f88848b);
            float fT = T(view, view2, eVar.f88848b);
            ((FloatingActionButton) view).i(this.f88830c);
            float fWidth = this.f88830c.width() / 2.0f;
            C13669i c13669iE = eVar.f88847a.e("expansion");
            if (z10) {
                if (!z11) {
                    cVar.setRevealInfo(new c.e(fS, fT, fWidth));
                }
                if (z11) {
                    fWidth = cVar.getRevealInfo().f87625c;
                }
                animatorA = com.google.android.material.circularreveal.a.a(cVar, fS, fT, C16118a.b(fS, fT, 0.0f, 0.0f, f10, f11));
                animatorA.addListener(new d(cVar));
                f0(view2, c13669iE.c(), (int) fS, (int) fT, fWidth, list);
            } else {
                float f12 = cVar.getRevealInfo().f87625c;
                Animator animatorA2 = com.google.android.material.circularreveal.a.a(cVar, fS, fT, fWidth);
                int i10 = (int) fS;
                int i11 = (int) fT;
                f0(view2, c13669iE.c(), i10, i11, f12, list);
                e0(view2, c13669iE.c(), c13669iE.d(), eVar.f88847a.f(), i10, i11, fWidth, list);
                animatorA = animatorA2;
            }
            c13669iE.a(animatorA);
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
                    drawable.setAlpha(l3.f93323c);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C13665e.f128357b, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C13665e.f128357b, l3.f93323c);
            }
            objectAnimatorOfInt.addUpdateListener(new b(view2));
            eVar.f88847a.e("iconFade").a(objectAnimatorOfInt);
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
        C13669i c13669i;
        C13669i c13669i2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fU = U(view, view2, eVar.f88848b);
        float fV = V(view, view2, eVar.f88848b);
        Pair<C13669i, C13669i> pairR = R(fU, fV, z10, eVar);
        C13669i c13669i3 = (C13669i) pairR.first;
        C13669i c13669i4 = (C13669i) pairR.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fU);
                view2.setTranslationY(-fV);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            c13669i = c13669i4;
            c13669i2 = c13669i3;
            P(view2, eVar, c13669i2, c13669i, -fU, -fV, 0.0f, 0.0f, rectF);
        } else {
            c13669i = c13669i4;
            c13669i2 = c13669i3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fU);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fV);
        }
        c13669i2.a(objectAnimatorOfFloat);
        c13669i.a(objectAnimatorOfFloat2);
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
        if (fVar.f53862h == 0) {
            fVar.f53862h = 80;
        }
    }

    private void P(View view, e eVar, C13669i c13669i, C13669i c13669i2, float f10, float f11, float f12, float f13, RectF rectF) {
        float fW = W(eVar, c13669i, f10, f12);
        float fW2 = W(eVar, c13669i2, f11, f13);
        Rect rect = this.f88830c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f88831d;
        rectF2.set(rect);
        RectF rectF3 = this.f88832e;
        X(view, rectF3);
        rectF3.offset(fW, fW2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void Q(View view, RectF rectF) {
        X(view, rectF);
        rectF.offset(this.f88834g, this.f88835h);
    }

    private float W(e eVar, C13669i c13669i, float f10, float f11) {
        long jC = c13669i.c();
        long jD = c13669i.d();
        C13669i c13669iE = eVar.f88847a.e("expansion");
        return C13661a.a(f10, f11, c13669i.e().getInterpolation((((c13669iE.c() + c13669iE.d()) + 17) - jC) / jD));
    }

    private void X(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f88833f);
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
        eVar.f88847a.e("elevation").a(objectAnimatorOfFloat);
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
            this.f88834g = view.getTranslationX();
            this.f88835h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        b0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        RectF rectF = this.f88831d;
        g0(view, view2, z10, z11, eVarI0, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        a0(view, view2, z10, eVarI0, arrayList);
        d0(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        c0(view, view2, z10, z11, eVarI0, fWidth, fHeight, arrayList, arrayList2);
        Z(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        Y(view, view2, z10, z11, eVarI0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C13662b.a(animatorSet, arrayList);
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
        this.f88830c = new Rect();
        this.f88831d = new RectF();
        this.f88832e = new RectF();
        this.f88833f = new int[2];
    }
}
