package com.scandit.datacapture.barcode.batch.internal.module.data;

import com.scandit.datacapture.barcode.internal.sdk.data.NativeBarcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeTrackedBarcode {

    @DjinniGenerated
    public static final class CppProxy extends NativeTrackedBarcode {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f120480a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native Point native_getAnchorPosition(long j10, Anchor anchor);

        private native Point native_getAnchorPositionIgnoringLicense(long j10, Anchor anchor);

        private native NativeBarcode native_getBarcode(long j10);

        private native Integer native_getClusterIdentifier(long j10);

        private native int native_getIdentifier(long j10);

        private native Quadrilateral native_getLocation(long j10);

        private native Quadrilateral native_getLocationIgnoringLicense(long j10);

        private native float native_getPixelsPerElement(long j10);

        private native boolean native_hasCluster(long j10);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public Point getAnchorPosition(Anchor anchor) {
            return native_getAnchorPosition(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public Point getAnchorPositionIgnoringLicense(Anchor anchor) {
            return native_getAnchorPositionIgnoringLicense(this.nativeRef, anchor);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public NativeBarcode getBarcode() {
            return native_getBarcode(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public Integer getClusterIdentifier() {
            return native_getClusterIdentifier(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public int getIdentifier() {
            return native_getIdentifier(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public Quadrilateral getLocation() {
            return native_getLocation(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public Quadrilateral getLocationIgnoringLicense() {
            return native_getLocationIgnoringLicense(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public float getPixelsPerElement() {
            return native_getPixelsPerElement(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
        public boolean hasCluster() {
            return native_hasCluster(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode
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

    public abstract Point getAnchorPosition(Anchor anchor);

    public abstract Point getAnchorPositionIgnoringLicense(Anchor anchor);

    public abstract NativeBarcode getBarcode();

    public abstract Integer getClusterIdentifier();

    public abstract int getIdentifier();

    public abstract Quadrilateral getLocation();

    public abstract Quadrilateral getLocationIgnoringLicense();

    public abstract float getPixelsPerElement();

    public abstract boolean hasCluster();

    public abstract String toJson();
}
