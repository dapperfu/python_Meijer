package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeFrameSourceDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeFrameSourceDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124767a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeCameraSettings native_cameraSettingsFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeFrameSource native_frameSourceFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native NativeFrameSourceDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setHelper(long j10, NativeFrameSourceDeserializerHelper nativeFrameSourceDeserializerHelper);

        private native void native_setListener(long j10, NativeFrameSourceDeserializerListener nativeFrameSourceDeserializerListener);

        private native NativeCameraSettings native_updateCameraSettingsFromJson(long j10, NativeCameraSettings nativeCameraSettings, NativeJsonValue nativeJsonValue);

        private native NativeFrameSource native_updateFrameSourceFromJson(long j10, NativeFrameSource nativeFrameSource, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public NativeCameraSettings cameraSettingsFromJson(NativeJsonValue nativeJsonValue) {
            return native_cameraSettingsFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public NativeFrameSource frameSourceFromJson(NativeJsonValue nativeJsonValue) {
            return native_frameSourceFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public NativeFrameSourceDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public void setHelper(NativeFrameSourceDeserializerHelper nativeFrameSourceDeserializerHelper) {
            native_setHelper(this.nativeRef, nativeFrameSourceDeserializerHelper);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public void setListener(NativeFrameSourceDeserializerListener nativeFrameSourceDeserializerListener) {
            native_setListener(this.nativeRef, nativeFrameSourceDeserializerListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public NativeCameraSettings updateCameraSettingsFromJson(NativeCameraSettings nativeCameraSettings, NativeJsonValue nativeJsonValue) {
            return native_updateCameraSettingsFromJson(this.nativeRef, nativeCameraSettings, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer
        public NativeFrameSource updateFrameSourceFromJson(NativeFrameSource nativeFrameSource, NativeJsonValue nativeJsonValue) {
            return native_updateFrameSourceFromJson(this.nativeRef, nativeFrameSource, nativeJsonValue);
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

    public static native NativeFrameSourceDeserializer create(ArrayList<NativeDataCaptureModeDeserializer> arrayList);

    public abstract NativeCameraSettings cameraSettingsFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeFrameSource frameSourceFromJson(NativeJsonValue nativeJsonValue);

    public abstract NativeFrameSourceDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setHelper(NativeFrameSourceDeserializerHelper nativeFrameSourceDeserializerHelper);

    public abstract void setListener(NativeFrameSourceDeserializerListener nativeFrameSourceDeserializerListener);

    public abstract NativeCameraSettings updateCameraSettingsFromJson(NativeCameraSettings nativeCameraSettings, NativeJsonValue nativeJsonValue);

    public abstract NativeFrameSource updateFrameSourceFromJson(NativeFrameSource nativeFrameSource, NativeJsonValue nativeJsonValue);
}
