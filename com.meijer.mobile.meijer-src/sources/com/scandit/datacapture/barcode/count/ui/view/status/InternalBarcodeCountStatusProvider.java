package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProvider;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProviderCallback;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/InternalBarcodeCountStatusProvider;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProvider;", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;", "owner", "<init>", "(Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountView;)V", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;", "Lkotlin/collections/ArrayList;", "trackedBarcodes", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;", "callback", "", "onStatusRequested", "(Ljava/util/ArrayList;Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusProviderCallback;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public class InternalBarcodeCountStatusProvider extends NativeBarcodeCountStatusProvider {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f121832a;

    public InternalBarcodeCountStatusProvider(BarcodeCountView owner) {
        Intrinsics.j(owner, "owner");
        this.f121832a = new WeakReference(owner);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusProvider
    public void onStatusRequested(ArrayList<NativeTrackedBarcode> trackedBarcodes, NativeBarcodeCountStatusProviderCallback callback) {
        BarcodeCountStatusProvider statusProvider$scandit_barcode_capture;
        Intrinsics.j(trackedBarcodes, "trackedBarcodes");
        Intrinsics.j(callback, "callback");
        BarcodeCountView barcodeCountView = (BarcodeCountView) this.f121832a.get();
        if (barcodeCountView == null || (statusProvider$scandit_barcode_capture = barcodeCountView.getStatusProvider()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.x(trackedBarcodes, 10));
        Iterator<T> it = trackedBarcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(new TrackedBarcode((NativeTrackedBarcode) it.next()));
        }
        statusProvider$scandit_barcode_capture.onStatusRequested(arrayList, new BarcodeCountStatusProviderCallback(callback));
    }
}
