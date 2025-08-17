package com.scandit.datacapture.barcode.internal.module.count.ui;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountNotInListStatus;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.M;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.N;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCountBasicOverlay f121582a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BarcodeCountBasicOverlay barcodeCountBasicOverlay) {
        super(4);
        this.f121582a = barcodeCountBasicOverlay;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        TrackedBarcode barcode = (TrackedBarcode) obj;
        N scanStatus = (N) obj2;
        M listStatus = (M) obj3;
        NativeBarcodeCountNotInListStatus notInListStatus = (NativeBarcodeCountNotInListStatus) obj4;
        Intrinsics.j(barcode, "barcode");
        Intrinsics.j(scanStatus, "scanStatus");
        Intrinsics.j(listStatus, "listStatus");
        Intrinsics.j(notInListStatus, "notInListStatus");
        int iOrdinal = scanStatus.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = listStatus.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                this.f121582a.didTapScannedBarcode(barcode);
            } else if (iOrdinal2 == 2) {
                int i10 = d.f121581a[notInListStatus.ordinal()];
                if (i10 == 1) {
                    this.f121582a.didTapAcceptedBarcode(barcode);
                } else if (i10 != 2) {
                    this.f121582a.didTapNotInListBarcode(barcode);
                } else {
                    this.f121582a.didTapRejectedBarcode(barcode);
                }
            }
        } else if (iOrdinal == 1) {
            this.f121582a.didTapUnscannedBarcode(barcode);
        } else if (iOrdinal == 2) {
            this.f121582a.didTapFilteredBarcode(barcode);
        }
        return Unit.f142422a;
    }
}
