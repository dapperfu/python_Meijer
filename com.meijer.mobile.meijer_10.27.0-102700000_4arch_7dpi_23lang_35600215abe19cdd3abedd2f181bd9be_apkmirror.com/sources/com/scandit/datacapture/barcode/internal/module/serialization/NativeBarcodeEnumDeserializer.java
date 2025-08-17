package com.scandit.datacapture.barcode.internal.module.serialization;

import com.scandit.datacapture.barcode.batch.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.data.Checksum;
import com.scandit.datacapture.barcode.data.CompositeType;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerBehavior;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionFreezeBehavior;
import com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionTapBehavior;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
import com.scandit.datacapture.barcode.ui.overlay.NativeBarcodeCaptureOverlayStyle;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;
import com.snapchat.djinni.NativeObjectManager;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;

@DjinniGenerated
/* loaded from: classes11.dex */
public abstract class NativeBarcodeEnumDeserializer {
    public static native NativeBarcodeCaptureOverlayStyle barcodeCaptureOverlayStyleFromJsonString(String str);

    public static native NativeBarcodePickState barcodePickStateFromJsonString(String str);

    public static native BarcodeSelectionAimerBehavior barcodeSelectionAimerBehaviorFromJsonString(String str);

    public static native BarcodeSelectionBasicOverlayStyle barcodeSelectionBasicOverlayStyleFromJsonString(String str);

    public static native NativeBarcodeTrackingBasicOverlayStyle barcodeTrackingBasicOverlayStyleFromJsonString(String str);

    public static native EnumSet<Checksum> checksumFromJsonString(String str);

    public static native EnumSet<CompositeType> compositeTypeFromJsonString(String str);

    public static native BarcodeSelectionFreezeBehavior freezeBehaviorFromJsonString(String str);

    public static native BarcodeSelectionTapBehavior tapBehaviorFromJsonString(String str);

    @DjinniGenerated
    public static final class CppProxy extends NativeBarcodeEnumDeserializer {
        private final long nativeRef;

        public static native void nativeDestroy(long j10);

        private CppProxy(long j10) {
            new AtomicBoolean(false);
            if (j10 != 0) {
                this.nativeRef = j10;
                NativeObjectManager.register(this, j10);
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }
    }
}
