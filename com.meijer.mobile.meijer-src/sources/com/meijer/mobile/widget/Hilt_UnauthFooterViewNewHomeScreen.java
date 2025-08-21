package com.meijer.mobile.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import wu.InterfaceC17928c;

/* loaded from: classes12.dex */
abstract class Hilt_UnauthFooterViewNewHomeScreen extends ConstraintLayout implements InterfaceC17928c {

    /* renamed from: x, reason: collision with root package name */
    private tu.j f120475x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f120476y;

    @Override // wu.InterfaceC17928c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final tu.j componentManager() {
        if (this.f120475x == null) {
            this.f120475x = C();
        }
        return this.f120475x;
    }

    protected tu.j C() {
        return new tu.j(this, false);
    }

    protected void D() {
        if (this.f120476y) {
            return;
        }
        this.f120476y = true;
        ((m) generatedComponent()).a((UnauthFooterViewNewHomeScreen) wu.f.a(this));
    }

    Hilt_UnauthFooterViewNewHomeScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            D();
        }
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
