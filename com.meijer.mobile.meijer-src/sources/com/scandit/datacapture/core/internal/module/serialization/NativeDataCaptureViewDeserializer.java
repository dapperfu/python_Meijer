package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataCaptureViewDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureViewDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f125718a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setHelper(long j10, NativeDataCaptureViewDeserializerHelper nativeDataCaptureViewDeserializerHelper);

        private native void native_setListener(long j10, NativeDataCaptureViewDeserializerListener nativeDataCaptureViewDeserializerListener);

        private native NativeDataCaptureView native_updateViewFromJson(long j10, NativeDataCaptureView nativeDataCaptureView, NativeJsonValue nativeJsonValue);

        private native NativeDataCaptureView native_viewFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer
        public void setHelper(NativeDataCaptureViewDeserializerHelper nativeDataCaptureViewDeserializerHelper) {
            native_setHelper(this.nativeRef, nativeDataCaptureViewDeserializerHelper);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer
        public void setListener(NativeDataCaptureViewDeserializerListener nativeDataCaptureViewDeserializerListener) {
            native_setListener(this.nativeRef, nativeDataCaptureViewDeserializerListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer
        public NativeDataCaptureView updateViewFromJson(NativeDataCaptureView nativeDataCaptureView, NativeJsonValue nativeJsonValue) {
            return native_updateViewFromJson(this.nativeRef, nativeDataCaptureView, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer
        public NativeDataCaptureView viewFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue) {
            return native_viewFromJson(this.nativeRef, nativeDataCaptureContext, nativeJsonValue);
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

    public static native NativeDataCaptureViewDeserializer create(ArrayList<NativeDataCaptureModeDeserializer> arrayList);

    public abstract ArrayList<String> getWarnings();

    public abstract void setHelper(NativeDataCaptureViewDeserializerHelper nativeDataCaptureViewDeserializerHelper);

    public abstract void setListener(NativeDataCaptureViewDeserializerListener nativeDataCaptureViewDeserializerListener);

    public abstract NativeDataCaptureView updateViewFromJson(NativeDataCaptureView nativeDataCaptureView, NativeJsonValue nativeJsonValue);

    public abstract NativeDataCaptureView viewFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeJsonValue nativeJsonValue);
}
