package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeQuadrilateralUtils {
    public static native boolean quadContains(Quadrilateral quadrilateral, Point point);

    public static native float quadDistance(Quadrilateral quadrilateral, Point point);

    public static native Point quadGetCenter(Quadrilateral quadrilateral);

    public static native float quadGetHeight(Quadrilateral quadrilateral);

    public static native float quadGetWidth(Quadrilateral quadrilateral);

    public static native Quadrilateral quadOrderVerticesByPosition(Quadrilateral quadrilateral);

    @DjinniGenerated
    public static final class CppProxy extends NativeQuadrilateralUtils {
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
