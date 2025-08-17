package com.scandit.datacapture.barcode.count.internal.module.capture;

import com.scandit.datacapture.barcode.count.capture.Coordinate2d;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.scandit.djinni.ResultOrError;
import com.snapchat.djinni.NativeObjectManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeSpatialGrid {

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeSpatialGrid {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f120720a = new AtomicBoolean(false);
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private native ArrayList<NativeBarcodeSpatialGridElement> native_column(long j10, int i10);

        private native int native_columns(long j10);

        private native ArrayList<Coordinate2d> native_coordinatesForElement(long j10, NativeBarcodeSpatialGridElement nativeBarcodeSpatialGridElement);

        private native NativeBarcodeSpatialGridElement native_elementAt(long j10, int i10, int i11);

        private native ArrayList<NativeBarcodeSpatialGridElement> native_row(long j10, int i10);

        private native int native_rows(long j10);

        private native ResultOrError<Boolean, String> native_swapElementsAtCoordinates(long j10, int i10, int i11, int i12, int i13);

        private native ResultOrError<Boolean, String> native_swapSubsAtCoordinates(long j10, int i10, int i11, int i12, int i13);

        private native String native_toJson(long j10);

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ArrayList<NativeBarcodeSpatialGridElement> column(int i10) {
            return native_column(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public int columns() {
            return native_columns(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ArrayList<Coordinate2d> coordinatesForElement(NativeBarcodeSpatialGridElement nativeBarcodeSpatialGridElement) {
            return native_coordinatesForElement(this.nativeRef, nativeBarcodeSpatialGridElement);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public NativeBarcodeSpatialGridElement elementAt(int i10, int i11) {
            return native_elementAt(this.nativeRef, i10, i11);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ArrayList<NativeBarcodeSpatialGridElement> row(int i10) {
            return native_row(this.nativeRef, i10);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public int rows() {
            return native_rows(this.nativeRef);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ResultOrError<Boolean, String> swapElementsAtCoordinates(int i10, int i11, int i12, int i13) {
            return native_swapElementsAtCoordinates(this.nativeRef, i10, i11, i12, i13);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
        public ResultOrError<Boolean, String> swapSubsAtCoordinates(int i10, int i11, int i12, int i13) {
            return native_swapSubsAtCoordinates(this.nativeRef, i10, i11, i12, i13);
        }

        @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeSpatialGrid
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

    public abstract ArrayList<NativeBarcodeSpatialGridElement> column(int i10);

    public abstract int columns();

    public abstract ArrayList<Coordinate2d> coordinatesForElement(NativeBarcodeSpatialGridElement nativeBarcodeSpatialGridElement);

    public abstract NativeBarcodeSpatialGridElement elementAt(int i10, int i11);

    public abstract ArrayList<NativeBarcodeSpatialGridElement> row(int i10);

    public abstract int rows();

    public abstract ResultOrError<Boolean, String> swapElementsAtCoordinates(int i10, int i11, int i12, int i13);

    public abstract ResultOrError<Boolean, String> swapSubsAtCoordinates(int i10, int i11, int i12, int i13);

    public abstract String toJson();
}
