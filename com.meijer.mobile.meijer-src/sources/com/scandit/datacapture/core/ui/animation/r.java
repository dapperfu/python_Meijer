package com.scandit.datacapture.core.ui.animation;

import android.view.View;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;

/* loaded from: classes12.dex */
public final class r extends DynamicAnimation.ViewProperty {
    public r() {
        super("rotationY");
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final float getValue(View view) {
        return view.getRotationY();
    }

    @Override // com.scandit.datacapture.core.ui.animation.FloatPropertyCompat
    public final void setValue(View view, float f10) {
        view.setRotationY(f10);
    }
}
