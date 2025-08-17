package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.style.NativeBrush;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeStructDeserializer {
    public static native NativeBrush brushFromJson(NativeJsonValue nativeJsonValue);

    public static native Point pointFromJson(NativeJsonValue nativeJsonValue);

    public static native Quadrilateral quadrilateralFromJson(NativeJsonValue nativeJsonValue);

    @DjinniGenerated
    public static final class CppProxy extends NativeStructDeserializer {
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
