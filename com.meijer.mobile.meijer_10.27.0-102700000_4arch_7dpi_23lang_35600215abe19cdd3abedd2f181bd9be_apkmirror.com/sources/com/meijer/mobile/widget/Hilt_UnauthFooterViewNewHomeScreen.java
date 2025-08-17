package com.meijer.mobile.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes11.dex */
abstract class Hilt_UnauthFooterViewNewHomeScreen extends ConstraintLayout implements Au.c {

    /* renamed from: x, reason: collision with root package name */
    private xu.j f119502x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f119503y;

    @Override // Au.c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final xu.j componentManager() {
        if (this.f119502x == null) {
            this.f119502x = C();
        }
        return this.f119502x;
    }

    protected xu.j C() {
        return new xu.j(this, false);
    }

    protected void D() {
        if (this.f119503y) {
            return;
        }
        this.f119503y = true;
        ((m) generatedComponent()).a((UnauthFooterViewNewHomeScreen) Au.f.a(this));
    }

    Hilt_UnauthFooterViewNewHomeScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            D();
        }
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }
}
