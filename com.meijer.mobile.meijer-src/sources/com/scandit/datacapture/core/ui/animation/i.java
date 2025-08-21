package com.scandit.datacapture.core.ui.animation;

import android.view.View;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;

/* loaded from: classes12.dex */
public final class i extends DynamicAnimation.ViewProperty {
    public i() {
        super("scrollY");
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(View view) {
        return view.getScrollY();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(View view, float f10) {
        view.setScrollY((int) f10);
    }
}
