package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import re.C16896b;
import se.InterfaceC17069b;

/* loaded from: classes4.dex */
class b extends a {

    /* renamed from: N, reason: collision with root package name */
    private StateListAnimator f87886N;

    @Override // com.google.android.material.floatingactionbutton.a
    void D(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean J() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void b0() {
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void z() {
    }

    private StateListAnimator g0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(a.f87824H, h0(f10, f12));
        stateListAnimator.addState(a.f87825I, h0(f10, f11));
        stateListAnimator.addState(a.f87826J, h0(f10, f11));
        stateListAnimator.addState(a.f87827K, h0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f87853v, "elevation", f10).setDuration(0L));
        if (Build.VERSION.SDK_INT <= 24) {
            FloatingActionButton floatingActionButton = this.f87853v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f87853v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(a.f87819C);
        stateListAnimator.addState(a.f87828L, animatorSet);
        stateListAnimator.addState(a.f87829M, h0(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator h0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f87853v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f87853v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(a.f87819C);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void E(float f10, float f11, float f12) {
        if (this.f87853v.getStateListAnimator() == this.f87886N) {
            StateListAnimator stateListAnimatorG0 = g0(f10, f11, f12);
            this.f87886N = stateListAnimatorG0;
            this.f87853v.setStateListAnimator(stateListAnimatorG0);
        }
        if (X()) {
            d0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void T(ColorStateList colorStateList) {
        Drawable drawable = this.f87834c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C16896b.d(colorStateList));
        } else {
            super.T(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean X() {
        return this.f87854w.b() || !Z();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.f87853v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void r(Rect rect) {
        if (this.f87854w.b()) {
            super.r(rect);
        } else if (Z()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f87841j - this.f87853v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    b(FloatingActionButton floatingActionButton, InterfaceC17069b interfaceC17069b) {
        super(floatingActionButton, interfaceC17069b);
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void B() {
        d0();
    }
}
