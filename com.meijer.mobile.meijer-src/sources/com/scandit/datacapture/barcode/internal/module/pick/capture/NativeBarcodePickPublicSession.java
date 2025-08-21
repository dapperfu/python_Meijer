package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedObject;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeBarcodePickPublicSession {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodePickPublicSession {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f123373a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native HashSet<String> native_getAddedItems(long j10);

        private native HashSet<NativeTrackedObject> native_getAddedObjects(long j10);

        private native HashSet<String> native_getTrackedItems(long j10);

        private native HashSet<NativeTrackedObject> native_getTrackedObjects(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession
        public HashSet<String> getAddedItems() {
            return native_getAddedItems(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession
        public HashSet<NativeTrackedObject> getAddedObjects() {
            return native_getAddedObjects(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession
        public HashSet<String> getTrackedItems() {
            return native_getTrackedItems(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession
        public HashSet<NativeTrackedObject> getTrackedObjects() {
            return native_getTrackedObjects(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicSession
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

    public abstract HashSet<String> getAddedItems();

    public abstract HashSet<NativeTrackedObject> getAddedObjects();

    public abstract HashSet<String> getTrackedItems();

    public abstract HashSet<NativeTrackedObject> getTrackedObjects();

    public abstract String toJson();
}
