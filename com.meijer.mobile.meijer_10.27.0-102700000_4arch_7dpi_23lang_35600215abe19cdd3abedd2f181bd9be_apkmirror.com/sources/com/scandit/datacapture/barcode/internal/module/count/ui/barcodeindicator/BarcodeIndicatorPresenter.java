package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import android.widget.FrameLayout;
import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.capture.list.BarcodeCountCaptureListSession;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.internal.module.count.ui.BarcodeCountViewSettings;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public interface BarcodeIndicatorPresenter {
    void a();

    void a(int i10);

    void a(long j10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4);

    void a(FrameLayout frameLayout);

    void a(TrackedBarcode trackedBarcode);

    void a(TrackedBarcode trackedBarcode, NativeBarcodeCountNotInListStatus nativeBarcodeCountNotInListStatus);

    void a(BarcodeCountCaptureListSession barcodeCountCaptureListSession);

    void a(NativeBarcodeCountBasicOverlayColorScheme nativeBarcodeCountBasicOverlayColorScheme);

    void a(BarcodeCountViewSettings barcodeCountViewSettings);

    void a(List list);

    void a(boolean z10);

    void a(boolean z10, boolean z11);

    void b(TrackedBarcode trackedBarcode);

    void b(boolean z10);

    void b(boolean z10, boolean z11);

    boolean b();

    void reset();
}
