package com.scandit.datacapture.core.internal.sdk.ui.interpolators;

import android.view.animation.Interpolator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/interpolators/EaseInOutSineInterpolator;", "Landroid/view/animation/Interpolator;", "()V", "getInterpolation", "", "input", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EaseInOutSineInterpolator implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float input) {
        return (float) ((-(Math.cos(input * 3.141592653589793d) - 1)) / 2);
    }
}
