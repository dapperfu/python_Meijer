package com.scandit.datacapture.core.ui.animation;

import android.view.View;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;

/* loaded from: classes12.dex */
public final class m extends DynamicAnimation.ViewProperty {
    public m() {
        super("translationZ");
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(View view) {
        return view.getTranslationZ();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(View view, float f10) {
        view.setTranslationZ(f10);
    }
}
