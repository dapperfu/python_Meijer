package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithAspect;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.common.geometry.SizingMode;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeSizeWithUnitAndAspect {

    @DjinniGenerated
    public static final class CppProxy extends NativeSizeWithUnitAndAspect {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126364a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native SizeWithAspect native_getHeightWithAspect(long j10);

        private native SizeWithAspect native_getShorterDimensionWithAspect(long j10);

        private native SizingMode native_getSizingMode(long j10);

        private native SizeWithUnit native_getWidthAndHeight(long j10);

        private native SizeWithAspect native_getWidthWithAspect(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect
        public SizeWithAspect getHeightWithAspect() {
            return native_getHeightWithAspect(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect
        public SizeWithAspect getShorterDimensionWithAspect() {
            return native_getShorterDimensionWithAspect(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect
        public SizingMode getSizingMode() {
            return native_getSizingMode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect
        public SizeWithUnit getWidthAndHeight() {
            return native_getWidthAndHeight(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect
        public SizeWithAspect getWidthWithAspect() {
            return native_getWidthWithAspect(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect
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

    public static native NativeSizeWithUnitAndAspect createWithHeightAndAspectRatio(FloatWithUnit floatWithUnit, float f10);

    public static native NativeSizeWithUnitAndAspect createWithShorterDimensionAndAspectRatio(float f10, float f11);

    public static native NativeSizeWithUnitAndAspect createWithWidthAndAspectRatio(FloatWithUnit floatWithUnit, float f10);

    public static native NativeSizeWithUnitAndAspect createWithWidthAndHeight(SizeWithUnit sizeWithUnit);

    public abstract SizeWithAspect getHeightWithAspect();

    public abstract SizeWithAspect getShorterDimensionWithAspect();

    public abstract SizingMode getSizingMode();

    public abstract SizeWithUnit getWidthAndHeight();

    public abstract SizeWithAspect getWidthWithAspect();

    public abstract String toJson();
}
