package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusItem;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem;", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItemProxy;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusItem;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusItem;)V", "_impl", "()Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountStatusItem;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "b", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "getBarcode", "()Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "barcode", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "c", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "getStatus", "()Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "status", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountStatusItem implements BarcodeCountStatusItemProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeCountStatusItemProxyAdapter f120869a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TrackedBarcode barcode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final BarcodeCountStatus status;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem$Companion;", "", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "barcode", "Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;", "status", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem;", "create", "(Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;Lcom/scandit/datacapture/barcode/count/ui/view/BarcodeCountStatus;)Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final BarcodeCountStatusItem create(TrackedBarcode barcode, BarcodeCountStatus status) {
            Intrinsics.j(barcode, "barcode");
            Intrinsics.j(status, "status");
            NativeBarcodeCountStatusItem nativeBarcodeCountStatusItemCreate = NativeBarcodeCountStatusItem.create(barcode.getF120470a(), status);
            Intrinsics.i(nativeBarcodeCountStatusItemCreate, "create(...)");
            return new BarcodeCountStatusItem(nativeBarcodeCountStatusItemCreate);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final BarcodeCountStatusItem create(TrackedBarcode trackedBarcode, BarcodeCountStatus barcodeCountStatus) {
        return INSTANCE.create(trackedBarcode, barcodeCountStatus);
    }

    @Override // com.scandit.datacapture.barcode.count.ui.view.status.BarcodeCountStatusItemProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeBarcodeCountStatusItem getF120872a() {
        return this.f120869a.getF120872a();
    }

    public BarcodeCountStatusItem(NativeBarcodeCountStatusItem impl) {
        Intrinsics.j(impl, "impl");
        this.f120869a = new BarcodeCountStatusItemProxyAdapter(impl, null, 2, null);
        NativeTrackedBarcode trackedBarcode = getF120872a().getTrackedBarcode();
        Intrinsics.i(trackedBarcode, "getTrackedBarcode(...)");
        this.barcode = new TrackedBarcode(trackedBarcode);
        BarcodeCountStatus status = getF120872a().getStatus();
        Intrinsics.i(status, "getStatus(...)");
        this.status = status;
    }

    public final TrackedBarcode getBarcode() {
        return this.barcode;
    }

    public final BarcodeCountStatus getStatus() {
        return this.status;
    }
}
