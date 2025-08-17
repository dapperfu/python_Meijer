package com.scandit.datacapture.barcode.batch.data;

import com.scandit.datacapture.barcode.batch.internal.module.data.NativeTrackedBarcode;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010!\u001a\u00020\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", "Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcodeProxy;", "Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;)V", "_impl", "()Lcom/scandit/datacapture/barcode/batch/internal/module/data/NativeTrackedBarcode;", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getAnchorPosition", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)Lcom/scandit/datacapture/core/common/geometry/Point;", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/data/Barcode;", "b", "Lkotlin/Lazy;", "getBarcode", "()Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "", "getIdentifier", "()I", "identifier", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getLocation", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "location", "getLocationIgnoringLicense$scandit_barcode_capture", "locationIgnoringLicense", "getGlobalId$scandit_barcode_capture", "globalId", "", "get_pixelsPerElement", "()F", "_pixelsPerElement", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class TrackedBarcode implements TrackedBarcodeProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TrackedBarcodeProxyAdapter f120468a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy barcode;

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedBarcodeProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeTrackedBarcode getF120470a() {
        return this.f120468a.getF120470a();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedBarcodeProxy
    @ProxyFunction
    public Point getAnchorPosition(Anchor anchor) {
        Intrinsics.j(anchor, "anchor");
        return this.f120468a.getAnchorPosition(anchor);
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedBarcodeProxy
    @ProxyFunction(property = "identifier")
    public int getIdentifier() {
        return this.f120468a.getIdentifier();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedBarcodeProxy
    @ProxyFunction(property = "location")
    public Quadrilateral getLocation() {
        return this.f120468a.getLocation();
    }

    @Override // com.scandit.datacapture.barcode.batch.data.TrackedBarcodeProxy
    @ProxyFunction
    public String toJson() {
        return this.f120468a.toJson();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrackedBarcode(NativeTrackedBarcode impl) {
        Intrinsics.j(impl, "impl");
        this.f120468a = new TrackedBarcodeProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.barcode = LazyKt.b(new a(impl));
    }

    public final Barcode getBarcode() {
        return (Barcode) this.barcode.getValue();
    }

    public final int getGlobalId$scandit_barcode_capture() {
        return getBarcode().getGlobalId$scandit_barcode_capture();
    }

    public final Quadrilateral getLocationIgnoringLicense$scandit_barcode_capture() {
        Quadrilateral locationIgnoringLicense = getF120470a().getLocationIgnoringLicense();
        Intrinsics.i(locationIgnoringLicense, "getLocationIgnoringLicense(...)");
        return locationIgnoringLicense;
    }

    public final float get_pixelsPerElement() {
        return getF120470a().getPixelsPerElement();
    }
}
