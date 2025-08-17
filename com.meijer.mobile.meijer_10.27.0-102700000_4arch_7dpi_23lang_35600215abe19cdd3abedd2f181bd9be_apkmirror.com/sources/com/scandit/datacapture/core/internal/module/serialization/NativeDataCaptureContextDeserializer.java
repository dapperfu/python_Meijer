package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.component.NativeDataCaptureComponent;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeDataCaptureContextDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataCaptureContextDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124764a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeDataCaptureContextDeserializerResult native_contextFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native boolean native_getAvoidThreadDependencies(long j10);

        private native void native_setAvoidThreadDependencies(long j10, boolean z10);

        private native void native_setHelper(long j10, NativeDataCaptureContextDeserializerHelper nativeDataCaptureContextDeserializerHelper);

        private native void native_setListener(long j10, NativeDataCaptureContextDeserializerListener nativeDataCaptureContextDeserializerListener);

        private native NativeDataCaptureContextDeserializerResult native_updateContextFromJson(long j10, NativeDataCaptureContext nativeDataCaptureContext, NativeDataCaptureView nativeDataCaptureView, ArrayList<NativeDataCaptureComponent> arrayList, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer
        public NativeDataCaptureContextDeserializerResult contextFromJson(NativeJsonValue nativeJsonValue) {
            return native_contextFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer
        public boolean getAvoidThreadDependencies() {
            return native_getAvoidThreadDependencies(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer
        public void setAvoidThreadDependencies(boolean z10) {
            native_setAvoidThreadDependencies(this.nativeRef, z10);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer
        public void setHelper(NativeDataCaptureContextDeserializerHelper nativeDataCaptureContextDeserializerHelper) {
            native_setHelper(this.nativeRef, nativeDataCaptureContextDeserializerHelper);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer
        public void setListener(NativeDataCaptureContextDeserializerListener nativeDataCaptureContextDeserializerListener) {
            native_setListener(this.nativeRef, nativeDataCaptureContextDeserializerListener);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer
        public NativeDataCaptureContextDeserializerResult updateContextFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeDataCaptureView nativeDataCaptureView, ArrayList<NativeDataCaptureComponent> arrayList, NativeJsonValue nativeJsonValue) {
            return native_updateContextFromJson(this.nativeRef, nativeDataCaptureContext, nativeDataCaptureView, arrayList, nativeJsonValue);
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

    public static native NativeDataCaptureContextDeserializer create(NativeFrameSourceDeserializer nativeFrameSourceDeserializer, NativeDataCaptureViewDeserializer nativeDataCaptureViewDeserializer, ArrayList<NativeDataCaptureModeDeserializer> arrayList, ArrayList<NativeDataCaptureComponentDeserializer> arrayList2);

    public abstract NativeDataCaptureContextDeserializerResult contextFromJson(NativeJsonValue nativeJsonValue);

    public abstract boolean getAvoidThreadDependencies();

    public abstract void setAvoidThreadDependencies(boolean z10);

    public abstract void setHelper(NativeDataCaptureContextDeserializerHelper nativeDataCaptureContextDeserializerHelper);

    public abstract void setListener(NativeDataCaptureContextDeserializerListener nativeDataCaptureContextDeserializerListener);

    public abstract NativeDataCaptureContextDeserializerResult updateContextFromJson(NativeDataCaptureContext nativeDataCaptureContext, NativeDataCaptureView nativeDataCaptureView, ArrayList<NativeDataCaptureComponent> arrayList, NativeJsonValue nativeJsonValue);
}
