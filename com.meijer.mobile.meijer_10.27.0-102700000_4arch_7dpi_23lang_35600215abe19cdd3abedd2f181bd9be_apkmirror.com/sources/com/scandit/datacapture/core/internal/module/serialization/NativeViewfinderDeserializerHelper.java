package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeNoViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeViewfinderDeserializerHelper {
    public abstract NativeAimerViewfinder createAimerViewfinder();

    public abstract NativeLaserlineViewfinder createLaserlineViewfinder();

    public abstract NativeNoViewfinder createNoViewfinder();

    public abstract NativeRectangularViewfinder createRectangularViewfinder(NativeRectangularViewfinderStyle nativeRectangularViewfinderStyle, NativeRectangularViewfinderLineStyle nativeRectangularViewfinderLineStyle);

    public abstract NativeTargetAimerViewfinder createTargetAimerViewfinder();
}
