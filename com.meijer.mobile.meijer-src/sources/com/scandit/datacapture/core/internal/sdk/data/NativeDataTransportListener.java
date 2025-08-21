package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeDataTransportListener {

    @DjinniGenerated
    public static final class CppProxy extends NativeDataTransportListener {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f126399a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native void native_onConnected(long j10);

        private native void native_onDataReceived(long j10, byte[] bArr);

        private native void native_onDisconnected(long j10);

        private native void native_onError(long j10, NativeDataTransportError nativeDataTransportError);

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
        public void onConnected() {
            native_onConnected(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
        public void onDataReceived(byte[] bArr) {
            native_onDataReceived(this.nativeRef, bArr);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
        public void onDisconnected() {
            native_onDisconnected(this.nativeRef);
        }

        @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportListener
        public void onError(NativeDataTransportError nativeDataTransportError) {
            native_onError(this.nativeRef, nativeDataTransportError);
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

    public abstract void onConnected();

    public abstract void onDataReceived(byte[] bArr);

    public abstract void onDisconnected();

    public abstract void onError(NativeDataTransportError nativeDataTransportError);
}
