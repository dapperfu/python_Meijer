package com.scandit.datacapture.barcode.pick.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewListener;", "", "onFreezed", "", "view", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickView;", "onPaused", "onStarted", "onStopped", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface BarcodePickViewListener {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onFreezed(BarcodePickViewListener barcodePickViewListener, BarcodePickView view) {
            Intrinsics.j(view, "view");
        }

        public static void onPaused(BarcodePickViewListener barcodePickViewListener, BarcodePickView view) {
            Intrinsics.j(view, "view");
        }

        public static void onStarted(BarcodePickViewListener barcodePickViewListener, BarcodePickView view) {
            Intrinsics.j(view, "view");
        }

        public static void onStopped(BarcodePickViewListener barcodePickViewListener, BarcodePickView view) {
            Intrinsics.j(view, "view");
        }
    }

    void onFreezed(BarcodePickView view);

    void onPaused(BarcodePickView view);

    void onStarted(BarcodePickView view);

    void onStopped(BarcodePickView view);
}
