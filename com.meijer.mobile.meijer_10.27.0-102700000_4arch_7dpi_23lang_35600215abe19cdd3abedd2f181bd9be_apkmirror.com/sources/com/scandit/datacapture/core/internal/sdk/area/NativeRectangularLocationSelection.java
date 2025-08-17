package com.scandit.datacapture.core.internal.sdk.area;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeRectangularLocationSelection {

    @DjinniGenerated
    public static final class CppProxy extends NativeRectangularLocationSelection {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125353a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeLocationSelection native_asLocationSelection(long j10);

        private native NativeSizeWithUnitAndAspect native_getSizeWithUnitAndAspect(long j10);

        private native void native_setHeightAndAspectRatio(long j10, FloatWithUnit floatWithUnit, float f10);

        private native void native_setWidthAndAspectRatio(long j10, FloatWithUnit floatWithUnit, float f10);

        private native void native_setWidthAndHeight(long j10, FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection
        public NativeLocationSelection asLocationSelection() {
            return native_asLocationSelection(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection
        public NativeSizeWithUnitAndAspect getSizeWithUnitAndAspect() {
            return native_getSizeWithUnitAndAspect(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection
        public void setHeightAndAspectRatio(FloatWithUnit floatWithUnit, float f10) {
            native_setHeightAndAspectRatio(this.nativeRef, floatWithUnit, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection
        public void setWidthAndAspectRatio(FloatWithUnit floatWithUnit, float f10) {
            native_setWidthAndAspectRatio(this.nativeRef, floatWithUnit, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection
        public void setWidthAndHeight(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2) {
            native_setWidthAndHeight(this.nativeRef, floatWithUnit, floatWithUnit2);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection
        public String toJson() {
            return native_toJson(this.nativeRef);
        }

        private CppProxy(long j10) {
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }

    public static native NativeRectangularLocationSelection create();

    public abstract NativeLocationSelection asLocationSelection();

    public abstract NativeSizeWithUnitAndAspect getSizeWithUnitAndAspect();

    public abstract void setHeightAndAspectRatio(FloatWithUnit floatWithUnit, float f10);

    public abstract void setWidthAndAspectRatio(FloatWithUnit floatWithUnit, float f10);

    public abstract void setWidthAndHeight(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2);

    public abstract String toJson();
}
