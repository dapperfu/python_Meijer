package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.BarcodePickInternal;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickPublicListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyReversedAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ProxyReversedAdapter(owner = BarcodePickInternal.class, value = NativeBarcodePickPublicListener.class)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0017¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickListener;", "", "onObservationStarted", "", "barcodePick", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "onObservationStopped", "onSessionUpdated", "session", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSession;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodePickListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @ProxyFunction
        public static void onObservationStarted(BarcodePickListener barcodePickListener, BarcodePick barcodePick) {
            Intrinsics.j(barcodePick, "barcodePick");
        }

        @ProxyFunction
        public static void onObservationStopped(BarcodePickListener barcodePickListener, BarcodePick barcodePick) {
            Intrinsics.j(barcodePick, "barcodePick");
        }

        @ProxyFunction
        public static void onSessionUpdated(BarcodePickListener barcodePickListener, BarcodePick barcodePick, BarcodePickSession session) {
            Intrinsics.j(barcodePick, "barcodePick");
            Intrinsics.j(session, "session");
        }
    }

    @ProxyFunction
    void onObservationStarted(BarcodePick barcodePick);

    @ProxyFunction
    void onObservationStopped(BarcodePick barcodePick);

    @ProxyFunction
    void onSessionUpdated(BarcodePick barcodePick, BarcodePickSession session);
}
