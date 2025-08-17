package com.scandit.datacapture.core.internal.module.serialization;

import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeLocationSelectionDeserializer {

    @DjinniGenerated
    public static final class CppProxy extends NativeLocationSelectionDeserializer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124768a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native NativeLocationSelectionDeserializerHelper native_getHelper(long j10);

        private native ArrayList<String> native_getWarnings(long j10);

        private native NativeLocationSelection native_locationSelectionFromJson(long j10, NativeJsonValue nativeJsonValue);

        private native void native_setHelper(long j10, NativeLocationSelectionDeserializerHelper nativeLocationSelectionDeserializerHelper);

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer
        public NativeLocationSelectionDeserializerHelper getHelper() {
            return native_getHelper(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer
        public ArrayList<String> getWarnings() {
            return native_getWarnings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer
        public NativeLocationSelection locationSelectionFromJson(NativeJsonValue nativeJsonValue) {
            return native_locationSelectionFromJson(this.nativeRef, nativeJsonValue);
        }

        @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer
        public void setHelper(NativeLocationSelectionDeserializerHelper nativeLocationSelectionDeserializerHelper) {
            native_setHelper(this.nativeRef, nativeLocationSelectionDeserializerHelper);
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

    public static native NativeLocationSelectionDeserializer create();

    public abstract NativeLocationSelectionDeserializerHelper getHelper();

    public abstract ArrayList<String> getWarnings();

    public abstract NativeLocationSelection locationSelectionFromJson(NativeJsonValue nativeJsonValue);

    public abstract void setHelper(NativeLocationSelectionDeserializerHelper nativeLocationSelectionDeserializerHelper);
}
