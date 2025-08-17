package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeProductProviderCallback {

    @DjinniGenerated
    public static final class CppProxy extends NativeProductProviderCallback {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f122426a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_onData(long j10, ArrayList<NativeProductProviderCallbackItem> arrayList);

        @Override // com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProviderCallback
        public void onData(ArrayList<NativeProductProviderCallbackItem> arrayList) {
            native_onData(this.nativeRef, arrayList);
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

    public abstract void onData(ArrayList<NativeProductProviderCallbackItem> arrayList);
}
