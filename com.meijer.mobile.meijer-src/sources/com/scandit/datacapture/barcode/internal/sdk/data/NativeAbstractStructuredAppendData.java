package com.scandit.datacapture.barcode.internal.sdk.data;

import com.scandit.datacapture.core.common.buffer.EncodingRange;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes12.dex */
public abstract class NativeAbstractStructuredAppendData {

    @DjinniGenerated
    public static final class CppProxy extends NativeAbstractStructuredAppendData {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f124495a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native String native_getBarcodeSetId(long j10);

        private native ArrayList<EncodingRange> native_getCompleteDataEncodings(long j10);

        private native byte[] native_getCompleteDataRaw(long j10);

        private native String native_getCompleteDataUtf8String(long j10);

        private native int native_getScannedSegmentCount(long j10);

        private native int native_getTotalSegmentCount(long j10);

        private native boolean native_isComplete(long j10);

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData
        public String getBarcodeSetId() {
            return native_getBarcodeSetId(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData
        public ArrayList<EncodingRange> getCompleteDataEncodings() {
            return native_getCompleteDataEncodings(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData
        public byte[] getCompleteDataRaw() {
            return native_getCompleteDataRaw(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData
        public String getCompleteDataUtf8String() {
            return native_getCompleteDataUtf8String(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData
        public int getScannedSegmentCount() {
            return native_getScannedSegmentCount(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData
        public int getTotalSegmentCount() {
            return native_getTotalSegmentCount(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.internal.sdk.data.NativeAbstractStructuredAppendData
        public boolean isComplete() {
            return native_isComplete(this.nativeRef);
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

    public abstract String getBarcodeSetId();

    public abstract ArrayList<EncodingRange> getCompleteDataEncodings();

    public abstract byte[] getCompleteDataRaw();

    public abstract String getCompleteDataUtf8String();

    public abstract int getScannedSegmentCount();

    public abstract int getTotalSegmentCount();

    public abstract boolean isComplete();
}
