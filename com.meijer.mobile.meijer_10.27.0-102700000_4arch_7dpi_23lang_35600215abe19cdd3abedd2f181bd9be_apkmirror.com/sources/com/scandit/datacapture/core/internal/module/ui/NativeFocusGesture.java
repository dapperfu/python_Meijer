package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeFocusGesture {

    @DjinniGenerated
    public static final class CppProxy extends NativeFocusGesture {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125142a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addListener(long j10, NativeFocusGestureListener nativeFocusGestureListener);

        private native boolean native_getShowUIIndicator(long j10);

        private native void native_setShowUIIndicator(long j10, boolean z10);

        private native String native_toJson(long j10);

        private native void native_triggerFocus(long j10, PointWithUnit pointWithUnit);

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture
        public void addListener(NativeFocusGestureListener nativeFocusGestureListener) {
            native_addListener(this.nativeRef, nativeFocusGestureListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture
        public boolean getShowUIIndicator() {
            return native_getShowUIIndicator(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture
        public void setShowUIIndicator(boolean z10) {
            native_setShowUIIndicator(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture
        public String toJson() {
            return native_toJson(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture
        public void triggerFocus(PointWithUnit pointWithUnit) {
            native_triggerFocus(this.nativeRef, pointWithUnit);
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

    public abstract void addListener(NativeFocusGestureListener nativeFocusGestureListener);

    public abstract boolean getShowUIIndicator();

    public abstract void setShowUIIndicator(boolean z10);

    public abstract String toJson();

    public abstract void triggerFocus(PointWithUnit pointWithUnit);
}
