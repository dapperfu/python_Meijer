package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeViewfinderDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeViewfinderDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124769a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeViewfinderDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native void native_setHelper(long j10, NativeViewfinderDeserializerHelper nativeViewfinderDeserializerHelper);

        private native NativeViewfinder native_viewfinderFromJson(long j10, NativeJsonValue nativeJsonValue);

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer
        public NativeViewfinderDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer
        public void setHelper(NativeViewfinderDeserializerHelper nativeViewfinderDeserializerHelper) {
            native_setHelper(this.nativeRef, nativeViewfinderDeserializerHelper);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer
        public NativeViewfinder viewfinderFromJson(NativeJsonValue nativeJsonValue) {
            return native_viewfinderFromJson(this.nativeRef, nativeJsonValue);
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

    public static native NativeViewfinderDeserializer create();

    public abstract NativeViewfinderDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract void setHelper(NativeViewfinderDeserializerHelper nativeViewfinderDeserializerHelper);

    public abstract NativeViewfinder viewfinderFromJson(NativeJsonValue nativeJsonValue);
}
