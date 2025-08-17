package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.internal.sdk.analytics.NativeAnalyticsSettings;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeDataCaptureContextSettings {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureContextSettings {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125387a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeAnalyticsSettings native_getAnalyticsSettings(long j10);

        private native String native_getEnabledCpusBitset(long j10);

        private native int native_getNumberOfEngineThreads(long j10);

        private native void native_setAnalyticsSettings(long j10, NativeAnalyticsSettings nativeAnalyticsSettings);

        private native void native_setBoolProperty(long j10, String str, boolean z10);

        private native void native_setEnabledCpusBitset(long j10, String str);

        private native void native_setFloatProperty(long j10, String str, float f10);

        private native void native_setIntProperty(long j10, String str, int i10);

        private native void native_setNumberOfEngineThreads(long j10, int i10);

        private native void native_setStringProperty(long j10, String str, String str2);

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public NativeAnalyticsSettings getAnalyticsSettings() {
            return native_getAnalyticsSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public String getEnabledCpusBitset() {
            return native_getEnabledCpusBitset(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public int getNumberOfEngineThreads() {
            return native_getNumberOfEngineThreads(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public void setAnalyticsSettings(NativeAnalyticsSettings nativeAnalyticsSettings) {
            native_setAnalyticsSettings(this.nativeRef, nativeAnalyticsSettings);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public void setBoolProperty(String str, boolean z10) {
            native_setBoolProperty(this.nativeRef, str, z10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public void setEnabledCpusBitset(String str) {
            native_setEnabledCpusBitset(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public void setFloatProperty(String str, float f10) {
            native_setFloatProperty(this.nativeRef, str, f10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public void setIntProperty(String str, int i10) {
            native_setIntProperty(this.nativeRef, str, i10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public void setNumberOfEngineThreads(int i10) {
            native_setNumberOfEngineThreads(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContextSettings
        public void setStringProperty(String str, String str2) {
            native_setStringProperty(this.nativeRef, str, str2);
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

    public static native NativeDataCaptureContextSettings create();

    public abstract NativeAnalyticsSettings getAnalyticsSettings();

    public abstract String getEnabledCpusBitset();

    public abstract int getNumberOfEngineThreads();

    public abstract void setAnalyticsSettings(NativeAnalyticsSettings nativeAnalyticsSettings);

    public abstract void setBoolProperty(String str, boolean z10);

    public abstract void setEnabledCpusBitset(String str);

    public abstract void setFloatProperty(String str, float f10);

    public abstract void setIntProperty(String str, int i10);

    public abstract void setNumberOfEngineThreads(int i10);

    public abstract void setStringProperty(String str, String str2);
}
