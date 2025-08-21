package com.scandit.datacapture.barcode.internal.module.find.ui.listener;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSession;
import com.scandit.datacapture.barcode.internal.module.find.ui.BarcodeFindViewPresenter;
import com.scandit.datacapture.core.data.FrameData;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.DataCaptureViewSizeListener;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements InternalBarcodeFindListener, DataCaptureViewSizeListener {

    /* renamed from: a, reason: collision with root package name */
    public final BarcodeFind f123187a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f123188b;

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(BarcodeFind mode) {
        Intrinsics.j(mode, "mode");
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void c(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
    }

    public c(BarcodeFind mode, BarcodeFindViewPresenter presenter) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(presenter, "presenter");
        this.f123187a = mode;
        this.f123188b = new WeakReference(presenter);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(BarcodeFind mode, NativeBarcodeFindSession session, FrameData data) {
        Intrinsics.j(mode, "mode");
        Intrinsics.j(session, "session");
        Intrinsics.j(data, "data");
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.f123188b.get();
        if (barcodeFindViewPresenter != null) {
            Collection<NativeTrackedBarcode> collectionValues = session.getFoundTrackedBarcodes().values();
            Intrinsics.i(collectionValues, "<get-values>(...)");
            Collection<NativeTrackedBarcode> collectionValues2 = session.getTrackedBarcodes().values();
            Intrinsics.i(collectionValues2, "<get-values>(...)");
            barcodeFindViewPresenter.a(collectionValues, collectionValues2, new a(mode, session));
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void b(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.f123188b.get();
        if (barcodeFindViewPresenter != null) {
            barcodeFindViewPresenter.a(barcodes);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void onSearchStarted() {
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.f123188b.get();
        if (barcodeFindViewPresenter != null) {
            barcodeFindViewPresenter.onSearchStarted();
        }
    }

    @Override // com.scandit.datacapture.core.ui.DataCaptureViewSizeListener
    public final void onSizeChanged(DataCaptureView view, int i10, int i11, int i12) {
        BarcodeFindViewPresenter barcodeFindViewPresenter;
        Intrinsics.j(view, "view");
        NativeBarcodeFindSession session = this.f123187a.getF121904a().getSession();
        if (session == null || (barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.f123188b.get()) == null) {
            return;
        }
        Collection<NativeTrackedBarcode> collectionValues = session.getFoundTrackedBarcodes().values();
        Intrinsics.i(collectionValues, "<get-values>(...)");
        Collection<NativeTrackedBarcode> collectionValues2 = session.getTrackedBarcodes().values();
        Intrinsics.i(collectionValues2, "<get-values>(...)");
        barcodeFindViewPresenter.a(collectionValues, collectionValues2, new b(this, session));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.capture.InternalBarcodeFindListener
    public final void a(HashSet barcodes) {
        Intrinsics.j(barcodes, "barcodes");
        BarcodeFindViewPresenter barcodeFindViewPresenter = (BarcodeFindViewPresenter) this.f123188b.get();
        if (barcodeFindViewPresenter != null) {
            barcodeFindViewPresenter.c();
        }
    }
}
