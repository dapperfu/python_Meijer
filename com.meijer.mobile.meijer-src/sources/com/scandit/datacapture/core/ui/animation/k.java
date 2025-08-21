package com.scandit.datacapture.core.ui.animation;

import android.view.View;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;

/* loaded from: classes12.dex */
public final class k extends DynamicAnimation.ViewProperty {
    public k() {
        super("translationX");
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(View view) {
        return view.getTranslationX();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(View view, float f10) {
        view.setTranslationX(f10);
    }
}
