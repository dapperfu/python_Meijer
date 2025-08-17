package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeRectangularViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeRectangularViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125820a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeViewfinder native_asViewfinder(long j10);

        private native NativeRectangularViewfinderAnimation native_getAnimation(long j10);

        private native NativeColor native_getColor(long j10);

        private native float native_getDimming(long j10);

        private native NativeColor native_getDisabledColor(long j10);

        private native float native_getDisabledDimming(long j10);

        private native NativeRectangularViewfinderLineStyle native_getLineStyle(long j10);

        private native NativeSizeWithUnitAndAspect native_getSizeWithUnitAndAspect(long j10);

        private native NativeRectangularViewfinderStyle native_getStyle(long j10);

        private native void native_setAnimation(long j10, NativeRectangularViewfinderAnimation nativeRectangularViewfinderAnimation);

        private native void native_setColor(long j10, NativeColor nativeColor);

        private native void native_setDimming(long j10, float f10);

        private native void native_setDisabledColor(long j10, NativeColor nativeColor);

        private native void native_setDisabledDimming(long j10, float f10);

        private native void native_setHeightAndAspectRatio(long j10, FloatWithUnit floatWithUnit, float f10);

        private native void native_setShorterDimensionAndAspectRatio(long j10, float f10, float f11);

        private native void native_setWidthAndAspectRatio(long j10, FloatWithUnit floatWithUnit, float f10);

        private native void native_setWidthAndHeight(long j10, FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public NativeRectangularViewfinderAnimation getAnimation() {
            return native_getAnimation(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public NativeColor getColor() {
            return native_getColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public float getDimming() {
            return native_getDimming(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public NativeColor getDisabledColor() {
            return native_getDisabledColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public float getDisabledDimming() {
            return native_getDisabledDimming(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public NativeRectangularViewfinderLineStyle getLineStyle() {
            return native_getLineStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public NativeSizeWithUnitAndAspect getSizeWithUnitAndAspect() {
            return native_getSizeWithUnitAndAspect(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public NativeRectangularViewfinderStyle getStyle() {
            return native_getStyle(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setAnimation(NativeRectangularViewfinderAnimation nativeRectangularViewfinderAnimation) {
            native_setAnimation(this.nativeRef, nativeRectangularViewfinderAnimation);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setColor(NativeColor nativeColor) {
            native_setColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setDimming(float f10) {
            native_setDimming(this.nativeRef, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setDisabledColor(NativeColor nativeColor) {
            native_setDisabledColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setDisabledDimming(float f10) {
            native_setDisabledDimming(this.nativeRef, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setHeightAndAspectRatio(FloatWithUnit floatWithUnit, float f10) {
            native_setHeightAndAspectRatio(this.nativeRef, floatWithUnit, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setShorterDimensionAndAspectRatio(float f10, float f11) {
            native_setShorterDimensionAndAspectRatio(this.nativeRef, f10, f11);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setWidthAndAspectRatio(FloatWithUnit floatWithUnit, float f10) {
            native_setWidthAndAspectRatio(this.nativeRef, floatWithUnit, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinder
        public void setWidthAndHeight(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2) {
            native_setWidthAndHeight(this.nativeRef, floatWithUnit, floatWithUnit2);
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

    public static native NativeRectangularViewfinder create();

    public static native NativeRectangularViewfinder createForStyles(NativeRectangularViewfinderStyle nativeRectangularViewfinderStyle, NativeRectangularViewfinderLineStyle nativeRectangularViewfinderLineStyle);

    public abstract NativeViewfinder asViewfinder();

    public abstract NativeRectangularViewfinderAnimation getAnimation();

    public abstract NativeColor getColor();

    public abstract float getDimming();

    public abstract NativeColor getDisabledColor();

    public abstract float getDisabledDimming();

    public abstract NativeRectangularViewfinderLineStyle getLineStyle();

    public abstract NativeSizeWithUnitAndAspect getSizeWithUnitAndAspect();

    public abstract NativeRectangularViewfinderStyle getStyle();

    public abstract void setAnimation(NativeRectangularViewfinderAnimation nativeRectangularViewfinderAnimation);

    public abstract void setColor(NativeColor nativeColor);

    public abstract void setDimming(float f10);

    public abstract void setDisabledColor(NativeColor nativeColor);

    public abstract void setDisabledDimming(float f10);

    public abstract void setHeightAndAspectRatio(FloatWithUnit floatWithUnit, float f10);

    public abstract void setShorterDimensionAndAspectRatio(float f10, float f11);

    public abstract void setWidthAndAspectRatio(FloatWithUnit floatWithUnit, float f10);

    public abstract void setWidthAndHeight(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2);
}
