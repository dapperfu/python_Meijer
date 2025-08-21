package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.core.internal.module.capture.NativeRecognitionContextSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataCaptureContext {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureContext {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126338a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_addFrameListenerAsync(long j10, NativeDataCaptureContextFrameListener nativeDataCaptureContextFrameListener);

        private native void native_addInertialMeasurementAsyncAndroid(long j10, NativeInertialMeasurementAndroid nativeInertialMeasurementAndroid, NativeInertialMeasurementType nativeInertialMeasurementType);

        private native void native_addListenerAsync(long j10, NativeDataCaptureContextListener nativeDataCaptureContextListener, int i10);

        private native NativeWrappedFuture native_addModeAsyncWrapped(long j10, NativeDataCaptureMode nativeDataCaptureMode);

        private native void native_addRotationVectorAsyncAndroid(long j10, NativeImuDataRotationVectorAndroid nativeImuDataRotationVectorAndroid);

        private native void native_applySettings(long j10, NativeDataCaptureContextSettings nativeDataCaptureContextSettings);

        private native void native_disposeAsync(long j10);

        private native void native_flushPendingTasks(long j10);

        private native NativeFeatureAvailability native_getFeatureAvailability(long j10, NativeLicensedFeature nativeLicensedFeature);

        private native NativeFrameOfReference native_getFrameOfReference(long j10);

        private native NativeFrameSource native_getFrameSource(long j10);

        private native NativeLicenseInfo native_getLicenseInfo(long j10);

        private native NativeRecognitionContextSettings native_getSettings(long j10);

        private native boolean native_isCurrentMode(long j10, NativeDataCaptureMode nativeDataCaptureMode);

        private native void native_onActivityStopped(long j10);

        private native NativeWrappedFuture native_removeAllModesAsyncWrapped(long j10);

        private native NativeWrappedFuture native_removeCurrentModeAsyncWrapped(long j10);

        private native void native_removeFrameListenerAsync(long j10, NativeDataCaptureContextFrameListener nativeDataCaptureContextFrameListener);

        private native void native_removeListenerAsync(long j10, NativeDataCaptureContextListener nativeDataCaptureContextListener);

        private native NativeWrappedFuture native_removeModeAsyncWrapped(long j10, NativeDataCaptureMode nativeDataCaptureMode);

        private native void native_saveFrameProcessingTimesToJson(long j10, String str);

        private native void native_setDataTransports(long j10, ArrayList<NativeDataTransport> arrayList);

        private native void native_setFrameOfReferenceViewSizeAndOrientation(long j10, SizeWithUnit sizeWithUnit, float f10, int i10);

        private native NativeWrappedFuture native_setFrameSourceAsyncWrapped(long j10, NativeFrameSource nativeFrameSource);

        private native NativeWrappedFuture native_setModeAsyncWrapped(long j10, NativeDataCaptureMode nativeDataCaptureMode);

        private native void native_setShouldUseImuDataAsync(long j10, boolean z10);

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void addFrameListenerAsync(NativeDataCaptureContextFrameListener nativeDataCaptureContextFrameListener) {
            native_addFrameListenerAsync(this.nativeRef, nativeDataCaptureContextFrameListener);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void addInertialMeasurementAsyncAndroid(NativeInertialMeasurementAndroid nativeInertialMeasurementAndroid, NativeInertialMeasurementType nativeInertialMeasurementType) {
            native_addInertialMeasurementAsyncAndroid(this.nativeRef, nativeInertialMeasurementAndroid, nativeInertialMeasurementType);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void addListenerAsync(NativeDataCaptureContextListener nativeDataCaptureContextListener, int i10) {
            native_addListenerAsync(this.nativeRef, nativeDataCaptureContextListener, i10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeWrappedFuture addModeAsyncWrapped(NativeDataCaptureMode nativeDataCaptureMode) {
            return native_addModeAsyncWrapped(this.nativeRef, nativeDataCaptureMode);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void addRotationVectorAsyncAndroid(NativeImuDataRotationVectorAndroid nativeImuDataRotationVectorAndroid) {
            native_addRotationVectorAsyncAndroid(this.nativeRef, nativeImuDataRotationVectorAndroid);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void applySettings(NativeDataCaptureContextSettings nativeDataCaptureContextSettings) {
            native_applySettings(this.nativeRef, nativeDataCaptureContextSettings);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void disposeAsync() {
            native_disposeAsync(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void flushPendingTasks() {
            native_flushPendingTasks(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeFeatureAvailability getFeatureAvailability(NativeLicensedFeature nativeLicensedFeature) {
            return native_getFeatureAvailability(this.nativeRef, nativeLicensedFeature);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeFrameOfReference getFrameOfReference() {
            return native_getFrameOfReference(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeFrameSource getFrameSource() {
            return native_getFrameSource(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeLicenseInfo getLicenseInfo() {
            return native_getLicenseInfo(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeRecognitionContextSettings getSettings() {
            return native_getSettings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public boolean isCurrentMode(NativeDataCaptureMode nativeDataCaptureMode) {
            return native_isCurrentMode(this.nativeRef, nativeDataCaptureMode);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void onActivityStopped() {
            native_onActivityStopped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeWrappedFuture removeAllModesAsyncWrapped() {
            return native_removeAllModesAsyncWrapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeWrappedFuture removeCurrentModeAsyncWrapped() {
            return native_removeCurrentModeAsyncWrapped(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void removeFrameListenerAsync(NativeDataCaptureContextFrameListener nativeDataCaptureContextFrameListener) {
            native_removeFrameListenerAsync(this.nativeRef, nativeDataCaptureContextFrameListener);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void removeListenerAsync(NativeDataCaptureContextListener nativeDataCaptureContextListener) {
            native_removeListenerAsync(this.nativeRef, nativeDataCaptureContextListener);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeWrappedFuture removeModeAsyncWrapped(NativeDataCaptureMode nativeDataCaptureMode) {
            return native_removeModeAsyncWrapped(this.nativeRef, nativeDataCaptureMode);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void saveFrameProcessingTimesToJson(String str) {
            native_saveFrameProcessingTimesToJson(this.nativeRef, str);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void setDataTransports(ArrayList<NativeDataTransport> arrayList) {
            native_setDataTransports(this.nativeRef, arrayList);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void setFrameOfReferenceViewSizeAndOrientation(SizeWithUnit sizeWithUnit, float f10, int i10) {
            native_setFrameOfReferenceViewSizeAndOrientation(this.nativeRef, sizeWithUnit, f10, i10);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeWrappedFuture setFrameSourceAsyncWrapped(NativeFrameSource nativeFrameSource) {
            return native_setFrameSourceAsyncWrapped(this.nativeRef, nativeFrameSource);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public NativeWrappedFuture setModeAsyncWrapped(NativeDataCaptureMode nativeDataCaptureMode) {
            return native_setModeAsyncWrapped(this.nativeRef, nativeDataCaptureMode);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext
        public void setShouldUseImuDataAsync(boolean z10) {
            native_setShouldUseImuDataAsync(this.nativeRef, z10);
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

    public static native NativeDataCaptureContext createWithDeviceName(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<String> arrayList, NativeResourceLoader nativeResourceLoader, boolean z10, NativeDataCaptureContextSettings nativeDataCaptureContextSettings);

    public static native String getEngineCommitHash();

    public static native String getEngineVersionNumber();

    public static native int getListenerPriorityOverlay();

    public static native int getListenerPriorityPlatform();

    public static native int getListenerPriorityUser();

    public static native String getVersion();

    public static native NativeDataCaptureContext initialize(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, ArrayList<String> arrayList, NativeResourceLoader nativeResourceLoader, boolean z10, NativeDataCaptureContextSettings nativeDataCaptureContextSettings);

    public abstract void addFrameListenerAsync(NativeDataCaptureContextFrameListener nativeDataCaptureContextFrameListener);

    public abstract void addInertialMeasurementAsyncAndroid(NativeInertialMeasurementAndroid nativeInertialMeasurementAndroid, NativeInertialMeasurementType nativeInertialMeasurementType);

    public abstract void addListenerAsync(NativeDataCaptureContextListener nativeDataCaptureContextListener, int i10);

    public abstract NativeWrappedFuture addModeAsyncWrapped(NativeDataCaptureMode nativeDataCaptureMode);

    public abstract void addRotationVectorAsyncAndroid(NativeImuDataRotationVectorAndroid nativeImuDataRotationVectorAndroid);

    public abstract void applySettings(NativeDataCaptureContextSettings nativeDataCaptureContextSettings);

    public abstract void disposeAsync();

    public abstract void flushPendingTasks();

    public abstract NativeFeatureAvailability getFeatureAvailability(NativeLicensedFeature nativeLicensedFeature);

    public abstract NativeFrameOfReference getFrameOfReference();

    public abstract NativeFrameSource getFrameSource();

    public abstract NativeLicenseInfo getLicenseInfo();

    public abstract NativeRecognitionContextSettings getSettings();

    public abstract boolean isCurrentMode(NativeDataCaptureMode nativeDataCaptureMode);

    public abstract void onActivityStopped();

    public abstract NativeWrappedFuture removeAllModesAsyncWrapped();

    public abstract NativeWrappedFuture removeCurrentModeAsyncWrapped();

    public abstract void removeFrameListenerAsync(NativeDataCaptureContextFrameListener nativeDataCaptureContextFrameListener);

    public abstract void removeListenerAsync(NativeDataCaptureContextListener nativeDataCaptureContextListener);

    public abstract NativeWrappedFuture removeModeAsyncWrapped(NativeDataCaptureMode nativeDataCaptureMode);

    public abstract void saveFrameProcessingTimesToJson(String str);

    public abstract void setDataTransports(ArrayList<NativeDataTransport> arrayList);

    public abstract void setFrameOfReferenceViewSizeAndOrientation(SizeWithUnit sizeWithUnit, float f10, int i10);

    public abstract NativeWrappedFuture setFrameSourceAsyncWrapped(NativeFrameSource nativeFrameSource);

    public abstract NativeWrappedFuture setModeAsyncWrapped(NativeDataCaptureMode nativeDataCaptureMode);

    public abstract void setShouldUseImuDataAsync(boolean z10);
}
