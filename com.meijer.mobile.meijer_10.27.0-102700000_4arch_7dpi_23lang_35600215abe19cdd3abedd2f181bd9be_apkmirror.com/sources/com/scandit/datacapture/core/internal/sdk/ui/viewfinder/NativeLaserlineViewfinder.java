package com.scandit.datacapture.core.internal.sdk.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.common.graphics.NativeColor;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeLaserlineViewfinder {

    @DjinniGenerated
    public static final class CppProxy extends NativeLaserlineViewfinder {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125818a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeViewfinder native_asViewfinder(long j10);

        private native NativeColor native_getDisabledColor(long j10);

        private native NativeColor native_getEnabledColor(long j10);

        private native FloatWithUnit native_getWidth(long j10);

        private native void native_setDisabledColor(long j10, NativeColor nativeColor);

        private native void native_setEnabledColor(long j10, NativeColor nativeColor);

        private native void native_setWidth(long j10, FloatWithUnit floatWithUnit);

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder
        public NativeViewfinder asViewfinder() {
            return native_asViewfinder(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder
        public NativeColor getDisabledColor() {
            return native_getDisabledColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder
        public NativeColor getEnabledColor() {
            return native_getEnabledColor(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder
        public FloatWithUnit getWidth() {
            return native_getWidth(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder
        public void setDisabledColor(NativeColor nativeColor) {
            native_setDisabledColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder
        public void setEnabledColor(NativeColor nativeColor) {
            native_setEnabledColor(this.nativeRef, nativeColor);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeLaserlineViewfinder
        public void setWidth(FloatWithUnit floatWithUnit) {
            native_setWidth(this.nativeRef, floatWithUnit);
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

    public static native NativeLaserlineViewfinder create();

    public abstract NativeViewfinder asViewfinder();

    public abstract NativeColor getDisabledColor();

    public abstract NativeColor getEnabledColor();

    public abstract FloatWithUnit getWidth();

    public abstract void setDisabledColor(NativeColor nativeColor);

    public abstract void setEnabledColor(NativeColor nativeColor);

    public abstract void setWidth(FloatWithUnit floatWithUnit);
}
