package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.RectWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithAspect;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.NativeContextStatus;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeStructSerializer {
    public static native String brushToJson(NativeBrush nativeBrush);

    public static native String contextStatusToJson(NativeContextStatus nativeContextStatus);

    public static native String encodingRangeToJson(EncodingRange encodingRange);

    public static native String floatWithUnitToJson(FloatWithUnit floatWithUnit);

    public static native String marginsWithUnitToJson(MarginsWithUnit marginsWithUnit);

    public static native String pointToJson(Point point);

    public static native String pointWithUnitToJson(PointWithUnit pointWithUnit);

    public static native String quadrilateralToJson(Quadrilateral quadrilateral);

    public static native String rectToJson(Rect rect);

    public static native String rectWithUnitToJson(RectWithUnit rectWithUnit);

    public static native String sizeWithAspectToJson(SizeWithAspect sizeWithAspect);

    public static native String sizeWithUnitToJson(SizeWithUnit sizeWithUnit);

    @DjinniGenerated
    public static final class CppProxy extends NativeStructSerializer {
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private CppProxy(long j10) {
            new AtomicBoolean(false);
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }
}
